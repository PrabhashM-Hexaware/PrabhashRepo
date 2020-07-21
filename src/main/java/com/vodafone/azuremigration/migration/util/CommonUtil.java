package com.vodafone.azuremigration.migration.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.LogLevel;
import com.microsoft.rest.RestClient;
import com.vodafone.azuremigration.migration.model.project.ProjectRequestBody;
import com.vodafone.azuremigration.migration.model.project.Properties;
import com.vodafone.azuremigration.migration.model.project.Tags;
import com.vodafone.azuremigration.migration.model.request.body.AssessmentRequestBody;
import com.vodafone.azuremigration.migration.model.request.body.VmUptime;

import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

@Component
@Slf4j
public class CommonUtil {

	@Autowired
	ApplicationProperties appProp;
	@Autowired
	ProjectProperties projectProp;
	@Autowired
	AddAssessmenrProperties assProp;
	
	public String dateFormat = "dd/MM/yyy";

	public Response getProjectExists(String projectName) {
		final String projecURL = "https://management.azure.com/subscriptions/"+appProp.getSubscriptionId()+"/resourceGroups/"+appProp.getResourceGroupName()+"/providers/Microsoft.Migrate/migrateProjects/"+projectName+"?api-version=2018-09-01-preview";
		RestClient restClient = generateToken();
		OkHttpClient httpClient = restClient.httpClient().newBuilder().build();
		Request nameRequest = new Request.Builder().url(projecURL).get().build();
		Response httpResponse = null;
		try {
			httpResponse = httpClient.newCall(nameRequest).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return httpResponse;
	}
	
	public Optional<ResponseBody> getCreateMigrateProjectURL(String projectName , String location) throws Exception {
		
		final String projectCreateURL = "https://management.azure.com/subscriptions/"+appProp.getSubscriptionId()+"/resourceGroups/"+appProp.getResourceGroupName()+"/providers/Microsoft.Migrate/migrateProjects/"+projectName+"?api-version=2018-09-01-preview";
		//final String body = "{\"eTag\":\"string\",\"location\":\"southindia\",\"properties\":{\"registeredTools\":[\"ServerDiscovery\"]},\"tags\":{\"additionalProperties\":\"string\"}}";
		
		List<String> tools = new ArrayList<>();
		Tags tag = Tags.builder()
						.additionalProperties(projectProp.getProject_additionalProperties())
						.build();
		tools.add(projectProp.getProject_registeredTools());
		Properties prop = Properties.builder()
									.registeredTools(tools)
									.build();
		
		ProjectRequestBody body = ProjectRequestBody.builder()
				.eTag(projectProp.getProject_etag())
				.location(location)
				.properties(prop)
				.tags(tag)
				.build();
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr = "";
		 try {  
	            jsonStr = Obj.writeValueAsString(body);  
	            System.out.println("POJO TO JSON:::::"+jsonStr); 
	        } 
	        catch (IOException e) { 
	            e.printStackTrace(); 
	        }
		
		RestClient restClient = generateToken();
		OkHttpClient httpClient = restClient.httpClient().newBuilder().build();
		RequestBody reqBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), jsonStr);		
		Request request = new Request.Builder().url(projectCreateURL).put(reqBody).build();
			
		Optional<ResponseBody> response = Optional.empty();
		response = Optional.ofNullable(httpClient.newCall(request).execute().body());		 	
		return response;
	}
	
public Response getGroupExists(String groupName) {
		
		final String groupURL = "https://management.azure.com/subscriptions/"+appProp.getSubscriptionId()+"/resourcegroups/"+groupName+"?api-version=2019-10-01";
		RestClient restClient = generateToken();
		OkHttpClient httpClient = restClient.httpClient().newBuilder().build();
		Request nameRequest = new Request.Builder().url(groupURL).head().build();
		Response httpResponse = null;
		try {
			httpResponse = httpClient.newCall(nameRequest).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
		log.info("Group Response Code:::"+httpResponse.code()) ;
		return httpResponse;
	}

public Optional<ResponseBody> createOrUpdateResourceGroup(String groupName ,String location) throws Exception {
	
	final String creatrResourceGroupURL = "https://management.azure.com/subscriptions/"+appProp.getSubscriptionId()+"/resourcegroups/"+groupName+"?api-version=2019-10-01";
	//final String body = "{\"location\":\"southindia\"}";
	
	JSONObject gson = new JSONObject();
	gson.put("location", location);
	String body = gson.toString();
	RestClient restClient = generateToken();
	OkHttpClient httpClient = restClient.httpClient().newBuilder().build();
	RequestBody reqBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), body);		
	Request request = new Request.Builder().url(creatrResourceGroupURL).put(reqBody).build();
		
	Optional<ResponseBody> response = Optional.empty();
	response = Optional.ofNullable(httpClient.newCall(request).execute().body());		 	
	return response;
}

