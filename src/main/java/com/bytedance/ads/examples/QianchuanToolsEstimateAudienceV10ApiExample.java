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


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanToolsEstimateAudienceV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10Audience;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10ExternalAction;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10MarketingGoal;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/tools/estimate_audience/ GET
public class QianchuanToolsEstimateAudienceV10ApiExample {

    private static final QianchuanToolsEstimateAudienceV10Api api = new QianchuanToolsEstimateAudienceV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanToolsEstimateAudienceV10MarketingGoal marketingGoal = null;
        QianchuanToolsEstimateAudienceV10ExternalAction externalAction = null;
        Long productId = null;
        Long awemeId = null;
        QianchuanToolsEstimateAudienceV10Audience audience = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanToolsEstimateAudienceV10Response response = api.openApiV10QianchuanToolsEstimateAudienceGet(advertiserId, marketingGoal, externalAction, productId, awemeId, audience);
        System.out.println(response);
    }

}