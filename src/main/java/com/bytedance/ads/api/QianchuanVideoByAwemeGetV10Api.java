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



import com.bytedance.ads.model.QianchuanVideoByAwemeGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanVideoByAwemeGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanVideoByAwemeGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanVideoByAwemeGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanVideoByAwemeGetGet
     * @param advertiserId 千川广告主ID (required)
     * @param awemeId 抖音号id (required)
     * @param awemeItemUrl 抖音主页视频url (optional)
     * @param awemeItemId 抖音主页视频id (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanVideoByAwemeGetGetCall(Long advertiserId, Long awemeId, String awemeItemUrl, Long awemeItemId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/video/by_aweme/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (awemeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_id", awemeId));
        }

        if (awemeItemUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_item_url", awemeItemUrl));
        }

        if (awemeItemId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_item_id", awemeItemId));
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
    private okhttp3.Call openApiV10QianchuanVideoByAwemeGetGetValidateBeforeCall(Long advertiserId, Long awemeId, String awemeItemUrl, Long awemeItemId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanVideoByAwemeGetGet(Async)");
        }

        // verify the required parameter 'awemeId' is set
        if (awemeId == null) {
            throw new ApiException("Missing the required parameter 'awemeId' when calling openApiV10QianchuanVideoByAwemeGetGet(Async)");
        }

        return openApiV10QianchuanVideoByAwemeGetGetCall(advertiserId, awemeId, awemeItemUrl, awemeItemId, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 千川广告主ID (required)
     * @param awemeId 抖音号id (required)
     * @param awemeItemUrl 抖音主页视频url (optional)
     * @param awemeItemId 抖音主页视频id (optional)
     * @return QianchuanVideoByAwemeGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanVideoByAwemeGetV10Response openApiV10QianchuanVideoByAwemeGetGet(Long advertiserId, Long awemeId, String awemeItemUrl, Long awemeItemId) throws ApiException {
        ApiResponse<QianchuanVideoByAwemeGetV10Response> localVarResp = openApiV10QianchuanVideoByAwemeGetGetWithHttpInfo(advertiserId, awemeId, awemeItemUrl, awemeItemId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 千川广告主ID (required)
     * @param awemeId 抖音号id (required)
     * @param awemeItemUrl 抖音主页视频url (optional)
     * @param awemeItemId 抖音主页视频id (optional)
     * @return ApiResponse&lt;QianchuanVideoByAwemeGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanVideoByAwemeGetV10Response> openApiV10QianchuanVideoByAwemeGetGetWithHttpInfo(Long advertiserId, Long awemeId, String awemeItemUrl, Long awemeItemId) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanVideoByAwemeGetGetValidateBeforeCall(advertiserId, awemeId, awemeItemUrl, awemeItemId, null);
        Type localVarReturnType = new TypeToken<QianchuanVideoByAwemeGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 千川广告主ID (required)
     * @param awemeId 抖音号id (required)
     * @param awemeItemUrl 抖音主页视频url (optional)
     * @param awemeItemId 抖音主页视频id (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanVideoByAwemeGetGetAsync(Long advertiserId, Long awemeId, String awemeItemUrl, Long awemeItemId, final ApiCallback<QianchuanVideoByAwemeGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanVideoByAwemeGetGetValidateBeforeCall(advertiserId, awemeId, awemeItemUrl, awemeItemId, _callback);
        Type localVarReturnType = new TypeToken<QianchuanVideoByAwemeGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
