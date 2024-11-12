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


import com.alipay.v3.model.AlipayOpenSearchAppkeywordApplyDefaultResponse;
import com.alipay.v3.model.AlipayOpenSearchAppkeywordApplyModel;
import com.alipay.v3.model.AlipayOpenSearchAppkeywordApplyResponseModel;
import com.alipay.v3.model.AlipayOpenSearchAppkeywordBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenSearchAppkeywordBatchqueryResponseModel;
import com.alipay.v3.model.AlipayOpenSearchAppkeywordDeleteDefaultResponse;
import com.alipay.v3.model.AlipayOpenSearchAppkeywordDeleteModel;
import com.alipay.v3.model.AlipayOpenSearchAppkeywordQuerystatusDefaultResponse;
import com.alipay.v3.model.AlipayOpenSearchAppkeywordQuerystatusResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenSearchAppkeywordApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenSearchAppkeywordApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenSearchAppkeywordApi(ApiClient apiClient) {
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
     * @param alipayOpenSearchAppkeywordApplyModel  (optional)
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
    public okhttp3.Call applyCall(AlipayOpenSearchAppkeywordApplyModel alipayOpenSearchAppkeywordApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayOpenSearchAppkeywordApplyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/search/appkeyword/apply";

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
    private okhttp3.Call applyValidateBeforeCall(AlipayOpenSearchAppkeywordApplyModel alipayOpenSearchAppkeywordApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = applyCall(alipayOpenSearchAppkeywordApplyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 提报搜索关键词
     * 提报搜索关键词
     * @param alipayOpenSearchAppkeywordApplyModel  (optional)
     * @return AlipayOpenSearchAppkeywordApplyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenSearchAppkeywordApplyResponseModel apply(AlipayOpenSearchAppkeywordApplyModel alipayOpenSearchAppkeywordApplyModel) throws ApiException {
        ApiResponse<AlipayOpenSearchAppkeywordApplyResponseModel> localVarResp = applyWithHttpInfo(alipayOpenSearchAppkeywordApplyModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenSearchAppkeywordApplyResponseModel apply(AlipayOpenSearchAppkeywordApplyModel alipayOpenSearchAppkeywordApplyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenSearchAppkeywordApplyResponseModel> localVarResp = applyWithHttpInfo(alipayOpenSearchAppkeywordApplyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 提报搜索关键词
     * 提报搜索关键词
     * @param alipayOpenSearchAppkeywordApplyModel  (optional)
     * @return ApiResponse&lt;AlipayOpenSearchAppkeywordApplyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenSearchAppkeywordApplyResponseModel> applyWithHttpInfo(AlipayOpenSearchAppkeywordApplyModel alipayOpenSearchAppkeywordApplyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayOpenSearchAppkeywordApplyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenSearchAppkeywordApplyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenSearchAppkeywordApplyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 提报搜索关键词 (asynchronously)
     * 提报搜索关键词
     * @param alipayOpenSearchAppkeywordApplyModel  (optional)
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
    public okhttp3.Call applyAsync(AlipayOpenSearchAppkeywordApplyModel alipayOpenSearchAppkeywordApplyModel, final ApiCallback<AlipayOpenSearchAppkeywordApplyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayOpenSearchAppkeywordApplyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchAppkeywordApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call applyAsync(AlipayOpenSearchAppkeywordApplyModel alipayOpenSearchAppkeywordApplyModel, final ApiCallback<AlipayOpenSearchAppkeywordApplyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayOpenSearchAppkeywordApplyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchAppkeywordApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for batchquery
     * @param targetAppid 小程序id (optional)
     * @param status 关键词的状态，枚举值，不传该字段表示查询所有状态 (optional)
     * @param pageNumber 当前页 (optional)
     * @param pageSize 每页显示条数 (optional)
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
    public okhttp3.Call batchqueryCall(String targetAppid, String status, Integer pageNumber, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/search/appkeyword/batchquery";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetAppid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_appid", targetAppid));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (pageNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_number", pageNumber));
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
    private okhttp3.Call batchqueryValidateBeforeCall(String targetAppid, String status, Integer pageNumber, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(targetAppid, status, pageNumber, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询小程序已配置关键词
     * 查询小程序已配置关键词
     * @param targetAppid 小程序id (optional)
     * @param status 关键词的状态，枚举值，不传该字段表示查询所有状态 (optional)
     * @param pageNumber 当前页 (optional)
     * @param pageSize 每页显示条数 (optional)
     * @return AlipayOpenSearchAppkeywordBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenSearchAppkeywordBatchqueryResponseModel batchquery(String targetAppid, String status, Integer pageNumber, Integer pageSize) throws ApiException {
        ApiResponse<AlipayOpenSearchAppkeywordBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(targetAppid, status, pageNumber, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayOpenSearchAppkeywordBatchqueryResponseModel batchquery(String targetAppid, String status, Integer pageNumber, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenSearchAppkeywordBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(targetAppid, status, pageNumber, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询小程序已配置关键词
     * 查询小程序已配置关键词
     * @param targetAppid 小程序id (optional)
     * @param status 关键词的状态，枚举值，不传该字段表示查询所有状态 (optional)
     * @param pageNumber 当前页 (optional)
     * @param pageSize 每页显示条数 (optional)
     * @return ApiResponse&lt;AlipayOpenSearchAppkeywordBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenSearchAppkeywordBatchqueryResponseModel> batchqueryWithHttpInfo(String targetAppid, String status, Integer pageNumber, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(targetAppid, status, pageNumber, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenSearchAppkeywordBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenSearchAppkeywordBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询小程序已配置关键词 (asynchronously)
     * 查询小程序已配置关键词
     * @param targetAppid 小程序id (optional)
     * @param status 关键词的状态，枚举值，不传该字段表示查询所有状态 (optional)
     * @param pageNumber 当前页 (optional)
     * @param pageSize 每页显示条数 (optional)
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
    public okhttp3.Call batchqueryAsync(String targetAppid, String status, Integer pageNumber, Integer pageSize, final ApiCallback<AlipayOpenSearchAppkeywordBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(targetAppid, status, pageNumber, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchAppkeywordBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call batchqueryAsync(String targetAppid, String status, Integer pageNumber, Integer pageSize, final ApiCallback<AlipayOpenSearchAppkeywordBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(targetAppid, status, pageNumber, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchAppkeywordBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param alipayOpenSearchAppkeywordDeleteModel  (optional)
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
    public okhttp3.Call deleteCall(AlipayOpenSearchAppkeywordDeleteModel alipayOpenSearchAppkeywordDeleteModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayOpenSearchAppkeywordDeleteModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/search/appkeyword/delete";

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
    private okhttp3.Call deleteValidateBeforeCall(AlipayOpenSearchAppkeywordDeleteModel alipayOpenSearchAppkeywordDeleteModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = deleteCall(alipayOpenSearchAppkeywordDeleteModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 删除搜索关键词
     * 删除搜索关键词
     * @param alipayOpenSearchAppkeywordDeleteModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object delete(AlipayOpenSearchAppkeywordDeleteModel alipayOpenSearchAppkeywordDeleteModel) throws ApiException {
        ApiResponse<Object> localVarResp = deleteWithHttpInfo(alipayOpenSearchAppkeywordDeleteModel, null);
        return localVarResp.getData();
    }

    public Object delete(AlipayOpenSearchAppkeywordDeleteModel alipayOpenSearchAppkeywordDeleteModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = deleteWithHttpInfo(alipayOpenSearchAppkeywordDeleteModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 删除搜索关键词
     * 删除搜索关键词
     * @param alipayOpenSearchAppkeywordDeleteModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> deleteWithHttpInfo(AlipayOpenSearchAppkeywordDeleteModel alipayOpenSearchAppkeywordDeleteModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayOpenSearchAppkeywordDeleteModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenSearchAppkeywordDeleteDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 删除搜索关键词 (asynchronously)
     * 删除搜索关键词
     * @param alipayOpenSearchAppkeywordDeleteModel  (optional)
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
    public okhttp3.Call deleteAsync(AlipayOpenSearchAppkeywordDeleteModel alipayOpenSearchAppkeywordDeleteModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayOpenSearchAppkeywordDeleteModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call deleteAsync(AlipayOpenSearchAppkeywordDeleteModel alipayOpenSearchAppkeywordDeleteModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayOpenSearchAppkeywordDeleteModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for querystatus
     * @param targetAppid 小程序id (optional)
     * @param applyNo 审核工单id，提报接口的返回值 (optional)
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
    public okhttp3.Call querystatusCall(String targetAppid, String applyNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/search/appkeyword/querystatus";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetAppid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_appid", targetAppid));
        }

        if (applyNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("apply_no", applyNo));
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
    private okhttp3.Call querystatusValidateBeforeCall(String targetAppid, String applyNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = querystatusCall(targetAppid, applyNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询小程序搜索关键词的审核工单的状态
     * 查询小程序搜索关键词的审核工单的状态
     * @param targetAppid 小程序id (optional)
     * @param applyNo 审核工单id，提报接口的返回值 (optional)
     * @return AlipayOpenSearchAppkeywordQuerystatusResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenSearchAppkeywordQuerystatusResponseModel querystatus(String targetAppid, String applyNo) throws ApiException {
        ApiResponse<AlipayOpenSearchAppkeywordQuerystatusResponseModel> localVarResp = querystatusWithHttpInfo(targetAppid, applyNo, null);
        return localVarResp.getData();
    }

    public AlipayOpenSearchAppkeywordQuerystatusResponseModel querystatus(String targetAppid, String applyNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenSearchAppkeywordQuerystatusResponseModel> localVarResp = querystatusWithHttpInfo(targetAppid, applyNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询小程序搜索关键词的审核工单的状态
     * 查询小程序搜索关键词的审核工单的状态
     * @param targetAppid 小程序id (optional)
     * @param applyNo 审核工单id，提报接口的返回值 (optional)
     * @return ApiResponse&lt;AlipayOpenSearchAppkeywordQuerystatusResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenSearchAppkeywordQuerystatusResponseModel> querystatusWithHttpInfo(String targetAppid, String applyNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = querystatusValidateBeforeCall(targetAppid, applyNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenSearchAppkeywordQuerystatusResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenSearchAppkeywordQuerystatusDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询小程序搜索关键词的审核工单的状态 (asynchronously)
     * 查询小程序搜索关键词的审核工单的状态
     * @param targetAppid 小程序id (optional)
     * @param applyNo 审核工单id，提报接口的返回值 (optional)
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
    public okhttp3.Call querystatusAsync(String targetAppid, String applyNo, final ApiCallback<AlipayOpenSearchAppkeywordQuerystatusResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = querystatusValidateBeforeCall(targetAppid, applyNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchAppkeywordQuerystatusResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call querystatusAsync(String targetAppid, String applyNo, final ApiCallback<AlipayOpenSearchAppkeywordQuerystatusResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = querystatusValidateBeforeCall(targetAppid, applyNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenSearchAppkeywordQuerystatusResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
