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
import com.bytedance.ads.api.ToolsAipThirdSiteGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAipThirdSiteGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/aip_third_site/get/ GET
public class ToolsAipThirdSiteGetV2ApiExample {

    private static final ToolsAipThirdSiteGetV2Api api = new ToolsAipThirdSiteGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long siteId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAipThirdSiteGetV2Response response = api.openApi2ToolsAipThirdSiteGetGet(advertiserId, siteId);
        System.out.println(response);
    }

}