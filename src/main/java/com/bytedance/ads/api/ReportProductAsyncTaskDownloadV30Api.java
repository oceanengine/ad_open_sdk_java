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



import com.bytedance.ads.model.ReportProductAsyncTaskDownloadV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportProductAsyncTaskDownloadV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportProductAsyncTaskDownloadV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportProductAsyncTaskDownloadV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ReportProductAsyncTaskDownloadGet
     * @param advertiserId  (required)
     * @param taskId  (required)
     * @param rangeFrom  (optional)
     * @param rangeTo  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportProductAsyncTaskDownloadGetCall(Long advertiserId, Long taskId, Long rangeFrom, Long rangeTo, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/report/product/async_task/download/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (taskId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("task_id", taskId));
        }

        if (rangeFrom != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("range_from", rangeFrom));
        }

        if (rangeTo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("range_to", rangeTo));
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
    private okhttp3.Call openApiV30ReportProductAsyncTaskDownloadGetValidateBeforeCall(Long advertiserId, Long taskId, Long rangeFrom, Long rangeTo, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ReportProductAsyncTaskDownloadGet(Async)");
        }

        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling openApiV30ReportProductAsyncTaskDownloadGet(Async)");
        }

        return openApiV30ReportProductAsyncTaskDownloadGetCall(advertiserId, taskId, rangeFrom, rangeTo, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param taskId  (required)
     * @param rangeFrom  (optional)
     * @param rangeTo  (optional)
     * @return ReportProductAsyncTaskDownloadV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportProductAsyncTaskDownloadV30Response openApiV30ReportProductAsyncTaskDownloadGet(Long advertiserId, Long taskId, Long rangeFrom, Long rangeTo) throws ApiException {
        ApiResponse<ReportProductAsyncTaskDownloadV30Response> localVarResp = openApiV30ReportProductAsyncTaskDownloadGetWithHttpInfo(advertiserId, taskId, rangeFrom, rangeTo);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param taskId  (required)
     * @param rangeFrom  (optional)
     * @param rangeTo  (optional)
     * @return ApiResponse&lt;ReportProductAsyncTaskDownloadV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportProductAsyncTaskDownloadV30Response> openApiV30ReportProductAsyncTaskDownloadGetWithHttpInfo(Long advertiserId, Long taskId, Long rangeFrom, Long rangeTo) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ReportProductAsyncTaskDownloadGetValidateBeforeCall(advertiserId, taskId, rangeFrom, rangeTo, null);
        Type localVarReturnType = new TypeToken<ReportProductAsyncTaskDownloadV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param taskId  (required)
     * @param rangeFrom  (optional)
     * @param rangeTo  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportProductAsyncTaskDownloadGetAsync(Long advertiserId, Long taskId, Long rangeFrom, Long rangeTo, final ApiCallback<ReportProductAsyncTaskDownloadV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ReportProductAsyncTaskDownloadGetValidateBeforeCall(advertiserId, taskId, rangeFrom, rangeTo, _callback);
        Type localVarReturnType = new TypeToken<ReportProductAsyncTaskDownloadV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
