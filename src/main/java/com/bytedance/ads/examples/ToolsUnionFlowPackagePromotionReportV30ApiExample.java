/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsUnionFlowPackagePromotionReportV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsUnionFlowPackagePromotionReportV30Filter;
import com.bytedance.ads.model.ToolsUnionFlowPackagePromotionReportV30OrderType;
import com.bytedance.ads.model.ToolsUnionFlowPackagePromotionReportV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/union/flow_package/promotion/report/ GET
public class ToolsUnionFlowPackagePromotionReportV30ApiExample {

    private static final ToolsUnionFlowPackagePromotionReportV30Api api = new ToolsUnionFlowPackagePromotionReportV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsUnionFlowPackagePromotionReportV30Filter filter = null;
        String orderField = null;
        ToolsUnionFlowPackagePromotionReportV30OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsUnionFlowPackagePromotionReportV30Response response = api.openApiV30ToolsUnionFlowPackagePromotionReportGet(advertiserId, filter, orderField, orderType, page, pageSize);
        System.out.println(response);
    }

}