/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPioneerProgramAttachmentUploadV2Api;
import com.bytedance.ads.ApiClient;
import java.io.File;
import com.bytedance.ads.model.ToolsPioneerProgramAttachmentUploadV2DataFileType;
import com.bytedance.ads.model.ToolsPioneerProgramAttachmentUploadV2Platform;
import com.bytedance.ads.model.ToolsPioneerProgramAttachmentUploadV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/pioneer_program/attachment/upload/ POST
public class ToolsPioneerProgramAttachmentUploadV2ApiExample {

    private static final ToolsPioneerProgramAttachmentUploadV2Api api = new ToolsPioneerProgramAttachmentUploadV2Api();

    public static void main(String[] args) throws ApiException {
        Long appId = null;
        ToolsPioneerProgramAttachmentUploadV2DataFileType dataFileType = null;
        File fileData = null;
        Long fileIndex = null;
        Long fileTotalNum = null;
        String pDate = null;
        ToolsPioneerProgramAttachmentUploadV2Platform platform = null;
        Boolean debugMode = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPioneerProgramAttachmentUploadV2Response response = api.openApi2ToolsPioneerProgramAttachmentUploadPost(appId, dataFileType, fileData, fileIndex, fileTotalNum, pDate, platform, debugMode);
        System.out.println(response);
    }

}