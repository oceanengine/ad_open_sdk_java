/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.GameAddictionIdGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.GameAddictionIdGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/game_addiction_id/get/ GET
public class GameAddictionIdGetV30ApiExample {

    private static final GameAddictionIdGetV30Api api = new GameAddictionIdGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long assetId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        GameAddictionIdGetV30Response response = api.openApiV30GameAddictionIdGetGet(advertiserId, assetId);
        System.out.println(response);
    }

}