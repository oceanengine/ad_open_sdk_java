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
import com.bytedance.ads.api.QianchuanReportCustomGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportCustomGetV10DataTopic;
import com.bytedance.ads.model.QianchuanReportCustomGetV10FiltersInner;
import com.bytedance.ads.model.QianchuanReportCustomGetV10OrderByInner;
import com.bytedance.ads.model.QianchuanReportCustomGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/custom/get/ GET
public class QianchuanReportCustomGetV10ApiExample {

    private static final QianchuanReportCustomGetV10Api api = new QianchuanReportCustomGetV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanReportCustomGetV10DataTopic dataTopic = null;
        List<String> dimensions = null;
        List<String> metrics = null;
        List<QianchuanReportCustomGetV10FiltersInner> filters = null;
        String startTime = null;
        String endTime = null;
        List<QianchuanReportCustomGetV10OrderByInner> orderBy = null;
        Long advertiserId = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportCustomGetV10Response response = api.openApiV10QianchuanReportCustomGetGet(dataTopic, dimensions, metrics, filters, startTime, endTime, orderBy, advertiserId, page, pageSize);
        System.out.println(response);
    }

}