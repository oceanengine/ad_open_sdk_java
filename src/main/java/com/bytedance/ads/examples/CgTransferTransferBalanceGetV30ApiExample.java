/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CgTransferTransferBalanceGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CgTransferTransferBalanceGetV30Platform;
import com.bytedance.ads.model.CgTransferTransferBalanceGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/cg_transfer/transfer_balance/get/ GET
public class CgTransferTransferBalanceGetV30ApiExample {

    private static final CgTransferTransferBalanceGetV30Api api = new CgTransferTransferBalanceGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long organizationId = null;
        String bizRequestNo = null;
        List<Long> targetIdList = null;
        CgTransferTransferBalanceGetV30Platform platform = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CgTransferTransferBalanceGetV30Response response = api.openApiV30CgTransferTransferBalanceGetGet(organizationId, bizRequestNo, targetIdList, platform);
        System.out.println(response);
    }

}