public Optional<ResponseBody> getCreateAssessmentGroupURL(String assessmentGroupName) throws Exception {
	
	final String createAssessmentProject = "https://management.azure.com/subscriptions/"+appProp.getSubscriptionId()+"/resourceGroups/"+appProp.getResourceGroup()+"/providers/Microsoft.Migrate/assessmentProjects/"+appProp.getAssessmentProject()+"/groups/"+assessmentGroupName+"?api-version=2019-10-01";
	final String body = "{\"eTag\":\" \",\"properties\":{}}";
	
	RestClient restClient = generateToken();
	OkHttpClient httpClient = restClient.httpClient().newBuilder().build();
	RequestBody reqBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), body);		
	Request request = new Request.Builder().url(createAssessmentProject).put(reqBody).build();
		
	Optional<ResponseBody> response = Optional.empty();
	response = Optional.ofNullable(httpClient.newCall(request).execute().body());		 	
	return response;
}

public Response getAssessmentGroupExists(String groupName) {
	
	final String groupURL = "https://management.azure.com/subscriptions/"+appProp.getSubscriptionId()+"/resourceGroups/"+appProp.getResourceGroup()+"/providers/Microsoft.Migrate/assessmentProjects/"+appProp.getAssessmentProject()+"/groups/"+groupName+"?api-version=2019-10-01";
	RestClient restClient = generateToken();
	OkHttpClient httpClient = restClient.httpClient().newBuilder().build();
	Request nameRequest = new Request.Builder().url(groupURL).get().build();
	Response httpResponse = null;
	try {
		httpResponse = httpClient.newCall(nameRequest).execute();
	} catch (IOException e) {
		e.printStackTrace();
	}
	log.info("Assessment Group Response Code:::"+httpResponse.code()) ;
	return httpResponse;
}

public Optional<ResponseBody> addAssessmentToGroupURL(String assessmentName , String groupName) throws Exception {
	
	final String createAssessmentURL="https://management.azure.com/subscriptions/"+appProp.getSubscriptionId()+"/resourceGroups/"+appProp.getResourceGroup()+"/providers/Microsoft.Migrate/assessmentProjects/"+appProp.getAssessmentProject()+"/groups/"+groupName+"/assessments/"+assessmentName+"?api-version=2019-10-01";
	String str = "{\"eTag\":\"\"1e000c2c-0000-0d00-0000-5cdaa4190000\"\",\"properties\":{\"azureLocation\":\"southindia\",\"azureOfferCode\":\"MSAZR0003P\",\"azurePricingTier\":\"Standard\",\"azureStorageRedundancy\":\"LocallyRedundant\",\"scalingFactor\":1,\"percentile\":\"Percentile95\",\"timeRange\":\"Day\",\"stage\":\"InProgress\",\"currency\":\"GBP\",\"azureHybridUseBenefit\":\"Yes\",\"discountPercentage\":0,\"sizingCriterion\":\"Asonpremises\",\"vmUptime\":{\"daysPerMonth\":31,\"hoursPerDay\":24},\"azureDiskType\":\"StandardOrPremium\",\"reservedInstance\":\"RI3Year\"}}";
	
	VmUptime vtime = VmUptime.builder()
							.daysPerMonth(assProp.getDaysPerMonth())
							.hoursPerDay(assProp.getHoursPerDay())
							.build();
	com.vodafone.azuremigration.migration.model.request.body.Properties prop = com.vodafone.azuremigration.migration.model.request.body.Properties
			.builder()
			.azureLocation(assProp.getAzureLocation())
			.azureOfferCode(assProp.getAzureOfferCode())
			.azurePricingTier(assProp.getAzurePricingTier())
			.azureStorageRedundancy(assProp.getAzureStorageRedundancy())
			.scalingFactor(assProp.getScalingFactor())
			.percentile(assProp.getPercentile())
			.timeRange(assProp.getTimeRange())
			.stage(assProp.getStage())
			.currency(assProp.getCurrency())
			.azureHybridUseBenefit(assProp.getAzureHybridUseBenefit())
			.discountPercentage(assProp.getDiscountPercentage())
			.sizingCriterion(assProp.getSizingCriterion())
			.vmUptime(vtime)
			.azureDiskType(assProp.getAzureDiskType())
			.reservedInstance(assProp.getReservedInstance())
			.build();
	
	AssessmentRequestBody requestBody = AssessmentRequestBody.builder()
											.eTag(assProp.geteTag())
											.properties(prop)
											.build();
	
	ObjectMapper Obj = new ObjectMapper();
	String jsonStr = "";
	 try {  
            jsonStr = Obj.writeValueAsString(requestBody);  
            //System.out.println("POJO TO JSON ASSESSMENT CREATE:::::"+jsonStr); 
        } 
        catch (IOException e) { 
            e.printStackTrace(); 
        }
	 
	 	RestClient restClient = generateToken();
		OkHttpClient httpClient = restClient.httpClient().newBuilder().build();
		RequestBody reqBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), jsonStr);		
		Request request = new Request.Builder().url(createAssessmentURL).put(reqBody).build();
			
		Optional<ResponseBody> response = Optional.empty();
		response = Optional.ofNullable(httpClient.newCall(request).execute().body());		 	
		return response;
	
}

