/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanFileVideoDeleteV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanFileVideoDeleteV10Request;
import com.bytedance.ads.model.QianchuanFileVideoDeleteV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/file/video/delete/ POST
public class QianchuanFileVideoDeleteV10ApiExample {

    private static final QianchuanFileVideoDeleteV10Api api = new QianchuanFileVideoDeleteV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanFileVideoDeleteV10Request qianchuanFileVideoDeleteV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanFileVideoDeleteV10Response response = api.openApiV10QianchuanFileVideoDeletePost(qianchuanFileVideoDeleteV10Request);
        System.out.println(response);
    }

}