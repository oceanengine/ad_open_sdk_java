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
import com.bytedance.ads.api.SecurityScoreDisposalInfoGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.SecurityScoreDisposalInfoGetV30BusinessLine;
import com.bytedance.ads.model.SecurityScoreDisposalInfoGetV30Filtering;
import com.bytedance.ads.model.SecurityScoreDisposalInfoGetV30OrderField;
import com.bytedance.ads.model.SecurityScoreDisposalInfoGetV30OrderType;
import com.bytedance.ads.model.SecurityScoreDisposalInfoGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/security/score_disposal_info/get/ GET
public class SecurityScoreDisposalInfoGetV30ApiExample {

    private static final SecurityScoreDisposalInfoGetV30Api api = new SecurityScoreDisposalInfoGetV30Api();

    public static void main(String[] args) throws ApiException {
        SecurityScoreDisposalInfoGetV30BusinessLine businessLine = null;
        SecurityScoreDisposalInfoGetV30Filtering filtering = null;
        Long advertiserId = null;
        Long page = null;
        Long pageSize = null;
        SecurityScoreDisposalInfoGetV30OrderField orderField = null;
        SecurityScoreDisposalInfoGetV30OrderType orderType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        SecurityScoreDisposalInfoGetV30Response response = api.openApiV30SecurityScoreDisposalInfoGetGet(businessLine, filtering, advertiserId, page, pageSize, orderField, orderType);
        System.out.println(response);
    }

}