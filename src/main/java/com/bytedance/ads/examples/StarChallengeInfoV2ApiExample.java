/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarChallengeInfoV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarChallengeInfoV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/challenge/info/ GET
public class StarChallengeInfoV2ApiExample {

    private static final StarChallengeInfoV2Api api = new StarChallengeInfoV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        List<Long> challengeTaskIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarChallengeInfoV2Response response = api.openApi2StarChallengeInfoGet(starId, challengeTaskIds);
        System.out.println(response);
    }

}