/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanUniPromotionAdMaterialDeleteV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialDeleteV10Request;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialDeleteV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/uni_promotion/ad/material/delete/ POST
public class QianchuanUniPromotionAdMaterialDeleteV10ApiExample {

    private static final QianchuanUniPromotionAdMaterialDeleteV10Api api = new QianchuanUniPromotionAdMaterialDeleteV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanUniPromotionAdMaterialDeleteV10Request qianchuanUniPromotionAdMaterialDeleteV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanUniPromotionAdMaterialDeleteV10Response response = api.openApiV10QianchuanUniPromotionAdMaterialDeletePost(qianchuanUniPromotionAdMaterialDeleteV10Request);
        System.out.println(response);
    }

}