/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.BrandCreativeDeleteV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandCreativeDeleteV30Request;
import com.bytedance.ads.model.BrandCreativeDeleteV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/creative/delete/ POST
public class BrandCreativeDeleteV30ApiExample {

    private static final BrandCreativeDeleteV30Api api = new BrandCreativeDeleteV30Api();

    public static void main(String[] args) throws ApiException {
        BrandCreativeDeleteV30Request brandCreativeDeleteV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandCreativeDeleteV30Response response = api.openApiV30BrandCreativeDeletePost(brandCreativeDeleteV30Request);
        System.out.println(response);
    }

}