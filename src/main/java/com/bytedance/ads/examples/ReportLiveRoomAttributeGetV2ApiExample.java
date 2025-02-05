/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportLiveRoomAttributeGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportLiveRoomAttributeGetV2Filtering;
import com.bytedance.ads.model.ReportLiveRoomAttributeGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/live_room/attribute/get/ GET
public class ReportLiveRoomAttributeGetV2ApiExample {

    private static final ReportLiveRoomAttributeGetV2Api api = new ReportLiveRoomAttributeGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endTime = null;
        ReportLiveRoomAttributeGetV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        String startTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportLiveRoomAttributeGetV2Response response = api.openApi2ReportLiveRoomAttributeGetGet(advertiserId, endTime, filtering, page, pageSize, startTime);
        System.out.println(response);
    }

}