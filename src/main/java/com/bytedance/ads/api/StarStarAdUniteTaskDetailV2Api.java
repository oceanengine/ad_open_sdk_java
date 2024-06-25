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



import com.bytedance.ads.model.StarStarAdUniteTaskDetailV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarStarAdUniteTaskDetailV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarStarAdUniteTaskDetailV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarStarAdUniteTaskDetailV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarStarAdUniteTaskDetailGet
     * @param starId 客户的星图id (required)
     * @param demandId 任务id (required)
     * @param statStartDate 查询起始时间，格式：yyyy-mm-dd ，只和安卓/iOS消耗、转化数、深度转化数相关 (required)
     * @param statEndDate 查询截止时间，格式：yyyy-mm-dd ，只和安卓/iOS消耗、转化数、深度转化数相关 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarStarAdUniteTaskDetailGetCall(Long starId, Long demandId, String statStartDate, String statEndDate, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/star_ad_unite_task/detail/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (demandId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("demand_id", demandId));
        }

        if (statStartDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("stat_start_date", statStartDate));
        }

        if (statEndDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("stat_end_date", statEndDate));
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
    private okhttp3.Call openApi2StarStarAdUniteTaskDetailGetValidateBeforeCall(Long starId, Long demandId, String statStartDate, String statEndDate, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarStarAdUniteTaskDetailGet(Async)");
        }

        // verify the required parameter 'demandId' is set
        if (demandId == null) {
            throw new ApiException("Missing the required parameter 'demandId' when calling openApi2StarStarAdUniteTaskDetailGet(Async)");
        }

        // verify the required parameter 'statStartDate' is set
        if (statStartDate == null) {
            throw new ApiException("Missing the required parameter 'statStartDate' when calling openApi2StarStarAdUniteTaskDetailGet(Async)");
        }

        // verify the required parameter 'statEndDate' is set
        if (statEndDate == null) {
            throw new ApiException("Missing the required parameter 'statEndDate' when calling openApi2StarStarAdUniteTaskDetailGet(Async)");
        }

        return openApi2StarStarAdUniteTaskDetailGetCall(starId, demandId, statStartDate, statEndDate, _callback);

    }

    /**
     * 
     * 
     * @param starId 客户的星图id (required)
     * @param demandId 任务id (required)
     * @param statStartDate 查询起始时间，格式：yyyy-mm-dd ，只和安卓/iOS消耗、转化数、深度转化数相关 (required)
     * @param statEndDate 查询截止时间，格式：yyyy-mm-dd ，只和安卓/iOS消耗、转化数、深度转化数相关 (required)
     * @return StarStarAdUniteTaskDetailV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarStarAdUniteTaskDetailV2Response openApi2StarStarAdUniteTaskDetailGet(Long starId, Long demandId, String statStartDate, String statEndDate) throws ApiException {
        ApiResponse<StarStarAdUniteTaskDetailV2Response> localVarResp = openApi2StarStarAdUniteTaskDetailGetWithHttpInfo(starId, demandId, statStartDate, statEndDate);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId 客户的星图id (required)
     * @param demandId 任务id (required)
     * @param statStartDate 查询起始时间，格式：yyyy-mm-dd ，只和安卓/iOS消耗、转化数、深度转化数相关 (required)
     * @param statEndDate 查询截止时间，格式：yyyy-mm-dd ，只和安卓/iOS消耗、转化数、深度转化数相关 (required)
     * @return ApiResponse&lt;StarStarAdUniteTaskDetailV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarStarAdUniteTaskDetailV2Response> openApi2StarStarAdUniteTaskDetailGetWithHttpInfo(Long starId, Long demandId, String statStartDate, String statEndDate) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarStarAdUniteTaskDetailGetValidateBeforeCall(starId, demandId, statStartDate, statEndDate, null);
        Type localVarReturnType = new TypeToken<StarStarAdUniteTaskDetailV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId 客户的星图id (required)
     * @param demandId 任务id (required)
     * @param statStartDate 查询起始时间，格式：yyyy-mm-dd ，只和安卓/iOS消耗、转化数、深度转化数相关 (required)
     * @param statEndDate 查询截止时间，格式：yyyy-mm-dd ，只和安卓/iOS消耗、转化数、深度转化数相关 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarStarAdUniteTaskDetailGetAsync(Long starId, Long demandId, String statStartDate, String statEndDate, final ApiCallback<StarStarAdUniteTaskDetailV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarStarAdUniteTaskDetailGetValidateBeforeCall(starId, demandId, statStartDate, statEndDate, _callback);
        Type localVarReturnType = new TypeToken<StarStarAdUniteTaskDetailV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
