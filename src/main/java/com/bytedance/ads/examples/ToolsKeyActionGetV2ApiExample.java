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
import com.bytedance.ads.api.ToolsKeyActionGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsKeyActionGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/key_action/get/ GET
public class ToolsKeyActionGetV2ApiExample {

    private static final ToolsKeyActionGetV2Api api = new ToolsKeyActionGetV2Api();

    public static void main(String[] args) throws ApiException {
        List<Long> advertiserIds = null;
        String endTime = null;
        Long page = null;
        Long pageSize = null;
        String startTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsKeyActionGetV2Response response = api.openApi2ToolsKeyActionGetGet(advertiserIds, endTime, page, pageSize, startTime);
        System.out.println(response);
    }

}