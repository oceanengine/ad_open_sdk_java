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
import com.bytedance.ads.api.QianchuanSuggestBudgetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanSuggestBudgetV10LiveScheduleType;
import com.bytedance.ads.model.QianchuanSuggestBudgetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/suggest/budget/ GET
public class QianchuanSuggestBudgetV10ApiExample {

    private static final QianchuanSuggestBudgetV10Api api = new QianchuanSuggestBudgetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        QianchuanSuggestBudgetV10LiveScheduleType liveScheduleType = null;
        String startTime = null;
        String endTime = null;
        String scheduleTime = null;
        Long scheduleFixedRange = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanSuggestBudgetV10Response response = api.openApiV10QianchuanSuggestBudgetGet(advertiserId, awemeId, liveScheduleType, startTime, endTime, scheduleTime, scheduleFixedRange);
        System.out.println(response);
    }

}