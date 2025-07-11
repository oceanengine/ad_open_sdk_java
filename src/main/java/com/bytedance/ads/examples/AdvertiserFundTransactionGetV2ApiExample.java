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
import com.bytedance.ads.api.AdvertiserFundTransactionGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvertiserFundTransactionGetV2Response;
import com.bytedance.ads.model.AdvertiserFundTransactionGetV2TransactionType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/advertiser/fund/transaction/get/ GET
public class AdvertiserFundTransactionGetV2ApiExample {

    private static final AdvertiserFundTransactionGetV2Api api = new AdvertiserFundTransactionGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startDate = null;
        String endDate = null;
        AdvertiserFundTransactionGetV2TransactionType transactionType = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvertiserFundTransactionGetV2Response response = api.openApi2AdvertiserFundTransactionGetGet(advertiserId, startDate, endDate, transactionType, page, pageSize);
        System.out.println(response);
    }

}