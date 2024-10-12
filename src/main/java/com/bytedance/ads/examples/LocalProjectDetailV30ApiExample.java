/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.LocalProjectDetailV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalProjectDetailV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/project/detail/ GET
public class LocalProjectDetailV30ApiExample {

    private static final LocalProjectDetailV30Api api = new LocalProjectDetailV30Api();

    public static void main(String[] args) throws ApiException {
        Long localAccountId = null;
        Long projectId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalProjectDetailV30Response response = api.openApiV30LocalProjectDetailGet(localAccountId, projectId);
        System.out.println(response);
    }

}