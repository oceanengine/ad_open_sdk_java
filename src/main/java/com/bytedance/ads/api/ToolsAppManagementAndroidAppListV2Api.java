/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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



import com.bytedance.ads.model.ToolsAppManagementAndroidAppListV2AccountType;
import com.bytedance.ads.model.ToolsAppManagementAndroidAppListV2Filtering;
import com.bytedance.ads.model.ToolsAppManagementAndroidAppListV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsAppManagementAndroidAppListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsAppManagementAndroidAppListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsAppManagementAndroidAppListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsAppManagementAndroidAppListGet
     * @param accountId  (required)
     * @param accountType  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param filtering  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAppManagementAndroidAppListGetCall(Long accountId, ToolsAppManagementAndroidAppListV2AccountType accountType, Integer page, Integer pageSize, ToolsAppManagementAndroidAppListV2Filtering filtering, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/app_management/android_app/list/";

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

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call openApi2ToolsAppManagementAndroidAppListGetValidateBeforeCall(Long accountId, ToolsAppManagementAndroidAppListV2AccountType accountType, Integer page, Integer pageSize, ToolsAppManagementAndroidAppListV2Filtering filtering, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApi2ToolsAppManagementAndroidAppListGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApi2ToolsAppManagementAndroidAppListGet(Async)");
        }

        return openApi2ToolsAppManagementAndroidAppListGetCall(accountId, accountType, page, pageSize, filtering, _callback);

    }

    /**
     * 
     * 
     * @param accountId  (required)
     * @param accountType  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param filtering  (optional)
     * @return ToolsAppManagementAndroidAppListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsAppManagementAndroidAppListV2Response openApi2ToolsAppManagementAndroidAppListGet(Long accountId, ToolsAppManagementAndroidAppListV2AccountType accountType, Integer page, Integer pageSize, ToolsAppManagementAndroidAppListV2Filtering filtering) throws ApiException {
        ApiResponse<ToolsAppManagementAndroidAppListV2Response> localVarResp = openApi2ToolsAppManagementAndroidAppListGetWithHttpInfo(accountId, accountType, page, pageSize, filtering);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId  (required)
     * @param accountType  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param filtering  (optional)
     * @return ApiResponse&lt;ToolsAppManagementAndroidAppListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsAppManagementAndroidAppListV2Response> openApi2ToolsAppManagementAndroidAppListGetWithHttpInfo(Long accountId, ToolsAppManagementAndroidAppListV2AccountType accountType, Integer page, Integer pageSize, ToolsAppManagementAndroidAppListV2Filtering filtering) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsAppManagementAndroidAppListGetValidateBeforeCall(accountId, accountType, page, pageSize, filtering, null);
        Type localVarReturnType = new TypeToken<ToolsAppManagementAndroidAppListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId  (required)
     * @param accountType  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param filtering  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAppManagementAndroidAppListGetAsync(Long accountId, ToolsAppManagementAndroidAppListV2AccountType accountType, Integer page, Integer pageSize, ToolsAppManagementAndroidAppListV2Filtering filtering, final ApiCallback<ToolsAppManagementAndroidAppListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsAppManagementAndroidAppListGetValidateBeforeCall(accountId, accountType, page, pageSize, filtering, _callback);
        Type localVarReturnType = new TypeToken<ToolsAppManagementAndroidAppListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
