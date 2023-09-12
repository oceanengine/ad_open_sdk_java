/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportAgentGetV2V2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportAgentGetV2V2Filtering;
import com.bytedance.ads.model.ReportAgentGetV2V2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/agent/get_v2/ GET
public class ReportAgentGetV2V2ApiExample {

    private static final ReportAgentGetV2V2Api api = new ReportAgentGetV2V2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        List<Long> companyIds = null;
        Long cursor = null;
        Long cursorSize = null;
        String endDate = null;
        ReportAgentGetV2V2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        String startDate = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportAgentGetV2V2Response response = api.openApi2ReportAgentGetV2Get(agentId, companyIds, cursor, cursorSize, endDate, filtering, page, pageSize, startDate);
        System.out.println(response);
    }

}