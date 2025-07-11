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
import com.bytedance.ads.api.StarDemandOmExpandChallengeV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarDemandOmExpandChallengeV2Request;
import com.bytedance.ads.model.StarDemandOmExpandChallengeV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/demand/om_expand_challenge/ POST
public class StarDemandOmExpandChallengeV2ApiExample {

    private static final StarDemandOmExpandChallengeV2Api api = new StarDemandOmExpandChallengeV2Api();

    public static void main(String[] args) throws ApiException {
        StarDemandOmExpandChallengeV2Request starDemandOmExpandChallengeV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarDemandOmExpandChallengeV2Response response = api.openApi2StarDemandOmExpandChallengePost(starDemandOmExpandChallengeV2Request);
        System.out.println(response);
    }

}