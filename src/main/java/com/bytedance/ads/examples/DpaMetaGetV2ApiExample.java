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
import com.bytedance.ads.api.DpaMetaGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaMetaGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/meta/get/ GET
public class DpaMetaGetV2ApiExample {

    private static final DpaMetaGetV2Api api = new DpaMetaGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long platformId = null;
        Long indexable = null;
        Long extractable = null;
        Long industry = null;
        Long status = null;
        Long mediaType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaMetaGetV2Response response = api.openApi2DpaMetaGetGet(advertiserId, platformId, indexable, extractable, industry, status, mediaType);
        System.out.println(response);
    }

}