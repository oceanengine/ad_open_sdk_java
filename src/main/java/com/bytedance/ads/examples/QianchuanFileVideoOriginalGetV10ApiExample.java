/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanFileVideoOriginalGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanFileVideoOriginalGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/file/video/original/get/ GET
public class QianchuanFileVideoOriginalGetV10ApiExample {

    private static final QianchuanFileVideoOriginalGetV10Api api = new QianchuanFileVideoOriginalGetV10Api();

    public static void main(String[] args) throws ApiException {
        String advertiserId = null;
        List<String> materialIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanFileVideoOriginalGetV10Response response = api.openApiV10QianchuanFileVideoOriginalGetGet(advertiserId, materialIds);
        System.out.println(response);
    }

}