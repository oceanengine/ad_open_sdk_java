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



import com.bytedance.ads.model.BrandAdGetV30AdForm;
import com.bytedance.ads.model.BrandAdGetV30AdStatus;
import com.bytedance.ads.model.BrandAdGetV30AppOrigin;
import com.bytedance.ads.model.BrandAdGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandAdGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BrandAdGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public BrandAdGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30BrandAdGetGet
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 最大为100 (required)
     * @param adIds 计划ID List (optional)
     * @param adNames 计划名称List (optional)
     * @param campaignIds 广告组ID List (optional)
     * @param appOrigin 媒体端 (optional)
     * @param adForm 版位 (optional)
     * @param adStatus 广告计划状态 (optional)
     * @param createStartTime 创建起始时间 格式2023-01-01 00:00:00 (optional)
     * @param createEndTime 创建截止时间 格式2023-01-01 00:00:00 (optional)
     * @param startTime 投放起始时间 格式2023-01-01 00:00:00 (optional)
     * @param endTime 投放截止时间 格式2023-01-01 00:00:00 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30BrandAdGetGetCall(Long advertiserId, Long page, Long size, List<String> adIds, List<String> adNames, List<String> campaignIds, BrandAdGetV30AppOrigin appOrigin, BrandAdGetV30AdForm adForm, BrandAdGetV30AdStatus adStatus, String createStartTime, String createEndTime, String startTime, String endTime, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/brand/ad/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (adIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "ad_ids", adIds));
        }

        if (adNames != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "ad_names", adNames));
        }

        if (campaignIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "campaign_ids", campaignIds));
        }

        if (appOrigin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_origin", appOrigin));
        }

        if (adForm != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_form", adForm));
        }

        if (adStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_status", adStatus));
        }

        if (createStartTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("create_start_time", createStartTime));
        }

        if (createEndTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("create_end_time", createEndTime));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
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
    private okhttp3.Call openApiV30BrandAdGetGetValidateBeforeCall(Long advertiserId, Long page, Long size, List<String> adIds, List<String> adNames, List<String> campaignIds, BrandAdGetV30AppOrigin appOrigin, BrandAdGetV30AdForm adForm, BrandAdGetV30AdStatus adStatus, String createStartTime, String createEndTime, String startTime, String endTime, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30BrandAdGetGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApiV30BrandAdGetGet(Async)");
        }

        // verify the required parameter 'size' is set
        if (size == null) {
            throw new ApiException("Missing the required parameter 'size' when calling openApiV30BrandAdGetGet(Async)");
        }

        return openApiV30BrandAdGetGetCall(advertiserId, page, size, adIds, adNames, campaignIds, appOrigin, adForm, adStatus, createStartTime, createEndTime, startTime, endTime, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 最大为100 (required)
     * @param adIds 计划ID List (optional)
     * @param adNames 计划名称List (optional)
     * @param campaignIds 广告组ID List (optional)
     * @param appOrigin 媒体端 (optional)
     * @param adForm 版位 (optional)
     * @param adStatus 广告计划状态 (optional)
     * @param createStartTime 创建起始时间 格式2023-01-01 00:00:00 (optional)
     * @param createEndTime 创建截止时间 格式2023-01-01 00:00:00 (optional)
     * @param startTime 投放起始时间 格式2023-01-01 00:00:00 (optional)
     * @param endTime 投放截止时间 格式2023-01-01 00:00:00 (optional)
     * @return BrandAdGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public BrandAdGetV30Response openApiV30BrandAdGetGet(Long advertiserId, Long page, Long size, List<String> adIds, List<String> adNames, List<String> campaignIds, BrandAdGetV30AppOrigin appOrigin, BrandAdGetV30AdForm adForm, BrandAdGetV30AdStatus adStatus, String createStartTime, String createEndTime, String startTime, String endTime) throws ApiException {
        ApiResponse<BrandAdGetV30Response> localVarResp = openApiV30BrandAdGetGetWithHttpInfo(advertiserId, page, size, adIds, adNames, campaignIds, appOrigin, adForm, adStatus, createStartTime, createEndTime, startTime, endTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 最大为100 (required)
     * @param adIds 计划ID List (optional)
     * @param adNames 计划名称List (optional)
     * @param campaignIds 广告组ID List (optional)
     * @param appOrigin 媒体端 (optional)
     * @param adForm 版位 (optional)
     * @param adStatus 广告计划状态 (optional)
     * @param createStartTime 创建起始时间 格式2023-01-01 00:00:00 (optional)
     * @param createEndTime 创建截止时间 格式2023-01-01 00:00:00 (optional)
     * @param startTime 投放起始时间 格式2023-01-01 00:00:00 (optional)
     * @param endTime 投放截止时间 格式2023-01-01 00:00:00 (optional)
     * @return ApiResponse&lt;BrandAdGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BrandAdGetV30Response> openApiV30BrandAdGetGetWithHttpInfo(Long advertiserId, Long page, Long size, List<String> adIds, List<String> adNames, List<String> campaignIds, BrandAdGetV30AppOrigin appOrigin, BrandAdGetV30AdForm adForm, BrandAdGetV30AdStatus adStatus, String createStartTime, String createEndTime, String startTime, String endTime) throws ApiException {
        okhttp3.Call localVarCall = openApiV30BrandAdGetGetValidateBeforeCall(advertiserId, page, size, adIds, adNames, campaignIds, appOrigin, adForm, adStatus, createStartTime, createEndTime, startTime, endTime, null);
        Type localVarReturnType = new TypeToken<BrandAdGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 最大为100 (required)
     * @param adIds 计划ID List (optional)
     * @param adNames 计划名称List (optional)
     * @param campaignIds 广告组ID List (optional)
     * @param appOrigin 媒体端 (optional)
     * @param adForm 版位 (optional)
     * @param adStatus 广告计划状态 (optional)
     * @param createStartTime 创建起始时间 格式2023-01-01 00:00:00 (optional)
     * @param createEndTime 创建截止时间 格式2023-01-01 00:00:00 (optional)
     * @param startTime 投放起始时间 格式2023-01-01 00:00:00 (optional)
     * @param endTime 投放截止时间 格式2023-01-01 00:00:00 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30BrandAdGetGetAsync(Long advertiserId, Long page, Long size, List<String> adIds, List<String> adNames, List<String> campaignIds, BrandAdGetV30AppOrigin appOrigin, BrandAdGetV30AdForm adForm, BrandAdGetV30AdStatus adStatus, String createStartTime, String createEndTime, String startTime, String endTime, final ApiCallback<BrandAdGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30BrandAdGetGetValidateBeforeCall(advertiserId, page, size, adIds, adNames, campaignIds, appOrigin, adForm, adStatus, createStartTime, createEndTime, startTime, endTime, _callback);
        Type localVarReturnType = new TypeToken<BrandAdGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
