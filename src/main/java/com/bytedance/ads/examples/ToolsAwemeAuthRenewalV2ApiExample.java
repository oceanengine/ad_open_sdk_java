/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAwemeAuthRenewalV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAwemeAuthRenewalV2Request;
import com.bytedance.ads.model.ToolsAwemeAuthRenewalV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/aweme_auth/renewal/ POST
public class ToolsAwemeAuthRenewalV2ApiExample {

    private static final ToolsAwemeAuthRenewalV2Api api = new ToolsAwemeAuthRenewalV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAwemeAuthRenewalV2Request toolsAwemeAuthRenewalV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAwemeAuthRenewalV2Response response = api.openApi2ToolsAwemeAuthRenewalPost(toolsAwemeAuthRenewalV2Request);
        System.out.println(response);
    }

}