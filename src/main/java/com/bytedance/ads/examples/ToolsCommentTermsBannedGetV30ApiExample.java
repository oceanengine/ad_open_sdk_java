/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsCommentTermsBannedGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsCommentTermsBannedGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/comment/terms_banned/get/ GET
public class ToolsCommentTermsBannedGetV30ApiExample {

    private static final ToolsCommentTermsBannedGetV30Api api = new ToolsCommentTermsBannedGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long pageSize = null;
        String awemeId = null;
        Boolean isApplyToAdv = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsCommentTermsBannedGetV30Response response = api.openApiV30ToolsCommentTermsBannedGetGet(advertiserId, page, pageSize, awemeId, isApplyToAdv);
        System.out.println(response);
    }

}