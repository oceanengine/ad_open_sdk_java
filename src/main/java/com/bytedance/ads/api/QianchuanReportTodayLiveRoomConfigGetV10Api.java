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



import com.bytedance.ads.model.QianchuanReportTodayLiveRoomConfigGetV10DataTopics;
import com.bytedance.ads.model.QianchuanReportTodayLiveRoomConfigGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanReportTodayLiveRoomConfigGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanReportTodayLiveRoomConfigGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanReportTodayLiveRoomConfigGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanReportTodayLiveRoomConfigGetGet
     * @param advertiserId  (required)
     * @param dataTopics  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportTodayLiveRoomConfigGetGetCall(Long advertiserId, List<QianchuanReportTodayLiveRoomConfigGetV10DataTopics> dataTopics, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/report/today_live/room/config/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (dataTopics != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "data_topics", dataTopics));
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
    private okhttp3.Call openApiV10QianchuanReportTodayLiveRoomConfigGetGetValidateBeforeCall(Long advertiserId, List<QianchuanReportTodayLiveRoomConfigGetV10DataTopics> dataTopics, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanReportTodayLiveRoomConfigGetGet(Async)");
        }

        // verify the required parameter 'dataTopics' is set
        if (dataTopics == null) {
            throw new ApiException("Missing the required parameter 'dataTopics' when calling openApiV10QianchuanReportTodayLiveRoomConfigGetGet(Async)");
        }

        return openApiV10QianchuanReportTodayLiveRoomConfigGetGetCall(advertiserId, dataTopics, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param dataTopics  (required)
     * @return QianchuanReportTodayLiveRoomConfigGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanReportTodayLiveRoomConfigGetV10Response openApiV10QianchuanReportTodayLiveRoomConfigGetGet(Long advertiserId, List<QianchuanReportTodayLiveRoomConfigGetV10DataTopics> dataTopics) throws ApiException {
        ApiResponse<QianchuanReportTodayLiveRoomConfigGetV10Response> localVarResp = openApiV10QianchuanReportTodayLiveRoomConfigGetGetWithHttpInfo(advertiserId, dataTopics);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param dataTopics  (required)
     * @return ApiResponse&lt;QianchuanReportTodayLiveRoomConfigGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanReportTodayLiveRoomConfigGetV10Response> openApiV10QianchuanReportTodayLiveRoomConfigGetGetWithHttpInfo(Long advertiserId, List<QianchuanReportTodayLiveRoomConfigGetV10DataTopics> dataTopics) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanReportTodayLiveRoomConfigGetGetValidateBeforeCall(advertiserId, dataTopics, null);
        Type localVarReturnType = new TypeToken<QianchuanReportTodayLiveRoomConfigGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param dataTopics  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportTodayLiveRoomConfigGetGetAsync(Long advertiserId, List<QianchuanReportTodayLiveRoomConfigGetV10DataTopics> dataTopics, final ApiCallback<QianchuanReportTodayLiveRoomConfigGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanReportTodayLiveRoomConfigGetGetValidateBeforeCall(advertiserId, dataTopics, _callback);
        Type localVarReturnType = new TypeToken<QianchuanReportTodayLiveRoomConfigGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
