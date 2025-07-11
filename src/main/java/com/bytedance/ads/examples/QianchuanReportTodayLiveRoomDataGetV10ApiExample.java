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
import com.bytedance.ads.api.QianchuanReportTodayLiveRoomDataGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportTodayLiveRoomDataGetV10DataTopic;
import com.bytedance.ads.model.QianchuanReportTodayLiveRoomDataGetV10FiltersInner;
import com.bytedance.ads.model.QianchuanReportTodayLiveRoomDataGetV10OrderByInner;
import com.bytedance.ads.model.QianchuanReportTodayLiveRoomDataGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/today_live/room/data/get/ GET
public class QianchuanReportTodayLiveRoomDataGetV10ApiExample {

    private static final QianchuanReportTodayLiveRoomDataGetV10Api api = new QianchuanReportTodayLiveRoomDataGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanReportTodayLiveRoomDataGetV10DataTopic dataTopic = null;
        List<String> dimensions = null;
        List<String> metrics = null;
        List<QianchuanReportTodayLiveRoomDataGetV10FiltersInner> filters = null;
        String startTime = null;
        String endTime = null;
        List<QianchuanReportTodayLiveRoomDataGetV10OrderByInner> orderBy = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportTodayLiveRoomDataGetV10Response response = api.openApiV10QianchuanReportTodayLiveRoomDataGetGet(advertiserId, dataTopic, dimensions, metrics, filters, startTime, endTime, orderBy, page, pageSize);
        System.out.println(response);
    }

}