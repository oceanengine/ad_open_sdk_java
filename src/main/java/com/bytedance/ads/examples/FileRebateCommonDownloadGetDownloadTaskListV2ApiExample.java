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
import com.bytedance.ads.api.FileRebateCommonDownloadGetDownloadTaskListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileRebateCommonDownloadGetDownloadTaskListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/rebate/common_download/get_download_task_list/ GET
public class FileRebateCommonDownloadGetDownloadTaskListV2ApiExample {

    private static final FileRebateCommonDownloadGetDownloadTaskListV2Api api = new FileRebateCommonDownloadGetDownloadTaskListV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        String queryId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileRebateCommonDownloadGetDownloadTaskListV2Response response = api.openApi2FileRebateCommonDownloadGetDownloadTaskListGet(agentId, queryId);
        System.out.println(response);
    }

}