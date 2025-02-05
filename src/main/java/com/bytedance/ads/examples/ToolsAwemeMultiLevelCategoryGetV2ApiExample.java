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
import com.bytedance.ads.api.ToolsAwemeMultiLevelCategoryGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAwemeMultiLevelCategoryGetV2Behaviors;
import com.bytedance.ads.model.ToolsAwemeMultiLevelCategoryGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/aweme_multi_level_category/get/ GET
public class ToolsAwemeMultiLevelCategoryGetV2ApiExample {

    private static final ToolsAwemeMultiLevelCategoryGetV2Api api = new ToolsAwemeMultiLevelCategoryGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<ToolsAwemeMultiLevelCategoryGetV2Behaviors> behaviors = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAwemeMultiLevelCategoryGetV2Response response = api.openApi2ToolsAwemeMultiLevelCategoryGetGet(advertiserId, behaviors);
        System.out.println(response);
    }

}