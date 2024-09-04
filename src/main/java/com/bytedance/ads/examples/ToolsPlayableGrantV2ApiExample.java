/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPlayableGrantV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPlayableGrantV2Request;
import com.bytedance.ads.model.ToolsPlayableGrantV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/playable/grant/ POST
public class ToolsPlayableGrantV2ApiExample {

    private static final ToolsPlayableGrantV2Api api = new ToolsPlayableGrantV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsPlayableGrantV2Request toolsPlayableGrantV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPlayableGrantV2Response response = api.openApi2ToolsPlayableGrantPost(toolsPlayableGrantV2Request);
        System.out.println(response);
    }

}