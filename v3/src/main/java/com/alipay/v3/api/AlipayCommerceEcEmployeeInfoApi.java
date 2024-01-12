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


import com.alipay.v3.model.AlipayCommerceEcEmployeeInfoModifyDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEcEmployeeInfoModifyModel;
import com.alipay.v3.model.AlipayCommerceEcEmployeeInfoModifyResponseModel;
import com.alipay.v3.model.AlipayCommerceEcEmployeeInfoQueryDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEcEmployeeInfoQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayCommerceEcEmployeeInfoApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayCommerceEcEmployeeInfoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayCommerceEcEmployeeInfoApi(ApiClient apiClient) {
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
     * Build call for modify
     * @param alipayCommerceEcEmployeeInfoModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayCommerceEcEmployeeInfoModifyModel alipayCommerceEcEmployeeInfoModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayCommerceEcEmployeeInfoModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/commerce/ec/employee/info";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyValidateBeforeCall(AlipayCommerceEcEmployeeInfoModifyModel alipayCommerceEcEmployeeInfoModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayCommerceEcEmployeeInfoModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 员工信息修改
     * 员工信息修改
     * @param alipayCommerceEcEmployeeInfoModifyModel  (optional)
     * @return AlipayCommerceEcEmployeeInfoModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEcEmployeeInfoModifyResponseModel modify(AlipayCommerceEcEmployeeInfoModifyModel alipayCommerceEcEmployeeInfoModifyModel) throws ApiException {
        ApiResponse<AlipayCommerceEcEmployeeInfoModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayCommerceEcEmployeeInfoModifyModel, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEcEmployeeInfoModifyResponseModel modify(AlipayCommerceEcEmployeeInfoModifyModel alipayCommerceEcEmployeeInfoModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEcEmployeeInfoModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayCommerceEcEmployeeInfoModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 员工信息修改
     * 员工信息修改
     * @param alipayCommerceEcEmployeeInfoModifyModel  (optional)
     * @return ApiResponse&lt;AlipayCommerceEcEmployeeInfoModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEcEmployeeInfoModifyResponseModel> modifyWithHttpInfo(AlipayCommerceEcEmployeeInfoModifyModel alipayCommerceEcEmployeeInfoModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayCommerceEcEmployeeInfoModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEcEmployeeInfoModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEcEmployeeInfoModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 员工信息修改 (asynchronously)
     * 员工信息修改
     * @param alipayCommerceEcEmployeeInfoModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayCommerceEcEmployeeInfoModifyModel alipayCommerceEcEmployeeInfoModifyModel, final ApiCallback<AlipayCommerceEcEmployeeInfoModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayCommerceEcEmployeeInfoModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEmployeeInfoModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call modifyAsync(AlipayCommerceEcEmployeeInfoModifyModel alipayCommerceEcEmployeeInfoModifyModel, final ApiCallback<AlipayCommerceEcEmployeeInfoModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayCommerceEcEmployeeInfoModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEmployeeInfoModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param enterpriseId 企业id (optional)
     * @param employeeId 员工id (optional)
     * @param openId 蚂蚁统一会员ID (optional)
     * @param userId 蚂蚁统一会员ID (optional)
     * @param mobile 员工手机号码 (optional)
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
    public okhttp3.Call queryCall(String enterpriseId, String employeeId, String openId, String userId, String mobile, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/commerce/ec/employee/info/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (enterpriseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enterprise_id", enterpriseId));
        }

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employee_id", employeeId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_id", userId));
        }

        if (mobile != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mobile", mobile));
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
    private okhttp3.Call queryValidateBeforeCall(String enterpriseId, String employeeId, String openId, String userId, String mobile, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(enterpriseId, employeeId, openId, userId, mobile, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询员工详情
     * 根据员工id或员工uid查询企业下某个员工的详细信息
     * @param enterpriseId 企业id (optional)
     * @param employeeId 员工id (optional)
     * @param openId 蚂蚁统一会员ID (optional)
     * @param userId 蚂蚁统一会员ID (optional)
     * @param mobile 员工手机号码 (optional)
     * @return AlipayCommerceEcEmployeeInfoQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEcEmployeeInfoQueryResponseModel query(String enterpriseId, String employeeId, String openId, String userId, String mobile) throws ApiException {
        ApiResponse<AlipayCommerceEcEmployeeInfoQueryResponseModel> localVarResp = queryWithHttpInfo(enterpriseId, employeeId, openId, userId, mobile, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEcEmployeeInfoQueryResponseModel query(String enterpriseId, String employeeId, String openId, String userId, String mobile, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEcEmployeeInfoQueryResponseModel> localVarResp = queryWithHttpInfo(enterpriseId, employeeId, openId, userId, mobile, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询员工详情
     * 根据员工id或员工uid查询企业下某个员工的详细信息
     * @param enterpriseId 企业id (optional)
     * @param employeeId 员工id (optional)
     * @param openId 蚂蚁统一会员ID (optional)
     * @param userId 蚂蚁统一会员ID (optional)
     * @param mobile 员工手机号码 (optional)
     * @return ApiResponse&lt;AlipayCommerceEcEmployeeInfoQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEcEmployeeInfoQueryResponseModel> queryWithHttpInfo(String enterpriseId, String employeeId, String openId, String userId, String mobile, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, employeeId, openId, userId, mobile, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEcEmployeeInfoQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEcEmployeeInfoQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询员工详情 (asynchronously)
     * 根据员工id或员工uid查询企业下某个员工的详细信息
     * @param enterpriseId 企业id (optional)
     * @param employeeId 员工id (optional)
     * @param openId 蚂蚁统一会员ID (optional)
     * @param userId 蚂蚁统一会员ID (optional)
     * @param mobile 员工手机号码 (optional)
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
    public okhttp3.Call queryAsync(String enterpriseId, String employeeId, String openId, String userId, String mobile, final ApiCallback<AlipayCommerceEcEmployeeInfoQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, employeeId, openId, userId, mobile, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEmployeeInfoQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String enterpriseId, String employeeId, String openId, String userId, String mobile, final ApiCallback<AlipayCommerceEcEmployeeInfoQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, employeeId, openId, userId, mobile, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEmployeeInfoQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
