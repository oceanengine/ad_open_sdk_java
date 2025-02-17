/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QueryStatementV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QueryStatementV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/query/statement/ GET
public class QueryStatementV2ApiExample {

    private static final QueryStatementV2Api api = new QueryStatementV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        List<Long> projectIdList = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QueryStatementV2Response response = api.openApi2QueryStatementGet(agentId, projectIdList);
        System.out.println(response);
    }

}