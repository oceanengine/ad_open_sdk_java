/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsClueContactLogOverviewQueryV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueContactLogOverviewQueryV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/contact_log/overview/query/ GET
public class ToolsClueContactLogOverviewQueryV2ApiExample {

    private static final ToolsClueContactLogOverviewQueryV2Api api = new ToolsClueContactLogOverviewQueryV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long startTime = null;
        Long endTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueContactLogOverviewQueryV2Response response = api.openApi2ToolsClueContactLogOverviewQueryGet(advertiserId, startTime, endTime);
        System.out.println(response);
    }

}