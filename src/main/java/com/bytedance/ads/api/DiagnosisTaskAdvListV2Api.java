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



import com.bytedance.ads.model.DiagnosisTaskAdvListV2Response;
import com.bytedance.ads.model.DiagnosisTaskAdvListV2Results;
import com.bytedance.ads.model.DiagnosisTaskAdvListV2Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagnosisTaskAdvListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DiagnosisTaskAdvListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public DiagnosisTaskAdvListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2DiagnosisTaskAdvListGet
     * @param advertiserId  (optional)
     * @param results  (optional)
     * @param status  (optional)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2DiagnosisTaskAdvListGetCall(Long advertiserId, List<DiagnosisTaskAdvListV2Results> results, List<DiagnosisTaskAdvListV2Status> status, Long startTime, Long endTime, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/diagnosis_task/adv/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (results != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "results", results));
        }

        if (status != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "status", status));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
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
    private okhttp3.Call openApi2DiagnosisTaskAdvListGetValidateBeforeCall(Long advertiserId, List<DiagnosisTaskAdvListV2Results> results, List<DiagnosisTaskAdvListV2Status> status, Long startTime, Long endTime, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        return openApi2DiagnosisTaskAdvListGetCall(advertiserId, results, status, startTime, endTime, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param results  (optional)
     * @param status  (optional)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @return DiagnosisTaskAdvListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DiagnosisTaskAdvListV2Response openApi2DiagnosisTaskAdvListGet(Long advertiserId, List<DiagnosisTaskAdvListV2Results> results, List<DiagnosisTaskAdvListV2Status> status, Long startTime, Long endTime, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<DiagnosisTaskAdvListV2Response> localVarResp = openApi2DiagnosisTaskAdvListGetWithHttpInfo(advertiserId, results, status, startTime, endTime, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param results  (optional)
     * @param status  (optional)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @return ApiResponse&lt;DiagnosisTaskAdvListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DiagnosisTaskAdvListV2Response> openApi2DiagnosisTaskAdvListGetWithHttpInfo(Long advertiserId, List<DiagnosisTaskAdvListV2Results> results, List<DiagnosisTaskAdvListV2Status> status, Long startTime, Long endTime, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2DiagnosisTaskAdvListGetValidateBeforeCall(advertiserId, results, status, startTime, endTime, page, pageSize, null);
        Type localVarReturnType = new TypeToken<DiagnosisTaskAdvListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (optional)
     * @param results  (optional)
     * @param status  (optional)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2DiagnosisTaskAdvListGetAsync(Long advertiserId, List<DiagnosisTaskAdvListV2Results> results, List<DiagnosisTaskAdvListV2Status> status, Long startTime, Long endTime, Integer page, Integer pageSize, final ApiCallback<DiagnosisTaskAdvListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2DiagnosisTaskAdvListGetValidateBeforeCall(advertiserId, results, status, startTime, endTime, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<DiagnosisTaskAdvListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
