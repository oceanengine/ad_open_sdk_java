/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPrivativeWordBatchGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPrivativeWordBatchGetV30Request;
import com.bytedance.ads.model.ToolsPrivativeWordBatchGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/privative_word/batch_get/ POST
public class ToolsPrivativeWordBatchGetV30ApiExample {

    private static final ToolsPrivativeWordBatchGetV30Api api = new ToolsPrivativeWordBatchGetV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsPrivativeWordBatchGetV30Request toolsPrivativeWordBatchGetV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPrivativeWordBatchGetV30Response response = api.openApiV30ToolsPrivativeWordBatchGetPost(toolsPrivativeWordBatchGetV30Request);
        System.out.println(response);
    }

}