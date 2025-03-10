/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AsyncTaskCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AsyncTaskCreateV2Request;
import com.bytedance.ads.model.AsyncTaskCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/async_task/create/ POST
public class AsyncTaskCreateV2ApiExample {

    private static final AsyncTaskCreateV2Api api = new AsyncTaskCreateV2Api();

    public static void main(String[] args) throws ApiException {
        AsyncTaskCreateV2Request asyncTaskCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AsyncTaskCreateV2Response response = api.openApi2AsyncTaskCreatePost(asyncTaskCreateV2Request);
        System.out.println(response);
    }

}