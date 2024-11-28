/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsBidSuggestV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsBidSuggestV2Ac;
import com.bytedance.ads.model.ToolsBidSuggestV2ActionDays;
import com.bytedance.ads.model.ToolsBidSuggestV2ActionScene;
import com.bytedance.ads.model.ToolsBidSuggestV2ActivateType;
import com.bytedance.ads.model.ToolsBidSuggestV2Age;
import com.bytedance.ads.model.ToolsBidSuggestV2AndroidOsv;
import com.bytedance.ads.model.ToolsBidSuggestV2AppBehaviorTarget;
import com.bytedance.ads.model.ToolsBidSuggestV2ArticleCategory;
import com.bytedance.ads.model.ToolsBidSuggestV2AutoExtendTargets;
import com.bytedance.ads.model.ToolsBidSuggestV2AwemeFanBehaviors;
import com.bytedance.ads.model.ToolsBidSuggestV2AwemeFanTimeScope;
import com.bytedance.ads.model.ToolsBidSuggestV2BidMode;
import com.bytedance.ads.model.ToolsBidSuggestV2BudgetMode;
import com.bytedance.ads.model.ToolsBidSuggestV2Career;
import com.bytedance.ads.model.ToolsBidSuggestV2Carrier;
import com.bytedance.ads.model.ToolsBidSuggestV2ConvertedTimeDuration;
import com.bytedance.ads.model.ToolsBidSuggestV2DeviceBrand;
import com.bytedance.ads.model.ToolsBidSuggestV2DeviceType;
import com.bytedance.ads.model.ToolsBidSuggestV2District;
import com.bytedance.ads.model.ToolsBidSuggestV2DpaLocalAudience;
import com.bytedance.ads.model.ToolsBidSuggestV2DpaRtaRecommendType;
import com.bytedance.ads.model.ToolsBidSuggestV2DpaRtaSwitch;
import com.bytedance.ads.model.ToolsBidSuggestV2ExcludeCustomActionsInner;
import com.bytedance.ads.model.ToolsBidSuggestV2FilterAwemeAbnormalActive;
import com.bytedance.ads.model.ToolsBidSuggestV2FilterOwnAwemeFans;
import com.bytedance.ads.model.ToolsBidSuggestV2FlowControlMode;
import com.bytedance.ads.model.ToolsBidSuggestV2Gender;
import com.bytedance.ads.model.ToolsBidSuggestV2GeolocationInner;
import com.bytedance.ads.model.ToolsBidSuggestV2HideIfConverted;
import com.bytedance.ads.model.ToolsBidSuggestV2HideIfExists;
import com.bytedance.ads.model.ToolsBidSuggestV2IncludeCustomActionsInner;
import com.bytedance.ads.model.ToolsBidSuggestV2InterestActionMode;
import com.bytedance.ads.model.ToolsBidSuggestV2IosOsv;
import com.bytedance.ads.model.ToolsBidSuggestV2LocationType;
import com.bytedance.ads.model.ToolsBidSuggestV2Platform;
import com.bytedance.ads.model.ToolsBidSuggestV2Pricing;
import com.bytedance.ads.model.ToolsBidSuggestV2Response;
import com.bytedance.ads.model.ToolsBidSuggestV2RetargetingType;
import com.bytedance.ads.model.ToolsBidSuggestV2ScheduleType;
import com.bytedance.ads.model.ToolsBidSuggestV2SuperiorPopularityType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/bid/suggest/ GET
public class ToolsBidSuggestV2ApiExample {

    private static final ToolsBidSuggestV2Api api = new ToolsBidSuggestV2Api();

