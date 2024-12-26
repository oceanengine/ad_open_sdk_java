/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsRtaGetInfoV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsRtaGetInfoV2AccountType;
import com.bytedance.ads.model.ToolsRtaGetInfoV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/rta/get_info/ GET
public class ToolsRtaGetInfoV2ApiExample {

    private static final ToolsRtaGetInfoV2Api api = new ToolsRtaGetInfoV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long campaignId = null;
        ToolsRtaGetInfoV2AccountType accountType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsRtaGetInfoV2Response response = api.openApi2ToolsRtaGetInfoGet(advertiserId, campaignId, accountType);
        System.out.println(response);
    }

}