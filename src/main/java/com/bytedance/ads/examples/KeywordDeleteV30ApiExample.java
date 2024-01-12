/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.KeywordDeleteV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.KeywordDeleteV30Request;
import com.bytedance.ads.model.KeywordDeleteV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/keyword/delete/ POST
public class KeywordDeleteV30ApiExample {

    private static final KeywordDeleteV30Api api = new KeywordDeleteV30Api();

    public static void main(String[] args) throws ApiException {
        KeywordDeleteV30Request keywordDeleteV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        KeywordDeleteV30Response response = api.openApiV30KeywordDeletePost(keywordDeleteV30Request);
        System.out.println(response);
    }

}