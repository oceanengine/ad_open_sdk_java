/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportBrandDataV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportBrandDataV30DataReportType;
import com.bytedance.ads.model.ReportBrandDataV30Filter;
import com.bytedance.ads.model.ReportBrandDataV30Page;
import com.bytedance.ads.model.ReportBrandDataV30PageType;
import com.bytedance.ads.model.ReportBrandDataV30Response;
import com.bytedance.ads.model.ReportBrandDataV30TimeDimension;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/brand/data/ GET
public class ReportBrandDataV30ApiExample {

    private static final ReportBrandDataV30Api api = new ReportBrandDataV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ReportBrandDataV30DataReportType dataReportType = null;
        String startTime = null;
        String endTime = null;
        ReportBrandDataV30TimeDimension timeDimension = null;
        ReportBrandDataV30PageType pageType = null;
        ReportBrandDataV30Filter filter = null;
        List<String> metrics = null;
        ReportBrandDataV30Page page = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportBrandDataV30Response response = api.openApiV30ReportBrandDataGet(advertiserId, dataReportType, startTime, endTime, timeDimension, pageType, filter, metrics, page);
        System.out.println(response);
    }

}