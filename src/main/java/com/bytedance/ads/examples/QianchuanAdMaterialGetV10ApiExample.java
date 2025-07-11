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
import com.bytedance.ads.api.QianchuanAdMaterialGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10Filtering;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10OrderType;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10PageSize;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/ad/material/get/ GET
public class QianchuanAdMaterialGetV10ApiExample {

    private static final QianchuanAdMaterialGetV10Api api = new QianchuanAdMaterialGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long adId = null;
        QianchuanAdMaterialGetV10Filtering filtering = null;
        Integer page = null;
        QianchuanAdMaterialGetV10PageSize pageSize = null;
        QianchuanAdMaterialGetV10OrderType orderType = null;
        String orderField = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdMaterialGetV10Response response = api.openApiV10QianchuanAdMaterialGetGet(advertiserId, adId, filtering, page, pageSize, orderType, orderField);
        System.out.println(response);
    }

}