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
import com.bytedance.ads.api.SubscribeAccountsAddV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.SubscribeAccountsAddV30Request;
import com.bytedance.ads.model.SubscribeAccountsAddV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/subscribe/accounts/add/ POST
public class SubscribeAccountsAddV30ApiExample {

    private static final SubscribeAccountsAddV30Api api = new SubscribeAccountsAddV30Api();

    public static void main(String[] args) throws ApiException {
        String apPAccessToken = null;
        SubscribeAccountsAddV30Request subscribeAccountsAddV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        SubscribeAccountsAddV30Response response = api.openApiV30SubscribeAccountsAddPost(apPAccessToken, subscribeAccountsAddV30Request);
        System.out.println(response);
    }

}