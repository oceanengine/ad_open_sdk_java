/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CdpBrandGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CdpBrandGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/cdp/brand/get/ GET
public class CdpBrandGetV30ApiExample {

    private static final CdpBrandGetV30Api api = new CdpBrandGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CdpBrandGetV30Response response = api.openApiV30CdpBrandGetGet(advertiserId);
        System.out.println(response);
    }

}