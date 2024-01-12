/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.EnterpriseCommentListGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EnterpriseCommentListGetV10Filter;
import com.bytedance.ads.model.EnterpriseCommentListGetV10OrderType;
import com.bytedance.ads.model.EnterpriseCommentListGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/enterprise/comment/list/get/ GET
public class EnterpriseCommentListGetV10ApiExample {

    private static final EnterpriseCommentListGetV10Api api = new EnterpriseCommentListGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long ccAccountId = null;
        String eDouyinId = null;
        String endTime = null;
        EnterpriseCommentListGetV10Filter filter = null;
        String orderField = null;
        EnterpriseCommentListGetV10OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        String startTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EnterpriseCommentListGetV10Response response = api.openApiV10EnterpriseCommentListGetGet(ccAccountId, eDouyinId, endTime, filter, orderField, orderType, page, pageSize, startTime);
        System.out.println(response);
    }

}