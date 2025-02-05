/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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



import com.bytedance.ads.model.QianchuanReportAdMaterialGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportAdMaterialGetV10OrderType;
import com.bytedance.ads.model.QianchuanReportAdMaterialGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanReportAdMaterialGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanReportAdMaterialGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanReportAdMaterialGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanReportAdMaterialGetGet
     * @param advertiserId  (required)
     * @param adId  (required)
     * @param startDate 查询起始日期 格式 yyyy-mm-dd (required)
     * @param endDate 查询结束日期 格式 yyyy-mm-dd (required)
     * @param fields 必填 需要查询的消耗指标 (required)
     * @param filtering  (required)
     * @param orderType 排序方式 (optional)
     * @param orderField 排序字段 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportAdMaterialGetGetCall(Long advertiserId, Long adId, String startDate, String endDate, List<String> fields, QianchuanReportAdMaterialGetV10Filtering filtering, QianchuanReportAdMaterialGetV10OrderType orderType, String orderField, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/report/ad/material/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (adId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_id", adId));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
        }

        if (orderField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_field", orderField));
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
    private okhttp3.Call openApiV10QianchuanReportAdMaterialGetGetValidateBeforeCall(Long advertiserId, Long adId, String startDate, String endDate, List<String> fields, QianchuanReportAdMaterialGetV10Filtering filtering, QianchuanReportAdMaterialGetV10OrderType orderType, String orderField, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanReportAdMaterialGetGet(Async)");
        }

        // verify the required parameter 'adId' is set
        if (adId == null) {
            throw new ApiException("Missing the required parameter 'adId' when calling openApiV10QianchuanReportAdMaterialGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV10QianchuanReportAdMaterialGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV10QianchuanReportAdMaterialGetGet(Async)");
        }

        // verify the required parameter 'fields' is set
        if (fields == null) {
            throw new ApiException("Missing the required parameter 'fields' when calling openApiV10QianchuanReportAdMaterialGetGet(Async)");
        }

        // verify the required parameter 'filtering' is set
        if (filtering == null) {
            throw new ApiException("Missing the required parameter 'filtering' when calling openApiV10QianchuanReportAdMaterialGetGet(Async)");
        }

        return openApiV10QianchuanReportAdMaterialGetGetCall(advertiserId, adId, startDate, endDate, fields, filtering, orderType, orderField, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param adId  (required)
     * @param startDate 查询起始日期 格式 yyyy-mm-dd (required)
     * @param endDate 查询结束日期 格式 yyyy-mm-dd (required)
     * @param fields 必填 需要查询的消耗指标 (required)
     * @param filtering  (required)
     * @param orderType 排序方式 (optional)
     * @param orderField 排序字段 (optional)
     * @return QianchuanReportAdMaterialGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanReportAdMaterialGetV10Response openApiV10QianchuanReportAdMaterialGetGet(Long advertiserId, Long adId, String startDate, String endDate, List<String> fields, QianchuanReportAdMaterialGetV10Filtering filtering, QianchuanReportAdMaterialGetV10OrderType orderType, String orderField) throws ApiException {
        ApiResponse<QianchuanReportAdMaterialGetV10Response> localVarResp = openApiV10QianchuanReportAdMaterialGetGetWithHttpInfo(advertiserId, adId, startDate, endDate, fields, filtering, orderType, orderField);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param adId  (required)
     * @param startDate 查询起始日期 格式 yyyy-mm-dd (required)
     * @param endDate 查询结束日期 格式 yyyy-mm-dd (required)
     * @param fields 必填 需要查询的消耗指标 (required)
     * @param filtering  (required)
     * @param orderType 排序方式 (optional)
     * @param orderField 排序字段 (optional)
     * @return ApiResponse&lt;QianchuanReportAdMaterialGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanReportAdMaterialGetV10Response> openApiV10QianchuanReportAdMaterialGetGetWithHttpInfo(Long advertiserId, Long adId, String startDate, String endDate, List<String> fields, QianchuanReportAdMaterialGetV10Filtering filtering, QianchuanReportAdMaterialGetV10OrderType orderType, String orderField) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanReportAdMaterialGetGetValidateBeforeCall(advertiserId, adId, startDate, endDate, fields, filtering, orderType, orderField, null);
        Type localVarReturnType = new TypeToken<QianchuanReportAdMaterialGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param adId  (required)
     * @param startDate 查询起始日期 格式 yyyy-mm-dd (required)
     * @param endDate 查询结束日期 格式 yyyy-mm-dd (required)
     * @param fields 必填 需要查询的消耗指标 (required)
     * @param filtering  (required)
     * @param orderType 排序方式 (optional)
     * @param orderField 排序字段 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportAdMaterialGetGetAsync(Long advertiserId, Long adId, String startDate, String endDate, List<String> fields, QianchuanReportAdMaterialGetV10Filtering filtering, QianchuanReportAdMaterialGetV10OrderType orderType, String orderField, final ApiCallback<QianchuanReportAdMaterialGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanReportAdMaterialGetGetValidateBeforeCall(advertiserId, adId, startDate, endDate, fields, filtering, orderType, orderField, _callback);
        Type localVarReturnType = new TypeToken<QianchuanReportAdMaterialGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
