/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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



import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10MarketingGoal;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10OptimizationTimeScope;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10OrderType;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanReportLongTransferOrderGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanReportLongTransferOrderGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanReportLongTransferOrderGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanReportLongTransferOrderGetGet
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05，时间跨度不能超过90天 (required)
     * @param optimizationTimeScope  (required)
     * @param filtering  (required)
     * @param marketingGoal  (required)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportLongTransferOrderGetGetCall(Long advertiserId, String startDate, String endDate, QianchuanReportLongTransferOrderGetV10OptimizationTimeScope optimizationTimeScope, QianchuanReportLongTransferOrderGetV10Filtering filtering, QianchuanReportLongTransferOrderGetV10MarketingGoal marketingGoal, QianchuanReportLongTransferOrderGetV10OrderType orderType, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/report/long_transfer/order/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (optimizationTimeScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("optimization_time_scope", optimizationTimeScope));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (marketingGoal != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_goal", marketingGoal));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
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
    private okhttp3.Call openApiV10QianchuanReportLongTransferOrderGetGetValidateBeforeCall(Long advertiserId, String startDate, String endDate, QianchuanReportLongTransferOrderGetV10OptimizationTimeScope optimizationTimeScope, QianchuanReportLongTransferOrderGetV10Filtering filtering, QianchuanReportLongTransferOrderGetV10MarketingGoal marketingGoal, QianchuanReportLongTransferOrderGetV10OrderType orderType, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanReportLongTransferOrderGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV10QianchuanReportLongTransferOrderGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV10QianchuanReportLongTransferOrderGetGet(Async)");
        }

        // verify the required parameter 'optimizationTimeScope' is set
        if (optimizationTimeScope == null) {
            throw new ApiException("Missing the required parameter 'optimizationTimeScope' when calling openApiV10QianchuanReportLongTransferOrderGetGet(Async)");
        }

        // verify the required parameter 'filtering' is set
        if (filtering == null) {
            throw new ApiException("Missing the required parameter 'filtering' when calling openApiV10QianchuanReportLongTransferOrderGetGet(Async)");
        }

        // verify the required parameter 'marketingGoal' is set
        if (marketingGoal == null) {
            throw new ApiException("Missing the required parameter 'marketingGoal' when calling openApiV10QianchuanReportLongTransferOrderGetGet(Async)");
        }

        return openApiV10QianchuanReportLongTransferOrderGetGetCall(advertiserId, startDate, endDate, optimizationTimeScope, filtering, marketingGoal, orderType, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05，时间跨度不能超过90天 (required)
     * @param optimizationTimeScope  (required)
     * @param filtering  (required)
     * @param marketingGoal  (required)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @return QianchuanReportLongTransferOrderGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanReportLongTransferOrderGetV10Response openApiV10QianchuanReportLongTransferOrderGetGet(Long advertiserId, String startDate, String endDate, QianchuanReportLongTransferOrderGetV10OptimizationTimeScope optimizationTimeScope, QianchuanReportLongTransferOrderGetV10Filtering filtering, QianchuanReportLongTransferOrderGetV10MarketingGoal marketingGoal, QianchuanReportLongTransferOrderGetV10OrderType orderType, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<QianchuanReportLongTransferOrderGetV10Response> localVarResp = openApiV10QianchuanReportLongTransferOrderGetGetWithHttpInfo(advertiserId, startDate, endDate, optimizationTimeScope, filtering, marketingGoal, orderType, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05，时间跨度不能超过90天 (required)
     * @param optimizationTimeScope  (required)
     * @param filtering  (required)
     * @param marketingGoal  (required)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @return ApiResponse&lt;QianchuanReportLongTransferOrderGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanReportLongTransferOrderGetV10Response> openApiV10QianchuanReportLongTransferOrderGetGetWithHttpInfo(Long advertiserId, String startDate, String endDate, QianchuanReportLongTransferOrderGetV10OptimizationTimeScope optimizationTimeScope, QianchuanReportLongTransferOrderGetV10Filtering filtering, QianchuanReportLongTransferOrderGetV10MarketingGoal marketingGoal, QianchuanReportLongTransferOrderGetV10OrderType orderType, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanReportLongTransferOrderGetGetValidateBeforeCall(advertiserId, startDate, endDate, optimizationTimeScope, filtering, marketingGoal, orderType, page, pageSize, null);
        Type localVarReturnType = new TypeToken<QianchuanReportLongTransferOrderGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05，时间跨度不能超过90天 (required)
     * @param optimizationTimeScope  (required)
     * @param filtering  (required)
     * @param marketingGoal  (required)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportLongTransferOrderGetGetAsync(Long advertiserId, String startDate, String endDate, QianchuanReportLongTransferOrderGetV10OptimizationTimeScope optimizationTimeScope, QianchuanReportLongTransferOrderGetV10Filtering filtering, QianchuanReportLongTransferOrderGetV10MarketingGoal marketingGoal, QianchuanReportLongTransferOrderGetV10OrderType orderType, Integer page, Integer pageSize, final ApiCallback<QianchuanReportLongTransferOrderGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanReportLongTransferOrderGetGetValidateBeforeCall(advertiserId, startDate, endDate, optimizationTimeScope, filtering, marketingGoal, orderType, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<QianchuanReportLongTransferOrderGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
