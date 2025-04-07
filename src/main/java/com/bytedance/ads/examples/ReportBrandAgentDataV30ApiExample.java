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
import com.bytedance.ads.api.ReportBrandAgentDataV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportBrandAgentDataV30DataReportType;
import com.bytedance.ads.model.ReportBrandAgentDataV30Filter;
import com.bytedance.ads.model.ReportBrandAgentDataV30Page;
import com.bytedance.ads.model.ReportBrandAgentDataV30PageType;
import com.bytedance.ads.model.ReportBrandAgentDataV30Response;
import com.bytedance.ads.model.ReportBrandAgentDataV30TimeDimension;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/brand/agent/data/ GET
public class ReportBrandAgentDataV30ApiExample {

    private static final ReportBrandAgentDataV30Api api = new ReportBrandAgentDataV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ReportBrandAgentDataV30DataReportType dataReportType = null;
        String startTime = null;
        String endTime = null;
        ReportBrandAgentDataV30TimeDimension timeDimension = null;
        ReportBrandAgentDataV30PageType pageType = null;
        ReportBrandAgentDataV30Filter filter = null;
        List<String> metrics = null;
        ReportBrandAgentDataV30Page page = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportBrandAgentDataV30Response response = api.openApiV30ReportBrandAgentDataGet(advertiserId, dataReportType, startTime, endTime, timeDimension, pageType, filter, metrics, page);
        System.out.println(response);
    }

}