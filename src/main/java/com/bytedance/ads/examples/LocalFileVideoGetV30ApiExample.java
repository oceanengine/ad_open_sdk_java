/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.LocalFileVideoGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalFileVideoGetV30Filtering;
import com.bytedance.ads.model.LocalFileVideoGetV30OrderField;
import com.bytedance.ads.model.LocalFileVideoGetV30OrderType;
import com.bytedance.ads.model.LocalFileVideoGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/file/video/get/ GET
public class LocalFileVideoGetV30ApiExample {

    private static final LocalFileVideoGetV30Api api = new LocalFileVideoGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long localAccountId = null;
        LocalFileVideoGetV30Filtering filtering = null;
        LocalFileVideoGetV30OrderField orderField = null;
        LocalFileVideoGetV30OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalFileVideoGetV30Response response = api.openApiV30LocalFileVideoGetGet(localAccountId, filtering, orderField, orderType, page, pageSize);
        System.out.println(response);
    }

}