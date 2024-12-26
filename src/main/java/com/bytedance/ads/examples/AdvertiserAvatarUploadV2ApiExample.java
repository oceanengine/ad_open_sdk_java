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
import com.bytedance.ads.api.AdvertiserAvatarUploadV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvertiserAvatarUploadV2Response;
import java.io.File;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/advertiser/avatar/upload/ POST
public class AdvertiserAvatarUploadV2ApiExample {

    private static final AdvertiserAvatarUploadV2Api api = new AdvertiserAvatarUploadV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        File imageFile = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvertiserAvatarUploadV2Response response = api.openApi2AdvertiserAvatarUploadPost(advertiserId, imageFile);
        System.out.println(response);
    }

}