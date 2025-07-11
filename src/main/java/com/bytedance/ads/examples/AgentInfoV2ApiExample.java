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
import com.bytedance.ads.api.AgentInfoV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AgentInfoV2Fields;
import com.bytedance.ads.model.AgentInfoV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/agent/info/ GET
public class AgentInfoV2ApiExample {

    private static final AgentInfoV2Api api = new AgentInfoV2Api();

    public static void main(String[] args) throws ApiException {
        List<Long> advertiserIds = null;
        List<AgentInfoV2Fields> fields = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AgentInfoV2Response response = api.openApi2AgentInfoGet(advertiserIds, fields);
        System.out.println(response);
    }

}