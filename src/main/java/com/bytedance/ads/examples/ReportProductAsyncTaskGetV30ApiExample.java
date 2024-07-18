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
import com.bytedance.ads.api.ReportProductAsyncTaskGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportProductAsyncTaskGetV30Request;
import com.bytedance.ads.model.ReportProductAsyncTaskGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/product/async_task/get/ POST
public class ReportProductAsyncTaskGetV30ApiExample {

    private static final ReportProductAsyncTaskGetV30Api api = new ReportProductAsyncTaskGetV30Api();

    public static void main(String[] args) throws ApiException {
        ReportProductAsyncTaskGetV30Request reportProductAsyncTaskGetV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportProductAsyncTaskGetV30Response response = api.openApiV30ReportProductAsyncTaskGetPost(reportProductAsyncTaskGetV30Request);
        System.out.println(response);
    }

}