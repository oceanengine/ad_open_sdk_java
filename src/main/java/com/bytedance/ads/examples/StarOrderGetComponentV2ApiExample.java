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
import com.bytedance.ads.api.StarOrderGetComponentV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarOrderGetComponentV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/order/get_component/ GET
public class StarOrderGetComponentV2ApiExample {

    private static final StarOrderGetComponentV2Api api = new StarOrderGetComponentV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        List<Long> orderIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarOrderGetComponentV2Response response = api.openApi2StarOrderGetComponentGet(starId, orderIds);
        System.out.println(response);
    }

}