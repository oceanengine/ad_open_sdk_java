/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AssetsCreativeComponentUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AssetsCreativeComponentUpdateV2Request;
import com.bytedance.ads.model.AssetsCreativeComponentUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/assets/creative_component/update/ POST
public class AssetsCreativeComponentUpdateV2ApiExample {

    private static final AssetsCreativeComponentUpdateV2Api api = new AssetsCreativeComponentUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        AssetsCreativeComponentUpdateV2Request assetsCreativeComponentUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AssetsCreativeComponentUpdateV2Response response = api.openApi2AssetsCreativeComponentUpdatePost(assetsCreativeComponentUpdateV2Request);
        System.out.println(response);
    }

}