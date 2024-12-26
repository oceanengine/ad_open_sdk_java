/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.SpiTaskGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.SpiTaskGetV2Response;
import com.bytedance.ads.model.SpiTaskGetV2Status;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/spi_task/get/ GET
public class SpiTaskGetV2ApiExample {

    private static final SpiTaskGetV2Api api = new SpiTaskGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long appId = null;
        Long count = null;
        Long cursor = null;
        String endDate = null;
        Long page = null;
        Long pageSize = null;
        String serviceLabel = null;
        String startDate = null;
        SpiTaskGetV2Status status = null;
        Long subscribeId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        SpiTaskGetV2Response response = api.openApi2SpiTaskGetGet(appId, count, cursor, endDate, page, pageSize, serviceLabel, startDate, status, subscribeId);
        System.out.println(response);
    }

}