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
import com.bytedance.ads.api.DpaClueProductDeleteV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaClueProductDeleteV2Request;
import com.bytedance.ads.model.DpaClueProductDeleteV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/clue_product/delete/ POST
public class DpaClueProductDeleteV2ApiExample {

    private static final DpaClueProductDeleteV2Api api = new DpaClueProductDeleteV2Api();

    public static void main(String[] args) throws ApiException {
        DpaClueProductDeleteV2Request dpaClueProductDeleteV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaClueProductDeleteV2Response response = api.openApi2DpaClueProductDeletePost(dpaClueProductDeleteV2Request);
        System.out.println(response);
    }

}