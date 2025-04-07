/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AudiencePackageGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AudiencePackageGetV30Filtering;
import com.bytedance.ads.model.AudiencePackageGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/audience_package/get/ GET
public class AudiencePackageGetV30ApiExample {

    private static final AudiencePackageGetV30Api api = new AudiencePackageGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        AudiencePackageGetV30Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AudiencePackageGetV30Response response = api.openApiV30AudiencePackageGetGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}