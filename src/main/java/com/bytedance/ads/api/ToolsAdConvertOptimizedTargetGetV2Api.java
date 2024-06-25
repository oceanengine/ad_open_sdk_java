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



import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2AppType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2CampaignType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2ConvertType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2DedicateType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2DeepExternalAction;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2ExternalAction;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2LandingType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2LaunchTargetType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2MarketingPurpose;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2PromotionContent;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsAdConvertOptimizedTargetGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsAdConvertOptimizedTargetGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsAdConvertOptimizedTargetGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsAdConvertOptimizedTargetGetGet
     * @param advertiserId  (optional)
     * @param appSchema  (optional)
     * @param appType  (optional)
     * @param campaignType  (optional)
     * @param convertId  (optional)
     * @param convertName  (optional)
     * @param convertType  (optional)
     * @param dedicateType  (optional)
     * @param deepExternalAction  (optional)
     * @param externalAction  (optional)
     * @param externalUrl  (optional)
     * @param itunesUrl  (optional)
     * @param landingType  (optional)
     * @param launchTargetType  (optional)
     * @param marketingPurpose  (optional)
     * @param packageName  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param promotionContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAdConvertOptimizedTargetGetGetCall(Long advertiserId, String appSchema, ToolsAdConvertOptimizedTargetGetV2AppType appType, ToolsAdConvertOptimizedTargetGetV2CampaignType campaignType, Long convertId, String convertName, ToolsAdConvertOptimizedTargetGetV2ConvertType convertType, ToolsAdConvertOptimizedTargetGetV2DedicateType dedicateType, ToolsAdConvertOptimizedTargetGetV2DeepExternalAction deepExternalAction, ToolsAdConvertOptimizedTargetGetV2ExternalAction externalAction, String externalUrl, String itunesUrl, ToolsAdConvertOptimizedTargetGetV2LandingType landingType, ToolsAdConvertOptimizedTargetGetV2LaunchTargetType launchTargetType, ToolsAdConvertOptimizedTargetGetV2MarketingPurpose marketingPurpose, String packageName, Long page, Long pageSize, ToolsAdConvertOptimizedTargetGetV2PromotionContent promotionContent, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/ad_convert/optimized_target/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (appSchema != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_schema", appSchema));
        }

        if (appType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_type", appType));
        }

        if (campaignType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("campaign_type", campaignType));
        }

        if (convertId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("convert_id", convertId));
        }

        if (convertName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("convert_name", convertName));
        }

        if (convertType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("convert_type", convertType));
        }

        if (dedicateType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dedicate_type", dedicateType));
        }

        if (deepExternalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deep_external_action", deepExternalAction));
        }

        if (externalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_action", externalAction));
        }

        if (externalUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_url", externalUrl));
        }

        if (itunesUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("itunes_url", itunesUrl));
        }

        if (landingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("landing_type", landingType));
        }

        if (launchTargetType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("launch_target_type", launchTargetType));
        }

        if (marketingPurpose != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_purpose", marketingPurpose));
        }

        if (packageName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("package_name", packageName));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (promotionContent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("promotion_content", promotionContent));
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
    private okhttp3.Call openApi2ToolsAdConvertOptimizedTargetGetGetValidateBeforeCall(Long advertiserId, String appSchema, ToolsAdConvertOptimizedTargetGetV2AppType appType, ToolsAdConvertOptimizedTargetGetV2CampaignType campaignType, Long convertId, String convertName, ToolsAdConvertOptimizedTargetGetV2ConvertType convertType, ToolsAdConvertOptimizedTargetGetV2DedicateType dedicateType, ToolsAdConvertOptimizedTargetGetV2DeepExternalAction deepExternalAction, ToolsAdConvertOptimizedTargetGetV2ExternalAction externalAction, String externalUrl, String itunesUrl, ToolsAdConvertOptimizedTargetGetV2LandingType landingType, ToolsAdConvertOptimizedTargetGetV2LaunchTargetType launchTargetType, ToolsAdConvertOptimizedTargetGetV2MarketingPurpose marketingPurpose, String packageName, Long page, Long pageSize, ToolsAdConvertOptimizedTargetGetV2PromotionContent promotionContent, final ApiCallback _callback) throws ApiException {
        return openApi2ToolsAdConvertOptimizedTargetGetGetCall(advertiserId, appSchema, appType, campaignType, convertId, convertName, convertType, dedicateType, deepExternalAction, externalAction, externalUrl, itunesUrl, landingType, launchTargetType, marketingPurpose, packageName, page, pageSize, promotionContent, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param appSchema  (optional)
     * @param appType  (optional)
     * @param campaignType  (optional)
     * @param convertId  (optional)
     * @param convertName  (optional)
     * @param convertType  (optional)
     * @param dedicateType  (optional)
     * @param deepExternalAction  (optional)
     * @param externalAction  (optional)
     * @param externalUrl  (optional)
     * @param itunesUrl  (optional)
     * @param landingType  (optional)
     * @param launchTargetType  (optional)
     * @param marketingPurpose  (optional)
     * @param packageName  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param promotionContent  (optional)
     * @return ToolsAdConvertOptimizedTargetGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsAdConvertOptimizedTargetGetV2Response openApi2ToolsAdConvertOptimizedTargetGetGet(Long advertiserId, String appSchema, ToolsAdConvertOptimizedTargetGetV2AppType appType, ToolsAdConvertOptimizedTargetGetV2CampaignType campaignType, Long convertId, String convertName, ToolsAdConvertOptimizedTargetGetV2ConvertType convertType, ToolsAdConvertOptimizedTargetGetV2DedicateType dedicateType, ToolsAdConvertOptimizedTargetGetV2DeepExternalAction deepExternalAction, ToolsAdConvertOptimizedTargetGetV2ExternalAction externalAction, String externalUrl, String itunesUrl, ToolsAdConvertOptimizedTargetGetV2LandingType landingType, ToolsAdConvertOptimizedTargetGetV2LaunchTargetType launchTargetType, ToolsAdConvertOptimizedTargetGetV2MarketingPurpose marketingPurpose, String packageName, Long page, Long pageSize, ToolsAdConvertOptimizedTargetGetV2PromotionContent promotionContent) throws ApiException {
        ApiResponse<ToolsAdConvertOptimizedTargetGetV2Response> localVarResp = openApi2ToolsAdConvertOptimizedTargetGetGetWithHttpInfo(advertiserId, appSchema, appType, campaignType, convertId, convertName, convertType, dedicateType, deepExternalAction, externalAction, externalUrl, itunesUrl, landingType, launchTargetType, marketingPurpose, packageName, page, pageSize, promotionContent);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param appSchema  (optional)
     * @param appType  (optional)
     * @param campaignType  (optional)
     * @param convertId  (optional)
     * @param convertName  (optional)
     * @param convertType  (optional)
     * @param dedicateType  (optional)
     * @param deepExternalAction  (optional)
     * @param externalAction  (optional)
     * @param externalUrl  (optional)
     * @param itunesUrl  (optional)
     * @param landingType  (optional)
     * @param launchTargetType  (optional)
     * @param marketingPurpose  (optional)
     * @param packageName  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param promotionContent  (optional)
     * @return ApiResponse&lt;ToolsAdConvertOptimizedTargetGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsAdConvertOptimizedTargetGetV2Response> openApi2ToolsAdConvertOptimizedTargetGetGetWithHttpInfo(Long advertiserId, String appSchema, ToolsAdConvertOptimizedTargetGetV2AppType appType, ToolsAdConvertOptimizedTargetGetV2CampaignType campaignType, Long convertId, String convertName, ToolsAdConvertOptimizedTargetGetV2ConvertType convertType, ToolsAdConvertOptimizedTargetGetV2DedicateType dedicateType, ToolsAdConvertOptimizedTargetGetV2DeepExternalAction deepExternalAction, ToolsAdConvertOptimizedTargetGetV2ExternalAction externalAction, String externalUrl, String itunesUrl, ToolsAdConvertOptimizedTargetGetV2LandingType landingType, ToolsAdConvertOptimizedTargetGetV2LaunchTargetType launchTargetType, ToolsAdConvertOptimizedTargetGetV2MarketingPurpose marketingPurpose, String packageName, Long page, Long pageSize, ToolsAdConvertOptimizedTargetGetV2PromotionContent promotionContent) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsAdConvertOptimizedTargetGetGetValidateBeforeCall(advertiserId, appSchema, appType, campaignType, convertId, convertName, convertType, dedicateType, deepExternalAction, externalAction, externalUrl, itunesUrl, landingType, launchTargetType, marketingPurpose, packageName, page, pageSize, promotionContent, null);
        Type localVarReturnType = new TypeToken<ToolsAdConvertOptimizedTargetGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (optional)
     * @param appSchema  (optional)
     * @param appType  (optional)
     * @param campaignType  (optional)
     * @param convertId  (optional)
     * @param convertName  (optional)
     * @param convertType  (optional)
     * @param dedicateType  (optional)
     * @param deepExternalAction  (optional)
     * @param externalAction  (optional)
     * @param externalUrl  (optional)
     * @param itunesUrl  (optional)
     * @param landingType  (optional)
     * @param launchTargetType  (optional)
     * @param marketingPurpose  (optional)
     * @param packageName  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param promotionContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAdConvertOptimizedTargetGetGetAsync(Long advertiserId, String appSchema, ToolsAdConvertOptimizedTargetGetV2AppType appType, ToolsAdConvertOptimizedTargetGetV2CampaignType campaignType, Long convertId, String convertName, ToolsAdConvertOptimizedTargetGetV2ConvertType convertType, ToolsAdConvertOptimizedTargetGetV2DedicateType dedicateType, ToolsAdConvertOptimizedTargetGetV2DeepExternalAction deepExternalAction, ToolsAdConvertOptimizedTargetGetV2ExternalAction externalAction, String externalUrl, String itunesUrl, ToolsAdConvertOptimizedTargetGetV2LandingType landingType, ToolsAdConvertOptimizedTargetGetV2LaunchTargetType launchTargetType, ToolsAdConvertOptimizedTargetGetV2MarketingPurpose marketingPurpose, String packageName, Long page, Long pageSize, ToolsAdConvertOptimizedTargetGetV2PromotionContent promotionContent, final ApiCallback<ToolsAdConvertOptimizedTargetGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsAdConvertOptimizedTargetGetGetValidateBeforeCall(advertiserId, appSchema, appType, campaignType, convertId, convertName, convertType, dedicateType, deepExternalAction, externalAction, externalUrl, itunesUrl, landingType, launchTargetType, marketingPurpose, packageName, page, pageSize, promotionContent, _callback);
        Type localVarReturnType = new TypeToken<ToolsAdConvertOptimizedTargetGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
