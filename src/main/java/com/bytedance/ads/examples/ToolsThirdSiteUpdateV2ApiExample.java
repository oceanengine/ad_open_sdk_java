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
import com.bytedance.ads.api.ToolsThirdSiteUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsThirdSiteUpdateV2Request;
import com.bytedance.ads.model.ToolsThirdSiteUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/third_site/update/ POST
public class ToolsThirdSiteUpdateV2ApiExample {

    private static final ToolsThirdSiteUpdateV2Api api = new ToolsThirdSiteUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsThirdSiteUpdateV2Request toolsThirdSiteUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsThirdSiteUpdateV2Response response = api.openApi2ToolsThirdSiteUpdatePost(toolsThirdSiteUpdateV2Request);
        System.out.println(response);
    }

}