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
import com.bytedance.ads.api.ReportStardeliveryTaskVideoDataGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportStardeliveryTaskVideoDataGetV30Filtering;
import com.bytedance.ads.model.ReportStardeliveryTaskVideoDataGetV30OrderType;
import com.bytedance.ads.model.ReportStardeliveryTaskVideoDataGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/stardelivery/task_video_data/get/ GET
public class ReportStardeliveryTaskVideoDataGetV30ApiExample {

    private static final ReportStardeliveryTaskVideoDataGetV30Api api = new ReportStardeliveryTaskVideoDataGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long starTaskId = null;
        String startDate = null;
        String endDate = null;
        ReportStardeliveryTaskVideoDataGetV30Filtering filtering = null;
        String orderField = null;
        ReportStardeliveryTaskVideoDataGetV30OrderType orderType = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportStardeliveryTaskVideoDataGetV30Response response = api.openApiV30ReportStardeliveryTaskVideoDataGetGet(advertiserId, starTaskId, startDate, endDate, filtering, orderField, orderType, page, pageSize);
        System.out.println(response);
    }

}