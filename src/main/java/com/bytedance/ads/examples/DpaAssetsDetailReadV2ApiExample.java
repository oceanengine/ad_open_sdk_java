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
import com.bytedance.ads.api.DpaAssetsDetailReadV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaAssetsDetailReadV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/assets/detail/read/ GET
public class DpaAssetsDetailReadV2ApiExample {

    private static final DpaAssetsDetailReadV2Api api = new DpaAssetsDetailReadV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> assetIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaAssetsDetailReadV2Response response = api.openApi2DpaAssetsDetailReadGet(advertiserId, assetIds);
        System.out.println(response);
    }

}