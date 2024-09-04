/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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



import com.bytedance.ads.model.ToolsAipThirdSiteUpdateV2Request;
import com.bytedance.ads.model.ToolsAipThirdSiteUpdateV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsAipThirdSiteUpdateV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsAipThirdSiteUpdateV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsAipThirdSiteUpdateV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsAipThirdSiteUpdatePost
     * @param toolsAipThirdSiteUpdateV2Request  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAipThirdSiteUpdatePostCall(ToolsAipThirdSiteUpdateV2Request toolsAipThirdSiteUpdateV2Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = toolsAipThirdSiteUpdateV2Request;

        // create path and map variables
        String localVarPath = "/open_api/2/tools/aip_third_site/update/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2ToolsAipThirdSiteUpdatePostValidateBeforeCall(ToolsAipThirdSiteUpdateV2Request toolsAipThirdSiteUpdateV2Request, final ApiCallback _callback) throws ApiException {
        return openApi2ToolsAipThirdSiteUpdatePostCall(toolsAipThirdSiteUpdateV2Request, _callback);

    }

    /**
     * 
     * 
     * @param toolsAipThirdSiteUpdateV2Request  (optional)
     * @return ToolsAipThirdSiteUpdateV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsAipThirdSiteUpdateV2Response openApi2ToolsAipThirdSiteUpdatePost(ToolsAipThirdSiteUpdateV2Request toolsAipThirdSiteUpdateV2Request) throws ApiException {
        ApiResponse<ToolsAipThirdSiteUpdateV2Response> localVarResp = openApi2ToolsAipThirdSiteUpdatePostWithHttpInfo(toolsAipThirdSiteUpdateV2Request);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param toolsAipThirdSiteUpdateV2Request  (optional)
     * @return ApiResponse&lt;ToolsAipThirdSiteUpdateV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsAipThirdSiteUpdateV2Response> openApi2ToolsAipThirdSiteUpdatePostWithHttpInfo(ToolsAipThirdSiteUpdateV2Request toolsAipThirdSiteUpdateV2Request) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsAipThirdSiteUpdatePostValidateBeforeCall(toolsAipThirdSiteUpdateV2Request, null);
        Type localVarReturnType = new TypeToken<ToolsAipThirdSiteUpdateV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param toolsAipThirdSiteUpdateV2Request  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAipThirdSiteUpdatePostAsync(ToolsAipThirdSiteUpdateV2Request toolsAipThirdSiteUpdateV2Request, final ApiCallback<ToolsAipThirdSiteUpdateV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsAipThirdSiteUpdatePostValidateBeforeCall(toolsAipThirdSiteUpdateV2Request, _callback);
        Type localVarReturnType = new TypeToken<ToolsAipThirdSiteUpdateV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
