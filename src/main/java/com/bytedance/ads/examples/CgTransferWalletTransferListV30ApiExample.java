/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CgTransferWalletTransferListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CgTransferWalletTransferListV30AccountType;
import com.bytedance.ads.model.CgTransferWalletTransferListV30PageInfo;
import com.bytedance.ads.model.CgTransferWalletTransferListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/cg_transfer/wallet/transfer/list/ GET
public class CgTransferWalletTransferListV30ApiExample {

    private static final CgTransferWalletTransferListV30Api api = new CgTransferWalletTransferListV30Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        CgTransferWalletTransferListV30AccountType accountType = null;
        String bizRequestNo = null;
        String queryBeginTime = null;
        String queryEndTime = null;
        List<Long> queryWalletIdList = null;
        CgTransferWalletTransferListV30PageInfo pageInfo = null;
        Long payeeId = null;
        Long remitterId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CgTransferWalletTransferListV30Response response = api.openApiV30CgTransferWalletTransferListGet(accountId, accountType, bizRequestNo, queryBeginTime, queryEndTime, queryWalletIdList, pageInfo, payeeId, remitterId);
        System.out.println(response);
    }

}