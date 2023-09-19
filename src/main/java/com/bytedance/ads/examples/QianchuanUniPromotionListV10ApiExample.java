/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanUniPromotionListV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanUniPromotionListV10Fields;
import com.bytedance.ads.model.QianchuanUniPromotionListV10MarketingGoal;
import com.bytedance.ads.model.QianchuanUniPromotionListV10OrderField;
import com.bytedance.ads.model.QianchuanUniPromotionListV10OrderType;
import com.bytedance.ads.model.QianchuanUniPromotionListV10PageSize;
import com.bytedance.ads.model.QianchuanUniPromotionListV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/uni_promotion/list/ GET
public class QianchuanUniPromotionListV10ApiExample {

    private static final QianchuanUniPromotionListV10Api api = new QianchuanUniPromotionListV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startTime = null;
        String endTime = null;
        QianchuanUniPromotionListV10MarketingGoal marketingGoal = null;
        List<QianchuanUniPromotionListV10Fields> fields = null;
        QianchuanUniPromotionListV10OrderType orderType = null;
        QianchuanUniPromotionListV10OrderField orderField = null;
        Integer page = null;
        QianchuanUniPromotionListV10PageSize pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanUniPromotionListV10Response response = api.openApiV10QianchuanUniPromotionListGet(advertiserId, startTime, endTime, marketingGoal, fields, orderType, orderField, page, pageSize);
        System.out.println(response);
    }

}