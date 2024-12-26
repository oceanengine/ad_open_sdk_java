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
import com.bytedance.ads.api.AdvertiserQualificationSelectV2V2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvertiserQualificationSelectV2V2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/advertiser/qualification/select_v2/ GET
public class AdvertiserQualificationSelectV2V2ApiExample {

    private static final AdvertiserQualificationSelectV2V2Api api = new AdvertiserQualificationSelectV2V2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvertiserQualificationSelectV2V2Response response = api.openApi2AdvertiserQualificationSelectV2Get(advertiserId);
        System.out.println(response);
    }

}