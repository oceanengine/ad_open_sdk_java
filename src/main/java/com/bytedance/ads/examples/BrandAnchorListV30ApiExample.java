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
import com.bytedance.ads.api.BrandAnchorListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandAnchorListV30Page;
import com.bytedance.ads.model.BrandAnchorListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/anchor/list/ GET
public class BrandAnchorListV30ApiExample {

    private static final BrandAnchorListV30Api api = new BrandAnchorListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        BrandAnchorListV30Page page = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandAnchorListV30Response response = api.openApiV30BrandAnchorListGet(advertiserId, page);
        System.out.println(response);
    }

}