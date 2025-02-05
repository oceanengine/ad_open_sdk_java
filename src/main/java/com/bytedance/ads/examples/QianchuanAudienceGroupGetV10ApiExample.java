/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAudienceGroupGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAudienceGroupGetV10Filtering;
import com.bytedance.ads.model.QianchuanAudienceGroupGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/audience_group/get/ GET
public class QianchuanAudienceGroupGetV10ApiExample {

    private static final QianchuanAudienceGroupGetV10Api api = new QianchuanAudienceGroupGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanAudienceGroupGetV10Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAudienceGroupGetV10Response response = api.openApiV10QianchuanAudienceGroupGetGet(advertiserId, filtering);
        System.out.println(response);
    }

}