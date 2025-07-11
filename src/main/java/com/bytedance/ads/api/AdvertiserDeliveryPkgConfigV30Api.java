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



import com.bytedance.ads.model.AdvertiserDeliveryPkgConfigV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvertiserDeliveryPkgConfigV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AdvertiserDeliveryPkgConfigV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AdvertiserDeliveryPkgConfigV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30AdvertiserDeliveryPkgConfigGet
     * @param firstIndustryId 一级行业id (required)
     * @param secondIndustryId 二级行业id (required)
     * @param thirdIndustryId 三级行业id (required)
     * @param advertiserId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AdvertiserDeliveryPkgConfigGetCall(Long firstIndustryId, Long secondIndustryId, Long thirdIndustryId, Long advertiserId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/advertiser/delivery_pkg_config/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (firstIndustryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_industry_id", firstIndustryId));
        }

        if (secondIndustryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("second_industry_id", secondIndustryId));
        }

        if (thirdIndustryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("third_industry_id", thirdIndustryId));
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
    private okhttp3.Call openApiV30AdvertiserDeliveryPkgConfigGetValidateBeforeCall(Long firstIndustryId, Long secondIndustryId, Long thirdIndustryId, Long advertiserId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'firstIndustryId' is set
        if (firstIndustryId == null) {
            throw new ApiException("Missing the required parameter 'firstIndustryId' when calling openApiV30AdvertiserDeliveryPkgConfigGet(Async)");
        }

        // verify the required parameter 'secondIndustryId' is set
        if (secondIndustryId == null) {
            throw new ApiException("Missing the required parameter 'secondIndustryId' when calling openApiV30AdvertiserDeliveryPkgConfigGet(Async)");
        }

        // verify the required parameter 'thirdIndustryId' is set
        if (thirdIndustryId == null) {
            throw new ApiException("Missing the required parameter 'thirdIndustryId' when calling openApiV30AdvertiserDeliveryPkgConfigGet(Async)");
        }

        return openApiV30AdvertiserDeliveryPkgConfigGetCall(firstIndustryId, secondIndustryId, thirdIndustryId, advertiserId, _callback);

    }

    /**
     * 
     * 
     * @param firstIndustryId 一级行业id (required)
     * @param secondIndustryId 二级行业id (required)
     * @param thirdIndustryId 三级行业id (required)
     * @param advertiserId  (optional)
     * @return AdvertiserDeliveryPkgConfigV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AdvertiserDeliveryPkgConfigV30Response openApiV30AdvertiserDeliveryPkgConfigGet(Long firstIndustryId, Long secondIndustryId, Long thirdIndustryId, Long advertiserId) throws ApiException {
        ApiResponse<AdvertiserDeliveryPkgConfigV30Response> localVarResp = openApiV30AdvertiserDeliveryPkgConfigGetWithHttpInfo(firstIndustryId, secondIndustryId, thirdIndustryId, advertiserId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param firstIndustryId 一级行业id (required)
     * @param secondIndustryId 二级行业id (required)
     * @param thirdIndustryId 三级行业id (required)
     * @param advertiserId  (optional)
     * @return ApiResponse&lt;AdvertiserDeliveryPkgConfigV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AdvertiserDeliveryPkgConfigV30Response> openApiV30AdvertiserDeliveryPkgConfigGetWithHttpInfo(Long firstIndustryId, Long secondIndustryId, Long thirdIndustryId, Long advertiserId) throws ApiException {
        okhttp3.Call localVarCall = openApiV30AdvertiserDeliveryPkgConfigGetValidateBeforeCall(firstIndustryId, secondIndustryId, thirdIndustryId, advertiserId, null);
        Type localVarReturnType = new TypeToken<AdvertiserDeliveryPkgConfigV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param firstIndustryId 一级行业id (required)
     * @param secondIndustryId 二级行业id (required)
     * @param thirdIndustryId 三级行业id (required)
     * @param advertiserId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AdvertiserDeliveryPkgConfigGetAsync(Long firstIndustryId, Long secondIndustryId, Long thirdIndustryId, Long advertiserId, final ApiCallback<AdvertiserDeliveryPkgConfigV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30AdvertiserDeliveryPkgConfigGetValidateBeforeCall(firstIndustryId, secondIndustryId, thirdIndustryId, advertiserId, _callback);
        Type localVarReturnType = new TypeToken<AdvertiserDeliveryPkgConfigV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
