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
import com.bytedance.ads.api.FileVideoAgentGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileVideoAgentGetV2Filtering;
import com.bytedance.ads.model.FileVideoAgentGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/video/agent/get/ GET
public class FileVideoAgentGetV2ApiExample {

    private static final FileVideoAgentGetV2Api api = new FileVideoAgentGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        Long page = null;
        Long pageSize = null;
        FileVideoAgentGetV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileVideoAgentGetV2Response response = api.openApi2FileVideoAgentGetGet(agentId, page, pageSize, filtering);
        System.out.println(response);
    }

}