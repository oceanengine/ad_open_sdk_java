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
import com.bytedance.ads.api.AgentAdvBiddingListQueryV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AgentAdvBiddingListQueryV2Filtering;
import com.bytedance.ads.model.AgentAdvBiddingListQueryV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/agent/adv/bidding/list/query/ GET
public class AgentAdvBiddingListQueryV2ApiExample {

    private static final AgentAdvBiddingListQueryV2Api api = new AgentAdvBiddingListQueryV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        String startDate = null;
        String endDate = null;
        AgentAdvBiddingListQueryV2Filtering filtering = null;
        Long cursor = null;
        Long cursorSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AgentAdvBiddingListQueryV2Response response = api.openApi2AgentAdvBiddingListQueryGet(agentId, startDate, endDate, filtering, cursor, cursorSize);
        System.out.println(response);
    }

}