    public static void main(String[] args) throws ApiException {
        List<ToolsBidSuggestV2Ac> ac = null;
        List<Long> actionCategories = null;
        ToolsBidSuggestV2ActionDays actionDays = null;
        List<ToolsBidSuggestV2ActionScene> actionScene = null;
        List<Long> actionWords = null;
        List<ToolsBidSuggestV2ActivateType> activateType = null;
        Long adId = null;
        List<Long> adTag = null;
        Long advertiserId = null;
        List<ToolsBidSuggestV2Age> age = null;
        ToolsBidSuggestV2AndroidOsv androidOsv = null;
        ToolsBidSuggestV2AppBehaviorTarget appBehaviorTarget = null;
        List<Long> appCategory = null;
        List<Long> appIds = null;
        List<ToolsBidSuggestV2ArticleCategory> articleCategory = null;
        Long audiencePackageId = null;
        List<ToolsBidSuggestV2AutoExtendTargets> autoExtendTargets = null;
        List<Long> awemeFanAccounts = null;
        List<ToolsBidSuggestV2AwemeFanBehaviors> awemeFanBehaviors = null;
        List<Long> awemeFanCategories = null;
        ToolsBidSuggestV2AwemeFanTimeScope awemeFanTimeScope = null;
        List<Long> awemeFansNumbers = null;
        ToolsBidSuggestV2BidMode bidMode = null;
        Long budget = null;
        ToolsBidSuggestV2BudgetMode budgetMode = null;
        List<Long> businessIds = null;
        Long campaignId = null;
        List<ToolsBidSuggestV2Career> career = null;
        List<ToolsBidSuggestV2Carrier> carrier = null;
        List<Long> city = null;
        Long convertId = null;
        ToolsBidSuggestV2ConvertedTimeDuration convertedTimeDuration = null;
        List<ToolsBidSuggestV2DeviceBrand> deviceBrand = null;
        List<ToolsBidSuggestV2DeviceType> deviceType = null;
        ToolsBidSuggestV2District district = null;
        ToolsBidSuggestV2DpaLocalAudience dpaLocalAudience = null;
        ToolsBidSuggestV2DpaRtaRecommendType dpaRtaRecommendType = null;
        ToolsBidSuggestV2DpaRtaSwitch dpaRtaSwitch = null;
        List<ToolsBidSuggestV2ExcludeCustomActionsInner> excludeCustomActions = null;
        List<Long> excludeFlowPackage = null;
        ToolsBidSuggestV2FilterAwemeAbnormalActive filterAwemeAbnormalActive = null;
        Long filterAwemeFansCount = null;
        ToolsBidSuggestV2FilterOwnAwemeFans filterOwnAwemeFans = null;
        ToolsBidSuggestV2FlowControlMode flowControlMode = null;
        List<Long> flowPackage = null;
        ToolsBidSuggestV2Gender gender = null;
        List<ToolsBidSuggestV2GeolocationInner> geolocation = null;
        ToolsBidSuggestV2HideIfConverted hideIfConverted = null;
        ToolsBidSuggestV2HideIfExists hideIfExists = null;
        List<ToolsBidSuggestV2IncludeCustomActionsInner> includeCustomActions = null;
        ToolsBidSuggestV2InterestActionMode interestActionMode = null;
        List<Long> interestCategories = null;
        List<Long> interestTags = null;
        List<Long> interestWords = null;
        ToolsBidSuggestV2IosOsv iosOsv = null;
        List<Long> launchPrice = null;
        ToolsBidSuggestV2LocationType locationType = null;
        List<ToolsBidSuggestV2Platform> platform = null;
        ToolsBidSuggestV2Pricing pricing = null;
        String regionVersion = null;
        List<Long> retargetingTags = null;
        List<Long> retargetingTagsExclude = null;
        List<Long> retargetingTagsInclude = null;
        ToolsBidSuggestV2RetargetingType retargetingType = null;
        ToolsBidSuggestV2ScheduleType scheduleType = null;
        ToolsBidSuggestV2SuperiorPopularityType superiorPopularityType = null;
        List<Long> userType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsBidSuggestV2Response response = api.openApi2ToolsBidSuggestGet(ac, actionCategories, actionDays, actionScene, actionWords, activateType, adId, adTag, advertiserId, age, androidOsv, appBehaviorTarget, appCategory, appIds, articleCategory, audiencePackageId, autoExtendTargets, awemeFanAccounts, awemeFanBehaviors, awemeFanCategories, awemeFanTimeScope, awemeFansNumbers, bidMode, budget, budgetMode, businessIds, campaignId, career, carrier, city, convertId, convertedTimeDuration, deviceBrand, deviceType, district, dpaLocalAudience, dpaRtaRecommendType, dpaRtaSwitch, excludeCustomActions, excludeFlowPackage, filterAwemeAbnormalActive, filterAwemeFansCount, filterOwnAwemeFans, flowControlMode, flowPackage, gender, geolocation, hideIfConverted, hideIfExists, includeCustomActions, interestActionMode, interestCategories, interestTags, interestWords, iosOsv, launchPrice, locationType, platform, pricing, regionVersion, retargetingTags, retargetingTagsExclude, retargetingTagsInclude, retargetingType, scheduleType, superiorPopularityType, userType);
        System.out.println(response);
    }

}