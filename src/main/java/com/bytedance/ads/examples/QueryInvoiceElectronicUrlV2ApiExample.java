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
import com.bytedance.ads.api.QueryInvoiceElectronicUrlV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QueryInvoiceElectronicUrlV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/query/invoice_electronic_url/ GET
public class QueryInvoiceElectronicUrlV2ApiExample {

    private static final QueryInvoiceElectronicUrlV2Api api = new QueryInvoiceElectronicUrlV2Api();

    public static void main(String[] args) throws ApiException {
        String invoiceSerial = null;
        List<Long> agentIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QueryInvoiceElectronicUrlV2Response response = api.openApi2QueryInvoiceElectronicUrlGet(invoiceSerial, agentIds);
        System.out.println(response);
    }

}