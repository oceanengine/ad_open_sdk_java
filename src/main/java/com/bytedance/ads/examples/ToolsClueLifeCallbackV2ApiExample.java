/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsClueLifeCallbackV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueLifeCallbackV2Request;
import com.bytedance.ads.model.ToolsClueLifeCallbackV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/life/callback/ POST
public class ToolsClueLifeCallbackV2ApiExample {

    private static final ToolsClueLifeCallbackV2Api api = new ToolsClueLifeCallbackV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsClueLifeCallbackV2Request toolsClueLifeCallbackV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueLifeCallbackV2Response response = api.openApi2ToolsClueLifeCallbackPost(toolsClueLifeCallbackV2Request);
        System.out.println(response);
    }

}