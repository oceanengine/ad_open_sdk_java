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
import com.bytedance.ads.api.ToolsPlayableListGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPlayableListGetV2PlayableSource;
import com.bytedance.ads.model.ToolsPlayableListGetV2Response;
import com.bytedance.ads.model.ToolsPlayableListGetV2Status;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/playable_list/get/ GET
public class ToolsPlayableListGetV2ApiExample {

    private static final ToolsPlayableListGetV2Api api = new ToolsPlayableListGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long pageSize = null;
        ToolsPlayableListGetV2PlayableSource playableSource = null;
        String playableUrl = null;
        ToolsPlayableListGetV2Status status = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPlayableListGetV2Response response = api.openApi2ToolsPlayableListGetGet(advertiserId, page, pageSize, playableSource, playableUrl, status);
        System.out.println(response);
    }

}