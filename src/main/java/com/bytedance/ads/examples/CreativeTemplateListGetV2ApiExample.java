/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CreativeTemplateListGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeTemplateListGetV2ImageMode;
import com.bytedance.ads.model.CreativeTemplateListGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/template/list/get/ GET
public class CreativeTemplateListGetV2ApiExample {

    private static final CreativeTemplateListGetV2Api api = new CreativeTemplateListGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long adId = null;
        CreativeTemplateListGetV2ImageMode imageMode = null;
        List<String> templateTagIds = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeTemplateListGetV2Response response = api.openApi2CreativeTemplateListGetGet(advertiserId, adId, imageMode, templateTagIds, page, pageSize);
        System.out.println(response);
    }

}