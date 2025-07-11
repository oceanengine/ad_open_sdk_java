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
import com.bytedance.ads.api.StarBrandCategoryListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarBrandCategoryListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/brand_category/list/ GET
public class StarBrandCategoryListV2ApiExample {

    private static final StarBrandCategoryListV2Api api = new StarBrandCategoryListV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long brandId = null;
        List<String> industry = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarBrandCategoryListV2Response response = api.openApi2StarBrandCategoryListGet(starId, brandId, industry);
        System.out.println(response);
    }

}