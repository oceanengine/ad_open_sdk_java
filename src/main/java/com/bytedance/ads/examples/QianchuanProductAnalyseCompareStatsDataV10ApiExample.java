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
import com.bytedance.ads.api.QianchuanProductAnalyseCompareStatsDataV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanProductAnalyseCompareStatsDataV10Response;
import com.bytedance.ads.model.QianchuanProductAnalyseCompareStatsDataV10TimeRange;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/product/analyse/compare_stats_data/ GET
public class QianchuanProductAnalyseCompareStatsDataV10ApiExample {

    private static final QianchuanProductAnalyseCompareStatsDataV10Api api = new QianchuanProductAnalyseCompareStatsDataV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long productId = null;
        QianchuanProductAnalyseCompareStatsDataV10TimeRange timeRange = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanProductAnalyseCompareStatsDataV10Response response = api.openApiV10QianchuanProductAnalyseCompareStatsDataGet(advertiserId, productId, timeRange);
        System.out.println(response);
    }

}