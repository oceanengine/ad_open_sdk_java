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



import com.bytedance.ads.model.DouplusOptionalTargetsListV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DouplusOptionalTargetsListV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DouplusOptionalTargetsListV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public DouplusOptionalTargetsListV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30DouplusOptionalTargetsListGet
     * @param awemeSecUid  (optional)
     * @param itemId 视频id (optional)
     * @param liveAwemeId 直播间主播抖音id (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30DouplusOptionalTargetsListGetCall(String awemeSecUid, Long itemId, String liveAwemeId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/douplus/optional_targets/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (awemeSecUid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_sec_uid", awemeSecUid));
        }

        if (itemId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("item_id", itemId));
        }

        if (liveAwemeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("live_aweme_id", liveAwemeId));
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
    private okhttp3.Call openApiV30DouplusOptionalTargetsListGetValidateBeforeCall(String awemeSecUid, Long itemId, String liveAwemeId, final ApiCallback _callback) throws ApiException {
        return openApiV30DouplusOptionalTargetsListGetCall(awemeSecUid, itemId, liveAwemeId, _callback);

    }

    /**
     * 
     * 
     * @param awemeSecUid  (optional)
     * @param itemId 视频id (optional)
     * @param liveAwemeId 直播间主播抖音id (optional)
     * @return DouplusOptionalTargetsListV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DouplusOptionalTargetsListV30Response openApiV30DouplusOptionalTargetsListGet(String awemeSecUid, Long itemId, String liveAwemeId) throws ApiException {
        ApiResponse<DouplusOptionalTargetsListV30Response> localVarResp = openApiV30DouplusOptionalTargetsListGetWithHttpInfo(awemeSecUid, itemId, liveAwemeId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param awemeSecUid  (optional)
     * @param itemId 视频id (optional)
     * @param liveAwemeId 直播间主播抖音id (optional)
     * @return ApiResponse&lt;DouplusOptionalTargetsListV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DouplusOptionalTargetsListV30Response> openApiV30DouplusOptionalTargetsListGetWithHttpInfo(String awemeSecUid, Long itemId, String liveAwemeId) throws ApiException {
        okhttp3.Call localVarCall = openApiV30DouplusOptionalTargetsListGetValidateBeforeCall(awemeSecUid, itemId, liveAwemeId, null);
        Type localVarReturnType = new TypeToken<DouplusOptionalTargetsListV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param awemeSecUid  (optional)
     * @param itemId 视频id (optional)
     * @param liveAwemeId 直播间主播抖音id (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30DouplusOptionalTargetsListGetAsync(String awemeSecUid, Long itemId, String liveAwemeId, final ApiCallback<DouplusOptionalTargetsListV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30DouplusOptionalTargetsListGetValidateBeforeCall(awemeSecUid, itemId, liveAwemeId, _callback);
        Type localVarReturnType = new TypeToken<DouplusOptionalTargetsListV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
