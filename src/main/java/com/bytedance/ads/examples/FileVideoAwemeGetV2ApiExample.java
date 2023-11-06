/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileVideoAwemeGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileVideoAwemeGetV2Filtering;
import com.bytedance.ads.model.FileVideoAwemeGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/video/aweme/get/ GET
public class FileVideoAwemeGetV2ApiExample {

    private static final FileVideoAwemeGetV2Api api = new FileVideoAwemeGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String awemeId = null;
        FileVideoAwemeGetV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        String cursor = null;
        Long count = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileVideoAwemeGetV2Response response = api.openApi2FileVideoAwemeGetGet(advertiserId, awemeId, filtering, page, pageSize, cursor, count);
        System.out.println(response);
    }

}