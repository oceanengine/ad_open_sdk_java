/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanUniPromotionAdStatusUpdateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanUniPromotionAdStatusUpdateV10Request;
import com.bytedance.ads.model.QianchuanUniPromotionAdStatusUpdateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/uni_promotion/ad/status/update/ POST
public class QianchuanUniPromotionAdStatusUpdateV10ApiExample {

    private static final QianchuanUniPromotionAdStatusUpdateV10Api api = new QianchuanUniPromotionAdStatusUpdateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanUniPromotionAdStatusUpdateV10Request qianchuanUniPromotionAdStatusUpdateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanUniPromotionAdStatusUpdateV10Response response = api.openApiV10QianchuanUniPromotionAdStatusUpdatePost(qianchuanUniPromotionAdStatusUpdateV10Request);
        System.out.println(response);
    }

}