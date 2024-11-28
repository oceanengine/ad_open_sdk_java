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
import com.bytedance.ads.api.AdvertiserDeliveryPkgSubmitV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvertiserDeliveryPkgSubmitV30Request;
import com.bytedance.ads.model.AdvertiserDeliveryPkgSubmitV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/advertiser/delivery_pkg/submit/ POST
public class AdvertiserDeliveryPkgSubmitV30ApiExample {

    private static final AdvertiserDeliveryPkgSubmitV30Api api = new AdvertiserDeliveryPkgSubmitV30Api();

    public static void main(String[] args) throws ApiException {
        AdvertiserDeliveryPkgSubmitV30Request advertiserDeliveryPkgSubmitV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvertiserDeliveryPkgSubmitV30Response response = api.openApiV30AdvertiserDeliveryPkgSubmitPost(advertiserDeliveryPkgSubmitV30Request);
        System.out.println(response);
    }

}