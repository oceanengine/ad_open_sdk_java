/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.BrandAdUpdateBaseInfoV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandAdUpdateBaseInfoV30Request;
import com.bytedance.ads.model.BrandAdUpdateBaseInfoV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/ad/update_base_info/ POST
public class BrandAdUpdateBaseInfoV30ApiExample {

    private static final BrandAdUpdateBaseInfoV30Api api = new BrandAdUpdateBaseInfoV30Api();

    public static void main(String[] args) throws ApiException {
        BrandAdUpdateBaseInfoV30Request brandAdUpdateBaseInfoV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandAdUpdateBaseInfoV30Response response = api.openApiV30BrandAdUpdateBaseInfoPost(brandAdUpdateBaseInfoV30Request);
        System.out.println(response);
    }

}