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
import com.bytedance.ads.api.StarChallengeGetCustomTaskDataV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarChallengeGetCustomTaskDataV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/challenge/get_custom_task_data/ GET
public class StarChallengeGetCustomTaskDataV2ApiExample {

    private static final StarChallengeGetCustomTaskDataV2Api api = new StarChallengeGetCustomTaskDataV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long challengeTaskId = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarChallengeGetCustomTaskDataV2Response response = api.openApi2StarChallengeGetCustomTaskDataGet(starId, challengeTaskId, page, pageSize);
        System.out.println(response);
    }

}