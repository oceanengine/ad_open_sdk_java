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
import com.bytedance.ads.api.QianchuanAdBudgetUpdateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdBudgetUpdateV10Request;
import com.bytedance.ads.model.QianchuanAdBudgetUpdateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/ad/budget/update/ POST
public class QianchuanAdBudgetUpdateV10ApiExample {

    private static final QianchuanAdBudgetUpdateV10Api api = new QianchuanAdBudgetUpdateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanAdBudgetUpdateV10Request qianchuanAdBudgetUpdateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdBudgetUpdateV10Response response = api.openApiV10QianchuanAdBudgetUpdatePost(qianchuanAdBudgetUpdateV10Request);
        System.out.println(response);
    }

}