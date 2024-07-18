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
import com.bytedance.ads.api.CarouselUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CarouselUpdateV2Request;
import com.bytedance.ads.model.CarouselUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/carousel/update/ POST
public class CarouselUpdateV2ApiExample {

    private static final CarouselUpdateV2Api api = new CarouselUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        CarouselUpdateV2Request carouselUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CarouselUpdateV2Response response = api.openApi2CarouselUpdatePost(carouselUpdateV2Request);
        System.out.println(response);
    }

}