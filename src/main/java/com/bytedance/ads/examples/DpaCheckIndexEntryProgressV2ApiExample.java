/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DpaCheckIndexEntryProgressV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaCheckIndexEntryProgressV2Request;
import com.bytedance.ads.model.DpaCheckIndexEntryProgressV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/check_index_entry_progress/ POST
public class DpaCheckIndexEntryProgressV2ApiExample {

    private static final DpaCheckIndexEntryProgressV2Api api = new DpaCheckIndexEntryProgressV2Api();

    public static void main(String[] args) throws ApiException {
        DpaCheckIndexEntryProgressV2Request dpaCheckIndexEntryProgressV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaCheckIndexEntryProgressV2Response response = api.openApi2DpaCheckIndexEntryProgressPost(dpaCheckIndexEntryProgressV2Request);
        System.out.println(response);
    }

}