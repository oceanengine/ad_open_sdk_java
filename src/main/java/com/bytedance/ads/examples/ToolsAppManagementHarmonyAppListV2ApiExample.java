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
import com.bytedance.ads.api.ToolsAppManagementHarmonyAppListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementHarmonyAppListV2AccountType;
import com.bytedance.ads.model.ToolsAppManagementHarmonyAppListV2Filtering;
import com.bytedance.ads.model.ToolsAppManagementHarmonyAppListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/harmony_app_list/ GET
public class ToolsAppManagementHarmonyAppListV2ApiExample {

    private static final ToolsAppManagementHarmonyAppListV2Api api = new ToolsAppManagementHarmonyAppListV2Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        ToolsAppManagementHarmonyAppListV2AccountType accountType = null;
        Long page = null;
        Long pageSize = null;
        ToolsAppManagementHarmonyAppListV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementHarmonyAppListV2Response response = api.openApi2ToolsAppManagementHarmonyAppListGet(accountId, accountType, page, pageSize, filtering);
        System.out.println(response);
    }

}