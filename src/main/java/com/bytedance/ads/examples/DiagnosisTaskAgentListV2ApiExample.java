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
import com.bytedance.ads.api.DiagnosisTaskAgentListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DiagnosisTaskAgentListV2Response;
import com.bytedance.ads.model.DiagnosisTaskAgentListV2Results;
import com.bytedance.ads.model.DiagnosisTaskAgentListV2Status;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/diagnosis_task/agent/list/ GET
public class DiagnosisTaskAgentListV2ApiExample {

    private static final DiagnosisTaskAgentListV2Api api = new DiagnosisTaskAgentListV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        List<DiagnosisTaskAgentListV2Results> results = null;
        List<DiagnosisTaskAgentListV2Status> status = null;
        String startTime = null;
        String endTime = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DiagnosisTaskAgentListV2Response response = api.openApi2DiagnosisTaskAgentListGet(agentId, results, status, startTime, endTime, page, pageSize);
        System.out.println(response);
    }

}