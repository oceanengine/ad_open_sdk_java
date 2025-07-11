/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAdPivativewordsGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdPivativewordsGetV10Filtering;
import com.bytedance.ads.model.QianchuanAdPivativewordsGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/ad/pivativewords/get/ GET
public class QianchuanAdPivativewordsGetV10ApiExample {

    private static final QianchuanAdPivativewordsGetV10Api api = new QianchuanAdPivativewordsGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanAdPivativewordsGetV10Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdPivativewordsGetV10Response response = api.openApiV10QianchuanAdPivativewordsGetGet(advertiserId, filtering);
        System.out.println(response);
    }

}