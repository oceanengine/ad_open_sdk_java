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
import com.bytedance.ads.api.ReportAudienceAwemeListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportAudienceAwemeListV2Filtering;
import com.bytedance.ads.model.ReportAudienceAwemeListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/audience/aweme/list/ GET
public class ReportAudienceAwemeListV2ApiExample {

    private static final ReportAudienceAwemeListV2Api api = new ReportAudienceAwemeListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endDate = null;
        ReportAudienceAwemeListV2Filtering filtering = null;
        List<String> metrics = null;
        Long page = null;
        Long pageSize = null;
        String startDate = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportAudienceAwemeListV2Response response = api.openApi2ReportAudienceAwemeListGet(advertiserId, endDate, filtering, metrics, page, pageSize, startDate);
        System.out.println(response);
    }

}