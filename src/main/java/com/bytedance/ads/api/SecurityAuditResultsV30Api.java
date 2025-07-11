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



import com.bytedance.ads.model.SecurityAuditResultsV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityAuditResultsV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SecurityAuditResultsV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public SecurityAuditResultsV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30SecurityAuditResultsGet
     * @param accountId 代理商id (required)
     * @param objectId 送审对象ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30SecurityAuditResultsGetCall(Long accountId, Long objectId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/security/audit_results/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (objectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("object_id", objectId));
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
    private okhttp3.Call openApiV30SecurityAuditResultsGetValidateBeforeCall(Long accountId, Long objectId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30SecurityAuditResultsGet(Async)");
        }

        // verify the required parameter 'objectId' is set
        if (objectId == null) {
            throw new ApiException("Missing the required parameter 'objectId' when calling openApiV30SecurityAuditResultsGet(Async)");
        }

        return openApiV30SecurityAuditResultsGetCall(accountId, objectId, _callback);

    }

    /**
     * 
     * 
     * @param accountId 代理商id (required)
     * @param objectId 送审对象ID (required)
     * @return SecurityAuditResultsV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SecurityAuditResultsV30Response openApiV30SecurityAuditResultsGet(Long accountId, Long objectId) throws ApiException {
        ApiResponse<SecurityAuditResultsV30Response> localVarResp = openApiV30SecurityAuditResultsGetWithHttpInfo(accountId, objectId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId 代理商id (required)
     * @param objectId 送审对象ID (required)
     * @return ApiResponse&lt;SecurityAuditResultsV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecurityAuditResultsV30Response> openApiV30SecurityAuditResultsGetWithHttpInfo(Long accountId, Long objectId) throws ApiException {
        okhttp3.Call localVarCall = openApiV30SecurityAuditResultsGetValidateBeforeCall(accountId, objectId, null);
        Type localVarReturnType = new TypeToken<SecurityAuditResultsV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId 代理商id (required)
     * @param objectId 送审对象ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30SecurityAuditResultsGetAsync(Long accountId, Long objectId, final ApiCallback<SecurityAuditResultsV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30SecurityAuditResultsGetValidateBeforeCall(accountId, objectId, _callback);
        Type localVarReturnType = new TypeToken<SecurityAuditResultsV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
