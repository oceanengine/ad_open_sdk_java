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
import com.bytedance.ads.api.CreateStatementV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreateStatementV2Request;
import com.bytedance.ads.model.CreateStatementV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/create/statement/ POST
public class CreateStatementV2ApiExample {

    private static final CreateStatementV2Api api = new CreateStatementV2Api();

    public static void main(String[] args) throws ApiException {
        CreateStatementV2Request createStatementV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreateStatementV2Response response = api.openApi2CreateStatementPost(createStatementV2Request);
        System.out.println(response);
    }

}