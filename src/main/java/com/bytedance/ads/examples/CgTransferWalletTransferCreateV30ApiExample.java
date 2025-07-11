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
import com.bytedance.ads.api.CgTransferWalletTransferCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CgTransferWalletTransferCreateV30Request;
import com.bytedance.ads.model.CgTransferWalletTransferCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/cg_transfer/wallet/transfer/create/ POST
public class CgTransferWalletTransferCreateV30ApiExample {

    private static final CgTransferWalletTransferCreateV30Api api = new CgTransferWalletTransferCreateV30Api();

    public static void main(String[] args) throws ApiException {
        CgTransferWalletTransferCreateV30Request cgTransferWalletTransferCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CgTransferWalletTransferCreateV30Response response = api.openApiV30CgTransferWalletTransferCreatePost(cgTransferWalletTransferCreateV30Request);
        System.out.println(response);
    }

}