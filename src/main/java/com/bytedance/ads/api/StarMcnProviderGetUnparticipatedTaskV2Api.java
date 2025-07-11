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



import com.bytedance.ads.model.StarMcnProviderGetUnparticipatedTaskV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarMcnProviderGetUnparticipatedTaskV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarMcnProviderGetUnparticipatedTaskV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarMcnProviderGetUnparticipatedTaskV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarMcnProviderGetUnparticipatedTaskGet
     * @param starId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param payType  (optional)
     * @param minCreateTimeStamp 最小创建时间 (optional)
     * @param maxCreateTimeStamp 最大创建时间 (optional)
     * @param firstClassCategory  (optional)
     * @param secondClassCategory  (optional)
     * @param productCategory  (optional)
     * @param appId 小程序id (optional)
     * @param appName 小程序名称 (optional)
     * @param demandId  (optional)
     * @param gameType  (optional)
     * @param componentType  (optional)
     * @param searchTags  (optional)
     * @param firstCategoryId  (optional)
     * @param secondCategoryId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarMcnProviderGetUnparticipatedTaskGetCall(Long starId, Integer page, Integer pageSize, Long payType, Long minCreateTimeStamp, Long maxCreateTimeStamp, Integer firstClassCategory, Integer secondClassCategory, Integer productCategory, String appId, String appName, Long demandId, Long gameType, Long componentType, List<Long> searchTags, Long firstCategoryId, Long secondCategoryId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/mcn/provider_get_unparticipated_task/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (payType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pay_type", payType));
        }

        if (minCreateTimeStamp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("min_create_time_stamp", minCreateTimeStamp));
        }

        if (maxCreateTimeStamp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max_create_time_stamp", maxCreateTimeStamp));
        }

        if (firstClassCategory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_class_category", firstClassCategory));
        }

        if (secondClassCategory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("second_class_category", secondClassCategory));
        }

        if (productCategory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("product_category", productCategory));
        }

        if (appId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_id", appId));
        }

        if (appName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_name", appName));
        }

        if (demandId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("demand_id", demandId));
        }

        if (gameType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("game_type", gameType));
        }

        if (componentType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("component_type", componentType));
        }

        if (searchTags != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "search_tags", searchTags));
        }

        if (firstCategoryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_category_id", firstCategoryId));
        }

        if (secondCategoryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("second_category_id", secondCategoryId));
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
    private okhttp3.Call openApi2StarMcnProviderGetUnparticipatedTaskGetValidateBeforeCall(Long starId, Integer page, Integer pageSize, Long payType, Long minCreateTimeStamp, Long maxCreateTimeStamp, Integer firstClassCategory, Integer secondClassCategory, Integer productCategory, String appId, String appName, Long demandId, Long gameType, Long componentType, List<Long> searchTags, Long firstCategoryId, Long secondCategoryId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarMcnProviderGetUnparticipatedTaskGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApi2StarMcnProviderGetUnparticipatedTaskGet(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling openApi2StarMcnProviderGetUnparticipatedTaskGet(Async)");
        }

        return openApi2StarMcnProviderGetUnparticipatedTaskGetCall(starId, page, pageSize, payType, minCreateTimeStamp, maxCreateTimeStamp, firstClassCategory, secondClassCategory, productCategory, appId, appName, demandId, gameType, componentType, searchTags, firstCategoryId, secondCategoryId, _callback);

    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param payType  (optional)
     * @param minCreateTimeStamp 最小创建时间 (optional)
     * @param maxCreateTimeStamp 最大创建时间 (optional)
     * @param firstClassCategory  (optional)
     * @param secondClassCategory  (optional)
     * @param productCategory  (optional)
     * @param appId 小程序id (optional)
     * @param appName 小程序名称 (optional)
     * @param demandId  (optional)
     * @param gameType  (optional)
     * @param componentType  (optional)
     * @param searchTags  (optional)
     * @param firstCategoryId  (optional)
     * @param secondCategoryId  (optional)
     * @return StarMcnProviderGetUnparticipatedTaskV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarMcnProviderGetUnparticipatedTaskV2Response openApi2StarMcnProviderGetUnparticipatedTaskGet(Long starId, Integer page, Integer pageSize, Long payType, Long minCreateTimeStamp, Long maxCreateTimeStamp, Integer firstClassCategory, Integer secondClassCategory, Integer productCategory, String appId, String appName, Long demandId, Long gameType, Long componentType, List<Long> searchTags, Long firstCategoryId, Long secondCategoryId) throws ApiException {
        ApiResponse<StarMcnProviderGetUnparticipatedTaskV2Response> localVarResp = openApi2StarMcnProviderGetUnparticipatedTaskGetWithHttpInfo(starId, page, pageSize, payType, minCreateTimeStamp, maxCreateTimeStamp, firstClassCategory, secondClassCategory, productCategory, appId, appName, demandId, gameType, componentType, searchTags, firstCategoryId, secondCategoryId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param payType  (optional)
     * @param minCreateTimeStamp 最小创建时间 (optional)
     * @param maxCreateTimeStamp 最大创建时间 (optional)
     * @param firstClassCategory  (optional)
     * @param secondClassCategory  (optional)
     * @param productCategory  (optional)
     * @param appId 小程序id (optional)
     * @param appName 小程序名称 (optional)
     * @param demandId  (optional)
     * @param gameType  (optional)
     * @param componentType  (optional)
     * @param searchTags  (optional)
     * @param firstCategoryId  (optional)
     * @param secondCategoryId  (optional)
     * @return ApiResponse&lt;StarMcnProviderGetUnparticipatedTaskV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarMcnProviderGetUnparticipatedTaskV2Response> openApi2StarMcnProviderGetUnparticipatedTaskGetWithHttpInfo(Long starId, Integer page, Integer pageSize, Long payType, Long minCreateTimeStamp, Long maxCreateTimeStamp, Integer firstClassCategory, Integer secondClassCategory, Integer productCategory, String appId, String appName, Long demandId, Long gameType, Long componentType, List<Long> searchTags, Long firstCategoryId, Long secondCategoryId) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarMcnProviderGetUnparticipatedTaskGetValidateBeforeCall(starId, page, pageSize, payType, minCreateTimeStamp, maxCreateTimeStamp, firstClassCategory, secondClassCategory, productCategory, appId, appName, demandId, gameType, componentType, searchTags, firstCategoryId, secondCategoryId, null);
        Type localVarReturnType = new TypeToken<StarMcnProviderGetUnparticipatedTaskV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param payType  (optional)
     * @param minCreateTimeStamp 最小创建时间 (optional)
     * @param maxCreateTimeStamp 最大创建时间 (optional)
     * @param firstClassCategory  (optional)
     * @param secondClassCategory  (optional)
     * @param productCategory  (optional)
     * @param appId 小程序id (optional)
     * @param appName 小程序名称 (optional)
     * @param demandId  (optional)
     * @param gameType  (optional)
     * @param componentType  (optional)
     * @param searchTags  (optional)
     * @param firstCategoryId  (optional)
     * @param secondCategoryId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarMcnProviderGetUnparticipatedTaskGetAsync(Long starId, Integer page, Integer pageSize, Long payType, Long minCreateTimeStamp, Long maxCreateTimeStamp, Integer firstClassCategory, Integer secondClassCategory, Integer productCategory, String appId, String appName, Long demandId, Long gameType, Long componentType, List<Long> searchTags, Long firstCategoryId, Long secondCategoryId, final ApiCallback<StarMcnProviderGetUnparticipatedTaskV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarMcnProviderGetUnparticipatedTaskGetValidateBeforeCall(starId, page, pageSize, payType, minCreateTimeStamp, maxCreateTimeStamp, firstClassCategory, secondClassCategory, productCategory, appId, appName, demandId, gameType, componentType, searchTags, firstCategoryId, secondCategoryId, _callback);
        Type localVarReturnType = new TypeToken<StarMcnProviderGetUnparticipatedTaskV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
