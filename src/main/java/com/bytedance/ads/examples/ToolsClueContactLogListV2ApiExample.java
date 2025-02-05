/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsClueContactLogListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueContactLogListV2Filter;
import com.bytedance.ads.model.ToolsClueContactLogListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/contact_log/list/ GET
public class ToolsClueContactLogListV2ApiExample {

    private static final ToolsClueContactLogListV2Api api = new ToolsClueContactLogListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long clueId = null;
        ToolsClueContactLogListV2Filter filter = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueContactLogListV2Response response = api.openApi2ToolsClueContactLogListGet(advertiserId, clueId, filter);
        System.out.println(response);
    }

}