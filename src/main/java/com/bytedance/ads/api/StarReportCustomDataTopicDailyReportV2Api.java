/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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



import com.bytedance.ads.model.StarReportCustomDataTopicDailyReportV2Response;
import com.bytedance.ads.model.StarReportCustomDataTopicDailyReportV2Topics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarReportCustomDataTopicDailyReportV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarReportCustomDataTopicDailyReportV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarReportCustomDataTopicDailyReportV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarReportCustomDataTopicDailyReportGet
     * @param starId 发起请求的客户的starId (required)
     * @param workId 交付作品Id：如视频Id、直播间room_id. (required)
     * @param demandId 任务id (required)
     * @param topics 数据主题: BASIC_DATA：基础信息、 FLOW_DATA：流量表现、 CONVERT_DATA：转化表现、 SEARCH_DATA：搜索表现、 RECOMMEND_DATA： 种草表现 (required)
     * @param startTime 起始时间: yyyy-MM-dd (required)
     * @param endTime 结束时间: yyyy-MM-dd (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarReportCustomDataTopicDailyReportGetCall(Long starId, Long workId, Long demandId, List<StarReportCustomDataTopicDailyReportV2Topics> topics, String startTime, String endTime, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/report/custom_data_topic_daily_report/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (workId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("work_id", workId));
        }

        if (demandId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("demand_id", demandId));
        }

        if (topics != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "topics", topics));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
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
    private okhttp3.Call openApi2StarReportCustomDataTopicDailyReportGetValidateBeforeCall(Long starId, Long workId, Long demandId, List<StarReportCustomDataTopicDailyReportV2Topics> topics, String startTime, String endTime, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarReportCustomDataTopicDailyReportGet(Async)");
        }

        // verify the required parameter 'workId' is set
        if (workId == null) {
            throw new ApiException("Missing the required parameter 'workId' when calling openApi2StarReportCustomDataTopicDailyReportGet(Async)");
        }

        // verify the required parameter 'demandId' is set
        if (demandId == null) {
            throw new ApiException("Missing the required parameter 'demandId' when calling openApi2StarReportCustomDataTopicDailyReportGet(Async)");
        }

        // verify the required parameter 'topics' is set
        if (topics == null) {
            throw new ApiException("Missing the required parameter 'topics' when calling openApi2StarReportCustomDataTopicDailyReportGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApi2StarReportCustomDataTopicDailyReportGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApi2StarReportCustomDataTopicDailyReportGet(Async)");
        }

        return openApi2StarReportCustomDataTopicDailyReportGetCall(starId, workId, demandId, topics, startTime, endTime, _callback);

    }

    /**
     * 
     * 
     * @param starId 发起请求的客户的starId (required)
     * @param workId 交付作品Id：如视频Id、直播间room_id. (required)
     * @param demandId 任务id (required)
     * @param topics 数据主题: BASIC_DATA：基础信息、 FLOW_DATA：流量表现、 CONVERT_DATA：转化表现、 SEARCH_DATA：搜索表现、 RECOMMEND_DATA： 种草表现 (required)
     * @param startTime 起始时间: yyyy-MM-dd (required)
     * @param endTime 结束时间: yyyy-MM-dd (required)
     * @return StarReportCustomDataTopicDailyReportV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarReportCustomDataTopicDailyReportV2Response openApi2StarReportCustomDataTopicDailyReportGet(Long starId, Long workId, Long demandId, List<StarReportCustomDataTopicDailyReportV2Topics> topics, String startTime, String endTime) throws ApiException {
        ApiResponse<StarReportCustomDataTopicDailyReportV2Response> localVarResp = openApi2StarReportCustomDataTopicDailyReportGetWithHttpInfo(starId, workId, demandId, topics, startTime, endTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId 发起请求的客户的starId (required)
     * @param workId 交付作品Id：如视频Id、直播间room_id. (required)
     * @param demandId 任务id (required)
     * @param topics 数据主题: BASIC_DATA：基础信息、 FLOW_DATA：流量表现、 CONVERT_DATA：转化表现、 SEARCH_DATA：搜索表现、 RECOMMEND_DATA： 种草表现 (required)
     * @param startTime 起始时间: yyyy-MM-dd (required)
     * @param endTime 结束时间: yyyy-MM-dd (required)
     * @return ApiResponse&lt;StarReportCustomDataTopicDailyReportV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarReportCustomDataTopicDailyReportV2Response> openApi2StarReportCustomDataTopicDailyReportGetWithHttpInfo(Long starId, Long workId, Long demandId, List<StarReportCustomDataTopicDailyReportV2Topics> topics, String startTime, String endTime) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarReportCustomDataTopicDailyReportGetValidateBeforeCall(starId, workId, demandId, topics, startTime, endTime, null);
        Type localVarReturnType = new TypeToken<StarReportCustomDataTopicDailyReportV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId 发起请求的客户的starId (required)
     * @param workId 交付作品Id：如视频Id、直播间room_id. (required)
     * @param demandId 任务id (required)
     * @param topics 数据主题: BASIC_DATA：基础信息、 FLOW_DATA：流量表现、 CONVERT_DATA：转化表现、 SEARCH_DATA：搜索表现、 RECOMMEND_DATA： 种草表现 (required)
     * @param startTime 起始时间: yyyy-MM-dd (required)
     * @param endTime 结束时间: yyyy-MM-dd (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarReportCustomDataTopicDailyReportGetAsync(Long starId, Long workId, Long demandId, List<StarReportCustomDataTopicDailyReportV2Topics> topics, String startTime, String endTime, final ApiCallback<StarReportCustomDataTopicDailyReportV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarReportCustomDataTopicDailyReportGetValidateBeforeCall(starId, workId, demandId, topics, startTime, endTime, _callback);
        Type localVarReturnType = new TypeToken<StarReportCustomDataTopicDailyReportV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
