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
import com.bytedance.ads.api.QueryInvoiceV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QueryInvoiceV2Filtering;
import com.bytedance.ads.model.QueryInvoiceV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/query/invoice/ GET
public class QueryInvoiceV2ApiExample {

    private static final QueryInvoiceV2Api api = new QueryInvoiceV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        QueryInvoiceV2Filtering filtering = null;
        Integer pageSize = null;
        Long page = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QueryInvoiceV2Response response = api.openApi2QueryInvoiceGet(agentId, filtering, pageSize, page);
        System.out.println(response);
    }

}