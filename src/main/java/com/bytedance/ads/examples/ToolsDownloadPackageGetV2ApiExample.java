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
import com.bytedance.ads.api.ToolsDownloadPackageGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsDownloadPackageGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/download/package/get/ GET
public class ToolsDownloadPackageGetV2ApiExample {

    private static final ToolsDownloadPackageGetV2Api api = new ToolsDownloadPackageGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String eventId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsDownloadPackageGetV2Response response = api.openApi2ToolsDownloadPackageGetGet(advertiserId, eventId);
        System.out.println(response);
    }

}