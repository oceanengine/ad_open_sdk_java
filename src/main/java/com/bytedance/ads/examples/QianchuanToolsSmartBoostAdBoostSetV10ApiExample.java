/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanToolsSmartBoostAdBoostSetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostSetV10Request;
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostSetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/set/ POST
public class QianchuanToolsSmartBoostAdBoostSetV10ApiExample {

    private static final QianchuanToolsSmartBoostAdBoostSetV10Api api = new QianchuanToolsSmartBoostAdBoostSetV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanToolsSmartBoostAdBoostSetV10Request qianchuanToolsSmartBoostAdBoostSetV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanToolsSmartBoostAdBoostSetV10Response response = api.openApiV10QianchuanToolsSmartBoostAdBoostSetPost(qianchuanToolsSmartBoostAdBoostSetV10Request);
        System.out.println(response);
    }

}