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
import com.bytedance.ads.api.QianchuanAudienceDeleteV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAudienceDeleteV10Request;
import com.bytedance.ads.model.QianchuanAudienceDeleteV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/audience/delete/ POST
public class QianchuanAudienceDeleteV10ApiExample {

    private static final QianchuanAudienceDeleteV10Api api = new QianchuanAudienceDeleteV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanAudienceDeleteV10Request qianchuanAudienceDeleteV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAudienceDeleteV10Response response = api.openApiV10QianchuanAudienceDeletePost(qianchuanAudienceDeleteV10Request);
        System.out.println(response);
    }

}