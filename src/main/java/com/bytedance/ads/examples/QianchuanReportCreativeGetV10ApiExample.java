/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanReportCreativeGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10OrderType;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10Response;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10TimeGranularity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/creative/get/ GET
public class QianchuanReportCreativeGetV10ApiExample {

    private static final QianchuanReportCreativeGetV10Api api = new QianchuanReportCreativeGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startDate = null;
        String endDate = null;
        List<String> fields = null;
        QianchuanReportCreativeGetV10Filtering filtering = null;
        QianchuanReportCreativeGetV10TimeGranularity timeGranularity = null;
        String orderField = null;
        QianchuanReportCreativeGetV10OrderType orderType = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportCreativeGetV10Response response = api.openApiV10QianchuanReportCreativeGetGet(advertiserId, startDate, endDate, fields, filtering, timeGranularity, orderField, orderType, page, pageSize);
        System.out.println(response);
    }

}