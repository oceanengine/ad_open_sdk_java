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



import com.bytedance.ads.model.CgTransferTransferDetailGetV30Platform;
import com.bytedance.ads.model.CgTransferTransferDetailGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CgTransferTransferDetailGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CgTransferTransferDetailGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public CgTransferTransferDetailGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30CgTransferTransferDetailGetGet
     * @param organizationId 组织id (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param platform 转账业务线 (required)
     * @param transferBizRequestNo 发起转账的幂等id (optional)
     * @param transferSerial 转账单号，与transfer_biz_request_no两者传其一即可 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferTransferDetailGetGetCall(Long organizationId, String bizRequestNo, CgTransferTransferDetailGetV30Platform platform, String transferBizRequestNo, String transferSerial, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/cg_transfer/transfer_detail/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (organizationId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("organization_id", organizationId));
        }

        if (bizRequestNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_request_no", bizRequestNo));
        }

        if (transferBizRequestNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transfer_biz_request_no", transferBizRequestNo));
        }

        if (transferSerial != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transfer_serial", transferSerial));
        }

        if (platform != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("platform", platform));
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
    private okhttp3.Call openApiV30CgTransferTransferDetailGetGetValidateBeforeCall(Long organizationId, String bizRequestNo, CgTransferTransferDetailGetV30Platform platform, String transferBizRequestNo, String transferSerial, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling openApiV30CgTransferTransferDetailGetGet(Async)");
        }

        // verify the required parameter 'bizRequestNo' is set
        if (bizRequestNo == null) {
            throw new ApiException("Missing the required parameter 'bizRequestNo' when calling openApiV30CgTransferTransferDetailGetGet(Async)");
        }

        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException("Missing the required parameter 'platform' when calling openApiV30CgTransferTransferDetailGetGet(Async)");
        }

        return openApiV30CgTransferTransferDetailGetGetCall(organizationId, bizRequestNo, platform, transferBizRequestNo, transferSerial, _callback);

    }

    /**
     * 
     * 
     * @param organizationId 组织id (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param platform 转账业务线 (required)
     * @param transferBizRequestNo 发起转账的幂等id (optional)
     * @param transferSerial 转账单号，与transfer_biz_request_no两者传其一即可 (optional)
     * @return CgTransferTransferDetailGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CgTransferTransferDetailGetV30Response openApiV30CgTransferTransferDetailGetGet(Long organizationId, String bizRequestNo, CgTransferTransferDetailGetV30Platform platform, String transferBizRequestNo, String transferSerial) throws ApiException {
        ApiResponse<CgTransferTransferDetailGetV30Response> localVarResp = openApiV30CgTransferTransferDetailGetGetWithHttpInfo(organizationId, bizRequestNo, platform, transferBizRequestNo, transferSerial);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param organizationId 组织id (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param platform 转账业务线 (required)
     * @param transferBizRequestNo 发起转账的幂等id (optional)
     * @param transferSerial 转账单号，与transfer_biz_request_no两者传其一即可 (optional)
     * @return ApiResponse&lt;CgTransferTransferDetailGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CgTransferTransferDetailGetV30Response> openApiV30CgTransferTransferDetailGetGetWithHttpInfo(Long organizationId, String bizRequestNo, CgTransferTransferDetailGetV30Platform platform, String transferBizRequestNo, String transferSerial) throws ApiException {
        okhttp3.Call localVarCall = openApiV30CgTransferTransferDetailGetGetValidateBeforeCall(organizationId, bizRequestNo, platform, transferBizRequestNo, transferSerial, null);
        Type localVarReturnType = new TypeToken<CgTransferTransferDetailGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param organizationId 组织id (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param platform 转账业务线 (required)
     * @param transferBizRequestNo 发起转账的幂等id (optional)
     * @param transferSerial 转账单号，与transfer_biz_request_no两者传其一即可 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferTransferDetailGetGetAsync(Long organizationId, String bizRequestNo, CgTransferTransferDetailGetV30Platform platform, String transferBizRequestNo, String transferSerial, final ApiCallback<CgTransferTransferDetailGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30CgTransferTransferDetailGetGetValidateBeforeCall(organizationId, bizRequestNo, platform, transferBizRequestNo, transferSerial, _callback);
        Type localVarReturnType = new TypeToken<CgTransferTransferDetailGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
