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
import com.bytedance.ads.api.KeywordFeedadsSuggestV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.KeywordFeedadsSuggestV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/keyword_feedads/suggest/ GET
public class KeywordFeedadsSuggestV2ApiExample {

    private static final KeywordFeedadsSuggestV2Api api = new KeywordFeedadsSuggestV2Api();

    public static void main(String[] args) throws ApiException {
        Long adId = null;
        Long advertiserId = null;
        Long reqKeywordType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        KeywordFeedadsSuggestV2Response response = api.openApi2KeywordFeedadsSuggestGet(adId, advertiserId, reqKeywordType);
        System.out.println(response);
    }

}