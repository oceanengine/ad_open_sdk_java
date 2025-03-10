/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QueryInvoiceDetailV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QueryInvoiceDetailV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/query/invoice_detail/ GET
public class QueryInvoiceDetailV2ApiExample {

    private static final QueryInvoiceDetailV2Api api = new QueryInvoiceDetailV2Api();

    public static void main(String[] args) throws ApiException {
        List<Long> agentIds = null;
        String invoiceSerial = null;
        Long invoiceId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QueryInvoiceDetailV2Response response = api.openApi2QueryInvoiceDetailGet(agentIds, invoiceSerial, invoiceId);
        System.out.println(response);
    }

}