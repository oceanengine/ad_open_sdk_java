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
import com.bytedance.ads.api.ToolsRegionGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsRegionGetV2RegionLevel;
import com.bytedance.ads.model.ToolsRegionGetV2RegionType;
import com.bytedance.ads.model.ToolsRegionGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/region/get/ GET
public class ToolsRegionGetV2ApiExample {

    private static final ToolsRegionGetV2Api api = new ToolsRegionGetV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsRegionGetV2RegionLevel regionLevel = null;
        ToolsRegionGetV2RegionType regionType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsRegionGetV2Response response = api.openApi2ToolsRegionGetGet(regionLevel, regionType);
        System.out.println(response);
    }

}