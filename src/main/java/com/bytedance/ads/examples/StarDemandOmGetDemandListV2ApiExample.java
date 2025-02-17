/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarDemandOmGetDemandListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarDemandOmGetDemandListV2Response;
import com.bytedance.ads.model.StarDemandOmGetDemandListV2UniversalSettlementType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/demand/om_get_demand_list/ GET
public class StarDemandOmGetDemandListV2ApiExample {

    private static final StarDemandOmGetDemandListV2Api api = new StarDemandOmGetDemandListV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Integer pageNo = null;
        Integer pageSize = null;
        StarDemandOmGetDemandListV2UniversalSettlementType universalSettlementType = null;
        String microAppId = null;
        Long createStartTime = null;
        Long createEndTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarDemandOmGetDemandListV2Response response = api.openApi2StarDemandOmGetDemandListGet(starId, pageNo, pageSize, universalSettlementType, microAppId, createStartTime, createEndTime);
        System.out.println(response);
    }

}