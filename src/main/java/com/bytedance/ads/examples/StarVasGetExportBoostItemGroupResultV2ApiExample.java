/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarVasGetExportBoostItemGroupResultV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarVasGetExportBoostItemGroupResultV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/vas/get_export_boost_item_group_result/ GET
public class StarVasGetExportBoostItemGroupResultV2ApiExample {

    private static final StarVasGetExportBoostItemGroupResultV2Api api = new StarVasGetExportBoostItemGroupResultV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long ticketId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarVasGetExportBoostItemGroupResultV2Response response = api.openApi2StarVasGetExportBoostItemGroupResultGet(starId, ticketId);
        System.out.println(response);
    }

}