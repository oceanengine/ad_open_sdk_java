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
import com.bytedance.ads.api.DpaPlayletAuthGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaPlayletAuthGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/playlet/auth/get/ GET
public class DpaPlayletAuthGetV2ApiExample {

    private static final DpaPlayletAuthGetV2Api api = new DpaPlayletAuthGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long platformId = null;
        Long productId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaPlayletAuthGetV2Response response = api.openApi2DpaPlayletAuthGetGet(advertiserId, platformId, productId);
        System.out.println(response);
    }

}