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



import com.bytedance.ads.model.AccountFundGetV30AccountType;
import com.bytedance.ads.model.AccountFundGetV30GrantTypeSplit;
import com.bytedance.ads.model.AccountFundGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountFundGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccountFundGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountFundGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30AccountFundGetGet
     * @param accountIds  (required)
     * @param accountType  (required)
     * @param grantTypeSplit  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AccountFundGetGetCall(List<Long> accountIds, AccountFundGetV30AccountType accountType, AccountFundGetV30GrantTypeSplit grantTypeSplit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/account/fund/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "account_ids", accountIds));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
        }

        if (grantTypeSplit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("grant_type_split", grantTypeSplit));
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
    private okhttp3.Call openApiV30AccountFundGetGetValidateBeforeCall(List<Long> accountIds, AccountFundGetV30AccountType accountType, AccountFundGetV30GrantTypeSplit grantTypeSplit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountIds' is set
        if (accountIds == null) {
            throw new ApiException("Missing the required parameter 'accountIds' when calling openApiV30AccountFundGetGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApiV30AccountFundGetGet(Async)");
        }

        return openApiV30AccountFundGetGetCall(accountIds, accountType, grantTypeSplit, _callback);

    }

    /**
     * 
     * 
     * @param accountIds  (required)
     * @param accountType  (required)
     * @param grantTypeSplit  (optional)
     * @return AccountFundGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AccountFundGetV30Response openApiV30AccountFundGetGet(List<Long> accountIds, AccountFundGetV30AccountType accountType, AccountFundGetV30GrantTypeSplit grantTypeSplit) throws ApiException {
        ApiResponse<AccountFundGetV30Response> localVarResp = openApiV30AccountFundGetGetWithHttpInfo(accountIds, accountType, grantTypeSplit);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountIds  (required)
     * @param accountType  (required)
     * @param grantTypeSplit  (optional)
     * @return ApiResponse&lt;AccountFundGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountFundGetV30Response> openApiV30AccountFundGetGetWithHttpInfo(List<Long> accountIds, AccountFundGetV30AccountType accountType, AccountFundGetV30GrantTypeSplit grantTypeSplit) throws ApiException {
        okhttp3.Call localVarCall = openApiV30AccountFundGetGetValidateBeforeCall(accountIds, accountType, grantTypeSplit, null);
        Type localVarReturnType = new TypeToken<AccountFundGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountIds  (required)
     * @param accountType  (required)
     * @param grantTypeSplit  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AccountFundGetGetAsync(List<Long> accountIds, AccountFundGetV30AccountType accountType, AccountFundGetV30GrantTypeSplit grantTypeSplit, final ApiCallback<AccountFundGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30AccountFundGetGetValidateBeforeCall(accountIds, accountType, grantTypeSplit, _callback);
        Type localVarReturnType = new TypeToken<AccountFundGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
