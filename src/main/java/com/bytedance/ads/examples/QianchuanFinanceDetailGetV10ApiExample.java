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
import com.bytedance.ads.api.QianchuanFinanceDetailGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanFinanceDetailGetV10Response;
import com.bytedance.ads.model.QianchuanFinanceDetailGetV10Type;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/finance/detail/get/ GET
public class QianchuanFinanceDetailGetV10ApiExample {

    private static final QianchuanFinanceDetailGetV10Api api = new QianchuanFinanceDetailGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startDate = null;
        String endDate = null;
        QianchuanFinanceDetailGetV10Type type = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanFinanceDetailGetV10Response response = api.openApiV10QianchuanFinanceDetailGetGet(advertiserId, startDate, endDate, type, page, pageSize);
        System.out.println(response);
    }

}