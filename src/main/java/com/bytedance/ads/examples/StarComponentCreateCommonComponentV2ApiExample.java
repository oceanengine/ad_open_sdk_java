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
import com.bytedance.ads.api.StarComponentCreateCommonComponentV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarComponentCreateCommonComponentV2Request;
import com.bytedance.ads.model.StarComponentCreateCommonComponentV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/component/create_common_component/ POST
public class StarComponentCreateCommonComponentV2ApiExample {

    private static final StarComponentCreateCommonComponentV2Api api = new StarComponentCreateCommonComponentV2Api();

    public static void main(String[] args) throws ApiException {
        StarComponentCreateCommonComponentV2Request starComponentCreateCommonComponentV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarComponentCreateCommonComponentV2Response response = api.openApi2StarComponentCreateCommonComponentPost(starComponentCreateCommonComponentV2Request);
        System.out.println(response);
    }

}