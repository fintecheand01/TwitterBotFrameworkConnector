package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ActivitySet;
import io.swagger.client.model.ResourceResponse;
import io.swagger.client.model.Activity;
import io.swagger.client.model.Conversation;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class ConversationsApi {
  private ApiClient apiClient;

  public ConversationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConversationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get activities in this conversation. This method is paged with the &#39;watermark&#39; parameter.
   * 
   * @param conversationId Conversation ID (required)
   * @param watermark (Optional) only returns activities newer than this watermark (optional)
   * @return ActivitySet
   * @throws ApiException if fails to make API call
   */
  public ActivitySet conversationsGetActivities(String conversationId, String watermark) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsGetActivities");
    }
    
    // create path and map variables
    String localVarPath = "/v3/directline/conversations/{conversationId}/activities".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "watermark", watermark));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "text/json", "text/html", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ActivitySet> localVarReturnType = new GenericType<ActivitySet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Send an activity
   * 
   * @param conversationId Conversation ID (required)
   * @param activity Activity to send (required)
   * @return ResourceResponse
   * @throws ApiException if fails to make API call
   */
  public ResourceResponse conversationsPostActivity(String conversationId, Activity activity) throws ApiException {
    Object localVarPostBody = activity;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsPostActivity");
    }
    
    // verify the required parameter 'activity' is set
    if (activity == null) {
      throw new ApiException(400, "Missing the required parameter 'activity' when calling conversationsPostActivity");
    }
    
    // create path and map variables
    String localVarPath = "/v3/directline/conversations/{conversationId}/activities".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "text/json", "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "text/json", "text/html", "application/xml", "text/xml", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceResponse> localVarReturnType = new GenericType<ResourceResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get information about an existing conversation
   * 
   * @param conversationId  (required)
   * @param watermark  (optional)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public Conversation conversationsReconnectToConversation(String conversationId, String watermark) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsReconnectToConversation");
    }
    
    // create path and map variables
    String localVarPath = "/v3/directline/conversations/{conversationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "watermark", watermark));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "text/json", "text/html", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Conversation> localVarReturnType = new GenericType<Conversation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Start a new conversation
   * 
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public Conversation conversationsStartConversation() throws ApiException {
    Object localVarPostBody = "";
    
    // create path and map variables
    String localVarPath = "/v3/directline/conversations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "text/json", "text/html", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Conversation> localVarReturnType = new GenericType<Conversation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Upload file(s) and send as attachment(s)
   * 
   * @param conversationId  (required)
   * @param file  (required)
   * @param userId  (optional)
   * @return ResourceResponse
   * @throws ApiException if fails to make API call
   */
  public ResourceResponse conversationsUpload(String conversationId, File file, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsUpload");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling conversationsUpload");
    }
    
    // create path and map variables
    String localVarPath = "/v3/directline/conversations/{conversationId}/upload".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
    

    

    if (file != null)
      localVarFormParams.put("file", file);
    

    final String[] localVarAccepts = {
      "application/json", "text/json", "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceResponse> localVarReturnType = new GenericType<ResourceResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
