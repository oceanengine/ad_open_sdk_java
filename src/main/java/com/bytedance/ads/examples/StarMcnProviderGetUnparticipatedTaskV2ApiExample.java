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
import com.bytedance.ads.api.StarMcnProviderGetUnparticipatedTaskV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarMcnProviderGetUnparticipatedTaskV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/mcn/provider_get_unparticipated_task/ GET
public class StarMcnProviderGetUnparticipatedTaskV2ApiExample {

    private static final StarMcnProviderGetUnparticipatedTaskV2Api api = new StarMcnProviderGetUnparticipatedTaskV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Integer page = null;
        Integer pageSize = null;
        Long payType = null;
        Long minCreateTimeStamp = null;
        Long maxCreateTimeStamp = null;
        Integer firstClassCategory = null;
        Integer secondClassCategory = null;
        Integer productCategory = null;
        String appId = null;
        String appName = null;
        Long demandId = null;
        Long gameType = null;
        Long componentType = null;
        List<Long> searchTags = null;
        Long firstCategoryId = null;
        Long secondCategoryId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarMcnProviderGetUnparticipatedTaskV2Response response = api.openApi2StarMcnProviderGetUnparticipatedTaskGet(starId, page, pageSize, payType, minCreateTimeStamp, maxCreateTimeStamp, firstClassCategory, secondClassCategory, productCategory, appId, appName, demandId, gameType, componentType, searchTags, firstCategoryId, secondCategoryId);
        System.out.println(response);
    }

}