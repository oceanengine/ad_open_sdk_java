/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanToolsAwemeAuthV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanToolsAwemeAuthV10Request;
import com.bytedance.ads.model.QianchuanToolsAwemeAuthV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/tools/aweme_auth/ POST
public class QianchuanToolsAwemeAuthV10ApiExample {

    private static final QianchuanToolsAwemeAuthV10Api api = new QianchuanToolsAwemeAuthV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanToolsAwemeAuthV10Request qianchuanToolsAwemeAuthV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanToolsAwemeAuthV10Response response = api.openApiV10QianchuanToolsAwemeAuthPost(qianchuanToolsAwemeAuthV10Request);
        System.out.println(response);
    }

}