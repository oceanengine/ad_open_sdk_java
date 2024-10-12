/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsKeywordsBidRatioGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsKeywordsBidRatioGetV30Filtering;
import com.bytedance.ads.model.ToolsKeywordsBidRatioGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/keywords_bid_ratio/get/ GET
public class ToolsKeywordsBidRatioGetV30ApiExample {

    private static final ToolsKeywordsBidRatioGetV30Api api = new ToolsKeywordsBidRatioGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsKeywordsBidRatioGetV30Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsKeywordsBidRatioGetV30Response response = api.openApiV30ToolsKeywordsBidRatioGetGet(advertiserId, filtering);
        System.out.println(response);
    }

}