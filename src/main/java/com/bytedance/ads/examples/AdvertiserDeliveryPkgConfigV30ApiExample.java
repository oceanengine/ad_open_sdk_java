/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AdvertiserDeliveryPkgConfigV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvertiserDeliveryPkgConfigV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/advertiser/delivery_pkg_config/ GET
public class AdvertiserDeliveryPkgConfigV30ApiExample {

    private static final AdvertiserDeliveryPkgConfigV30Api api = new AdvertiserDeliveryPkgConfigV30Api();

    public static void main(String[] args) throws ApiException {
        Long firstIndustryId = null;
        Long secondIndustryId = null;
        Long thirdIndustryId = null;
        Long advertiserId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvertiserDeliveryPkgConfigV30Response response = api.openApiV30AdvertiserDeliveryPkgConfigGet(firstIndustryId, secondIndustryId, thirdIndustryId, advertiserId);
        System.out.println(response);
    }

}