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



import com.bytedance.ads.model.QianchuanEstimateEffectV10BudgetMode;
import com.bytedance.ads.model.QianchuanEstimateEffectV10DeepBidType;
import com.bytedance.ads.model.QianchuanEstimateEffectV10DeepExternalAction;
import com.bytedance.ads.model.QianchuanEstimateEffectV10ExternalAction;
import com.bytedance.ads.model.QianchuanEstimateEffectV10LiveScheduleType;
import com.bytedance.ads.model.QianchuanEstimateEffectV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanEstimateEffectV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanEstimateEffectV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanEstimateEffectV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanEstimateEffectGet
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param externalAction  (required)
     * @param budgetMode  (required)
     * @param budget  (required)
     * @param liveScheduleType  (required)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param scheduleTime  (optional)
     * @param scheduleFixedRange  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanEstimateEffectGetCall(Long advertiserId, Long awemeId, QianchuanEstimateEffectV10ExternalAction externalAction, QianchuanEstimateEffectV10BudgetMode budgetMode, Double budget, QianchuanEstimateEffectV10LiveScheduleType liveScheduleType, QianchuanEstimateEffectV10DeepExternalAction deepExternalAction, QianchuanEstimateEffectV10DeepBidType deepBidType, String startTime, String endTime, String scheduleTime, Long scheduleFixedRange, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/estimate/effect/";

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

        if (externalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_action", externalAction));
        }

        if (deepExternalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deep_external_action", deepExternalAction));
        }

        if (deepBidType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deep_bid_type", deepBidType));
        }

        if (budgetMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("budget_mode", budgetMode));
        }

        if (budget != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("budget", budget));
        }

        if (liveScheduleType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("live_schedule_type", liveScheduleType));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (scheduleTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("schedule_time", scheduleTime));
        }

        if (scheduleFixedRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("schedule_fixed_range", scheduleFixedRange));
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
    private okhttp3.Call openApiV10QianchuanEstimateEffectGetValidateBeforeCall(Long advertiserId, Long awemeId, QianchuanEstimateEffectV10ExternalAction externalAction, QianchuanEstimateEffectV10BudgetMode budgetMode, Double budget, QianchuanEstimateEffectV10LiveScheduleType liveScheduleType, QianchuanEstimateEffectV10DeepExternalAction deepExternalAction, QianchuanEstimateEffectV10DeepBidType deepBidType, String startTime, String endTime, String scheduleTime, Long scheduleFixedRange, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanEstimateEffectGet(Async)");
        }

        // verify the required parameter 'awemeId' is set
        if (awemeId == null) {
            throw new ApiException("Missing the required parameter 'awemeId' when calling openApiV10QianchuanEstimateEffectGet(Async)");
        }

        // verify the required parameter 'externalAction' is set
        if (externalAction == null) {
            throw new ApiException("Missing the required parameter 'externalAction' when calling openApiV10QianchuanEstimateEffectGet(Async)");
        }

        // verify the required parameter 'budgetMode' is set
        if (budgetMode == null) {
            throw new ApiException("Missing the required parameter 'budgetMode' when calling openApiV10QianchuanEstimateEffectGet(Async)");
        }

        // verify the required parameter 'budget' is set
        if (budget == null) {
            throw new ApiException("Missing the required parameter 'budget' when calling openApiV10QianchuanEstimateEffectGet(Async)");
        }

        // verify the required parameter 'liveScheduleType' is set
        if (liveScheduleType == null) {
            throw new ApiException("Missing the required parameter 'liveScheduleType' when calling openApiV10QianchuanEstimateEffectGet(Async)");
        }

        return openApiV10QianchuanEstimateEffectGetCall(advertiserId, awemeId, externalAction, budgetMode, budget, liveScheduleType, deepExternalAction, deepBidType, startTime, endTime, scheduleTime, scheduleFixedRange, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param externalAction  (required)
     * @param budgetMode  (required)
     * @param budget  (required)
     * @param liveScheduleType  (required)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param scheduleTime  (optional)
     * @param scheduleFixedRange  (optional)
     * @return QianchuanEstimateEffectV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanEstimateEffectV10Response openApiV10QianchuanEstimateEffectGet(Long advertiserId, Long awemeId, QianchuanEstimateEffectV10ExternalAction externalAction, QianchuanEstimateEffectV10BudgetMode budgetMode, Double budget, QianchuanEstimateEffectV10LiveScheduleType liveScheduleType, QianchuanEstimateEffectV10DeepExternalAction deepExternalAction, QianchuanEstimateEffectV10DeepBidType deepBidType, String startTime, String endTime, String scheduleTime, Long scheduleFixedRange) throws ApiException {
        ApiResponse<QianchuanEstimateEffectV10Response> localVarResp = openApiV10QianchuanEstimateEffectGetWithHttpInfo(advertiserId, awemeId, externalAction, budgetMode, budget, liveScheduleType, deepExternalAction, deepBidType, startTime, endTime, scheduleTime, scheduleFixedRange);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param externalAction  (required)
     * @param budgetMode  (required)
     * @param budget  (required)
     * @param liveScheduleType  (required)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param scheduleTime  (optional)
     * @param scheduleFixedRange  (optional)
     * @return ApiResponse&lt;QianchuanEstimateEffectV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanEstimateEffectV10Response> openApiV10QianchuanEstimateEffectGetWithHttpInfo(Long advertiserId, Long awemeId, QianchuanEstimateEffectV10ExternalAction externalAction, QianchuanEstimateEffectV10BudgetMode budgetMode, Double budget, QianchuanEstimateEffectV10LiveScheduleType liveScheduleType, QianchuanEstimateEffectV10DeepExternalAction deepExternalAction, QianchuanEstimateEffectV10DeepBidType deepBidType, String startTime, String endTime, String scheduleTime, Long scheduleFixedRange) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanEstimateEffectGetValidateBeforeCall(advertiserId, awemeId, externalAction, budgetMode, budget, liveScheduleType, deepExternalAction, deepBidType, startTime, endTime, scheduleTime, scheduleFixedRange, null);
        Type localVarReturnType = new TypeToken<QianchuanEstimateEffectV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param awemeId  (required)
     * @param externalAction  (required)
     * @param budgetMode  (required)
     * @param budget  (required)
     * @param liveScheduleType  (required)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param scheduleTime  (optional)
     * @param scheduleFixedRange  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanEstimateEffectGetAsync(Long advertiserId, Long awemeId, QianchuanEstimateEffectV10ExternalAction externalAction, QianchuanEstimateEffectV10BudgetMode budgetMode, Double budget, QianchuanEstimateEffectV10LiveScheduleType liveScheduleType, QianchuanEstimateEffectV10DeepExternalAction deepExternalAction, QianchuanEstimateEffectV10DeepBidType deepBidType, String startTime, String endTime, String scheduleTime, Long scheduleFixedRange, final ApiCallback<QianchuanEstimateEffectV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanEstimateEffectGetValidateBeforeCall(advertiserId, awemeId, externalAction, budgetMode, budget, liveScheduleType, deepExternalAction, deepBidType, startTime, endTime, scheduleTime, scheduleFixedRange, _callback);
        Type localVarReturnType = new TypeToken<QianchuanEstimateEffectV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
