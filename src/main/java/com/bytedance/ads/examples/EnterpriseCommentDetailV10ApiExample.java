/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.EnterpriseCommentDetailV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EnterpriseCommentDetailV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/enterprise/comment/detail/ GET
public class EnterpriseCommentDetailV10ApiExample {

    private static final EnterpriseCommentDetailV10Api api = new EnterpriseCommentDetailV10Api();

    public static void main(String[] args) throws ApiException {
        Long ccAccountId = null;
        Long commentId = null;
        String eDouyinId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EnterpriseCommentDetailV10Response response = api.openApiV10EnterpriseCommentDetailGet(ccAccountId, commentId, eDouyinId);
        System.out.println(response);
    }

}