/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanShopAuthorizedGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanShopAuthorizedGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/shop/authorized/get/ GET
public class QianchuanShopAuthorizedGetV10ApiExample {

    private static final QianchuanShopAuthorizedGetV10Api api = new QianchuanShopAuthorizedGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanShopAuthorizedGetV10Response response = api.openApiV10QianchuanShopAuthorizedGetGet(advertiserId, page, pageSize);
        System.out.println(response);
    }

}