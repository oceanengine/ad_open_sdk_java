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



import com.bytedance.ads.model.QueryInvoiceElectronicUrlSelfV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryInvoiceElectronicUrlSelfV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QueryInvoiceElectronicUrlSelfV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QueryInvoiceElectronicUrlSelfV2Api(ApiClient apiClient) {
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
     * Build call for openApi2QueryInvoiceElectronicUrlSelfGet
     * @param localAccountId  (required)
     * @param invoiceSerial 开票单编号 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2QueryInvoiceElectronicUrlSelfGetCall(Long localAccountId, String invoiceSerial, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/query/invoice_electronic_url/self/";

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
    private okhttp3.Call openApi2QueryInvoiceElectronicUrlSelfGetValidateBeforeCall(Long localAccountId, String invoiceSerial, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'localAccountId' is set
        if (localAccountId == null) {
            throw new ApiException("Missing the required parameter 'localAccountId' when calling openApi2QueryInvoiceElectronicUrlSelfGet(Async)");
        }

        // verify the required parameter 'invoiceSerial' is set
        if (invoiceSerial == null) {
            throw new ApiException("Missing the required parameter 'invoiceSerial' when calling openApi2QueryInvoiceElectronicUrlSelfGet(Async)");
        }

        return openApi2QueryInvoiceElectronicUrlSelfGetCall(localAccountId, invoiceSerial, _callback);

    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param invoiceSerial 开票单编号 (required)
     * @return QueryInvoiceElectronicUrlSelfV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QueryInvoiceElectronicUrlSelfV2Response openApi2QueryInvoiceElectronicUrlSelfGet(Long localAccountId, String invoiceSerial) throws ApiException {
        ApiResponse<QueryInvoiceElectronicUrlSelfV2Response> localVarResp = openApi2QueryInvoiceElectronicUrlSelfGetWithHttpInfo(localAccountId, invoiceSerial);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param invoiceSerial 开票单编号 (required)
     * @return ApiResponse&lt;QueryInvoiceElectronicUrlSelfV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QueryInvoiceElectronicUrlSelfV2Response> openApi2QueryInvoiceElectronicUrlSelfGetWithHttpInfo(Long localAccountId, String invoiceSerial) throws ApiException {
        okhttp3.Call localVarCall = openApi2QueryInvoiceElectronicUrlSelfGetValidateBeforeCall(localAccountId, invoiceSerial, null);
        Type localVarReturnType = new TypeToken<QueryInvoiceElectronicUrlSelfV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param localAccountId  (required)
     * @param invoiceSerial 开票单编号 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2QueryInvoiceElectronicUrlSelfGetAsync(Long localAccountId, String invoiceSerial, final ApiCallback<QueryInvoiceElectronicUrlSelfV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2QueryInvoiceElectronicUrlSelfGetValidateBeforeCall(localAccountId, invoiceSerial, _callback);
        Type localVarReturnType = new TypeToken<QueryInvoiceElectronicUrlSelfV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
