/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanToolsAllowCouponV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanToolsAllowCouponV10CampaignScene;
import com.bytedance.ads.model.QianchuanToolsAllowCouponV10MarketingGoal;
import com.bytedance.ads.model.QianchuanToolsAllowCouponV10MarketingScene;
import com.bytedance.ads.model.QianchuanToolsAllowCouponV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/tools/allow_coupon/ GET
public class QianchuanToolsAllowCouponV10ApiExample {

    private static final QianchuanToolsAllowCouponV10Api api = new QianchuanToolsAllowCouponV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanToolsAllowCouponV10MarketingGoal marketingGoal = null;
        QianchuanToolsAllowCouponV10CampaignScene campaignScene = null;
        QianchuanToolsAllowCouponV10MarketingScene marketingScene = null;
        List<Long> awemeIds = null;
        List<Long> productIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanToolsAllowCouponV10Response response = api.openApiV10QianchuanToolsAllowCouponGet(advertiserId, marketingGoal, campaignScene, marketingScene, awemeIds, productIds);
        System.out.println(response);
    }

}