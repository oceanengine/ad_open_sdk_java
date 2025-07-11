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
import com.bytedance.ads.api.StarOrderRejectResourceV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarOrderRejectResourceV2Request;
import com.bytedance.ads.model.StarOrderRejectResourceV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/order/reject_resource/ POST
public class StarOrderRejectResourceV2ApiExample {

    private static final StarOrderRejectResourceV2Api api = new StarOrderRejectResourceV2Api();

    public static void main(String[] args) throws ApiException {
        StarOrderRejectResourceV2Request starOrderRejectResourceV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarOrderRejectResourceV2Response response = api.openApi2StarOrderRejectResourcePost(starOrderRejectResourceV2Request);
        System.out.println(response);
    }

}