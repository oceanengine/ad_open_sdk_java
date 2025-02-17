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
import com.bytedance.ads.api.AicElementUploadV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AicElementUploadV30AccountType;
import com.bytedance.ads.model.AicElementUploadV30ElementType;
import com.bytedance.ads.model.AicElementUploadV30Response;
import com.bytedance.ads.model.AicElementUploadV30UseAs;
import java.io.File;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/aic/element/upload/ POST
public class AicElementUploadV30ApiExample {

    private static final AicElementUploadV30Api api = new AicElementUploadV30Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        AicElementUploadV30AccountType accountType = null;
        AicElementUploadV30ElementType elementType = null;
        String elementName = null;
        File _file = null;
        String pathName = null;
        AicElementUploadV30UseAs useAs = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AicElementUploadV30Response response = api.openApiV30AicElementUploadPost(accountId, accountType, elementType, elementName, _file, pathName, useAs);
        System.out.println(response);
    }

}