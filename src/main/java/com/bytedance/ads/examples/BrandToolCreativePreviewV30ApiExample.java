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
import com.bytedance.ads.api.BrandToolCreativePreviewV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandToolCreativePreviewV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/tool/creative_preview/ GET
public class BrandToolCreativePreviewV30ApiExample {

    private static final BrandToolCreativePreviewV30Api api = new BrandToolCreativePreviewV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long creativeId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandToolCreativePreviewV30Response response = api.openApiV30BrandToolCreativePreviewGet(advertiserId, creativeId);
        System.out.println(response);
    }

}