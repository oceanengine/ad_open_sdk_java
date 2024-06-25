/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QueryRebateBalanceV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QueryRebateBalanceV2Filtering;
import com.bytedance.ads.model.QueryRebateBalanceV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/query/rebate_balance/ GET
public class QueryRebateBalanceV2ApiExample {

    private static final QueryRebateBalanceV2Api api = new QueryRebateBalanceV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        QueryRebateBalanceV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QueryRebateBalanceV2Response response = api.openApi2QueryRebateBalanceGet(agentId, filtering, page, pageSize);
        System.out.println(response);
    }

}