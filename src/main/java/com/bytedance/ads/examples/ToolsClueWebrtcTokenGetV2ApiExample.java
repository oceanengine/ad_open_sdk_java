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
import com.bytedance.ads.api.ToolsClueWebrtcTokenGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueWebrtcTokenGetV2Request;
import com.bytedance.ads.model.ToolsClueWebrtcTokenGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/webrtc/token/get/ POST
public class ToolsClueWebrtcTokenGetV2ApiExample {

    private static final ToolsClueWebrtcTokenGetV2Api api = new ToolsClueWebrtcTokenGetV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsClueWebrtcTokenGetV2Request toolsClueWebrtcTokenGetV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueWebrtcTokenGetV2Response response = api.openApi2ToolsClueWebrtcTokenGetPost(toolsClueWebrtcTokenGetV2Request);
        System.out.println(response);
    }

}