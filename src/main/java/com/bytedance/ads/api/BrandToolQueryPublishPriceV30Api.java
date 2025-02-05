/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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



import com.bytedance.ads.model.BrandToolQueryPublishPriceV30AdForm;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30AppOrigin;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30AudienceInfo;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30Classify;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30DeliveryInfo;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30GdSendType;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30PricingType;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30ProType;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandToolQueryPublishPriceV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BrandToolQueryPublishPriceV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public BrandToolQueryPublishPriceV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30BrandToolQueryPublishPriceGet
     * @param advertiserId 广告主ID (required)
     * @param classify 广告类别 (required)
     * @param proType 产品类型 (required)
     * @param adForm 投放产品 (required)
     * @param appOrigin 投放位置（媒体端） (required)
     * @param pricingType 计费类型 (required)
     * @param gdSendType 优化目标 (required)
     * @param policyNo 政策编号 (required)
     * @param deliveryInfo 投放日期信息 (required)
     * @param intentionNo 招商订单编号 (optional)
     * @param audienceInfo 定向 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30BrandToolQueryPublishPriceGetCall(Long advertiserId, BrandToolQueryPublishPriceV30Classify classify, BrandToolQueryPublishPriceV30ProType proType, BrandToolQueryPublishPriceV30AdForm adForm, BrandToolQueryPublishPriceV30AppOrigin appOrigin, BrandToolQueryPublishPriceV30PricingType pricingType, BrandToolQueryPublishPriceV30GdSendType gdSendType, String policyNo, BrandToolQueryPublishPriceV30DeliveryInfo deliveryInfo, String intentionNo, BrandToolQueryPublishPriceV30AudienceInfo audienceInfo, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/brand/tool/query_publish_price/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (classify != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("classify", classify));
        }

        if (intentionNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("intention_no", intentionNo));
        }

        if (proType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pro_type", proType));
        }

        if (adForm != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_form", adForm));
        }

        if (appOrigin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_origin", appOrigin));
        }

        if (pricingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pricing_type", pricingType));
        }

        if (gdSendType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gd_send_type", gdSendType));
        }

        if (audienceInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("audience_info", audienceInfo));
        }

        if (policyNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policy_no", policyNo));
        }

        if (deliveryInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("delivery_info", deliveryInfo));
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
    private okhttp3.Call openApiV30BrandToolQueryPublishPriceGetValidateBeforeCall(Long advertiserId, BrandToolQueryPublishPriceV30Classify classify, BrandToolQueryPublishPriceV30ProType proType, BrandToolQueryPublishPriceV30AdForm adForm, BrandToolQueryPublishPriceV30AppOrigin appOrigin, BrandToolQueryPublishPriceV30PricingType pricingType, BrandToolQueryPublishPriceV30GdSendType gdSendType, String policyNo, BrandToolQueryPublishPriceV30DeliveryInfo deliveryInfo, String intentionNo, BrandToolQueryPublishPriceV30AudienceInfo audienceInfo, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30BrandToolQueryPublishPriceGet(Async)");
        }

        // verify the required parameter 'classify' is set
        if (classify == null) {
            throw new ApiException("Missing the required parameter 'classify' when calling openApiV30BrandToolQueryPublishPriceGet(Async)");
        }

        // verify the required parameter 'proType' is set
        if (proType == null) {
            throw new ApiException("Missing the required parameter 'proType' when calling openApiV30BrandToolQueryPublishPriceGet(Async)");
        }

        // verify the required parameter 'adForm' is set
        if (adForm == null) {
            throw new ApiException("Missing the required parameter 'adForm' when calling openApiV30BrandToolQueryPublishPriceGet(Async)");
        }

        // verify the required parameter 'appOrigin' is set
        if (appOrigin == null) {
            throw new ApiException("Missing the required parameter 'appOrigin' when calling openApiV30BrandToolQueryPublishPriceGet(Async)");
        }

        // verify the required parameter 'pricingType' is set
        if (pricingType == null) {
            throw new ApiException("Missing the required parameter 'pricingType' when calling openApiV30BrandToolQueryPublishPriceGet(Async)");
        }

        // verify the required parameter 'gdSendType' is set
        if (gdSendType == null) {
            throw new ApiException("Missing the required parameter 'gdSendType' when calling openApiV30BrandToolQueryPublishPriceGet(Async)");
        }

        // verify the required parameter 'policyNo' is set
        if (policyNo == null) {
            throw new ApiException("Missing the required parameter 'policyNo' when calling openApiV30BrandToolQueryPublishPriceGet(Async)");
        }

        // verify the required parameter 'deliveryInfo' is set
        if (deliveryInfo == null) {
            throw new ApiException("Missing the required parameter 'deliveryInfo' when calling openApiV30BrandToolQueryPublishPriceGet(Async)");
        }

        return openApiV30BrandToolQueryPublishPriceGetCall(advertiserId, classify, proType, adForm, appOrigin, pricingType, gdSendType, policyNo, deliveryInfo, intentionNo, audienceInfo, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param classify 广告类别 (required)
     * @param proType 产品类型 (required)
     * @param adForm 投放产品 (required)
     * @param appOrigin 投放位置（媒体端） (required)
     * @param pricingType 计费类型 (required)
     * @param gdSendType 优化目标 (required)
     * @param policyNo 政策编号 (required)
     * @param deliveryInfo 投放日期信息 (required)
     * @param intentionNo 招商订单编号 (optional)
     * @param audienceInfo 定向 (optional)
     * @return BrandToolQueryPublishPriceV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public BrandToolQueryPublishPriceV30Response openApiV30BrandToolQueryPublishPriceGet(Long advertiserId, BrandToolQueryPublishPriceV30Classify classify, BrandToolQueryPublishPriceV30ProType proType, BrandToolQueryPublishPriceV30AdForm adForm, BrandToolQueryPublishPriceV30AppOrigin appOrigin, BrandToolQueryPublishPriceV30PricingType pricingType, BrandToolQueryPublishPriceV30GdSendType gdSendType, String policyNo, BrandToolQueryPublishPriceV30DeliveryInfo deliveryInfo, String intentionNo, BrandToolQueryPublishPriceV30AudienceInfo audienceInfo) throws ApiException {
        ApiResponse<BrandToolQueryPublishPriceV30Response> localVarResp = openApiV30BrandToolQueryPublishPriceGetWithHttpInfo(advertiserId, classify, proType, adForm, appOrigin, pricingType, gdSendType, policyNo, deliveryInfo, intentionNo, audienceInfo);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param classify 广告类别 (required)
     * @param proType 产品类型 (required)
     * @param adForm 投放产品 (required)
     * @param appOrigin 投放位置（媒体端） (required)
     * @param pricingType 计费类型 (required)
     * @param gdSendType 优化目标 (required)
     * @param policyNo 政策编号 (required)
     * @param deliveryInfo 投放日期信息 (required)
     * @param intentionNo 招商订单编号 (optional)
     * @param audienceInfo 定向 (optional)
     * @return ApiResponse&lt;BrandToolQueryPublishPriceV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BrandToolQueryPublishPriceV30Response> openApiV30BrandToolQueryPublishPriceGetWithHttpInfo(Long advertiserId, BrandToolQueryPublishPriceV30Classify classify, BrandToolQueryPublishPriceV30ProType proType, BrandToolQueryPublishPriceV30AdForm adForm, BrandToolQueryPublishPriceV30AppOrigin appOrigin, BrandToolQueryPublishPriceV30PricingType pricingType, BrandToolQueryPublishPriceV30GdSendType gdSendType, String policyNo, BrandToolQueryPublishPriceV30DeliveryInfo deliveryInfo, String intentionNo, BrandToolQueryPublishPriceV30AudienceInfo audienceInfo) throws ApiException {
        okhttp3.Call localVarCall = openApiV30BrandToolQueryPublishPriceGetValidateBeforeCall(advertiserId, classify, proType, adForm, appOrigin, pricingType, gdSendType, policyNo, deliveryInfo, intentionNo, audienceInfo, null);
        Type localVarReturnType = new TypeToken<BrandToolQueryPublishPriceV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param classify 广告类别 (required)
     * @param proType 产品类型 (required)
     * @param adForm 投放产品 (required)
     * @param appOrigin 投放位置（媒体端） (required)
     * @param pricingType 计费类型 (required)
     * @param gdSendType 优化目标 (required)
     * @param policyNo 政策编号 (required)
     * @param deliveryInfo 投放日期信息 (required)
     * @param intentionNo 招商订单编号 (optional)
     * @param audienceInfo 定向 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30BrandToolQueryPublishPriceGetAsync(Long advertiserId, BrandToolQueryPublishPriceV30Classify classify, BrandToolQueryPublishPriceV30ProType proType, BrandToolQueryPublishPriceV30AdForm adForm, BrandToolQueryPublishPriceV30AppOrigin appOrigin, BrandToolQueryPublishPriceV30PricingType pricingType, BrandToolQueryPublishPriceV30GdSendType gdSendType, String policyNo, BrandToolQueryPublishPriceV30DeliveryInfo deliveryInfo, String intentionNo, BrandToolQueryPublishPriceV30AudienceInfo audienceInfo, final ApiCallback<BrandToolQueryPublishPriceV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30BrandToolQueryPublishPriceGetValidateBeforeCall(advertiserId, classify, proType, adForm, appOrigin, pricingType, gdSendType, policyNo, deliveryInfo, intentionNo, audienceInfo, _callback);
        Type localVarReturnType = new TypeToken<BrandToolQueryPublishPriceV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
