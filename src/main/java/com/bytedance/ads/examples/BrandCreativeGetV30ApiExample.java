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
import com.bytedance.ads.api.BrandCreativeGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandCreativeGetV30CreativeStatus;
import com.bytedance.ads.model.BrandCreativeGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/creative/get/ GET
public class BrandCreativeGetV30ApiExample {

    private static final BrandCreativeGetV30Api api = new BrandCreativeGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long size = null;
        List<String> adIds = null;
        List<String> campaignIds = null;
        List<String> creativeIds = null;
        BrandCreativeGetV30CreativeStatus creativeStatus = null;
        String createStartTime = null;
        String createEndTime = null;
        String startTime = null;
        String endTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandCreativeGetV30Response response = api.openApiV30BrandCreativeGetGet(advertiserId, page, size, adIds, campaignIds, creativeIds, creativeStatus, createStartTime, createEndTime, startTime, endTime);
        System.out.println(response);
    }

}