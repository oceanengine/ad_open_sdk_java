/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
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



import com.bytedance.ads.model.QueryInvoiceSelfV2DifferenceInvoice;
import com.bytedance.ads.model.QueryInvoiceSelfV2InvoiceType;
import com.bytedance.ads.model.QueryInvoiceSelfV2Platform;
import com.bytedance.ads.model.QueryInvoiceSelfV2Response;
import com.bytedance.ads.model.QueryInvoiceSelfV2RevertStatusList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryInvoiceSelfV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QueryInvoiceSelfV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QueryInvoiceSelfV2Api(ApiClient apiClient) {
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
     * Build call for openApi2QueryInvoiceSelfGet
     * @param localAccountId  (required)
     * @param pageSize 每页数量 最多100 (required)
     * @param page 页码 (required)
     * @param statementSerials 结算单编号 (optional)
     * @param projectSerials 项目编号 (optional)
     * @param invoiceStatuses 开票状态 CANCELLED(0, \&quot;已作废\&quot;),NO_INVOICED(1, \&quot;未开票\&quot;),PART_INVOICED(2, \&quot;部分开票\&quot;),INVOICED(3, \&quot;已开票\&quot;),NO_NEED_INVOICE(4, \&quot;无需开票\&quot;); (optional)
     * @param invoiceSerialList 开票单编号 (optional)
     * @param contractSerial 合同编号 (optional)
     * @param submitStartTime 提交审批时间范围开始时间，格式：%Y-%m-%d %H:%M:%S (optional)
     * @param submitEndTime 提交审批时间范围结束时间，格式：%Y-%m-%d %H:%M:%S (optional)
     * @param invoiceStartDate 实际开票时间范围开始时间，格式：%Y-%m-%d (optional)
     * @param invoiceEndDate 实际开票时间范围结束时间，格式：%Y-%m-%d (optional)
     * @param invoiceType 发票类型 (optional)
     * @param differenceInvoice 是否差额开票 (optional)
     * @param revertStatusList 红冲状态 (optional)
     * @param platform 开票平台 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2QueryInvoiceSelfGetCall(Long localAccountId, Long pageSize, Long page, List<String> statementSerials, List<String> projectSerials, List<Long> invoiceStatuses, List<String> invoiceSerialList, String contractSerial, String submitStartTime, String submitEndTime, String invoiceStartDate, String invoiceEndDate, QueryInvoiceSelfV2InvoiceType invoiceType, QueryInvoiceSelfV2DifferenceInvoice differenceInvoice, List<QueryInvoiceSelfV2RevertStatusList> revertStatusList, QueryInvoiceSelfV2Platform platform, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/query/invoice/self/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (localAccountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("local_account_id", localAccountId));
        }

        if (statementSerials != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "statement_serials", statementSerials));
        }

        if (projectSerials != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "project_serials", projectSerials));
        }

        if (invoiceStatuses != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "invoice_statuses", invoiceStatuses));
        }

        if (invoiceSerialList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "invoice_serial_list", invoiceSerialList));
        }

        if (contractSerial != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("contract_serial", contractSerial));
        }

        if (submitStartTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("submit_start_time", submitStartTime));
        }

        if (submitEndTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("submit_end_time", submitEndTime));
        }

        if (invoiceStartDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_start_date", invoiceStartDate));
        }

        if (invoiceEndDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_end_date", invoiceEndDate));
        }

        if (invoiceType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_type", invoiceType));
        }

        if (differenceInvoice != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("difference_invoice", differenceInvoice));
        }

        if (revertStatusList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "revert_status_list", revertStatusList));
        }

        if (platform != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("platform", platform));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
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
    private okhttp3.Call openApi2QueryInvoiceSelfGetValidateBeforeCall(Long localAccountId, Long pageSize, Long page, List<String> statementSerials, List<String> projectSerials, List<Long> invoiceStatuses, List<String> invoiceSerialList, String contractSerial, String submitStartTime, String submitEndTime, String invoiceStartDate, String invoiceEndDate, QueryInvoiceSelfV2InvoiceType invoiceType, QueryInvoiceSelfV2DifferenceInvoice differenceInvoice, List<QueryInvoiceSelfV2RevertStatusList> revertStatusList, QueryInvoiceSelfV2Platform platform, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'localAccountId' is set
        if (localAccountId == null) {
            throw new ApiException("Missing the required parameter 'localAccountId' when calling openApi2QueryInvoiceSelfGet(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling openApi2QueryInvoiceSelfGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApi2QueryInvoiceSelfGet(Async)");
        }

        return openApi2QueryInvoiceSelfGetCall(localAccountId, pageSize, page, statementSerials, projectSerials, invoiceStatuses, invoiceSerialList, contractSerial, submitStartTime, submitEndTime, invoiceStartDate, invoiceEndDate, invoiceType, differenceInvoice, revertStatusList, platform, _callback);

    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param pageSize 每页数量 最多100 (required)
     * @param page 页码 (required)
     * @param statementSerials 结算单编号 (optional)
     * @param projectSerials 项目编号 (optional)
     * @param invoiceStatuses 开票状态 CANCELLED(0, \&quot;已作废\&quot;),NO_INVOICED(1, \&quot;未开票\&quot;),PART_INVOICED(2, \&quot;部分开票\&quot;),INVOICED(3, \&quot;已开票\&quot;),NO_NEED_INVOICE(4, \&quot;无需开票\&quot;); (optional)
     * @param invoiceSerialList 开票单编号 (optional)
     * @param contractSerial 合同编号 (optional)
     * @param submitStartTime 提交审批时间范围开始时间，格式：%Y-%m-%d %H:%M:%S (optional)
     * @param submitEndTime 提交审批时间范围结束时间，格式：%Y-%m-%d %H:%M:%S (optional)
     * @param invoiceStartDate 实际开票时间范围开始时间，格式：%Y-%m-%d (optional)
     * @param invoiceEndDate 实际开票时间范围结束时间，格式：%Y-%m-%d (optional)
     * @param invoiceType 发票类型 (optional)
     * @param differenceInvoice 是否差额开票 (optional)
     * @param revertStatusList 红冲状态 (optional)
     * @param platform 开票平台 (optional)
     * @return QueryInvoiceSelfV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QueryInvoiceSelfV2Response openApi2QueryInvoiceSelfGet(Long localAccountId, Long pageSize, Long page, List<String> statementSerials, List<String> projectSerials, List<Long> invoiceStatuses, List<String> invoiceSerialList, String contractSerial, String submitStartTime, String submitEndTime, String invoiceStartDate, String invoiceEndDate, QueryInvoiceSelfV2InvoiceType invoiceType, QueryInvoiceSelfV2DifferenceInvoice differenceInvoice, List<QueryInvoiceSelfV2RevertStatusList> revertStatusList, QueryInvoiceSelfV2Platform platform) throws ApiException {
        ApiResponse<QueryInvoiceSelfV2Response> localVarResp = openApi2QueryInvoiceSelfGetWithHttpInfo(localAccountId, pageSize, page, statementSerials, projectSerials, invoiceStatuses, invoiceSerialList, contractSerial, submitStartTime, submitEndTime, invoiceStartDate, invoiceEndDate, invoiceType, differenceInvoice, revertStatusList, platform);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param pageSize 每页数量 最多100 (required)
     * @param page 页码 (required)
     * @param statementSerials 结算单编号 (optional)
     * @param projectSerials 项目编号 (optional)
     * @param invoiceStatuses 开票状态 CANCELLED(0, \&quot;已作废\&quot;),NO_INVOICED(1, \&quot;未开票\&quot;),PART_INVOICED(2, \&quot;部分开票\&quot;),INVOICED(3, \&quot;已开票\&quot;),NO_NEED_INVOICE(4, \&quot;无需开票\&quot;); (optional)
     * @param invoiceSerialList 开票单编号 (optional)
     * @param contractSerial 合同编号 (optional)
     * @param submitStartTime 提交审批时间范围开始时间，格式：%Y-%m-%d %H:%M:%S (optional)
     * @param submitEndTime 提交审批时间范围结束时间，格式：%Y-%m-%d %H:%M:%S (optional)
     * @param invoiceStartDate 实际开票时间范围开始时间，格式：%Y-%m-%d (optional)
     * @param invoiceEndDate 实际开票时间范围结束时间，格式：%Y-%m-%d (optional)
     * @param invoiceType 发票类型 (optional)
     * @param differenceInvoice 是否差额开票 (optional)
     * @param revertStatusList 红冲状态 (optional)
     * @param platform 开票平台 (optional)
     * @return ApiResponse&lt;QueryInvoiceSelfV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QueryInvoiceSelfV2Response> openApi2QueryInvoiceSelfGetWithHttpInfo(Long localAccountId, Long pageSize, Long page, List<String> statementSerials, List<String> projectSerials, List<Long> invoiceStatuses, List<String> invoiceSerialList, String contractSerial, String submitStartTime, String submitEndTime, String invoiceStartDate, String invoiceEndDate, QueryInvoiceSelfV2InvoiceType invoiceType, QueryInvoiceSelfV2DifferenceInvoice differenceInvoice, List<QueryInvoiceSelfV2RevertStatusList> revertStatusList, QueryInvoiceSelfV2Platform platform) throws ApiException {
        okhttp3.Call localVarCall = openApi2QueryInvoiceSelfGetValidateBeforeCall(localAccountId, pageSize, page, statementSerials, projectSerials, invoiceStatuses, invoiceSerialList, contractSerial, submitStartTime, submitEndTime, invoiceStartDate, invoiceEndDate, invoiceType, differenceInvoice, revertStatusList, platform, null);
        Type localVarReturnType = new TypeToken<QueryInvoiceSelfV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param localAccountId  (required)
     * @param pageSize 每页数量 最多100 (required)
     * @param page 页码 (required)
     * @param statementSerials 结算单编号 (optional)
     * @param projectSerials 项目编号 (optional)
     * @param invoiceStatuses 开票状态 CANCELLED(0, \&quot;已作废\&quot;),NO_INVOICED(1, \&quot;未开票\&quot;),PART_INVOICED(2, \&quot;部分开票\&quot;),INVOICED(3, \&quot;已开票\&quot;),NO_NEED_INVOICE(4, \&quot;无需开票\&quot;); (optional)
     * @param invoiceSerialList 开票单编号 (optional)
     * @param contractSerial 合同编号 (optional)
     * @param submitStartTime 提交审批时间范围开始时间，格式：%Y-%m-%d %H:%M:%S (optional)
     * @param submitEndTime 提交审批时间范围结束时间，格式：%Y-%m-%d %H:%M:%S (optional)
     * @param invoiceStartDate 实际开票时间范围开始时间，格式：%Y-%m-%d (optional)
     * @param invoiceEndDate 实际开票时间范围结束时间，格式：%Y-%m-%d (optional)
     * @param invoiceType 发票类型 (optional)
     * @param differenceInvoice 是否差额开票 (optional)
     * @param revertStatusList 红冲状态 (optional)
     * @param platform 开票平台 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2QueryInvoiceSelfGetAsync(Long localAccountId, Long pageSize, Long page, List<String> statementSerials, List<String> projectSerials, List<Long> invoiceStatuses, List<String> invoiceSerialList, String contractSerial, String submitStartTime, String submitEndTime, String invoiceStartDate, String invoiceEndDate, QueryInvoiceSelfV2InvoiceType invoiceType, QueryInvoiceSelfV2DifferenceInvoice differenceInvoice, List<QueryInvoiceSelfV2RevertStatusList> revertStatusList, QueryInvoiceSelfV2Platform platform, final ApiCallback<QueryInvoiceSelfV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2QueryInvoiceSelfGetValidateBeforeCall(localAccountId, pageSize, page, statementSerials, projectSerials, invoiceStatuses, invoiceSerialList, contractSerial, submitStartTime, submitEndTime, invoiceStartDate, invoiceEndDate, invoiceType, differenceInvoice, revertStatusList, platform, _callback);
        Type localVarReturnType = new TypeToken<QueryInvoiceSelfV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}