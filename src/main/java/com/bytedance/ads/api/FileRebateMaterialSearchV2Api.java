/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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



import com.bytedance.ads.model.FileRebateMaterialSearchV2Filtering;
import com.bytedance.ads.model.FileRebateMaterialSearchV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileRebateMaterialSearchV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FileRebateMaterialSearchV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public FileRebateMaterialSearchV2Api(ApiClient apiClient) {
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
     * Build call for openApi2FileRebateMaterialSearchGet
     * @param agentId 代理商帐户ID (required)
     * @param period 年月 格式：yyyy-mm (required)
     * @param filtering 过滤条件 (optional)
     * @param cursor 【分页方式①】 游标查询方案，推荐该方式，注：该方式查询依赖上一次返回值，只能串行调用。 游标值：首次查询请传入 \&quot;0\&quot;。不传入或者传空字符串默认使用【分页方式②】。 (optional)
     * @param count 【分页方式①】 数据量：一次请求希望获取的数据量（最大限制5000）。 (optional)
     * @param page 【分页方式②】 页数默认值: 1 (optional)
     * @param pageSize 【分页方式②】 页面大小默认值:10, 最大值：500 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileRebateMaterialSearchGetCall(Long agentId, String period, FileRebateMaterialSearchV2Filtering filtering, String cursor, Integer count, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/file/rebate/material_search/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agent_id", agentId));
        }

        if (period != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("period", period));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
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
    private okhttp3.Call openApi2FileRebateMaterialSearchGetValidateBeforeCall(Long agentId, String period, FileRebateMaterialSearchV2Filtering filtering, String cursor, Integer count, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'agentId' is set
        if (agentId == null) {
            throw new ApiException("Missing the required parameter 'agentId' when calling openApi2FileRebateMaterialSearchGet(Async)");
        }

        // verify the required parameter 'period' is set
        if (period == null) {
            throw new ApiException("Missing the required parameter 'period' when calling openApi2FileRebateMaterialSearchGet(Async)");
        }

        return openApi2FileRebateMaterialSearchGetCall(agentId, period, filtering, cursor, count, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param agentId 代理商帐户ID (required)
     * @param period 年月 格式：yyyy-mm (required)
     * @param filtering 过滤条件 (optional)
     * @param cursor 【分页方式①】 游标查询方案，推荐该方式，注：该方式查询依赖上一次返回值，只能串行调用。 游标值：首次查询请传入 \&quot;0\&quot;。不传入或者传空字符串默认使用【分页方式②】。 (optional)
     * @param count 【分页方式①】 数据量：一次请求希望获取的数据量（最大限制5000）。 (optional)
     * @param page 【分页方式②】 页数默认值: 1 (optional)
     * @param pageSize 【分页方式②】 页面大小默认值:10, 最大值：500 (optional)
     * @return FileRebateMaterialSearchV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FileRebateMaterialSearchV2Response openApi2FileRebateMaterialSearchGet(Long agentId, String period, FileRebateMaterialSearchV2Filtering filtering, String cursor, Integer count, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<FileRebateMaterialSearchV2Response> localVarResp = openApi2FileRebateMaterialSearchGetWithHttpInfo(agentId, period, filtering, cursor, count, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param agentId 代理商帐户ID (required)
     * @param period 年月 格式：yyyy-mm (required)
     * @param filtering 过滤条件 (optional)
     * @param cursor 【分页方式①】 游标查询方案，推荐该方式，注：该方式查询依赖上一次返回值，只能串行调用。 游标值：首次查询请传入 \&quot;0\&quot;。不传入或者传空字符串默认使用【分页方式②】。 (optional)
     * @param count 【分页方式①】 数据量：一次请求希望获取的数据量（最大限制5000）。 (optional)
     * @param page 【分页方式②】 页数默认值: 1 (optional)
     * @param pageSize 【分页方式②】 页面大小默认值:10, 最大值：500 (optional)
     * @return ApiResponse&lt;FileRebateMaterialSearchV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileRebateMaterialSearchV2Response> openApi2FileRebateMaterialSearchGetWithHttpInfo(Long agentId, String period, FileRebateMaterialSearchV2Filtering filtering, String cursor, Integer count, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2FileRebateMaterialSearchGetValidateBeforeCall(agentId, period, filtering, cursor, count, page, pageSize, null);
        Type localVarReturnType = new TypeToken<FileRebateMaterialSearchV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param agentId 代理商帐户ID (required)
     * @param period 年月 格式：yyyy-mm (required)
     * @param filtering 过滤条件 (optional)
     * @param cursor 【分页方式①】 游标查询方案，推荐该方式，注：该方式查询依赖上一次返回值，只能串行调用。 游标值：首次查询请传入 \&quot;0\&quot;。不传入或者传空字符串默认使用【分页方式②】。 (optional)
     * @param count 【分页方式①】 数据量：一次请求希望获取的数据量（最大限制5000）。 (optional)
     * @param page 【分页方式②】 页数默认值: 1 (optional)
     * @param pageSize 【分页方式②】 页面大小默认值:10, 最大值：500 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileRebateMaterialSearchGetAsync(Long agentId, String period, FileRebateMaterialSearchV2Filtering filtering, String cursor, Integer count, Integer page, Integer pageSize, final ApiCallback<FileRebateMaterialSearchV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2FileRebateMaterialSearchGetValidateBeforeCall(agentId, period, filtering, cursor, count, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<FileRebateMaterialSearchV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
