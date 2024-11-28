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
import com.bytedance.ads.api.LocalProjectCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalProjectCreateV30Request;
import com.bytedance.ads.model.LocalProjectCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/project/create/ POST
public class LocalProjectCreateV30ApiExample {

    private static final LocalProjectCreateV30Api api = new LocalProjectCreateV30Api();

    public static void main(String[] args) throws ApiException {
        LocalProjectCreateV30Request localProjectCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalProjectCreateV30Response response = api.openApiV30LocalProjectCreatePost(localProjectCreateV30Request);
        System.out.println(response);
    }

}