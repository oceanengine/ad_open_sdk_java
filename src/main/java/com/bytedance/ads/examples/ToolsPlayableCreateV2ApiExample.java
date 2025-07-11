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
import com.bytedance.ads.api.ToolsPlayableCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPlayableCreateV2Request;
import com.bytedance.ads.model.ToolsPlayableCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/playable/create/ POST
public class ToolsPlayableCreateV2ApiExample {

    private static final ToolsPlayableCreateV2Api api = new ToolsPlayableCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsPlayableCreateV2Request toolsPlayableCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPlayableCreateV2Response response = api.openApi2ToolsPlayableCreatePost(toolsPlayableCreateV2Request);
        System.out.println(response);
    }

}