/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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



import com.bytedance.ads.model.StarDemanderDemanderGetAuthorBindInfoV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarDemanderDemanderGetAuthorBindInfoV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarDemanderDemanderGetAuthorBindInfoV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarDemanderDemanderGetAuthorBindInfoV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarDemanderDemanderGetAuthorBindInfoGet
     * @param starId  (required)
     * @param bizUid 查询指定达人信息 (optional)
     * @param startTime 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param endTime 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param page 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param limit 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarDemanderDemanderGetAuthorBindInfoGetCall(Long starId, List<String> bizUid, Long startTime, Long endTime, Long page, Long limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/demander/demander_get_author_bind_info/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (bizUid != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "biz_uid", bizUid));
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

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call openApi2StarDemanderDemanderGetAuthorBindInfoGetValidateBeforeCall(Long starId, List<String> bizUid, Long startTime, Long endTime, Long page, Long limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarDemanderDemanderGetAuthorBindInfoGet(Async)");
        }

        return openApi2StarDemanderDemanderGetAuthorBindInfoGetCall(starId, bizUid, startTime, endTime, page, limit, _callback);

    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param bizUid 查询指定达人信息 (optional)
     * @param startTime 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param endTime 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param page 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param limit 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @return StarDemanderDemanderGetAuthorBindInfoV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarDemanderDemanderGetAuthorBindInfoV2Response openApi2StarDemanderDemanderGetAuthorBindInfoGet(Long starId, List<String> bizUid, Long startTime, Long endTime, Long page, Long limit) throws ApiException {
        ApiResponse<StarDemanderDemanderGetAuthorBindInfoV2Response> localVarResp = openApi2StarDemanderDemanderGetAuthorBindInfoGetWithHttpInfo(starId, bizUid, startTime, endTime, page, limit);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param bizUid 查询指定达人信息 (optional)
     * @param startTime 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param endTime 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param page 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param limit 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @return ApiResponse&lt;StarDemanderDemanderGetAuthorBindInfoV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarDemanderDemanderGetAuthorBindInfoV2Response> openApi2StarDemanderDemanderGetAuthorBindInfoGetWithHttpInfo(Long starId, List<String> bizUid, Long startTime, Long endTime, Long page, Long limit) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarDemanderDemanderGetAuthorBindInfoGetValidateBeforeCall(starId, bizUid, startTime, endTime, page, limit, null);
        Type localVarReturnType = new TypeToken<StarDemanderDemanderGetAuthorBindInfoV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId  (required)
     * @param bizUid 查询指定达人信息 (optional)
     * @param startTime 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param endTime 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param page 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param limit 根据绑定时间范围查询，不传biz_uid时，必传 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarDemanderDemanderGetAuthorBindInfoGetAsync(Long starId, List<String> bizUid, Long startTime, Long endTime, Long page, Long limit, final ApiCallback<StarDemanderDemanderGetAuthorBindInfoV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarDemanderDemanderGetAuthorBindInfoGetValidateBeforeCall(starId, bizUid, startTime, endTime, page, limit, _callback);
        Type localVarReturnType = new TypeToken<StarDemanderDemanderGetAuthorBindInfoV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
