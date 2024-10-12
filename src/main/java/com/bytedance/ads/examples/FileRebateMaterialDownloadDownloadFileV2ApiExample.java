/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileRebateMaterialDownloadDownloadFileV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileRebateMaterialDownloadDownloadFileV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/rebate/material_download/download_file/ GET
public class FileRebateMaterialDownloadDownloadFileV2ApiExample {

    private static final FileRebateMaterialDownloadDownloadFileV2Api api = new FileRebateMaterialDownloadDownloadFileV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        String taskId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileRebateMaterialDownloadDownloadFileV2Response response = api.openApi2FileRebateMaterialDownloadDownloadFileGet(agentId, taskId);
        System.out.println(response);
    }

}