/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsVideoCheckAvailableAnchorV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsVideoCheckAvailableAnchorV2ExternalAction;
import com.bytedance.ads.model.ToolsVideoCheckAvailableAnchorV2LandingType;
import com.bytedance.ads.model.ToolsVideoCheckAvailableAnchorV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/video/check_available_anchor/ GET
public class ToolsVideoCheckAvailableAnchorV2ApiExample {

    private static final ToolsVideoCheckAvailableAnchorV2Api api = new ToolsVideoCheckAvailableAnchorV2Api();

    public static void main(String[] args) throws ApiException {
        String advertiserId = null;
        List<Long> itemIds = null;
        ToolsVideoCheckAvailableAnchorV2LandingType landingType = null;
        ToolsVideoCheckAvailableAnchorV2ExternalAction externalAction = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsVideoCheckAvailableAnchorV2Response response = api.openApi2ToolsVideoCheckAvailableAnchorGet(advertiserId, itemIds, landingType, externalAction);
        System.out.println(response);
    }

}