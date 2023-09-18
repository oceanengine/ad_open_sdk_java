/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsInterestActionInterestCategoryV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsInterestActionInterestCategoryV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/interest_action/interest/category/ GET
public class ToolsInterestActionInterestCategoryV2ApiExample {

    private static final ToolsInterestActionInterestCategoryV2Api api = new ToolsInterestActionInterestCategoryV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsInterestActionInterestCategoryV2Response response = api.openApi2ToolsInterestActionInterestCategoryGet(advertiserId);
        System.out.println(response);
    }

}