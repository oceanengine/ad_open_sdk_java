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
import com.bytedance.ads.api.LocalChargeResultV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalChargeResultV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/charge/result/ GET
public class LocalChargeResultV30ApiExample {

    private static final LocalChargeResultV30Api api = new LocalChargeResultV30Api();

    public static void main(String[] args) throws ApiException {
        Long localAccountId = null;
        Long chargeOrderId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalChargeResultV30Response response = api.openApiV30LocalChargeResultGet(localAccountId, chargeOrderId);
        System.out.println(response);
    }

}