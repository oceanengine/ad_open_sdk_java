/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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



import java.io.File;
import com.bytedance.ads.model.QianchuanAudienceFilePartUploadV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanAudienceFilePartUploadV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanAudienceFilePartUploadV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanAudienceFilePartUploadV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanAudienceFilePartUploadPost
     * @param advertiserId  (required)
     * @param _file  (required)
     * @param isFinished  (required)
     * @param partNum  (required)
     * @param fileKey  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanAudienceFilePartUploadPostCall(Long advertiserId, File _file, Integer isFinished, Long partNum, String fileKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/audience_file/part_upload/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarFormParams.put("advertiser_id", advertiserId);
        }

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (fileKey != null) {
            localVarFormParams.put("file_key", fileKey);
        }

        if (isFinished != null) {
            localVarFormParams.put("is_finished", isFinished);
        }

        if (partNum != null) {
            localVarFormParams.put("part_num", partNum);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApiV10QianchuanAudienceFilePartUploadPostValidateBeforeCall(Long advertiserId, File _file, Integer isFinished, Long partNum, String fileKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanAudienceFilePartUploadPost(Async)");
        }

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling openApiV10QianchuanAudienceFilePartUploadPost(Async)");
        }

        // verify the required parameter 'isFinished' is set
        if (isFinished == null) {
            throw new ApiException("Missing the required parameter 'isFinished' when calling openApiV10QianchuanAudienceFilePartUploadPost(Async)");
        }

        // verify the required parameter 'partNum' is set
        if (partNum == null) {
            throw new ApiException("Missing the required parameter 'partNum' when calling openApiV10QianchuanAudienceFilePartUploadPost(Async)");
        }

        return openApiV10QianchuanAudienceFilePartUploadPostCall(advertiserId, _file, isFinished, partNum, fileKey, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param _file  (required)
     * @param isFinished  (required)
     * @param partNum  (required)
     * @param fileKey  (optional)
     * @return QianchuanAudienceFilePartUploadV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanAudienceFilePartUploadV10Response openApiV10QianchuanAudienceFilePartUploadPost(Long advertiserId, File _file, Integer isFinished, Long partNum, String fileKey) throws ApiException {
        ApiResponse<QianchuanAudienceFilePartUploadV10Response> localVarResp = openApiV10QianchuanAudienceFilePartUploadPostWithHttpInfo(advertiserId, _file, isFinished, partNum, fileKey);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param _file  (required)
     * @param isFinished  (required)
     * @param partNum  (required)
     * @param fileKey  (optional)
     * @return ApiResponse&lt;QianchuanAudienceFilePartUploadV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanAudienceFilePartUploadV10Response> openApiV10QianchuanAudienceFilePartUploadPostWithHttpInfo(Long advertiserId, File _file, Integer isFinished, Long partNum, String fileKey) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanAudienceFilePartUploadPostValidateBeforeCall(advertiserId, _file, isFinished, partNum, fileKey, null);
        Type localVarReturnType = new TypeToken<QianchuanAudienceFilePartUploadV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param _file  (required)
     * @param isFinished  (required)
     * @param partNum  (required)
     * @param fileKey  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanAudienceFilePartUploadPostAsync(Long advertiserId, File _file, Integer isFinished, Long partNum, String fileKey, final ApiCallback<QianchuanAudienceFilePartUploadV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanAudienceFilePartUploadPostValidateBeforeCall(advertiserId, _file, isFinished, partNum, fileKey, _callback);
        Type localVarReturnType = new TypeToken<QianchuanAudienceFilePartUploadV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
