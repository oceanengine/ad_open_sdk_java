/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ServeMarketOrderGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ServeMarketOrderGetV10Filtering;
import com.bytedance.ads.model.ServeMarketOrderGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/serve_market/order/get/ GET
public class ServeMarketOrderGetV10ApiExample {

    private static final ServeMarketOrderGetV10Api api = new ServeMarketOrderGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long appId = null;
        ServeMarketOrderGetV10Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ServeMarketOrderGetV10Response response = api.openApiV10ServeMarketOrderGetGet(appId, filtering, page, pageSize);
        System.out.println(response);
    }

}