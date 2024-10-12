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
import com.bytedance.ads.api.YuntuAudienceInfoCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.YuntuAudienceInfoCreateV30Request;
import com.bytedance.ads.model.YuntuAudienceInfoCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/yuntu/audience_info/create/ POST
public class YuntuAudienceInfoCreateV30ApiExample {

    private static final YuntuAudienceInfoCreateV30Api api = new YuntuAudienceInfoCreateV30Api();

    public static void main(String[] args) throws ApiException {
        YuntuAudienceInfoCreateV30Request yuntuAudienceInfoCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        YuntuAudienceInfoCreateV30Response response = api.openApiV30YuntuAudienceInfoCreatePost(yuntuAudienceInfoCreateV30Request);
        System.out.println(response);
    }

}