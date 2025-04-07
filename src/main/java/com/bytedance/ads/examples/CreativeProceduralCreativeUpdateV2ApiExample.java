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
import com.bytedance.ads.api.CreativeProceduralCreativeUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2Request;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/procedural_creative/update/ POST
public class CreativeProceduralCreativeUpdateV2ApiExample {

    private static final CreativeProceduralCreativeUpdateV2Api api = new CreativeProceduralCreativeUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        CreativeProceduralCreativeUpdateV2Request creativeProceduralCreativeUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeProceduralCreativeUpdateV2Response response = api.openApi2CreativeProceduralCreativeUpdatePost(creativeProceduralCreativeUpdateV2Request);
        System.out.println(response);
    }

}