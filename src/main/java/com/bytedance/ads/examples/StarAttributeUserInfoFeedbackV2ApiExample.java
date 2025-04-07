/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarAttributeUserInfoFeedbackV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarAttributeUserInfoFeedbackV2Request;
import com.bytedance.ads.model.StarAttributeUserInfoFeedbackV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/attribute/user_info_feedback/ POST
public class StarAttributeUserInfoFeedbackV2ApiExample {

    private static final StarAttributeUserInfoFeedbackV2Api api = new StarAttributeUserInfoFeedbackV2Api();

    public static void main(String[] args) throws ApiException {
        StarAttributeUserInfoFeedbackV2Request starAttributeUserInfoFeedbackV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarAttributeUserInfoFeedbackV2Response response = api.openApi2StarAttributeUserInfoFeedbackPost(starAttributeUserInfoFeedbackV2Request);
        System.out.println(response);
    }

}