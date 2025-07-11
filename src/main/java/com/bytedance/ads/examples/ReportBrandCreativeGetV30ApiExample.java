/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportBrandCreativeGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportBrandCreativeGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/brand/creative/get/ GET
public class ReportBrandCreativeGetV30ApiExample {

    private static final ReportBrandCreativeGetV30Api api = new ReportBrandCreativeGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long size = null;
        Long landingType = null;
        Long pricingType = null;
        List<String> creativeIds = null;
        String startTime = null;
        String endTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportBrandCreativeGetV30Response response = api.openApiV30ReportBrandCreativeGetGet(advertiserId, page, size, landingType, pricingType, creativeIds, startTime, endTime);
        System.out.println(response);
    }

}