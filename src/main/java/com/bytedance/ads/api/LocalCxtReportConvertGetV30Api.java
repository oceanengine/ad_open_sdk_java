/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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



import com.bytedance.ads.model.LocalCxtReportConvertGetV30ExternalAction;
import com.bytedance.ads.model.LocalCxtReportConvertGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalCxtReportConvertGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LocalCxtReportConvertGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public LocalCxtReportConvertGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30LocalCxtReportConvertGetGet
     * @param localAccountId  (required)
     * @param startDate 查询起始日期，格式：yyyy-mm-dd (required)
     * @param endDate 查询结束日期，格式：yyyy-mm-dd 注意：时间跨度不能超过365天 (required)
     * @param externalAction  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalCxtReportConvertGetGetCall(Long localAccountId, String startDate, String endDate, LocalCxtReportConvertGetV30ExternalAction externalAction, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/local/cxt/report/convert/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (localAccountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("local_account_id", localAccountId));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (externalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_action", externalAction));
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
    private okhttp3.Call openApiV30LocalCxtReportConvertGetGetValidateBeforeCall(Long localAccountId, String startDate, String endDate, LocalCxtReportConvertGetV30ExternalAction externalAction, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'localAccountId' is set
        if (localAccountId == null) {
            throw new ApiException("Missing the required parameter 'localAccountId' when calling openApiV30LocalCxtReportConvertGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV30LocalCxtReportConvertGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV30LocalCxtReportConvertGetGet(Async)");
        }

        // verify the required parameter 'externalAction' is set
        if (externalAction == null) {
            throw new ApiException("Missing the required parameter 'externalAction' when calling openApiV30LocalCxtReportConvertGetGet(Async)");
        }

        return openApiV30LocalCxtReportConvertGetGetCall(localAccountId, startDate, endDate, externalAction, _callback);

    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param startDate 查询起始日期，格式：yyyy-mm-dd (required)
     * @param endDate 查询结束日期，格式：yyyy-mm-dd 注意：时间跨度不能超过365天 (required)
     * @param externalAction  (required)
     * @return LocalCxtReportConvertGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public LocalCxtReportConvertGetV30Response openApiV30LocalCxtReportConvertGetGet(Long localAccountId, String startDate, String endDate, LocalCxtReportConvertGetV30ExternalAction externalAction) throws ApiException {
        ApiResponse<LocalCxtReportConvertGetV30Response> localVarResp = openApiV30LocalCxtReportConvertGetGetWithHttpInfo(localAccountId, startDate, endDate, externalAction);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param startDate 查询起始日期，格式：yyyy-mm-dd (required)
     * @param endDate 查询结束日期，格式：yyyy-mm-dd 注意：时间跨度不能超过365天 (required)
     * @param externalAction  (required)
     * @return ApiResponse&lt;LocalCxtReportConvertGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LocalCxtReportConvertGetV30Response> openApiV30LocalCxtReportConvertGetGetWithHttpInfo(Long localAccountId, String startDate, String endDate, LocalCxtReportConvertGetV30ExternalAction externalAction) throws ApiException {
        okhttp3.Call localVarCall = openApiV30LocalCxtReportConvertGetGetValidateBeforeCall(localAccountId, startDate, endDate, externalAction, null);
        Type localVarReturnType = new TypeToken<LocalCxtReportConvertGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param localAccountId  (required)
     * @param startDate 查询起始日期，格式：yyyy-mm-dd (required)
     * @param endDate 查询结束日期，格式：yyyy-mm-dd 注意：时间跨度不能超过365天 (required)
     * @param externalAction  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalCxtReportConvertGetGetAsync(Long localAccountId, String startDate, String endDate, LocalCxtReportConvertGetV30ExternalAction externalAction, final ApiCallback<LocalCxtReportConvertGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30LocalCxtReportConvertGetGetValidateBeforeCall(localAccountId, startDate, endDate, externalAction, _callback);
        Type localVarReturnType = new TypeToken<LocalCxtReportConvertGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
