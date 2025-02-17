/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsLandingGroupCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsLandingGroupCreateV2Request;
import com.bytedance.ads.model.ToolsLandingGroupCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/landing_group/create/ POST
public class ToolsLandingGroupCreateV2ApiExample {

    private static final ToolsLandingGroupCreateV2Api api = new ToolsLandingGroupCreateV2Api();

    public static void main(String[] args) throws ApiException {
        String xOrangeCaller = null;
        ToolsLandingGroupCreateV2Request toolsLandingGroupCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsLandingGroupCreateV2Response response = api.openApi2ToolsLandingGroupCreatePost(xOrangeCaller, toolsLandingGroupCreateV2Request);
        System.out.println(response);
    }

}