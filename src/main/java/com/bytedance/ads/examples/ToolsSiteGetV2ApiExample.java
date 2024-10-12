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
import com.bytedance.ads.api.ToolsSiteGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsSiteGetV2Filtering;
import com.bytedance.ads.model.ToolsSiteGetV2Response;
import com.bytedance.ads.model.ToolsSiteGetV2ShareType;
import com.bytedance.ads.model.ToolsSiteGetV2Status;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/site/get/ GET
public class ToolsSiteGetV2ApiExample {

    private static final ToolsSiteGetV2Api api = new ToolsSiteGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String xOrangeCaller = null;
        Long page = null;
        Long pageSize = null;
        ToolsSiteGetV2Status status = null;
        ToolsSiteGetV2ShareType shareType = null;
        ToolsSiteGetV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsSiteGetV2Response response = api.openApi2ToolsSiteGetGet(advertiserId, xOrangeCaller, page, pageSize, status, shareType, filtering);
        System.out.println(response);
    }

}