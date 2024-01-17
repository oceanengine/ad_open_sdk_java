/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.BrandQueryStockV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandQueryStockV30AdForm;
import com.bytedance.ads.model.BrandQueryStockV30AppOrigin;
import com.bytedance.ads.model.BrandQueryStockV30AudienceInfo;
import com.bytedance.ads.model.BrandQueryStockV30Classify;
import com.bytedance.ads.model.BrandQueryStockV30GdSendType;
import com.bytedance.ads.model.BrandQueryStockV30LandingType;
import com.bytedance.ads.model.BrandQueryStockV30Response;
import com.bytedance.ads.model.BrandQueryStockV30ScheduleInfo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/query_stock/ GET
public class BrandQueryStockV30ApiExample {

    private static final BrandQueryStockV30Api api = new BrandQueryStockV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        BrandQueryStockV30Classify classify = null;
        BrandQueryStockV30LandingType landingType = null;
        BrandQueryStockV30AppOrigin appOrigin = null;
        BrandQueryStockV30AdForm adForm = null;
        BrandQueryStockV30GdSendType gdSendType = null;
        String policyNo = null;
        BrandQueryStockV30ScheduleInfo scheduleInfo = null;
        BrandQueryStockV30AudienceInfo audienceInfo = null;
        String merchantIntentionNo = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandQueryStockV30Response response = api.openApiV30BrandQueryStockGet(advertiserId, classify, landingType, appOrigin, adForm, gdSendType, policyNo, scheduleInfo, audienceInfo, merchantIntentionNo);
        System.out.println(response);
    }

}