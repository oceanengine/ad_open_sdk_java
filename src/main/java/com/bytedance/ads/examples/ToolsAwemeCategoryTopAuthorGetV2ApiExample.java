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
import com.bytedance.ads.api.ToolsAwemeCategoryTopAuthorGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAwemeCategoryTopAuthorGetV2Behaviors;
import com.bytedance.ads.model.ToolsAwemeCategoryTopAuthorGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/aweme_category_top_author/get/ GET
public class ToolsAwemeCategoryTopAuthorGetV2ApiExample {

    private static final ToolsAwemeCategoryTopAuthorGetV2Api api = new ToolsAwemeCategoryTopAuthorGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<ToolsAwemeCategoryTopAuthorGetV2Behaviors> behaviors = null;
        Long categoryId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAwemeCategoryTopAuthorGetV2Response response = api.openApi2ToolsAwemeCategoryTopAuthorGetGet(advertiserId, behaviors, categoryId);
        System.out.println(response);
    }

}