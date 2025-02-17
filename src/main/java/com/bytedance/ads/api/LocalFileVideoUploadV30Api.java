/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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



import com.bytedance.ads.model.LocalFileVideoUploadV30RequestVideoFile;
import com.bytedance.ads.model.LocalFileVideoUploadV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalFileVideoUploadV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LocalFileVideoUploadV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public LocalFileVideoUploadV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30LocalFileVideoUploadPost
     * @param filename 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符 (required)
     * @param localAccountId  (required)
     * @param videoFile  (required)
     * @param videoSignature 视频的md5值(用于服务端校验) (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalFileVideoUploadPostCall(String filename, Long localAccountId, LocalFileVideoUploadV30RequestVideoFile videoFile, String videoSignature, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/local/file/video/upload/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filename != null) {
            localVarFormParams.put("filename", filename);
        }

        if (localAccountId != null) {
            localVarFormParams.put("local_account_id", localAccountId);
        }

        if (videoFile != null) {
            localVarFormParams.put("video_file", videoFile);
        }

        if (videoSignature != null) {
            localVarFormParams.put("video_signature", videoSignature);
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
    private okhttp3.Call openApiV30LocalFileVideoUploadPostValidateBeforeCall(String filename, Long localAccountId, LocalFileVideoUploadV30RequestVideoFile videoFile, String videoSignature, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'filename' is set
        if (filename == null) {
            throw new ApiException("Missing the required parameter 'filename' when calling openApiV30LocalFileVideoUploadPost(Async)");
        }

        // verify the required parameter 'localAccountId' is set
        if (localAccountId == null) {
            throw new ApiException("Missing the required parameter 'localAccountId' when calling openApiV30LocalFileVideoUploadPost(Async)");
        }

        // verify the required parameter 'videoFile' is set
        if (videoFile == null) {
            throw new ApiException("Missing the required parameter 'videoFile' when calling openApiV30LocalFileVideoUploadPost(Async)");
        }

        // verify the required parameter 'videoSignature' is set
        if (videoSignature == null) {
            throw new ApiException("Missing the required parameter 'videoSignature' when calling openApiV30LocalFileVideoUploadPost(Async)");
        }

        return openApiV30LocalFileVideoUploadPostCall(filename, localAccountId, videoFile, videoSignature, _callback);

    }

    /**
     * 
     * 
     * @param filename 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符 (required)
     * @param localAccountId  (required)
     * @param videoFile  (required)
     * @param videoSignature 视频的md5值(用于服务端校验) (required)
     * @return LocalFileVideoUploadV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public LocalFileVideoUploadV30Response openApiV30LocalFileVideoUploadPost(String filename, Long localAccountId, LocalFileVideoUploadV30RequestVideoFile videoFile, String videoSignature) throws ApiException {
        ApiResponse<LocalFileVideoUploadV30Response> localVarResp = openApiV30LocalFileVideoUploadPostWithHttpInfo(filename, localAccountId, videoFile, videoSignature);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param filename 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符 (required)
     * @param localAccountId  (required)
     * @param videoFile  (required)
     * @param videoSignature 视频的md5值(用于服务端校验) (required)
     * @return ApiResponse&lt;LocalFileVideoUploadV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LocalFileVideoUploadV30Response> openApiV30LocalFileVideoUploadPostWithHttpInfo(String filename, Long localAccountId, LocalFileVideoUploadV30RequestVideoFile videoFile, String videoSignature) throws ApiException {
        okhttp3.Call localVarCall = openApiV30LocalFileVideoUploadPostValidateBeforeCall(filename, localAccountId, videoFile, videoSignature, null);
        Type localVarReturnType = new TypeToken<LocalFileVideoUploadV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param filename 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符 (required)
     * @param localAccountId  (required)
     * @param videoFile  (required)
     * @param videoSignature 视频的md5值(用于服务端校验) (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalFileVideoUploadPostAsync(String filename, Long localAccountId, LocalFileVideoUploadV30RequestVideoFile videoFile, String videoSignature, final ApiCallback<LocalFileVideoUploadV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30LocalFileVideoUploadPostValidateBeforeCall(filename, localAccountId, videoFile, videoSignature, _callback);
        Type localVarReturnType = new TypeToken<LocalFileVideoUploadV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
