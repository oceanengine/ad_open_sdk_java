/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.EventManagerEventConfigsGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EventManagerEventConfigsGetV2Response;
import com.bytedance.ads.model.EventManagerEventConfigsGetV2SortType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/event_manager/event_configs/get/ GET
public class EventManagerEventConfigsGetV2ApiExample {

    private static final EventManagerEventConfigsGetV2Api api = new EventManagerEventConfigsGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long assetId = null;
        EventManagerEventConfigsGetV2SortType sortType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EventManagerEventConfigsGetV2Response response = api.openApi2EventManagerEventConfigsGetGet(advertiserId, assetId, sortType);
        System.out.println(response);
    }

}