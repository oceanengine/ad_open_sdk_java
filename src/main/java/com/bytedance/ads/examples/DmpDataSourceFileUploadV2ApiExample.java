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
import com.bytedance.ads.api.DmpDataSourceFileUploadV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DmpDataSourceFileUploadV2Response;
import java.io.File;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dmp/data_source/file/upload/ POST
public class DmpDataSourceFileUploadV2ApiExample {

    private static final DmpDataSourceFileUploadV2Api api = new DmpDataSourceFileUploadV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        File _file = null;
        String fileSignature = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DmpDataSourceFileUploadV2Response response = api.openApi2DmpDataSourceFileUploadPost(advertiserId, _file, fileSignature);
        System.out.println(response);
    }

}