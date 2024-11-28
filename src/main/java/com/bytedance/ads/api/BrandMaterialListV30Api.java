/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.api;

import com.bytedance.ads.ApiCallback;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.ApiResponse;
import com.bytedance.ads.Configuration;
import com.bytedance.ads.Pair;

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.BrandMaterialListV30CampaignFilter;
import com.bytedance.ads.model.BrandMaterialListV30MaterialStatus;
import com.bytedance.ads.model.BrandMaterialListV30OrderFilter;
import com.bytedance.ads.model.BrandMaterialListV30PageInfo;
import com.bytedance.ads.model.BrandMaterialListV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandMaterialListV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BrandMaterialListV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public BrandMaterialListV30Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for openApiV30BrandMaterialListGet
     * @param advertiserId 广告主id (required)
     * @param materialIds 素材ID (optional)
     * @param materialName 素材名称 (optional)
     * @param materialStatus 素材状态 (optional)
     * @param iesCoreUserId 抖音号ID (optional)
     * @param orderFilter 预订单过滤条件 (optional)
     * @param startTime 投放起始时间 (optional)
     * @param endTime 投放截止时间 (optional)
     * @param campaignFilter 广告组过滤条件 (optional)
     * @param pageInfo 分页信息 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30BrandMaterialListGetCall(Long advertiserId, List<Long> materialIds, String materialName, List<BrandMaterialListV30MaterialStatus> materialStatus, String iesCoreUserId, BrandMaterialListV30OrderFilter orderFilter, String startTime, String endTime, BrandMaterialListV30CampaignFilter campaignFilter, BrandMaterialListV30PageInfo pageInfo, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/open_api/v3.0/brand/material/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (materialIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "material_ids", materialIds));
        }

        if (materialName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("material_name", materialName));
        }

        if (materialStatus != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "material_status", materialStatus));
        }

        if (iesCoreUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ies_core_user_id", iesCoreUserId));
        }

        if (orderFilter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_filter", orderFilter));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (campaignFilter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("campaign_filter", campaignFilter));
        }

        if (pageInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_info", pageInfo));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApiV30BrandMaterialListGetValidateBeforeCall(Long advertiserId, List<Long> materialIds, String materialName, List<BrandMaterialListV30MaterialStatus> materialStatus, String iesCoreUserId, BrandMaterialListV30OrderFilter orderFilter, String startTime, String endTime, BrandMaterialListV30CampaignFilter campaignFilter, BrandMaterialListV30PageInfo pageInfo, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30BrandMaterialListGet(Async)");
        }

        return openApiV30BrandMaterialListGetCall(advertiserId, materialIds, materialName, materialStatus, iesCoreUserId, orderFilter, startTime, endTime, campaignFilter, pageInfo, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param materialIds 素材ID (optional)
     * @param materialName 素材名称 (optional)
     * @param materialStatus 素材状态 (optional)
     * @param iesCoreUserId 抖音号ID (optional)
     * @param orderFilter 预订单过滤条件 (optional)
     * @param startTime 投放起始时间 (optional)
     * @param endTime 投放截止时间 (optional)
     * @param campaignFilter 广告组过滤条件 (optional)
     * @param pageInfo 分页信息 (optional)
     * @return BrandMaterialListV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public BrandMaterialListV30Response openApiV30BrandMaterialListGet(Long advertiserId, List<Long> materialIds, String materialName, List<BrandMaterialListV30MaterialStatus> materialStatus, String iesCoreUserId, BrandMaterialListV30OrderFilter orderFilter, String startTime, String endTime, BrandMaterialListV30CampaignFilter campaignFilter, BrandMaterialListV30PageInfo pageInfo) throws ApiException {
        ApiResponse<BrandMaterialListV30Response> localVarResp = openApiV30BrandMaterialListGetWithHttpInfo(advertiserId, materialIds, materialName, materialStatus, iesCoreUserId, orderFilter, startTime, endTime, campaignFilter, pageInfo);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param materialIds 素材ID (optional)
     * @param materialName 素材名称 (optional)
     * @param materialStatus 素材状态 (optional)
     * @param iesCoreUserId 抖音号ID (optional)
     * @param orderFilter 预订单过滤条件 (optional)
     * @param startTime 投放起始时间 (optional)
     * @param endTime 投放截止时间 (optional)
     * @param campaignFilter 广告组过滤条件 (optional)
     * @param pageInfo 分页信息 (optional)
     * @return ApiResponse&lt;BrandMaterialListV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BrandMaterialListV30Response> openApiV30BrandMaterialListGetWithHttpInfo(Long advertiserId, List<Long> materialIds, String materialName, List<BrandMaterialListV30MaterialStatus> materialStatus, String iesCoreUserId, BrandMaterialListV30OrderFilter orderFilter, String startTime, String endTime, BrandMaterialListV30CampaignFilter campaignFilter, BrandMaterialListV30PageInfo pageInfo) throws ApiException {
        okhttp3.Call localVarCall = openApiV30BrandMaterialListGetValidateBeforeCall(advertiserId, materialIds, materialName, materialStatus, iesCoreUserId, orderFilter, startTime, endTime, campaignFilter, pageInfo, null);
        Type localVarReturnType = new TypeToken<BrandMaterialListV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主id (required)
     * @param materialIds 素材ID (optional)
     * @param materialName 素材名称 (optional)
     * @param materialStatus 素材状态 (optional)
     * @param iesCoreUserId 抖音号ID (optional)
     * @param orderFilter 预订单过滤条件 (optional)
     * @param startTime 投放起始时间 (optional)
     * @param endTime 投放截止时间 (optional)
     * @param campaignFilter 广告组过滤条件 (optional)
     * @param pageInfo 分页信息 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30BrandMaterialListGetAsync(Long advertiserId, List<Long> materialIds, String materialName, List<BrandMaterialListV30MaterialStatus> materialStatus, String iesCoreUserId, BrandMaterialListV30OrderFilter orderFilter, String startTime, String endTime, BrandMaterialListV30CampaignFilter campaignFilter, BrandMaterialListV30PageInfo pageInfo, final ApiCallback<BrandMaterialListV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30BrandMaterialListGetValidateBeforeCall(advertiserId, materialIds, materialName, materialStatus, iesCoreUserId, orderFilter, startTime, endTime, campaignFilter, pageInfo, _callback);
        Type localVarReturnType = new TypeToken<BrandMaterialListV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
