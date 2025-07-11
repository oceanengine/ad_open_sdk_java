/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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



import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30AssetType;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30Response;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30ShareType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsBpAssetManagementShareGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsBpAssetManagementShareGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsBpAssetManagementShareGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ToolsBpAssetManagementShareGetGet
     * @param assetType  (required)
     * @param instanceId  (required)
     * @param organizationId  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param shareType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsBpAssetManagementShareGetGetCall(ToolsBpAssetManagementShareGetV30AssetType assetType, Long instanceId, Long organizationId, Integer page, Integer pageSize, ToolsBpAssetManagementShareGetV30ShareType shareType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/tools/bp_asset_management/share/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (organizationId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("organization_id", organizationId));
        }

        if (assetType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asset_type", assetType));
        }

        if (instanceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("instance_id", instanceId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (shareType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("share_type", shareType));
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
    private okhttp3.Call openApiV30ToolsBpAssetManagementShareGetGetValidateBeforeCall(ToolsBpAssetManagementShareGetV30AssetType assetType, Long instanceId, Long organizationId, Integer page, Integer pageSize, ToolsBpAssetManagementShareGetV30ShareType shareType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'assetType' is set
        if (assetType == null) {
            throw new ApiException("Missing the required parameter 'assetType' when calling openApiV30ToolsBpAssetManagementShareGetGet(Async)");
        }

        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new ApiException("Missing the required parameter 'instanceId' when calling openApiV30ToolsBpAssetManagementShareGetGet(Async)");
        }

        return openApiV30ToolsBpAssetManagementShareGetGetCall(assetType, instanceId, organizationId, page, pageSize, shareType, _callback);

    }

    /**
     * 
     * 
     * @param assetType  (required)
     * @param instanceId  (required)
     * @param organizationId  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param shareType  (optional)
     * @return ToolsBpAssetManagementShareGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsBpAssetManagementShareGetV30Response openApiV30ToolsBpAssetManagementShareGetGet(ToolsBpAssetManagementShareGetV30AssetType assetType, Long instanceId, Long organizationId, Integer page, Integer pageSize, ToolsBpAssetManagementShareGetV30ShareType shareType) throws ApiException {
        ApiResponse<ToolsBpAssetManagementShareGetV30Response> localVarResp = openApiV30ToolsBpAssetManagementShareGetGetWithHttpInfo(assetType, instanceId, organizationId, page, pageSize, shareType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param assetType  (required)
     * @param instanceId  (required)
     * @param organizationId  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param shareType  (optional)
     * @return ApiResponse&lt;ToolsBpAssetManagementShareGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsBpAssetManagementShareGetV30Response> openApiV30ToolsBpAssetManagementShareGetGetWithHttpInfo(ToolsBpAssetManagementShareGetV30AssetType assetType, Long instanceId, Long organizationId, Integer page, Integer pageSize, ToolsBpAssetManagementShareGetV30ShareType shareType) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ToolsBpAssetManagementShareGetGetValidateBeforeCall(assetType, instanceId, organizationId, page, pageSize, shareType, null);
        Type localVarReturnType = new TypeToken<ToolsBpAssetManagementShareGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param assetType  (required)
     * @param instanceId  (required)
     * @param organizationId  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param shareType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsBpAssetManagementShareGetGetAsync(ToolsBpAssetManagementShareGetV30AssetType assetType, Long instanceId, Long organizationId, Integer page, Integer pageSize, ToolsBpAssetManagementShareGetV30ShareType shareType, final ApiCallback<ToolsBpAssetManagementShareGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ToolsBpAssetManagementShareGetGetValidateBeforeCall(assetType, instanceId, organizationId, page, pageSize, shareType, _callback);
        Type localVarReturnType = new TypeToken<ToolsBpAssetManagementShareGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
