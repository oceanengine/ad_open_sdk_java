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
import com.bytedance.ads.api.DpaAssetV2DetailReadV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaAssetV2DetailReadV2Request;
import com.bytedance.ads.model.DpaAssetV2DetailReadV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/asset_v2/detail/read/ POST
public class DpaAssetV2DetailReadV2ApiExample {

    private static final DpaAssetV2DetailReadV2Api api = new DpaAssetV2DetailReadV2Api();

    public static void main(String[] args) throws ApiException {
        DpaAssetV2DetailReadV2Request dpaAssetV2DetailReadV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaAssetV2DetailReadV2Response response = api.openApi2DpaAssetV2DetailReadPost(dpaAssetV2DetailReadV2Request);
        System.out.println(response);
    }

}