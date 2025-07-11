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



import com.bytedance.ads.model.ReportRtaGetV2OrderField;
import com.bytedance.ads.model.ReportRtaGetV2OrderType;
import com.bytedance.ads.model.ReportRtaGetV2ReportType;
import com.bytedance.ads.model.ReportRtaGetV2Response;
import com.bytedance.ads.model.ReportRtaGetV2TimeGranularity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportRtaGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportRtaGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportRtaGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ReportRtaGetGet
     * @param advertiserId  (optional)
     * @param endDate  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param reportType  (optional)
     * @param startDate  (optional)
     * @param timeGranularity  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportRtaGetGetCall(Long advertiserId, String endDate, ReportRtaGetV2OrderField orderField, ReportRtaGetV2OrderType orderType, Long page, Long pageSize, ReportRtaGetV2ReportType reportType, String startDate, ReportRtaGetV2TimeGranularity timeGranularity, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/report/rta/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
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

        if (reportType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("report_type", reportType));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (timeGranularity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_granularity", timeGranularity));
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
    private okhttp3.Call openApi2ReportRtaGetGetValidateBeforeCall(Long advertiserId, String endDate, ReportRtaGetV2OrderField orderField, ReportRtaGetV2OrderType orderType, Long page, Long pageSize, ReportRtaGetV2ReportType reportType, String startDate, ReportRtaGetV2TimeGranularity timeGranularity, final ApiCallback _callback) throws ApiException {
        return openApi2ReportRtaGetGetCall(advertiserId, endDate, orderField, orderType, page, pageSize, reportType, startDate, timeGranularity, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param endDate  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param reportType  (optional)
     * @param startDate  (optional)
     * @param timeGranularity  (optional)
     * @return ReportRtaGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportRtaGetV2Response openApi2ReportRtaGetGet(Long advertiserId, String endDate, ReportRtaGetV2OrderField orderField, ReportRtaGetV2OrderType orderType, Long page, Long pageSize, ReportRtaGetV2ReportType reportType, String startDate, ReportRtaGetV2TimeGranularity timeGranularity) throws ApiException {
        ApiResponse<ReportRtaGetV2Response> localVarResp = openApi2ReportRtaGetGetWithHttpInfo(advertiserId, endDate, orderField, orderType, page, pageSize, reportType, startDate, timeGranularity);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param endDate  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param reportType  (optional)
     * @param startDate  (optional)
     * @param timeGranularity  (optional)
     * @return ApiResponse&lt;ReportRtaGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportRtaGetV2Response> openApi2ReportRtaGetGetWithHttpInfo(Long advertiserId, String endDate, ReportRtaGetV2OrderField orderField, ReportRtaGetV2OrderType orderType, Long page, Long pageSize, ReportRtaGetV2ReportType reportType, String startDate, ReportRtaGetV2TimeGranularity timeGranularity) throws ApiException {
        okhttp3.Call localVarCall = openApi2ReportRtaGetGetValidateBeforeCall(advertiserId, endDate, orderField, orderType, page, pageSize, reportType, startDate, timeGranularity, null);
        Type localVarReturnType = new TypeToken<ReportRtaGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (optional)
     * @param endDate  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param reportType  (optional)
     * @param startDate  (optional)
     * @param timeGranularity  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportRtaGetGetAsync(Long advertiserId, String endDate, ReportRtaGetV2OrderField orderField, ReportRtaGetV2OrderType orderType, Long page, Long pageSize, ReportRtaGetV2ReportType reportType, String startDate, ReportRtaGetV2TimeGranularity timeGranularity, final ApiCallback<ReportRtaGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ReportRtaGetGetValidateBeforeCall(advertiserId, endDate, orderField, orderType, page, pageSize, reportType, startDate, timeGranularity, _callback);
        Type localVarReturnType = new TypeToken<ReportRtaGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
