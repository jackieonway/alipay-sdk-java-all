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


import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesSceneruleCreateDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesSceneruleCreateModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesSceneruleModifyDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesSceneruleModifyModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesSceneruleQueryDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceExpenserulesSceneruleApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceExpenserulesSceneruleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceExpenserulesSceneruleApi(ApiClient apiClient) {
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
     * @param alipayEbppInvoiceExpenserulesSceneruleCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayEbppInvoiceExpenserulesSceneruleCreateModel alipayEbppInvoiceExpenserulesSceneruleCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceExpenserulesSceneruleCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/expenserules/scenerule/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayEbppInvoiceExpenserulesSceneruleCreateModel alipayEbppInvoiceExpenserulesSceneruleCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayEbppInvoiceExpenserulesSceneruleCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 创建费控规则
     * 创建费控规则，例如：创建一条有效期为2021-08-01 00:00:00到2031-08-01 00:00:00的福利餐费控规则，限制对应员工的单日消费金额不超过100元；
     * @param alipayEbppInvoiceExpenserulesSceneruleCreateModel  (optional)
     * @return AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel create(AlipayEbppInvoiceExpenserulesSceneruleCreateModel alipayEbppInvoiceExpenserulesSceneruleCreateModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceExpenserulesSceneruleCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel create(AlipayEbppInvoiceExpenserulesSceneruleCreateModel alipayEbppInvoiceExpenserulesSceneruleCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceExpenserulesSceneruleCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 创建费控规则
     * 创建费控规则，例如：创建一条有效期为2021-08-01 00:00:00到2031-08-01 00:00:00的福利餐费控规则，限制对应员工的单日消费金额不超过100元；
     * @param alipayEbppInvoiceExpenserulesSceneruleCreateModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel> createWithHttpInfo(AlipayEbppInvoiceExpenserulesSceneruleCreateModel alipayEbppInvoiceExpenserulesSceneruleCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpenserulesSceneruleCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 创建费控规则 (asynchronously)
     * 创建费控规则，例如：创建一条有效期为2021-08-01 00:00:00到2031-08-01 00:00:00的福利餐费控规则，限制对应员工的单日消费金额不超过100元；
     * @param alipayEbppInvoiceExpenserulesSceneruleCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayEbppInvoiceExpenserulesSceneruleCreateModel alipayEbppInvoiceExpenserulesSceneruleCreateModel, final ApiCallback<AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpenserulesSceneruleCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call createAsync(AlipayEbppInvoiceExpenserulesSceneruleCreateModel alipayEbppInvoiceExpenserulesSceneruleCreateModel, final ApiCallback<AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpenserulesSceneruleCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param alipayEbppInvoiceExpenserulesSceneruleModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayEbppInvoiceExpenserulesSceneruleModifyModel alipayEbppInvoiceExpenserulesSceneruleModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceExpenserulesSceneruleModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/expenserules/scenerule/modify";

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
    private okhttp3.Call modifyValidateBeforeCall(AlipayEbppInvoiceExpenserulesSceneruleModifyModel alipayEbppInvoiceExpenserulesSceneruleModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayEbppInvoiceExpenserulesSceneruleModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 修改费控规则
     * 修改费控规则
     * @param alipayEbppInvoiceExpenserulesSceneruleModifyModel  (optional)
     * @return AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel modify(AlipayEbppInvoiceExpenserulesSceneruleModifyModel alipayEbppInvoiceExpenserulesSceneruleModifyModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayEbppInvoiceExpenserulesSceneruleModifyModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel modify(AlipayEbppInvoiceExpenserulesSceneruleModifyModel alipayEbppInvoiceExpenserulesSceneruleModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayEbppInvoiceExpenserulesSceneruleModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 修改费控规则
     * 修改费控规则
     * @param alipayEbppInvoiceExpenserulesSceneruleModifyModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel> modifyWithHttpInfo(AlipayEbppInvoiceExpenserulesSceneruleModifyModel alipayEbppInvoiceExpenserulesSceneruleModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceExpenserulesSceneruleModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 修改费控规则 (asynchronously)
     * 修改费控规则
     * @param alipayEbppInvoiceExpenserulesSceneruleModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayEbppInvoiceExpenserulesSceneruleModifyModel alipayEbppInvoiceExpenserulesSceneruleModifyModel, final ApiCallback<AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceExpenserulesSceneruleModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call modifyAsync(AlipayEbppInvoiceExpenserulesSceneruleModifyModel alipayEbppInvoiceExpenserulesSceneruleModifyModel, final ApiCallback<AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceExpenserulesSceneruleModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param accountId 企业ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param enterpriseId 企业码企业id (optional)
     * @param standardId 费控规则ID (optional)
     * @param pageNum 页数 (optional)
     * @param pageSize 页大小 (optional)
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
    public okhttp3.Call queryCall(String accountId, String agreementNo, String enterpriseId, String standardId, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/ebpp/invoice/expenserules/scenerule/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (enterpriseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enterprise_id", enterpriseId));
        }

        if (standardId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("standard_id", standardId));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
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
    private okhttp3.Call queryValidateBeforeCall(String accountId, String agreementNo, String enterpriseId, String standardId, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(accountId, agreementNo, enterpriseId, standardId, pageNum, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询费控规则信息
     * 查询费控规则信息
     * @param accountId 企业ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param enterpriseId 企业码企业id (optional)
     * @param standardId 费控规则ID (optional)
     * @param pageNum 页数 (optional)
     * @param pageSize 页大小 (optional)
     * @return AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel query(String accountId, String agreementNo, String enterpriseId, String standardId, Integer pageNum, Integer pageSize) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel> localVarResp = queryWithHttpInfo(accountId, agreementNo, enterpriseId, standardId, pageNum, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel query(String accountId, String agreementNo, String enterpriseId, String standardId, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel> localVarResp = queryWithHttpInfo(accountId, agreementNo, enterpriseId, standardId, pageNum, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询费控规则信息
     * 查询费控规则信息
     * @param accountId 企业ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param enterpriseId 企业码企业id (optional)
     * @param standardId 费控规则ID (optional)
     * @param pageNum 页数 (optional)
     * @param pageSize 页大小 (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel> queryWithHttpInfo(String accountId, String agreementNo, String enterpriseId, String standardId, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(accountId, agreementNo, enterpriseId, standardId, pageNum, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询费控规则信息 (asynchronously)
     * 查询费控规则信息
     * @param accountId 企业ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param enterpriseId 企业码企业id (optional)
     * @param standardId 费控规则ID (optional)
     * @param pageNum 页数 (optional)
     * @param pageSize 页大小 (optional)
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
    public okhttp3.Call queryAsync(String accountId, String agreementNo, String enterpriseId, String standardId, Integer pageNum, Integer pageSize, final ApiCallback<AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(accountId, agreementNo, enterpriseId, standardId, pageNum, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String accountId, String agreementNo, String enterpriseId, String standardId, Integer pageNum, Integer pageSize, final ApiCallback<AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(accountId, agreementNo, enterpriseId, standardId, pageNum, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
