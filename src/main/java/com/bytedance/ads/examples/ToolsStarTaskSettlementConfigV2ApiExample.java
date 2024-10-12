/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsStarTaskSettlementConfigV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsStarTaskSettlementConfigV2Response;
import com.bytedance.ads.model.ToolsStarTaskSettlementConfigV2StarTaskExternalAction;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/star_task/settlement_config/ GET
public class ToolsStarTaskSettlementConfigV2ApiExample {

    private static final ToolsStarTaskSettlementConfigV2Api api = new ToolsStarTaskSettlementConfigV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long firstIndustryId = null;
        Long secondIndustryId = null;
        Long starMaterialFirstType = null;
        Long starMaterialSecondType = null;
        ToolsStarTaskSettlementConfigV2StarTaskExternalAction starTaskExternalAction = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsStarTaskSettlementConfigV2Response response = api.openApi2ToolsStarTaskSettlementConfigGet(advertiserId, firstIndustryId, secondIndustryId, starMaterialFirstType, starMaterialSecondType, starTaskExternalAction);
        System.out.println(response);
    }

}