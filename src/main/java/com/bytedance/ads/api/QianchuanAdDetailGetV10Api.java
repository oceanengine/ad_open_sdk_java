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



import com.bytedance.ads.model.QianchuanAdDetailGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanAdDetailGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanAdDetailGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanAdDetailGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanAdDetailGetGet
     * @param advertiserId  (required)
     * @param adId  (required)
     * @param requestMaterialUrl  (optional, default to false)
     * @param version  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanAdDetailGetGetCall(Long advertiserId, Long adId, Boolean requestMaterialUrl, String version, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/ad/detail/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (adId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_id", adId));
        }

        if (requestMaterialUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("request_material_url", requestMaterialUrl));
        }

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
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
    private okhttp3.Call openApiV10QianchuanAdDetailGetGetValidateBeforeCall(Long advertiserId, Long adId, Boolean requestMaterialUrl, String version, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanAdDetailGetGet(Async)");
        }

        // verify the required parameter 'adId' is set
        if (adId == null) {
            throw new ApiException("Missing the required parameter 'adId' when calling openApiV10QianchuanAdDetailGetGet(Async)");
        }

        return openApiV10QianchuanAdDetailGetGetCall(advertiserId, adId, requestMaterialUrl, version, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param adId  (required)
     * @param requestMaterialUrl  (optional, default to false)
     * @param version  (optional)
     * @return QianchuanAdDetailGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanAdDetailGetV10Response openApiV10QianchuanAdDetailGetGet(Long advertiserId, Long adId, Boolean requestMaterialUrl, String version) throws ApiException {
        ApiResponse<QianchuanAdDetailGetV10Response> localVarResp = openApiV10QianchuanAdDetailGetGetWithHttpInfo(advertiserId, adId, requestMaterialUrl, version);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param adId  (required)
     * @param requestMaterialUrl  (optional, default to false)
     * @param version  (optional)
     * @return ApiResponse&lt;QianchuanAdDetailGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanAdDetailGetV10Response> openApiV10QianchuanAdDetailGetGetWithHttpInfo(Long advertiserId, Long adId, Boolean requestMaterialUrl, String version) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanAdDetailGetGetValidateBeforeCall(advertiserId, adId, requestMaterialUrl, version, null);
        Type localVarReturnType = new TypeToken<QianchuanAdDetailGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param adId  (required)
     * @param requestMaterialUrl  (optional, default to false)
     * @param version  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanAdDetailGetGetAsync(Long advertiserId, Long adId, Boolean requestMaterialUrl, String version, final ApiCallback<QianchuanAdDetailGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanAdDetailGetGetValidateBeforeCall(advertiserId, adId, requestMaterialUrl, version, _callback);
        Type localVarReturnType = new TypeToken<QianchuanAdDetailGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
