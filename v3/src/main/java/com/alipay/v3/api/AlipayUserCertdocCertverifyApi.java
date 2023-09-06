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


import com.alipay.v3.model.AlipayUserCertdocCertverifyConsultDefaultResponse;
import com.alipay.v3.model.AlipayUserCertdocCertverifyConsultResponseModel;
import com.alipay.v3.model.AlipayUserCertdocCertverifyPreconsultDefaultResponse;
import com.alipay.v3.model.AlipayUserCertdocCertverifyPreconsultModel;
import com.alipay.v3.model.AlipayUserCertdocCertverifyPreconsultResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayUserCertdocCertverifyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayUserCertdocCertverifyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayUserCertdocCertverifyApi(ApiClient apiClient) {
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
     * Build call for consult
     * @param authToken 用户授权令牌 (optional)
     * @param verifyId 信息校验验证ID。通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_2/alipay.user.certdoc.certverify.preconsult\&quot;&gt;alipay.user.certdoc.certverify.preconsult&lt;/a&gt;(实名证件信息比对验证预咨询)接口获取。 (optional)
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
    public okhttp3.Call consultCall(String authToken, String verifyId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/user/certdoc/certverify/consult";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth_token", authToken));
        }

        if (verifyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("verify_id", verifyId));
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
    private okhttp3.Call consultValidateBeforeCall(String authToken, String verifyId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = consultCall(authToken, verifyId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 实名证件信息比对验证咨询
     * 商户在预咨询接口（接口1）预先录入某用户的实名证件信息（例如姓名、身份证号等），获得用户授权后调用本咨询接口（接口2），将对比该用户的支付宝实名信息与（接口1）传入的信息是否一致。
     * @param authToken 用户授权令牌 (optional)
     * @param verifyId 信息校验验证ID。通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_2/alipay.user.certdoc.certverify.preconsult\&quot;&gt;alipay.user.certdoc.certverify.preconsult&lt;/a&gt;(实名证件信息比对验证预咨询)接口获取。 (optional)
     * @return AlipayUserCertdocCertverifyConsultResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayUserCertdocCertverifyConsultResponseModel consult(String authToken, String verifyId) throws ApiException {
        ApiResponse<AlipayUserCertdocCertverifyConsultResponseModel> localVarResp = consultWithHttpInfo(authToken, verifyId, null);
        return localVarResp.getData();
    }

    public AlipayUserCertdocCertverifyConsultResponseModel consult(String authToken, String verifyId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayUserCertdocCertverifyConsultResponseModel> localVarResp = consultWithHttpInfo(authToken, verifyId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 实名证件信息比对验证咨询
     * 商户在预咨询接口（接口1）预先录入某用户的实名证件信息（例如姓名、身份证号等），获得用户授权后调用本咨询接口（接口2），将对比该用户的支付宝实名信息与（接口1）传入的信息是否一致。
     * @param authToken 用户授权令牌 (optional)
     * @param verifyId 信息校验验证ID。通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_2/alipay.user.certdoc.certverify.preconsult\&quot;&gt;alipay.user.certdoc.certverify.preconsult&lt;/a&gt;(实名证件信息比对验证预咨询)接口获取。 (optional)
     * @return ApiResponse&lt;AlipayUserCertdocCertverifyConsultResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayUserCertdocCertverifyConsultResponseModel> consultWithHttpInfo(String authToken, String verifyId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = consultValidateBeforeCall(authToken, verifyId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayUserCertdocCertverifyConsultResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayUserCertdocCertverifyConsultDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 实名证件信息比对验证咨询 (asynchronously)
     * 商户在预咨询接口（接口1）预先录入某用户的实名证件信息（例如姓名、身份证号等），获得用户授权后调用本咨询接口（接口2），将对比该用户的支付宝实名信息与（接口1）传入的信息是否一致。
     * @param authToken 用户授权令牌 (optional)
     * @param verifyId 信息校验验证ID。通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_2/alipay.user.certdoc.certverify.preconsult\&quot;&gt;alipay.user.certdoc.certverify.preconsult&lt;/a&gt;(实名证件信息比对验证预咨询)接口获取。 (optional)
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
    public okhttp3.Call consultAsync(String authToken, String verifyId, final ApiCallback<AlipayUserCertdocCertverifyConsultResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(authToken, verifyId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayUserCertdocCertverifyConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call consultAsync(String authToken, String verifyId, final ApiCallback<AlipayUserCertdocCertverifyConsultResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(authToken, verifyId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayUserCertdocCertverifyConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for preconsult
     * @param alipayUserCertdocCertverifyPreconsultModel  (optional)
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
    public okhttp3.Call preconsultCall(AlipayUserCertdocCertverifyPreconsultModel alipayUserCertdocCertverifyPreconsultModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayUserCertdocCertverifyPreconsultModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/user/certdoc/certverify/preconsult";

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
    private okhttp3.Call preconsultValidateBeforeCall(AlipayUserCertdocCertverifyPreconsultModel alipayUserCertdocCertverifyPreconsultModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = preconsultCall(alipayUserCertdocCertverifyPreconsultModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 实名证件信息比对验证预咨询
     * 商户在该接口（接口1）预先录入某用户的实名证件信息（例如姓名、身份证号等），获得用户授权后调用咨询接口（接口2），将对比该用户的支付宝实名信息与该（接口1）传入的信息是否一致。
     * @param alipayUserCertdocCertverifyPreconsultModel  (optional)
     * @return AlipayUserCertdocCertverifyPreconsultResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayUserCertdocCertverifyPreconsultResponseModel preconsult(AlipayUserCertdocCertverifyPreconsultModel alipayUserCertdocCertverifyPreconsultModel) throws ApiException {
        ApiResponse<AlipayUserCertdocCertverifyPreconsultResponseModel> localVarResp = preconsultWithHttpInfo(alipayUserCertdocCertverifyPreconsultModel, null);
        return localVarResp.getData();
    }

    public AlipayUserCertdocCertverifyPreconsultResponseModel preconsult(AlipayUserCertdocCertverifyPreconsultModel alipayUserCertdocCertverifyPreconsultModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayUserCertdocCertverifyPreconsultResponseModel> localVarResp = preconsultWithHttpInfo(alipayUserCertdocCertverifyPreconsultModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 实名证件信息比对验证预咨询
     * 商户在该接口（接口1）预先录入某用户的实名证件信息（例如姓名、身份证号等），获得用户授权后调用咨询接口（接口2），将对比该用户的支付宝实名信息与该（接口1）传入的信息是否一致。
     * @param alipayUserCertdocCertverifyPreconsultModel  (optional)
     * @return ApiResponse&lt;AlipayUserCertdocCertverifyPreconsultResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayUserCertdocCertverifyPreconsultResponseModel> preconsultWithHttpInfo(AlipayUserCertdocCertverifyPreconsultModel alipayUserCertdocCertverifyPreconsultModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = preconsultValidateBeforeCall(alipayUserCertdocCertverifyPreconsultModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayUserCertdocCertverifyPreconsultResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayUserCertdocCertverifyPreconsultDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 实名证件信息比对验证预咨询 (asynchronously)
     * 商户在该接口（接口1）预先录入某用户的实名证件信息（例如姓名、身份证号等），获得用户授权后调用咨询接口（接口2），将对比该用户的支付宝实名信息与该（接口1）传入的信息是否一致。
     * @param alipayUserCertdocCertverifyPreconsultModel  (optional)
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
    public okhttp3.Call preconsultAsync(AlipayUserCertdocCertverifyPreconsultModel alipayUserCertdocCertverifyPreconsultModel, final ApiCallback<AlipayUserCertdocCertverifyPreconsultResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = preconsultValidateBeforeCall(alipayUserCertdocCertverifyPreconsultModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayUserCertdocCertverifyPreconsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call preconsultAsync(AlipayUserCertdocCertverifyPreconsultModel alipayUserCertdocCertverifyPreconsultModel, final ApiCallback<AlipayUserCertdocCertverifyPreconsultResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = preconsultValidateBeforeCall(alipayUserCertdocCertverifyPreconsultModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayUserCertdocCertverifyPreconsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
