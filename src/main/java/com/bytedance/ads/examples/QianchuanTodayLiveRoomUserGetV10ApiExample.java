/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanTodayLiveRoomUserGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanTodayLiveRoomUserGetV10ActionEvent;
import com.bytedance.ads.model.QianchuanTodayLiveRoomUserGetV10Dimension;
import com.bytedance.ads.model.QianchuanTodayLiveRoomUserGetV10FlowSource;
import com.bytedance.ads.model.QianchuanTodayLiveRoomUserGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/today_live/room/user/get/ GET
public class QianchuanTodayLiveRoomUserGetV10ApiExample {

    private static final QianchuanTodayLiveRoomUserGetV10Api api = new QianchuanTodayLiveRoomUserGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long roomId = null;
        QianchuanTodayLiveRoomUserGetV10ActionEvent actionEvent = null;
        List<QianchuanTodayLiveRoomUserGetV10Dimension> dimension = null;
        QianchuanTodayLiveRoomUserGetV10FlowSource flowSource = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanTodayLiveRoomUserGetV10Response response = api.openApiV10QianchuanTodayLiveRoomUserGetGet(advertiserId, roomId, actionEvent, dimension, flowSource);
        System.out.println(response);
    }

}