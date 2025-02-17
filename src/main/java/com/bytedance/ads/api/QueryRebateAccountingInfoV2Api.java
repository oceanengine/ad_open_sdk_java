/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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



import com.bytedance.ads.model.QueryRebateAccountingInfoV2Filtering;
import com.bytedance.ads.model.QueryRebateAccountingInfoV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryRebateAccountingInfoV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QueryRebateAccountingInfoV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QueryRebateAccountingInfoV2Api(ApiClient apiClient) {
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
     * Build call for openApi2QueryRebateAccountingInfoGet
     * @param agentId 代理商 (required)
     * @param filtering 过滤器 (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 25)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2QueryRebateAccountingInfoGetCall(Long agentId, QueryRebateAccountingInfoV2Filtering filtering, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/query/rebate_accounting_info/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agent_id", agentId));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call openApi2QueryRebateAccountingInfoGetValidateBeforeCall(Long agentId, QueryRebateAccountingInfoV2Filtering filtering, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'agentId' is set
        if (agentId == null) {
            throw new ApiException("Missing the required parameter 'agentId' when calling openApi2QueryRebateAccountingInfoGet(Async)");
        }

        return openApi2QueryRebateAccountingInfoGetCall(agentId, filtering, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param agentId 代理商 (required)
     * @param filtering 过滤器 (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 25)
     * @return QueryRebateAccountingInfoV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QueryRebateAccountingInfoV2Response openApi2QueryRebateAccountingInfoGet(Long agentId, QueryRebateAccountingInfoV2Filtering filtering, Long page, Long pageSize) throws ApiException {
        ApiResponse<QueryRebateAccountingInfoV2Response> localVarResp = openApi2QueryRebateAccountingInfoGetWithHttpInfo(agentId, filtering, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param agentId 代理商 (required)
     * @param filtering 过滤器 (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 25)
     * @return ApiResponse&lt;QueryRebateAccountingInfoV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QueryRebateAccountingInfoV2Response> openApi2QueryRebateAccountingInfoGetWithHttpInfo(Long agentId, QueryRebateAccountingInfoV2Filtering filtering, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2QueryRebateAccountingInfoGetValidateBeforeCall(agentId, filtering, page, pageSize, null);
        Type localVarReturnType = new TypeToken<QueryRebateAccountingInfoV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param agentId 代理商 (required)
     * @param filtering 过滤器 (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 25)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2QueryRebateAccountingInfoGetAsync(Long agentId, QueryRebateAccountingInfoV2Filtering filtering, Long page, Long pageSize, final ApiCallback<QueryRebateAccountingInfoV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2QueryRebateAccountingInfoGetValidateBeforeCall(agentId, filtering, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<QueryRebateAccountingInfoV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
