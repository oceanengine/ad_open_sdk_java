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
import com.bytedance.ads.api.ClueSmartphoneGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueSmartphoneGetV2IsDel;
import com.bytedance.ads.model.ClueSmartphoneGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/smartphone/get/ GET
public class ClueSmartphoneGetV2ApiExample {

    private static final ClueSmartphoneGetV2Api api = new ClueSmartphoneGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endTime = null;
        List<Long> instanceIds = null;
        ClueSmartphoneGetV2IsDel isDel = null;
        Long page = null;
        Long pageSize = null;
        String startTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueSmartphoneGetV2Response response = api.openApi2ClueSmartphoneGetGet(advertiserId, endTime, instanceIds, isDel, page, pageSize, startTime);
        System.out.println(response);
    }

}