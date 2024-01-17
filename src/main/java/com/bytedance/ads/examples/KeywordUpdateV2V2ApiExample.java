/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.KeywordUpdateV2V2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.KeywordUpdateV2V2Request;
import com.bytedance.ads.model.KeywordUpdateV2V2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/keyword/update_v2/ POST
public class KeywordUpdateV2V2ApiExample {

    private static final KeywordUpdateV2V2Api api = new KeywordUpdateV2V2Api();

    public static void main(String[] args) throws ApiException {
        KeywordUpdateV2V2Request keywordUpdateV2V2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        KeywordUpdateV2V2Response response = api.openApi2KeywordUpdateV2Post(keywordUpdateV2V2Request);
        System.out.println(response);
    }

}