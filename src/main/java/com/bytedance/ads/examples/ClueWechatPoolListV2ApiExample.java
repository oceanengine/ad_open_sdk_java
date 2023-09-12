/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ClueWechatPoolListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueWechatPoolListV2Filter;
import com.bytedance.ads.model.ClueWechatPoolListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/wechat_pool/list/ GET
public class ClueWechatPoolListV2ApiExample {

    private static final ClueWechatPoolListV2Api api = new ClueWechatPoolListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ClueWechatPoolListV2Filter filter = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueWechatPoolListV2Response response = api.openApi2ClueWechatPoolListGet(advertiserId, filter);
        System.out.println(response);
    }

}