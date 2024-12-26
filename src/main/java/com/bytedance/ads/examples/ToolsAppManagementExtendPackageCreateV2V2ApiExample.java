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
import com.bytedance.ads.api.ToolsAppManagementExtendPackageCreateV2V2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageCreateV2V2Request;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageCreateV2V2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/extend_package/create_v2/ POST
public class ToolsAppManagementExtendPackageCreateV2V2ApiExample {

    private static final ToolsAppManagementExtendPackageCreateV2V2Api api = new ToolsAppManagementExtendPackageCreateV2V2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAppManagementExtendPackageCreateV2V2Request toolsAppManagementExtendPackageCreateV2V2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementExtendPackageCreateV2V2Response response = api.openApi2ToolsAppManagementExtendPackageCreateV2Post(toolsAppManagementExtendPackageCreateV2V2Request);
        System.out.println(response);
    }

}