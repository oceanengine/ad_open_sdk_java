package com.bytedance.ads.examples;

import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanUniPromotionAdControlTaskBudgetUpdateV10Api;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskBudgetUpdateV10Request;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskBudgetUpdateV10Response;

import java.util.Arrays;
import java.util.Collections;

public class QianchuanUniPromotionAdControlTaskBudgetUpdateV10ApiExample {

    public static void main(String[] args) throws ApiException {
        QianchuanUniPromotionAdControlTaskBudgetUpdateV10Request request = null;
        QianchuanUniPromotionAdControlTaskBudgetUpdateV10Api api = new QianchuanUniPromotionAdControlTaskBudgetUpdateV10Api();
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanUniPromotionAdControlTaskBudgetUpdateV10Response res = api.openApiV10QianchuanUniPromotionAdControlTaskBudgetUpdatePost(request);
        System.out.println(res);
    }

}
