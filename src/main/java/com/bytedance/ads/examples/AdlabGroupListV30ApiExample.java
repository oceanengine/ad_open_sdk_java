/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AdlabGroupListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdlabGroupListV30Filtering;
import com.bytedance.ads.model.AdlabGroupListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/adlab/group/list/ GET
public class AdlabGroupListV30ApiExample {

    private static final AdlabGroupListV30Api api = new AdlabGroupListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        AdlabGroupListV30Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdlabGroupListV30Response response = api.openApiV30AdlabGroupListGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}