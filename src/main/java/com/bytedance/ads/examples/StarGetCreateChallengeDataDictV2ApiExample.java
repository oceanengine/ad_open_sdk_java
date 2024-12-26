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
import com.bytedance.ads.api.StarGetCreateChallengeDataDictV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarGetCreateChallengeDataDictV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/get_create_challenge_data_dict/ GET
public class StarGetCreateChallengeDataDictV2ApiExample {

    private static final StarGetCreateChallengeDataDictV2Api api = new StarGetCreateChallengeDataDictV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarGetCreateChallengeDataDictV2Response response = api.openApi2StarGetCreateChallengeDataDictGet(starId);
        System.out.println(response);
    }

}