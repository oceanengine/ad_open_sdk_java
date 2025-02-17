/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.Oauth2RefreshTokenApi;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.Oauth2RefreshTokenRequest;
import com.bytedance.ads.model.Oauth2RefreshTokenResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/oauth2/refresh_token/ POST
public class Oauth2RefreshTokenApiExample {

    private static final Oauth2RefreshTokenApi api = new Oauth2RefreshTokenApi();

    public static void main(String[] args) throws ApiException {
        Oauth2RefreshTokenRequest oauth2RefreshTokenRequest = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        Oauth2RefreshTokenResponse response = api.openApiOauth2RefreshTokenPost(oauth2RefreshTokenRequest);
        System.out.println(response);
    }

}