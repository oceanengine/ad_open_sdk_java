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
import com.bytedance.ads.api.CgTransferWalletTransferCanTransferBalanceV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30AccountType;
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30Response;
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30TransferDirection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/cg_transfer/wallet/transfer/can_transfer_balance/ GET
public class CgTransferWalletTransferCanTransferBalanceV30ApiExample {

    private static final CgTransferWalletTransferCanTransferBalanceV30Api api = new CgTransferWalletTransferCanTransferBalanceV30Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        CgTransferWalletTransferCanTransferBalanceV30AccountType accountType = null;
        String bizRequestNo = null;
        Long mainWalletId = null;
        List<Long> subWalletList = null;
        CgTransferWalletTransferCanTransferBalanceV30TransferDirection transferDirection = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CgTransferWalletTransferCanTransferBalanceV30Response response = api.openApiV30CgTransferWalletTransferCanTransferBalanceGet(accountId, accountType, bizRequestNo, mainWalletId, subWalletList, transferDirection);
        System.out.println(response);
    }

}