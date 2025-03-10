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
import com.bytedance.ads.api.QianchuanUniPromotionAdControlTaskStatusUpdateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskStatusUpdateV10Request;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskStatusUpdateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/uni_promotion/ad/control_task/status/update/ POST
public class QianchuanUniPromotionAdControlTaskStatusUpdateV10ApiExample {

    private static final QianchuanUniPromotionAdControlTaskStatusUpdateV10Api api = new QianchuanUniPromotionAdControlTaskStatusUpdateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanUniPromotionAdControlTaskStatusUpdateV10Request qianchuanUniPromotionAdControlTaskStatusUpdateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanUniPromotionAdControlTaskStatusUpdateV10Response response = api.openApiV10QianchuanUniPromotionAdControlTaskStatusUpdatePost(qianchuanUniPromotionAdControlTaskStatusUpdateV10Request);
        System.out.println(response);
    }

}