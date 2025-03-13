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



import com.bytedance.ads.model.ToolsCommentGetV30Filtering;
import com.bytedance.ads.model.ToolsCommentGetV30OrderField;
import com.bytedance.ads.model.ToolsCommentGetV30OrderType;
import com.bytedance.ads.model.ToolsCommentGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsCommentGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsCommentGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsCommentGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ToolsCommentGetGet
     * @param advertiserId 广告主id (required)
     * @param startTime 查询起始时间，格式：yyyy-MM-dd，时间跨度最大三个月，仅支持获取2021-01-01之后的评论 (required)
     * @param endTime 查询截止时间，格式：yyyy-MM-dd，时间跨度最大三个月，仅支持获取2021-01-01之后的评论 (required)
     * @param orderField 排序字段 允许值： REPLY_COUNT 按评论回复数量排序 LIKE_COUNT   按点赞数量排序 CREATE_TIME 按评论时间排序（默认值） (optional)
     * @param orderType 排序类型 允许值： ASC 升序 DESC 降序（默认值） (optional)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param page 页码 默认值: 1 (optional, default to 1)
     * @param pageSize 页面大小 默认值: 10 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsCommentGetGetCall(Long advertiserId, String startTime, String endTime, ToolsCommentGetV30OrderField orderField, ToolsCommentGetV30OrderType orderType, ToolsCommentGetV30Filtering filtering, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/tools/comment/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (orderField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_field", orderField));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
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
    private okhttp3.Call openApiV30ToolsCommentGetGetValidateBeforeCall(Long advertiserId, String startTime, String endTime, ToolsCommentGetV30OrderField orderField, ToolsCommentGetV30OrderType orderType, ToolsCommentGetV30Filtering filtering, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ToolsCommentGetGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApiV30ToolsCommentGetGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApiV30ToolsCommentGetGet(Async)");
        }

        return openApiV30ToolsCommentGetGetCall(advertiserId, startTime, endTime, orderField, orderType, filtering, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param startTime 查询起始时间，格式：yyyy-MM-dd，时间跨度最大三个月，仅支持获取2021-01-01之后的评论 (required)
     * @param endTime 查询截止时间，格式：yyyy-MM-dd，时间跨度最大三个月，仅支持获取2021-01-01之后的评论 (required)
     * @param orderField 排序字段 允许值： REPLY_COUNT 按评论回复数量排序 LIKE_COUNT   按点赞数量排序 CREATE_TIME 按评论时间排序（默认值） (optional)
     * @param orderType 排序类型 允许值： ASC 升序 DESC 降序（默认值） (optional)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param page 页码 默认值: 1 (optional, default to 1)
     * @param pageSize 页面大小 默认值: 10 (optional, default to 10)
     * @return ToolsCommentGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsCommentGetV30Response openApiV30ToolsCommentGetGet(Long advertiserId, String startTime, String endTime, ToolsCommentGetV30OrderField orderField, ToolsCommentGetV30OrderType orderType, ToolsCommentGetV30Filtering filtering, Long page, Long pageSize) throws ApiException {
        ApiResponse<ToolsCommentGetV30Response> localVarResp = openApiV30ToolsCommentGetGetWithHttpInfo(advertiserId, startTime, endTime, orderField, orderType, filtering, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param startTime 查询起始时间，格式：yyyy-MM-dd，时间跨度最大三个月，仅支持获取2021-01-01之后的评论 (required)
     * @param endTime 查询截止时间，格式：yyyy-MM-dd，时间跨度最大三个月，仅支持获取2021-01-01之后的评论 (required)
     * @param orderField 排序字段 允许值： REPLY_COUNT 按评论回复数量排序 LIKE_COUNT   按点赞数量排序 CREATE_TIME 按评论时间排序（默认值） (optional)
     * @param orderType 排序类型 允许值： ASC 升序 DESC 降序（默认值） (optional)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param page 页码 默认值: 1 (optional, default to 1)
     * @param pageSize 页面大小 默认值: 10 (optional, default to 10)
     * @return ApiResponse&lt;ToolsCommentGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsCommentGetV30Response> openApiV30ToolsCommentGetGetWithHttpInfo(Long advertiserId, String startTime, String endTime, ToolsCommentGetV30OrderField orderField, ToolsCommentGetV30OrderType orderType, ToolsCommentGetV30Filtering filtering, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ToolsCommentGetGetValidateBeforeCall(advertiserId, startTime, endTime, orderField, orderType, filtering, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ToolsCommentGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主id (required)
     * @param startTime 查询起始时间，格式：yyyy-MM-dd，时间跨度最大三个月，仅支持获取2021-01-01之后的评论 (required)
     * @param endTime 查询截止时间，格式：yyyy-MM-dd，时间跨度最大三个月，仅支持获取2021-01-01之后的评论 (required)
     * @param orderField 排序字段 允许值： REPLY_COUNT 按评论回复数量排序 LIKE_COUNT   按点赞数量排序 CREATE_TIME 按评论时间排序（默认值） (optional)
     * @param orderType 排序类型 允许值： ASC 升序 DESC 降序（默认值） (optional)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param page 页码 默认值: 1 (optional, default to 1)
     * @param pageSize 页面大小 默认值: 10 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsCommentGetGetAsync(Long advertiserId, String startTime, String endTime, ToolsCommentGetV30OrderField orderField, ToolsCommentGetV30OrderType orderType, ToolsCommentGetV30Filtering filtering, Long page, Long pageSize, final ApiCallback<ToolsCommentGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ToolsCommentGetGetValidateBeforeCall(advertiserId, startTime, endTime, orderField, orderType, filtering, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ToolsCommentGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
