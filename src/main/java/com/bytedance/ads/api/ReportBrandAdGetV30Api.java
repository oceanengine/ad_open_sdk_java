/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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



import com.bytedance.ads.model.ReportBrandAdGetV30LandingType;
import com.bytedance.ads.model.ReportBrandAdGetV30PricingType;
import com.bytedance.ads.model.ReportBrandAdGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportBrandAdGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportBrandAdGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportBrandAdGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ReportBrandAdGetGet
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 默认每页最大值为100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @param adIds 计划ID 每次请求上限100个 (optional)
     * @param startTime 开始时间 格式2023-01-01 (optional)
     * @param endTime 结束时间 格式2023-01-01 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportBrandAdGetGetCall(Long advertiserId, Long page, Long size, ReportBrandAdGetV30LandingType landingType, ReportBrandAdGetV30PricingType pricingType, List<String> adIds, String startTime, String endTime, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/report/brand/ad/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (landingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("landing_type", landingType));
        }

        if (pricingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pricing_type", pricingType));
        }

        if (adIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "ad_ids", adIds));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
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
    private okhttp3.Call openApiV30ReportBrandAdGetGetValidateBeforeCall(Long advertiserId, Long page, Long size, ReportBrandAdGetV30LandingType landingType, ReportBrandAdGetV30PricingType pricingType, List<String> adIds, String startTime, String endTime, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ReportBrandAdGetGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApiV30ReportBrandAdGetGet(Async)");
        }

        // verify the required parameter 'size' is set
        if (size == null) {
            throw new ApiException("Missing the required parameter 'size' when calling openApiV30ReportBrandAdGetGet(Async)");
        }

        return openApiV30ReportBrandAdGetGetCall(advertiserId, page, size, landingType, pricingType, adIds, startTime, endTime, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 默认每页最大值为100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @param adIds 计划ID 每次请求上限100个 (optional)
     * @param startTime 开始时间 格式2023-01-01 (optional)
     * @param endTime 结束时间 格式2023-01-01 (optional)
     * @return ReportBrandAdGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportBrandAdGetV30Response openApiV30ReportBrandAdGetGet(Long advertiserId, Long page, Long size, ReportBrandAdGetV30LandingType landingType, ReportBrandAdGetV30PricingType pricingType, List<String> adIds, String startTime, String endTime) throws ApiException {
        ApiResponse<ReportBrandAdGetV30Response> localVarResp = openApiV30ReportBrandAdGetGetWithHttpInfo(advertiserId, page, size, landingType, pricingType, adIds, startTime, endTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 默认每页最大值为100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @param adIds 计划ID 每次请求上限100个 (optional)
     * @param startTime 开始时间 格式2023-01-01 (optional)
     * @param endTime 结束时间 格式2023-01-01 (optional)
     * @return ApiResponse&lt;ReportBrandAdGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportBrandAdGetV30Response> openApiV30ReportBrandAdGetGetWithHttpInfo(Long advertiserId, Long page, Long size, ReportBrandAdGetV30LandingType landingType, ReportBrandAdGetV30PricingType pricingType, List<String> adIds, String startTime, String endTime) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ReportBrandAdGetGetValidateBeforeCall(advertiserId, page, size, landingType, pricingType, adIds, startTime, endTime, null);
        Type localVarReturnType = new TypeToken<ReportBrandAdGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 默认每页最大值为100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @param adIds 计划ID 每次请求上限100个 (optional)
     * @param startTime 开始时间 格式2023-01-01 (optional)
     * @param endTime 结束时间 格式2023-01-01 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportBrandAdGetGetAsync(Long advertiserId, Long page, Long size, ReportBrandAdGetV30LandingType landingType, ReportBrandAdGetV30PricingType pricingType, List<String> adIds, String startTime, String endTime, final ApiCallback<ReportBrandAdGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ReportBrandAdGetGetValidateBeforeCall(advertiserId, page, size, landingType, pricingType, adIds, startTime, endTime, _callback);
        Type localVarReturnType = new TypeToken<ReportBrandAdGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
