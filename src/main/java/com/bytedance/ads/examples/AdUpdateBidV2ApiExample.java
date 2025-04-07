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
import com.bytedance.ads.api.AdUpdateBidV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdUpdateBidV2Request;
import com.bytedance.ads.model.AdUpdateBidV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/ad/update/bid/ POST
public class AdUpdateBidV2ApiExample {

    private static final AdUpdateBidV2Api api = new AdUpdateBidV2Api();

    public static void main(String[] args) throws ApiException {
        AdUpdateBidV2Request adUpdateBidV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdUpdateBidV2Response response = api.openApi2AdUpdateBidPost(adUpdateBidV2Request);
        System.out.println(response);
    }

}