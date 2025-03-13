/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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



import com.bytedance.ads.model.ToolsStarTaskSettlementConfigV2Response;
import com.bytedance.ads.model.ToolsStarTaskSettlementConfigV2StarTaskExternalAction;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsStarTaskSettlementConfigV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsStarTaskSettlementConfigV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsStarTaskSettlementConfigV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsStarTaskSettlementConfigGet
     * @param advertiserId 广告账户id (required)
     * @param firstIndustryId 一级行业id (required)
     * @param secondIndustryId 二级行业id (required)
     * @param starMaterialFirstType 素材一级类目id (required)
     * @param starMaterialSecondType 素材二级类目id (required)
     * @param starTaskExternalAction 优化目标，仅对达人流量生效。支持3种可选值） (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsStarTaskSettlementConfigGetCall(Long advertiserId, Long firstIndustryId, Long secondIndustryId, Long starMaterialFirstType, Long starMaterialSecondType, ToolsStarTaskSettlementConfigV2StarTaskExternalAction starTaskExternalAction, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/star_task/settlement_config/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (firstIndustryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_industry_id", firstIndustryId));
        }

        if (secondIndustryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("second_industry_id", secondIndustryId));
        }

        if (starMaterialFirstType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_material_first_type", starMaterialFirstType));
        }

        if (starMaterialSecondType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_material_second_type", starMaterialSecondType));
        }

        if (starTaskExternalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_task_external_action", starTaskExternalAction));
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
    private okhttp3.Call openApi2ToolsStarTaskSettlementConfigGetValidateBeforeCall(Long advertiserId, Long firstIndustryId, Long secondIndustryId, Long starMaterialFirstType, Long starMaterialSecondType, ToolsStarTaskSettlementConfigV2StarTaskExternalAction starTaskExternalAction, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsStarTaskSettlementConfigGet(Async)");
        }

        // verify the required parameter 'firstIndustryId' is set
        if (firstIndustryId == null) {
            throw new ApiException("Missing the required parameter 'firstIndustryId' when calling openApi2ToolsStarTaskSettlementConfigGet(Async)");
        }

        // verify the required parameter 'secondIndustryId' is set
        if (secondIndustryId == null) {
            throw new ApiException("Missing the required parameter 'secondIndustryId' when calling openApi2ToolsStarTaskSettlementConfigGet(Async)");
        }

        // verify the required parameter 'starMaterialFirstType' is set
        if (starMaterialFirstType == null) {
            throw new ApiException("Missing the required parameter 'starMaterialFirstType' when calling openApi2ToolsStarTaskSettlementConfigGet(Async)");
        }

        // verify the required parameter 'starMaterialSecondType' is set
        if (starMaterialSecondType == null) {
            throw new ApiException("Missing the required parameter 'starMaterialSecondType' when calling openApi2ToolsStarTaskSettlementConfigGet(Async)");
        }

        // verify the required parameter 'starTaskExternalAction' is set
        if (starTaskExternalAction == null) {
            throw new ApiException("Missing the required parameter 'starTaskExternalAction' when calling openApi2ToolsStarTaskSettlementConfigGet(Async)");
        }

        return openApi2ToolsStarTaskSettlementConfigGetCall(advertiserId, firstIndustryId, secondIndustryId, starMaterialFirstType, starMaterialSecondType, starTaskExternalAction, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告账户id (required)
     * @param firstIndustryId 一级行业id (required)
     * @param secondIndustryId 二级行业id (required)
     * @param starMaterialFirstType 素材一级类目id (required)
     * @param starMaterialSecondType 素材二级类目id (required)
     * @param starTaskExternalAction 优化目标，仅对达人流量生效。支持3种可选值） (required)
     * @return ToolsStarTaskSettlementConfigV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsStarTaskSettlementConfigV2Response openApi2ToolsStarTaskSettlementConfigGet(Long advertiserId, Long firstIndustryId, Long secondIndustryId, Long starMaterialFirstType, Long starMaterialSecondType, ToolsStarTaskSettlementConfigV2StarTaskExternalAction starTaskExternalAction) throws ApiException {
        ApiResponse<ToolsStarTaskSettlementConfigV2Response> localVarResp = openApi2ToolsStarTaskSettlementConfigGetWithHttpInfo(advertiserId, firstIndustryId, secondIndustryId, starMaterialFirstType, starMaterialSecondType, starTaskExternalAction);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告账户id (required)
     * @param firstIndustryId 一级行业id (required)
     * @param secondIndustryId 二级行业id (required)
     * @param starMaterialFirstType 素材一级类目id (required)
     * @param starMaterialSecondType 素材二级类目id (required)
     * @param starTaskExternalAction 优化目标，仅对达人流量生效。支持3种可选值） (required)
     * @return ApiResponse&lt;ToolsStarTaskSettlementConfigV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsStarTaskSettlementConfigV2Response> openApi2ToolsStarTaskSettlementConfigGetWithHttpInfo(Long advertiserId, Long firstIndustryId, Long secondIndustryId, Long starMaterialFirstType, Long starMaterialSecondType, ToolsStarTaskSettlementConfigV2StarTaskExternalAction starTaskExternalAction) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsStarTaskSettlementConfigGetValidateBeforeCall(advertiserId, firstIndustryId, secondIndustryId, starMaterialFirstType, starMaterialSecondType, starTaskExternalAction, null);
        Type localVarReturnType = new TypeToken<ToolsStarTaskSettlementConfigV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告账户id (required)
     * @param firstIndustryId 一级行业id (required)
     * @param secondIndustryId 二级行业id (required)
     * @param starMaterialFirstType 素材一级类目id (required)
     * @param starMaterialSecondType 素材二级类目id (required)
     * @param starTaskExternalAction 优化目标，仅对达人流量生效。支持3种可选值） (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsStarTaskSettlementConfigGetAsync(Long advertiserId, Long firstIndustryId, Long secondIndustryId, Long starMaterialFirstType, Long starMaterialSecondType, ToolsStarTaskSettlementConfigV2StarTaskExternalAction starTaskExternalAction, final ApiCallback<ToolsStarTaskSettlementConfigV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsStarTaskSettlementConfigGetValidateBeforeCall(advertiserId, firstIndustryId, secondIndustryId, starMaterialFirstType, starMaterialSecondType, starTaskExternalAction, _callback);
        Type localVarReturnType = new TypeToken<ToolsStarTaskSettlementConfigV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
