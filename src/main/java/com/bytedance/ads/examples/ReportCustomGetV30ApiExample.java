/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportCustomGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportCustomGetV30DataTopic;
import com.bytedance.ads.model.ReportCustomGetV30FiltersInner;
import com.bytedance.ads.model.ReportCustomGetV30OrderByInner;
import com.bytedance.ads.model.ReportCustomGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/custom/get/ GET
public class ReportCustomGetV30ApiExample {

    private static final ReportCustomGetV30Api api = new ReportCustomGetV30Api();

    public static void main(String[] args) throws ApiException {
        List<String> dimensions = null;
        Long advertiserId = null;
        List<String> metrics = null;
        List<ReportCustomGetV30FiltersInner> filters = null;
        String startTime = null;
        String endTime = null;
        List<ReportCustomGetV30OrderByInner> orderBy = null;
        Integer page = null;
        Integer pageSize = null;
        ReportCustomGetV30DataTopic dataTopic = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportCustomGetV30Response response = api.openApiV30ReportCustomGetGet(dimensions, advertiserId, metrics, filters, startTime, endTime, orderBy, page, pageSize, dataTopic);
        System.out.println(response);
    }

}