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
import com.bytedance.ads.api.StarBillGetPendingV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarBillGetPendingV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/bill/get_pending/ GET
public class StarBillGetPendingV2ApiExample {

    private static final StarBillGetPendingV2Api api = new StarBillGetPendingV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long campaignId = null;
        Long orderId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarBillGetPendingV2Response response = api.openApi2StarBillGetPendingGet(starId, campaignId, orderId);
        System.out.println(response);
    }

}