/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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



import com.bytedance.ads.model.AudiencePackageBindinfoGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AudiencePackageBindinfoGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AudiencePackageBindinfoGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AudiencePackageBindinfoGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30AudiencePackageBindinfoGetGet
     * @param advertiserId  (required)
     * @param audiencePackageId 定向包Id (required)
     * @param page 分页 (required)
     * @param pageSize 页面大小 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AudiencePackageBindinfoGetGetCall(Long advertiserId, Long audiencePackageId, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/audience_package_bindinfo/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (audiencePackageId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("audience_package_id", audiencePackageId));
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
    private okhttp3.Call openApiV30AudiencePackageBindinfoGetGetValidateBeforeCall(Long advertiserId, Long audiencePackageId, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30AudiencePackageBindinfoGetGet(Async)");
        }

        // verify the required parameter 'audiencePackageId' is set
        if (audiencePackageId == null) {
            throw new ApiException("Missing the required parameter 'audiencePackageId' when calling openApiV30AudiencePackageBindinfoGetGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApiV30AudiencePackageBindinfoGetGet(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling openApiV30AudiencePackageBindinfoGetGet(Async)");
        }

        return openApiV30AudiencePackageBindinfoGetGetCall(advertiserId, audiencePackageId, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param audiencePackageId 定向包Id (required)
     * @param page 分页 (required)
     * @param pageSize 页面大小 (required)
     * @return AudiencePackageBindinfoGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AudiencePackageBindinfoGetV30Response openApiV30AudiencePackageBindinfoGetGet(Long advertiserId, Long audiencePackageId, Long page, Long pageSize) throws ApiException {
        ApiResponse<AudiencePackageBindinfoGetV30Response> localVarResp = openApiV30AudiencePackageBindinfoGetGetWithHttpInfo(advertiserId, audiencePackageId, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param audiencePackageId 定向包Id (required)
     * @param page 分页 (required)
     * @param pageSize 页面大小 (required)
     * @return ApiResponse&lt;AudiencePackageBindinfoGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AudiencePackageBindinfoGetV30Response> openApiV30AudiencePackageBindinfoGetGetWithHttpInfo(Long advertiserId, Long audiencePackageId, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV30AudiencePackageBindinfoGetGetValidateBeforeCall(advertiserId, audiencePackageId, page, pageSize, null);
        Type localVarReturnType = new TypeToken<AudiencePackageBindinfoGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param audiencePackageId 定向包Id (required)
     * @param page 分页 (required)
     * @param pageSize 页面大小 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AudiencePackageBindinfoGetGetAsync(Long advertiserId, Long audiencePackageId, Long page, Long pageSize, final ApiCallback<AudiencePackageBindinfoGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30AudiencePackageBindinfoGetGetValidateBeforeCall(advertiserId, audiencePackageId, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<AudiencePackageBindinfoGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
