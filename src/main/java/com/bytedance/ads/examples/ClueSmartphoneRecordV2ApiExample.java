/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ClueSmartphoneRecordV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueSmartphoneRecordV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/smartphone/record/ GET
public class ClueSmartphoneRecordV2ApiExample {

    private static final ClueSmartphoneRecordV2Api api = new ClueSmartphoneRecordV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> instanceIds = null;
        List<Long> clueIds = null;
        List<Long> siteIds = null;
        List<Long> adIds = null;
        String startTime = null;
        String endTime = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueSmartphoneRecordV2Response response = api.openApi2ClueSmartphoneRecordGet(advertiserId, instanceIds, clueIds, siteIds, adIds, startTime, endTime, page, pageSize);
        System.out.println(response);
    }

}