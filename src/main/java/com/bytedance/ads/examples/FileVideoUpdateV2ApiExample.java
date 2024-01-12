/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileVideoUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileVideoUpdateV2Request;
import com.bytedance.ads.model.FileVideoUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/video/update/ POST
public class FileVideoUpdateV2ApiExample {

    private static final FileVideoUpdateV2Api api = new FileVideoUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        FileVideoUpdateV2Request fileVideoUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileVideoUpdateV2Response response = api.openApi2FileVideoUpdatePost(fileVideoUpdateV2Request);
        System.out.println(response);
    }

}