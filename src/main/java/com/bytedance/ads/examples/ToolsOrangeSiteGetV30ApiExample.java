/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsOrangeSiteGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsOrangeSiteGetV30Filtering;
import com.bytedance.ads.model.ToolsOrangeSiteGetV30OptimizeGoal;
import com.bytedance.ads.model.ToolsOrangeSiteGetV30Response;
import com.bytedance.ads.model.ToolsOrangeSiteGetV30Status;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/orange_site/get/ GET
public class ToolsOrangeSiteGetV30ApiExample {

    private static final ToolsOrangeSiteGetV30Api api = new ToolsOrangeSiteGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Integer page = null;
        Integer pageSize = null;
        ToolsOrangeSiteGetV30OptimizeGoal optimizeGoal = null;
        ToolsOrangeSiteGetV30Status status = null;
        ToolsOrangeSiteGetV30Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsOrangeSiteGetV30Response response = api.openApiV30ToolsOrangeSiteGetGet(advertiserId, page, pageSize, optimizeGoal, status, filtering);
        System.out.println(response);
    }

}