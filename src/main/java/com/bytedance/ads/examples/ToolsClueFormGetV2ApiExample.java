/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsClueFormGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueFormGetV2FormType;
import com.bytedance.ads.model.ToolsClueFormGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/form/get/ GET
public class ToolsClueFormGetV2ApiExample {

    private static final ToolsClueFormGetV2Api api = new ToolsClueFormGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Integer page = null;
        Integer pageSize = null;
        String startTime = null;
        String endTime = null;
        Long instanceId = null;
        String name = null;
        Long isDel = null;
        ToolsClueFormGetV2FormType formType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueFormGetV2Response response = api.openApi2ToolsClueFormGetGet(advertiserId, page, pageSize, startTime, endTime, instanceId, name, isDel, formType);
        System.out.println(response);
    }

}