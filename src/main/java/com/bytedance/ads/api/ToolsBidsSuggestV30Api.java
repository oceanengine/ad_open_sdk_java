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



import com.bytedance.ads.model.ToolsBidsSuggestV30CampaignType;
import com.bytedance.ads.model.ToolsBidsSuggestV30DeepBidType;
import com.bytedance.ads.model.ToolsBidsSuggestV30DeepExternalAction;
import com.bytedance.ads.model.ToolsBidsSuggestV30ExternalAction;
import com.bytedance.ads.model.ToolsBidsSuggestV30MarketingGoal;
import com.bytedance.ads.model.ToolsBidsSuggestV30Platform;
import com.bytedance.ads.model.ToolsBidsSuggestV30Pricing;
import com.bytedance.ads.model.ToolsBidsSuggestV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsBidsSuggestV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsBidsSuggestV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsBidsSuggestV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ToolsBidsSuggestGet
     * @param advertiserId  (required)
     * @param pricing  (required)
     * @param externalAction  (required)
     * @param projectId  (optional)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param platform 定向目标平台 (optional)
     * @param marketingGoal 营销目标 (optional)
     * @param campaignType 项目类型 (optional)
     * @param packageName 应用包名 (optional)
     * @param userName 微信小程序/小游戏原始ID (optional)
     * @param appId 字节小程序/小游戏的app id (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsBidsSuggestGetCall(Long advertiserId, ToolsBidsSuggestV30Pricing pricing, ToolsBidsSuggestV30ExternalAction externalAction, Long projectId, ToolsBidsSuggestV30DeepExternalAction deepExternalAction, ToolsBidsSuggestV30DeepBidType deepBidType, List<ToolsBidsSuggestV30Platform> platform, ToolsBidsSuggestV30MarketingGoal marketingGoal, ToolsBidsSuggestV30CampaignType campaignType, String packageName, String userName, String appId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/tools/bids/suggest/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (projectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("project_id", projectId));
        }

        if (pricing != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pricing", pricing));
        }

        if (externalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_action", externalAction));
        }

        if (deepExternalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deep_external_action", deepExternalAction));
        }

        if (deepBidType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deep_bid_type", deepBidType));
        }

        if (platform != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "platform", platform));
        }

        if (marketingGoal != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_goal", marketingGoal));
        }

        if (campaignType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("campaign_type", campaignType));
        }

        if (packageName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("package_name", packageName));
        }

        if (userName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_name", userName));
        }

        if (appId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_id", appId));
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
    private okhttp3.Call openApiV30ToolsBidsSuggestGetValidateBeforeCall(Long advertiserId, ToolsBidsSuggestV30Pricing pricing, ToolsBidsSuggestV30ExternalAction externalAction, Long projectId, ToolsBidsSuggestV30DeepExternalAction deepExternalAction, ToolsBidsSuggestV30DeepBidType deepBidType, List<ToolsBidsSuggestV30Platform> platform, ToolsBidsSuggestV30MarketingGoal marketingGoal, ToolsBidsSuggestV30CampaignType campaignType, String packageName, String userName, String appId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ToolsBidsSuggestGet(Async)");
        }

        // verify the required parameter 'pricing' is set
        if (pricing == null) {
            throw new ApiException("Missing the required parameter 'pricing' when calling openApiV30ToolsBidsSuggestGet(Async)");
        }

        // verify the required parameter 'externalAction' is set
        if (externalAction == null) {
            throw new ApiException("Missing the required parameter 'externalAction' when calling openApiV30ToolsBidsSuggestGet(Async)");
        }

        return openApiV30ToolsBidsSuggestGetCall(advertiserId, pricing, externalAction, projectId, deepExternalAction, deepBidType, platform, marketingGoal, campaignType, packageName, userName, appId, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param pricing  (required)
     * @param externalAction  (required)
     * @param projectId  (optional)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param platform 定向目标平台 (optional)
     * @param marketingGoal 营销目标 (optional)
     * @param campaignType 项目类型 (optional)
     * @param packageName 应用包名 (optional)
     * @param userName 微信小程序/小游戏原始ID (optional)
     * @param appId 字节小程序/小游戏的app id (optional)
     * @return ToolsBidsSuggestV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsBidsSuggestV30Response openApiV30ToolsBidsSuggestGet(Long advertiserId, ToolsBidsSuggestV30Pricing pricing, ToolsBidsSuggestV30ExternalAction externalAction, Long projectId, ToolsBidsSuggestV30DeepExternalAction deepExternalAction, ToolsBidsSuggestV30DeepBidType deepBidType, List<ToolsBidsSuggestV30Platform> platform, ToolsBidsSuggestV30MarketingGoal marketingGoal, ToolsBidsSuggestV30CampaignType campaignType, String packageName, String userName, String appId) throws ApiException {
        ApiResponse<ToolsBidsSuggestV30Response> localVarResp = openApiV30ToolsBidsSuggestGetWithHttpInfo(advertiserId, pricing, externalAction, projectId, deepExternalAction, deepBidType, platform, marketingGoal, campaignType, packageName, userName, appId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param pricing  (required)
     * @param externalAction  (required)
     * @param projectId  (optional)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param platform 定向目标平台 (optional)
     * @param marketingGoal 营销目标 (optional)
     * @param campaignType 项目类型 (optional)
     * @param packageName 应用包名 (optional)
     * @param userName 微信小程序/小游戏原始ID (optional)
     * @param appId 字节小程序/小游戏的app id (optional)
     * @return ApiResponse&lt;ToolsBidsSuggestV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsBidsSuggestV30Response> openApiV30ToolsBidsSuggestGetWithHttpInfo(Long advertiserId, ToolsBidsSuggestV30Pricing pricing, ToolsBidsSuggestV30ExternalAction externalAction, Long projectId, ToolsBidsSuggestV30DeepExternalAction deepExternalAction, ToolsBidsSuggestV30DeepBidType deepBidType, List<ToolsBidsSuggestV30Platform> platform, ToolsBidsSuggestV30MarketingGoal marketingGoal, ToolsBidsSuggestV30CampaignType campaignType, String packageName, String userName, String appId) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ToolsBidsSuggestGetValidateBeforeCall(advertiserId, pricing, externalAction, projectId, deepExternalAction, deepBidType, platform, marketingGoal, campaignType, packageName, userName, appId, null);
        Type localVarReturnType = new TypeToken<ToolsBidsSuggestV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param pricing  (required)
     * @param externalAction  (required)
     * @param projectId  (optional)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param platform 定向目标平台 (optional)
     * @param marketingGoal 营销目标 (optional)
     * @param campaignType 项目类型 (optional)
     * @param packageName 应用包名 (optional)
     * @param userName 微信小程序/小游戏原始ID (optional)
     * @param appId 字节小程序/小游戏的app id (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsBidsSuggestGetAsync(Long advertiserId, ToolsBidsSuggestV30Pricing pricing, ToolsBidsSuggestV30ExternalAction externalAction, Long projectId, ToolsBidsSuggestV30DeepExternalAction deepExternalAction, ToolsBidsSuggestV30DeepBidType deepBidType, List<ToolsBidsSuggestV30Platform> platform, ToolsBidsSuggestV30MarketingGoal marketingGoal, ToolsBidsSuggestV30CampaignType campaignType, String packageName, String userName, String appId, final ApiCallback<ToolsBidsSuggestV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ToolsBidsSuggestGetValidateBeforeCall(advertiserId, pricing, externalAction, projectId, deepExternalAction, deepBidType, platform, marketingGoal, campaignType, packageName, userName, appId, _callback);
        Type localVarReturnType = new TypeToken<ToolsBidsSuggestV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
