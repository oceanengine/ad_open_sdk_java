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


package com.bytedance.ads.api;

import com.bytedance.ads.ApiCallback;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.ApiResponse;
import com.bytedance.ads.Configuration;
import com.bytedance.ads.Pair;

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.ToolsQuotaGetV2CampaignType;
import com.bytedance.ads.model.ToolsQuotaGetV2DeliveryRange;
import com.bytedance.ads.model.ToolsQuotaGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsQuotaGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsQuotaGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsQuotaGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsQuotaGetGet
     * @param advertiserId 广告账户id (required)
     * @param campaignType 广告组类型，&#x60;FEED&#x60;：信息流  &#x60;SEARCH&#x60;:搜索广告 (required)
     * @param deliveryRange  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsQuotaGetGetCall(Long advertiserId, ToolsQuotaGetV2CampaignType campaignType, ToolsQuotaGetV2DeliveryRange deliveryRange, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/quota/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (campaignType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("campaign_type", campaignType));
        }

        if (deliveryRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("delivery_range", deliveryRange));
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
    private okhttp3.Call openApi2ToolsQuotaGetGetValidateBeforeCall(Long advertiserId, ToolsQuotaGetV2CampaignType campaignType, ToolsQuotaGetV2DeliveryRange deliveryRange, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsQuotaGetGet(Async)");
        }

        // verify the required parameter 'campaignType' is set
        if (campaignType == null) {
            throw new ApiException("Missing the required parameter 'campaignType' when calling openApi2ToolsQuotaGetGet(Async)");
        }

        return openApi2ToolsQuotaGetGetCall(advertiserId, campaignType, deliveryRange, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告账户id (required)
     * @param campaignType 广告组类型，&#x60;FEED&#x60;：信息流  &#x60;SEARCH&#x60;:搜索广告 (required)
     * @param deliveryRange  (optional)
     * @return ToolsQuotaGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsQuotaGetV2Response openApi2ToolsQuotaGetGet(Long advertiserId, ToolsQuotaGetV2CampaignType campaignType, ToolsQuotaGetV2DeliveryRange deliveryRange) throws ApiException {
        ApiResponse<ToolsQuotaGetV2Response> localVarResp = openApi2ToolsQuotaGetGetWithHttpInfo(advertiserId, campaignType, deliveryRange);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告账户id (required)
     * @param campaignType 广告组类型，&#x60;FEED&#x60;：信息流  &#x60;SEARCH&#x60;:搜索广告 (required)
     * @param deliveryRange  (optional)
     * @return ApiResponse&lt;ToolsQuotaGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsQuotaGetV2Response> openApi2ToolsQuotaGetGetWithHttpInfo(Long advertiserId, ToolsQuotaGetV2CampaignType campaignType, ToolsQuotaGetV2DeliveryRange deliveryRange) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsQuotaGetGetValidateBeforeCall(advertiserId, campaignType, deliveryRange, null);
        Type localVarReturnType = new TypeToken<ToolsQuotaGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告账户id (required)
     * @param campaignType 广告组类型，&#x60;FEED&#x60;：信息流  &#x60;SEARCH&#x60;:搜索广告 (required)
     * @param deliveryRange  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsQuotaGetGetAsync(Long advertiserId, ToolsQuotaGetV2CampaignType campaignType, ToolsQuotaGetV2DeliveryRange deliveryRange, final ApiCallback<ToolsQuotaGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsQuotaGetGetValidateBeforeCall(advertiserId, campaignType, deliveryRange, _callback);
        Type localVarReturnType = new TypeToken<ToolsQuotaGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
