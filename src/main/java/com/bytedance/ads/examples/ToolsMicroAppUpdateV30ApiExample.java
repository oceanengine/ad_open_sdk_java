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
import com.bytedance.ads.api.ToolsMicroAppUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsMicroAppUpdateV30Request;
import com.bytedance.ads.model.ToolsMicroAppUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/micro_app/update/ POST
public class ToolsMicroAppUpdateV30ApiExample {

    private static final ToolsMicroAppUpdateV30Api api = new ToolsMicroAppUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsMicroAppUpdateV30Request toolsMicroAppUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsMicroAppUpdateV30Response response = api.openApiV30ToolsMicroAppUpdatePost(toolsMicroAppUpdateV30Request);
        System.out.println(response);
    }

}