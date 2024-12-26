/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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



import com.bytedance.ads.model.FileVideoMaterialClearTaskGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileVideoMaterialClearTaskGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FileVideoMaterialClearTaskGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public FileVideoMaterialClearTaskGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2FileVideoMaterialClearTaskGetGet
     * @param advertiserId 广告主id (required)
     * @param clearIds 清理任务id列表，最多支持10个 (optional)
     * @param page 页码，默认：1 (optional, default to 1)
     * @param pageSize 页面大小，默认10，范围：1-100 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileVideoMaterialClearTaskGetGetCall(Long advertiserId, List<Long> clearIds, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/file/video/material/clear_task/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (clearIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "clear_ids", clearIds));
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2FileVideoMaterialClearTaskGetGetValidateBeforeCall(Long advertiserId, List<Long> clearIds, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2FileVideoMaterialClearTaskGetGet(Async)");
        }

        return openApi2FileVideoMaterialClearTaskGetGetCall(advertiserId, clearIds, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param clearIds 清理任务id列表，最多支持10个 (optional)
     * @param page 页码，默认：1 (optional, default to 1)
     * @param pageSize 页面大小，默认10，范围：1-100 (optional, default to 10)
     * @return FileVideoMaterialClearTaskGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FileVideoMaterialClearTaskGetV2Response openApi2FileVideoMaterialClearTaskGetGet(Long advertiserId, List<Long> clearIds, Long page, Long pageSize) throws ApiException {
        ApiResponse<FileVideoMaterialClearTaskGetV2Response> localVarResp = openApi2FileVideoMaterialClearTaskGetGetWithHttpInfo(advertiserId, clearIds, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param clearIds 清理任务id列表，最多支持10个 (optional)
     * @param page 页码，默认：1 (optional, default to 1)
     * @param pageSize 页面大小，默认10，范围：1-100 (optional, default to 10)
     * @return ApiResponse&lt;FileVideoMaterialClearTaskGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileVideoMaterialClearTaskGetV2Response> openApi2FileVideoMaterialClearTaskGetGetWithHttpInfo(Long advertiserId, List<Long> clearIds, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2FileVideoMaterialClearTaskGetGetValidateBeforeCall(advertiserId, clearIds, page, pageSize, null);
        Type localVarReturnType = new TypeToken<FileVideoMaterialClearTaskGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主id (required)
     * @param clearIds 清理任务id列表，最多支持10个 (optional)
     * @param page 页码，默认：1 (optional, default to 1)
     * @param pageSize 页面大小，默认10，范围：1-100 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileVideoMaterialClearTaskGetGetAsync(Long advertiserId, List<Long> clearIds, Long page, Long pageSize, final ApiCallback<FileVideoMaterialClearTaskGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2FileVideoMaterialClearTaskGetGetValidateBeforeCall(advertiserId, clearIds, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<FileVideoMaterialClearTaskGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
