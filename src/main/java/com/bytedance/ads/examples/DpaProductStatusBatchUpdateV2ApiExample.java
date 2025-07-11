/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DpaProductStatusBatchUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaProductStatusBatchUpdateV2Request;
import com.bytedance.ads.model.DpaProductStatusBatchUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/product_status/batch_update/ POST
public class DpaProductStatusBatchUpdateV2ApiExample {

    private static final DpaProductStatusBatchUpdateV2Api api = new DpaProductStatusBatchUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        DpaProductStatusBatchUpdateV2Request dpaProductStatusBatchUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaProductStatusBatchUpdateV2Response response = api.openApi2DpaProductStatusBatchUpdatePost(dpaProductStatusBatchUpdateV2Request);
        System.out.println(response);
    }

}