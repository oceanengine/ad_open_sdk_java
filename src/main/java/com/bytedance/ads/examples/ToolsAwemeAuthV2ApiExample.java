/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAwemeAuthV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAwemeAuthV2Request;
import com.bytedance.ads.model.ToolsAwemeAuthV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/aweme_auth/ POST
public class ToolsAwemeAuthV2ApiExample {

    private static final ToolsAwemeAuthV2Api api = new ToolsAwemeAuthV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAwemeAuthV2Request toolsAwemeAuthV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAwemeAuthV2Response response = api.openApi2ToolsAwemeAuthPost(toolsAwemeAuthV2Request);
        System.out.println(response);
    }

}