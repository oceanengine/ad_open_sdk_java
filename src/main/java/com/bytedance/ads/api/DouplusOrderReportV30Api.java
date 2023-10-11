/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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



import com.bytedance.ads.model.DouplusOrderReportV30Filter;
import com.bytedance.ads.model.DouplusOrderReportV30GroupBy;
import com.bytedance.ads.model.DouplusOrderReportV30Response;
import com.bytedance.ads.model.DouplusOrderReportV30StatTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DouplusOrderReportV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DouplusOrderReportV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public DouplusOrderReportV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30DouplusOrderReportGet
     * @param awemeSecUid  (optional)
     * @param statTime  (optional)
     * @param groupBy  (optional)
     * @param filter  (optional)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30DouplusOrderReportGetCall(String awemeSecUid, DouplusOrderReportV30StatTime statTime, List<DouplusOrderReportV30GroupBy> groupBy, DouplusOrderReportV30Filter filter, Long pageSize, Long page, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/douplus/order/report/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (awemeSecUid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_sec_uid", awemeSecUid));
        }

        if (statTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("stat_time", statTime));
        }

        if (groupBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "group_by", groupBy));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
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
    private okhttp3.Call openApiV30DouplusOrderReportGetValidateBeforeCall(String awemeSecUid, DouplusOrderReportV30StatTime statTime, List<DouplusOrderReportV30GroupBy> groupBy, DouplusOrderReportV30Filter filter, Long pageSize, Long page, final ApiCallback _callback) throws ApiException {
        return openApiV30DouplusOrderReportGetCall(awemeSecUid, statTime, groupBy, filter, pageSize, page, _callback);

    }

    /**
     * 
     * 
     * @param awemeSecUid  (optional)
     * @param statTime  (optional)
     * @param groupBy  (optional)
     * @param filter  (optional)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @return DouplusOrderReportV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DouplusOrderReportV30Response openApiV30DouplusOrderReportGet(String awemeSecUid, DouplusOrderReportV30StatTime statTime, List<DouplusOrderReportV30GroupBy> groupBy, DouplusOrderReportV30Filter filter, Long pageSize, Long page) throws ApiException {
        ApiResponse<DouplusOrderReportV30Response> localVarResp = openApiV30DouplusOrderReportGetWithHttpInfo(awemeSecUid, statTime, groupBy, filter, pageSize, page);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param awemeSecUid  (optional)
     * @param statTime  (optional)
     * @param groupBy  (optional)
     * @param filter  (optional)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @return ApiResponse&lt;DouplusOrderReportV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DouplusOrderReportV30Response> openApiV30DouplusOrderReportGetWithHttpInfo(String awemeSecUid, DouplusOrderReportV30StatTime statTime, List<DouplusOrderReportV30GroupBy> groupBy, DouplusOrderReportV30Filter filter, Long pageSize, Long page) throws ApiException {
        okhttp3.Call localVarCall = openApiV30DouplusOrderReportGetValidateBeforeCall(awemeSecUid, statTime, groupBy, filter, pageSize, page, null);
        Type localVarReturnType = new TypeToken<DouplusOrderReportV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param awemeSecUid  (optional)
     * @param statTime  (optional)
     * @param groupBy  (optional)
     * @param filter  (optional)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30DouplusOrderReportGetAsync(String awemeSecUid, DouplusOrderReportV30StatTime statTime, List<DouplusOrderReportV30GroupBy> groupBy, DouplusOrderReportV30Filter filter, Long pageSize, Long page, final ApiCallback<DouplusOrderReportV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30DouplusOrderReportGetValidateBeforeCall(awemeSecUid, statTime, groupBy, filter, pageSize, page, _callback);
        Type localVarReturnType = new TypeToken<DouplusOrderReportV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
