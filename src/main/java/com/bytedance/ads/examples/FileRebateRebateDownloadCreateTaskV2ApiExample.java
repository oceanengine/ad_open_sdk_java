/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileRebateRebateDownloadCreateTaskV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileRebateRebateDownloadCreateTaskV2Request;
import com.bytedance.ads.model.FileRebateRebateDownloadCreateTaskV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/rebate/rebate_download/create_task/ POST
public class FileRebateRebateDownloadCreateTaskV2ApiExample {

    private static final FileRebateRebateDownloadCreateTaskV2Api api = new FileRebateRebateDownloadCreateTaskV2Api();

    public static void main(String[] args) throws ApiException {
        FileRebateRebateDownloadCreateTaskV2Request fileRebateRebateDownloadCreateTaskV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileRebateRebateDownloadCreateTaskV2Response response = api.openApi2FileRebateRebateDownloadCreateTaskPost(fileRebateRebateDownloadCreateTaskV2Request);
        System.out.println(response);
    }

}