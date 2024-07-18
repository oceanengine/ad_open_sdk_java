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
import com.bytedance.ads.api.ToolsAipThirdSiteCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAipThirdSiteCreateV2Request;
import com.bytedance.ads.model.ToolsAipThirdSiteCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/aip_third_site/create/ POST
public class ToolsAipThirdSiteCreateV2ApiExample {

    private static final ToolsAipThirdSiteCreateV2Api api = new ToolsAipThirdSiteCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAipThirdSiteCreateV2Request toolsAipThirdSiteCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAipThirdSiteCreateV2Response response = api.openApi2ToolsAipThirdSiteCreatePost(toolsAipThirdSiteCreateV2Request);
        System.out.println(response);
    }

}