/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.api;

import com.bytedance.ads.ApiCallback;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.ApiResponse;
import com.bytedance.ads.Configuration;
import com.bytedance.ads.Pair;

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.ProjectCostProtectStatusGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectCostProtectStatusGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectCostProtectStatusGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectCostProtectStatusGetV30Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for openApiV30ProjectCostProtectStatusGetGet
     * @param advertiserId 巨量广告平台广告主id (required)
     * @param projectIds 项目id列表，每次最多传入50个 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ProjectCostProtectStatusGetGetCall(Long advertiserId, List<Long> projectIds, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/open_api/v3.0/project/cost_protect_status/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (projectIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "project_ids", projectIds));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApiV30ProjectCostProtectStatusGetGetValidateBeforeCall(Long advertiserId, List<Long> projectIds, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ProjectCostProtectStatusGetGet(Async)");
        }

        // verify the required parameter 'projectIds' is set
        if (projectIds == null) {
            throw new ApiException("Missing the required parameter 'projectIds' when calling openApiV30ProjectCostProtectStatusGetGet(Async)");
        }

        return openApiV30ProjectCostProtectStatusGetGetCall(advertiserId, projectIds, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 巨量广告平台广告主id (required)
     * @param projectIds 项目id列表，每次最多传入50个 (required)
     * @return ProjectCostProtectStatusGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProjectCostProtectStatusGetV30Response openApiV30ProjectCostProtectStatusGetGet(Long advertiserId, List<Long> projectIds) throws ApiException {
        ApiResponse<ProjectCostProtectStatusGetV30Response> localVarResp = openApiV30ProjectCostProtectStatusGetGetWithHttpInfo(advertiserId, projectIds);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 巨量广告平台广告主id (required)
     * @param projectIds 项目id列表，每次最多传入50个 (required)
     * @return ApiResponse&lt;ProjectCostProtectStatusGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProjectCostProtectStatusGetV30Response> openApiV30ProjectCostProtectStatusGetGetWithHttpInfo(Long advertiserId, List<Long> projectIds) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ProjectCostProtectStatusGetGetValidateBeforeCall(advertiserId, projectIds, null);
        Type localVarReturnType = new TypeToken<ProjectCostProtectStatusGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 巨量广告平台广告主id (required)
     * @param projectIds 项目id列表，每次最多传入50个 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ProjectCostProtectStatusGetGetAsync(Long advertiserId, List<Long> projectIds, final ApiCallback<ProjectCostProtectStatusGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ProjectCostProtectStatusGetGetValidateBeforeCall(advertiserId, projectIds, _callback);
        Type localVarReturnType = new TypeToken<ProjectCostProtectStatusGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
