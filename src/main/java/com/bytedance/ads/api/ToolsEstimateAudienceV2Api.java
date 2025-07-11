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



import com.bytedance.ads.model.ToolsEstimateAudienceV2Ac;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ActionDays;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ActivateType;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Age;
import com.bytedance.ads.model.ToolsEstimateAudienceV2AndroidOsv;
import com.bytedance.ads.model.ToolsEstimateAudienceV2AppBehaviorTarget;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ArticleCategory;
import com.bytedance.ads.model.ToolsEstimateAudienceV2AutoExtendEnabled;
import com.bytedance.ads.model.ToolsEstimateAudienceV2AutoExtendTargets;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Carrier;
import com.bytedance.ads.model.ToolsEstimateAudienceV2DeviceBrand;
import com.bytedance.ads.model.ToolsEstimateAudienceV2DeviceType;
import com.bytedance.ads.model.ToolsEstimateAudienceV2District;
import com.bytedance.ads.model.ToolsEstimateAudienceV2DpaLocalAudience;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ExcludeCustomActionsInner;
import com.bytedance.ads.model.ToolsEstimateAudienceV2FilterAwemeAbnormalActive;
import com.bytedance.ads.model.ToolsEstimateAudienceV2FilterOwnAwemeFans;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Gender;
import com.bytedance.ads.model.ToolsEstimateAudienceV2GeolocationInner;
import com.bytedance.ads.model.ToolsEstimateAudienceV2IncludeCustomActionsInner;
import com.bytedance.ads.model.ToolsEstimateAudienceV2InterestActionMode;
import com.bytedance.ads.model.ToolsEstimateAudienceV2IosOsv;
import com.bytedance.ads.model.ToolsEstimateAudienceV2LocationType;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Platform;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Response;
import com.bytedance.ads.model.ToolsEstimateAudienceV2RetargetingType;
import com.bytedance.ads.model.ToolsEstimateAudienceV2SuperiorPopularityType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsEstimateAudienceV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsEstimateAudienceV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsEstimateAudienceV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsEstimateAudienceGet
     * @param ac  (optional)
     * @param actionCategories  (optional)
     * @param actionDays  (optional)
     * @param actionWords  (optional)
     * @param activateType  (optional)
     * @param adTag  (optional)
     * @param advertiserId  (optional)
     * @param age  (optional)
     * @param androidOsv  (optional)
     * @param appBehaviorTarget  (optional)
     * @param appCategory  (optional)
     * @param appIds  (optional)
     * @param articleCategory  (optional)
     * @param audiencePackageId  (optional)
     * @param autoExtendEnabled  (optional)
     * @param autoExtendTargets  (optional)
     * @param awemeFansNumbers  (optional)
     * @param carrier  (optional)
     * @param city  (optional)
     * @param deviceBrand  (optional)
     * @param deviceType  (optional)
     * @param district  (optional)
     * @param dpaLocalAudience  (optional)
     * @param excludeCustomActions  (optional)
     * @param excludeFlowPackage  (optional)
     * @param filterAwemeAbnormalActive  (optional)
     * @param filterAwemeFansCount  (optional)
     * @param filterOwnAwemeFans  (optional)
     * @param flowPackage  (optional)
     * @param gender  (optional)
     * @param geolocation  (optional)
     * @param includeCustomActions  (optional)
     * @param interestActionMode  (optional)
     * @param interestCategories  (optional)
     * @param interestTags  (optional)
     * @param interestWords  (optional)
     * @param iosOsv  (optional)
     * @param launchPrice  (optional)
     * @param locationType  (optional)
     * @param platform  (optional)
     * @param retargetingTags  (optional)
     * @param retargetingTagsExclude  (optional)
     * @param retargetingTagsInclude  (optional)
     * @param retargetingType  (optional)
     * @param superiorPopularityType  (optional)
     * @param userType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsEstimateAudienceGetCall(List<ToolsEstimateAudienceV2Ac> ac, List<Long> actionCategories, ToolsEstimateAudienceV2ActionDays actionDays, List<Long> actionWords, List<ToolsEstimateAudienceV2ActivateType> activateType, List<Long> adTag, Long advertiserId, List<ToolsEstimateAudienceV2Age> age, ToolsEstimateAudienceV2AndroidOsv androidOsv, ToolsEstimateAudienceV2AppBehaviorTarget appBehaviorTarget, List<Long> appCategory, List<Long> appIds, List<ToolsEstimateAudienceV2ArticleCategory> articleCategory, Long audiencePackageId, ToolsEstimateAudienceV2AutoExtendEnabled autoExtendEnabled, List<ToolsEstimateAudienceV2AutoExtendTargets> autoExtendTargets, List<Long> awemeFansNumbers, List<ToolsEstimateAudienceV2Carrier> carrier, List<Long> city, List<ToolsEstimateAudienceV2DeviceBrand> deviceBrand, List<ToolsEstimateAudienceV2DeviceType> deviceType, ToolsEstimateAudienceV2District district, ToolsEstimateAudienceV2DpaLocalAudience dpaLocalAudience, List<ToolsEstimateAudienceV2ExcludeCustomActionsInner> excludeCustomActions, List<Long> excludeFlowPackage, ToolsEstimateAudienceV2FilterAwemeAbnormalActive filterAwemeAbnormalActive, Long filterAwemeFansCount, ToolsEstimateAudienceV2FilterOwnAwemeFans filterOwnAwemeFans, List<Long> flowPackage, ToolsEstimateAudienceV2Gender gender, List<ToolsEstimateAudienceV2GeolocationInner> geolocation, List<ToolsEstimateAudienceV2IncludeCustomActionsInner> includeCustomActions, ToolsEstimateAudienceV2InterestActionMode interestActionMode, List<Long> interestCategories, List<Long> interestTags, List<Long> interestWords, ToolsEstimateAudienceV2IosOsv iosOsv, List<Long> launchPrice, ToolsEstimateAudienceV2LocationType locationType, List<ToolsEstimateAudienceV2Platform> platform, List<Long> retargetingTags, List<Long> retargetingTagsExclude, List<Long> retargetingTagsInclude, ToolsEstimateAudienceV2RetargetingType retargetingType, ToolsEstimateAudienceV2SuperiorPopularityType superiorPopularityType, List<Long> userType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/estimate_audience/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ac != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "ac", ac));
        }

        if (actionCategories != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "action_categories", actionCategories));
        }

        if (actionDays != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("action_days", actionDays));
        }

        if (actionWords != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "action_words", actionWords));
        }

        if (activateType != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "activate_type", activateType));
        }

        if (adTag != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "ad_tag", adTag));
        }

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (age != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "age", age));
        }

        if (androidOsv != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("android_osv", androidOsv));
        }

        if (appBehaviorTarget != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_behavior_target", appBehaviorTarget));
        }

        if (appCategory != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "app_category", appCategory));
        }

        if (appIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "app_ids", appIds));
        }

        if (articleCategory != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "article_category", articleCategory));
        }

        if (audiencePackageId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("audience_package_id", audiencePackageId));
        }

        if (autoExtendEnabled != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auto_extend_enabled", autoExtendEnabled));
        }

        if (autoExtendTargets != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "auto_extend_targets", autoExtendTargets));
        }

        if (awemeFansNumbers != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "aweme_fans_numbers", awemeFansNumbers));
        }

        if (carrier != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "carrier", carrier));
        }

        if (city != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "city", city));
        }

        if (deviceBrand != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "device_brand", deviceBrand));
        }

        if (deviceType != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "device_type", deviceType));
        }

        if (district != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("district", district));
        }

        if (dpaLocalAudience != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dpa_local_audience", dpaLocalAudience));
        }

        if (excludeCustomActions != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "exclude_custom_actions", excludeCustomActions));
        }

        if (excludeFlowPackage != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "exclude_flow_package", excludeFlowPackage));
        }

        if (filterAwemeAbnormalActive != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter_aweme_abnormal_active", filterAwemeAbnormalActive));
        }

        if (filterAwemeFansCount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter_aweme_fans_count", filterAwemeFansCount));
        }

        if (filterOwnAwemeFans != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter_own_aweme_fans", filterOwnAwemeFans));
        }

        if (flowPackage != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "flow_package", flowPackage));
        }

        if (gender != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gender", gender));
        }

        if (geolocation != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "geolocation", geolocation));
        }

        if (includeCustomActions != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "include_custom_actions", includeCustomActions));
        }

        if (interestActionMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("interest_action_mode", interestActionMode));
        }

        if (interestCategories != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "interest_categories", interestCategories));
        }

        if (interestTags != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "interest_tags", interestTags));
        }

        if (interestWords != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "interest_words", interestWords));
        }

        if (iosOsv != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ios_osv", iosOsv));
        }

        if (launchPrice != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "launch_price", launchPrice));
        }

        if (locationType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("location_type", locationType));
        }

        if (platform != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "platform", platform));
        }

        if (retargetingTags != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "retargeting_tags", retargetingTags));
        }

        if (retargetingTagsExclude != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "retargeting_tags_exclude", retargetingTagsExclude));
        }

        if (retargetingTagsInclude != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "retargeting_tags_include", retargetingTagsInclude));
        }

        if (retargetingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("retargeting_type", retargetingType));
        }

        if (superiorPopularityType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("superior_popularity_type", superiorPopularityType));
        }

        if (userType != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "user_type", userType));
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
    private okhttp3.Call openApi2ToolsEstimateAudienceGetValidateBeforeCall(List<ToolsEstimateAudienceV2Ac> ac, List<Long> actionCategories, ToolsEstimateAudienceV2ActionDays actionDays, List<Long> actionWords, List<ToolsEstimateAudienceV2ActivateType> activateType, List<Long> adTag, Long advertiserId, List<ToolsEstimateAudienceV2Age> age, ToolsEstimateAudienceV2AndroidOsv androidOsv, ToolsEstimateAudienceV2AppBehaviorTarget appBehaviorTarget, List<Long> appCategory, List<Long> appIds, List<ToolsEstimateAudienceV2ArticleCategory> articleCategory, Long audiencePackageId, ToolsEstimateAudienceV2AutoExtendEnabled autoExtendEnabled, List<ToolsEstimateAudienceV2AutoExtendTargets> autoExtendTargets, List<Long> awemeFansNumbers, List<ToolsEstimateAudienceV2Carrier> carrier, List<Long> city, List<ToolsEstimateAudienceV2DeviceBrand> deviceBrand, List<ToolsEstimateAudienceV2DeviceType> deviceType, ToolsEstimateAudienceV2District district, ToolsEstimateAudienceV2DpaLocalAudience dpaLocalAudience, List<ToolsEstimateAudienceV2ExcludeCustomActionsInner> excludeCustomActions, List<Long> excludeFlowPackage, ToolsEstimateAudienceV2FilterAwemeAbnormalActive filterAwemeAbnormalActive, Long filterAwemeFansCount, ToolsEstimateAudienceV2FilterOwnAwemeFans filterOwnAwemeFans, List<Long> flowPackage, ToolsEstimateAudienceV2Gender gender, List<ToolsEstimateAudienceV2GeolocationInner> geolocation, List<ToolsEstimateAudienceV2IncludeCustomActionsInner> includeCustomActions, ToolsEstimateAudienceV2InterestActionMode interestActionMode, List<Long> interestCategories, List<Long> interestTags, List<Long> interestWords, ToolsEstimateAudienceV2IosOsv iosOsv, List<Long> launchPrice, ToolsEstimateAudienceV2LocationType locationType, List<ToolsEstimateAudienceV2Platform> platform, List<Long> retargetingTags, List<Long> retargetingTagsExclude, List<Long> retargetingTagsInclude, ToolsEstimateAudienceV2RetargetingType retargetingType, ToolsEstimateAudienceV2SuperiorPopularityType superiorPopularityType, List<Long> userType, final ApiCallback _callback) throws ApiException {
        return openApi2ToolsEstimateAudienceGetCall(ac, actionCategories, actionDays, actionWords, activateType, adTag, advertiserId, age, androidOsv, appBehaviorTarget, appCategory, appIds, articleCategory, audiencePackageId, autoExtendEnabled, autoExtendTargets, awemeFansNumbers, carrier, city, deviceBrand, deviceType, district, dpaLocalAudience, excludeCustomActions, excludeFlowPackage, filterAwemeAbnormalActive, filterAwemeFansCount, filterOwnAwemeFans, flowPackage, gender, geolocation, includeCustomActions, interestActionMode, interestCategories, interestTags, interestWords, iosOsv, launchPrice, locationType, platform, retargetingTags, retargetingTagsExclude, retargetingTagsInclude, retargetingType, superiorPopularityType, userType, _callback);

    }

    /**
     * 
     * 
     * @param ac  (optional)
     * @param actionCategories  (optional)
     * @param actionDays  (optional)
     * @param actionWords  (optional)
     * @param activateType  (optional)
     * @param adTag  (optional)
     * @param advertiserId  (optional)
     * @param age  (optional)
     * @param androidOsv  (optional)
     * @param appBehaviorTarget  (optional)
     * @param appCategory  (optional)
     * @param appIds  (optional)
     * @param articleCategory  (optional)
     * @param audiencePackageId  (optional)
     * @param autoExtendEnabled  (optional)
     * @param autoExtendTargets  (optional)
     * @param awemeFansNumbers  (optional)
     * @param carrier  (optional)
     * @param city  (optional)
     * @param deviceBrand  (optional)
     * @param deviceType  (optional)
     * @param district  (optional)
     * @param dpaLocalAudience  (optional)
     * @param excludeCustomActions  (optional)
     * @param excludeFlowPackage  (optional)
     * @param filterAwemeAbnormalActive  (optional)
     * @param filterAwemeFansCount  (optional)
     * @param filterOwnAwemeFans  (optional)
     * @param flowPackage  (optional)
     * @param gender  (optional)
     * @param geolocation  (optional)
     * @param includeCustomActions  (optional)
     * @param interestActionMode  (optional)
     * @param interestCategories  (optional)
     * @param interestTags  (optional)
     * @param interestWords  (optional)
     * @param iosOsv  (optional)
     * @param launchPrice  (optional)
     * @param locationType  (optional)
     * @param platform  (optional)
     * @param retargetingTags  (optional)
     * @param retargetingTagsExclude  (optional)
     * @param retargetingTagsInclude  (optional)
     * @param retargetingType  (optional)
     * @param superiorPopularityType  (optional)
     * @param userType  (optional)
     * @return ToolsEstimateAudienceV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsEstimateAudienceV2Response openApi2ToolsEstimateAudienceGet(List<ToolsEstimateAudienceV2Ac> ac, List<Long> actionCategories, ToolsEstimateAudienceV2ActionDays actionDays, List<Long> actionWords, List<ToolsEstimateAudienceV2ActivateType> activateType, List<Long> adTag, Long advertiserId, List<ToolsEstimateAudienceV2Age> age, ToolsEstimateAudienceV2AndroidOsv androidOsv, ToolsEstimateAudienceV2AppBehaviorTarget appBehaviorTarget, List<Long> appCategory, List<Long> appIds, List<ToolsEstimateAudienceV2ArticleCategory> articleCategory, Long audiencePackageId, ToolsEstimateAudienceV2AutoExtendEnabled autoExtendEnabled, List<ToolsEstimateAudienceV2AutoExtendTargets> autoExtendTargets, List<Long> awemeFansNumbers, List<ToolsEstimateAudienceV2Carrier> carrier, List<Long> city, List<ToolsEstimateAudienceV2DeviceBrand> deviceBrand, List<ToolsEstimateAudienceV2DeviceType> deviceType, ToolsEstimateAudienceV2District district, ToolsEstimateAudienceV2DpaLocalAudience dpaLocalAudience, List<ToolsEstimateAudienceV2ExcludeCustomActionsInner> excludeCustomActions, List<Long> excludeFlowPackage, ToolsEstimateAudienceV2FilterAwemeAbnormalActive filterAwemeAbnormalActive, Long filterAwemeFansCount, ToolsEstimateAudienceV2FilterOwnAwemeFans filterOwnAwemeFans, List<Long> flowPackage, ToolsEstimateAudienceV2Gender gender, List<ToolsEstimateAudienceV2GeolocationInner> geolocation, List<ToolsEstimateAudienceV2IncludeCustomActionsInner> includeCustomActions, ToolsEstimateAudienceV2InterestActionMode interestActionMode, List<Long> interestCategories, List<Long> interestTags, List<Long> interestWords, ToolsEstimateAudienceV2IosOsv iosOsv, List<Long> launchPrice, ToolsEstimateAudienceV2LocationType locationType, List<ToolsEstimateAudienceV2Platform> platform, List<Long> retargetingTags, List<Long> retargetingTagsExclude, List<Long> retargetingTagsInclude, ToolsEstimateAudienceV2RetargetingType retargetingType, ToolsEstimateAudienceV2SuperiorPopularityType superiorPopularityType, List<Long> userType) throws ApiException {
        ApiResponse<ToolsEstimateAudienceV2Response> localVarResp = openApi2ToolsEstimateAudienceGetWithHttpInfo(ac, actionCategories, actionDays, actionWords, activateType, adTag, advertiserId, age, androidOsv, appBehaviorTarget, appCategory, appIds, articleCategory, audiencePackageId, autoExtendEnabled, autoExtendTargets, awemeFansNumbers, carrier, city, deviceBrand, deviceType, district, dpaLocalAudience, excludeCustomActions, excludeFlowPackage, filterAwemeAbnormalActive, filterAwemeFansCount, filterOwnAwemeFans, flowPackage, gender, geolocation, includeCustomActions, interestActionMode, interestCategories, interestTags, interestWords, iosOsv, launchPrice, locationType, platform, retargetingTags, retargetingTagsExclude, retargetingTagsInclude, retargetingType, superiorPopularityType, userType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param ac  (optional)
     * @param actionCategories  (optional)
     * @param actionDays  (optional)
     * @param actionWords  (optional)
     * @param activateType  (optional)
     * @param adTag  (optional)
     * @param advertiserId  (optional)
     * @param age  (optional)
     * @param androidOsv  (optional)
     * @param appBehaviorTarget  (optional)
     * @param appCategory  (optional)
     * @param appIds  (optional)
     * @param articleCategory  (optional)
     * @param audiencePackageId  (optional)
     * @param autoExtendEnabled  (optional)
     * @param autoExtendTargets  (optional)
     * @param awemeFansNumbers  (optional)
     * @param carrier  (optional)
     * @param city  (optional)
     * @param deviceBrand  (optional)
     * @param deviceType  (optional)
     * @param district  (optional)
     * @param dpaLocalAudience  (optional)
     * @param excludeCustomActions  (optional)
     * @param excludeFlowPackage  (optional)
     * @param filterAwemeAbnormalActive  (optional)
     * @param filterAwemeFansCount  (optional)
     * @param filterOwnAwemeFans  (optional)
     * @param flowPackage  (optional)
     * @param gender  (optional)
     * @param geolocation  (optional)
     * @param includeCustomActions  (optional)
     * @param interestActionMode  (optional)
     * @param interestCategories  (optional)
     * @param interestTags  (optional)
     * @param interestWords  (optional)
     * @param iosOsv  (optional)
     * @param launchPrice  (optional)
     * @param locationType  (optional)
     * @param platform  (optional)
     * @param retargetingTags  (optional)
     * @param retargetingTagsExclude  (optional)
     * @param retargetingTagsInclude  (optional)
     * @param retargetingType  (optional)
     * @param superiorPopularityType  (optional)
     * @param userType  (optional)
     * @return ApiResponse&lt;ToolsEstimateAudienceV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsEstimateAudienceV2Response> openApi2ToolsEstimateAudienceGetWithHttpInfo(List<ToolsEstimateAudienceV2Ac> ac, List<Long> actionCategories, ToolsEstimateAudienceV2ActionDays actionDays, List<Long> actionWords, List<ToolsEstimateAudienceV2ActivateType> activateType, List<Long> adTag, Long advertiserId, List<ToolsEstimateAudienceV2Age> age, ToolsEstimateAudienceV2AndroidOsv androidOsv, ToolsEstimateAudienceV2AppBehaviorTarget appBehaviorTarget, List<Long> appCategory, List<Long> appIds, List<ToolsEstimateAudienceV2ArticleCategory> articleCategory, Long audiencePackageId, ToolsEstimateAudienceV2AutoExtendEnabled autoExtendEnabled, List<ToolsEstimateAudienceV2AutoExtendTargets> autoExtendTargets, List<Long> awemeFansNumbers, List<ToolsEstimateAudienceV2Carrier> carrier, List<Long> city, List<ToolsEstimateAudienceV2DeviceBrand> deviceBrand, List<ToolsEstimateAudienceV2DeviceType> deviceType, ToolsEstimateAudienceV2District district, ToolsEstimateAudienceV2DpaLocalAudience dpaLocalAudience, List<ToolsEstimateAudienceV2ExcludeCustomActionsInner> excludeCustomActions, List<Long> excludeFlowPackage, ToolsEstimateAudienceV2FilterAwemeAbnormalActive filterAwemeAbnormalActive, Long filterAwemeFansCount, ToolsEstimateAudienceV2FilterOwnAwemeFans filterOwnAwemeFans, List<Long> flowPackage, ToolsEstimateAudienceV2Gender gender, List<ToolsEstimateAudienceV2GeolocationInner> geolocation, List<ToolsEstimateAudienceV2IncludeCustomActionsInner> includeCustomActions, ToolsEstimateAudienceV2InterestActionMode interestActionMode, List<Long> interestCategories, List<Long> interestTags, List<Long> interestWords, ToolsEstimateAudienceV2IosOsv iosOsv, List<Long> launchPrice, ToolsEstimateAudienceV2LocationType locationType, List<ToolsEstimateAudienceV2Platform> platform, List<Long> retargetingTags, List<Long> retargetingTagsExclude, List<Long> retargetingTagsInclude, ToolsEstimateAudienceV2RetargetingType retargetingType, ToolsEstimateAudienceV2SuperiorPopularityType superiorPopularityType, List<Long> userType) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsEstimateAudienceGetValidateBeforeCall(ac, actionCategories, actionDays, actionWords, activateType, adTag, advertiserId, age, androidOsv, appBehaviorTarget, appCategory, appIds, articleCategory, audiencePackageId, autoExtendEnabled, autoExtendTargets, awemeFansNumbers, carrier, city, deviceBrand, deviceType, district, dpaLocalAudience, excludeCustomActions, excludeFlowPackage, filterAwemeAbnormalActive, filterAwemeFansCount, filterOwnAwemeFans, flowPackage, gender, geolocation, includeCustomActions, interestActionMode, interestCategories, interestTags, interestWords, iosOsv, launchPrice, locationType, platform, retargetingTags, retargetingTagsExclude, retargetingTagsInclude, retargetingType, superiorPopularityType, userType, null);
        Type localVarReturnType = new TypeToken<ToolsEstimateAudienceV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param ac  (optional)
     * @param actionCategories  (optional)
     * @param actionDays  (optional)
     * @param actionWords  (optional)
     * @param activateType  (optional)
     * @param adTag  (optional)
     * @param advertiserId  (optional)
     * @param age  (optional)
     * @param androidOsv  (optional)
     * @param appBehaviorTarget  (optional)
     * @param appCategory  (optional)
     * @param appIds  (optional)
     * @param articleCategory  (optional)
     * @param audiencePackageId  (optional)
     * @param autoExtendEnabled  (optional)
     * @param autoExtendTargets  (optional)
     * @param awemeFansNumbers  (optional)
     * @param carrier  (optional)
     * @param city  (optional)
     * @param deviceBrand  (optional)
     * @param deviceType  (optional)
     * @param district  (optional)
     * @param dpaLocalAudience  (optional)
     * @param excludeCustomActions  (optional)
     * @param excludeFlowPackage  (optional)
     * @param filterAwemeAbnormalActive  (optional)
     * @param filterAwemeFansCount  (optional)
     * @param filterOwnAwemeFans  (optional)
     * @param flowPackage  (optional)
     * @param gender  (optional)
     * @param geolocation  (optional)
     * @param includeCustomActions  (optional)
     * @param interestActionMode  (optional)
     * @param interestCategories  (optional)
     * @param interestTags  (optional)
     * @param interestWords  (optional)
     * @param iosOsv  (optional)
     * @param launchPrice  (optional)
     * @param locationType  (optional)
     * @param platform  (optional)
     * @param retargetingTags  (optional)
     * @param retargetingTagsExclude  (optional)
     * @param retargetingTagsInclude  (optional)
     * @param retargetingType  (optional)
     * @param superiorPopularityType  (optional)
     * @param userType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsEstimateAudienceGetAsync(List<ToolsEstimateAudienceV2Ac> ac, List<Long> actionCategories, ToolsEstimateAudienceV2ActionDays actionDays, List<Long> actionWords, List<ToolsEstimateAudienceV2ActivateType> activateType, List<Long> adTag, Long advertiserId, List<ToolsEstimateAudienceV2Age> age, ToolsEstimateAudienceV2AndroidOsv androidOsv, ToolsEstimateAudienceV2AppBehaviorTarget appBehaviorTarget, List<Long> appCategory, List<Long> appIds, List<ToolsEstimateAudienceV2ArticleCategory> articleCategory, Long audiencePackageId, ToolsEstimateAudienceV2AutoExtendEnabled autoExtendEnabled, List<ToolsEstimateAudienceV2AutoExtendTargets> autoExtendTargets, List<Long> awemeFansNumbers, List<ToolsEstimateAudienceV2Carrier> carrier, List<Long> city, List<ToolsEstimateAudienceV2DeviceBrand> deviceBrand, List<ToolsEstimateAudienceV2DeviceType> deviceType, ToolsEstimateAudienceV2District district, ToolsEstimateAudienceV2DpaLocalAudience dpaLocalAudience, List<ToolsEstimateAudienceV2ExcludeCustomActionsInner> excludeCustomActions, List<Long> excludeFlowPackage, ToolsEstimateAudienceV2FilterAwemeAbnormalActive filterAwemeAbnormalActive, Long filterAwemeFansCount, ToolsEstimateAudienceV2FilterOwnAwemeFans filterOwnAwemeFans, List<Long> flowPackage, ToolsEstimateAudienceV2Gender gender, List<ToolsEstimateAudienceV2GeolocationInner> geolocation, List<ToolsEstimateAudienceV2IncludeCustomActionsInner> includeCustomActions, ToolsEstimateAudienceV2InterestActionMode interestActionMode, List<Long> interestCategories, List<Long> interestTags, List<Long> interestWords, ToolsEstimateAudienceV2IosOsv iosOsv, List<Long> launchPrice, ToolsEstimateAudienceV2LocationType locationType, List<ToolsEstimateAudienceV2Platform> platform, List<Long> retargetingTags, List<Long> retargetingTagsExclude, List<Long> retargetingTagsInclude, ToolsEstimateAudienceV2RetargetingType retargetingType, ToolsEstimateAudienceV2SuperiorPopularityType superiorPopularityType, List<Long> userType, final ApiCallback<ToolsEstimateAudienceV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsEstimateAudienceGetValidateBeforeCall(ac, actionCategories, actionDays, actionWords, activateType, adTag, advertiserId, age, androidOsv, appBehaviorTarget, appCategory, appIds, articleCategory, audiencePackageId, autoExtendEnabled, autoExtendTargets, awemeFansNumbers, carrier, city, deviceBrand, deviceType, district, dpaLocalAudience, excludeCustomActions, excludeFlowPackage, filterAwemeAbnormalActive, filterAwemeFansCount, filterOwnAwemeFans, flowPackage, gender, geolocation, includeCustomActions, interestActionMode, interestCategories, interestTags, interestWords, iosOsv, launchPrice, locationType, platform, retargetingTags, retargetingTagsExclude, retargetingTagsInclude, retargetingType, superiorPopularityType, userType, _callback);
        Type localVarReturnType = new TypeToken<ToolsEstimateAudienceV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
