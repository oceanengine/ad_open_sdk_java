/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarVasGetBoostItemGroupDetailV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/vas/get_boost_item_group_detail/ GET
public class StarVasGetBoostItemGroupDetailV2ApiExample {

    private static final StarVasGetBoostItemGroupDetailV2Api api = new StarVasGetBoostItemGroupDetailV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long taskId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarVasGetBoostItemGroupDetailV2Response response = api.openApi2StarVasGetBoostItemGroupDetailGet(starId, taskId);
        System.out.println(response);
    }

}