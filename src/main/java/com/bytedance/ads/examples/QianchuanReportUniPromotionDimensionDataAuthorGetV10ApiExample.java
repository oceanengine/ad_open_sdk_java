/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanReportUniPromotionDimensionDataAuthorGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension;
import com.bytedance.ads.model.QianchuanReportUniPromotionDimensionDataAuthorGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportUniPromotionDimensionDataAuthorGetV10OrderType;
import com.bytedance.ads.model.QianchuanReportUniPromotionDimensionDataAuthorGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/uni_promotion/dimension_data/author/get/ GET
public class QianchuanReportUniPromotionDimensionDataAuthorGetV10ApiExample {

    private static final QianchuanReportUniPromotionDimensionDataAuthorGetV10Api api = new QianchuanReportUniPromotionDimensionDataAuthorGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        List<String> metrics = null;
        String startTime = null;
        String endTime = null;
        QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension dimension = null;
        QianchuanReportUniPromotionDimensionDataAuthorGetV10OrderType orderType = null;
        String orderField = null;
        Integer page = null;
        Integer pageSize = null;
        QianchuanReportUniPromotionDimensionDataAuthorGetV10Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportUniPromotionDimensionDataAuthorGetV10Response response = api.openApiV10QianchuanReportUniPromotionDimensionDataAuthorGetGet(advertiserId, awemeId, metrics, startTime, endTime, dimension, orderType, orderField, page, pageSize, filtering);
        System.out.println(response);
    }

}