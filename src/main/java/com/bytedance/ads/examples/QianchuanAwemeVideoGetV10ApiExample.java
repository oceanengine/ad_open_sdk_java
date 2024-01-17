/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAwemeVideoGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAwemeVideoGetV10MarketingGoal;
import com.bytedance.ads.model.QianchuanAwemeVideoGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/aweme/video/get/ GET
public class QianchuanAwemeVideoGetV10ApiExample {

    private static final QianchuanAwemeVideoGetV10Api api = new QianchuanAwemeVideoGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        QianchuanAwemeVideoGetV10MarketingGoal marketingGoal = null;
        Long cursor = null;
        Long count = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAwemeVideoGetV10Response response = api.openApiV10QianchuanAwemeVideoGetGet(advertiserId, awemeId, marketingGoal, cursor, count);
        System.out.println(response);
    }

}