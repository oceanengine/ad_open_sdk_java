/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsRubeexPlayableListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsRubeexPlayableListV2Filtering;
import com.bytedance.ads.model.ToolsRubeexPlayableListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/rubeex_playable/list/ GET
public class ToolsRubeexPlayableListV2ApiExample {

    private static final ToolsRubeexPlayableListV2Api api = new ToolsRubeexPlayableListV2Api();

    public static void main(String[] args) throws ApiException {
        Integer projectId = null;
        Long advertiserId = null;
        Integer page = null;
        Integer pageSize = null;
        ToolsRubeexPlayableListV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsRubeexPlayableListV2Response response = api.openApi2ToolsRubeexPlayableListGet(projectId, advertiserId, page, pageSize, filtering);
        System.out.println(response);
    }

}