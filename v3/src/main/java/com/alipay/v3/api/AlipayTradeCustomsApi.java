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


import com.alipay.v3.model.AlipayTradeCustomsDeclareDefaultResponse;
import com.alipay.v3.model.AlipayTradeCustomsDeclareModel;
import com.alipay.v3.model.AlipayTradeCustomsDeclareResponseModel;
import com.alipay.v3.model.AlipayTradeCustomsQueryDefaultResponse;
import com.alipay.v3.model.AlipayTradeCustomsQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayTradeCustomsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayTradeCustomsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayTradeCustomsApi(ApiClient apiClient) {
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
     * Build call for declare
     * @param alipayTradeCustomsDeclareModel  (optional)
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
    public okhttp3.Call declareCall(AlipayTradeCustomsDeclareModel alipayTradeCustomsDeclareModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayTradeCustomsDeclareModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/trade/customs/declare";

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
    private okhttp3.Call declareValidateBeforeCall(AlipayTradeCustomsDeclareModel alipayTradeCustomsDeclareModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = declareCall(alipayTradeCustomsDeclareModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 统一收单报关接口
     * 境外商户的商品进口到国内时需要向海关中心报送支付、物流等信息，由海关审核，如果交易是由支付宝支付的话，需要商户可以调用此报关接口来请求支付宝将其指定交易报送支付单给海关。
     * @param alipayTradeCustomsDeclareModel  (optional)
     * @return AlipayTradeCustomsDeclareResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayTradeCustomsDeclareResponseModel declare(AlipayTradeCustomsDeclareModel alipayTradeCustomsDeclareModel) throws ApiException {
        ApiResponse<AlipayTradeCustomsDeclareResponseModel> localVarResp = declareWithHttpInfo(alipayTradeCustomsDeclareModel, null);
        return localVarResp.getData();
    }

    public AlipayTradeCustomsDeclareResponseModel declare(AlipayTradeCustomsDeclareModel alipayTradeCustomsDeclareModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayTradeCustomsDeclareResponseModel> localVarResp = declareWithHttpInfo(alipayTradeCustomsDeclareModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 统一收单报关接口
     * 境外商户的商品进口到国内时需要向海关中心报送支付、物流等信息，由海关审核，如果交易是由支付宝支付的话，需要商户可以调用此报关接口来请求支付宝将其指定交易报送支付单给海关。
     * @param alipayTradeCustomsDeclareModel  (optional)
     * @return ApiResponse&lt;AlipayTradeCustomsDeclareResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayTradeCustomsDeclareResponseModel> declareWithHttpInfo(AlipayTradeCustomsDeclareModel alipayTradeCustomsDeclareModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = declareValidateBeforeCall(alipayTradeCustomsDeclareModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayTradeCustomsDeclareResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayTradeCustomsDeclareDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 统一收单报关接口 (asynchronously)
     * 境外商户的商品进口到国内时需要向海关中心报送支付、物流等信息，由海关审核，如果交易是由支付宝支付的话，需要商户可以调用此报关接口来请求支付宝将其指定交易报送支付单给海关。
     * @param alipayTradeCustomsDeclareModel  (optional)
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
    public okhttp3.Call declareAsync(AlipayTradeCustomsDeclareModel alipayTradeCustomsDeclareModel, final ApiCallback<AlipayTradeCustomsDeclareResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = declareValidateBeforeCall(alipayTradeCustomsDeclareModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayTradeCustomsDeclareResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call declareAsync(AlipayTradeCustomsDeclareModel alipayTradeCustomsDeclareModel, final ApiCallback<AlipayTradeCustomsDeclareResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = declareValidateBeforeCall(alipayTradeCustomsDeclareModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayTradeCustomsDeclareResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param outRequestNos 报关请求号。需要查询的商户端报关请求号，支持批量查询，  多个值用英文半角逗号分隔，单次请求最多10个; (optional)
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
    public okhttp3.Call queryCall(String outRequestNos, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/trade/customs/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (outRequestNos != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_request_nos", outRequestNos));
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
    private okhttp3.Call queryValidateBeforeCall(String outRequestNos, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(outRequestNos, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询报关详细信息
     * 境外商户的商品进口到国内时需要向海关中心报送支付、物流等信息，由海关审核，如果交易是由支付宝支付的话，需要商户调用支付宝报关接口来请求支付宝将其指定交易报送支付单给海关。商户可以通过该接口主动查询报关状态，了解报关详情以及进度。
     * @param outRequestNos 报关请求号。需要查询的商户端报关请求号，支持批量查询，  多个值用英文半角逗号分隔，单次请求最多10个; (optional)
     * @return AlipayTradeCustomsQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayTradeCustomsQueryResponseModel query(String outRequestNos) throws ApiException {
        ApiResponse<AlipayTradeCustomsQueryResponseModel> localVarResp = queryWithHttpInfo(outRequestNos, null);
        return localVarResp.getData();
    }

    public AlipayTradeCustomsQueryResponseModel query(String outRequestNos, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayTradeCustomsQueryResponseModel> localVarResp = queryWithHttpInfo(outRequestNos, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询报关详细信息
     * 境外商户的商品进口到国内时需要向海关中心报送支付、物流等信息，由海关审核，如果交易是由支付宝支付的话，需要商户调用支付宝报关接口来请求支付宝将其指定交易报送支付单给海关。商户可以通过该接口主动查询报关状态，了解报关详情以及进度。
     * @param outRequestNos 报关请求号。需要查询的商户端报关请求号，支持批量查询，  多个值用英文半角逗号分隔，单次请求最多10个; (optional)
     * @return ApiResponse&lt;AlipayTradeCustomsQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayTradeCustomsQueryResponseModel> queryWithHttpInfo(String outRequestNos, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(outRequestNos, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayTradeCustomsQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayTradeCustomsQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询报关详细信息 (asynchronously)
     * 境外商户的商品进口到国内时需要向海关中心报送支付、物流等信息，由海关审核，如果交易是由支付宝支付的话，需要商户调用支付宝报关接口来请求支付宝将其指定交易报送支付单给海关。商户可以通过该接口主动查询报关状态，了解报关详情以及进度。
     * @param outRequestNos 报关请求号。需要查询的商户端报关请求号，支持批量查询，  多个值用英文半角逗号分隔，单次请求最多10个; (optional)
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
    public okhttp3.Call queryAsync(String outRequestNos, final ApiCallback<AlipayTradeCustomsQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(outRequestNos, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayTradeCustomsQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String outRequestNos, final ApiCallback<AlipayTradeCustomsQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(outRequestNos, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayTradeCustomsQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
