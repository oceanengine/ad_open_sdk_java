/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanToolsSmartBoostAdBoostReportGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostReportGetV10OrderType;
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostReportGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/report/get/ GET
public class QianchuanToolsSmartBoostAdBoostReportGetV10ApiExample {

    private static final QianchuanToolsSmartBoostAdBoostReportGetV10Api api = new QianchuanToolsSmartBoostAdBoostReportGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long adId = null;
        Long adRaiseVersion = null;
        String startTime = null;
        String endTime = null;
        Integer page = null;
        Integer pageSize = null;
        String timeGranularity = null;
        List<String> filed = null;
        String orderField = null;
        QianchuanToolsSmartBoostAdBoostReportGetV10OrderType orderType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanToolsSmartBoostAdBoostReportGetV10Response response = api.openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet(advertiserId, adId, adRaiseVersion, startTime, endTime, page, pageSize, timeGranularity, filed, orderField, orderType);
        System.out.println(response);
    }

}