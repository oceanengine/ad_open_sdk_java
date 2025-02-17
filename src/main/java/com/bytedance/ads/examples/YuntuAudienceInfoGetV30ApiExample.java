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
import com.bytedance.ads.api.YuntuAudienceInfoGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.YuntuAudienceInfoGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/yuntu/audience_info/get/ GET
public class YuntuAudienceInfoGetV30ApiExample {

    private static final YuntuAudienceInfoGetV30Api api = new YuntuAudienceInfoGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long yuntuBrandId = null;
        Long serviceProviderId = null;
        Long advertiserId = null;
        Long customAudienceId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        YuntuAudienceInfoGetV30Response response = api.openApiV30YuntuAudienceInfoGetGet(yuntuBrandId, serviceProviderId, advertiserId, customAudienceId);
        System.out.println(response);
    }

}