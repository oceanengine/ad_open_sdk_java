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



import com.bytedance.ads.model.RemittanceCodeListV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemittanceCodeListV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RemittanceCodeListV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public RemittanceCodeListV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30RemittanceCodeListGet
     * @param agentId 代理商账号ID (required)
     * @param page 页码 (optional)
     * @param pageSize 页面大小 (optional)
     * @param remittanceCodeList 汇款码列表 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30RemittanceCodeListGetCall(Long agentId, Long page, Long pageSize, List<String> remittanceCodeList, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/remittance_code/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agent_id", agentId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (remittanceCodeList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "remittance_code_list", remittanceCodeList));
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
    private okhttp3.Call openApiV30RemittanceCodeListGetValidateBeforeCall(Long agentId, Long page, Long pageSize, List<String> remittanceCodeList, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'agentId' is set
        if (agentId == null) {
            throw new ApiException("Missing the required parameter 'agentId' when calling openApiV30RemittanceCodeListGet(Async)");
        }

        return openApiV30RemittanceCodeListGetCall(agentId, page, pageSize, remittanceCodeList, _callback);

    }

    /**
     * 
     * 
     * @param agentId 代理商账号ID (required)
     * @param page 页码 (optional)
     * @param pageSize 页面大小 (optional)
     * @param remittanceCodeList 汇款码列表 (optional)
     * @return RemittanceCodeListV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public RemittanceCodeListV30Response openApiV30RemittanceCodeListGet(Long agentId, Long page, Long pageSize, List<String> remittanceCodeList) throws ApiException {
        ApiResponse<RemittanceCodeListV30Response> localVarResp = openApiV30RemittanceCodeListGetWithHttpInfo(agentId, page, pageSize, remittanceCodeList);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param agentId 代理商账号ID (required)
     * @param page 页码 (optional)
     * @param pageSize 页面大小 (optional)
     * @param remittanceCodeList 汇款码列表 (optional)
     * @return ApiResponse&lt;RemittanceCodeListV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RemittanceCodeListV30Response> openApiV30RemittanceCodeListGetWithHttpInfo(Long agentId, Long page, Long pageSize, List<String> remittanceCodeList) throws ApiException {
        okhttp3.Call localVarCall = openApiV30RemittanceCodeListGetValidateBeforeCall(agentId, page, pageSize, remittanceCodeList, null);
        Type localVarReturnType = new TypeToken<RemittanceCodeListV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param agentId 代理商账号ID (required)
     * @param page 页码 (optional)
     * @param pageSize 页面大小 (optional)
     * @param remittanceCodeList 汇款码列表 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30RemittanceCodeListGetAsync(Long agentId, Long page, Long pageSize, List<String> remittanceCodeList, final ApiCallback<RemittanceCodeListV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30RemittanceCodeListGetValidateBeforeCall(agentId, page, pageSize, remittanceCodeList, _callback);
        Type localVarReturnType = new TypeToken<RemittanceCodeListV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
