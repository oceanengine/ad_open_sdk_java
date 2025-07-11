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
import com.bytedance.ads.api.StarReportDataTopicConfigV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarReportDataTopicConfigV2Response;
import com.bytedance.ads.model.StarReportDataTopicConfigV2Topics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/report/data_topic_config/ GET
public class StarReportDataTopicConfigV2ApiExample {

    private static final StarReportDataTopicConfigV2Api api = new StarReportDataTopicConfigV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long workId = null;
        Long demandId = null;
        List<StarReportDataTopicConfigV2Topics> topics = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarReportDataTopicConfigV2Response response = api.openApi2StarReportDataTopicConfigGet(starId, workId, demandId, topics);
        System.out.println(response);
    }

}