/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-08
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


import com.alipay.v3.model.AlipayMerchantTradecomplainBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayMerchantTradecomplainBatchqueryModel;
import com.alipay.v3.model.AlipayMerchantTradecomplainBatchqueryResponseModel;
import com.alipay.v3.model.AlipayMerchantTradecomplainQueryDefaultResponse;
import com.alipay.v3.model.AlipayMerchantTradecomplainQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMerchantTradecomplainApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMerchantTradecomplainApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMerchantTradecomplainApi(ApiClient apiClient) {
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
     * @param alipayMerchantTradecomplainBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryCall(AlipayMerchantTradecomplainBatchqueryModel alipayMerchantTradecomplainBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMerchantTradecomplainBatchqueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/merchant/tradecomplain/batchquery";

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
    private okhttp3.Call batchqueryValidateBeforeCall(AlipayMerchantTradecomplainBatchqueryModel alipayMerchantTradecomplainBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(alipayMerchantTradecomplainBatchqueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询交易投诉列表
     * 开发者根据其应用id查询用户在其应用（小程序、生活号）的投诉单列表记录。投诉单列表以分页查询方式返回。
     * @param alipayMerchantTradecomplainBatchqueryModel  (optional)
     * @return AlipayMerchantTradecomplainBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMerchantTradecomplainBatchqueryResponseModel batchquery(AlipayMerchantTradecomplainBatchqueryModel alipayMerchantTradecomplainBatchqueryModel) throws ApiException {
        ApiResponse<AlipayMerchantTradecomplainBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayMerchantTradecomplainBatchqueryModel, null);
        return localVarResp.getData();
    }

    public AlipayMerchantTradecomplainBatchqueryResponseModel batchquery(AlipayMerchantTradecomplainBatchqueryModel alipayMerchantTradecomplainBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMerchantTradecomplainBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayMerchantTradecomplainBatchqueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询交易投诉列表
     * 开发者根据其应用id查询用户在其应用（小程序、生活号）的投诉单列表记录。投诉单列表以分页查询方式返回。
     * @param alipayMerchantTradecomplainBatchqueryModel  (optional)
     * @return ApiResponse&lt;AlipayMerchantTradecomplainBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMerchantTradecomplainBatchqueryResponseModel> batchqueryWithHttpInfo(AlipayMerchantTradecomplainBatchqueryModel alipayMerchantTradecomplainBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayMerchantTradecomplainBatchqueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMerchantTradecomplainBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMerchantTradecomplainBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询交易投诉列表 (asynchronously)
     * 开发者根据其应用id查询用户在其应用（小程序、生活号）的投诉单列表记录。投诉单列表以分页查询方式返回。
     * @param alipayMerchantTradecomplainBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryAsync(AlipayMerchantTradecomplainBatchqueryModel alipayMerchantTradecomplainBatchqueryModel, final ApiCallback<AlipayMerchantTradecomplainBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayMerchantTradecomplainBatchqueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMerchantTradecomplainBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call batchqueryAsync(AlipayMerchantTradecomplainBatchqueryModel alipayMerchantTradecomplainBatchqueryModel, final ApiCallback<AlipayMerchantTradecomplainBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayMerchantTradecomplainBatchqueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMerchantTradecomplainBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param complainEventId 支付宝侧投诉单号 (required)
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
    public okhttp3.Call queryCall(String complainEventId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/merchant/tradecomplain/{complain_event_id}"
            .replaceAll("\\{" + "complain_event_id" + "\\}", localVarApiClient.escapeString(complainEventId.toString()));

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
    private okhttp3.Call queryValidateBeforeCall(String complainEventId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        
        // verify the required path parameter 'complainEventId' is set
        if (complainEventId == null) {
            throw new ApiException("Missing the required parameter 'complainEventId' when calling query(Async)");
        }
        

        okhttp3.Call localVarCall = queryCall(complainEventId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询单条交易投诉详情
     * 开发者根据支付宝侧投诉单号查询该笔投诉详细记录。
     * @param complainEventId 支付宝侧投诉单号 (required)
     * @return AlipayMerchantTradecomplainQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMerchantTradecomplainQueryResponseModel query(String complainEventId) throws ApiException {
        ApiResponse<AlipayMerchantTradecomplainQueryResponseModel> localVarResp = queryWithHttpInfo(complainEventId, null);
        return localVarResp.getData();
    }

    public AlipayMerchantTradecomplainQueryResponseModel query(String complainEventId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMerchantTradecomplainQueryResponseModel> localVarResp = queryWithHttpInfo(complainEventId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询单条交易投诉详情
     * 开发者根据支付宝侧投诉单号查询该笔投诉详细记录。
     * @param complainEventId 支付宝侧投诉单号 (required)
     * @return ApiResponse&lt;AlipayMerchantTradecomplainQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMerchantTradecomplainQueryResponseModel> queryWithHttpInfo(String complainEventId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(complainEventId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMerchantTradecomplainQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMerchantTradecomplainQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询单条交易投诉详情 (asynchronously)
     * 开发者根据支付宝侧投诉单号查询该笔投诉详细记录。
     * @param complainEventId 支付宝侧投诉单号 (required)
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
    public okhttp3.Call queryAsync(String complainEventId, final ApiCallback<AlipayMerchantTradecomplainQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(complainEventId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMerchantTradecomplainQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String complainEventId, final ApiCallback<AlipayMerchantTradecomplainQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(complainEventId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMerchantTradecomplainQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
