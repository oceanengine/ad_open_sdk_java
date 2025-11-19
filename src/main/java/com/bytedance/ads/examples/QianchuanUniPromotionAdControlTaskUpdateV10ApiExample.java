package com.bytedance.ads.examples;

import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanUniPromotionAdControlTaskUpdateV10Api;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskCreateV10Scene;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskUpdateV10Request;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskUpdateV10Response;

public class QianchuanUniPromotionAdControlTaskUpdateV10ApiExample {

    public static void main(String[] args) throws ApiException {
        QianchuanUniPromotionAdControlTaskUpdateV10Request request = null;
        QianchuanUniPromotionAdControlTaskUpdateV10Api api = new QianchuanUniPromotionAdControlTaskUpdateV10Api();
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanUniPromotionAdControlTaskUpdateV10Response res = api.openApiV10QianchuanUniPromotionAdControlTaskUpdatePost(request);
        System.out.println(res);

    }
}
