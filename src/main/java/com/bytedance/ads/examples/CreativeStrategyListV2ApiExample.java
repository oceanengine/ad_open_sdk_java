/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CreativeStrategyListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeStrategyListV2Response;
import com.bytedance.ads.model.CreativeStrategyListV2StrategyTypes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/strategy/list/ GET
public class CreativeStrategyListV2ApiExample {

    private static final CreativeStrategyListV2Api api = new CreativeStrategyListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<CreativeStrategyListV2StrategyTypes> strategyTypes = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeStrategyListV2Response response = api.openApi2CreativeStrategyListGet(advertiserId, strategyTypes, page, pageSize);
        System.out.println(response);
    }

}