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
import com.bytedance.ads.api.BudgetGroupListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BudgetGroupListV30Filtering;
import com.bytedance.ads.model.BudgetGroupListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/budget_group/list/ GET
public class BudgetGroupListV30ApiExample {

    private static final BudgetGroupListV30Api api = new BudgetGroupListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long pageSize = null;
        BudgetGroupListV30Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BudgetGroupListV30Response response = api.openApiV30BudgetGroupListGet(advertiserId, page, pageSize, filtering);
        System.out.println(response);
    }

}