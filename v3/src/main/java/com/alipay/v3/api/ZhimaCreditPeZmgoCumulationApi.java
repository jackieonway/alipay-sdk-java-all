/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-12
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


import com.alipay.v3.model.ZhimaCreditPeZmgoCumulationSyncDefaultResponse;
import com.alipay.v3.model.ZhimaCreditPeZmgoCumulationSyncModel;
import com.alipay.v3.model.ZhimaCreditPeZmgoCumulationSyncResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ZhimaCreditPeZmgoCumulationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZhimaCreditPeZmgoCumulationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZhimaCreditPeZmgoCumulationApi(ApiClient apiClient) {
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
     * Build call for sync
     * @param zhimaCreditPeZmgoCumulationSyncModel  (optional)
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
    public okhttp3.Call syncCall(ZhimaCreditPeZmgoCumulationSyncModel zhimaCreditPeZmgoCumulationSyncModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : zhimaCreditPeZmgoCumulationSyncModel;

        // create path and map variables
        String localVarPath = "/v3/zhima/credit/pe/zmgo/cumulation/sync";

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
    private okhttp3.Call syncValidateBeforeCall(ZhimaCreditPeZmgoCumulationSyncModel zhimaCreditPeZmgoCumulationSyncModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = syncCall(zhimaCreditPeZmgoCumulationSyncModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 芝麻go用户数据回传
     * 芝麻go商户通过此api接口，将用户行为数据回传到芝麻侧，数据包括：交易型数据（订单信息、优惠信息）和非交易型数据（用户完成任务次数）。芝麻侧将回传的数据在C端向用户展示，并且在结算时对结算金额进行校验（可选）。
     * @param zhimaCreditPeZmgoCumulationSyncModel  (optional)
     * @return ZhimaCreditPeZmgoCumulationSyncResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaCreditPeZmgoCumulationSyncResponseModel sync(ZhimaCreditPeZmgoCumulationSyncModel zhimaCreditPeZmgoCumulationSyncModel) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoCumulationSyncResponseModel> localVarResp = syncWithHttpInfo(zhimaCreditPeZmgoCumulationSyncModel, null);
        return localVarResp.getData();
    }

    public ZhimaCreditPeZmgoCumulationSyncResponseModel sync(ZhimaCreditPeZmgoCumulationSyncModel zhimaCreditPeZmgoCumulationSyncModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaCreditPeZmgoCumulationSyncResponseModel> localVarResp = syncWithHttpInfo(zhimaCreditPeZmgoCumulationSyncModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 芝麻go用户数据回传
     * 芝麻go商户通过此api接口，将用户行为数据回传到芝麻侧，数据包括：交易型数据（订单信息、优惠信息）和非交易型数据（用户完成任务次数）。芝麻侧将回传的数据在C端向用户展示，并且在结算时对结算金额进行校验（可选）。
     * @param zhimaCreditPeZmgoCumulationSyncModel  (optional)
     * @return ApiResponse&lt;ZhimaCreditPeZmgoCumulationSyncResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaCreditPeZmgoCumulationSyncResponseModel> syncWithHttpInfo(ZhimaCreditPeZmgoCumulationSyncModel zhimaCreditPeZmgoCumulationSyncModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = syncValidateBeforeCall(zhimaCreditPeZmgoCumulationSyncModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoCumulationSyncResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaCreditPeZmgoCumulationSyncDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 芝麻go用户数据回传 (asynchronously)
     * 芝麻go商户通过此api接口，将用户行为数据回传到芝麻侧，数据包括：交易型数据（订单信息、优惠信息）和非交易型数据（用户完成任务次数）。芝麻侧将回传的数据在C端向用户展示，并且在结算时对结算金额进行校验（可选）。
     * @param zhimaCreditPeZmgoCumulationSyncModel  (optional)
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
    public okhttp3.Call syncAsync(ZhimaCreditPeZmgoCumulationSyncModel zhimaCreditPeZmgoCumulationSyncModel, final ApiCallback<ZhimaCreditPeZmgoCumulationSyncResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = syncValidateBeforeCall(zhimaCreditPeZmgoCumulationSyncModel, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoCumulationSyncResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call syncAsync(ZhimaCreditPeZmgoCumulationSyncModel zhimaCreditPeZmgoCumulationSyncModel, final ApiCallback<ZhimaCreditPeZmgoCumulationSyncResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = syncValidateBeforeCall(zhimaCreditPeZmgoCumulationSyncModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaCreditPeZmgoCumulationSyncResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
