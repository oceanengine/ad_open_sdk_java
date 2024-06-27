/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ClueWechatInstanceListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueWechatInstanceListV2Filter;
import com.bytedance.ads.model.ClueWechatInstanceListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/wechat_instance/list/ GET
public class ClueWechatInstanceListV2ApiExample {

    private static final ClueWechatInstanceListV2Api api = new ClueWechatInstanceListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ClueWechatInstanceListV2Filter filter = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueWechatInstanceListV2Response response = api.openApi2ClueWechatInstanceListGet(advertiserId, filter);
        System.out.println(response);
    }

}