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
import com.bytedance.ads.api.AicElementDeleteV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AicElementDeleteV30Request;
import com.bytedance.ads.model.AicElementDeleteV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/aic/element/delete/ POST
public class AicElementDeleteV30ApiExample {

    private static final AicElementDeleteV30Api api = new AicElementDeleteV30Api();

    public static void main(String[] args) throws ApiException {
        AicElementDeleteV30Request aicElementDeleteV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AicElementDeleteV30Response response = api.openApiV30AicElementDeletePost(aicElementDeleteV30Request);
        System.out.println(response);
    }

}