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
import com.bytedance.ads.api.QianchuanVideoByAwemeGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanVideoByAwemeGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/video/by_aweme/get/ GET
public class QianchuanVideoByAwemeGetV10ApiExample {

    private static final QianchuanVideoByAwemeGetV10Api api = new QianchuanVideoByAwemeGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        String awemeItemUrl = null;
        Long awemeItemId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanVideoByAwemeGetV10Response response = api.openApiV10QianchuanVideoByAwemeGetGet(advertiserId, awemeId, awemeItemUrl, awemeItemId);
        System.out.println(response);
    }

}