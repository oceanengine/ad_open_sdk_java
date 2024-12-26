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
import com.bytedance.ads.api.EventManagerTrackUrlGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EventManagerTrackUrlGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/event_manager/track_url/get/ GET
public class EventManagerTrackUrlGetV2ApiExample {

    private static final EventManagerTrackUrlGetV2Api api = new EventManagerTrackUrlGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long assetId = null;
        String downloadUrl = null;
        String trackUrlGroupName = null;
        Long trackUrlGroupId = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EventManagerTrackUrlGetV2Response response = api.openApi2EventManagerTrackUrlGetGet(advertiserId, assetId, downloadUrl, trackUrlGroupName, trackUrlGroupId, page, pageSize);
        System.out.println(response);
    }

}