/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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



import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30AdType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30AppPromotionType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30AppType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30AssetType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DeliveryMode;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DeliveryType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DpaAdtype;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30LandingType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30MarketingGoal;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30MicroPromotionType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManagerOptimizedGoalGetV2V30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventManagerOptimizedGoalGetV2V30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public EventManagerOptimizedGoalGetV2V30Api(ApiClient apiClient) {
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
     * Build call for openApiV30EventManagerOptimizedGoalGetV2Get
     * @param advertiserId 广告主id (required)
     * @param landingType 推广目的，允许值：APP 应用推广 (required)
     * @param adType 广告类型，允许值：ALL (required)
     * @param assetType 资产类型，允许值：APP 应用 (required)
     * @param assetId 资产id (optional)
     * @param packageName 应用包名称，当asset_type为应用APP时，若asset_id不为空，生效asset_id；若asset_id为空且package_name不为空时，生效package_name (optional)
     * @param appType 应用类型，当asset_type为应用APP时必填 可选值：ANDROID 、IOS (optional)
     * @param appPromotionType 子目标，支持： DOWNLOAD（应用下载）、LAUNCH（应用调起）、RESERVE（预约下载） (optional)
     * @param marketingGoal 营销场景， 允许值：VIDEO_AND_IMAGE 短视频/图片 LIVE直播 (optional)
     * @param quickAppId 快应用资产id (optional)
     * @param deliveryMode 投放模式 (optional)
     * @param miniProgramId  (optional)
     * @param dpaAdtype  (optional)
     * @param microPromotionType  (optional)
     * @param microAppInstanceId 小程序资产id (optional)
     * @param deliveryType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30EventManagerOptimizedGoalGetV2GetCall(Long advertiserId, EventManagerOptimizedGoalGetV2V30LandingType landingType, EventManagerOptimizedGoalGetV2V30AdType adType, EventManagerOptimizedGoalGetV2V30AssetType assetType, Long assetId, String packageName, EventManagerOptimizedGoalGetV2V30AppType appType, EventManagerOptimizedGoalGetV2V30AppPromotionType appPromotionType, EventManagerOptimizedGoalGetV2V30MarketingGoal marketingGoal, Long quickAppId, EventManagerOptimizedGoalGetV2V30DeliveryMode deliveryMode, String miniProgramId, EventManagerOptimizedGoalGetV2V30DpaAdtype dpaAdtype, EventManagerOptimizedGoalGetV2V30MicroPromotionType microPromotionType, Long microAppInstanceId, EventManagerOptimizedGoalGetV2V30DeliveryType deliveryType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/event_manager/optimized_goal/get_v2/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (landingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("landing_type", landingType));
        }

        if (adType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_type", adType));
        }

        if (assetType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asset_type", assetType));
        }

        if (assetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asset_id", assetId));
        }

        if (packageName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("package_name", packageName));
        }

        if (appType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_type", appType));
        }

        if (appPromotionType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_promotion_type", appPromotionType));
        }

        if (marketingGoal != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_goal", marketingGoal));
        }

        if (quickAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("quick_app_id", quickAppId));
        }

        if (deliveryMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("delivery_mode", deliveryMode));
        }

        if (miniProgramId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mini_program_id", miniProgramId));
        }

        if (dpaAdtype != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dpa_adtype", dpaAdtype));
        }

        if (microPromotionType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("micro_promotion_type", microPromotionType));
        }

        if (microAppInstanceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("micro_app_instance_id", microAppInstanceId));
        }

        if (deliveryType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("delivery_type", deliveryType));
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
    private okhttp3.Call openApiV30EventManagerOptimizedGoalGetV2GetValidateBeforeCall(Long advertiserId, EventManagerOptimizedGoalGetV2V30LandingType landingType, EventManagerOptimizedGoalGetV2V30AdType adType, EventManagerOptimizedGoalGetV2V30AssetType assetType, Long assetId, String packageName, EventManagerOptimizedGoalGetV2V30AppType appType, EventManagerOptimizedGoalGetV2V30AppPromotionType appPromotionType, EventManagerOptimizedGoalGetV2V30MarketingGoal marketingGoal, Long quickAppId, EventManagerOptimizedGoalGetV2V30DeliveryMode deliveryMode, String miniProgramId, EventManagerOptimizedGoalGetV2V30DpaAdtype dpaAdtype, EventManagerOptimizedGoalGetV2V30MicroPromotionType microPromotionType, Long microAppInstanceId, EventManagerOptimizedGoalGetV2V30DeliveryType deliveryType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30EventManagerOptimizedGoalGetV2Get(Async)");
        }

        // verify the required parameter 'landingType' is set
        if (landingType == null) {
            throw new ApiException("Missing the required parameter 'landingType' when calling openApiV30EventManagerOptimizedGoalGetV2Get(Async)");
        }

        // verify the required parameter 'adType' is set
        if (adType == null) {
            throw new ApiException("Missing the required parameter 'adType' when calling openApiV30EventManagerOptimizedGoalGetV2Get(Async)");
        }

        // verify the required parameter 'assetType' is set
        if (assetType == null) {
            throw new ApiException("Missing the required parameter 'assetType' when calling openApiV30EventManagerOptimizedGoalGetV2Get(Async)");
        }

        return openApiV30EventManagerOptimizedGoalGetV2GetCall(advertiserId, landingType, adType, assetType, assetId, packageName, appType, appPromotionType, marketingGoal, quickAppId, deliveryMode, miniProgramId, dpaAdtype, microPromotionType, microAppInstanceId, deliveryType, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param landingType 推广目的，允许值：APP 应用推广 (required)
     * @param adType 广告类型，允许值：ALL (required)
     * @param assetType 资产类型，允许值：APP 应用 (required)
     * @param assetId 资产id (optional)
     * @param packageName 应用包名称，当asset_type为应用APP时，若asset_id不为空，生效asset_id；若asset_id为空且package_name不为空时，生效package_name (optional)
     * @param appType 应用类型，当asset_type为应用APP时必填 可选值：ANDROID 、IOS (optional)
     * @param appPromotionType 子目标，支持： DOWNLOAD（应用下载）、LAUNCH（应用调起）、RESERVE（预约下载） (optional)
     * @param marketingGoal 营销场景， 允许值：VIDEO_AND_IMAGE 短视频/图片 LIVE直播 (optional)
     * @param quickAppId 快应用资产id (optional)
     * @param deliveryMode 投放模式 (optional)
     * @param miniProgramId  (optional)
     * @param dpaAdtype  (optional)
     * @param microPromotionType  (optional)
     * @param microAppInstanceId 小程序资产id (optional)
     * @param deliveryType  (optional)
     * @return EventManagerOptimizedGoalGetV2V30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EventManagerOptimizedGoalGetV2V30Response openApiV30EventManagerOptimizedGoalGetV2Get(Long advertiserId, EventManagerOptimizedGoalGetV2V30LandingType landingType, EventManagerOptimizedGoalGetV2V30AdType adType, EventManagerOptimizedGoalGetV2V30AssetType assetType, Long assetId, String packageName, EventManagerOptimizedGoalGetV2V30AppType appType, EventManagerOptimizedGoalGetV2V30AppPromotionType appPromotionType, EventManagerOptimizedGoalGetV2V30MarketingGoal marketingGoal, Long quickAppId, EventManagerOptimizedGoalGetV2V30DeliveryMode deliveryMode, String miniProgramId, EventManagerOptimizedGoalGetV2V30DpaAdtype dpaAdtype, EventManagerOptimizedGoalGetV2V30MicroPromotionType microPromotionType, Long microAppInstanceId, EventManagerOptimizedGoalGetV2V30DeliveryType deliveryType) throws ApiException {
        ApiResponse<EventManagerOptimizedGoalGetV2V30Response> localVarResp = openApiV30EventManagerOptimizedGoalGetV2GetWithHttpInfo(advertiserId, landingType, adType, assetType, assetId, packageName, appType, appPromotionType, marketingGoal, quickAppId, deliveryMode, miniProgramId, dpaAdtype, microPromotionType, microAppInstanceId, deliveryType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param landingType 推广目的，允许值：APP 应用推广 (required)
     * @param adType 广告类型，允许值：ALL (required)
     * @param assetType 资产类型，允许值：APP 应用 (required)
     * @param assetId 资产id (optional)
     * @param packageName 应用包名称，当asset_type为应用APP时，若asset_id不为空，生效asset_id；若asset_id为空且package_name不为空时，生效package_name (optional)
     * @param appType 应用类型，当asset_type为应用APP时必填 可选值：ANDROID 、IOS (optional)
     * @param appPromotionType 子目标，支持： DOWNLOAD（应用下载）、LAUNCH（应用调起）、RESERVE（预约下载） (optional)
     * @param marketingGoal 营销场景， 允许值：VIDEO_AND_IMAGE 短视频/图片 LIVE直播 (optional)
     * @param quickAppId 快应用资产id (optional)
     * @param deliveryMode 投放模式 (optional)
     * @param miniProgramId  (optional)
     * @param dpaAdtype  (optional)
     * @param microPromotionType  (optional)
     * @param microAppInstanceId 小程序资产id (optional)
     * @param deliveryType  (optional)
     * @return ApiResponse&lt;EventManagerOptimizedGoalGetV2V30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EventManagerOptimizedGoalGetV2V30Response> openApiV30EventManagerOptimizedGoalGetV2GetWithHttpInfo(Long advertiserId, EventManagerOptimizedGoalGetV2V30LandingType landingType, EventManagerOptimizedGoalGetV2V30AdType adType, EventManagerOptimizedGoalGetV2V30AssetType assetType, Long assetId, String packageName, EventManagerOptimizedGoalGetV2V30AppType appType, EventManagerOptimizedGoalGetV2V30AppPromotionType appPromotionType, EventManagerOptimizedGoalGetV2V30MarketingGoal marketingGoal, Long quickAppId, EventManagerOptimizedGoalGetV2V30DeliveryMode deliveryMode, String miniProgramId, EventManagerOptimizedGoalGetV2V30DpaAdtype dpaAdtype, EventManagerOptimizedGoalGetV2V30MicroPromotionType microPromotionType, Long microAppInstanceId, EventManagerOptimizedGoalGetV2V30DeliveryType deliveryType) throws ApiException {
        okhttp3.Call localVarCall = openApiV30EventManagerOptimizedGoalGetV2GetValidateBeforeCall(advertiserId, landingType, adType, assetType, assetId, packageName, appType, appPromotionType, marketingGoal, quickAppId, deliveryMode, miniProgramId, dpaAdtype, microPromotionType, microAppInstanceId, deliveryType, null);
        Type localVarReturnType = new TypeToken<EventManagerOptimizedGoalGetV2V30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主id (required)
     * @param landingType 推广目的，允许值：APP 应用推广 (required)
     * @param adType 广告类型，允许值：ALL (required)
     * @param assetType 资产类型，允许值：APP 应用 (required)
     * @param assetId 资产id (optional)
     * @param packageName 应用包名称，当asset_type为应用APP时，若asset_id不为空，生效asset_id；若asset_id为空且package_name不为空时，生效package_name (optional)
     * @param appType 应用类型，当asset_type为应用APP时必填 可选值：ANDROID 、IOS (optional)
     * @param appPromotionType 子目标，支持： DOWNLOAD（应用下载）、LAUNCH（应用调起）、RESERVE（预约下载） (optional)
     * @param marketingGoal 营销场景， 允许值：VIDEO_AND_IMAGE 短视频/图片 LIVE直播 (optional)
     * @param quickAppId 快应用资产id (optional)
     * @param deliveryMode 投放模式 (optional)
     * @param miniProgramId  (optional)
     * @param dpaAdtype  (optional)
     * @param microPromotionType  (optional)
     * @param microAppInstanceId 小程序资产id (optional)
     * @param deliveryType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30EventManagerOptimizedGoalGetV2GetAsync(Long advertiserId, EventManagerOptimizedGoalGetV2V30LandingType landingType, EventManagerOptimizedGoalGetV2V30AdType adType, EventManagerOptimizedGoalGetV2V30AssetType assetType, Long assetId, String packageName, EventManagerOptimizedGoalGetV2V30AppType appType, EventManagerOptimizedGoalGetV2V30AppPromotionType appPromotionType, EventManagerOptimizedGoalGetV2V30MarketingGoal marketingGoal, Long quickAppId, EventManagerOptimizedGoalGetV2V30DeliveryMode deliveryMode, String miniProgramId, EventManagerOptimizedGoalGetV2V30DpaAdtype dpaAdtype, EventManagerOptimizedGoalGetV2V30MicroPromotionType microPromotionType, Long microAppInstanceId, EventManagerOptimizedGoalGetV2V30DeliveryType deliveryType, final ApiCallback<EventManagerOptimizedGoalGetV2V30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30EventManagerOptimizedGoalGetV2GetValidateBeforeCall(advertiserId, landingType, adType, assetType, assetId, packageName, appType, appPromotionType, marketingGoal, quickAppId, deliveryMode, miniProgramId, dpaAdtype, microPromotionType, microAppInstanceId, deliveryType, _callback);
        Type localVarReturnType = new TypeToken<EventManagerOptimizedGoalGetV2V30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
