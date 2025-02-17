/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.EnterpriseInfoV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EnterpriseInfoV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/enterprise/info/ GET
public class EnterpriseInfoV10ApiExample {

    private static final EnterpriseInfoV10Api api = new EnterpriseInfoV10Api();

    public static void main(String[] args) throws ApiException {
        List<String> eDouyinIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EnterpriseInfoV10Response response = api.openApiV10EnterpriseInfoGet(eDouyinIds);
        System.out.println(response);
    }

}