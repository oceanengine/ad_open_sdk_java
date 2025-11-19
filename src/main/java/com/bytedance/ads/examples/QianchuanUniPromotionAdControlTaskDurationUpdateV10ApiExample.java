package com.bytedance.ads.examples;

import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanUniPromotionAdControlTaskDurationUpdateV10Api;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskDurationUpdateV10Request;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskDurationUpdateV10Response;

import java.util.Arrays;

public class QianchuanUniPromotionAdControlTaskDurationUpdateV10ApiExample {

    public static void main(String[] args) throws ApiException {
        QianchuanUniPromotionAdControlTaskDurationUpdateV10Request request = null;
        QianchuanUniPromotionAdControlTaskDurationUpdateV10Api api = new QianchuanUniPromotionAdControlTaskDurationUpdateV10Api();
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanUniPromotionAdControlTaskDurationUpdateV10Response res = api.openApiV10QianchuanUniPromotionAdControlTaskDurationUpdatePost(request);
        System.out.println(res);

    }
}
