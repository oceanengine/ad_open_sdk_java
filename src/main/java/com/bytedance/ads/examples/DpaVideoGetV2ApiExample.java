/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DpaVideoGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaVideoGetV2Filtering;
import com.bytedance.ads.model.DpaVideoGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/video/get/ GET
public class DpaVideoGetV2ApiExample {

    private static final DpaVideoGetV2Api api = new DpaVideoGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        DpaVideoGetV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaVideoGetV2Response response = api.openApi2DpaVideoGetGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}