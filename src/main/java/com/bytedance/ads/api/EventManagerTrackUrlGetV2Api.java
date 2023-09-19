/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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



import com.bytedance.ads.model.EventManagerTrackUrlGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManagerTrackUrlGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventManagerTrackUrlGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public EventManagerTrackUrlGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2EventManagerTrackUrlGetGet
     * @param advertiserId 广告主ID (required)
     * @param assetId 资产ID (required)
     * @param downloadUrl 应用下载链接 (optional)
     * @param trackUrlGroupName 监测链接组名称 (optional)
     * @param trackUrlGroupId 监测链接组ID (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 分页个数 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2EventManagerTrackUrlGetGetCall(Long advertiserId, Long assetId, String downloadUrl, String trackUrlGroupName, Long trackUrlGroupId, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/event_manager/track_url/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (assetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asset_id", assetId));
        }

        if (downloadUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("download_url", downloadUrl));
        }

        if (trackUrlGroupName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("track_url_group_name", trackUrlGroupName));
        }

        if (trackUrlGroupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("track_url_group_id", trackUrlGroupId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2EventManagerTrackUrlGetGetValidateBeforeCall(Long advertiserId, Long assetId, String downloadUrl, String trackUrlGroupName, Long trackUrlGroupId, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2EventManagerTrackUrlGetGet(Async)");
        }

        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new ApiException("Missing the required parameter 'assetId' when calling openApi2EventManagerTrackUrlGetGet(Async)");
        }

        return openApi2EventManagerTrackUrlGetGetCall(advertiserId, assetId, downloadUrl, trackUrlGroupName, trackUrlGroupId, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param assetId 资产ID (required)
     * @param downloadUrl 应用下载链接 (optional)
     * @param trackUrlGroupName 监测链接组名称 (optional)
     * @param trackUrlGroupId 监测链接组ID (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 分页个数 (optional, default to 10)
     * @return EventManagerTrackUrlGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EventManagerTrackUrlGetV2Response openApi2EventManagerTrackUrlGetGet(Long advertiserId, Long assetId, String downloadUrl, String trackUrlGroupName, Long trackUrlGroupId, Long page, Long pageSize) throws ApiException {
        ApiResponse<EventManagerTrackUrlGetV2Response> localVarResp = openApi2EventManagerTrackUrlGetGetWithHttpInfo(advertiserId, assetId, downloadUrl, trackUrlGroupName, trackUrlGroupId, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param assetId 资产ID (required)
     * @param downloadUrl 应用下载链接 (optional)
     * @param trackUrlGroupName 监测链接组名称 (optional)
     * @param trackUrlGroupId 监测链接组ID (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 分页个数 (optional, default to 10)
     * @return ApiResponse&lt;EventManagerTrackUrlGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EventManagerTrackUrlGetV2Response> openApi2EventManagerTrackUrlGetGetWithHttpInfo(Long advertiserId, Long assetId, String downloadUrl, String trackUrlGroupName, Long trackUrlGroupId, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2EventManagerTrackUrlGetGetValidateBeforeCall(advertiserId, assetId, downloadUrl, trackUrlGroupName, trackUrlGroupId, page, pageSize, null);
        Type localVarReturnType = new TypeToken<EventManagerTrackUrlGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param assetId 资产ID (required)
     * @param downloadUrl 应用下载链接 (optional)
     * @param trackUrlGroupName 监测链接组名称 (optional)
     * @param trackUrlGroupId 监测链接组ID (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 分页个数 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2EventManagerTrackUrlGetGetAsync(Long advertiserId, Long assetId, String downloadUrl, String trackUrlGroupName, Long trackUrlGroupId, Long page, Long pageSize, final ApiCallback<EventManagerTrackUrlGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2EventManagerTrackUrlGetGetValidateBeforeCall(advertiserId, assetId, downloadUrl, trackUrlGroupName, trackUrlGroupId, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<EventManagerTrackUrlGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
