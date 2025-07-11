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



import com.bytedance.ads.model.ToolsAppManagementUploadTaskListV2AccountType;
import com.bytedance.ads.model.ToolsAppManagementUploadTaskListV2Filtering;
import com.bytedance.ads.model.ToolsAppManagementUploadTaskListV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsAppManagementUploadTaskListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsAppManagementUploadTaskListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsAppManagementUploadTaskListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsAppManagementUploadTaskListGet
     * @param accountId 账户id指可以接的账号体系如广告主id、巨量纵横组织id等 (required)
     * @param accountType 账户类型 (required)
     * @param filtering 过滤条件 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAppManagementUploadTaskListGetCall(Long accountId, ToolsAppManagementUploadTaskListV2AccountType accountType, ToolsAppManagementUploadTaskListV2Filtering filtering, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/app_management/upload_task/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
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
    private okhttp3.Call openApi2ToolsAppManagementUploadTaskListGetValidateBeforeCall(Long accountId, ToolsAppManagementUploadTaskListV2AccountType accountType, ToolsAppManagementUploadTaskListV2Filtering filtering, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApi2ToolsAppManagementUploadTaskListGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApi2ToolsAppManagementUploadTaskListGet(Async)");
        }

        // verify the required parameter 'filtering' is set
        if (filtering == null) {
            throw new ApiException("Missing the required parameter 'filtering' when calling openApi2ToolsAppManagementUploadTaskListGet(Async)");
        }

        return openApi2ToolsAppManagementUploadTaskListGetCall(accountId, accountType, filtering, _callback);

    }

    /**
     * 
     * 
     * @param accountId 账户id指可以接的账号体系如广告主id、巨量纵横组织id等 (required)
     * @param accountType 账户类型 (required)
     * @param filtering 过滤条件 (required)
     * @return ToolsAppManagementUploadTaskListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsAppManagementUploadTaskListV2Response openApi2ToolsAppManagementUploadTaskListGet(Long accountId, ToolsAppManagementUploadTaskListV2AccountType accountType, ToolsAppManagementUploadTaskListV2Filtering filtering) throws ApiException {
        ApiResponse<ToolsAppManagementUploadTaskListV2Response> localVarResp = openApi2ToolsAppManagementUploadTaskListGetWithHttpInfo(accountId, accountType, filtering);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId 账户id指可以接的账号体系如广告主id、巨量纵横组织id等 (required)
     * @param accountType 账户类型 (required)
     * @param filtering 过滤条件 (required)
     * @return ApiResponse&lt;ToolsAppManagementUploadTaskListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsAppManagementUploadTaskListV2Response> openApi2ToolsAppManagementUploadTaskListGetWithHttpInfo(Long accountId, ToolsAppManagementUploadTaskListV2AccountType accountType, ToolsAppManagementUploadTaskListV2Filtering filtering) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsAppManagementUploadTaskListGetValidateBeforeCall(accountId, accountType, filtering, null);
        Type localVarReturnType = new TypeToken<ToolsAppManagementUploadTaskListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId 账户id指可以接的账号体系如广告主id、巨量纵横组织id等 (required)
     * @param accountType 账户类型 (required)
     * @param filtering 过滤条件 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAppManagementUploadTaskListGetAsync(Long accountId, ToolsAppManagementUploadTaskListV2AccountType accountType, ToolsAppManagementUploadTaskListV2Filtering filtering, final ApiCallback<ToolsAppManagementUploadTaskListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsAppManagementUploadTaskListGetValidateBeforeCall(accountId, accountType, filtering, _callback);
        Type localVarReturnType = new TypeToken<ToolsAppManagementUploadTaskListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
