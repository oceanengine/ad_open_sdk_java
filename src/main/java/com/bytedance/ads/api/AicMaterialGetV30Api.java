/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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



import com.bytedance.ads.model.AicMaterialGetV30AccountType;
import com.bytedance.ads.model.AicMaterialGetV30Filtering;
import com.bytedance.ads.model.AicMaterialGetV30OrderField;
import com.bytedance.ads.model.AicMaterialGetV30OrderType;
import com.bytedance.ads.model.AicMaterialGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AicMaterialGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AicMaterialGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AicMaterialGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30AicMaterialGetGet
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType 账户体系枚举  (required)
     * @param filtering 过滤条件 不同条件之间为「且」的关系，只有同时满足传入的多个条件，才会返回信息 (optional)
     * @param page 页码，默认值1 (optional, default to 1)
     * @param pageSize 页面大小，默认值20，最大值200  (optional, default to 20)
     * @param orderField 排序字段 (optional)
     * @param orderType 排序方式 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AicMaterialGetGetCall(Long accountId, AicMaterialGetV30AccountType accountType, AicMaterialGetV30Filtering filtering, Long page, Long pageSize, AicMaterialGetV30OrderField orderField, AicMaterialGetV30OrderType orderType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/aic/material/get/";

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

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (orderField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_field", orderField));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
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
    private okhttp3.Call openApiV30AicMaterialGetGetValidateBeforeCall(Long accountId, AicMaterialGetV30AccountType accountType, AicMaterialGetV30Filtering filtering, Long page, Long pageSize, AicMaterialGetV30OrderField orderField, AicMaterialGetV30OrderType orderType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30AicMaterialGetGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApiV30AicMaterialGetGet(Async)");
        }

        return openApiV30AicMaterialGetGetCall(accountId, accountType, filtering, page, pageSize, orderField, orderType, _callback);

    }

    /**
     * 
     * 
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType 账户体系枚举  (required)
     * @param filtering 过滤条件 不同条件之间为「且」的关系，只有同时满足传入的多个条件，才会返回信息 (optional)
     * @param page 页码，默认值1 (optional, default to 1)
     * @param pageSize 页面大小，默认值20，最大值200  (optional, default to 20)
     * @param orderField 排序字段 (optional)
     * @param orderType 排序方式 (optional)
     * @return AicMaterialGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AicMaterialGetV30Response openApiV30AicMaterialGetGet(Long accountId, AicMaterialGetV30AccountType accountType, AicMaterialGetV30Filtering filtering, Long page, Long pageSize, AicMaterialGetV30OrderField orderField, AicMaterialGetV30OrderType orderType) throws ApiException {
        ApiResponse<AicMaterialGetV30Response> localVarResp = openApiV30AicMaterialGetGetWithHttpInfo(accountId, accountType, filtering, page, pageSize, orderField, orderType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType 账户体系枚举  (required)
     * @param filtering 过滤条件 不同条件之间为「且」的关系，只有同时满足传入的多个条件，才会返回信息 (optional)
     * @param page 页码，默认值1 (optional, default to 1)
     * @param pageSize 页面大小，默认值20，最大值200  (optional, default to 20)
     * @param orderField 排序字段 (optional)
     * @param orderType 排序方式 (optional)
     * @return ApiResponse&lt;AicMaterialGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AicMaterialGetV30Response> openApiV30AicMaterialGetGetWithHttpInfo(Long accountId, AicMaterialGetV30AccountType accountType, AicMaterialGetV30Filtering filtering, Long page, Long pageSize, AicMaterialGetV30OrderField orderField, AicMaterialGetV30OrderType orderType) throws ApiException {
        okhttp3.Call localVarCall = openApiV30AicMaterialGetGetValidateBeforeCall(accountId, accountType, filtering, page, pageSize, orderField, orderType, null);
        Type localVarReturnType = new TypeToken<AicMaterialGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType 账户体系枚举  (required)
     * @param filtering 过滤条件 不同条件之间为「且」的关系，只有同时满足传入的多个条件，才会返回信息 (optional)
     * @param page 页码，默认值1 (optional, default to 1)
     * @param pageSize 页面大小，默认值20，最大值200  (optional, default to 20)
     * @param orderField 排序字段 (optional)
     * @param orderType 排序方式 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AicMaterialGetGetAsync(Long accountId, AicMaterialGetV30AccountType accountType, AicMaterialGetV30Filtering filtering, Long page, Long pageSize, AicMaterialGetV30OrderField orderField, AicMaterialGetV30OrderType orderType, final ApiCallback<AicMaterialGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30AicMaterialGetGetValidateBeforeCall(accountId, accountType, filtering, page, pageSize, orderField, orderType, _callback);
        Type localVarReturnType = new TypeToken<AicMaterialGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
