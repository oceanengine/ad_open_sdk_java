/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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



import com.bytedance.ads.model.QianchuanTodayLiveRoomGetV10AdStatus;
import com.bytedance.ads.model.QianchuanTodayLiveRoomGetV10Response;
import com.bytedance.ads.model.QianchuanTodayLiveRoomGetV10RoomStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanTodayLiveRoomGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanTodayLiveRoomGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanTodayLiveRoomGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanTodayLiveRoomGetGet
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param dateTime 开播日期，格式 2021-04-05  (required)
     * @param fields  (required)
     * @param roomStatus  (optional)
     * @param adStatus  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanTodayLiveRoomGetGetCall(Long advertiserId, Long awemeId, String dateTime, List<String> fields, QianchuanTodayLiveRoomGetV10RoomStatus roomStatus, QianchuanTodayLiveRoomGetV10AdStatus adStatus, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/today_live/room/get/";

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

        if (dateTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_time", dateTime));
        }

        if (roomStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("room_status", roomStatus));
        }

        if (adStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_status", adStatus));
        }

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
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
    private okhttp3.Call openApiV10QianchuanTodayLiveRoomGetGetValidateBeforeCall(Long advertiserId, Long awemeId, String dateTime, List<String> fields, QianchuanTodayLiveRoomGetV10RoomStatus roomStatus, QianchuanTodayLiveRoomGetV10AdStatus adStatus, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanTodayLiveRoomGetGet(Async)");
        }

        // verify the required parameter 'awemeId' is set
        if (awemeId == null) {
            throw new ApiException("Missing the required parameter 'awemeId' when calling openApiV10QianchuanTodayLiveRoomGetGet(Async)");
        }

        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new ApiException("Missing the required parameter 'dateTime' when calling openApiV10QianchuanTodayLiveRoomGetGet(Async)");
        }

        // verify the required parameter 'fields' is set
        if (fields == null) {
            throw new ApiException("Missing the required parameter 'fields' when calling openApiV10QianchuanTodayLiveRoomGetGet(Async)");
        }

        return openApiV10QianchuanTodayLiveRoomGetGetCall(advertiserId, awemeId, dateTime, fields, roomStatus, adStatus, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param dateTime 开播日期，格式 2021-04-05  (required)
     * @param fields  (required)
     * @param roomStatus  (optional)
     * @param adStatus  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @return QianchuanTodayLiveRoomGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanTodayLiveRoomGetV10Response openApiV10QianchuanTodayLiveRoomGetGet(Long advertiserId, Long awemeId, String dateTime, List<String> fields, QianchuanTodayLiveRoomGetV10RoomStatus roomStatus, QianchuanTodayLiveRoomGetV10AdStatus adStatus, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<QianchuanTodayLiveRoomGetV10Response> localVarResp = openApiV10QianchuanTodayLiveRoomGetGetWithHttpInfo(advertiserId, awemeId, dateTime, fields, roomStatus, adStatus, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param dateTime 开播日期，格式 2021-04-05  (required)
     * @param fields  (required)
     * @param roomStatus  (optional)
     * @param adStatus  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @return ApiResponse&lt;QianchuanTodayLiveRoomGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanTodayLiveRoomGetV10Response> openApiV10QianchuanTodayLiveRoomGetGetWithHttpInfo(Long advertiserId, Long awemeId, String dateTime, List<String> fields, QianchuanTodayLiveRoomGetV10RoomStatus roomStatus, QianchuanTodayLiveRoomGetV10AdStatus adStatus, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanTodayLiveRoomGetGetValidateBeforeCall(advertiserId, awemeId, dateTime, fields, roomStatus, adStatus, page, pageSize, null);
        Type localVarReturnType = new TypeToken<QianchuanTodayLiveRoomGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param dateTime 开播日期，格式 2021-04-05  (required)
     * @param fields  (required)
     * @param roomStatus  (optional)
     * @param adStatus  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanTodayLiveRoomGetGetAsync(Long advertiserId, Long awemeId, String dateTime, List<String> fields, QianchuanTodayLiveRoomGetV10RoomStatus roomStatus, QianchuanTodayLiveRoomGetV10AdStatus adStatus, Integer page, Integer pageSize, final ApiCallback<QianchuanTodayLiveRoomGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanTodayLiveRoomGetGetValidateBeforeCall(advertiserId, awemeId, dateTime, fields, roomStatus, adStatus, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<QianchuanTodayLiveRoomGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
