/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DmpDataSourceReadV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DmpDataSourceReadV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dmp/data_source/read/ GET
public class DmpDataSourceReadV2ApiExample {

    private static final DmpDataSourceReadV2Api api = new DmpDataSourceReadV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<String> dataSourceIdList = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DmpDataSourceReadV2Response response = api.openApi2DmpDataSourceReadGet(advertiserId, dataSourceIdList);
        System.out.println(response);
    }

}