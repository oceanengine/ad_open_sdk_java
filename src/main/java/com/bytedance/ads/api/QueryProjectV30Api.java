/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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



import com.bytedance.ads.model.QueryProjectV30Filtering;
import com.bytedance.ads.model.QueryProjectV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryProjectV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QueryProjectV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QueryProjectV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30QueryProjectGet
     * @param agentId 代理商ID (required)
     * @param count 页码游标值（单页限制，最大1000，必填） (required)
     * @param cursor 页码游标值（根据cursor进行滚动查询，第一次可不穿，后续传前一次返回列表中的最小值） (required)
     * @param filtering 过滤器 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30QueryProjectGetCall(Long agentId, Integer count, Long cursor, QueryProjectV30Filtering filtering, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/query/project/";

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

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
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
    private okhttp3.Call openApiV30QueryProjectGetValidateBeforeCall(Long agentId, Integer count, Long cursor, QueryProjectV30Filtering filtering, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'agentId' is set
        if (agentId == null) {
            throw new ApiException("Missing the required parameter 'agentId' when calling openApiV30QueryProjectGet(Async)");
        }

        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling openApiV30QueryProjectGet(Async)");
        }

        // verify the required parameter 'cursor' is set
        if (cursor == null) {
            throw new ApiException("Missing the required parameter 'cursor' when calling openApiV30QueryProjectGet(Async)");
        }

        return openApiV30QueryProjectGetCall(agentId, count, cursor, filtering, _callback);

    }

    /**
     * 
     * 
     * @param agentId 代理商ID (required)
     * @param count 页码游标值（单页限制，最大1000，必填） (required)
     * @param cursor 页码游标值（根据cursor进行滚动查询，第一次可不穿，后续传前一次返回列表中的最小值） (required)
     * @param filtering 过滤器 (optional)
     * @return QueryProjectV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QueryProjectV30Response openApiV30QueryProjectGet(Long agentId, Integer count, Long cursor, QueryProjectV30Filtering filtering) throws ApiException {
        ApiResponse<QueryProjectV30Response> localVarResp = openApiV30QueryProjectGetWithHttpInfo(agentId, count, cursor, filtering);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param agentId 代理商ID (required)
     * @param count 页码游标值（单页限制，最大1000，必填） (required)
     * @param cursor 页码游标值（根据cursor进行滚动查询，第一次可不穿，后续传前一次返回列表中的最小值） (required)
     * @param filtering 过滤器 (optional)
     * @return ApiResponse&lt;QueryProjectV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QueryProjectV30Response> openApiV30QueryProjectGetWithHttpInfo(Long agentId, Integer count, Long cursor, QueryProjectV30Filtering filtering) throws ApiException {
        okhttp3.Call localVarCall = openApiV30QueryProjectGetValidateBeforeCall(agentId, count, cursor, filtering, null);
        Type localVarReturnType = new TypeToken<QueryProjectV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param agentId 代理商ID (required)
     * @param count 页码游标值（单页限制，最大1000，必填） (required)
     * @param cursor 页码游标值（根据cursor进行滚动查询，第一次可不穿，后续传前一次返回列表中的最小值） (required)
     * @param filtering 过滤器 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30QueryProjectGetAsync(Long agentId, Integer count, Long cursor, QueryProjectV30Filtering filtering, final ApiCallback<QueryProjectV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30QueryProjectGetValidateBeforeCall(agentId, count, cursor, filtering, _callback);
        Type localVarReturnType = new TypeToken<QueryProjectV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
