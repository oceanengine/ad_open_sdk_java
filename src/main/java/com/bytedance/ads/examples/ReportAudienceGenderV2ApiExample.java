/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportAudienceGenderV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportAudienceGenderV2IdType;
import com.bytedance.ads.model.ReportAudienceGenderV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/audience/gender/ GET
public class ReportAudienceGenderV2ApiExample {

    private static final ReportAudienceGenderV2Api api = new ReportAudienceGenderV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endDate = null;
        ReportAudienceGenderV2IdType idType = null;
        List<Long> ids = null;
        List<String> metrics = null;
        String startDate = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportAudienceGenderV2Response response = api.openApi2ReportAudienceGenderGet(advertiserId, endDate, idType, ids, metrics, startDate);
        System.out.println(response);
    }

}