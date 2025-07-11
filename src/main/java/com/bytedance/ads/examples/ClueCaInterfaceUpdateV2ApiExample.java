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
import com.bytedance.ads.api.ClueCaInterfaceUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueCaInterfaceUpdateV2Request;
import com.bytedance.ads.model.ClueCaInterfaceUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/ca/interface/update/ POST
public class ClueCaInterfaceUpdateV2ApiExample {

    private static final ClueCaInterfaceUpdateV2Api api = new ClueCaInterfaceUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        ClueCaInterfaceUpdateV2Request clueCaInterfaceUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueCaInterfaceUpdateV2Response response = api.openApi2ClueCaInterfaceUpdatePost(clueCaInterfaceUpdateV2Request);
        System.out.println(response);
    }

}