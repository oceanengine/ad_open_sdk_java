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
import com.bytedance.ads.api.QianchuanUniPromotionAdControlTaskListV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskListV10Fields;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskListV10Filtering;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskListV10MarketingGoal;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskListV10OrderField;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskListV10OrderType;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskListV10Response;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskListV10Scene;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/uni_promotion/ad/control_task/list/ GET
public class QianchuanUniPromotionAdControlTaskListV10ApiExample {

    private static final QianchuanUniPromotionAdControlTaskListV10Api api = new QianchuanUniPromotionAdControlTaskListV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanUniPromotionAdControlTaskListV10MarketingGoal marketingGoal = null;
        Long adId = null;
        String startTime = null;
        String endTime = null;
        QianchuanUniPromotionAdControlTaskListV10Scene scene = null;
        List<QianchuanUniPromotionAdControlTaskListV10Fields> fields = null;
        QianchuanUniPromotionAdControlTaskListV10Filtering filtering = null;
        QianchuanUniPromotionAdControlTaskListV10OrderType orderType = null;
        QianchuanUniPromotionAdControlTaskListV10OrderField orderField = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanUniPromotionAdControlTaskListV10Response response = api.openApiV10QianchuanUniPromotionAdControlTaskListGet(advertiserId, marketingGoal, adId, startTime, endTime, scene, fields, filtering, orderType, orderField, page, pageSize);
        System.out.println(response);
    }

}