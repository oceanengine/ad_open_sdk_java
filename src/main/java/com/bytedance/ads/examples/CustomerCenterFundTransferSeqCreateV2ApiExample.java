/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CustomerCenterFundTransferSeqCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CustomerCenterFundTransferSeqCreateV2Request;
import com.bytedance.ads.model.CustomerCenterFundTransferSeqCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/customer_center/fund/transfer_seq/create/ POST
public class CustomerCenterFundTransferSeqCreateV2ApiExample {

    private static final CustomerCenterFundTransferSeqCreateV2Api api = new CustomerCenterFundTransferSeqCreateV2Api();

    public static void main(String[] args) throws ApiException {
        CustomerCenterFundTransferSeqCreateV2Request customerCenterFundTransferSeqCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CustomerCenterFundTransferSeqCreateV2Response response = api.openApi2CustomerCenterFundTransferSeqCreatePost(customerCenterFundTransferSeqCreateV2Request);
        System.out.println(response);
    }

}