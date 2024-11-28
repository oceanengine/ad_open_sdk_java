/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.LocalReportProjectGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalReportProjectGetV30Filtering;
import com.bytedance.ads.model.LocalReportProjectGetV30OrderType;
import com.bytedance.ads.model.LocalReportProjectGetV30Response;
import com.bytedance.ads.model.LocalReportProjectGetV30TimeGranularity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/report/project/get/ GET
public class LocalReportProjectGetV30ApiExample {

    private static final LocalReportProjectGetV30Api api = new LocalReportProjectGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long localAccountId = null;
        String startDate = null;
        String endDate = null;
        List<String> metrics = null;
        LocalReportProjectGetV30TimeGranularity timeGranularity = null;
        LocalReportProjectGetV30OrderType orderType = null;
        String orderField = null;
        LocalReportProjectGetV30Filtering filtering = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalReportProjectGetV30Response response = api.openApiV30LocalReportProjectGetGet(localAccountId, startDate, endDate, metrics, timeGranularity, orderType, orderField, filtering, page, pageSize);
        System.out.println(response);
    }

}