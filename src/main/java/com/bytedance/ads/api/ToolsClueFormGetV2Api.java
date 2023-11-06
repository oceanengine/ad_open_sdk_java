/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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



import com.bytedance.ads.model.ToolsClueFormGetV2FormType;
import com.bytedance.ads.model.ToolsClueFormGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsClueFormGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsClueFormGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsClueFormGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsClueFormGetGet
     * @param advertiserId  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param instanceId  (optional)
     * @param name  (optional)
     * @param isDel  (optional, default to 1)
     * @param formType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsClueFormGetGetCall(Long advertiserId, Integer page, Integer pageSize, String startTime, String endTime, Long instanceId, String name, Long isDel, ToolsClueFormGetV2FormType formType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/clue/form/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
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

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (instanceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("instance_id", instanceId));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (isDel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("is_del", isDel));
        }

        if (formType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("form_type", formType));
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
    private okhttp3.Call openApi2ToolsClueFormGetGetValidateBeforeCall(Long advertiserId, Integer page, Integer pageSize, String startTime, String endTime, Long instanceId, String name, Long isDel, ToolsClueFormGetV2FormType formType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsClueFormGetGet(Async)");
        }

        return openApi2ToolsClueFormGetGetCall(advertiserId, page, pageSize, startTime, endTime, instanceId, name, isDel, formType, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param instanceId  (optional)
     * @param name  (optional)
     * @param isDel  (optional, default to 1)
     * @param formType  (optional)
     * @return ToolsClueFormGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsClueFormGetV2Response openApi2ToolsClueFormGetGet(Long advertiserId, Integer page, Integer pageSize, String startTime, String endTime, Long instanceId, String name, Long isDel, ToolsClueFormGetV2FormType formType) throws ApiException {
        ApiResponse<ToolsClueFormGetV2Response> localVarResp = openApi2ToolsClueFormGetGetWithHttpInfo(advertiserId, page, pageSize, startTime, endTime, instanceId, name, isDel, formType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param instanceId  (optional)
     * @param name  (optional)
     * @param isDel  (optional, default to 1)
     * @param formType  (optional)
     * @return ApiResponse&lt;ToolsClueFormGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsClueFormGetV2Response> openApi2ToolsClueFormGetGetWithHttpInfo(Long advertiserId, Integer page, Integer pageSize, String startTime, String endTime, Long instanceId, String name, Long isDel, ToolsClueFormGetV2FormType formType) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsClueFormGetGetValidateBeforeCall(advertiserId, page, pageSize, startTime, endTime, instanceId, name, isDel, formType, null);
        Type localVarReturnType = new TypeToken<ToolsClueFormGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @param endTime  (optional)
     * @param instanceId  (optional)
     * @param name  (optional)
     * @param isDel  (optional, default to 1)
     * @param formType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsClueFormGetGetAsync(Long advertiserId, Integer page, Integer pageSize, String startTime, String endTime, Long instanceId, String name, Long isDel, ToolsClueFormGetV2FormType formType, final ApiCallback<ToolsClueFormGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsClueFormGetGetValidateBeforeCall(advertiserId, page, pageSize, startTime, endTime, instanceId, name, isDel, formType, _callback);
        Type localVarReturnType = new TypeToken<ToolsClueFormGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
