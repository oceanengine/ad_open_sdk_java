/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanReportUniPromotionGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportUniPromotionGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportUniPromotionGetV10LabAdType;
import com.bytedance.ads.model.QianchuanReportUniPromotionGetV10MarketingGoal;
import com.bytedance.ads.model.QianchuanReportUniPromotionGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/uni_promotion/get/ GET
public class QianchuanReportUniPromotionGetV10ApiExample {

    private static final QianchuanReportUniPromotionGetV10Api api = new QianchuanReportUniPromotionGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startDate = null;
        String endDate = null;
        QianchuanReportUniPromotionGetV10MarketingGoal marketingGoal = null;
        QianchuanReportUniPromotionGetV10LabAdType labAdType = null;
        List<String> fields = null;
        QianchuanReportUniPromotionGetV10Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportUniPromotionGetV10Response response = api.openApiV10QianchuanReportUniPromotionGetGet(advertiserId, startDate, endDate, marketingGoal, labAdType, fields, filtering);
        System.out.println(response);
    }

}