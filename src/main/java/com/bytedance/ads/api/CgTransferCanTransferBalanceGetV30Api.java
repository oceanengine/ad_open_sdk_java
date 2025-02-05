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



import com.bytedance.ads.model.CgTransferCanTransferBalanceGetV30Platform;
import com.bytedance.ads.model.CgTransferCanTransferBalanceGetV30Response;
import com.bytedance.ads.model.CgTransferCanTransferBalanceGetV30TransferDirection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CgTransferCanTransferBalanceGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CgTransferCanTransferBalanceGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public CgTransferCanTransferBalanceGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30CgTransferCanTransferBalanceGetGet
     * @param organizationId 组织id (required)
     * @param bizRequestNo 请求id (required)
     * @param opponentTargetId 锚定账户id，1:N的1 (required)
     * @param targetIdList 目标账户id列表，1:N的N，最多支持100个 (required)
     * @param transferDirection 转账方向，以目标账户视角确定 (required)
     * @param platform 转账业务线 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferCanTransferBalanceGetGetCall(Long organizationId, String bizRequestNo, Long opponentTargetId, List<Long> targetIdList, CgTransferCanTransferBalanceGetV30TransferDirection transferDirection, CgTransferCanTransferBalanceGetV30Platform platform, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/cg_transfer/can_transfer_balance/get/";

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

        if (opponentTargetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("opponent_target_id", opponentTargetId));
        }

        if (targetIdList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "target_id_list", targetIdList));
        }

        if (transferDirection != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transfer_direction", transferDirection));
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
    private okhttp3.Call openApiV30CgTransferCanTransferBalanceGetGetValidateBeforeCall(Long organizationId, String bizRequestNo, Long opponentTargetId, List<Long> targetIdList, CgTransferCanTransferBalanceGetV30TransferDirection transferDirection, CgTransferCanTransferBalanceGetV30Platform platform, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling openApiV30CgTransferCanTransferBalanceGetGet(Async)");
        }

        // verify the required parameter 'bizRequestNo' is set
        if (bizRequestNo == null) {
            throw new ApiException("Missing the required parameter 'bizRequestNo' when calling openApiV30CgTransferCanTransferBalanceGetGet(Async)");
        }

        // verify the required parameter 'opponentTargetId' is set
        if (opponentTargetId == null) {
            throw new ApiException("Missing the required parameter 'opponentTargetId' when calling openApiV30CgTransferCanTransferBalanceGetGet(Async)");
        }

        // verify the required parameter 'targetIdList' is set
        if (targetIdList == null) {
            throw new ApiException("Missing the required parameter 'targetIdList' when calling openApiV30CgTransferCanTransferBalanceGetGet(Async)");
        }

        // verify the required parameter 'transferDirection' is set
        if (transferDirection == null) {
            throw new ApiException("Missing the required parameter 'transferDirection' when calling openApiV30CgTransferCanTransferBalanceGetGet(Async)");
        }

        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException("Missing the required parameter 'platform' when calling openApiV30CgTransferCanTransferBalanceGetGet(Async)");
        }

        return openApiV30CgTransferCanTransferBalanceGetGetCall(organizationId, bizRequestNo, opponentTargetId, targetIdList, transferDirection, platform, _callback);

    }

    /**
     * 
     * 
     * @param organizationId 组织id (required)
     * @param bizRequestNo 请求id (required)
     * @param opponentTargetId 锚定账户id，1:N的1 (required)
     * @param targetIdList 目标账户id列表，1:N的N，最多支持100个 (required)
     * @param transferDirection 转账方向，以目标账户视角确定 (required)
     * @param platform 转账业务线 (required)
     * @return CgTransferCanTransferBalanceGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CgTransferCanTransferBalanceGetV30Response openApiV30CgTransferCanTransferBalanceGetGet(Long organizationId, String bizRequestNo, Long opponentTargetId, List<Long> targetIdList, CgTransferCanTransferBalanceGetV30TransferDirection transferDirection, CgTransferCanTransferBalanceGetV30Platform platform) throws ApiException {
        ApiResponse<CgTransferCanTransferBalanceGetV30Response> localVarResp = openApiV30CgTransferCanTransferBalanceGetGetWithHttpInfo(organizationId, bizRequestNo, opponentTargetId, targetIdList, transferDirection, platform);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param organizationId 组织id (required)
     * @param bizRequestNo 请求id (required)
     * @param opponentTargetId 锚定账户id，1:N的1 (required)
     * @param targetIdList 目标账户id列表，1:N的N，最多支持100个 (required)
     * @param transferDirection 转账方向，以目标账户视角确定 (required)
     * @param platform 转账业务线 (required)
     * @return ApiResponse&lt;CgTransferCanTransferBalanceGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CgTransferCanTransferBalanceGetV30Response> openApiV30CgTransferCanTransferBalanceGetGetWithHttpInfo(Long organizationId, String bizRequestNo, Long opponentTargetId, List<Long> targetIdList, CgTransferCanTransferBalanceGetV30TransferDirection transferDirection, CgTransferCanTransferBalanceGetV30Platform platform) throws ApiException {
        okhttp3.Call localVarCall = openApiV30CgTransferCanTransferBalanceGetGetValidateBeforeCall(organizationId, bizRequestNo, opponentTargetId, targetIdList, transferDirection, platform, null);
        Type localVarReturnType = new TypeToken<CgTransferCanTransferBalanceGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param organizationId 组织id (required)
     * @param bizRequestNo 请求id (required)
     * @param opponentTargetId 锚定账户id，1:N的1 (required)
     * @param targetIdList 目标账户id列表，1:N的N，最多支持100个 (required)
     * @param transferDirection 转账方向，以目标账户视角确定 (required)
     * @param platform 转账业务线 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferCanTransferBalanceGetGetAsync(Long organizationId, String bizRequestNo, Long opponentTargetId, List<Long> targetIdList, CgTransferCanTransferBalanceGetV30TransferDirection transferDirection, CgTransferCanTransferBalanceGetV30Platform platform, final ApiCallback<CgTransferCanTransferBalanceGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30CgTransferCanTransferBalanceGetGetValidateBeforeCall(organizationId, bizRequestNo, opponentTargetId, targetIdList, transferDirection, platform, _callback);
        Type localVarReturnType = new TypeToken<CgTransferCanTransferBalanceGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
