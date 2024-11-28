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
import com.bytedance.ads.api.Oauth2AdvertiserGetApi;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.Oauth2AdvertiserGetResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/oauth2/advertiser/get/ GET
public class Oauth2AdvertiserGetApiExample {

    private static final Oauth2AdvertiserGetApi api = new Oauth2AdvertiserGetApi();

    public static void main(String[] args) throws ApiException {
        String accessToken = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        Oauth2AdvertiserGetResponse response = api.openApiOauth2AdvertiserGetGet(accessToken);
        System.out.println(response);
    }

}