/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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



import com.bytedance.ads.model.QianchuanReportLiveGetV10Response;
import com.bytedance.ads.model.QianchuanReportLiveGetV10StatsAuthority;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanReportLiveGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanReportLiveGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanReportLiveGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanReportLiveGetGet
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param fields  (required)
     * @param statsAuthority  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportLiveGetGetCall(Long advertiserId, Long awemeId, String startTime, String endTime, List<String> fields, QianchuanReportLiveGetV10StatsAuthority statsAuthority, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/report/live/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (awemeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_id", awemeId));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
        }

        if (statsAuthority != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("stats_authority", statsAuthority));
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
    private okhttp3.Call openApiV10QianchuanReportLiveGetGetValidateBeforeCall(Long advertiserId, Long awemeId, String startTime, String endTime, List<String> fields, QianchuanReportLiveGetV10StatsAuthority statsAuthority, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanReportLiveGetGet(Async)");
        }

        // verify the required parameter 'awemeId' is set
        if (awemeId == null) {
            throw new ApiException("Missing the required parameter 'awemeId' when calling openApiV10QianchuanReportLiveGetGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApiV10QianchuanReportLiveGetGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApiV10QianchuanReportLiveGetGet(Async)");
        }

        // verify the required parameter 'fields' is set
        if (fields == null) {
            throw new ApiException("Missing the required parameter 'fields' when calling openApiV10QianchuanReportLiveGetGet(Async)");
        }

        return openApiV10QianchuanReportLiveGetGetCall(advertiserId, awemeId, startTime, endTime, fields, statsAuthority, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param fields  (required)
     * @param statsAuthority  (optional)
     * @return QianchuanReportLiveGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanReportLiveGetV10Response openApiV10QianchuanReportLiveGetGet(Long advertiserId, Long awemeId, String startTime, String endTime, List<String> fields, QianchuanReportLiveGetV10StatsAuthority statsAuthority) throws ApiException {
        ApiResponse<QianchuanReportLiveGetV10Response> localVarResp = openApiV10QianchuanReportLiveGetGetWithHttpInfo(advertiserId, awemeId, startTime, endTime, fields, statsAuthority);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param fields  (required)
     * @param statsAuthority  (optional)
     * @return ApiResponse&lt;QianchuanReportLiveGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanReportLiveGetV10Response> openApiV10QianchuanReportLiveGetGetWithHttpInfo(Long advertiserId, Long awemeId, String startTime, String endTime, List<String> fields, QianchuanReportLiveGetV10StatsAuthority statsAuthority) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanReportLiveGetGetValidateBeforeCall(advertiserId, awemeId, startTime, endTime, fields, statsAuthority, null);
        Type localVarReturnType = new TypeToken<QianchuanReportLiveGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param fields  (required)
     * @param statsAuthority  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportLiveGetGetAsync(Long advertiserId, Long awemeId, String startTime, String endTime, List<String> fields, QianchuanReportLiveGetV10StatsAuthority statsAuthority, final ApiCallback<QianchuanReportLiveGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanReportLiveGetGetValidateBeforeCall(advertiserId, awemeId, startTime, endTime, fields, statsAuthority, _callback);
        Type localVarReturnType = new TypeToken<QianchuanReportLiveGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
