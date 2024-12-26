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
import com.bytedance.ads.api.StarOrderUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarOrderUpdateV2Request;
import com.bytedance.ads.model.StarOrderUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/order/update/ POST
public class StarOrderUpdateV2ApiExample {

    private static final StarOrderUpdateV2Api api = new StarOrderUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        StarOrderUpdateV2Request starOrderUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarOrderUpdateV2Response response = api.openApi2StarOrderUpdatePost(starOrderUpdateV2Request);
        System.out.println(response);
    }

}