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
import com.bytedance.ads.api.ToolsAbTestListGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAbTestListGetV2Filter;
import com.bytedance.ads.model.ToolsAbTestListGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ab_test_list/get/ GET
public class ToolsAbTestListGetV2ApiExample {

    private static final ToolsAbTestListGetV2Api api = new ToolsAbTestListGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsAbTestListGetV2Filter filter = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAbTestListGetV2Response response = api.openApi2ToolsAbTestListGetGet(advertiserId, filter, page, pageSize);
        System.out.println(response);
    }

}