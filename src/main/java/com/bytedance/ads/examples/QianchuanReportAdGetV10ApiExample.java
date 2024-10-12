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
import com.bytedance.ads.api.QianchuanReportAdGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportAdGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportAdGetV10OrderType;
import com.bytedance.ads.model.QianchuanReportAdGetV10Response;
import com.bytedance.ads.model.QianchuanReportAdGetV10TimeGranularity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/ad/get/ GET
public class QianchuanReportAdGetV10ApiExample {

    private static final QianchuanReportAdGetV10Api api = new QianchuanReportAdGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startDate = null;
        String endDate = null;
        List<String> fields = null;
        QianchuanReportAdGetV10Filtering filtering = null;
        QianchuanReportAdGetV10TimeGranularity timeGranularity = null;
        String orderField = null;
        QianchuanReportAdGetV10OrderType orderType = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportAdGetV10Response response = api.openApiV10QianchuanReportAdGetGet(advertiserId, startDate, endDate, fields, filtering, timeGranularity, orderField, orderType, page, pageSize);
        System.out.println(response);
    }

}