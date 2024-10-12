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



import com.bytedance.ads.model.ToolsEventAssetsGetV2AssetType;
import com.bytedance.ads.model.ToolsEventAssetsGetV2Filtering;
import com.bytedance.ads.model.ToolsEventAssetsGetV2Response;
import com.bytedance.ads.model.ToolsEventAssetsGetV2SortType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsEventAssetsGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsEventAssetsGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsEventAssetsGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsEventAssetsGetGet
     * @param advertiserId 广告主 id (required)
     * @param assetType 资产类型，允许值:&#x60;THIRD_EXTERNAL&#x60;:三方落地页,&#x60;APP&#x60;:应用,&#x60;QUICK_APP&#x60;:快应用,&#x60;MINI_PROGRAME&#x60;:小程序 (required)
     * @param filtering 过滤条件 (optional)
     * @param sortType 排序方式，允许值：&#x60;ASC&#x60;：升序  &#x60;DESC&#x60;：降序&lt;br&gt;默认值&#x60;ASC&#x60; (optional)
     * @param page 页码，默认值&#x60;1&#x60; (optional, default to 1)
     * @param pageSize 页面大小，默认值&#x60;10&#x60;，最大&#x60;30&#x60; (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsEventAssetsGetGetCall(Long advertiserId, ToolsEventAssetsGetV2AssetType assetType, ToolsEventAssetsGetV2Filtering filtering, ToolsEventAssetsGetV2SortType sortType, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/event/assets/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (assetType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asset_type", assetType));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (sortType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort_type", sortType));
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
    private okhttp3.Call openApi2ToolsEventAssetsGetGetValidateBeforeCall(Long advertiserId, ToolsEventAssetsGetV2AssetType assetType, ToolsEventAssetsGetV2Filtering filtering, ToolsEventAssetsGetV2SortType sortType, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsEventAssetsGetGet(Async)");
        }

        // verify the required parameter 'assetType' is set
        if (assetType == null) {
            throw new ApiException("Missing the required parameter 'assetType' when calling openApi2ToolsEventAssetsGetGet(Async)");
        }

        return openApi2ToolsEventAssetsGetGetCall(advertiserId, assetType, filtering, sortType, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主 id (required)
     * @param assetType 资产类型，允许值:&#x60;THIRD_EXTERNAL&#x60;:三方落地页,&#x60;APP&#x60;:应用,&#x60;QUICK_APP&#x60;:快应用,&#x60;MINI_PROGRAME&#x60;:小程序 (required)
     * @param filtering 过滤条件 (optional)
     * @param sortType 排序方式，允许值：&#x60;ASC&#x60;：升序  &#x60;DESC&#x60;：降序&lt;br&gt;默认值&#x60;ASC&#x60; (optional)
     * @param page 页码，默认值&#x60;1&#x60; (optional, default to 1)
     * @param pageSize 页面大小，默认值&#x60;10&#x60;，最大&#x60;30&#x60; (optional, default to 10)
     * @return ToolsEventAssetsGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsEventAssetsGetV2Response openApi2ToolsEventAssetsGetGet(Long advertiserId, ToolsEventAssetsGetV2AssetType assetType, ToolsEventAssetsGetV2Filtering filtering, ToolsEventAssetsGetV2SortType sortType, Long page, Long pageSize) throws ApiException {
        ApiResponse<ToolsEventAssetsGetV2Response> localVarResp = openApi2ToolsEventAssetsGetGetWithHttpInfo(advertiserId, assetType, filtering, sortType, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主 id (required)
     * @param assetType 资产类型，允许值:&#x60;THIRD_EXTERNAL&#x60;:三方落地页,&#x60;APP&#x60;:应用,&#x60;QUICK_APP&#x60;:快应用,&#x60;MINI_PROGRAME&#x60;:小程序 (required)
     * @param filtering 过滤条件 (optional)
     * @param sortType 排序方式，允许值：&#x60;ASC&#x60;：升序  &#x60;DESC&#x60;：降序&lt;br&gt;默认值&#x60;ASC&#x60; (optional)
     * @param page 页码，默认值&#x60;1&#x60; (optional, default to 1)
     * @param pageSize 页面大小，默认值&#x60;10&#x60;，最大&#x60;30&#x60; (optional, default to 10)
     * @return ApiResponse&lt;ToolsEventAssetsGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsEventAssetsGetV2Response> openApi2ToolsEventAssetsGetGetWithHttpInfo(Long advertiserId, ToolsEventAssetsGetV2AssetType assetType, ToolsEventAssetsGetV2Filtering filtering, ToolsEventAssetsGetV2SortType sortType, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsEventAssetsGetGetValidateBeforeCall(advertiserId, assetType, filtering, sortType, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ToolsEventAssetsGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主 id (required)
     * @param assetType 资产类型，允许值:&#x60;THIRD_EXTERNAL&#x60;:三方落地页,&#x60;APP&#x60;:应用,&#x60;QUICK_APP&#x60;:快应用,&#x60;MINI_PROGRAME&#x60;:小程序 (required)
     * @param filtering 过滤条件 (optional)
     * @param sortType 排序方式，允许值：&#x60;ASC&#x60;：升序  &#x60;DESC&#x60;：降序&lt;br&gt;默认值&#x60;ASC&#x60; (optional)
     * @param page 页码，默认值&#x60;1&#x60; (optional, default to 1)
     * @param pageSize 页面大小，默认值&#x60;10&#x60;，最大&#x60;30&#x60; (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsEventAssetsGetGetAsync(Long advertiserId, ToolsEventAssetsGetV2AssetType assetType, ToolsEventAssetsGetV2Filtering filtering, ToolsEventAssetsGetV2SortType sortType, Long page, Long pageSize, final ApiCallback<ToolsEventAssetsGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsEventAssetsGetGetValidateBeforeCall(advertiserId, assetType, filtering, sortType, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ToolsEventAssetsGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
