/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.LocalMultiPoiIdPoiIdsGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalMultiPoiIdPoiIdsGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/multi_poi_id/poi_ids/get/ GET
public class LocalMultiPoiIdPoiIdsGetV30ApiExample {

    private static final LocalMultiPoiIdPoiIdsGetV30Api api = new LocalMultiPoiIdPoiIdsGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long localAccountId = null;
        List<Long> multiPoiIds = null;
        Boolean needEnable = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalMultiPoiIdPoiIdsGetV30Response response = api.openApiV30LocalMultiPoiIdPoiIdsGetGet(localAccountId, multiPoiIds, needEnable);
        System.out.println(response);
    }

}