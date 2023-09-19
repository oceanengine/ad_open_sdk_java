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
import com.bytedance.ads.api.QianchuanSuggestBidV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanSuggestBidV10CampaignScene;
import com.bytedance.ads.model.QianchuanSuggestBidV10ExternalAction;
import com.bytedance.ads.model.QianchuanSuggestBidV10MarketingGoal;
import com.bytedance.ads.model.QianchuanSuggestBidV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/suggest_bid/ GET
public class QianchuanSuggestBidV10ApiExample {

    private static final QianchuanSuggestBidV10Api api = new QianchuanSuggestBidV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanSuggestBidV10MarketingGoal marketingGoal = null;
        QianchuanSuggestBidV10ExternalAction externalAction = null;
        Long awemeId = null;
        Long productId = null;
        QianchuanSuggestBidV10CampaignScene campaignScene = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanSuggestBidV10Response response = api.openApiV10QianchuanSuggestBidGet(advertiserId, marketingGoal, externalAction, awemeId, productId, campaignScene);
        System.out.println(response);
    }

}