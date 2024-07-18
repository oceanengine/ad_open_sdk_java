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
import com.bytedance.ads.api.ToolsAdPreviewQrcodeGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAdPreviewQrcodeGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/ad_preview/qrcode_get/ GET
public class ToolsAdPreviewQrcodeGetV30ApiExample {

    private static final ToolsAdPreviewQrcodeGetV30Api api = new ToolsAdPreviewQrcodeGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String idType = null;
        Long promotionId = null;
        Long materialId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAdPreviewQrcodeGetV30Response response = api.openApiV30ToolsAdPreviewQrcodeGetGet(advertiserId, idType, promotionId, materialId);
        System.out.println(response);
    }

}