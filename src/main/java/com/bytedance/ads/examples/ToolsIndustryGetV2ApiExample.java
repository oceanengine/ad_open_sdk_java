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
import com.bytedance.ads.api.ToolsIndustryGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsIndustryGetV2Level;
import com.bytedance.ads.model.ToolsIndustryGetV2Response;
import com.bytedance.ads.model.ToolsIndustryGetV2Type;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/industry/get/ GET
public class ToolsIndustryGetV2ApiExample {

    private static final ToolsIndustryGetV2Api api = new ToolsIndustryGetV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsIndustryGetV2Level level = null;
        ToolsIndustryGetV2Type type = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsIndustryGetV2Response response = api.openApi2ToolsIndustryGetGet(level, type);
        System.out.println(response);
    }

}