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
import com.bytedance.ads.api.DpaProductAvailablesV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaProductAvailablesV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/product/availables/ GET
public class DpaProductAvailablesV2ApiExample {

    private static final DpaProductAvailablesV2Api api = new DpaProductAvailablesV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaProductAvailablesV2Response response = api.openApi2DpaProductAvailablesGet(advertiserId);
        System.out.println(response);
    }

}