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
import com.bytedance.ads.api.ToolsAppManagementShareAccountListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementShareAccountListV2Response;
import com.bytedance.ads.model.ToolsAppManagementShareAccountListV2SearchType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/share_account/list/ GET
public class ToolsAppManagementShareAccountListV2ApiExample {

    private static final ToolsAppManagementShareAccountListV2Api api = new ToolsAppManagementShareAccountListV2Api();

    public static void main(String[] args) throws ApiException {
        Long organizationId = null;
        String packageId = null;
        Long page = null;
        Long pageSize = null;
        ToolsAppManagementShareAccountListV2SearchType searchType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementShareAccountListV2Response response = api.openApi2ToolsAppManagementShareAccountListGet(organizationId, packageId, page, pageSize, searchType);
        System.out.println(response);
    }

}