/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarDemandOmGetChallengeDispatchedProviderListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarDemandOmGetChallengeDispatchedProviderListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/demand/om_get_challenge_dispatched_provider_list/ GET
public class StarDemandOmGetChallengeDispatchedProviderListV2ApiExample {

    private static final StarDemandOmGetChallengeDispatchedProviderListV2Api api = new StarDemandOmGetChallengeDispatchedProviderListV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long challengeTaskId = null;
        Integer page = null;
        Integer limit = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarDemandOmGetChallengeDispatchedProviderListV2Response response = api.openApi2StarDemandOmGetChallengeDispatchedProviderListGet(starId, challengeTaskId, page, limit);
        System.out.println(response);
    }

}