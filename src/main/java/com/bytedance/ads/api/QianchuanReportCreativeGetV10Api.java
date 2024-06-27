/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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



import com.bytedance.ads.model.QianchuanReportCreativeGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10OrderType;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10Response;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10TimeGranularity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanReportCreativeGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanReportCreativeGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanReportCreativeGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanReportCreativeGetGet
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05 (required)
     * @param fields  (required)
     * @param filtering  (required)
     * @param timeGranularity  (optional)
     * @param orderField  (optional)
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
    public okhttp3.Call openApiV10QianchuanReportCreativeGetGetCall(Long advertiserId, String startDate, String endDate, List<String> fields, QianchuanReportCreativeGetV10Filtering filtering, QianchuanReportCreativeGetV10TimeGranularity timeGranularity, String orderField, QianchuanReportCreativeGetV10OrderType orderType, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/report/creative/get/";

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

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (timeGranularity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_granularity", timeGranularity));
        }

        if (orderField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_field", orderField));
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
    private okhttp3.Call openApiV10QianchuanReportCreativeGetGetValidateBeforeCall(Long advertiserId, String startDate, String endDate, List<String> fields, QianchuanReportCreativeGetV10Filtering filtering, QianchuanReportCreativeGetV10TimeGranularity timeGranularity, String orderField, QianchuanReportCreativeGetV10OrderType orderType, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanReportCreativeGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV10QianchuanReportCreativeGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV10QianchuanReportCreativeGetGet(Async)");
        }

        // verify the required parameter 'fields' is set
        if (fields == null) {
            throw new ApiException("Missing the required parameter 'fields' when calling openApiV10QianchuanReportCreativeGetGet(Async)");
        }

        // verify the required parameter 'filtering' is set
        if (filtering == null) {
            throw new ApiException("Missing the required parameter 'filtering' when calling openApiV10QianchuanReportCreativeGetGet(Async)");
        }

        return openApiV10QianchuanReportCreativeGetGetCall(advertiserId, startDate, endDate, fields, filtering, timeGranularity, orderField, orderType, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05 (required)
     * @param fields  (required)
     * @param filtering  (required)
     * @param timeGranularity  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @return QianchuanReportCreativeGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanReportCreativeGetV10Response openApiV10QianchuanReportCreativeGetGet(Long advertiserId, String startDate, String endDate, List<String> fields, QianchuanReportCreativeGetV10Filtering filtering, QianchuanReportCreativeGetV10TimeGranularity timeGranularity, String orderField, QianchuanReportCreativeGetV10OrderType orderType, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<QianchuanReportCreativeGetV10Response> localVarResp = openApiV10QianchuanReportCreativeGetGetWithHttpInfo(advertiserId, startDate, endDate, fields, filtering, timeGranularity, orderField, orderType, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05 (required)
     * @param fields  (required)
     * @param filtering  (required)
     * @param timeGranularity  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @return ApiResponse&lt;QianchuanReportCreativeGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanReportCreativeGetV10Response> openApiV10QianchuanReportCreativeGetGetWithHttpInfo(Long advertiserId, String startDate, String endDate, List<String> fields, QianchuanReportCreativeGetV10Filtering filtering, QianchuanReportCreativeGetV10TimeGranularity timeGranularity, String orderField, QianchuanReportCreativeGetV10OrderType orderType, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanReportCreativeGetGetValidateBeforeCall(advertiserId, startDate, endDate, fields, filtering, timeGranularity, orderField, orderType, page, pageSize, null);
        Type localVarReturnType = new TypeToken<QianchuanReportCreativeGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05 (required)
     * @param fields  (required)
     * @param filtering  (required)
     * @param timeGranularity  (optional)
     * @param orderField  (optional)
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
    public okhttp3.Call openApiV10QianchuanReportCreativeGetGetAsync(Long advertiserId, String startDate, String endDate, List<String> fields, QianchuanReportCreativeGetV10Filtering filtering, QianchuanReportCreativeGetV10TimeGranularity timeGranularity, String orderField, QianchuanReportCreativeGetV10OrderType orderType, Integer page, Integer pageSize, final ApiCallback<QianchuanReportCreativeGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanReportCreativeGetGetValidateBeforeCall(advertiserId, startDate, endDate, fields, filtering, timeGranularity, orderField, orderType, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<QianchuanReportCreativeGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
