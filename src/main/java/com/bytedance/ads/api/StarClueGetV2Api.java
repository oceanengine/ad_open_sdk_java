/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
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



import com.bytedance.ads.model.StarClueGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarClueGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarClueGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarClueGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarClueGetGet
     * @param demandId  (optional)
     * @param orderId  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param starId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarClueGetGetCall(Long demandId, Long orderId, Long page, Long pageSize, Long starId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/clue/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (demandId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("demand_id", demandId));
        }

        if (orderId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_id", orderId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
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
    private okhttp3.Call openApi2StarClueGetGetValidateBeforeCall(Long demandId, Long orderId, Long page, Long pageSize, Long starId, final ApiCallback _callback) throws ApiException {
        return openApi2StarClueGetGetCall(demandId, orderId, page, pageSize, starId, _callback);

    }

    /**
     * 
     * 
     * @param demandId  (optional)
     * @param orderId  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param starId  (optional)
     * @return StarClueGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarClueGetV2Response openApi2StarClueGetGet(Long demandId, Long orderId, Long page, Long pageSize, Long starId) throws ApiException {
        ApiResponse<StarClueGetV2Response> localVarResp = openApi2StarClueGetGetWithHttpInfo(demandId, orderId, page, pageSize, starId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param demandId  (optional)
     * @param orderId  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param starId  (optional)
     * @return ApiResponse&lt;StarClueGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarClueGetV2Response> openApi2StarClueGetGetWithHttpInfo(Long demandId, Long orderId, Long page, Long pageSize, Long starId) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarClueGetGetValidateBeforeCall(demandId, orderId, page, pageSize, starId, null);
        Type localVarReturnType = new TypeToken<StarClueGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param demandId  (optional)
     * @param orderId  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param starId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarClueGetGetAsync(Long demandId, Long orderId, Long page, Long pageSize, Long starId, final ApiCallback<StarClueGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarClueGetGetValidateBeforeCall(demandId, orderId, page, pageSize, starId, _callback);
        Type localVarReturnType = new TypeToken<StarClueGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
