/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAipThirdSiteUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAipThirdSiteUpdateV2Request;
import com.bytedance.ads.model.ToolsAipThirdSiteUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/aip_third_site/update/ POST
public class ToolsAipThirdSiteUpdateV2ApiExample {

    private static final ToolsAipThirdSiteUpdateV2Api api = new ToolsAipThirdSiteUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAipThirdSiteUpdateV2Request toolsAipThirdSiteUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAipThirdSiteUpdateV2Response response = api.openApi2ToolsAipThirdSiteUpdatePost(toolsAipThirdSiteUpdateV2Request);
        System.out.println(response);
    }

}