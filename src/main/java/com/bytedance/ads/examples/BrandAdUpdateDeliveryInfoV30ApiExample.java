/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.BrandAdUpdateDeliveryInfoV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandAdUpdateDeliveryInfoV30Request;
import com.bytedance.ads.model.BrandAdUpdateDeliveryInfoV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/ad/update_delivery_info/ POST
public class BrandAdUpdateDeliveryInfoV30ApiExample {

    private static final BrandAdUpdateDeliveryInfoV30Api api = new BrandAdUpdateDeliveryInfoV30Api();

    public static void main(String[] args) throws ApiException {
        BrandAdUpdateDeliveryInfoV30Request brandAdUpdateDeliveryInfoV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandAdUpdateDeliveryInfoV30Response response = api.openApiV30BrandAdUpdateDeliveryInfoPost(brandAdUpdateDeliveryInfoV30Request);
        System.out.println(response);
    }

}