/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAwemeSuggestBidV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAwemeSuggestBidV10Audience;
import com.bytedance.ads.model.QianchuanAwemeSuggestBidV10DeliverySetting;
import com.bytedance.ads.model.QianchuanAwemeSuggestBidV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/aweme/suggest_bid/ GET
public class QianchuanAwemeSuggestBidV10ApiExample {

    private static final QianchuanAwemeSuggestBidV10Api api = new QianchuanAwemeSuggestBidV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanAwemeSuggestBidV10DeliverySetting deliverySetting = null;
        QianchuanAwemeSuggestBidV10Audience audience = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAwemeSuggestBidV10Response response = api.openApiV10QianchuanAwemeSuggestBidGet(advertiserId, deliverySetting, audience);
        System.out.println(response);
    }

}