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
import com.bytedance.ads.api.StarDataTaskTimelineReportV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarDataTaskTimelineReportV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/data/task_timeline_report/ GET
public class StarDataTaskTimelineReportV2ApiExample {

    private static final StarDataTaskTimelineReportV2Api api = new StarDataTaskTimelineReportV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        String partition = null;
        List<String> outerProjectIdList = null;
        List<String> outerTaskIdList = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarDataTaskTimelineReportV2Response response = api.openApi2StarDataTaskTimelineReportGet(starId, partition, outerProjectIdList, outerTaskIdList);
        System.out.println(response);
    }

}