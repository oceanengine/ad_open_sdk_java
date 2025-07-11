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



import com.bytedance.ads.model.ReportCustomGetV30DataTopic;
import com.bytedance.ads.model.ReportCustomGetV30FiltersInner;
import com.bytedance.ads.model.ReportCustomGetV30OrderByInner;
import com.bytedance.ads.model.ReportCustomGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportCustomGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportCustomGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportCustomGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ReportCustomGetGet
     * @param dimensions 维度列表 (required)
     * @param advertiserId 广告主id (required)
     * @param metrics 指标列表 (required)
     * @param filters 过滤条件 (required)
     * @param startTime 开始时间。单位毫秒 (required)
     * @param endTime 结束时间。单位毫秒 (required)
     * @param orderBy 排序 (required)
     * @param page 页码。默认为1 (optional, default to 1)
     * @param pageSize 页面大小。默认为10，最大100 (optional, default to 10)
     * @param dataTopic 数据 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportCustomGetGetCall(List<String> dimensions, Long advertiserId, List<String> metrics, List<ReportCustomGetV30FiltersInner> filters, String startTime, String endTime, List<ReportCustomGetV30OrderByInner> orderBy, Integer page, Integer pageSize, ReportCustomGetV30DataTopic dataTopic, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/report/custom/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dimensions != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "dimensions", dimensions));
        }

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (metrics != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "metrics", metrics));
        }

        if (filters != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filters", filters));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (orderBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "order_by", orderBy));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (dataTopic != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("data_topic", dataTopic));
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
    private okhttp3.Call openApiV30ReportCustomGetGetValidateBeforeCall(List<String> dimensions, Long advertiserId, List<String> metrics, List<ReportCustomGetV30FiltersInner> filters, String startTime, String endTime, List<ReportCustomGetV30OrderByInner> orderBy, Integer page, Integer pageSize, ReportCustomGetV30DataTopic dataTopic, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'dimensions' is set
        if (dimensions == null) {
            throw new ApiException("Missing the required parameter 'dimensions' when calling openApiV30ReportCustomGetGet(Async)");
        }

        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ReportCustomGetGet(Async)");
        }

        // verify the required parameter 'metrics' is set
        if (metrics == null) {
            throw new ApiException("Missing the required parameter 'metrics' when calling openApiV30ReportCustomGetGet(Async)");
        }

        // verify the required parameter 'filters' is set
        if (filters == null) {
            throw new ApiException("Missing the required parameter 'filters' when calling openApiV30ReportCustomGetGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApiV30ReportCustomGetGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApiV30ReportCustomGetGet(Async)");
        }

        // verify the required parameter 'orderBy' is set
        if (orderBy == null) {
            throw new ApiException("Missing the required parameter 'orderBy' when calling openApiV30ReportCustomGetGet(Async)");
        }

        return openApiV30ReportCustomGetGetCall(dimensions, advertiserId, metrics, filters, startTime, endTime, orderBy, page, pageSize, dataTopic, _callback);

    }

    /**
     * 
     * 
     * @param dimensions 维度列表 (required)
     * @param advertiserId 广告主id (required)
     * @param metrics 指标列表 (required)
     * @param filters 过滤条件 (required)
     * @param startTime 开始时间。单位毫秒 (required)
     * @param endTime 结束时间。单位毫秒 (required)
     * @param orderBy 排序 (required)
     * @param page 页码。默认为1 (optional, default to 1)
     * @param pageSize 页面大小。默认为10，最大100 (optional, default to 10)
     * @param dataTopic 数据 (optional)
     * @return ReportCustomGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportCustomGetV30Response openApiV30ReportCustomGetGet(List<String> dimensions, Long advertiserId, List<String> metrics, List<ReportCustomGetV30FiltersInner> filters, String startTime, String endTime, List<ReportCustomGetV30OrderByInner> orderBy, Integer page, Integer pageSize, ReportCustomGetV30DataTopic dataTopic) throws ApiException {
        ApiResponse<ReportCustomGetV30Response> localVarResp = openApiV30ReportCustomGetGetWithHttpInfo(dimensions, advertiserId, metrics, filters, startTime, endTime, orderBy, page, pageSize, dataTopic);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param dimensions 维度列表 (required)
     * @param advertiserId 广告主id (required)
     * @param metrics 指标列表 (required)
     * @param filters 过滤条件 (required)
     * @param startTime 开始时间。单位毫秒 (required)
     * @param endTime 结束时间。单位毫秒 (required)
     * @param orderBy 排序 (required)
     * @param page 页码。默认为1 (optional, default to 1)
     * @param pageSize 页面大小。默认为10，最大100 (optional, default to 10)
     * @param dataTopic 数据 (optional)
     * @return ApiResponse&lt;ReportCustomGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportCustomGetV30Response> openApiV30ReportCustomGetGetWithHttpInfo(List<String> dimensions, Long advertiserId, List<String> metrics, List<ReportCustomGetV30FiltersInner> filters, String startTime, String endTime, List<ReportCustomGetV30OrderByInner> orderBy, Integer page, Integer pageSize, ReportCustomGetV30DataTopic dataTopic) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ReportCustomGetGetValidateBeforeCall(dimensions, advertiserId, metrics, filters, startTime, endTime, orderBy, page, pageSize, dataTopic, null);
        Type localVarReturnType = new TypeToken<ReportCustomGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param dimensions 维度列表 (required)
     * @param advertiserId 广告主id (required)
     * @param metrics 指标列表 (required)
     * @param filters 过滤条件 (required)
     * @param startTime 开始时间。单位毫秒 (required)
     * @param endTime 结束时间。单位毫秒 (required)
     * @param orderBy 排序 (required)
     * @param page 页码。默认为1 (optional, default to 1)
     * @param pageSize 页面大小。默认为10，最大100 (optional, default to 10)
     * @param dataTopic 数据 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportCustomGetGetAsync(List<String> dimensions, Long advertiserId, List<String> metrics, List<ReportCustomGetV30FiltersInner> filters, String startTime, String endTime, List<ReportCustomGetV30OrderByInner> orderBy, Integer page, Integer pageSize, ReportCustomGetV30DataTopic dataTopic, final ApiCallback<ReportCustomGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ReportCustomGetGetValidateBeforeCall(dimensions, advertiserId, metrics, filters, startTime, endTime, orderBy, page, pageSize, dataTopic, _callback);
        Type localVarReturnType = new TypeToken<ReportCustomGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
