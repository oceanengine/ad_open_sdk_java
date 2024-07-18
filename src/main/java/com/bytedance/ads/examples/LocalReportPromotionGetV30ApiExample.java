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
import com.bytedance.ads.api.LocalReportPromotionGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalReportPromotionGetV30Filtering;
import com.bytedance.ads.model.LocalReportPromotionGetV30OrderType;
import com.bytedance.ads.model.LocalReportPromotionGetV30Response;
import com.bytedance.ads.model.LocalReportPromotionGetV30TimeGranularity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/report/promotion/get/ GET
public class LocalReportPromotionGetV30ApiExample {

    private static final LocalReportPromotionGetV30Api api = new LocalReportPromotionGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long localAccountId = null;
        String startDate = null;
        String endDate = null;
        List<String> metrics = null;
        LocalReportPromotionGetV30TimeGranularity timeGranularity = null;
        LocalReportPromotionGetV30OrderType orderType = null;
        String orderField = null;
        LocalReportPromotionGetV30Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalReportPromotionGetV30Response response = api.openApiV30LocalReportPromotionGetGet(localAccountId, startDate, endDate, metrics, timeGranularity, orderType, orderField, filtering, page, pageSize);
        System.out.println(response);
    }

}