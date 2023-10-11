/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsActionTextGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsActionTextGetV2AdvancedCreativeType;
import com.bytedance.ads.model.ToolsActionTextGetV2LandingType;
import com.bytedance.ads.model.ToolsActionTextGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/action_text/get/ GET
public class ToolsActionTextGetV2ApiExample {

    private static final ToolsActionTextGetV2Api api = new ToolsActionTextGetV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsActionTextGetV2AdvancedCreativeType advancedCreativeType = null;
        Long advertiserId = null;
        Long industry = null;
        ToolsActionTextGetV2LandingType landingType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsActionTextGetV2Response response = api.openApi2ToolsActionTextGetGet(advancedCreativeType, advertiserId, industry, landingType);
        System.out.println(response);
    }

}