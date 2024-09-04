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
import com.bytedance.ads.api.ToolsCluePrivateMessageCallbackV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsCluePrivateMessageCallbackV2Request;
import com.bytedance.ads.model.ToolsCluePrivateMessageCallbackV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/private_message/callback/ POST
public class ToolsCluePrivateMessageCallbackV2ApiExample {

    private static final ToolsCluePrivateMessageCallbackV2Api api = new ToolsCluePrivateMessageCallbackV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsCluePrivateMessageCallbackV2Request toolsCluePrivateMessageCallbackV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsCluePrivateMessageCallbackV2Response response = api.openApi2ToolsCluePrivateMessageCallbackPost(toolsCluePrivateMessageCallbackV2Request);
        System.out.println(response);
    }

}