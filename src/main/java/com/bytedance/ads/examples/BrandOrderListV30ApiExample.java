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
import com.bytedance.ads.api.BrandOrderListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandOrderListV30CampaignFilter;
import com.bytedance.ads.model.BrandOrderListV30Filter;
import com.bytedance.ads.model.BrandOrderListV30PageInfo;
import com.bytedance.ads.model.BrandOrderListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/order/list/ GET
public class BrandOrderListV30ApiExample {

    private static final BrandOrderListV30Api api = new BrandOrderListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        BrandOrderListV30Filter filter = null;
        BrandOrderListV30CampaignFilter campaignFilter = null;
        BrandOrderListV30PageInfo pageInfo = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandOrderListV30Response response = api.openApiV30BrandOrderListGet(advertiserId, filter, campaignFilter, pageInfo);
        System.out.println(response);
    }

}