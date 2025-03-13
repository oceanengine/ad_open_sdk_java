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
import com.bytedance.ads.api.StarMcnProviderGetParticipatedTaskV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarMcnProviderGetParticipatedTaskV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/mcn/provider_get_participated_task/ GET
public class StarMcnProviderGetParticipatedTaskV2ApiExample {

    private static final StarMcnProviderGetParticipatedTaskV2Api api = new StarMcnProviderGetParticipatedTaskV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Integer page = null;
        Integer pageSize = null;
        Integer providerOrderTaskStatus = null;
        Integer providerTaskCategory = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarMcnProviderGetParticipatedTaskV2Response response = api.openApi2StarMcnProviderGetParticipatedTaskGet(starId, page, pageSize, providerOrderTaskStatus, providerTaskCategory);
        System.out.println(response);
    }

}