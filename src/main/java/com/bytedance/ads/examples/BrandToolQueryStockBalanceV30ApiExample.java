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
import com.bytedance.ads.api.BrandToolQueryStockBalanceV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandToolQueryStockBalanceV30AdForm;
import com.bytedance.ads.model.BrandToolQueryStockBalanceV30AppOrigin;
import com.bytedance.ads.model.BrandToolQueryStockBalanceV30AudienceInfo;
import com.bytedance.ads.model.BrandToolQueryStockBalanceV30Classify;
import com.bytedance.ads.model.BrandToolQueryStockBalanceV30DeliveryInfo;
import com.bytedance.ads.model.BrandToolQueryStockBalanceV30FrequencyInfo;
import com.bytedance.ads.model.BrandToolQueryStockBalanceV30GdSendType;
import com.bytedance.ads.model.BrandToolQueryStockBalanceV30PricingType;
import com.bytedance.ads.model.BrandToolQueryStockBalanceV30ProType;
import com.bytedance.ads.model.BrandToolQueryStockBalanceV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/tool/query_stock_balance/ GET
public class BrandToolQueryStockBalanceV30ApiExample {

    private static final BrandToolQueryStockBalanceV30Api api = new BrandToolQueryStockBalanceV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        BrandToolQueryStockBalanceV30Classify classify = null;
        BrandToolQueryStockBalanceV30ProType proType = null;
        BrandToolQueryStockBalanceV30AdForm adForm = null;
        BrandToolQueryStockBalanceV30AppOrigin appOrigin = null;
        BrandToolQueryStockBalanceV30PricingType pricingType = null;
        BrandToolQueryStockBalanceV30GdSendType gdSendType = null;
        String policyNo = null;
        BrandToolQueryStockBalanceV30DeliveryInfo deliveryInfo = null;
        String intentionNo = null;
        BrandToolQueryStockBalanceV30AudienceInfo audienceInfo = null;
        BrandToolQueryStockBalanceV30FrequencyInfo frequencyInfo = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandToolQueryStockBalanceV30Response response = api.openApiV30BrandToolQueryStockBalanceGet(advertiserId, classify, proType, adForm, appOrigin, pricingType, gdSendType, policyNo, deliveryInfo, intentionNo, audienceInfo, frequencyInfo);
        System.out.println(response);
    }

}