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


import com.alipay.v3.model.AlipayDataBillEreceiptApplyDefaultResponse;
import com.alipay.v3.model.AlipayDataBillEreceiptApplyModel;
import com.alipay.v3.model.AlipayDataBillEreceiptApplyResponseModel;
import com.alipay.v3.model.AlipayDataBillEreceiptQueryDefaultResponse;
import com.alipay.v3.model.AlipayDataBillEreceiptQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayDataBillEreceiptApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayDataBillEreceiptApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayDataBillEreceiptApi(ApiClient apiClient) {
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
     * @param alipayDataBillEreceiptApplyModel  (optional)
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
    public okhttp3.Call applyCall(AlipayDataBillEreceiptApplyModel alipayDataBillEreceiptApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayDataBillEreceiptApplyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/data/bill/ereceipt/apply";

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
    private okhttp3.Call applyValidateBeforeCall(AlipayDataBillEreceiptApplyModel alipayDataBillEreceiptApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = applyCall(alipayDataBillEreceiptApplyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 申请电子回单(incubating)
     * 支持商家下载多种类型支付宝资金凭证。包括：余额收支证明、余额收支流水证明、转入转出收支证明、收支汇总证明（日汇总）以及收支汇总证明（月汇总）。  账单凭证申请分两个步骤：  1、使用alipay.data.bill.ereceipt.apply创建申请，并获取file_id信息。  2、使用file_id查询alipay.data.bill.ereceipt.query获取回单信息，回单生成完毕将会返回对应的下载链接，下载链接时效为30秒，过期将无法下载，需重新调用alipay.data.bill.ereceipt.query获取新的下载链接。
     * @param alipayDataBillEreceiptApplyModel  (optional)
     * @return AlipayDataBillEreceiptApplyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayDataBillEreceiptApplyResponseModel apply(AlipayDataBillEreceiptApplyModel alipayDataBillEreceiptApplyModel) throws ApiException {
        ApiResponse<AlipayDataBillEreceiptApplyResponseModel> localVarResp = applyWithHttpInfo(alipayDataBillEreceiptApplyModel, null);
        return localVarResp.getData();
    }

    public AlipayDataBillEreceiptApplyResponseModel apply(AlipayDataBillEreceiptApplyModel alipayDataBillEreceiptApplyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayDataBillEreceiptApplyResponseModel> localVarResp = applyWithHttpInfo(alipayDataBillEreceiptApplyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 申请电子回单(incubating)
     * 支持商家下载多种类型支付宝资金凭证。包括：余额收支证明、余额收支流水证明、转入转出收支证明、收支汇总证明（日汇总）以及收支汇总证明（月汇总）。  账单凭证申请分两个步骤：  1、使用alipay.data.bill.ereceipt.apply创建申请，并获取file_id信息。  2、使用file_id查询alipay.data.bill.ereceipt.query获取回单信息，回单生成完毕将会返回对应的下载链接，下载链接时效为30秒，过期将无法下载，需重新调用alipay.data.bill.ereceipt.query获取新的下载链接。
     * @param alipayDataBillEreceiptApplyModel  (optional)
     * @return ApiResponse&lt;AlipayDataBillEreceiptApplyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayDataBillEreceiptApplyResponseModel> applyWithHttpInfo(AlipayDataBillEreceiptApplyModel alipayDataBillEreceiptApplyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayDataBillEreceiptApplyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayDataBillEreceiptApplyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayDataBillEreceiptApplyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 申请电子回单(incubating) (asynchronously)
     * 支持商家下载多种类型支付宝资金凭证。包括：余额收支证明、余额收支流水证明、转入转出收支证明、收支汇总证明（日汇总）以及收支汇总证明（月汇总）。  账单凭证申请分两个步骤：  1、使用alipay.data.bill.ereceipt.apply创建申请，并获取file_id信息。  2、使用file_id查询alipay.data.bill.ereceipt.query获取回单信息，回单生成完毕将会返回对应的下载链接，下载链接时效为30秒，过期将无法下载，需重新调用alipay.data.bill.ereceipt.query获取新的下载链接。
     * @param alipayDataBillEreceiptApplyModel  (optional)
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
    public okhttp3.Call applyAsync(AlipayDataBillEreceiptApplyModel alipayDataBillEreceiptApplyModel, final ApiCallback<AlipayDataBillEreceiptApplyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayDataBillEreceiptApplyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayDataBillEreceiptApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call applyAsync(AlipayDataBillEreceiptApplyModel alipayDataBillEreceiptApplyModel, final ApiCallback<AlipayDataBillEreceiptApplyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(alipayDataBillEreceiptApplyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayDataBillEreceiptApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param fileId 根据申请id查询状态。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_15/alipay.data.bill.ereceipt.apply\&quot;&gt;alipay.data.bill.ereceipt.apply(申请电子回单(incubating))&lt;/a&gt; 接口同步响应获取。 (optional)
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
    public okhttp3.Call queryCall(String fileId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/data/bill/ereceipt/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fileId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("file_id", fileId));
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
    private okhttp3.Call queryValidateBeforeCall(String fileId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(fileId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询电子回单状态(incubating)
     * 电子签章申请分两个步骤：  1、使用alipay.data.bill.ereceipt.apply创建申请，并获取file_id信息。 2、等待一段时间后，使用file_id查询alipay.data.bill.ereceipt.query申请信息。  单个申请建议每5分钟查询一次状态。批量回单建议20分钟查询一次。汇总回单建议30分钟查询一次
     * @param fileId 根据申请id查询状态。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_15/alipay.data.bill.ereceipt.apply\&quot;&gt;alipay.data.bill.ereceipt.apply(申请电子回单(incubating))&lt;/a&gt; 接口同步响应获取。 (optional)
     * @return AlipayDataBillEreceiptQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayDataBillEreceiptQueryResponseModel query(String fileId) throws ApiException {
        ApiResponse<AlipayDataBillEreceiptQueryResponseModel> localVarResp = queryWithHttpInfo(fileId, null);
        return localVarResp.getData();
    }

    public AlipayDataBillEreceiptQueryResponseModel query(String fileId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayDataBillEreceiptQueryResponseModel> localVarResp = queryWithHttpInfo(fileId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询电子回单状态(incubating)
     * 电子签章申请分两个步骤：  1、使用alipay.data.bill.ereceipt.apply创建申请，并获取file_id信息。 2、等待一段时间后，使用file_id查询alipay.data.bill.ereceipt.query申请信息。  单个申请建议每5分钟查询一次状态。批量回单建议20分钟查询一次。汇总回单建议30分钟查询一次
     * @param fileId 根据申请id查询状态。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_15/alipay.data.bill.ereceipt.apply\&quot;&gt;alipay.data.bill.ereceipt.apply(申请电子回单(incubating))&lt;/a&gt; 接口同步响应获取。 (optional)
     * @return ApiResponse&lt;AlipayDataBillEreceiptQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayDataBillEreceiptQueryResponseModel> queryWithHttpInfo(String fileId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(fileId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayDataBillEreceiptQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayDataBillEreceiptQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询电子回单状态(incubating) (asynchronously)
     * 电子签章申请分两个步骤：  1、使用alipay.data.bill.ereceipt.apply创建申请，并获取file_id信息。 2、等待一段时间后，使用file_id查询alipay.data.bill.ereceipt.query申请信息。  单个申请建议每5分钟查询一次状态。批量回单建议20分钟查询一次。汇总回单建议30分钟查询一次
     * @param fileId 根据申请id查询状态。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_15/alipay.data.bill.ereceipt.apply\&quot;&gt;alipay.data.bill.ereceipt.apply(申请电子回单(incubating))&lt;/a&gt; 接口同步响应获取。 (optional)
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
    public okhttp3.Call queryAsync(String fileId, final ApiCallback<AlipayDataBillEreceiptQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(fileId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayDataBillEreceiptQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String fileId, final ApiCallback<AlipayDataBillEreceiptQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(fileId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayDataBillEreceiptQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
