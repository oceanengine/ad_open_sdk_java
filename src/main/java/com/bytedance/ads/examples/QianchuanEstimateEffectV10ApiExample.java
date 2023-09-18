/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanEstimateEffectV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanEstimateEffectV10BudgetMode;
import com.bytedance.ads.model.QianchuanEstimateEffectV10DeepBidType;
import com.bytedance.ads.model.QianchuanEstimateEffectV10DeepExternalAction;
import com.bytedance.ads.model.QianchuanEstimateEffectV10ExternalAction;
import com.bytedance.ads.model.QianchuanEstimateEffectV10LiveScheduleType;
import com.bytedance.ads.model.QianchuanEstimateEffectV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/estimate/effect/ GET
public class QianchuanEstimateEffectV10ApiExample {

    private static final QianchuanEstimateEffectV10Api api = new QianchuanEstimateEffectV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        QianchuanEstimateEffectV10ExternalAction externalAction = null;
        QianchuanEstimateEffectV10BudgetMode budgetMode = null;
        Double budget = null;
        QianchuanEstimateEffectV10LiveScheduleType liveScheduleType = null;
        QianchuanEstimateEffectV10DeepExternalAction deepExternalAction = null;
        QianchuanEstimateEffectV10DeepBidType deepBidType = null;
        String startTime = null;
        String endTime = null;
        String scheduleTime = null;
        Long scheduleFixedRange = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanEstimateEffectV10Response response = api.openApiV10QianchuanEstimateEffectGet(advertiserId, awemeId, externalAction, budgetMode, budget, liveScheduleType, deepExternalAction, deepBidType, startTime, endTime, scheduleTime, scheduleFixedRange);
        System.out.println(response);
    }

}