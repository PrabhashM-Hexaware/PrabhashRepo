package com.vodafone.azuremigration.migration.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vodafone.azuremigration.migration.model.AssessedMachine;
import com.vodafone.azuremigration.migration.model.AssessedMachsListByAssessment;
import com.vodafone.azuremigration.migration.model.Assessment;
import com.vodafone.azuremigration.migration.model.Project;
import com.vodafone.azuremigration.migration.model.assessment.group.response.AssessmentGroupResponse;
import com.vodafone.azuremigration.migration.model.group.ResourceGroup;
import com.vodafone.azuremigration.migration.model.response.body.AssessmentCreateResponse;
import com.vodafone.azuremigration.migration.util.CommonUtil;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;
import okhttp3.ResponseBody;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AzureService {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
    @Autowired
    CommonUtil commonUtil;  
    
public ResponseEntity<?> getCreateMigrateProject(String projectName, String location)throws Exception  {
		
	 LOGGER.info("In AzureService.getCreateMigrateProject method START >>>");
		
		ObjectMapper objectMapper = new ObjectMapper();
		Project createProject = null;
	
		Response projectNameExists = commonUtil.getProjectExists(projectName) ;
		Optional<ResponseBody> response = commonUtil.getCreateMigrateProjectURL(projectName, location);
		createProject = objectMapper.readValue(response.get().string(), Project.class);	
		
		LOGGER.info("In AzureService.getCreateMigrateProject method END >>>");
		
		if (projectNameExists.code() == 200) {
			return ResponseEntity.status(HttpStatus.OK).body(createProject);
		} else {
			return ResponseEntity.status(HttpStatus.CREATED).body(createProject);
		}
	}


public ResponseEntity<?> createAssessmentGroup(String assessmentGroup) throws Exception{
	
	ObjectMapper objectMapper = new ObjectMapper();
	AssessmentGroupResponse createAssessmentGroup = null;
	
	Response groupNameExists = commonUtil.getAssessmentGroupExists(assessmentGroup);
	Optional<ResponseBody> response = commonUtil.getCreateAssessmentGroupURL(assessmentGroup);
	createAssessmentGroup = objectMapper.readValue(response.get().string(), AssessmentGroupResponse.class);
	//log.info("ASSESSMENT GROUP EXISTE OR NOT::::"+groupNameExists.code());
	if (groupNameExists.code() == 200) {
		return ResponseEntity.status(HttpStatus.OK).body(createAssessmentGroup);
	} else {
		return ResponseEntity.status(HttpStatus.CREATED).body(createAssessmentGroup);
	}
	
}

public ResponseEntity<?> createOrUpdateGroup(String groupName, String location) throws Exception {
	
	log.info("In AzureService.createOrUpdateGroup method START >>>");
			
			ObjectMapper objectMapper = new ObjectMapper();
			ResourceGroup creategroup = null;
		
			Response groupNameExists = commonUtil.getGroupExists(groupName) ;
			Optional<ResponseBody> response = commonUtil.createOrUpdateResourceGroup(groupName, location);
			creategroup = objectMapper.readValue(response.get().string(), ResourceGroup.class);	
			
			log.info("In AzureService.createOrUpdateGroup method END >>>");
			log.info("GroupCreate Code:::"+groupNameExists.code()) ;
			if (groupNameExists.code() == 404) {
				return ResponseEntity.status(HttpStatus.CREATED).body(creategroup);
			} else {
				return ResponseEntity.status(HttpStatus.OK).body(creategroup);
				
			}	
		}

public ResponseEntity<?> addAssessmentToGroup(String assessmentName , String groupName) throws Exception {
	
	ObjectMapper objectMapper = new ObjectMapper();
	AssessmentCreateResponse addAssessment = null;
	
	Response assessmentNameExists = commonUtil.getAssessmentExists(assessmentName , groupName) ;
	Optional<ResponseBody> response = commonUtil.addAssessmentToGroupURL(assessmentName,groupName);
	addAssessment = objectMapper.readValue(response.get().string(), AssessmentCreateResponse.class);
	
	log.info("ASSESSMENT EXISTS RESPONSE:::"+assessmentNameExists.code());
	if (assessmentNameExists.code() == 200) {
		return ResponseEntity.status(HttpStatus.OK).body(addAssessment);
	} else {
		return ResponseEntity.status(HttpStatus.CREATED).body(addAssessment);
	}	
}


    
	public Assessment callAzureMigrateListByAssessmentsAPI(String currency) throws Exception {
		
		LOGGER.info("In AzureService.callAzureMigrateListByAssessmentsAPI method START >>>");
		
		AssessedMachsListByAssessment assessedMachsListByAssessment = null;
		String assessmentJSON = null;
		String priceAsOn = null;
		ObjectMapper objectMapper = new ObjectMapper();
		Assessment assessment = new Assessment();
		List<AssessedMachine> assessedMachinesLists = new ArrayList<AssessedMachine>();

		Optional<ResponseBody> response = commonUtil.getAssessmentListsURL();
		assessedMachsListByAssessment = objectMapper.readValue(response.get().string(),
				AssessedMachsListByAssessment.class);

		for (int i = 0; i < assessedMachsListByAssessment.getValue().size(); i++) {
			AssessedMachine assessedMachine = new AssessedMachine();

			assessedMachine.setApplication(assessedMachsListByAssessment.getValue().get(i).getName());
			assessedMachine.setiPAddress(assessedMachsListByAssessment.getValue().get(i).getProperties()
					.getNetworkAdapters().get4000().getIpAddresses());
			assessedMachine
					.setSkuModal(assessedMachsListByAssessment.getValue().get(i).getProperties().getRecommendedSize());
			assessedMachinesLists.add(assessedMachine);
		}

		LocalDate localDate = LocalDate.now();
		priceAsOn = DateTimeFormatter.ofPattern(commonUtil.dateFormat).format(localDate).toString();

		assessment.setCurrency(currency);
		assessment.setPriceAsOn(priceAsOn);
		assessment.setAssessedMachines(assessedMachinesLists);
		
		LOGGER.info("In AzureService.callAzureMigrateListByAssessmentsAPI method END >>>" + assessmentJSON);	
		return assessment;
	}
}