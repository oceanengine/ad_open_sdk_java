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
import com.bytedance.ads.api.ToolsRubeexGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsRubeexGetV2Filtering;
import com.bytedance.ads.model.ToolsRubeexGetV2PlatformName;
import com.bytedance.ads.model.ToolsRubeexGetV2ProjectStatus;
import com.bytedance.ads.model.ToolsRubeexGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/rubeex/get/ GET
public class ToolsRubeexGetV2ApiExample {

    private static final ToolsRubeexGetV2Api api = new ToolsRubeexGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsRubeexGetV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        List<ToolsRubeexGetV2PlatformName> platformName = null;
        List<ToolsRubeexGetV2ProjectStatus> projectStatus = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsRubeexGetV2Response response = api.openApi2ToolsRubeexGetGet(advertiserId, filtering, page, pageSize, platformName, projectStatus);
        System.out.println(response);
    }

}