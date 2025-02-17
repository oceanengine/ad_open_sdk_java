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
import com.bytedance.ads.api.ToolsDiagnosisSuggestionGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsDiagnosisSuggestionGetV2Response;
import com.bytedance.ads.model.ToolsDiagnosisSuggestionGetV2Scenes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/diagnosis/suggestion/get/ GET
public class ToolsDiagnosisSuggestionGetV2ApiExample {

    private static final ToolsDiagnosisSuggestionGetV2Api api = new ToolsDiagnosisSuggestionGetV2Api();

    public static void main(String[] args) throws ApiException {
        List<Long> adIds = null;
        List<ToolsDiagnosisSuggestionGetV2Scenes> scenes = null;
        Long advertiserId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsDiagnosisSuggestionGetV2Response response = api.openApi2ToolsDiagnosisSuggestionGetGet(adIds, scenes, advertiserId);
        System.out.println(response);
    }

}