/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAbTestCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAbTestCreateV2Request;
import com.bytedance.ads.model.ToolsAbTestCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ab_test/create/ POST
public class ToolsAbTestCreateV2ApiExample {

    private static final ToolsAbTestCreateV2Api api = new ToolsAbTestCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAbTestCreateV2Request toolsAbTestCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAbTestCreateV2Response response = api.openApi2ToolsAbTestCreatePost(toolsAbTestCreateV2Request);
        System.out.println(response);
    }

}