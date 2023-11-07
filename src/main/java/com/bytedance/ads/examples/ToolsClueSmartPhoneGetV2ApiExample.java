/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsClueSmartPhoneGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueSmartPhoneGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/smart_phone/get/ GET
public class ToolsClueSmartPhoneGetV2ApiExample {

    private static final ToolsClueSmartPhoneGetV2Api api = new ToolsClueSmartPhoneGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueSmartPhoneGetV2Response response = api.openApi2ToolsClueSmartPhoneGetGet(advertiserId, page, pageSize);
        System.out.println(response);
    }

}