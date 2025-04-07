/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAwemeReportOrderGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10Filtering;
import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10OrderType;
import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10PageSize;
import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/aweme/report/order/get/ GET
public class QianchuanAwemeReportOrderGetV10ApiExample {

    private static final QianchuanAwemeReportOrderGetV10Api api = new QianchuanAwemeReportOrderGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startDate = null;
        String endDate = null;
        QianchuanAwemeReportOrderGetV10Filtering filtering = null;
        List<String> fields = null;
        String orderField = null;
        QianchuanAwemeReportOrderGetV10OrderType orderType = null;
        Long page = null;
        QianchuanAwemeReportOrderGetV10PageSize pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAwemeReportOrderGetV10Response response = api.openApiV10QianchuanAwemeReportOrderGetGet(advertiserId, startDate, endDate, filtering, fields, orderField, orderType, page, pageSize);
        System.out.println(response);
    }

}