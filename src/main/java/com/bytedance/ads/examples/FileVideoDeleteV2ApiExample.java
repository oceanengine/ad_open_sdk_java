/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileVideoDeleteV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileVideoDeleteV2Request;
import com.bytedance.ads.model.FileVideoDeleteV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/video/delete/ POST
public class FileVideoDeleteV2ApiExample {

    private static final FileVideoDeleteV2Api api = new FileVideoDeleteV2Api();

    public static void main(String[] args) throws ApiException {
        FileVideoDeleteV2Request fileVideoDeleteV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileVideoDeleteV2Response response = api.openApi2FileVideoDeletePost(fileVideoDeleteV2Request);
        System.out.println(response);
    }

}