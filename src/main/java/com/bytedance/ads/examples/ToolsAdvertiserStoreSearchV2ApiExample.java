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
import com.bytedance.ads.api.ToolsAdvertiserStoreSearchV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAdvertiserStoreSearchV2Response;
import com.bytedance.ads.model.ToolsAdvertiserStoreSearchV2Type;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/advertiser_store/search/ GET
public class ToolsAdvertiserStoreSearchV2ApiExample {

    private static final ToolsAdvertiserStoreSearchV2Api api = new ToolsAdvertiserStoreSearchV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long pageSize = null;
        ToolsAdvertiserStoreSearchV2Type type = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAdvertiserStoreSearchV2Response response = api.openApi2ToolsAdvertiserStoreSearchGet(advertiserId, page, pageSize, type);
        System.out.println(response);
    }

}