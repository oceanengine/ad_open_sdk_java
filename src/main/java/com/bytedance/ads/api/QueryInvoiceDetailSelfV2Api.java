/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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



import com.bytedance.ads.model.QueryInvoiceDetailSelfV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryInvoiceDetailSelfV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QueryInvoiceDetailSelfV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QueryInvoiceDetailSelfV2Api(ApiClient apiClient) {
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
     * Build call for openApi2QueryInvoiceDetailSelfGet
     * @param localAccountId  (required)
     * @param invoiceSerial 开票单编号 (optional)
     * @param invoiceId 开票单ID (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2QueryInvoiceDetailSelfGetCall(Long localAccountId, String invoiceSerial, Long invoiceId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/query/invoice_detail/self/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (localAccountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("local_account_id", localAccountId));
        }

        if (invoiceSerial != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_serial", invoiceSerial));
        }

        if (invoiceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_id", invoiceId));
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
    private okhttp3.Call openApi2QueryInvoiceDetailSelfGetValidateBeforeCall(Long localAccountId, String invoiceSerial, Long invoiceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'localAccountId' is set
        if (localAccountId == null) {
            throw new ApiException("Missing the required parameter 'localAccountId' when calling openApi2QueryInvoiceDetailSelfGet(Async)");
        }

        return openApi2QueryInvoiceDetailSelfGetCall(localAccountId, invoiceSerial, invoiceId, _callback);

    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param invoiceSerial 开票单编号 (optional)
     * @param invoiceId 开票单ID (optional)
     * @return QueryInvoiceDetailSelfV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QueryInvoiceDetailSelfV2Response openApi2QueryInvoiceDetailSelfGet(Long localAccountId, String invoiceSerial, Long invoiceId) throws ApiException {
        ApiResponse<QueryInvoiceDetailSelfV2Response> localVarResp = openApi2QueryInvoiceDetailSelfGetWithHttpInfo(localAccountId, invoiceSerial, invoiceId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param invoiceSerial 开票单编号 (optional)
     * @param invoiceId 开票单ID (optional)
     * @return ApiResponse&lt;QueryInvoiceDetailSelfV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QueryInvoiceDetailSelfV2Response> openApi2QueryInvoiceDetailSelfGetWithHttpInfo(Long localAccountId, String invoiceSerial, Long invoiceId) throws ApiException {
        okhttp3.Call localVarCall = openApi2QueryInvoiceDetailSelfGetValidateBeforeCall(localAccountId, invoiceSerial, invoiceId, null);
        Type localVarReturnType = new TypeToken<QueryInvoiceDetailSelfV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param localAccountId  (required)
     * @param invoiceSerial 开票单编号 (optional)
     * @param invoiceId 开票单ID (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2QueryInvoiceDetailSelfGetAsync(Long localAccountId, String invoiceSerial, Long invoiceId, final ApiCallback<QueryInvoiceDetailSelfV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2QueryInvoiceDetailSelfGetValidateBeforeCall(localAccountId, invoiceSerial, invoiceId, _callback);
        Type localVarReturnType = new TypeToken<QueryInvoiceDetailSelfV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
