/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-09-06
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


import com.alipay.v3.model.AlipayOpenMiniInnerversionBetainfoQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniInnerversionBetainfoQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenMiniInnerversionBetainfoApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenMiniInnerversionBetainfoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenMiniInnerversionBetainfoApi(ApiClient apiClient) {
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
     * Build call for query
     * @param pluginId 插件ID (optional)
     * @param bundleId 端信息 (optional)
     * @param pluginVersion 查询版本号 (optional)
     * @param appOrigin 业务来源 (optional)
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
    public okhttp3.Call queryCall(String pluginId, String bundleId, String pluginVersion, String appOrigin, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/mini/innerversion/betainfo/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pluginId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("plugin_id", pluginId));
        }

        if (bundleId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("bundle_id", bundleId));
        }

        if (pluginVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("plugin_version", pluginVersion));
        }

        if (appOrigin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_origin", appOrigin));
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
    private okhttp3.Call queryValidateBeforeCall(String pluginId, String bundleId, String pluginVersion, String appOrigin, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(pluginId, bundleId, pluginVersion, appOrigin, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查看可邀测状态接口
     * 查看插件可邀测版本状态,邀测结果
     * @param pluginId 插件ID (optional)
     * @param bundleId 端信息 (optional)
     * @param pluginVersion 查询版本号 (optional)
     * @param appOrigin 业务来源 (optional)
     * @return AlipayOpenMiniInnerversionBetainfoQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniInnerversionBetainfoQueryResponseModel query(String pluginId, String bundleId, String pluginVersion, String appOrigin) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerversionBetainfoQueryResponseModel> localVarResp = queryWithHttpInfo(pluginId, bundleId, pluginVersion, appOrigin, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniInnerversionBetainfoQueryResponseModel query(String pluginId, String bundleId, String pluginVersion, String appOrigin, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerversionBetainfoQueryResponseModel> localVarResp = queryWithHttpInfo(pluginId, bundleId, pluginVersion, appOrigin, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查看可邀测状态接口
     * 查看插件可邀测版本状态,邀测结果
     * @param pluginId 插件ID (optional)
     * @param bundleId 端信息 (optional)
     * @param pluginVersion 查询版本号 (optional)
     * @param appOrigin 业务来源 (optional)
     * @return ApiResponse&lt;AlipayOpenMiniInnerversionBetainfoQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniInnerversionBetainfoQueryResponseModel> queryWithHttpInfo(String pluginId, String bundleId, String pluginVersion, String appOrigin, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(pluginId, bundleId, pluginVersion, appOrigin, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerversionBetainfoQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniInnerversionBetainfoQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查看可邀测状态接口 (asynchronously)
     * 查看插件可邀测版本状态,邀测结果
     * @param pluginId 插件ID (optional)
     * @param bundleId 端信息 (optional)
     * @param pluginVersion 查询版本号 (optional)
     * @param appOrigin 业务来源 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryAsync(String pluginId, String bundleId, String pluginVersion, String appOrigin, final ApiCallback<AlipayOpenMiniInnerversionBetainfoQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(pluginId, bundleId, pluginVersion, appOrigin, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerversionBetainfoQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String pluginId, String bundleId, String pluginVersion, String appOrigin, final ApiCallback<AlipayOpenMiniInnerversionBetainfoQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(pluginId, bundleId, pluginVersion, appOrigin, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerversionBetainfoQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
