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
import com.bytedance.ads.api.Oauth2AccessTokenApi;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.Oauth2AccessTokenRequest;
import com.bytedance.ads.model.Oauth2AccessTokenResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/oauth2/access_token/ POST
public class Oauth2AccessTokenApiExample {

    private static final Oauth2AccessTokenApi api = new Oauth2AccessTokenApi();

    public static void main(String[] args) throws ApiException {
        Oauth2AccessTokenRequest oauth2AccessTokenRequest = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        Oauth2AccessTokenResponse response = api.openApiOauth2AccessTokenPost(oauth2AccessTokenRequest);
        System.out.println(response);
    }

}