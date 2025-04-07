/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.RejectMaterialAiRepairAcceptTaskListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.RejectMaterialAiRepairAcceptTaskListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/reject_material/ai_repair_accept_task/list/ GET
public class RejectMaterialAiRepairAcceptTaskListV30ApiExample {

    private static final RejectMaterialAiRepairAcceptTaskListV30Api api = new RejectMaterialAiRepairAcceptTaskListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> aiRepairIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        RejectMaterialAiRepairAcceptTaskListV30Response response = api.openApiV30RejectMaterialAiRepairAcceptTaskListGet(advertiserId, aiRepairIds);
        System.out.println(response);
    }

}