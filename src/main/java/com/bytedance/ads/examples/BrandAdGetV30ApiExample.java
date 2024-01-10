/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.BrandAdGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandAdGetV30AdForm;
import com.bytedance.ads.model.BrandAdGetV30AdStatus;
import com.bytedance.ads.model.BrandAdGetV30AppOrigin;
import com.bytedance.ads.model.BrandAdGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/ad/get/ GET
public class BrandAdGetV30ApiExample {

    private static final BrandAdGetV30Api api = new BrandAdGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long size = null;
        List<String> adIds = null;
        List<String> adNames = null;
        List<String> campaignIds = null;
        BrandAdGetV30AppOrigin appOrigin = null;
        BrandAdGetV30AdForm adForm = null;
        BrandAdGetV30AdStatus adStatus = null;
        String createStartTime = null;
        String createEndTime = null;
        String startTime = null;
        String endTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandAdGetV30Response response = api.openApiV30BrandAdGetGet(advertiserId, page, size, adIds, adNames, campaignIds, appOrigin, adForm, adStatus, createStartTime, createEndTime, startTime, endTime);
        System.out.println(response);
    }

}