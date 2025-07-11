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



import com.bytedance.ads.model.LocalAwemeAuthorizedGetV30Filtering;
import com.bytedance.ads.model.LocalAwemeAuthorizedGetV30MarketingGoal;
import com.bytedance.ads.model.LocalAwemeAuthorizedGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalAwemeAuthorizedGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LocalAwemeAuthorizedGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public LocalAwemeAuthorizedGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30LocalAwemeAuthorizedGetGet
     * @param localAccountId 广告主id (required)
     * @param marketingGoal 抖音号使用场景 (required)
     * @param filtering 过滤器 (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalAwemeAuthorizedGetGetCall(Long localAccountId, LocalAwemeAuthorizedGetV30MarketingGoal marketingGoal, LocalAwemeAuthorizedGetV30Filtering filtering, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/local/aweme/authorized/get/";

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

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (marketingGoal != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_goal", marketingGoal));
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
    private okhttp3.Call openApiV30LocalAwemeAuthorizedGetGetValidateBeforeCall(Long localAccountId, LocalAwemeAuthorizedGetV30MarketingGoal marketingGoal, LocalAwemeAuthorizedGetV30Filtering filtering, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'localAccountId' is set
        if (localAccountId == null) {
            throw new ApiException("Missing the required parameter 'localAccountId' when calling openApiV30LocalAwemeAuthorizedGetGet(Async)");
        }

        // verify the required parameter 'marketingGoal' is set
        if (marketingGoal == null) {
            throw new ApiException("Missing the required parameter 'marketingGoal' when calling openApiV30LocalAwemeAuthorizedGetGet(Async)");
        }

        return openApiV30LocalAwemeAuthorizedGetGetCall(localAccountId, marketingGoal, filtering, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param localAccountId 广告主id (required)
     * @param marketingGoal 抖音号使用场景 (required)
     * @param filtering 过滤器 (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 20)
     * @return LocalAwemeAuthorizedGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public LocalAwemeAuthorizedGetV30Response openApiV30LocalAwemeAuthorizedGetGet(Long localAccountId, LocalAwemeAuthorizedGetV30MarketingGoal marketingGoal, LocalAwemeAuthorizedGetV30Filtering filtering, Long page, Long pageSize) throws ApiException {
        ApiResponse<LocalAwemeAuthorizedGetV30Response> localVarResp = openApiV30LocalAwemeAuthorizedGetGetWithHttpInfo(localAccountId, marketingGoal, filtering, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param localAccountId 广告主id (required)
     * @param marketingGoal 抖音号使用场景 (required)
     * @param filtering 过滤器 (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 20)
     * @return ApiResponse&lt;LocalAwemeAuthorizedGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LocalAwemeAuthorizedGetV30Response> openApiV30LocalAwemeAuthorizedGetGetWithHttpInfo(Long localAccountId, LocalAwemeAuthorizedGetV30MarketingGoal marketingGoal, LocalAwemeAuthorizedGetV30Filtering filtering, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV30LocalAwemeAuthorizedGetGetValidateBeforeCall(localAccountId, marketingGoal, filtering, page, pageSize, null);
        Type localVarReturnType = new TypeToken<LocalAwemeAuthorizedGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param localAccountId 广告主id (required)
     * @param marketingGoal 抖音号使用场景 (required)
     * @param filtering 过滤器 (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalAwemeAuthorizedGetGetAsync(Long localAccountId, LocalAwemeAuthorizedGetV30MarketingGoal marketingGoal, LocalAwemeAuthorizedGetV30Filtering filtering, Long page, Long pageSize, final ApiCallback<LocalAwemeAuthorizedGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30LocalAwemeAuthorizedGetGetValidateBeforeCall(localAccountId, marketingGoal, filtering, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<LocalAwemeAuthorizedGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
