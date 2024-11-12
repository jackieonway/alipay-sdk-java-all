/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-11-12
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


import com.alipay.v3.model.AlipayOpenAppApiFieldApplyDefaultResponse;
import com.alipay.v3.model.AlipayOpenAppApiFieldApplyModel;
import com.alipay.v3.model.AlipayOpenAppApiFieldQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenAppApiFieldQueryResponseModel;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenAppApiFieldApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenAppApiFieldApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenAppApiFieldApi(ApiClient apiClient) {
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
     * Build call for apply
     * @param data  (optional)
     * @param picture1  (optional)
     * @param picture2  (optional)
     * @param picture3  (optional)
     * @param picture4  (optional)
     * @param picture5  (optional)
     * @param video  (optional)
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
    public okhttp3.Call applyCall(AlipayOpenAppApiFieldApplyModel data, File picture1, File picture2, File picture3, File picture4, File picture5, File video, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/app/api/field/apply";

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

        if (picture1 != null) {
            localVarFormParams.put("picture_1", picture1);
        }

        if (picture2 != null) {
            localVarFormParams.put("picture_2", picture2);
        }

        if (picture3 != null) {
            localVarFormParams.put("picture_3", picture3);
        }

        if (picture4 != null) {
            localVarFormParams.put("picture_4", picture4);
        }

        if (picture5 != null) {
            localVarFormParams.put("picture_5", picture5);
        }

        if (video != null) {
            localVarFormParams.put("video", video);
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
    private okhttp3.Call applyValidateBeforeCall(AlipayOpenAppApiFieldApplyModel data, File picture1, File picture2, File picture3, File picture4, File picture5, File video, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = applyCall(data, picture1, picture2, picture3, picture4, picture5, video, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 申请获取接口用户敏感信息字段
     * 申请获取接口出参中用户敏感信息字段，应用使用视频或图片（至少选择一项上传），单个图片或视频不超过10M，最多可上传5张图片示例。
     * @param data  (optional)
     * @param picture1  (optional)
     * @param picture2  (optional)
     * @param picture3  (optional)
     * @param picture4  (optional)
     * @param picture5  (optional)
     * @param video  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object apply(AlipayOpenAppApiFieldApplyModel data, File picture1, File picture2, File picture3, File picture4, File picture5, File video) throws ApiException {
        ApiResponse<Object> localVarResp = applyWithHttpInfo(data, picture1, picture2, picture3, picture4, picture5, video, null);
        return localVarResp.getData();
    }

    public Object apply(AlipayOpenAppApiFieldApplyModel data, File picture1, File picture2, File picture3, File picture4, File picture5, File video, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = applyWithHttpInfo(data, picture1, picture2, picture3, picture4, picture5, video, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 申请获取接口用户敏感信息字段
     * 申请获取接口出参中用户敏感信息字段，应用使用视频或图片（至少选择一项上传），单个图片或视频不超过10M，最多可上传5张图片示例。
     * @param data  (optional)
     * @param picture1  (optional)
     * @param picture2  (optional)
     * @param picture3  (optional)
     * @param picture4  (optional)
     * @param picture5  (optional)
     * @param video  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> applyWithHttpInfo(AlipayOpenAppApiFieldApplyModel data, File picture1, File picture2, File picture3, File picture4, File picture5, File video, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = applyValidateBeforeCall(data, picture1, picture2, picture3, picture4, picture5, video, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenAppApiFieldApplyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 申请获取接口用户敏感信息字段 (asynchronously)
     * 申请获取接口出参中用户敏感信息字段，应用使用视频或图片（至少选择一项上传），单个图片或视频不超过10M，最多可上传5张图片示例。
     * @param data  (optional)
     * @param picture1  (optional)
     * @param picture2  (optional)
     * @param picture3  (optional)
     * @param picture4  (optional)
     * @param picture5  (optional)
     * @param video  (optional)
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
    public okhttp3.Call applyAsync(AlipayOpenAppApiFieldApplyModel data, File picture1, File picture2, File picture3, File picture4, File picture5, File video, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(data, picture1, picture2, picture3, picture4, picture5, video, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call applyAsync(AlipayOpenAppApiFieldApplyModel data, File picture1, File picture2, File picture3, File picture4, File picture5, File video, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(data, picture1, picture2, picture3, picture4, picture5, video, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
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
    public okhttp3.Call queryCall(final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/app/api/field/query";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryValidateBeforeCall(final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(_callback, customizedParams);
        return localVarCall;

    }

    /**
     * 用户信息申请记录查询
     * 查询用户信息申请记录，开发者发起请求时会基于当前发起请求的app_id进行查询，若为isv发起的三方代调用则以授权的商户app_id进行查询。
     * @return AlipayOpenAppApiFieldQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenAppApiFieldQueryResponseModel query() throws ApiException {
        ApiResponse<AlipayOpenAppApiFieldQueryResponseModel> localVarResp = queryWithHttpInfo(null);
        return localVarResp.getData();
    }

    public AlipayOpenAppApiFieldQueryResponseModel query(CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenAppApiFieldQueryResponseModel> localVarResp = queryWithHttpInfo(customizedParams);
        return localVarResp.getData();
    }

    /**
     * 用户信息申请记录查询
     * 查询用户信息申请记录，开发者发起请求时会基于当前发起请求的app_id进行查询，若为isv发起的三方代调用则以授权的商户app_id进行查询。
     * @return ApiResponse&lt;AlipayOpenAppApiFieldQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenAppApiFieldQueryResponseModel> queryWithHttpInfo(CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenAppApiFieldQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenAppApiFieldQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 用户信息申请记录查询 (asynchronously)
     * 查询用户信息申请记录，开发者发起请求时会基于当前发起请求的app_id进行查询，若为isv发起的三方代调用则以授权的商户app_id进行查询。
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
    public okhttp3.Call queryAsync(final ApiCallback<AlipayOpenAppApiFieldQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(_callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenAppApiFieldQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(final ApiCallback<AlipayOpenAppApiFieldQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(_callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenAppApiFieldQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
