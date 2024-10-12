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



import com.bytedance.ads.model.ClueSmartphoneRecordV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClueSmartphoneRecordV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ClueSmartphoneRecordV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ClueSmartphoneRecordV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ClueSmartphoneRecordGet
     * @param advertiserId  (required)
     * @param instanceIds  (optional)
     * @param clueIds  (optional)
     * @param siteIds  (optional)
     * @param adIds  (optional)
     * @param startTime  (optional, default to 1970-01-01)
     * @param endTime  (optional, default to 1970-01-01)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ClueSmartphoneRecordGetCall(Long advertiserId, List<Long> instanceIds, List<Long> clueIds, List<Long> siteIds, List<Long> adIds, String startTime, String endTime, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/clue/smartphone/record/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (instanceIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "instance_ids", instanceIds));
        }

        if (clueIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "clue_ids", clueIds));
        }

        if (siteIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "site_ids", siteIds));
        }

        if (adIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "ad_ids", adIds));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
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
    private okhttp3.Call openApi2ClueSmartphoneRecordGetValidateBeforeCall(Long advertiserId, List<Long> instanceIds, List<Long> clueIds, List<Long> siteIds, List<Long> adIds, String startTime, String endTime, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ClueSmartphoneRecordGet(Async)");
        }

        return openApi2ClueSmartphoneRecordGetCall(advertiserId, instanceIds, clueIds, siteIds, adIds, startTime, endTime, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param instanceIds  (optional)
     * @param clueIds  (optional)
     * @param siteIds  (optional)
     * @param adIds  (optional)
     * @param startTime  (optional, default to 1970-01-01)
     * @param endTime  (optional, default to 1970-01-01)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @return ClueSmartphoneRecordV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ClueSmartphoneRecordV2Response openApi2ClueSmartphoneRecordGet(Long advertiserId, List<Long> instanceIds, List<Long> clueIds, List<Long> siteIds, List<Long> adIds, String startTime, String endTime, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<ClueSmartphoneRecordV2Response> localVarResp = openApi2ClueSmartphoneRecordGetWithHttpInfo(advertiserId, instanceIds, clueIds, siteIds, adIds, startTime, endTime, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param instanceIds  (optional)
     * @param clueIds  (optional)
     * @param siteIds  (optional)
     * @param adIds  (optional)
     * @param startTime  (optional, default to 1970-01-01)
     * @param endTime  (optional, default to 1970-01-01)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @return ApiResponse&lt;ClueSmartphoneRecordV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ClueSmartphoneRecordV2Response> openApi2ClueSmartphoneRecordGetWithHttpInfo(Long advertiserId, List<Long> instanceIds, List<Long> clueIds, List<Long> siteIds, List<Long> adIds, String startTime, String endTime, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2ClueSmartphoneRecordGetValidateBeforeCall(advertiserId, instanceIds, clueIds, siteIds, adIds, startTime, endTime, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ClueSmartphoneRecordV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param instanceIds  (optional)
     * @param clueIds  (optional)
     * @param siteIds  (optional)
     * @param adIds  (optional)
     * @param startTime  (optional, default to 1970-01-01)
     * @param endTime  (optional, default to 1970-01-01)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ClueSmartphoneRecordGetAsync(Long advertiserId, List<Long> instanceIds, List<Long> clueIds, List<Long> siteIds, List<Long> adIds, String startTime, String endTime, Integer page, Integer pageSize, final ApiCallback<ClueSmartphoneRecordV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ClueSmartphoneRecordGetValidateBeforeCall(advertiserId, instanceIds, clueIds, siteIds, adIds, startTime, endTime, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ClueSmartphoneRecordV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
