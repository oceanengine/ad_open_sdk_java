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
import com.bytedance.ads.api.AgentAdvertiserSelectV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AgentAdvertiserSelectV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/agent/advertiser/select/ GET
public class AgentAdvertiserSelectV2ApiExample {

    private static final AgentAdvertiserSelectV2Api api = new AgentAdvertiserSelectV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> companyIds = null;
        Long count = null;
        Long cursor = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AgentAdvertiserSelectV2Response response = api.openApi2AgentAdvertiserSelectGet(advertiserId, companyIds, count, cursor, page, pageSize);
        System.out.println(response);
    }

}