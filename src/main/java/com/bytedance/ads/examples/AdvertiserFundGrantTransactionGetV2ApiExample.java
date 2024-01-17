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
import com.bytedance.ads.api.AdvertiserFundGrantTransactionGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvertiserFundGrantTransactionGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/advertiser/fund/grant_transaction/get/ GET
public class AdvertiserFundGrantTransactionGetV2ApiExample {

    private static final AdvertiserFundGrantTransactionGetV2Api api = new AdvertiserFundGrantTransactionGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startTime = null;
        String endTime = null;
        String page = null;
        String pageSize = null;
        String transactionType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvertiserFundGrantTransactionGetV2Response response = api.openApi2AdvertiserFundGrantTransactionGetGet(advertiserId, startTime, endTime, page, pageSize, transactionType);
        System.out.println(response);
    }

}