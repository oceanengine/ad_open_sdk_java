/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CreateProjectInvoiceV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreateProjectInvoiceV2Request;
import com.bytedance.ads.model.CreateProjectInvoiceV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/create/project_invoice/ POST
public class CreateProjectInvoiceV2ApiExample {

    private static final CreateProjectInvoiceV2Api api = new CreateProjectInvoiceV2Api();

    public static void main(String[] args) throws ApiException {
        CreateProjectInvoiceV2Request createProjectInvoiceV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreateProjectInvoiceV2Response response = api.openApi2CreateProjectInvoicePost(createProjectInvoiceV2Request);
        System.out.println(response);
    }

}