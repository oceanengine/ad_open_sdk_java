/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanTrackUrlCheckV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanTrackUrlCheckV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/track_url/check/ GET
public class QianchuanTrackUrlCheckV10ApiExample {

    private static final QianchuanTrackUrlCheckV10Api api = new QianchuanTrackUrlCheckV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<String> trackUrl = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanTrackUrlCheckV10Response response = api.openApiV10QianchuanTrackUrlCheckGet(advertiserId, trackUrl);
        System.out.println(response);
    }

}