/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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



import com.bytedance.ads.model.EnterpriseCommentDetailV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnterpriseCommentDetailV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EnterpriseCommentDetailV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public EnterpriseCommentDetailV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10EnterpriseCommentDetailGet
     * @param ccAccountId  (optional)
     * @param commentId  (optional)
     * @param eDouyinId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10EnterpriseCommentDetailGetCall(Long ccAccountId, Long commentId, String eDouyinId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/enterprise/comment/detail/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ccAccountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cc_account_id", ccAccountId));
        }

        if (commentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("comment_id", commentId));
        }

        if (eDouyinId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("e_douyin_id", eDouyinId));
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
    private okhttp3.Call openApiV10EnterpriseCommentDetailGetValidateBeforeCall(Long ccAccountId, Long commentId, String eDouyinId, final ApiCallback _callback) throws ApiException {
        return openApiV10EnterpriseCommentDetailGetCall(ccAccountId, commentId, eDouyinId, _callback);

    }

    /**
     * 
     * 
     * @param ccAccountId  (optional)
     * @param commentId  (optional)
     * @param eDouyinId  (optional)
     * @return EnterpriseCommentDetailV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EnterpriseCommentDetailV10Response openApiV10EnterpriseCommentDetailGet(Long ccAccountId, Long commentId, String eDouyinId) throws ApiException {
        ApiResponse<EnterpriseCommentDetailV10Response> localVarResp = openApiV10EnterpriseCommentDetailGetWithHttpInfo(ccAccountId, commentId, eDouyinId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param ccAccountId  (optional)
     * @param commentId  (optional)
     * @param eDouyinId  (optional)
     * @return ApiResponse&lt;EnterpriseCommentDetailV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnterpriseCommentDetailV10Response> openApiV10EnterpriseCommentDetailGetWithHttpInfo(Long ccAccountId, Long commentId, String eDouyinId) throws ApiException {
        okhttp3.Call localVarCall = openApiV10EnterpriseCommentDetailGetValidateBeforeCall(ccAccountId, commentId, eDouyinId, null);
        Type localVarReturnType = new TypeToken<EnterpriseCommentDetailV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param ccAccountId  (optional)
     * @param commentId  (optional)
     * @param eDouyinId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10EnterpriseCommentDetailGetAsync(Long ccAccountId, Long commentId, String eDouyinId, final ApiCallback<EnterpriseCommentDetailV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10EnterpriseCommentDetailGetValidateBeforeCall(ccAccountId, commentId, eDouyinId, _callback);
        Type localVarReturnType = new TypeToken<EnterpriseCommentDetailV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
