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
import com.bytedance.ads.api.BrandCampaignRemoveV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandCampaignRemoveV30Request;
import com.bytedance.ads.model.BrandCampaignRemoveV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/campaign/remove/ POST
public class BrandCampaignRemoveV30ApiExample {

    private static final BrandCampaignRemoveV30Api api = new BrandCampaignRemoveV30Api();

    public static void main(String[] args) throws ApiException {
        BrandCampaignRemoveV30Request brandCampaignRemoveV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandCampaignRemoveV30Response response = api.openApiV30BrandCampaignRemovePost(brandCampaignRemoveV30Request);
        System.out.println(response);
    }

}