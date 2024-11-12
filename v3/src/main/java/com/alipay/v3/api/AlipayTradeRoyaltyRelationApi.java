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


import com.alipay.v3.model.AlipayTradeRoyaltyRelationBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayTradeRoyaltyRelationBatchqueryModel;
import com.alipay.v3.model.AlipayTradeRoyaltyRelationBatchqueryResponseModel;
import com.alipay.v3.model.AlipayTradeRoyaltyRelationBindDefaultResponse;
import com.alipay.v3.model.AlipayTradeRoyaltyRelationBindModel;
import com.alipay.v3.model.AlipayTradeRoyaltyRelationBindResponseModel;
import com.alipay.v3.model.AlipayTradeRoyaltyRelationUnbindDefaultResponse;
import com.alipay.v3.model.AlipayTradeRoyaltyRelationUnbindModel;
import com.alipay.v3.model.AlipayTradeRoyaltyRelationUnbindResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayTradeRoyaltyRelationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayTradeRoyaltyRelationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayTradeRoyaltyRelationApi(ApiClient apiClient) {
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
     * Build call for batchquery
     * @param alipayTradeRoyaltyRelationBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryCall(AlipayTradeRoyaltyRelationBatchqueryModel alipayTradeRoyaltyRelationBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayTradeRoyaltyRelationBatchqueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/trade/royalty/relation/batchquery";

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
    private okhttp3.Call batchqueryValidateBeforeCall(AlipayTradeRoyaltyRelationBatchqueryModel alipayTradeRoyaltyRelationBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(alipayTradeRoyaltyRelationBatchqueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 分账关系查询
     * 当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系查询。
     * @param alipayTradeRoyaltyRelationBatchqueryModel  (optional)
     * @return AlipayTradeRoyaltyRelationBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayTradeRoyaltyRelationBatchqueryResponseModel batchquery(AlipayTradeRoyaltyRelationBatchqueryModel alipayTradeRoyaltyRelationBatchqueryModel) throws ApiException {
        ApiResponse<AlipayTradeRoyaltyRelationBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayTradeRoyaltyRelationBatchqueryModel, null);
        return localVarResp.getData();
    }

    public AlipayTradeRoyaltyRelationBatchqueryResponseModel batchquery(AlipayTradeRoyaltyRelationBatchqueryModel alipayTradeRoyaltyRelationBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayTradeRoyaltyRelationBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayTradeRoyaltyRelationBatchqueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 分账关系查询
     * 当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系查询。
     * @param alipayTradeRoyaltyRelationBatchqueryModel  (optional)
     * @return ApiResponse&lt;AlipayTradeRoyaltyRelationBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayTradeRoyaltyRelationBatchqueryResponseModel> batchqueryWithHttpInfo(AlipayTradeRoyaltyRelationBatchqueryModel alipayTradeRoyaltyRelationBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayTradeRoyaltyRelationBatchqueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayTradeRoyaltyRelationBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayTradeRoyaltyRelationBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 分账关系查询 (asynchronously)
     * 当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系查询。
     * @param alipayTradeRoyaltyRelationBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryAsync(AlipayTradeRoyaltyRelationBatchqueryModel alipayTradeRoyaltyRelationBatchqueryModel, final ApiCallback<AlipayTradeRoyaltyRelationBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayTradeRoyaltyRelationBatchqueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayTradeRoyaltyRelationBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call batchqueryAsync(AlipayTradeRoyaltyRelationBatchqueryModel alipayTradeRoyaltyRelationBatchqueryModel, final ApiCallback<AlipayTradeRoyaltyRelationBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayTradeRoyaltyRelationBatchqueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayTradeRoyaltyRelationBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for bind
     * @param alipayTradeRoyaltyRelationBindModel  (optional)
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
    public okhttp3.Call bindCall(AlipayTradeRoyaltyRelationBindModel alipayTradeRoyaltyRelationBindModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayTradeRoyaltyRelationBindModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/trade/royalty/relation/bind";

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
    private okhttp3.Call bindValidateBeforeCall(AlipayTradeRoyaltyRelationBindModel alipayTradeRoyaltyRelationBindModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = bindCall(alipayTradeRoyaltyRelationBindModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 分账关系绑定
     * 当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系绑定。
     * @param alipayTradeRoyaltyRelationBindModel  (optional)
     * @return AlipayTradeRoyaltyRelationBindResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayTradeRoyaltyRelationBindResponseModel bind(AlipayTradeRoyaltyRelationBindModel alipayTradeRoyaltyRelationBindModel) throws ApiException {
        ApiResponse<AlipayTradeRoyaltyRelationBindResponseModel> localVarResp = bindWithHttpInfo(alipayTradeRoyaltyRelationBindModel, null);
        return localVarResp.getData();
    }

    public AlipayTradeRoyaltyRelationBindResponseModel bind(AlipayTradeRoyaltyRelationBindModel alipayTradeRoyaltyRelationBindModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayTradeRoyaltyRelationBindResponseModel> localVarResp = bindWithHttpInfo(alipayTradeRoyaltyRelationBindModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 分账关系绑定
     * 当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系绑定。
     * @param alipayTradeRoyaltyRelationBindModel  (optional)
     * @return ApiResponse&lt;AlipayTradeRoyaltyRelationBindResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayTradeRoyaltyRelationBindResponseModel> bindWithHttpInfo(AlipayTradeRoyaltyRelationBindModel alipayTradeRoyaltyRelationBindModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = bindValidateBeforeCall(alipayTradeRoyaltyRelationBindModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayTradeRoyaltyRelationBindResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayTradeRoyaltyRelationBindDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 分账关系绑定 (asynchronously)
     * 当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系绑定。
     * @param alipayTradeRoyaltyRelationBindModel  (optional)
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
    public okhttp3.Call bindAsync(AlipayTradeRoyaltyRelationBindModel alipayTradeRoyaltyRelationBindModel, final ApiCallback<AlipayTradeRoyaltyRelationBindResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = bindValidateBeforeCall(alipayTradeRoyaltyRelationBindModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayTradeRoyaltyRelationBindResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call bindAsync(AlipayTradeRoyaltyRelationBindModel alipayTradeRoyaltyRelationBindModel, final ApiCallback<AlipayTradeRoyaltyRelationBindResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = bindValidateBeforeCall(alipayTradeRoyaltyRelationBindModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayTradeRoyaltyRelationBindResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unbind
     * @param alipayTradeRoyaltyRelationUnbindModel  (optional)
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
    public okhttp3.Call unbindCall(AlipayTradeRoyaltyRelationUnbindModel alipayTradeRoyaltyRelationUnbindModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayTradeRoyaltyRelationUnbindModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/trade/royalty/relation/unbind";

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
    private okhttp3.Call unbindValidateBeforeCall(AlipayTradeRoyaltyRelationUnbindModel alipayTradeRoyaltyRelationUnbindModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = unbindCall(alipayTradeRoyaltyRelationUnbindModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 分账关系解绑
     * 当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系解绑。
     * @param alipayTradeRoyaltyRelationUnbindModel  (optional)
     * @return AlipayTradeRoyaltyRelationUnbindResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayTradeRoyaltyRelationUnbindResponseModel unbind(AlipayTradeRoyaltyRelationUnbindModel alipayTradeRoyaltyRelationUnbindModel) throws ApiException {
        ApiResponse<AlipayTradeRoyaltyRelationUnbindResponseModel> localVarResp = unbindWithHttpInfo(alipayTradeRoyaltyRelationUnbindModel, null);
        return localVarResp.getData();
    }

    public AlipayTradeRoyaltyRelationUnbindResponseModel unbind(AlipayTradeRoyaltyRelationUnbindModel alipayTradeRoyaltyRelationUnbindModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayTradeRoyaltyRelationUnbindResponseModel> localVarResp = unbindWithHttpInfo(alipayTradeRoyaltyRelationUnbindModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 分账关系解绑
     * 当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系解绑。
     * @param alipayTradeRoyaltyRelationUnbindModel  (optional)
     * @return ApiResponse&lt;AlipayTradeRoyaltyRelationUnbindResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayTradeRoyaltyRelationUnbindResponseModel> unbindWithHttpInfo(AlipayTradeRoyaltyRelationUnbindModel alipayTradeRoyaltyRelationUnbindModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = unbindValidateBeforeCall(alipayTradeRoyaltyRelationUnbindModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayTradeRoyaltyRelationUnbindResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayTradeRoyaltyRelationUnbindDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 分账关系解绑 (asynchronously)
     * 当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系解绑。
     * @param alipayTradeRoyaltyRelationUnbindModel  (optional)
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
    public okhttp3.Call unbindAsync(AlipayTradeRoyaltyRelationUnbindModel alipayTradeRoyaltyRelationUnbindModel, final ApiCallback<AlipayTradeRoyaltyRelationUnbindResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = unbindValidateBeforeCall(alipayTradeRoyaltyRelationUnbindModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayTradeRoyaltyRelationUnbindResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call unbindAsync(AlipayTradeRoyaltyRelationUnbindModel alipayTradeRoyaltyRelationUnbindModel, final ApiCallback<AlipayTradeRoyaltyRelationUnbindResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = unbindValidateBeforeCall(alipayTradeRoyaltyRelationUnbindModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayTradeRoyaltyRelationUnbindResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
