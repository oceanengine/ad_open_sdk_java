/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAwemeOrderTerminateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAwemeOrderTerminateV10Request;
import com.bytedance.ads.model.QianchuanAwemeOrderTerminateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/aweme/order/terminate/ POST
public class QianchuanAwemeOrderTerminateV10ApiExample {

    private static final QianchuanAwemeOrderTerminateV10Api api = new QianchuanAwemeOrderTerminateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanAwemeOrderTerminateV10Request qianchuanAwemeOrderTerminateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAwemeOrderTerminateV10Response response = api.openApiV10QianchuanAwemeOrderTerminatePost(qianchuanAwemeOrderTerminateV10Request);
        System.out.println(response);
    }

}