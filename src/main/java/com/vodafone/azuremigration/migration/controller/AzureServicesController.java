package com.vodafone.azuremigration.migration.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.vodafone.azuremigration.migration.exception.ErrorDetails;
import com.vodafone.azuremigration.migration.model.Assessment;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vodafone.azuremigration.migration.exception.AzureServiceErrorResponse;
import com.vodafone.azuremigration.migration.exception.AzureServiceException;
import com.vodafone.azuremigration.migration.services.AzureService;


@RestController
@RequestMapping("/vodafone/api/v1")
@Slf4j
public class AzureServicesController {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private AzureService azureService;
	    
	@PostMapping("/azure/createProject")
	public ResponseEntity<?> createProject(@RequestParam(required = false) String clientName ,
			@RequestParam(required = false) String ticketNo,
			@RequestParam(required = false) String location) throws Exception {
		
			String projectName = clientName != null && clientName.length() > 6 ? clientName.substring(0, 6) + "-" + ticketNo : clientName+ "-" + ticketNo;;
		
		
		log.info("PROJECT NAME::::"+projectName);
		LOGGER.info("In AzureServicesController.createProject method  START>>>");
		
		ResponseEntity<?> createProject = azureService.getCreateMigrateProject(projectName,location);
		
		LOGGER.info("In AzureServicesController.createProject method END >>>");
		return createProject;
		
		
	}
	
	@PostMapping("/azure/createAssessmentGroup")
	public ResponseEntity<?> createAssessmentProject(@RequestParam(required = false) String assessmentGroup ) throws Exception {
		
		log.info("PROJECT NAME::::"+assessmentGroup);
		LOGGER.info("In AzureServicesController.createAssessmentProject method  START>>>");
		
		ResponseEntity<?> createAssessmentGroup = azureService.createAssessmentGroup(assessmentGroup);
		
		LOGGER.info("In AzureServicesController.createAssessmentProject method END >>>");
		return createAssessmentGroup;
		
		
	}
	
	@PostMapping("/azure/addAssessmentToGroup")
	public ResponseEntity<?> addAssessmentToGroup(@RequestParam(required = false) String assessmentName,
			@RequestParam(required = false) String groupName) throws Exception {
		log.info("ASSESSMENT NAME::::"+assessmentName);
		LOGGER.info("In AzureServicesController.addAssessmentToGroup method  START>>>");
		
		ResponseEntity<?> createAssessmentGroup = azureService.addAssessmentToGroup(assessmentName,groupName);
		
		LOGGER.info("In AzureServicesController.addAssessmentToGroup method END >>>");
		
		return createAssessmentGroup;
	}
	
	@PostMapping("/azure/createUpdateGroup")
	public ResponseEntity<?> createUpdateGroup(@RequestParam(required = false) String groupName,
			@RequestParam(required = false) String location) throws Exception {
		LOGGER.info("In AzureServicesController.createUpdateGroup method  START>>>");
		
		ResponseEntity<?> createGroup = azureService.createOrUpdateGroup(groupName, location);
		
		LOGGER.info("In AzureServicesController.createUpdateGroup method END >>>");
		return createGroup;	
	}
	
	@GetMapping("/azure/listbyassessment")
	public ResponseEntity<Assessment> getAssessmentDetailsOfAssessedMachines(@RequestParam(required = false) String currency) throws Exception {
		LOGGER.info("In AzureServicesController.getAssessmentDetailsOfAssessedMachines method  START>>>");	
		
		Assessment assessment = azureService.callAzureMigrateListByAssessmentsAPI(currency);
		
		LOGGER.info("In AzureServicesController.getAssessmentDetailsOfAssessedMachines method END >>>");
		return new ResponseEntity<>(assessment,HttpStatus.OK);
    }

	
	@GetMapping("/azure/getAssessment")
	Assessment getAssessment() {

		String assessmentJson = "{\"currency\":\"USD\",\"priceAsOn\":\"13-05-2020\",\"AssessedMachines\":[{\"application\":\"bfd61239-d024-48de-81f0-0b685a6ba7db\",\"IPAddress\":[\"172.25.157.6\"],\"skuModal\":\"Standard_D4_v3\"},{\"application\":\"3b98bfeb-8a53-4e68-9569-c1d4b7bd02b7\",\"IPAddress\":[\"172.25.180.142\"],\"skuModal\":\"Standard_D8_v3\"}],\"AssessedMachinesCosts\":[{\"skuModal\":\"Standard_D4_v3\",\"GBP3PerMonth\":23.11,\"GBP1PerMonth\":34.49,\"payGDP\":43.11,\"hybridGDP3PerMonth\":13.11,\"hybridGDP1PerMonth\":24.49,\"hybridpayGDP\":20.59},{\"skuModal\":\"Standard_D8_v3\",\"GDP3PerMonth\":43.11,\"GDP1PerMonth\":34.49,\"payGDP\":27.59,\"hybridGDP3PerMonth\":13.11,\"hybridGDP1PerMonth\":24.49,\"hybridpayGDP\":20.59}],\"AdditionalMachinesScopes\":{\"miscellaneous\":\"Azure Firewall (1 TB)\",\"GDP3PerMonth\":23.11,\"GDP1PerMonth\":34.49,\"payGDP\":43.11}}";
		ObjectMapper objectMapper = new ObjectMapper();
		Assessment assessment = null;
		try {
			assessment = objectMapper.readValue(assessmentJson, Assessment.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return assessment;
	}
	
	@ExceptionHandler(AzureServiceException.class)
	public ResponseEntity<AzureServiceErrorResponse> exceptionHandler(
			Exception ex) {
		AzureServiceErrorResponse error = new AzureServiceErrorResponse();
		error.setErrorCode(HttpStatus.NO_CONTENT.value());
		error.setMessageLink(ex.getMessage());
		return new ResponseEntity<>(error, HttpStatus.OK);
	}

	/**
	 * It will handle IllegalArgumentException for this controller.
	 *
	 * @param ex
	 * @param rq
	 * @return
	 */
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ErrorDetails> exception(IllegalArgumentException ex, WebRequest rq) {
		LOGGER.error("Exception : {}", ex.getMessage());
		ErrorDetails error = new ErrorDetails(HttpStatus.BAD_REQUEST, ex.getMessage());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	 /**
	  * @param ex
	  * @param request
	  * @return
	  */
	  @ExceptionHandler(Exception.class)
	  public final ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request) {
	    ErrorDetails errorDetails = new ErrorDetails(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
	    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	
}
