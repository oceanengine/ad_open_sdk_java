/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StardeliveryTaskShareableListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StardeliveryTaskShareableListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/stardelivery/task/shareable/list/ GET
public class StardeliveryTaskShareableListV30ApiExample {

    private static final StardeliveryTaskShareableListV30Api api = new StardeliveryTaskShareableListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StardeliveryTaskShareableListV30Response response = api.openApiV30StardeliveryTaskShareableListGet(advertiserId, page, pageSize);
        System.out.println(response);
    }

}