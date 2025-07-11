/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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



import com.bytedance.ads.model.FileRebateCommonDownloadDownloadFileV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileRebateCommonDownloadDownloadFileV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FileRebateCommonDownloadDownloadFileV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public FileRebateCommonDownloadDownloadFileV2Api(ApiClient apiClient) {
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
     * Build call for openApi2FileRebateCommonDownloadDownloadFileGet
     * @param agentId 代理商帐户ID (required)
     * @param taskId 任务ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileRebateCommonDownloadDownloadFileGetCall(Long agentId, String taskId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/file/rebate/common_download/download_file/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agent_id", agentId));
        }

        if (taskId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("task_id", taskId));
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
    private okhttp3.Call openApi2FileRebateCommonDownloadDownloadFileGetValidateBeforeCall(Long agentId, String taskId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'agentId' is set
        if (agentId == null) {
            throw new ApiException("Missing the required parameter 'agentId' when calling openApi2FileRebateCommonDownloadDownloadFileGet(Async)");
        }

        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling openApi2FileRebateCommonDownloadDownloadFileGet(Async)");
        }

        return openApi2FileRebateCommonDownloadDownloadFileGetCall(agentId, taskId, _callback);

    }

    /**
     * 
     * 
     * @param agentId 代理商帐户ID (required)
     * @param taskId 任务ID (required)
     * @return FileRebateCommonDownloadDownloadFileV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public  byte[] openApi2FileRebateCommonDownloadDownloadFileGet(Long agentId, String taskId) throws ApiException {
        ApiResponse< byte[] > localVarResp = openApi2FileRebateCommonDownloadDownloadFileGetWithHttpInfo(agentId, taskId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param agentId 代理商帐户ID (required)
     * @param taskId 任务ID (required)
     * @return ApiResponse&lt;FileRebateCommonDownloadDownloadFileV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse< byte[] > openApi2FileRebateCommonDownloadDownloadFileGetWithHttpInfo(Long agentId, String taskId) throws ApiException {
        okhttp3.Call localVarCall = openApi2FileRebateCommonDownloadDownloadFileGetValidateBeforeCall(agentId, taskId, null);
                    Type localVarReturnType = new TypeToken< byte[] >(){}.getType();
                    return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param agentId 代理商帐户ID (required)
     * @param taskId 任务ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileRebateCommonDownloadDownloadFileGetAsync(Long agentId, String taskId, final ApiCallback< byte[] > _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2FileRebateCommonDownloadDownloadFileGetValidateBeforeCall(agentId, taskId, _callback);
        Type localVarReturnType = new TypeToken< byte[] >(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
