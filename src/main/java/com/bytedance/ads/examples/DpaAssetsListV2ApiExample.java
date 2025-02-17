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
import com.bytedance.ads.api.DpaAssetsListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaAssetsListV2Filtering;
import com.bytedance.ads.model.DpaAssetsListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/assets/list/ GET
public class DpaAssetsListV2ApiExample {

    private static final DpaAssetsListV2Api api = new DpaAssetsListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        DpaAssetsListV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        Long platformId = null;
        List<Long> productIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaAssetsListV2Response response = api.openApi2DpaAssetsListGet(advertiserId, filtering, page, pageSize, platformId, productIds);
        System.out.println(response);
    }

}