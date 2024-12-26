/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAdDetailGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdDetailGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/ad/detail/get/ GET
public class QianchuanAdDetailGetV10ApiExample {

    private static final QianchuanAdDetailGetV10Api api = new QianchuanAdDetailGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long adId = null;
        Boolean requestMaterialUrl = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdDetailGetV10Response response = api.openApiV10QianchuanAdDetailGetGet(advertiserId, adId, requestMaterialUrl);
        System.out.println(response);
    }

}