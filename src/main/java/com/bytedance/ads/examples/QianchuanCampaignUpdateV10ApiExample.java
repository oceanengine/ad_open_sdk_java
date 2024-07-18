/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanCampaignUpdateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanCampaignUpdateV10Request;
import com.bytedance.ads.model.QianchuanCampaignUpdateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/campaign/update/ POST
public class QianchuanCampaignUpdateV10ApiExample {

    private static final QianchuanCampaignUpdateV10Api api = new QianchuanCampaignUpdateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanCampaignUpdateV10Request qianchuanCampaignUpdateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanCampaignUpdateV10Response response = api.openApiV10QianchuanCampaignUpdatePost(qianchuanCampaignUpdateV10Request);
        System.out.println(response);
    }

}