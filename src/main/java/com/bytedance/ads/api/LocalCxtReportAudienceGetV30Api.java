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



import com.bytedance.ads.model.LocalCxtReportAudienceGetV30Dimension;
import com.bytedance.ads.model.LocalCxtReportAudienceGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalCxtReportAudienceGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LocalCxtReportAudienceGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public LocalCxtReportAudienceGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30LocalCxtReportAudienceGetGet
     * @param localAccountId  (required)
     * @param startDate 查询起始日期，格式：yyyy-mm-dd (required)
     * @param endDate 查询结束日期，格式：yyyy-mm-dd 注意：时间跨度不能超过365天 (required)
     * @param metrics 指标集 (required)
     * @param dimension  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalCxtReportAudienceGetGetCall(Long localAccountId, String startDate, String endDate, List<String> metrics, LocalCxtReportAudienceGetV30Dimension dimension, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/local/cxt/report/audience/get/";

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

        if (metrics != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "metrics", metrics));
        }

        if (dimension != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dimension", dimension));
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
    private okhttp3.Call openApiV30LocalCxtReportAudienceGetGetValidateBeforeCall(Long localAccountId, String startDate, String endDate, List<String> metrics, LocalCxtReportAudienceGetV30Dimension dimension, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'localAccountId' is set
        if (localAccountId == null) {
            throw new ApiException("Missing the required parameter 'localAccountId' when calling openApiV30LocalCxtReportAudienceGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV30LocalCxtReportAudienceGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV30LocalCxtReportAudienceGetGet(Async)");
        }

        // verify the required parameter 'metrics' is set
        if (metrics == null) {
            throw new ApiException("Missing the required parameter 'metrics' when calling openApiV30LocalCxtReportAudienceGetGet(Async)");
        }

        // verify the required parameter 'dimension' is set
        if (dimension == null) {
            throw new ApiException("Missing the required parameter 'dimension' when calling openApiV30LocalCxtReportAudienceGetGet(Async)");
        }

        return openApiV30LocalCxtReportAudienceGetGetCall(localAccountId, startDate, endDate, metrics, dimension, _callback);

    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param startDate 查询起始日期，格式：yyyy-mm-dd (required)
     * @param endDate 查询结束日期，格式：yyyy-mm-dd 注意：时间跨度不能超过365天 (required)
     * @param metrics 指标集 (required)
     * @param dimension  (required)
     * @return LocalCxtReportAudienceGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public LocalCxtReportAudienceGetV30Response openApiV30LocalCxtReportAudienceGetGet(Long localAccountId, String startDate, String endDate, List<String> metrics, LocalCxtReportAudienceGetV30Dimension dimension) throws ApiException {
        ApiResponse<LocalCxtReportAudienceGetV30Response> localVarResp = openApiV30LocalCxtReportAudienceGetGetWithHttpInfo(localAccountId, startDate, endDate, metrics, dimension);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param startDate 查询起始日期，格式：yyyy-mm-dd (required)
     * @param endDate 查询结束日期，格式：yyyy-mm-dd 注意：时间跨度不能超过365天 (required)
     * @param metrics 指标集 (required)
     * @param dimension  (required)
     * @return ApiResponse&lt;LocalCxtReportAudienceGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LocalCxtReportAudienceGetV30Response> openApiV30LocalCxtReportAudienceGetGetWithHttpInfo(Long localAccountId, String startDate, String endDate, List<String> metrics, LocalCxtReportAudienceGetV30Dimension dimension) throws ApiException {
        okhttp3.Call localVarCall = openApiV30LocalCxtReportAudienceGetGetValidateBeforeCall(localAccountId, startDate, endDate, metrics, dimension, null);
        Type localVarReturnType = new TypeToken<LocalCxtReportAudienceGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param localAccountId  (required)
     * @param startDate 查询起始日期，格式：yyyy-mm-dd (required)
     * @param endDate 查询结束日期，格式：yyyy-mm-dd 注意：时间跨度不能超过365天 (required)
     * @param metrics 指标集 (required)
     * @param dimension  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalCxtReportAudienceGetGetAsync(Long localAccountId, String startDate, String endDate, List<String> metrics, LocalCxtReportAudienceGetV30Dimension dimension, final ApiCallback<LocalCxtReportAudienceGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30LocalCxtReportAudienceGetGetValidateBeforeCall(localAccountId, startDate, endDate, metrics, dimension, _callback);
        Type localVarReturnType = new TypeToken<LocalCxtReportAudienceGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
