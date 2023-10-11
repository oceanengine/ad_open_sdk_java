/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsUnionFlowPackageReportV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsUnionFlowPackageReportV2Filter;
import com.bytedance.ads.model.ToolsUnionFlowPackageReportV2OrderType;
import com.bytedance.ads.model.ToolsUnionFlowPackageReportV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/union/flow_package/report/ GET
public class ToolsUnionFlowPackageReportV2ApiExample {

    private static final ToolsUnionFlowPackageReportV2Api api = new ToolsUnionFlowPackageReportV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsUnionFlowPackageReportV2Filter filter = null;
        String orderField = null;
        ToolsUnionFlowPackageReportV2OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsUnionFlowPackageReportV2Response response = api.openApi2ToolsUnionFlowPackageReportGet(advertiserId, filter, orderField, orderType, page, pageSize);
        System.out.println(response);
    }

}