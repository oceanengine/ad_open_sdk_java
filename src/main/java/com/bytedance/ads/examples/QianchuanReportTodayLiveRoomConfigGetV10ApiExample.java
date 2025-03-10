/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanReportTodayLiveRoomConfigGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportTodayLiveRoomConfigGetV10DataTopics;
import com.bytedance.ads.model.QianchuanReportTodayLiveRoomConfigGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/today_live/room/config/get/ GET
public class QianchuanReportTodayLiveRoomConfigGetV10ApiExample {

    private static final QianchuanReportTodayLiveRoomConfigGetV10Api api = new QianchuanReportTodayLiveRoomConfigGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<QianchuanReportTodayLiveRoomConfigGetV10DataTopics> dataTopics = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportTodayLiveRoomConfigGetV10Response response = api.openApiV10QianchuanReportTodayLiveRoomConfigGetGet(advertiserId, dataTopics);
        System.out.println(response);
    }

}