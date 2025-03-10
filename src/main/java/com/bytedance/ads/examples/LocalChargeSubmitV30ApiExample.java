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
import com.bytedance.ads.api.LocalChargeSubmitV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalChargeSubmitV30Request;
import com.bytedance.ads.model.LocalChargeSubmitV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/charge/submit/ POST
public class LocalChargeSubmitV30ApiExample {

    private static final LocalChargeSubmitV30Api api = new LocalChargeSubmitV30Api();

    public static void main(String[] args) throws ApiException {
        LocalChargeSubmitV30Request localChargeSubmitV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalChargeSubmitV30Response response = api.openApiV30LocalChargeSubmitPost(localChargeSubmitV30Request);
        System.out.println(response);
    }

}