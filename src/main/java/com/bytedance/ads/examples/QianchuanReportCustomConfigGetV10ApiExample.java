/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanReportCustomConfigGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportCustomConfigGetV10DataTopics;
import com.bytedance.ads.model.QianchuanReportCustomConfigGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/custom/config/get/ GET
public class QianchuanReportCustomConfigGetV10ApiExample {

    private static final QianchuanReportCustomConfigGetV10Api api = new QianchuanReportCustomConfigGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<QianchuanReportCustomConfigGetV10DataTopics> dataTopics = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportCustomConfigGetV10Response response = api.openApiV10QianchuanReportCustomConfigGetGet(advertiserId, dataTopics);
        System.out.println(response);
    }

}