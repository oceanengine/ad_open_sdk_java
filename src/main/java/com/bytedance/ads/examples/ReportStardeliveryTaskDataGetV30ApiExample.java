/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportStardeliveryTaskDataGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportStardeliveryTaskDataGetV30Filtering;
import com.bytedance.ads.model.ReportStardeliveryTaskDataGetV30OrderType;
import com.bytedance.ads.model.ReportStardeliveryTaskDataGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/stardelivery/task_data/get/ GET
public class ReportStardeliveryTaskDataGetV30ApiExample {

    private static final ReportStardeliveryTaskDataGetV30Api api = new ReportStardeliveryTaskDataGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startDate = null;
        String endDate = null;
        String starTaskVersion = null;
        ReportStardeliveryTaskDataGetV30Filtering filtering = null;
        String orderField = null;
        ReportStardeliveryTaskDataGetV30OrderType orderType = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportStardeliveryTaskDataGetV30Response response = api.openApiV30ReportStardeliveryTaskDataGetGet(advertiserId, startDate, endDate, starTaskVersion, filtering, orderField, orderType, page, pageSize);
        System.out.println(response);
    }

}