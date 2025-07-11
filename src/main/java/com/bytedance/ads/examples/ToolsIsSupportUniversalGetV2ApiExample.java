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
import com.bytedance.ads.api.ToolsIsSupportUniversalGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2DeepBidType;
import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2DeepExternalAction;
import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2ExternalAction;
import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2LandingType;
import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/is_support_universal/get/ GET
public class ToolsIsSupportUniversalGetV2ApiExample {

    private static final ToolsIsSupportUniversalGetV2Api api = new ToolsIsSupportUniversalGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsIsSupportUniversalGetV2LandingType landingType = null;
        ToolsIsSupportUniversalGetV2ExternalAction externalAction = null;
        ToolsIsSupportUniversalGetV2DeepExternalAction deepExternalAction = null;
        ToolsIsSupportUniversalGetV2DeepBidType deepBidType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsIsSupportUniversalGetV2Response response = api.openApi2ToolsIsSupportUniversalGetGet(advertiserId, landingType, externalAction, deepExternalAction, deepBidType);
        System.out.println(response);
    }

}