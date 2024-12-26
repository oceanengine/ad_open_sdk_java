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


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.PromotionAutoGenerateConfigGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.PromotionAutoGenerateConfigGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/promotion/auto_generate_config/get/ GET
public class PromotionAutoGenerateConfigGetV30ApiExample {

    private static final PromotionAutoGenerateConfigGetV30Api api = new PromotionAutoGenerateConfigGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long configId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        PromotionAutoGenerateConfigGetV30Response response = api.openApiV30PromotionAutoGenerateConfigGetGet(advertiserId, configId);
        System.out.println(response);
    }

}