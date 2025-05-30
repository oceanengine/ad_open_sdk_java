/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.54
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.SecurityScoreViolationEventGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.SecurityScoreViolationEventGetV30BusinessLine;
import com.bytedance.ads.model.SecurityScoreViolationEventGetV30Filtering;
import com.bytedance.ads.model.SecurityScoreViolationEventGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/security/score_violation_event/get/ GET
public class SecurityScoreViolationEventGetV30ApiExample {

    private static final SecurityScoreViolationEventGetV30Api api = new SecurityScoreViolationEventGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        SecurityScoreViolationEventGetV30BusinessLine businessLine = null;
        Long page = null;
        Long pageSize = null;
        SecurityScoreViolationEventGetV30Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        SecurityScoreViolationEventGetV30Response response = api.openApiV30SecurityScoreViolationEventGetGet(advertiserId, businessLine, page, pageSize, filtering);
        System.out.println(response);
    }

}