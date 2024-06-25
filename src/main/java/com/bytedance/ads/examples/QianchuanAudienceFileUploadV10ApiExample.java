/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAudienceFileUploadV10Api;
import com.bytedance.ads.ApiClient;
import java.io.File;
import com.bytedance.ads.model.QianchuanAudienceFileUploadV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/audience_file/upload/ POST
public class QianchuanAudienceFileUploadV10ApiExample {

    private static final QianchuanAudienceFileUploadV10Api api = new QianchuanAudienceFileUploadV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        File _file = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAudienceFileUploadV10Response response = api.openApiV10QianchuanAudienceFileUploadPost(advertiserId, _file);
        System.out.println(response);
    }

}