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



import com.bytedance.ads.model.DiagnosisTaskAgentListV2Response;
import com.bytedance.ads.model.DiagnosisTaskAgentListV2Results;
import com.bytedance.ads.model.DiagnosisTaskAgentListV2Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagnosisTaskAgentListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DiagnosisTaskAgentListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public DiagnosisTaskAgentListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2DiagnosisTaskAgentListGet
     * @param agentId 代理商ID (required)
     * @param results 根据任务结果筛选 允许值： FIRST_PUBLISH_MATERIAL 首发素材 NON_FIRST_PUBLISH_MATERIAL 非首发素材 AD_HIGH_QUALITY_MATERIAL AD优质素材 NON_AD_HIGH_QUALITY_MATERIAL AD非优质素材 ECP_HIGH_QUALITY_MATERIAL 千川优质素材 NON_ECP_HIGH_QUALITY_MATERIAL 千川非优质素材 INEFFICIENT_MATERIAL 低效素材 NON_INEFFICIENT_MATERIAL 非低效素材 (optional)
     * @param status 根据任务状态筛选，允许值： PENDING SUCCESS FAILED (optional)
     * @param startTime 根据任务创建时间进行过滤的起始时间，与end_time搭配使用，格式：yyyy-mm-dd (optional)
     * @param endTime 根据任务创建时间进行过滤的截止时间，与start_time搭配使用，格式：yyyy-mm-dd (optional)
     * @param page 页码，默认值1 (optional, default to 1)
     * @param pageSize 页面大小，默认值20 (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2DiagnosisTaskAgentListGetCall(Long agentId, List<DiagnosisTaskAgentListV2Results> results, List<DiagnosisTaskAgentListV2Status> status, String startTime, String endTime, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/diagnosis_task/agent/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agent_id", agentId));
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
    private okhttp3.Call openApi2DiagnosisTaskAgentListGetValidateBeforeCall(Long agentId, List<DiagnosisTaskAgentListV2Results> results, List<DiagnosisTaskAgentListV2Status> status, String startTime, String endTime, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'agentId' is set
        if (agentId == null) {
            throw new ApiException("Missing the required parameter 'agentId' when calling openApi2DiagnosisTaskAgentListGet(Async)");
        }

        return openApi2DiagnosisTaskAgentListGetCall(agentId, results, status, startTime, endTime, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param agentId 代理商ID (required)
     * @param results 根据任务结果筛选 允许值： FIRST_PUBLISH_MATERIAL 首发素材 NON_FIRST_PUBLISH_MATERIAL 非首发素材 AD_HIGH_QUALITY_MATERIAL AD优质素材 NON_AD_HIGH_QUALITY_MATERIAL AD非优质素材 ECP_HIGH_QUALITY_MATERIAL 千川优质素材 NON_ECP_HIGH_QUALITY_MATERIAL 千川非优质素材 INEFFICIENT_MATERIAL 低效素材 NON_INEFFICIENT_MATERIAL 非低效素材 (optional)
     * @param status 根据任务状态筛选，允许值： PENDING SUCCESS FAILED (optional)
     * @param startTime 根据任务创建时间进行过滤的起始时间，与end_time搭配使用，格式：yyyy-mm-dd (optional)
     * @param endTime 根据任务创建时间进行过滤的截止时间，与start_time搭配使用，格式：yyyy-mm-dd (optional)
     * @param page 页码，默认值1 (optional, default to 1)
     * @param pageSize 页面大小，默认值20 (optional, default to 20)
     * @return DiagnosisTaskAgentListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DiagnosisTaskAgentListV2Response openApi2DiagnosisTaskAgentListGet(Long agentId, List<DiagnosisTaskAgentListV2Results> results, List<DiagnosisTaskAgentListV2Status> status, String startTime, String endTime, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<DiagnosisTaskAgentListV2Response> localVarResp = openApi2DiagnosisTaskAgentListGetWithHttpInfo(agentId, results, status, startTime, endTime, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param agentId 代理商ID (required)
     * @param results 根据任务结果筛选 允许值： FIRST_PUBLISH_MATERIAL 首发素材 NON_FIRST_PUBLISH_MATERIAL 非首发素材 AD_HIGH_QUALITY_MATERIAL AD优质素材 NON_AD_HIGH_QUALITY_MATERIAL AD非优质素材 ECP_HIGH_QUALITY_MATERIAL 千川优质素材 NON_ECP_HIGH_QUALITY_MATERIAL 千川非优质素材 INEFFICIENT_MATERIAL 低效素材 NON_INEFFICIENT_MATERIAL 非低效素材 (optional)
     * @param status 根据任务状态筛选，允许值： PENDING SUCCESS FAILED (optional)
     * @param startTime 根据任务创建时间进行过滤的起始时间，与end_time搭配使用，格式：yyyy-mm-dd (optional)
     * @param endTime 根据任务创建时间进行过滤的截止时间，与start_time搭配使用，格式：yyyy-mm-dd (optional)
     * @param page 页码，默认值1 (optional, default to 1)
     * @param pageSize 页面大小，默认值20 (optional, default to 20)
     * @return ApiResponse&lt;DiagnosisTaskAgentListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DiagnosisTaskAgentListV2Response> openApi2DiagnosisTaskAgentListGetWithHttpInfo(Long agentId, List<DiagnosisTaskAgentListV2Results> results, List<DiagnosisTaskAgentListV2Status> status, String startTime, String endTime, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2DiagnosisTaskAgentListGetValidateBeforeCall(agentId, results, status, startTime, endTime, page, pageSize, null);
        Type localVarReturnType = new TypeToken<DiagnosisTaskAgentListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param agentId 代理商ID (required)
     * @param results 根据任务结果筛选 允许值： FIRST_PUBLISH_MATERIAL 首发素材 NON_FIRST_PUBLISH_MATERIAL 非首发素材 AD_HIGH_QUALITY_MATERIAL AD优质素材 NON_AD_HIGH_QUALITY_MATERIAL AD非优质素材 ECP_HIGH_QUALITY_MATERIAL 千川优质素材 NON_ECP_HIGH_QUALITY_MATERIAL 千川非优质素材 INEFFICIENT_MATERIAL 低效素材 NON_INEFFICIENT_MATERIAL 非低效素材 (optional)
     * @param status 根据任务状态筛选，允许值： PENDING SUCCESS FAILED (optional)
     * @param startTime 根据任务创建时间进行过滤的起始时间，与end_time搭配使用，格式：yyyy-mm-dd (optional)
     * @param endTime 根据任务创建时间进行过滤的截止时间，与start_time搭配使用，格式：yyyy-mm-dd (optional)
     * @param page 页码，默认值1 (optional, default to 1)
     * @param pageSize 页面大小，默认值20 (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2DiagnosisTaskAgentListGetAsync(Long agentId, List<DiagnosisTaskAgentListV2Results> results, List<DiagnosisTaskAgentListV2Status> status, String startTime, String endTime, Integer page, Integer pageSize, final ApiCallback<DiagnosisTaskAgentListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2DiagnosisTaskAgentListGetValidateBeforeCall(agentId, results, status, startTime, endTime, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<DiagnosisTaskAgentListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
