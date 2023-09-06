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


import com.alipay.v3.model.AlipayMobilePublicShortlinkCreateDefaultResponse;
import com.alipay.v3.model.AlipayMobilePublicShortlinkCreateModel;
import com.alipay.v3.model.AlipayMobilePublicShortlinkCreateResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMobilePublicShortlinkApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMobilePublicShortlinkApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMobilePublicShortlinkApi(ApiClient apiClient) {
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
     * Build call for create
     * @param alipayMobilePublicShortlinkCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayMobilePublicShortlinkCreateModel alipayMobilePublicShortlinkCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMobilePublicShortlinkCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/mobile/public/shortlink/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayMobilePublicShortlinkCreateModel alipayMobilePublicShortlinkCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayMobilePublicShortlinkCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 服务窗短链自主生成接口
     * 商户通过本接口生成带自有场景标识的短链接
     * @param alipayMobilePublicShortlinkCreateModel  (optional)
     * @return AlipayMobilePublicShortlinkCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMobilePublicShortlinkCreateResponseModel create(AlipayMobilePublicShortlinkCreateModel alipayMobilePublicShortlinkCreateModel) throws ApiException {
        ApiResponse<AlipayMobilePublicShortlinkCreateResponseModel> localVarResp = createWithHttpInfo(alipayMobilePublicShortlinkCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayMobilePublicShortlinkCreateResponseModel create(AlipayMobilePublicShortlinkCreateModel alipayMobilePublicShortlinkCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMobilePublicShortlinkCreateResponseModel> localVarResp = createWithHttpInfo(alipayMobilePublicShortlinkCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 服务窗短链自主生成接口
     * 商户通过本接口生成带自有场景标识的短链接
     * @param alipayMobilePublicShortlinkCreateModel  (optional)
     * @return ApiResponse&lt;AlipayMobilePublicShortlinkCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMobilePublicShortlinkCreateResponseModel> createWithHttpInfo(AlipayMobilePublicShortlinkCreateModel alipayMobilePublicShortlinkCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMobilePublicShortlinkCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMobilePublicShortlinkCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMobilePublicShortlinkCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 服务窗短链自主生成接口 (asynchronously)
     * 商户通过本接口生成带自有场景标识的短链接
     * @param alipayMobilePublicShortlinkCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayMobilePublicShortlinkCreateModel alipayMobilePublicShortlinkCreateModel, final ApiCallback<AlipayMobilePublicShortlinkCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMobilePublicShortlinkCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMobilePublicShortlinkCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayMobilePublicShortlinkCreateModel alipayMobilePublicShortlinkCreateModel, final ApiCallback<AlipayMobilePublicShortlinkCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMobilePublicShortlinkCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMobilePublicShortlinkCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
