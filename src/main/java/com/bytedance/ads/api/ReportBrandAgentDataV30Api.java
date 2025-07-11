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



import com.bytedance.ads.model.ReportBrandAgentDataV30DataReportType;
import com.bytedance.ads.model.ReportBrandAgentDataV30Filter;
import com.bytedance.ads.model.ReportBrandAgentDataV30Page;
import com.bytedance.ads.model.ReportBrandAgentDataV30PageType;
import com.bytedance.ads.model.ReportBrandAgentDataV30Response;
import com.bytedance.ads.model.ReportBrandAgentDataV30TimeDimension;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportBrandAgentDataV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportBrandAgentDataV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportBrandAgentDataV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ReportBrandAgentDataGet
     * @param advertiserId  (required)
     * @param dataReportType  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param timeDimension 按时间维度拆分 (optional)
     * @param pageType  (optional)
     * @param filter  (optional)
     * @param metrics  (optional)
     * @param page  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportBrandAgentDataGetCall(Long advertiserId, ReportBrandAgentDataV30DataReportType dataReportType, String startTime, String endTime, ReportBrandAgentDataV30TimeDimension timeDimension, ReportBrandAgentDataV30PageType pageType, ReportBrandAgentDataV30Filter filter, List<String> metrics, ReportBrandAgentDataV30Page page, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/report/brand/agent/data/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (dataReportType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("data_report_type", dataReportType));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (timeDimension != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_dimension", timeDimension));
        }

        if (pageType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_type", pageType));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (metrics != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "metrics", metrics));
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
    private okhttp3.Call openApiV30ReportBrandAgentDataGetValidateBeforeCall(Long advertiserId, ReportBrandAgentDataV30DataReportType dataReportType, String startTime, String endTime, ReportBrandAgentDataV30TimeDimension timeDimension, ReportBrandAgentDataV30PageType pageType, ReportBrandAgentDataV30Filter filter, List<String> metrics, ReportBrandAgentDataV30Page page, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ReportBrandAgentDataGet(Async)");
        }

        // verify the required parameter 'dataReportType' is set
        if (dataReportType == null) {
            throw new ApiException("Missing the required parameter 'dataReportType' when calling openApiV30ReportBrandAgentDataGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApiV30ReportBrandAgentDataGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApiV30ReportBrandAgentDataGet(Async)");
        }

        return openApiV30ReportBrandAgentDataGetCall(advertiserId, dataReportType, startTime, endTime, timeDimension, pageType, filter, metrics, page, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param dataReportType  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param timeDimension 按时间维度拆分 (optional)
     * @param pageType  (optional)
     * @param filter  (optional)
     * @param metrics  (optional)
     * @param page  (optional)
     * @return ReportBrandAgentDataV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportBrandAgentDataV30Response openApiV30ReportBrandAgentDataGet(Long advertiserId, ReportBrandAgentDataV30DataReportType dataReportType, String startTime, String endTime, ReportBrandAgentDataV30TimeDimension timeDimension, ReportBrandAgentDataV30PageType pageType, ReportBrandAgentDataV30Filter filter, List<String> metrics, ReportBrandAgentDataV30Page page) throws ApiException {
        ApiResponse<ReportBrandAgentDataV30Response> localVarResp = openApiV30ReportBrandAgentDataGetWithHttpInfo(advertiserId, dataReportType, startTime, endTime, timeDimension, pageType, filter, metrics, page);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param dataReportType  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param timeDimension 按时间维度拆分 (optional)
     * @param pageType  (optional)
     * @param filter  (optional)
     * @param metrics  (optional)
     * @param page  (optional)
     * @return ApiResponse&lt;ReportBrandAgentDataV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportBrandAgentDataV30Response> openApiV30ReportBrandAgentDataGetWithHttpInfo(Long advertiserId, ReportBrandAgentDataV30DataReportType dataReportType, String startTime, String endTime, ReportBrandAgentDataV30TimeDimension timeDimension, ReportBrandAgentDataV30PageType pageType, ReportBrandAgentDataV30Filter filter, List<String> metrics, ReportBrandAgentDataV30Page page) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ReportBrandAgentDataGetValidateBeforeCall(advertiserId, dataReportType, startTime, endTime, timeDimension, pageType, filter, metrics, page, null);
        Type localVarReturnType = new TypeToken<ReportBrandAgentDataV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param dataReportType  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param timeDimension 按时间维度拆分 (optional)
     * @param pageType  (optional)
     * @param filter  (optional)
     * @param metrics  (optional)
     * @param page  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportBrandAgentDataGetAsync(Long advertiserId, ReportBrandAgentDataV30DataReportType dataReportType, String startTime, String endTime, ReportBrandAgentDataV30TimeDimension timeDimension, ReportBrandAgentDataV30PageType pageType, ReportBrandAgentDataV30Filter filter, List<String> metrics, ReportBrandAgentDataV30Page page, final ApiCallback<ReportBrandAgentDataV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ReportBrandAgentDataGetValidateBeforeCall(advertiserId, dataReportType, startTime, endTime, timeDimension, pageType, filter, metrics, page, _callback);
        Type localVarReturnType = new TypeToken<ReportBrandAgentDataV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
