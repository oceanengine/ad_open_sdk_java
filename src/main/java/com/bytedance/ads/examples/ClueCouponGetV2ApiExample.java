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
import com.bytedance.ads.api.ClueCouponGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueCouponGetV2ActivityTypes;
import com.bytedance.ads.model.ClueCouponGetV2IsDel;
import com.bytedance.ads.model.ClueCouponGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/coupon/get/ GET
public class ClueCouponGetV2ApiExample {

    private static final ClueCouponGetV2Api api = new ClueCouponGetV2Api();

    public static void main(String[] args) throws ApiException {
        List<Long> activityIds = null;
        List<ClueCouponGetV2ActivityTypes> activityTypes = null;
        Long advertiserId = null;
        String endTime = null;
        ClueCouponGetV2IsDel isDel = null;
        Long page = null;
        Long pageSize = null;
        String startTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueCouponGetV2Response response = api.openApi2ClueCouponGetGet(activityIds, activityTypes, advertiserId, endTime, isDel, page, pageSize, startTime);
        System.out.println(response);
    }

}