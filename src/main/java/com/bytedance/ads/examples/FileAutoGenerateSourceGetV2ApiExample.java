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
import com.bytedance.ads.api.FileAutoGenerateSourceGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileAutoGenerateSourceGetV2MaterialsInner;
import com.bytedance.ads.model.FileAutoGenerateSourceGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/auto_generate_source/get/ GET
public class FileAutoGenerateSourceGetV2ApiExample {

    private static final FileAutoGenerateSourceGetV2Api api = new FileAutoGenerateSourceGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<FileAutoGenerateSourceGetV2MaterialsInner> materials = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileAutoGenerateSourceGetV2Response response = api.openApi2FileAutoGenerateSourceGetGet(advertiserId, materials);
        System.out.println(response);
    }

}