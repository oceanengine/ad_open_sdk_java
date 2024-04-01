/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarAttachmentUploadV2Api;
import com.bytedance.ads.ApiClient;
import java.io.File;
import com.bytedance.ads.model.StarAttachmentUploadV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/attachment/upload/ POST
public class StarAttachmentUploadV2ApiExample {

    private static final StarAttachmentUploadV2Api api = new StarAttachmentUploadV2Api();

    public static void main(String[] args) throws ApiException {
        File _file = null;
        File fileName = null;
        Long starId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarAttachmentUploadV2Response response = api.openApi2StarAttachmentUploadPost(_file, fileName, starId);
        System.out.println(response);
    }

}