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



import com.bytedance.ads.model.YuntuBrandInfoGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YuntuBrandInfoGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public YuntuBrandInfoGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public YuntuBrandInfoGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30YuntuBrandInfoGetGet
     * @param yuntuBrandId 云图品牌ID (required)
     * @param serviceProviderId 服务商ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30YuntuBrandInfoGetGetCall(Long yuntuBrandId, Long serviceProviderId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/yuntu/brand_info/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (yuntuBrandId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("yuntu_brand_id", yuntuBrandId));
        }

        if (serviceProviderId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("service_provider_id", serviceProviderId));
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
    private okhttp3.Call openApiV30YuntuBrandInfoGetGetValidateBeforeCall(Long yuntuBrandId, Long serviceProviderId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'yuntuBrandId' is set
        if (yuntuBrandId == null) {
            throw new ApiException("Missing the required parameter 'yuntuBrandId' when calling openApiV30YuntuBrandInfoGetGet(Async)");
        }

        // verify the required parameter 'serviceProviderId' is set
        if (serviceProviderId == null) {
            throw new ApiException("Missing the required parameter 'serviceProviderId' when calling openApiV30YuntuBrandInfoGetGet(Async)");
        }

        return openApiV30YuntuBrandInfoGetGetCall(yuntuBrandId, serviceProviderId, _callback);

    }

    /**
     * 
     * 
     * @param yuntuBrandId 云图品牌ID (required)
     * @param serviceProviderId 服务商ID (required)
     * @return YuntuBrandInfoGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public YuntuBrandInfoGetV30Response openApiV30YuntuBrandInfoGetGet(Long yuntuBrandId, Long serviceProviderId) throws ApiException {
        ApiResponse<YuntuBrandInfoGetV30Response> localVarResp = openApiV30YuntuBrandInfoGetGetWithHttpInfo(yuntuBrandId, serviceProviderId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param yuntuBrandId 云图品牌ID (required)
     * @param serviceProviderId 服务商ID (required)
     * @return ApiResponse&lt;YuntuBrandInfoGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<YuntuBrandInfoGetV30Response> openApiV30YuntuBrandInfoGetGetWithHttpInfo(Long yuntuBrandId, Long serviceProviderId) throws ApiException {
        okhttp3.Call localVarCall = openApiV30YuntuBrandInfoGetGetValidateBeforeCall(yuntuBrandId, serviceProviderId, null);
        Type localVarReturnType = new TypeToken<YuntuBrandInfoGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param yuntuBrandId 云图品牌ID (required)
     * @param serviceProviderId 服务商ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30YuntuBrandInfoGetGetAsync(Long yuntuBrandId, Long serviceProviderId, final ApiCallback<YuntuBrandInfoGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30YuntuBrandInfoGetGetValidateBeforeCall(yuntuBrandId, serviceProviderId, _callback);
        Type localVarReturnType = new TypeToken<YuntuBrandInfoGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
