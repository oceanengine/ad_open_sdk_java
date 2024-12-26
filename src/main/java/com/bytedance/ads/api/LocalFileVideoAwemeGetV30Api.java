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



import com.bytedance.ads.model.LocalFileVideoAwemeGetV30ExternalAction;
import com.bytedance.ads.model.LocalFileVideoAwemeGetV30Filtering;
import com.bytedance.ads.model.LocalFileVideoAwemeGetV30OrderFiled;
import com.bytedance.ads.model.LocalFileVideoAwemeGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalFileVideoAwemeGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LocalFileVideoAwemeGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public LocalFileVideoAwemeGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30LocalFileVideoAwemeGetGet
     * @param localAccountId  (required)
     * @param cursor 页码游标值,第一次传\&quot;0\&quot;,之后每次传上次返回的值 (required)
     * @param filtering 过滤字段 (optional)
     * @param orderFiled 排序字段 (optional)
     * @param externalAction ea，按预估效果排序的时候必传，仅支持传：OTO_PAY/OTO_PAY (optional)
     * @param count 默认10，最大100，最小1 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalFileVideoAwemeGetGetCall(Long localAccountId, String cursor, LocalFileVideoAwemeGetV30Filtering filtering, LocalFileVideoAwemeGetV30OrderFiled orderFiled, LocalFileVideoAwemeGetV30ExternalAction externalAction, Long count, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/local/file/video/aweme/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (localAccountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("local_account_id", localAccountId));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (orderFiled != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_filed", orderFiled));
        }

        if (externalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_action", externalAction));
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
    private okhttp3.Call openApiV30LocalFileVideoAwemeGetGetValidateBeforeCall(Long localAccountId, String cursor, LocalFileVideoAwemeGetV30Filtering filtering, LocalFileVideoAwemeGetV30OrderFiled orderFiled, LocalFileVideoAwemeGetV30ExternalAction externalAction, Long count, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'localAccountId' is set
        if (localAccountId == null) {
            throw new ApiException("Missing the required parameter 'localAccountId' when calling openApiV30LocalFileVideoAwemeGetGet(Async)");
        }

        // verify the required parameter 'cursor' is set
        if (cursor == null) {
            throw new ApiException("Missing the required parameter 'cursor' when calling openApiV30LocalFileVideoAwemeGetGet(Async)");
        }

        return openApiV30LocalFileVideoAwemeGetGetCall(localAccountId, cursor, filtering, orderFiled, externalAction, count, _callback);

    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param cursor 页码游标值,第一次传\&quot;0\&quot;,之后每次传上次返回的值 (required)
     * @param filtering 过滤字段 (optional)
     * @param orderFiled 排序字段 (optional)
     * @param externalAction ea，按预估效果排序的时候必传，仅支持传：OTO_PAY/OTO_PAY (optional)
     * @param count 默认10，最大100，最小1 (optional, default to 10)
     * @return LocalFileVideoAwemeGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public LocalFileVideoAwemeGetV30Response openApiV30LocalFileVideoAwemeGetGet(Long localAccountId, String cursor, LocalFileVideoAwemeGetV30Filtering filtering, LocalFileVideoAwemeGetV30OrderFiled orderFiled, LocalFileVideoAwemeGetV30ExternalAction externalAction, Long count) throws ApiException {
        ApiResponse<LocalFileVideoAwemeGetV30Response> localVarResp = openApiV30LocalFileVideoAwemeGetGetWithHttpInfo(localAccountId, cursor, filtering, orderFiled, externalAction, count);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param cursor 页码游标值,第一次传\&quot;0\&quot;,之后每次传上次返回的值 (required)
     * @param filtering 过滤字段 (optional)
     * @param orderFiled 排序字段 (optional)
     * @param externalAction ea，按预估效果排序的时候必传，仅支持传：OTO_PAY/OTO_PAY (optional)
     * @param count 默认10，最大100，最小1 (optional, default to 10)
     * @return ApiResponse&lt;LocalFileVideoAwemeGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LocalFileVideoAwemeGetV30Response> openApiV30LocalFileVideoAwemeGetGetWithHttpInfo(Long localAccountId, String cursor, LocalFileVideoAwemeGetV30Filtering filtering, LocalFileVideoAwemeGetV30OrderFiled orderFiled, LocalFileVideoAwemeGetV30ExternalAction externalAction, Long count) throws ApiException {
        okhttp3.Call localVarCall = openApiV30LocalFileVideoAwemeGetGetValidateBeforeCall(localAccountId, cursor, filtering, orderFiled, externalAction, count, null);
        Type localVarReturnType = new TypeToken<LocalFileVideoAwemeGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param localAccountId  (required)
     * @param cursor 页码游标值,第一次传\&quot;0\&quot;,之后每次传上次返回的值 (required)
     * @param filtering 过滤字段 (optional)
     * @param orderFiled 排序字段 (optional)
     * @param externalAction ea，按预估效果排序的时候必传，仅支持传：OTO_PAY/OTO_PAY (optional)
     * @param count 默认10，最大100，最小1 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalFileVideoAwemeGetGetAsync(Long localAccountId, String cursor, LocalFileVideoAwemeGetV30Filtering filtering, LocalFileVideoAwemeGetV30OrderFiled orderFiled, LocalFileVideoAwemeGetV30ExternalAction externalAction, Long count, final ApiCallback<LocalFileVideoAwemeGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30LocalFileVideoAwemeGetGetValidateBeforeCall(localAccountId, cursor, filtering, orderFiled, externalAction, count, _callback);
        Type localVarReturnType = new TypeToken<LocalFileVideoAwemeGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
