/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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



import com.bytedance.ads.model.CreativeTemplateDetailGetV2Response;
import com.bytedance.ads.model.CreativeTemplateDetailGetV2TemplateType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreativeTemplateDetailGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CreativeTemplateDetailGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public CreativeTemplateDetailGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2CreativeTemplateDetailGetGet
     * @param advertiserId 广告主ID (required)
     * @param templateId 模板ID (required)
     * @param templateType 模板样式,eg: (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2CreativeTemplateDetailGetGetCall(Long advertiserId, Long templateId, CreativeTemplateDetailGetV2TemplateType templateType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/creative/template/detail/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (templateId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("template_id", templateId));
        }

        if (templateType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("template_type", templateType));
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
    private okhttp3.Call openApi2CreativeTemplateDetailGetGetValidateBeforeCall(Long advertiserId, Long templateId, CreativeTemplateDetailGetV2TemplateType templateType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2CreativeTemplateDetailGetGet(Async)");
        }

        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling openApi2CreativeTemplateDetailGetGet(Async)");
        }

        // verify the required parameter 'templateType' is set
        if (templateType == null) {
            throw new ApiException("Missing the required parameter 'templateType' when calling openApi2CreativeTemplateDetailGetGet(Async)");
        }

        return openApi2CreativeTemplateDetailGetGetCall(advertiserId, templateId, templateType, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param templateId 模板ID (required)
     * @param templateType 模板样式,eg: (required)
     * @return CreativeTemplateDetailGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CreativeTemplateDetailGetV2Response openApi2CreativeTemplateDetailGetGet(Long advertiserId, Long templateId, CreativeTemplateDetailGetV2TemplateType templateType) throws ApiException {
        ApiResponse<CreativeTemplateDetailGetV2Response> localVarResp = openApi2CreativeTemplateDetailGetGetWithHttpInfo(advertiserId, templateId, templateType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param templateId 模板ID (required)
     * @param templateType 模板样式,eg: (required)
     * @return ApiResponse&lt;CreativeTemplateDetailGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreativeTemplateDetailGetV2Response> openApi2CreativeTemplateDetailGetGetWithHttpInfo(Long advertiserId, Long templateId, CreativeTemplateDetailGetV2TemplateType templateType) throws ApiException {
        okhttp3.Call localVarCall = openApi2CreativeTemplateDetailGetGetValidateBeforeCall(advertiserId, templateId, templateType, null);
        Type localVarReturnType = new TypeToken<CreativeTemplateDetailGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param templateId 模板ID (required)
     * @param templateType 模板样式,eg: (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2CreativeTemplateDetailGetGetAsync(Long advertiserId, Long templateId, CreativeTemplateDetailGetV2TemplateType templateType, final ApiCallback<CreativeTemplateDetailGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2CreativeTemplateDetailGetGetValidateBeforeCall(advertiserId, templateId, templateType, _callback);
        Type localVarReturnType = new TypeToken<CreativeTemplateDetailGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
