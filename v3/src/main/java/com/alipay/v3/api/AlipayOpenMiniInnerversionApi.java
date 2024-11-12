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


import com.alipay.v3.model.AlipayOpenMiniInnerversionOnlineDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniInnerversionOnlineModel;
import com.alipay.v3.model.AlipayOpenMiniInnerversionSyncDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniInnerversionSyncModel;
import com.alipay.v3.model.AlipayOpenMiniInnerversionUpgradeDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniInnerversionUpgradeModel;
import com.alipay.v3.model.AlipayOpenMiniInnerversionUploadDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniInnerversionUploadModel;
import com.alipay.v3.model.AlipayOpenMiniInnerversionUploadResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenMiniInnerversionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenMiniInnerversionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenMiniInnerversionApi(ApiClient apiClient) {
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
     * Build call for online
     * @param alipayOpenMiniInnerversionOnlineModel  (optional)
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
    public okhttp3.Call onlineCall(AlipayOpenMiniInnerversionOnlineModel alipayOpenMiniInnerversionOnlineModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniInnerversionOnlineModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/innerversion/online";

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
    private okhttp3.Call onlineValidateBeforeCall(AlipayOpenMiniInnerversionOnlineModel alipayOpenMiniInnerversionOnlineModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = onlineCall(alipayOpenMiniInnerversionOnlineModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 内部小程序-上架
     * 内部小程序上架接口
     * @param alipayOpenMiniInnerversionOnlineModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object online(AlipayOpenMiniInnerversionOnlineModel alipayOpenMiniInnerversionOnlineModel) throws ApiException {
        ApiResponse<Object> localVarResp = onlineWithHttpInfo(alipayOpenMiniInnerversionOnlineModel, null);
        return localVarResp.getData();
    }

    public Object online(AlipayOpenMiniInnerversionOnlineModel alipayOpenMiniInnerversionOnlineModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = onlineWithHttpInfo(alipayOpenMiniInnerversionOnlineModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 内部小程序-上架
     * 内部小程序上架接口
     * @param alipayOpenMiniInnerversionOnlineModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> onlineWithHttpInfo(AlipayOpenMiniInnerversionOnlineModel alipayOpenMiniInnerversionOnlineModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = onlineValidateBeforeCall(alipayOpenMiniInnerversionOnlineModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniInnerversionOnlineDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 内部小程序-上架 (asynchronously)
     * 内部小程序上架接口
     * @param alipayOpenMiniInnerversionOnlineModel  (optional)
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
    public okhttp3.Call onlineAsync(AlipayOpenMiniInnerversionOnlineModel alipayOpenMiniInnerversionOnlineModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = onlineValidateBeforeCall(alipayOpenMiniInnerversionOnlineModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call onlineAsync(AlipayOpenMiniInnerversionOnlineModel alipayOpenMiniInnerversionOnlineModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = onlineValidateBeforeCall(alipayOpenMiniInnerversionOnlineModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sync
     * @param alipayOpenMiniInnerversionSyncModel  (optional)
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
    public okhttp3.Call syncCall(AlipayOpenMiniInnerversionSyncModel alipayOpenMiniInnerversionSyncModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniInnerversionSyncModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/innerversion/sync";

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
    private okhttp3.Call syncValidateBeforeCall(AlipayOpenMiniInnerversionSyncModel alipayOpenMiniInnerversionSyncModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = syncCall(alipayOpenMiniInnerversionSyncModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小程序包信息推送
     * 小程序上架、回滚，因拉包机制，用户无法及时生效，拉到原版本的用户，过期才会失效，该接口能力可以推送新版本到用户
     * @param alipayOpenMiniInnerversionSyncModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object sync(AlipayOpenMiniInnerversionSyncModel alipayOpenMiniInnerversionSyncModel) throws ApiException {
        ApiResponse<Object> localVarResp = syncWithHttpInfo(alipayOpenMiniInnerversionSyncModel, null);
        return localVarResp.getData();
    }

    public Object sync(AlipayOpenMiniInnerversionSyncModel alipayOpenMiniInnerversionSyncModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = syncWithHttpInfo(alipayOpenMiniInnerversionSyncModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小程序包信息推送
     * 小程序上架、回滚，因拉包机制，用户无法及时生效，拉到原版本的用户，过期才会失效，该接口能力可以推送新版本到用户
     * @param alipayOpenMiniInnerversionSyncModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> syncWithHttpInfo(AlipayOpenMiniInnerversionSyncModel alipayOpenMiniInnerversionSyncModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = syncValidateBeforeCall(alipayOpenMiniInnerversionSyncModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniInnerversionSyncDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小程序包信息推送 (asynchronously)
     * 小程序上架、回滚，因拉包机制，用户无法及时生效，拉到原版本的用户，过期才会失效，该接口能力可以推送新版本到用户
     * @param alipayOpenMiniInnerversionSyncModel  (optional)
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
    public okhttp3.Call syncAsync(AlipayOpenMiniInnerversionSyncModel alipayOpenMiniInnerversionSyncModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = syncValidateBeforeCall(alipayOpenMiniInnerversionSyncModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call syncAsync(AlipayOpenMiniInnerversionSyncModel alipayOpenMiniInnerversionSyncModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = syncValidateBeforeCall(alipayOpenMiniInnerversionSyncModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upgrade
     * @param alipayOpenMiniInnerversionUpgradeModel  (optional)
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
    public okhttp3.Call upgradeCall(AlipayOpenMiniInnerversionUpgradeModel alipayOpenMiniInnerversionUpgradeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniInnerversionUpgradeModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/innerversion/upgrade";

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
    private okhttp3.Call upgradeValidateBeforeCall(AlipayOpenMiniInnerversionUpgradeModel alipayOpenMiniInnerversionUpgradeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = upgradeCall(alipayOpenMiniInnerversionUpgradeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 升级模板实例化小程序
     * 升级基于模板实例化的小程序，升级后不需要重新提交审核；同步接口。
     * @param alipayOpenMiniInnerversionUpgradeModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object upgrade(AlipayOpenMiniInnerversionUpgradeModel alipayOpenMiniInnerversionUpgradeModel) throws ApiException {
        ApiResponse<Object> localVarResp = upgradeWithHttpInfo(alipayOpenMiniInnerversionUpgradeModel, null);
        return localVarResp.getData();
    }

    public Object upgrade(AlipayOpenMiniInnerversionUpgradeModel alipayOpenMiniInnerversionUpgradeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = upgradeWithHttpInfo(alipayOpenMiniInnerversionUpgradeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 升级模板实例化小程序
     * 升级基于模板实例化的小程序，升级后不需要重新提交审核；同步接口。
     * @param alipayOpenMiniInnerversionUpgradeModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> upgradeWithHttpInfo(AlipayOpenMiniInnerversionUpgradeModel alipayOpenMiniInnerversionUpgradeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = upgradeValidateBeforeCall(alipayOpenMiniInnerversionUpgradeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniInnerversionUpgradeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 升级模板实例化小程序 (asynchronously)
     * 升级基于模板实例化的小程序，升级后不需要重新提交审核；同步接口。
     * @param alipayOpenMiniInnerversionUpgradeModel  (optional)
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
    public okhttp3.Call upgradeAsync(AlipayOpenMiniInnerversionUpgradeModel alipayOpenMiniInnerversionUpgradeModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = upgradeValidateBeforeCall(alipayOpenMiniInnerversionUpgradeModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call upgradeAsync(AlipayOpenMiniInnerversionUpgradeModel alipayOpenMiniInnerversionUpgradeModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = upgradeValidateBeforeCall(alipayOpenMiniInnerversionUpgradeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upload
     * @param alipayOpenMiniInnerversionUploadModel  (optional)
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
    public okhttp3.Call uploadCall(AlipayOpenMiniInnerversionUploadModel alipayOpenMiniInnerversionUploadModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniInnerversionUploadModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/innerversion/upload";

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
    private okhttp3.Call uploadValidateBeforeCall(AlipayOpenMiniInnerversionUploadModel alipayOpenMiniInnerversionUploadModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = uploadCall(alipayOpenMiniInnerversionUploadModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 内部小程序-打包构建
     * 内部小程序，创建打包构建任务，异步返回，使用查询接口轮询构建结果
     * @param alipayOpenMiniInnerversionUploadModel  (optional)
     * @return AlipayOpenMiniInnerversionUploadResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniInnerversionUploadResponseModel upload(AlipayOpenMiniInnerversionUploadModel alipayOpenMiniInnerversionUploadModel) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerversionUploadResponseModel> localVarResp = uploadWithHttpInfo(alipayOpenMiniInnerversionUploadModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniInnerversionUploadResponseModel upload(AlipayOpenMiniInnerversionUploadModel alipayOpenMiniInnerversionUploadModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerversionUploadResponseModel> localVarResp = uploadWithHttpInfo(alipayOpenMiniInnerversionUploadModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 内部小程序-打包构建
     * 内部小程序，创建打包构建任务，异步返回，使用查询接口轮询构建结果
     * @param alipayOpenMiniInnerversionUploadModel  (optional)
     * @return ApiResponse&lt;AlipayOpenMiniInnerversionUploadResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniInnerversionUploadResponseModel> uploadWithHttpInfo(AlipayOpenMiniInnerversionUploadModel alipayOpenMiniInnerversionUploadModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = uploadValidateBeforeCall(alipayOpenMiniInnerversionUploadModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerversionUploadResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniInnerversionUploadDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 内部小程序-打包构建 (asynchronously)
     * 内部小程序，创建打包构建任务，异步返回，使用查询接口轮询构建结果
     * @param alipayOpenMiniInnerversionUploadModel  (optional)
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
    public okhttp3.Call uploadAsync(AlipayOpenMiniInnerversionUploadModel alipayOpenMiniInnerversionUploadModel, final ApiCallback<AlipayOpenMiniInnerversionUploadResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadValidateBeforeCall(alipayOpenMiniInnerversionUploadModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerversionUploadResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call uploadAsync(AlipayOpenMiniInnerversionUploadModel alipayOpenMiniInnerversionUploadModel, final ApiCallback<AlipayOpenMiniInnerversionUploadResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = uploadValidateBeforeCall(alipayOpenMiniInnerversionUploadModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerversionUploadResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
