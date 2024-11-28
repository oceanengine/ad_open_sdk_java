/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileRebateMaterialDownloadGetDownloadTaskListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileRebateMaterialDownloadGetDownloadTaskListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/rebate/material_download/get_download_task_list/ GET
public class FileRebateMaterialDownloadGetDownloadTaskListV2ApiExample {

    private static final FileRebateMaterialDownloadGetDownloadTaskListV2Api api = new FileRebateMaterialDownloadGetDownloadTaskListV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        String queryId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileRebateMaterialDownloadGetDownloadTaskListV2Response response = api.openApi2FileRebateMaterialDownloadGetDownloadTaskListGet(agentId, queryId);
        System.out.println(response);
    }

}