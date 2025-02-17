/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsUnionFlowPackageGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsUnionFlowPackageGetV2Filtering;
import com.bytedance.ads.model.ToolsUnionFlowPackageGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/union/flow_package/get/ GET
public class ToolsUnionFlowPackageGetV2ApiExample {

    private static final ToolsUnionFlowPackageGetV2Api api = new ToolsUnionFlowPackageGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsUnionFlowPackageGetV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsUnionFlowPackageGetV2Response response = api.openApi2ToolsUnionFlowPackageGetGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}