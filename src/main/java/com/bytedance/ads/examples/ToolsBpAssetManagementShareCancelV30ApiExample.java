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
import com.bytedance.ads.api.ToolsBpAssetManagementShareCancelV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsBpAssetManagementShareCancelV30Request;
import com.bytedance.ads.model.ToolsBpAssetManagementShareCancelV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/bp_asset_management/share/cancel/ POST
public class ToolsBpAssetManagementShareCancelV30ApiExample {

    private static final ToolsBpAssetManagementShareCancelV30Api api = new ToolsBpAssetManagementShareCancelV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsBpAssetManagementShareCancelV30Request toolsBpAssetManagementShareCancelV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsBpAssetManagementShareCancelV30Response response = api.openApiV30ToolsBpAssetManagementShareCancelPost(toolsBpAssetManagementShareCancelV30Request);
        System.out.println(response);
    }

}