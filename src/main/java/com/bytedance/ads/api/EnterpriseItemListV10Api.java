/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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



import com.bytedance.ads.model.EnterpriseItemListV10Filter;
import com.bytedance.ads.model.EnterpriseItemListV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnterpriseItemListV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EnterpriseItemListV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public EnterpriseItemListV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10EnterpriseItemListGet
     * @param ccAccountId  (optional)
     * @param eDouyinId  (optional)
     * @param endTime  (optional)
     * @param filter  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startTime  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10EnterpriseItemListGetCall(Long ccAccountId, String eDouyinId, String endTime, EnterpriseItemListV10Filter filter, Long page, Long pageSize, String startTime, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/enterprise/item/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ccAccountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cc_account_id", ccAccountId));
        }

        if (eDouyinId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("e_douyin_id", eDouyinId));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
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
    private okhttp3.Call openApiV10EnterpriseItemListGetValidateBeforeCall(Long ccAccountId, String eDouyinId, String endTime, EnterpriseItemListV10Filter filter, Long page, Long pageSize, String startTime, final ApiCallback _callback) throws ApiException {
        return openApiV10EnterpriseItemListGetCall(ccAccountId, eDouyinId, endTime, filter, page, pageSize, startTime, _callback);

    }

    /**
     * 
     * 
     * @param ccAccountId  (optional)
     * @param eDouyinId  (optional)
     * @param endTime  (optional)
     * @param filter  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startTime  (optional)
     * @return EnterpriseItemListV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EnterpriseItemListV10Response openApiV10EnterpriseItemListGet(Long ccAccountId, String eDouyinId, String endTime, EnterpriseItemListV10Filter filter, Long page, Long pageSize, String startTime) throws ApiException {
        ApiResponse<EnterpriseItemListV10Response> localVarResp = openApiV10EnterpriseItemListGetWithHttpInfo(ccAccountId, eDouyinId, endTime, filter, page, pageSize, startTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param ccAccountId  (optional)
     * @param eDouyinId  (optional)
     * @param endTime  (optional)
     * @param filter  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startTime  (optional)
     * @return ApiResponse&lt;EnterpriseItemListV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnterpriseItemListV10Response> openApiV10EnterpriseItemListGetWithHttpInfo(Long ccAccountId, String eDouyinId, String endTime, EnterpriseItemListV10Filter filter, Long page, Long pageSize, String startTime) throws ApiException {
        okhttp3.Call localVarCall = openApiV10EnterpriseItemListGetValidateBeforeCall(ccAccountId, eDouyinId, endTime, filter, page, pageSize, startTime, null);
        Type localVarReturnType = new TypeToken<EnterpriseItemListV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param ccAccountId  (optional)
     * @param eDouyinId  (optional)
     * @param endTime  (optional)
     * @param filter  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startTime  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10EnterpriseItemListGetAsync(Long ccAccountId, String eDouyinId, String endTime, EnterpriseItemListV10Filter filter, Long page, Long pageSize, String startTime, final ApiCallback<EnterpriseItemListV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10EnterpriseItemListGetValidateBeforeCall(ccAccountId, eDouyinId, endTime, filter, page, pageSize, startTime, _callback);
        Type localVarReturnType = new TypeToken<EnterpriseItemListV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