public Response getAssessmentExists(String assessmentName , String groupName) {
	
	final String groupExixtsURL = "https://management.azure.com/subscriptions/"+appProp.getSubscriptionId()+"/resourceGroups/"+appProp.getResourceGroup()+"/providers/Microsoft.Migrate/assessmentProjects/"+appProp.getAssessmentProject()+"/groups/"+groupName+"/assessments/"+assessmentName+"?api-version=2019-10-01";
	
	RestClient restClient = generateToken();
	OkHttpClient httpClient = restClient.httpClient().newBuilder().build();
	Request nameRequest = new Request.Builder().url(groupExixtsURL).get().build();
	Response httpResponse = null;
	try {
		httpResponse = httpClient.newCall(nameRequest).execute();
	} catch (IOException e) {
		e.printStackTrace();
	}
	log.info("Assessment Group Response Code:::"+httpResponse.code()) ;
	return httpResponse;
	
}
	
	
	public Optional<ResponseBody> getAssessmentListsURL() throws Exception {
		
		String listbyAssessmentUrl = "https://management.azure.com/subscriptions/"
				+ appProp.getSubscriptionId() + "/resourceGroups/" + appProp.getResourceGroupName()
				+ "/providers/Microsoft.Migrate/assessmentProjects/" + appProp.getProjectName() + "/groups/"
				+ appProp.getGroupName() + "/assessments/" + appProp.getAssessmentName()
				+ "/assessedmachines?api-version=2019-10-01";
		
		RestClient restClient = generateToken();
		OkHttpClient httpClient = restClient.httpClient().newBuilder().build();
		Request request = new Request.Builder().url(listbyAssessmentUrl).get().build();

		Optional<ResponseBody> response = Optional.empty();
		response = Optional.ofNullable(httpClient.newCall(request).execute().body());
		return response;
	}
	

	public RestClient generateToken() {

		ApplicationTokenCredentials creds = new ApplicationTokenCredentials(appProp.getClient_id(),
				appProp.getTenant_id(), appProp.getClient_secret(), AzureEnvironment.AZURE);

		RestClient restClient = new RestClient.Builder()
				.withBaseUrl(AzureEnvironment.AZURE, AzureEnvironment.Endpoint.RESOURCE_MANAGER)
				.withSerializerAdapter(new AzureJacksonAdapter()).withReadTimeout(150, TimeUnit.SECONDS)
				.withLogLevel(LogLevel.BODY).withResponseBuilderFactory(new AzureResponseBuilder.Factory())
				.withCredentials(creds).build();

		return restClient;
	}
	
}
