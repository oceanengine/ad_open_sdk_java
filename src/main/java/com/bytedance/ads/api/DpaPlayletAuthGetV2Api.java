/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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



import com.bytedance.ads.model.DpaPlayletAuthGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DpaPlayletAuthGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DpaPlayletAuthGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public DpaPlayletAuthGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2DpaPlayletAuthGetGet
     * @param advertiserId 广告主账户ID (required)
     * @param platformId 商品库ID (required)
     * @param productId 商品ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2DpaPlayletAuthGetGetCall(Long advertiserId, Long platformId, Long productId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/dpa/playlet/auth/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (platformId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("platform_id", platformId));
        }

        if (productId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("product_id", productId));
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
    private okhttp3.Call openApi2DpaPlayletAuthGetGetValidateBeforeCall(Long advertiserId, Long platformId, Long productId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2DpaPlayletAuthGetGet(Async)");
        }

        // verify the required parameter 'platformId' is set
        if (platformId == null) {
            throw new ApiException("Missing the required parameter 'platformId' when calling openApi2DpaPlayletAuthGetGet(Async)");
        }

        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling openApi2DpaPlayletAuthGetGet(Async)");
        }

        return openApi2DpaPlayletAuthGetGetCall(advertiserId, platformId, productId, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主账户ID (required)
     * @param platformId 商品库ID (required)
     * @param productId 商品ID (required)
     * @return DpaPlayletAuthGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DpaPlayletAuthGetV2Response openApi2DpaPlayletAuthGetGet(Long advertiserId, Long platformId, Long productId) throws ApiException {
        ApiResponse<DpaPlayletAuthGetV2Response> localVarResp = openApi2DpaPlayletAuthGetGetWithHttpInfo(advertiserId, platformId, productId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主账户ID (required)
     * @param platformId 商品库ID (required)
     * @param productId 商品ID (required)
     * @return ApiResponse&lt;DpaPlayletAuthGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DpaPlayletAuthGetV2Response> openApi2DpaPlayletAuthGetGetWithHttpInfo(Long advertiserId, Long platformId, Long productId) throws ApiException {
        okhttp3.Call localVarCall = openApi2DpaPlayletAuthGetGetValidateBeforeCall(advertiserId, platformId, productId, null);
        Type localVarReturnType = new TypeToken<DpaPlayletAuthGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主账户ID (required)
     * @param platformId 商品库ID (required)
     * @param productId 商品ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2DpaPlayletAuthGetGetAsync(Long advertiserId, Long platformId, Long productId, final ApiCallback<DpaPlayletAuthGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2DpaPlayletAuthGetGetValidateBeforeCall(advertiserId, platformId, productId, _callback);
        Type localVarReturnType = new TypeToken<DpaPlayletAuthGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
