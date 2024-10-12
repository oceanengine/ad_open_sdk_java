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



import com.bytedance.ads.model.FileMaterialAttributesListV2AccountType;
import com.bytedance.ads.model.FileMaterialAttributesListV2Filtering;
import com.bytedance.ads.model.FileMaterialAttributesListV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileMaterialAttributesListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FileMaterialAttributesListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public FileMaterialAttributesListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2FileMaterialAttributesListGet
     * @param accountId 各平台账户id，需同时选择account_type类型 需传入「获取已授权账户」接口返回的advertiser_id (required)
     * @param accountType 账户类型，允许值： (required)
     * @param pageSize 页面数据量，默认值: 100，page*page_size 最大1000 (required)
     * @param page 页码，默认值: 1，page*page_size 最大1000 (required)
     * @param filtering 过滤条件 (optional)
     * @param returnLowqualitySuggestions  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileMaterialAttributesListGetCall(Long accountId, FileMaterialAttributesListV2AccountType accountType, Integer pageSize, Integer page, FileMaterialAttributesListV2Filtering filtering, Boolean returnLowqualitySuggestions, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/file/material_attributes/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (returnLowqualitySuggestions != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("return_lowquality_suggestions", returnLowqualitySuggestions));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
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
    private okhttp3.Call openApi2FileMaterialAttributesListGetValidateBeforeCall(Long accountId, FileMaterialAttributesListV2AccountType accountType, Integer pageSize, Integer page, FileMaterialAttributesListV2Filtering filtering, Boolean returnLowqualitySuggestions, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApi2FileMaterialAttributesListGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApi2FileMaterialAttributesListGet(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling openApi2FileMaterialAttributesListGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApi2FileMaterialAttributesListGet(Async)");
        }

        return openApi2FileMaterialAttributesListGetCall(accountId, accountType, pageSize, page, filtering, returnLowqualitySuggestions, _callback);

    }

    /**
     * 
     * 
     * @param accountId 各平台账户id，需同时选择account_type类型 需传入「获取已授权账户」接口返回的advertiser_id (required)
     * @param accountType 账户类型，允许值： (required)
     * @param pageSize 页面数据量，默认值: 100，page*page_size 最大1000 (required)
     * @param page 页码，默认值: 1，page*page_size 最大1000 (required)
     * @param filtering 过滤条件 (optional)
     * @param returnLowqualitySuggestions  (optional)
     * @return FileMaterialAttributesListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FileMaterialAttributesListV2Response openApi2FileMaterialAttributesListGet(Long accountId, FileMaterialAttributesListV2AccountType accountType, Integer pageSize, Integer page, FileMaterialAttributesListV2Filtering filtering, Boolean returnLowqualitySuggestions) throws ApiException {
        ApiResponse<FileMaterialAttributesListV2Response> localVarResp = openApi2FileMaterialAttributesListGetWithHttpInfo(accountId, accountType, pageSize, page, filtering, returnLowqualitySuggestions);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId 各平台账户id，需同时选择account_type类型 需传入「获取已授权账户」接口返回的advertiser_id (required)
     * @param accountType 账户类型，允许值： (required)
     * @param pageSize 页面数据量，默认值: 100，page*page_size 最大1000 (required)
     * @param page 页码，默认值: 1，page*page_size 最大1000 (required)
     * @param filtering 过滤条件 (optional)
     * @param returnLowqualitySuggestions  (optional)
     * @return ApiResponse&lt;FileMaterialAttributesListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileMaterialAttributesListV2Response> openApi2FileMaterialAttributesListGetWithHttpInfo(Long accountId, FileMaterialAttributesListV2AccountType accountType, Integer pageSize, Integer page, FileMaterialAttributesListV2Filtering filtering, Boolean returnLowqualitySuggestions) throws ApiException {
        okhttp3.Call localVarCall = openApi2FileMaterialAttributesListGetValidateBeforeCall(accountId, accountType, pageSize, page, filtering, returnLowqualitySuggestions, null);
        Type localVarReturnType = new TypeToken<FileMaterialAttributesListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId 各平台账户id，需同时选择account_type类型 需传入「获取已授权账户」接口返回的advertiser_id (required)
     * @param accountType 账户类型，允许值： (required)
     * @param pageSize 页面数据量，默认值: 100，page*page_size 最大1000 (required)
     * @param page 页码，默认值: 1，page*page_size 最大1000 (required)
     * @param filtering 过滤条件 (optional)
     * @param returnLowqualitySuggestions  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileMaterialAttributesListGetAsync(Long accountId, FileMaterialAttributesListV2AccountType accountType, Integer pageSize, Integer page, FileMaterialAttributesListV2Filtering filtering, Boolean returnLowqualitySuggestions, final ApiCallback<FileMaterialAttributesListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2FileMaterialAttributesListGetValidateBeforeCall(accountId, accountType, pageSize, page, filtering, returnLowqualitySuggestions, _callback);
        Type localVarReturnType = new TypeToken<FileMaterialAttributesListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
