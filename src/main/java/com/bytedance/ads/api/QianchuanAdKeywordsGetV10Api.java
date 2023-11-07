/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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



import com.bytedance.ads.model.QianchuanAdKeywordsGetV10Filtering;
import com.bytedance.ads.model.QianchuanAdKeywordsGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanAdKeywordsGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanAdKeywordsGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanAdKeywordsGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanAdKeywordsGetGet
     * @param advertiserId 千川广告账户id (required)
     * @param filtering  (required)
     * @param page 页码，从 1 开始，默认1 (optional, default to 1)
     * @param pageSize 每页数目，上限500，默认100 (optional, default to 100)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanAdKeywordsGetGetCall(Long advertiserId, QianchuanAdKeywordsGetV10Filtering filtering, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/ad/keywords/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
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
    private okhttp3.Call openApiV10QianchuanAdKeywordsGetGetValidateBeforeCall(Long advertiserId, QianchuanAdKeywordsGetV10Filtering filtering, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanAdKeywordsGetGet(Async)");
        }

        // verify the required parameter 'filtering' is set
        if (filtering == null) {
            throw new ApiException("Missing the required parameter 'filtering' when calling openApiV10QianchuanAdKeywordsGetGet(Async)");
        }

        return openApiV10QianchuanAdKeywordsGetGetCall(advertiserId, filtering, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 千川广告账户id (required)
     * @param filtering  (required)
     * @param page 页码，从 1 开始，默认1 (optional, default to 1)
     * @param pageSize 每页数目，上限500，默认100 (optional, default to 100)
     * @return QianchuanAdKeywordsGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanAdKeywordsGetV10Response openApiV10QianchuanAdKeywordsGetGet(Long advertiserId, QianchuanAdKeywordsGetV10Filtering filtering, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<QianchuanAdKeywordsGetV10Response> localVarResp = openApiV10QianchuanAdKeywordsGetGetWithHttpInfo(advertiserId, filtering, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 千川广告账户id (required)
     * @param filtering  (required)
     * @param page 页码，从 1 开始，默认1 (optional, default to 1)
     * @param pageSize 每页数目，上限500，默认100 (optional, default to 100)
     * @return ApiResponse&lt;QianchuanAdKeywordsGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanAdKeywordsGetV10Response> openApiV10QianchuanAdKeywordsGetGetWithHttpInfo(Long advertiserId, QianchuanAdKeywordsGetV10Filtering filtering, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanAdKeywordsGetGetValidateBeforeCall(advertiserId, filtering, page, pageSize, null);
        Type localVarReturnType = new TypeToken<QianchuanAdKeywordsGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 千川广告账户id (required)
     * @param filtering  (required)
     * @param page 页码，从 1 开始，默认1 (optional, default to 1)
     * @param pageSize 每页数目，上限500，默认100 (optional, default to 100)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanAdKeywordsGetGetAsync(Long advertiserId, QianchuanAdKeywordsGetV10Filtering filtering, Integer page, Integer pageSize, final ApiCallback<QianchuanAdKeywordsGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanAdKeywordsGetGetValidateBeforeCall(advertiserId, filtering, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<QianchuanAdKeywordsGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
