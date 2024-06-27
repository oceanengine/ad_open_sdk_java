/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsClueRefundDetailGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueRefundDetailGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/refund_detail/get/ GET
public class ToolsClueRefundDetailGetV2ApiExample {

    private static final ToolsClueRefundDetailGetV2Api api = new ToolsClueRefundDetailGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String month = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueRefundDetailGetV2Response response = api.openApi2ToolsClueRefundDetailGetGet(advertiserId, month, page, pageSize);
        System.out.println(response);
    }

}