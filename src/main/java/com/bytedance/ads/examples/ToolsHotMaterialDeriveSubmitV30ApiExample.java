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
import com.bytedance.ads.api.ToolsHotMaterialDeriveSubmitV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsHotMaterialDeriveSubmitV30Request;
import com.bytedance.ads.model.ToolsHotMaterialDeriveSubmitV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/hot_material_derive/submit/ POST
public class ToolsHotMaterialDeriveSubmitV30ApiExample {

    private static final ToolsHotMaterialDeriveSubmitV30Api api = new ToolsHotMaterialDeriveSubmitV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsHotMaterialDeriveSubmitV30Request toolsHotMaterialDeriveSubmitV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsHotMaterialDeriveSubmitV30Response response = api.openApiV30ToolsHotMaterialDeriveSubmitPost(toolsHotMaterialDeriveSubmitV30Request);
        System.out.println(response);
    }

}