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



import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostReportGetV10OrderType;
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostReportGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanToolsSmartBoostAdBoostReportGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanToolsSmartBoostAdBoostReportGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanToolsSmartBoostAdBoostReportGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet
     * @param advertiserId 千川广告主账户ID (required)
     * @param adId 广告计划ID (required)
     * @param adRaiseVersion 起量版本号，通过【获取起量版本信息】接口获取 (required)
     * @param startTime 当前起量版本起量开始时间，格式：2021-03-31 16:00:00，通过【获取起量版本信息】接口获取 (required)
     * @param endTime 当前起量版本起量结束时间，格式：2021-03-31 17:00:00，结束时间必须大于开始时间，通过【获取起量版本信息】接口获取 (required)
     * @param page 页码，默认值：1 (required)
     * @param pageSize 页面大小，允许值：10, 20, 50, 100，默认值：10 (required)
     * @param timeGranularity 时间粒度，如果不传，返回查询日期内的聚合数据 允许值: 1、STAT_TIME_GRANULARITY_HOURLY 获取分小时数据 (optional)
     * @param filed 指定需要的指标名称，可参考应答参数返回的消耗指标字段，默认stat_cost，允许值：stat_cost,ctr,convert_cnt,convert_rate,prepay_and_pay_order_roi,show_cnt,click_cnt,pay_order_amount_gmv (optional)
     * @param orderField 排序字段，默认不传为stat_time_hour，允许值：stat_cost,ctr,convert_cnt,convert_rate,prepay_and_pay_order_roi,show_cnt,click_cnt,pay_order_amount_gmv,stat_time_hour (optional)
     * @param orderType 排序方式 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanToolsSmartBoostAdBoostReportGetGetCall(Long advertiserId, Long adId, Long adRaiseVersion, String startTime, String endTime, Integer page, Integer pageSize, String timeGranularity, List<String> filed, String orderField, QianchuanToolsSmartBoostAdBoostReportGetV10OrderType orderType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/report/get/";

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

        if (adRaiseVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_raise_version", adRaiseVersion));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (timeGranularity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_granularity", timeGranularity));
        }

        if (filed != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "filed", filed));
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
    private okhttp3.Call openApiV10QianchuanToolsSmartBoostAdBoostReportGetGetValidateBeforeCall(Long advertiserId, Long adId, Long adRaiseVersion, String startTime, String endTime, Integer page, Integer pageSize, String timeGranularity, List<String> filed, String orderField, QianchuanToolsSmartBoostAdBoostReportGetV10OrderType orderType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet(Async)");
        }

        // verify the required parameter 'adId' is set
        if (adId == null) {
            throw new ApiException("Missing the required parameter 'adId' when calling openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet(Async)");
        }

        // verify the required parameter 'adRaiseVersion' is set
        if (adRaiseVersion == null) {
            throw new ApiException("Missing the required parameter 'adRaiseVersion' when calling openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet(Async)");
        }

        return openApiV10QianchuanToolsSmartBoostAdBoostReportGetGetCall(advertiserId, adId, adRaiseVersion, startTime, endTime, page, pageSize, timeGranularity, filed, orderField, orderType, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 千川广告主账户ID (required)
     * @param adId 广告计划ID (required)
     * @param adRaiseVersion 起量版本号，通过【获取起量版本信息】接口获取 (required)
     * @param startTime 当前起量版本起量开始时间，格式：2021-03-31 16:00:00，通过【获取起量版本信息】接口获取 (required)
     * @param endTime 当前起量版本起量结束时间，格式：2021-03-31 17:00:00，结束时间必须大于开始时间，通过【获取起量版本信息】接口获取 (required)
     * @param page 页码，默认值：1 (required)
     * @param pageSize 页面大小，允许值：10, 20, 50, 100，默认值：10 (required)
     * @param timeGranularity 时间粒度，如果不传，返回查询日期内的聚合数据 允许值: 1、STAT_TIME_GRANULARITY_HOURLY 获取分小时数据 (optional)
     * @param filed 指定需要的指标名称，可参考应答参数返回的消耗指标字段，默认stat_cost，允许值：stat_cost,ctr,convert_cnt,convert_rate,prepay_and_pay_order_roi,show_cnt,click_cnt,pay_order_amount_gmv (optional)
     * @param orderField 排序字段，默认不传为stat_time_hour，允许值：stat_cost,ctr,convert_cnt,convert_rate,prepay_and_pay_order_roi,show_cnt,click_cnt,pay_order_amount_gmv,stat_time_hour (optional)
     * @param orderType 排序方式 (optional)
     * @return QianchuanToolsSmartBoostAdBoostReportGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanToolsSmartBoostAdBoostReportGetV10Response openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet(Long advertiserId, Long adId, Long adRaiseVersion, String startTime, String endTime, Integer page, Integer pageSize, String timeGranularity, List<String> filed, String orderField, QianchuanToolsSmartBoostAdBoostReportGetV10OrderType orderType) throws ApiException {
        ApiResponse<QianchuanToolsSmartBoostAdBoostReportGetV10Response> localVarResp = openApiV10QianchuanToolsSmartBoostAdBoostReportGetGetWithHttpInfo(advertiserId, adId, adRaiseVersion, startTime, endTime, page, pageSize, timeGranularity, filed, orderField, orderType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 千川广告主账户ID (required)
     * @param adId 广告计划ID (required)
     * @param adRaiseVersion 起量版本号，通过【获取起量版本信息】接口获取 (required)
     * @param startTime 当前起量版本起量开始时间，格式：2021-03-31 16:00:00，通过【获取起量版本信息】接口获取 (required)
     * @param endTime 当前起量版本起量结束时间，格式：2021-03-31 17:00:00，结束时间必须大于开始时间，通过【获取起量版本信息】接口获取 (required)
     * @param page 页码，默认值：1 (required)
     * @param pageSize 页面大小，允许值：10, 20, 50, 100，默认值：10 (required)
     * @param timeGranularity 时间粒度，如果不传，返回查询日期内的聚合数据 允许值: 1、STAT_TIME_GRANULARITY_HOURLY 获取分小时数据 (optional)
     * @param filed 指定需要的指标名称，可参考应答参数返回的消耗指标字段，默认stat_cost，允许值：stat_cost,ctr,convert_cnt,convert_rate,prepay_and_pay_order_roi,show_cnt,click_cnt,pay_order_amount_gmv (optional)
     * @param orderField 排序字段，默认不传为stat_time_hour，允许值：stat_cost,ctr,convert_cnt,convert_rate,prepay_and_pay_order_roi,show_cnt,click_cnt,pay_order_amount_gmv,stat_time_hour (optional)
     * @param orderType 排序方式 (optional)
     * @return ApiResponse&lt;QianchuanToolsSmartBoostAdBoostReportGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanToolsSmartBoostAdBoostReportGetV10Response> openApiV10QianchuanToolsSmartBoostAdBoostReportGetGetWithHttpInfo(Long advertiserId, Long adId, Long adRaiseVersion, String startTime, String endTime, Integer page, Integer pageSize, String timeGranularity, List<String> filed, String orderField, QianchuanToolsSmartBoostAdBoostReportGetV10OrderType orderType) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanToolsSmartBoostAdBoostReportGetGetValidateBeforeCall(advertiserId, adId, adRaiseVersion, startTime, endTime, page, pageSize, timeGranularity, filed, orderField, orderType, null);
        Type localVarReturnType = new TypeToken<QianchuanToolsSmartBoostAdBoostReportGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 千川广告主账户ID (required)
     * @param adId 广告计划ID (required)
     * @param adRaiseVersion 起量版本号，通过【获取起量版本信息】接口获取 (required)
     * @param startTime 当前起量版本起量开始时间，格式：2021-03-31 16:00:00，通过【获取起量版本信息】接口获取 (required)
     * @param endTime 当前起量版本起量结束时间，格式：2021-03-31 17:00:00，结束时间必须大于开始时间，通过【获取起量版本信息】接口获取 (required)
     * @param page 页码，默认值：1 (required)
     * @param pageSize 页面大小，允许值：10, 20, 50, 100，默认值：10 (required)
     * @param timeGranularity 时间粒度，如果不传，返回查询日期内的聚合数据 允许值: 1、STAT_TIME_GRANULARITY_HOURLY 获取分小时数据 (optional)
     * @param filed 指定需要的指标名称，可参考应答参数返回的消耗指标字段，默认stat_cost，允许值：stat_cost,ctr,convert_cnt,convert_rate,prepay_and_pay_order_roi,show_cnt,click_cnt,pay_order_amount_gmv (optional)
     * @param orderField 排序字段，默认不传为stat_time_hour，允许值：stat_cost,ctr,convert_cnt,convert_rate,prepay_and_pay_order_roi,show_cnt,click_cnt,pay_order_amount_gmv,stat_time_hour (optional)
     * @param orderType 排序方式 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanToolsSmartBoostAdBoostReportGetGetAsync(Long advertiserId, Long adId, Long adRaiseVersion, String startTime, String endTime, Integer page, Integer pageSize, String timeGranularity, List<String> filed, String orderField, QianchuanToolsSmartBoostAdBoostReportGetV10OrderType orderType, final ApiCallback<QianchuanToolsSmartBoostAdBoostReportGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanToolsSmartBoostAdBoostReportGetGetValidateBeforeCall(advertiserId, adId, adRaiseVersion, startTime, endTime, page, pageSize, timeGranularity, filed, orderField, orderType, _callback);
        Type localVarReturnType = new TypeToken<QianchuanToolsSmartBoostAdBoostReportGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
