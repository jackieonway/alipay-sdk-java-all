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


import com.alipay.v3.model.AlipayUserAgreementUserverifyApplyDefaultResponse;
import com.alipay.v3.model.AlipayUserAgreementUserverifyApplyModel;
import com.alipay.v3.model.AlipayUserAgreementUserverifyApplyResponseModel;
import com.alipay.v3.model.AlipayUserAgreementUserverifyQueryDefaultResponse;
import com.alipay.v3.model.AlipayUserAgreementUserverifyQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayUserAgreementUserverifyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayUserAgreementUserverifyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayUserAgreementUserverifyApi(ApiClient apiClient) {
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
     * @param alipayUserAgreementUserverifyApplyModel  (optional)
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
    public okhttp3.Call applyCall(AlipayUserAgreementUserverifyApplyModel alipayUserAgreementUserverifyApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayUserAgreementUserverifyApplyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/user/agreement/userverify/apply";

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
    private okhttp3.Call applyValidateBeforeCall(AlipayUserAgreementUserverifyApplyModel alipayUserAgreementUserverifyApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = applyCall(alipayUserAgreementUserverifyApplyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 协议用户一致性验证
     * 验证协议对应的用户信息
     * @param alipayUserAgreementUserverifyApplyModel  (optional)
     * @return AlipayUserAgreementUserverifyApplyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayUserAgreementUserverifyApplyResponseModel apply(AlipayUserAgreementUserverifyApplyModel alipayUserAgreementUserverifyApplyModel) throws ApiException {
        ApiResponse<AlipayUserAgreementUserverifyApplyResponseModel> localVarResp = applyWithHttpInfo(alipayUserAgreementUserverifyApplyModel, null);
        return localVarResp.getData();
    }

    public AlipayUserAgreementUserverifyApplyResponseModel apply(AlipayUserAgreementUserverifyApplyModel alipayUserAgreementUserverifyApplyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayUserAgreementUserverifyApplyResponseModel> localVarResp = applyWithHttpInfo(alipayUserAgreementUserverifyApplyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 协议用户一致性验证
     * 验证协议对应的用户信息
     * @param alipayUserAgreementUserverifyApplyModel  (optional)
     * @return ApiResponse&lt;AlipayUserAgreementUserverifyApplyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayUserAgreementUserverifyApplyResponseModel> applyWithHttpInfo(AlipayUserAgreementUserverifyApplyModel alipayUserAgreementUserverifyApplyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayUserAgreementUserverifyApplyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayUserAgreementUserverifyApplyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayUserAgreementUserverifyApplyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 协议用户一致性验证 (asynchronously)
     * 验证协议对应的用户信息
     * @param alipayUserAgreementUserverifyApplyModel  (optional)
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
    public okhttp3.Call applyAsync(AlipayUserAgreementUserverifyApplyModel alipayUserAgreementUserverifyApplyModel, final ApiCallback<AlipayUserAgreementUserverifyApplyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayUserAgreementUserverifyApplyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayUserAgreementUserverifyApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call applyAsync(AlipayUserAgreementUserverifyApplyModel alipayUserAgreementUserverifyApplyModel, final ApiCallback<AlipayUserAgreementUserverifyApplyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayUserAgreementUserverifyApplyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayUserAgreementUserverifyApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param agreementNo 协议号 (optional)
     * @param applyToken 申请时获取的token (optional)
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
    public okhttp3.Call queryCall(String agreementNo, String applyToken, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/user/agreement/userverify/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (applyToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("apply_token", applyToken));
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
    private okhttp3.Call queryValidateBeforeCall(String agreementNo, String applyToken, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(agreementNo, applyToken, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 用户协议鉴权查询结果
     * 商户使用用户验证申请接口时，获取token，然后通过次接口回去验证状态
     * @param agreementNo 协议号 (optional)
     * @param applyToken 申请时获取的token (optional)
     * @return AlipayUserAgreementUserverifyQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayUserAgreementUserverifyQueryResponseModel query(String agreementNo, String applyToken) throws ApiException {
        ApiResponse<AlipayUserAgreementUserverifyQueryResponseModel> localVarResp = queryWithHttpInfo(agreementNo, applyToken, null);
        return localVarResp.getData();
    }

    public AlipayUserAgreementUserverifyQueryResponseModel query(String agreementNo, String applyToken, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayUserAgreementUserverifyQueryResponseModel> localVarResp = queryWithHttpInfo(agreementNo, applyToken, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 用户协议鉴权查询结果
     * 商户使用用户验证申请接口时，获取token，然后通过次接口回去验证状态
     * @param agreementNo 协议号 (optional)
     * @param applyToken 申请时获取的token (optional)
     * @return ApiResponse&lt;AlipayUserAgreementUserverifyQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayUserAgreementUserverifyQueryResponseModel> queryWithHttpInfo(String agreementNo, String applyToken, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(agreementNo, applyToken, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayUserAgreementUserverifyQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayUserAgreementUserverifyQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 用户协议鉴权查询结果 (asynchronously)
     * 商户使用用户验证申请接口时，获取token，然后通过次接口回去验证状态
     * @param agreementNo 协议号 (optional)
     * @param applyToken 申请时获取的token (optional)
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
    public okhttp3.Call queryAsync(String agreementNo, String applyToken, final ApiCallback<AlipayUserAgreementUserverifyQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(agreementNo, applyToken, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayUserAgreementUserverifyQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String agreementNo, String applyToken, final ApiCallback<AlipayUserAgreementUserverifyQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(agreementNo, applyToken, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayUserAgreementUserverifyQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
