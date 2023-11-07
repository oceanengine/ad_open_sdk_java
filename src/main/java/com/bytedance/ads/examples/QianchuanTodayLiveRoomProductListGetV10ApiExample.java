/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanTodayLiveRoomProductListGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanTodayLiveRoomProductListGetV10ExplainStatus;
import com.bytedance.ads.model.QianchuanTodayLiveRoomProductListGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/today_live/room/product_list/get/ GET
public class QianchuanTodayLiveRoomProductListGetV10ApiExample {

    private static final QianchuanTodayLiveRoomProductListGetV10Api api = new QianchuanTodayLiveRoomProductListGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long roomId = null;
        List<String> fields = null;
        QianchuanTodayLiveRoomProductListGetV10ExplainStatus explainStatus = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanTodayLiveRoomProductListGetV10Response response = api.openApiV10QianchuanTodayLiveRoomProductListGetGet(advertiserId, roomId, fields, explainStatus, page, pageSize);
        System.out.println(response);
    }

}