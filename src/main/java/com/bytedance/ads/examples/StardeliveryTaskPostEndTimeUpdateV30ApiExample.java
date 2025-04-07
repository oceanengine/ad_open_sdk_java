/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StardeliveryTaskPostEndTimeUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StardeliveryTaskPostEndTimeUpdateV30Request;
import com.bytedance.ads.model.StardeliveryTaskPostEndTimeUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/stardelivery/task/post_end_time/update/ POST
public class StardeliveryTaskPostEndTimeUpdateV30ApiExample {

    private static final StardeliveryTaskPostEndTimeUpdateV30Api api = new StardeliveryTaskPostEndTimeUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        StardeliveryTaskPostEndTimeUpdateV30Request stardeliveryTaskPostEndTimeUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StardeliveryTaskPostEndTimeUpdateV30Response response = api.openApiV30StardeliveryTaskPostEndTimeUpdatePost(stardeliveryTaskPostEndTimeUpdateV30Request);
        System.out.println(response);
    }

}