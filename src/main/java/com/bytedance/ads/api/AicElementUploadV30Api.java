/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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



import com.bytedance.ads.model.AicElementUploadV30AccountType;
import com.bytedance.ads.model.AicElementUploadV30ElementType;
import com.bytedance.ads.model.AicElementUploadV30Response;
import com.bytedance.ads.model.AicElementUploadV30UseAs;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AicElementUploadV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AicElementUploadV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AicElementUploadV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30AicElementUploadPost
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType  (required)
     * @param elementType  (required)
     * @param elementName 元素名称，支持中英文、数字、特殊字符，默认剔除html标签，字数限制：50 (optional)
     * @param _file 上传二进制数据，如果在相同的路径下有相同的视频即为更新， 视频数据：支持mp4、mpeg、mov，单视频时长不超过10min，大小＜500M, 图片数据：jpg、jpeg、png、webp、bmp，大小&lt;150MB 字体数据：ttf格式，大小&lt;150MB 音乐数据：mp3、wav、flac、aac，大小&lt;150MB,时长不超过5min (optional)
     * @param pathName 元素存储的文件夹路径，确保输入路径存在 示例：/数码/电脑 层级：2，最大层级限制：10，默认根目录 (optional, default to /)
     * @param useAs  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AicElementUploadPostCall(Long accountId, AicElementUploadV30AccountType accountType, AicElementUploadV30ElementType elementType, String elementName, File _file, String pathName, AicElementUploadV30UseAs useAs, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/aic/element/upload/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarFormParams.put("account_id", accountId);
        }

        if (accountType != null) {
            localVarFormParams.put("account_type", accountType);
        }

        if (elementName != null) {
            localVarFormParams.put("element_name", elementName);
        }

        if (elementType != null) {
            localVarFormParams.put("element_type", elementType);
        }

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (pathName != null) {
            localVarFormParams.put("path_name", pathName);
        }

        if (useAs != null) {
            localVarFormParams.put("use_as", useAs);
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
    private okhttp3.Call openApiV30AicElementUploadPostValidateBeforeCall(Long accountId, AicElementUploadV30AccountType accountType, AicElementUploadV30ElementType elementType, String elementName, File _file, String pathName, AicElementUploadV30UseAs useAs, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30AicElementUploadPost(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApiV30AicElementUploadPost(Async)");
        }

        // verify the required parameter 'elementType' is set
        if (elementType == null) {
            throw new ApiException("Missing the required parameter 'elementType' when calling openApiV30AicElementUploadPost(Async)");
        }

        return openApiV30AicElementUploadPostCall(accountId, accountType, elementType, elementName, _file, pathName, useAs, _callback);

    }

    /**
     * 
     * 
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType  (required)
     * @param elementType  (required)
     * @param elementName 元素名称，支持中英文、数字、特殊字符，默认剔除html标签，字数限制：50 (optional)
     * @param _file 上传二进制数据，如果在相同的路径下有相同的视频即为更新， 视频数据：支持mp4、mpeg、mov，单视频时长不超过10min，大小＜500M, 图片数据：jpg、jpeg、png、webp、bmp，大小&lt;150MB 字体数据：ttf格式，大小&lt;150MB 音乐数据：mp3、wav、flac、aac，大小&lt;150MB,时长不超过5min (optional)
     * @param pathName 元素存储的文件夹路径，确保输入路径存在 示例：/数码/电脑 层级：2，最大层级限制：10，默认根目录 (optional, default to /)
     * @param useAs  (optional)
     * @return AicElementUploadV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AicElementUploadV30Response openApiV30AicElementUploadPost(Long accountId, AicElementUploadV30AccountType accountType, AicElementUploadV30ElementType elementType, String elementName, File _file, String pathName, AicElementUploadV30UseAs useAs) throws ApiException {
        ApiResponse<AicElementUploadV30Response> localVarResp = openApiV30AicElementUploadPostWithHttpInfo(accountId, accountType, elementType, elementName, _file, pathName, useAs);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType  (required)
     * @param elementType  (required)
     * @param elementName 元素名称，支持中英文、数字、特殊字符，默认剔除html标签，字数限制：50 (optional)
     * @param _file 上传二进制数据，如果在相同的路径下有相同的视频即为更新， 视频数据：支持mp4、mpeg、mov，单视频时长不超过10min，大小＜500M, 图片数据：jpg、jpeg、png、webp、bmp，大小&lt;150MB 字体数据：ttf格式，大小&lt;150MB 音乐数据：mp3、wav、flac、aac，大小&lt;150MB,时长不超过5min (optional)
     * @param pathName 元素存储的文件夹路径，确保输入路径存在 示例：/数码/电脑 层级：2，最大层级限制：10，默认根目录 (optional, default to /)
     * @param useAs  (optional)
     * @return ApiResponse&lt;AicElementUploadV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AicElementUploadV30Response> openApiV30AicElementUploadPostWithHttpInfo(Long accountId, AicElementUploadV30AccountType accountType, AicElementUploadV30ElementType elementType, String elementName, File _file, String pathName, AicElementUploadV30UseAs useAs) throws ApiException {
        okhttp3.Call localVarCall = openApiV30AicElementUploadPostValidateBeforeCall(accountId, accountType, elementType, elementName, _file, pathName, useAs, null);
        Type localVarReturnType = new TypeToken<AicElementUploadV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType  (required)
     * @param elementType  (required)
     * @param elementName 元素名称，支持中英文、数字、特殊字符，默认剔除html标签，字数限制：50 (optional)
     * @param _file 上传二进制数据，如果在相同的路径下有相同的视频即为更新， 视频数据：支持mp4、mpeg、mov，单视频时长不超过10min，大小＜500M, 图片数据：jpg、jpeg、png、webp、bmp，大小&lt;150MB 字体数据：ttf格式，大小&lt;150MB 音乐数据：mp3、wav、flac、aac，大小&lt;150MB,时长不超过5min (optional)
     * @param pathName 元素存储的文件夹路径，确保输入路径存在 示例：/数码/电脑 层级：2，最大层级限制：10，默认根目录 (optional, default to /)
     * @param useAs  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AicElementUploadPostAsync(Long accountId, AicElementUploadV30AccountType accountType, AicElementUploadV30ElementType elementType, String elementName, File _file, String pathName, AicElementUploadV30UseAs useAs, final ApiCallback<AicElementUploadV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30AicElementUploadPostValidateBeforeCall(accountId, accountType, elementType, elementName, _file, pathName, useAs, _callback);
        Type localVarReturnType = new TypeToken<AicElementUploadV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
