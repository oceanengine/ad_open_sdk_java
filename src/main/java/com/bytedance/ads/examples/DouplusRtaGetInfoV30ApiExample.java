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
import com.bytedance.ads.api.DouplusRtaGetInfoV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DouplusRtaGetInfoV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/douplus/rta/get_info/ GET
public class DouplusRtaGetInfoV30ApiExample {

    private static final DouplusRtaGetInfoV30Api api = new DouplusRtaGetInfoV30Api();

    public static void main(String[] args) throws ApiException {
        String awemeSecUid = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DouplusRtaGetInfoV30Response response = api.openApiV30DouplusRtaGetInfoGet(awemeSecUid);
        System.out.println(response);
    }

}