/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsThirdSiteDeleteV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsThirdSiteDeleteV2Request;
import com.bytedance.ads.model.ToolsThirdSiteDeleteV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/third_site/delete/ POST
public class ToolsThirdSiteDeleteV2ApiExample {

    private static final ToolsThirdSiteDeleteV2Api api = new ToolsThirdSiteDeleteV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsThirdSiteDeleteV2Request toolsThirdSiteDeleteV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsThirdSiteDeleteV2Response response = api.openApi2ToolsThirdSiteDeletePost(toolsThirdSiteDeleteV2Request);
        System.out.println(response);
    }

}