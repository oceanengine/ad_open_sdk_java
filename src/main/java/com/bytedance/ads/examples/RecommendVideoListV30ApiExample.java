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
import com.bytedance.ads.api.RecommendVideoListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.RecommendVideoListV30Request;
import com.bytedance.ads.model.RecommendVideoListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/recommend/video/list/ POST
public class RecommendVideoListV30ApiExample {

    private static final RecommendVideoListV30Api api = new RecommendVideoListV30Api();

    public static void main(String[] args) throws ApiException {
        RecommendVideoListV30Request recommendVideoListV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        RecommendVideoListV30Response response = api.openApiV30RecommendVideoListPost(recommendVideoListV30Request);
        System.out.println(response);
    }

}