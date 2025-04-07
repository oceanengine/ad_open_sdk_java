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
import com.bytedance.ads.api.FileAudioAdV2Api;
import com.bytedance.ads.ApiClient;
import java.io.File;
import com.bytedance.ads.model.FileAudioAdV2Response;
import com.bytedance.ads.model.FileAudioAdV2UploadType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/audio/ad/ POST
public class FileAudioAdV2ApiExample {

    private static final FileAudioAdV2Api api = new FileAudioAdV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        FileAudioAdV2UploadType uploadType = null;
        File audioFile = null;
        String audioSignature = null;
        String audioUrl = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileAudioAdV2Response response = api.openApi2FileAudioAdPost(advertiserId, uploadType, audioFile, audioSignature, audioUrl);
        System.out.println(response);
    }

}