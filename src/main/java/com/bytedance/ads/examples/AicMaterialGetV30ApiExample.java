/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AicMaterialGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AicMaterialGetV30AccountType;
import com.bytedance.ads.model.AicMaterialGetV30Filtering;
import com.bytedance.ads.model.AicMaterialGetV30OrderField;
import com.bytedance.ads.model.AicMaterialGetV30OrderType;
import com.bytedance.ads.model.AicMaterialGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/aic/material/get/ GET
public class AicMaterialGetV30ApiExample {

    private static final AicMaterialGetV30Api api = new AicMaterialGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        AicMaterialGetV30AccountType accountType = null;
        AicMaterialGetV30Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        AicMaterialGetV30OrderField orderField = null;
        AicMaterialGetV30OrderType orderType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AicMaterialGetV30Response response = api.openApiV30AicMaterialGetGet(accountId, accountType, filtering, page, pageSize, orderField, orderType);
        System.out.println(response);
    }

}