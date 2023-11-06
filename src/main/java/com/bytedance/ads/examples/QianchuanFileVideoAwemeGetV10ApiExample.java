/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanFileVideoAwemeGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanFileVideoAwemeGetV10Filtering;
import com.bytedance.ads.model.QianchuanFileVideoAwemeGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/file/video/aweme/get/ GET
public class QianchuanFileVideoAwemeGetV10ApiExample {

    private static final QianchuanFileVideoAwemeGetV10Api api = new QianchuanFileVideoAwemeGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        QianchuanFileVideoAwemeGetV10Filtering filtering = null;
        Long cursor = null;
        Long count = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanFileVideoAwemeGetV10Response response = api.openApiV10QianchuanFileVideoAwemeGetGet(advertiserId, awemeId, filtering, cursor, count);
        System.out.println(response);
    }

}