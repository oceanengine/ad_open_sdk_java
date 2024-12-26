/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarMcnProviderGetTaskShareCodeV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarMcnProviderGetTaskShareCodeV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/mcn/provider_get_task_share_code/ GET
public class StarMcnProviderGetTaskShareCodeV2ApiExample {

    private static final StarMcnProviderGetTaskShareCodeV2Api api = new StarMcnProviderGetTaskShareCodeV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long taskId = null;
        String channelId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarMcnProviderGetTaskShareCodeV2Response response = api.openApi2StarMcnProviderGetTaskShareCodeGet(starId, taskId, channelId);
        System.out.println(response);
    }

}