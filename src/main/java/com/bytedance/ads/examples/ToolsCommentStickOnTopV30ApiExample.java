/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsCommentStickOnTopV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsCommentStickOnTopV30Request;
import com.bytedance.ads.model.ToolsCommentStickOnTopV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/comment/stick_on_top/ POST
public class ToolsCommentStickOnTopV30ApiExample {

    private static final ToolsCommentStickOnTopV30Api api = new ToolsCommentStickOnTopV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsCommentStickOnTopV30Request toolsCommentStickOnTopV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsCommentStickOnTopV30Response response = api.openApiV30ToolsCommentStickOnTopPost(toolsCommentStickOnTopV30Request);
        System.out.println(response);
    }

}