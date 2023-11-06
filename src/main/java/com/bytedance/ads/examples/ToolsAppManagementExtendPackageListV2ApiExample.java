/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAppManagementExtendPackageListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2Filtering;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/extend_package/list/ GET
public class ToolsAppManagementExtendPackageListV2ApiExample {

    private static final ToolsAppManagementExtendPackageListV2Api api = new ToolsAppManagementExtendPackageListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsAppManagementExtendPackageListV2Filtering filtering = null;
        String packageId = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementExtendPackageListV2Response response = api.openApi2ToolsAppManagementExtendPackageListGet(advertiserId, filtering, packageId, page, pageSize);
        System.out.println(response);
    }

}