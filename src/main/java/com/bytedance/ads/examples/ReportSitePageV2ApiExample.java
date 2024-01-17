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
import com.bytedance.ads.api.ReportSitePageV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportSitePageV2InventoryType;
import com.bytedance.ads.model.ReportSitePageV2Response;
import com.bytedance.ads.model.ReportSitePageV2TimeDuration;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/site/page/ GET
public class ReportSitePageV2ApiExample {

    private static final ReportSitePageV2Api api = new ReportSitePageV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ReportSitePageV2InventoryType inventoryType = null;
        String siteId = null;
        ReportSitePageV2TimeDuration timeDuration = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportSitePageV2Response response = api.openApi2ReportSitePageGet(advertiserId, inventoryType, siteId, timeDuration);
        System.out.println(response);
    }

}