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
import com.bytedance.ads.api.QianchuanQianchuanVideoStarGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanQianchuanVideoStarGetV10Filtering;
import com.bytedance.ads.model.QianchuanQianchuanVideoStarGetV10OrderField;
import com.bytedance.ads.model.QianchuanQianchuanVideoStarGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/qianchuan/video/star/get/ GET
public class QianchuanQianchuanVideoStarGetV10ApiExample {

    private static final QianchuanQianchuanVideoStarGetV10Api api = new QianchuanQianchuanVideoStarGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanQianchuanVideoStarGetV10Filtering filtering = null;
        QianchuanQianchuanVideoStarGetV10OrderField orderField = null;
        Long cursor = null;
        Long count = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanQianchuanVideoStarGetV10Response response = api.openApiV10QianchuanQianchuanVideoStarGetGet(advertiserId, filtering, orderField, cursor, count);
        System.out.println(response);
    }

}