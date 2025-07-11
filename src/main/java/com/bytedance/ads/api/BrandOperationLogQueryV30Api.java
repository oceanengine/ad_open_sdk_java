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



import com.bytedance.ads.model.BrandOperationLogQueryV30Fields;
import com.bytedance.ads.model.BrandOperationLogQueryV30ObjectType;
import com.bytedance.ads.model.BrandOperationLogQueryV30Page;
import com.bytedance.ads.model.BrandOperationLogQueryV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandOperationLogQueryV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BrandOperationLogQueryV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public BrandOperationLogQueryV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30BrandOperationLogQueryGet
     * @param advertiserId 广告主ID (required)
     * @param objectId 查询对象ID (required)
     * @param objectType 查询类型 (required)
     * @param fields 查询范围 (optional)
     * @param startDate 开始日期 (optional)
     * @param endDate 结束日期 (optional)
     * @param page 分页 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30BrandOperationLogQueryGetCall(Long advertiserId, Long objectId, BrandOperationLogQueryV30ObjectType objectType, List<BrandOperationLogQueryV30Fields> fields, String startDate, String endDate, BrandOperationLogQueryV30Page page, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/brand/operation_log/query/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (objectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("object_id", objectId));
        }

        if (objectType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("object_type", objectType));
        }

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
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
    private okhttp3.Call openApiV30BrandOperationLogQueryGetValidateBeforeCall(Long advertiserId, Long objectId, BrandOperationLogQueryV30ObjectType objectType, List<BrandOperationLogQueryV30Fields> fields, String startDate, String endDate, BrandOperationLogQueryV30Page page, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30BrandOperationLogQueryGet(Async)");
        }

        // verify the required parameter 'objectId' is set
        if (objectId == null) {
            throw new ApiException("Missing the required parameter 'objectId' when calling openApiV30BrandOperationLogQueryGet(Async)");
        }

        // verify the required parameter 'objectType' is set
        if (objectType == null) {
            throw new ApiException("Missing the required parameter 'objectType' when calling openApiV30BrandOperationLogQueryGet(Async)");
        }

        return openApiV30BrandOperationLogQueryGetCall(advertiserId, objectId, objectType, fields, startDate, endDate, page, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param objectId 查询对象ID (required)
     * @param objectType 查询类型 (required)
     * @param fields 查询范围 (optional)
     * @param startDate 开始日期 (optional)
     * @param endDate 结束日期 (optional)
     * @param page 分页 (optional)
     * @return BrandOperationLogQueryV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public BrandOperationLogQueryV30Response openApiV30BrandOperationLogQueryGet(Long advertiserId, Long objectId, BrandOperationLogQueryV30ObjectType objectType, List<BrandOperationLogQueryV30Fields> fields, String startDate, String endDate, BrandOperationLogQueryV30Page page) throws ApiException {
        ApiResponse<BrandOperationLogQueryV30Response> localVarResp = openApiV30BrandOperationLogQueryGetWithHttpInfo(advertiserId, objectId, objectType, fields, startDate, endDate, page);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param objectId 查询对象ID (required)
     * @param objectType 查询类型 (required)
     * @param fields 查询范围 (optional)
     * @param startDate 开始日期 (optional)
     * @param endDate 结束日期 (optional)
     * @param page 分页 (optional)
     * @return ApiResponse&lt;BrandOperationLogQueryV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BrandOperationLogQueryV30Response> openApiV30BrandOperationLogQueryGetWithHttpInfo(Long advertiserId, Long objectId, BrandOperationLogQueryV30ObjectType objectType, List<BrandOperationLogQueryV30Fields> fields, String startDate, String endDate, BrandOperationLogQueryV30Page page) throws ApiException {
        okhttp3.Call localVarCall = openApiV30BrandOperationLogQueryGetValidateBeforeCall(advertiserId, objectId, objectType, fields, startDate, endDate, page, null);
        Type localVarReturnType = new TypeToken<BrandOperationLogQueryV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param objectId 查询对象ID (required)
     * @param objectType 查询类型 (required)
     * @param fields 查询范围 (optional)
     * @param startDate 开始日期 (optional)
     * @param endDate 结束日期 (optional)
     * @param page 分页 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30BrandOperationLogQueryGetAsync(Long advertiserId, Long objectId, BrandOperationLogQueryV30ObjectType objectType, List<BrandOperationLogQueryV30Fields> fields, String startDate, String endDate, BrandOperationLogQueryV30Page page, final ApiCallback<BrandOperationLogQueryV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30BrandOperationLogQueryGetValidateBeforeCall(advertiserId, objectId, objectType, fields, startDate, endDate, page, _callback);
        Type localVarReturnType = new TypeToken<BrandOperationLogQueryV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
