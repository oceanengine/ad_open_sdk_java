/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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



import com.bytedance.ads.model.StarOrderReplyAuthorCancelV2Request;
import com.bytedance.ads.model.StarOrderReplyAuthorCancelV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarOrderReplyAuthorCancelV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarOrderReplyAuthorCancelV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarOrderReplyAuthorCancelV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarOrderReplyAuthorCancelPost
     * @param starOrderReplyAuthorCancelV2Request  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarOrderReplyAuthorCancelPostCall(StarOrderReplyAuthorCancelV2Request starOrderReplyAuthorCancelV2Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = starOrderReplyAuthorCancelV2Request;

        // create path and map variables
        String localVarPath = "/open_api/2/star/order/reply_author_cancel/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2StarOrderReplyAuthorCancelPostValidateBeforeCall(StarOrderReplyAuthorCancelV2Request starOrderReplyAuthorCancelV2Request, final ApiCallback _callback) throws ApiException {
        return openApi2StarOrderReplyAuthorCancelPostCall(starOrderReplyAuthorCancelV2Request, _callback);

    }

    /**
     * 
     * 
     * @param starOrderReplyAuthorCancelV2Request  (optional)
     * @return StarOrderReplyAuthorCancelV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarOrderReplyAuthorCancelV2Response openApi2StarOrderReplyAuthorCancelPost(StarOrderReplyAuthorCancelV2Request starOrderReplyAuthorCancelV2Request) throws ApiException {
        ApiResponse<StarOrderReplyAuthorCancelV2Response> localVarResp = openApi2StarOrderReplyAuthorCancelPostWithHttpInfo(starOrderReplyAuthorCancelV2Request);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starOrderReplyAuthorCancelV2Request  (optional)
     * @return ApiResponse&lt;StarOrderReplyAuthorCancelV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarOrderReplyAuthorCancelV2Response> openApi2StarOrderReplyAuthorCancelPostWithHttpInfo(StarOrderReplyAuthorCancelV2Request starOrderReplyAuthorCancelV2Request) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarOrderReplyAuthorCancelPostValidateBeforeCall(starOrderReplyAuthorCancelV2Request, null);
        Type localVarReturnType = new TypeToken<StarOrderReplyAuthorCancelV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starOrderReplyAuthorCancelV2Request  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarOrderReplyAuthorCancelPostAsync(StarOrderReplyAuthorCancelV2Request starOrderReplyAuthorCancelV2Request, final ApiCallback<StarOrderReplyAuthorCancelV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarOrderReplyAuthorCancelPostValidateBeforeCall(starOrderReplyAuthorCancelV2Request, _callback);
        Type localVarReturnType = new TypeToken<StarOrderReplyAuthorCancelV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
