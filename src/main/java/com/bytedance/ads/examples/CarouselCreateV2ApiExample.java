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
import com.bytedance.ads.api.CarouselCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CarouselCreateV2Request;
import com.bytedance.ads.model.CarouselCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/carousel/create/ POST
public class CarouselCreateV2ApiExample {

    private static final CarouselCreateV2Api api = new CarouselCreateV2Api();

    public static void main(String[] args) throws ApiException {
        CarouselCreateV2Request carouselCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CarouselCreateV2Response response = api.openApi2CarouselCreatePost(carouselCreateV2Request);
        System.out.println(response);
    }

}