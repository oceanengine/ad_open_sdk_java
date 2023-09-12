/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsUnionFlowPackageDeleteV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsUnionFlowPackageDeleteV2Request;
import com.bytedance.ads.model.ToolsUnionFlowPackageDeleteV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/union/flow_package/delete/ POST
public class ToolsUnionFlowPackageDeleteV2ApiExample {

    private static final ToolsUnionFlowPackageDeleteV2Api api = new ToolsUnionFlowPackageDeleteV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsUnionFlowPackageDeleteV2Request toolsUnionFlowPackageDeleteV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsUnionFlowPackageDeleteV2Response response = api.openApi2ToolsUnionFlowPackageDeletePost(toolsUnionFlowPackageDeleteV2Request);
        System.out.println(response);
    }

}