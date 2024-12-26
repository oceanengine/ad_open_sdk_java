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
import com.bytedance.ads.api.DpaProductCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaProductCreateV2Request;
import com.bytedance.ads.model.DpaProductCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/product/create/ POST
public class DpaProductCreateV2ApiExample {

    private static final DpaProductCreateV2Api api = new DpaProductCreateV2Api();

    public static void main(String[] args) throws ApiException {
        DpaProductCreateV2Request dpaProductCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaProductCreateV2Response response = api.openApi2DpaProductCreatePost(dpaProductCreateV2Request);
        System.out.println(response);
    }

}