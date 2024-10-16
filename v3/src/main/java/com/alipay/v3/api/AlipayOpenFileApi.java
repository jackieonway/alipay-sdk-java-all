/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.api;

import com.alipay.v3.ApiCallback;
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.ApiResponse;
import com.alipay.v3.Configuration;
import com.alipay.v3.Pair;
import com.alipay.v3.ProgressRequestBody;
import com.alipay.v3.ProgressResponseBody;
import com.alipay.v3.util.AlipayLogger;
import com.alipay.v3.util.model.CustomizedParams;

import com.google.common.base.Strings;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.alipay.v3.model.AlipayOpenFileUploadDefaultResponse;
import com.alipay.v3.model.AlipayOpenFileUploadModel;
import com.alipay.v3.model.AlipayOpenFileUploadResponseModel;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenFileApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenFileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenFileApi(ApiClient apiClient) {
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
     * Build call for upload
     * @param data  (optional)
     * @param fileContent  (optional)
     * @param _callback Callback for upload/download progress
     * @param customizedParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadCall(AlipayOpenFileUploadModel data, File fileContent, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/file/upload";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (data != null) {
            localVarFormParams.put("data", data);
        }
        //自定义body内容
        if (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent())) {
            localVarFormParams.put("data", customizedParams.getBodyContent());
        }

        if (fileContent != null) {
            localVarFormParams.put("file_content", fileContent);
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

        if (customizedParams != null) {
            //额外query参数
            if (customizedParams.getQueryParams() != null && customizedParams.getQueryParams().size() > 0) {
                for (Map.Entry<String, String> entry : customizedParams.getQueryParams().entrySet()) {
                    localVarQueryParams.addAll(localVarApiClient.parameterToPair(entry.getKey(), entry.getValue()));
                }
            }

            if (!Strings.isNullOrEmpty(customizedParams.getAppAuthToken())) {
                localVarHeaderParams.put("alipay-app-auth-token", customizedParams.getAppAuthToken());
            }

            //额外非全局header参数
            if (customizedParams.getHeaderParams() != null && customizedParams.getHeaderParams().size() > 0) {
                localVarHeaderParams.putAll(customizedParams.getHeaderParams());
            }
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadValidateBeforeCall(AlipayOpenFileUploadModel data, File fileContent, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = uploadCall(data, fileContent, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 支付宝文件上传接口
     * 支付宝通用文件上传接口，支付宝开发者可以调用此接口上传文件，文件可以提供给其他业务使用，例如：上传素材（视频/图片），素材可以供给到生活号+/小程序等其他开放应用后正式发布。 该接口支持使用支付宝SDK和HTTP POST请求，两种方式示例如下： 1. 使用支付宝SDK时，可以直接使用FileItem上传，代码片段参考下文 2. 使用直接使用http协议时，需要忽略file_content参数，文件放入表单中，其余参数放入URL中，其中将参数（不包括文件和file_content）按&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/common/02kf5q#%E8%87%AA%E8%A1%8C%E5%AE%9E%E7%8E%B0%E7%AD%BE%E5%90%8D\&quot;&gt;自行实现签名&lt;/a&gt;文档实现，示例： curl --request POST &#39;http://openapi.alipay.com/gateway.do?charset&#x3D;GBK&amp;biz_content&#x3D;%7B%22biz_code%22%3A%22content_creation%22%2C%22extra_parameters%22%3A%7B%22extern_upload%22%3A%22youku%22%2C%22alipay_user_id%22%3A%22xxxx%22%7D%7D&amp;method&#x3D;alipay.open.file.upload&amp;format&#x3D;json&amp;sign&#x3D;xxx&amp;app_id&#x3D;2014060600164699&amp;version&#x3D;1.0&amp;sign_type&#x3D;RSA2&amp;timestamp&#x3D;xxx&#39;  --form &#39;file&#x3D;@\&quot;xx.mp4\&quot;&#39;
     * @param data  (optional)
     * @param fileContent  (optional)
     * @return AlipayOpenFileUploadResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenFileUploadResponseModel upload(AlipayOpenFileUploadModel data, File fileContent) throws ApiException {
        ApiResponse<AlipayOpenFileUploadResponseModel> localVarResp = uploadWithHttpInfo(data, fileContent, null);
        return localVarResp.getData();
    }

    public AlipayOpenFileUploadResponseModel upload(AlipayOpenFileUploadModel data, File fileContent, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenFileUploadResponseModel> localVarResp = uploadWithHttpInfo(data, fileContent, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 支付宝文件上传接口
     * 支付宝通用文件上传接口，支付宝开发者可以调用此接口上传文件，文件可以提供给其他业务使用，例如：上传素材（视频/图片），素材可以供给到生活号+/小程序等其他开放应用后正式发布。 该接口支持使用支付宝SDK和HTTP POST请求，两种方式示例如下： 1. 使用支付宝SDK时，可以直接使用FileItem上传，代码片段参考下文 2. 使用直接使用http协议时，需要忽略file_content参数，文件放入表单中，其余参数放入URL中，其中将参数（不包括文件和file_content）按&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/common/02kf5q#%E8%87%AA%E8%A1%8C%E5%AE%9E%E7%8E%B0%E7%AD%BE%E5%90%8D\&quot;&gt;自行实现签名&lt;/a&gt;文档实现，示例： curl --request POST &#39;http://openapi.alipay.com/gateway.do?charset&#x3D;GBK&amp;biz_content&#x3D;%7B%22biz_code%22%3A%22content_creation%22%2C%22extra_parameters%22%3A%7B%22extern_upload%22%3A%22youku%22%2C%22alipay_user_id%22%3A%22xxxx%22%7D%7D&amp;method&#x3D;alipay.open.file.upload&amp;format&#x3D;json&amp;sign&#x3D;xxx&amp;app_id&#x3D;2014060600164699&amp;version&#x3D;1.0&amp;sign_type&#x3D;RSA2&amp;timestamp&#x3D;xxx&#39;  --form &#39;file&#x3D;@\&quot;xx.mp4\&quot;&#39;
     * @param data  (optional)
     * @param fileContent  (optional)
     * @return ApiResponse&lt;AlipayOpenFileUploadResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenFileUploadResponseModel> uploadWithHttpInfo(AlipayOpenFileUploadModel data, File fileContent, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = uploadValidateBeforeCall(data, fileContent, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenFileUploadResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenFileUploadDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 支付宝文件上传接口 (asynchronously)
     * 支付宝通用文件上传接口，支付宝开发者可以调用此接口上传文件，文件可以提供给其他业务使用，例如：上传素材（视频/图片），素材可以供给到生活号+/小程序等其他开放应用后正式发布。 该接口支持使用支付宝SDK和HTTP POST请求，两种方式示例如下： 1. 使用支付宝SDK时，可以直接使用FileItem上传，代码片段参考下文 2. 使用直接使用http协议时，需要忽略file_content参数，文件放入表单中，其余参数放入URL中，其中将参数（不包括文件和file_content）按&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/common/02kf5q#%E8%87%AA%E8%A1%8C%E5%AE%9E%E7%8E%B0%E7%AD%BE%E5%90%8D\&quot;&gt;自行实现签名&lt;/a&gt;文档实现，示例： curl --request POST &#39;http://openapi.alipay.com/gateway.do?charset&#x3D;GBK&amp;biz_content&#x3D;%7B%22biz_code%22%3A%22content_creation%22%2C%22extra_parameters%22%3A%7B%22extern_upload%22%3A%22youku%22%2C%22alipay_user_id%22%3A%22xxxx%22%7D%7D&amp;method&#x3D;alipay.open.file.upload&amp;format&#x3D;json&amp;sign&#x3D;xxx&amp;app_id&#x3D;2014060600164699&amp;version&#x3D;1.0&amp;sign_type&#x3D;RSA2&amp;timestamp&#x3D;xxx&#39;  --form &#39;file&#x3D;@\&quot;xx.mp4\&quot;&#39;
     * @param data  (optional)
     * @param fileContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call uploadAsync(AlipayOpenFileUploadModel data, File fileContent, final ApiCallback<AlipayOpenFileUploadResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadValidateBeforeCall(data, fileContent, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenFileUploadResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call uploadAsync(AlipayOpenFileUploadModel data, File fileContent, final ApiCallback<AlipayOpenFileUploadResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = uploadValidateBeforeCall(data, fileContent, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenFileUploadResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
