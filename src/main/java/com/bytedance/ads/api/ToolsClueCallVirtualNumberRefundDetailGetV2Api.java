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



import com.bytedance.ads.model.ToolsClueCallVirtualNumberRefundDetailGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsClueCallVirtualNumberRefundDetailGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsClueCallVirtualNumberRefundDetailGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsClueCallVirtualNumberRefundDetailGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsClueCallVirtualNumberRefundDetailGetGet
     * @param advertiserId 广告主id (required)
     * @param month 查询账单月份，格式YYYYMM，只支持查询202112月及之后的账单 (required)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小，即每页展示的数据量 (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsClueCallVirtualNumberRefundDetailGetGetCall(Long advertiserId, String month, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/clue/call_virtual_number/refund_detail/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (month != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("month", month));
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
    private okhttp3.Call openApi2ToolsClueCallVirtualNumberRefundDetailGetGetValidateBeforeCall(Long advertiserId, String month, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsClueCallVirtualNumberRefundDetailGetGet(Async)");
        }

        // verify the required parameter 'month' is set
        if (month == null) {
            throw new ApiException("Missing the required parameter 'month' when calling openApi2ToolsClueCallVirtualNumberRefundDetailGetGet(Async)");
        }

        return openApi2ToolsClueCallVirtualNumberRefundDetailGetGetCall(advertiserId, month, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param month 查询账单月份，格式YYYYMM，只支持查询202112月及之后的账单 (required)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小，即每页展示的数据量 (optional, default to 20)
     * @return ToolsClueCallVirtualNumberRefundDetailGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsClueCallVirtualNumberRefundDetailGetV2Response openApi2ToolsClueCallVirtualNumberRefundDetailGetGet(Long advertiserId, String month, Long page, Long pageSize) throws ApiException {
        ApiResponse<ToolsClueCallVirtualNumberRefundDetailGetV2Response> localVarResp = openApi2ToolsClueCallVirtualNumberRefundDetailGetGetWithHttpInfo(advertiserId, month, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param month 查询账单月份，格式YYYYMM，只支持查询202112月及之后的账单 (required)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小，即每页展示的数据量 (optional, default to 20)
     * @return ApiResponse&lt;ToolsClueCallVirtualNumberRefundDetailGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsClueCallVirtualNumberRefundDetailGetV2Response> openApi2ToolsClueCallVirtualNumberRefundDetailGetGetWithHttpInfo(Long advertiserId, String month, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsClueCallVirtualNumberRefundDetailGetGetValidateBeforeCall(advertiserId, month, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ToolsClueCallVirtualNumberRefundDetailGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主id (required)
     * @param month 查询账单月份，格式YYYYMM，只支持查询202112月及之后的账单 (required)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小，即每页展示的数据量 (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsClueCallVirtualNumberRefundDetailGetGetAsync(Long advertiserId, String month, Long page, Long pageSize, final ApiCallback<ToolsClueCallVirtualNumberRefundDetailGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsClueCallVirtualNumberRefundDetailGetGetValidateBeforeCall(advertiserId, month, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ToolsClueCallVirtualNumberRefundDetailGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
