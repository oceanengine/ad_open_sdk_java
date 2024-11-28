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
import com.bytedance.ads.api.QianchuanReportVideoUserLoseGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportVideoUserLoseGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportVideoUserLoseGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/video_user_lose/get/ GET
public class QianchuanReportVideoUserLoseGetV10ApiExample {

    private static final QianchuanReportVideoUserLoseGetV10Api api = new QianchuanReportVideoUserLoseGetV10Api();

    public static void main(String[] args) throws ApiException {
        List<String> fields = null;
        String startDate = null;
        String endDate = null;
        QianchuanReportVideoUserLoseGetV10Filtering filtering = null;
        Long advertiserId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportVideoUserLoseGetV10Response response = api.openApiV10QianchuanReportVideoUserLoseGetGet(fields, startDate, endDate, filtering, advertiserId);
        System.out.println(response);
    }

}