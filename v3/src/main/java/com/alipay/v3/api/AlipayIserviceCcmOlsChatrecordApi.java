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


import com.alipay.v3.model.AlipayIserviceCcmOlsChatrecordQueryDefaultResponse;
import com.alipay.v3.model.AlipayIserviceCcmOlsChatrecordQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayIserviceCcmOlsChatrecordApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayIserviceCcmOlsChatrecordApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayIserviceCcmOlsChatrecordApi(ApiClient apiClient) {
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
     * @param ccsInstanceId 租户实例id（数据权限id），不填，则使用默认的租户实例id (optional)
     * @param id 在线服务记录id (optional)
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
    public okhttp3.Call queryCall(String ccsInstanceId, String id, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/iservice/ccm/ols/chatrecord/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ccsInstanceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ccs_instance_id", ccsInstanceId));
        }

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
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
    private okhttp3.Call queryValidateBeforeCall(String ccsInstanceId, String id, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(ccsInstanceId, id, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询某通在线服务的聊天记录
     * ISV或商户根据在线服务记录id查询该通对话的聊天记录及相关信息
     * @param ccsInstanceId 租户实例id（数据权限id），不填，则使用默认的租户实例id (optional)
     * @param id 在线服务记录id (optional)
     * @return AlipayIserviceCcmOlsChatrecordQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayIserviceCcmOlsChatrecordQueryResponseModel query(String ccsInstanceId, String id) throws ApiException {
        ApiResponse<AlipayIserviceCcmOlsChatrecordQueryResponseModel> localVarResp = queryWithHttpInfo(ccsInstanceId, id, null);
        return localVarResp.getData();
    }

    public AlipayIserviceCcmOlsChatrecordQueryResponseModel query(String ccsInstanceId, String id, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayIserviceCcmOlsChatrecordQueryResponseModel> localVarResp = queryWithHttpInfo(ccsInstanceId, id, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询某通在线服务的聊天记录
     * ISV或商户根据在线服务记录id查询该通对话的聊天记录及相关信息
     * @param ccsInstanceId 租户实例id（数据权限id），不填，则使用默认的租户实例id (optional)
     * @param id 在线服务记录id (optional)
     * @return ApiResponse&lt;AlipayIserviceCcmOlsChatrecordQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayIserviceCcmOlsChatrecordQueryResponseModel> queryWithHttpInfo(String ccsInstanceId, String id, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(ccsInstanceId, id, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayIserviceCcmOlsChatrecordQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayIserviceCcmOlsChatrecordQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询某通在线服务的聊天记录 (asynchronously)
     * ISV或商户根据在线服务记录id查询该通对话的聊天记录及相关信息
     * @param ccsInstanceId 租户实例id（数据权限id），不填，则使用默认的租户实例id (optional)
     * @param id 在线服务记录id (optional)
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
    public okhttp3.Call queryAsync(String ccsInstanceId, String id, final ApiCallback<AlipayIserviceCcmOlsChatrecordQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(ccsInstanceId, id, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmOlsChatrecordQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String ccsInstanceId, String id, final ApiCallback<AlipayIserviceCcmOlsChatrecordQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(ccsInstanceId, id, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayIserviceCcmOlsChatrecordQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
