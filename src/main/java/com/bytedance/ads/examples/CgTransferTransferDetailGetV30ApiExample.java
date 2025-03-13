/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CgTransferTransferDetailGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CgTransferTransferDetailGetV30Platform;
import com.bytedance.ads.model.CgTransferTransferDetailGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/cg_transfer/transfer_detail/get/ GET
public class CgTransferTransferDetailGetV30ApiExample {

    private static final CgTransferTransferDetailGetV30Api api = new CgTransferTransferDetailGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long organizationId = null;
        String bizRequestNo = null;
        CgTransferTransferDetailGetV30Platform platform = null;
        String transferBizRequestNo = null;
        String transferSerial = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CgTransferTransferDetailGetV30Response response = api.openApiV30CgTransferTransferDetailGetGet(organizationId, bizRequestNo, platform, transferBizRequestNo, transferSerial);
        System.out.println(response);
    }

}