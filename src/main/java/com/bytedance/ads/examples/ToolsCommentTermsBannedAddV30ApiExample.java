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
import com.bytedance.ads.api.ToolsCommentTermsBannedAddV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsCommentTermsBannedAddV30Request;
import com.bytedance.ads.model.ToolsCommentTermsBannedAddV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/comment/terms_banned/add/ POST
public class ToolsCommentTermsBannedAddV30ApiExample {

    private static final ToolsCommentTermsBannedAddV30Api api = new ToolsCommentTermsBannedAddV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsCommentTermsBannedAddV30Request toolsCommentTermsBannedAddV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsCommentTermsBannedAddV30Response response = api.openApiV30ToolsCommentTermsBannedAddPost(toolsCommentTermsBannedAddV30Request);
        System.out.println(response);
    }

}