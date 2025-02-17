/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.BrandCampaignListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandCampaignListV30Filter;
import com.bytedance.ads.model.BrandCampaignListV30PageInfo;
import com.bytedance.ads.model.BrandCampaignListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/campaign/list/ GET
public class BrandCampaignListV30ApiExample {

    private static final BrandCampaignListV30Api api = new BrandCampaignListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        BrandCampaignListV30Filter filter = null;
        BrandCampaignListV30PageInfo pageInfo = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandCampaignListV30Response response = api.openApiV30BrandCampaignListGet(advertiserId, filter, pageInfo);
        System.out.println(response);
    }

}