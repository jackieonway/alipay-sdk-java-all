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


import com.alipay.v3.model.AlipayMerchantIotDeviceBindDefaultResponse;
import com.alipay.v3.model.AlipayMerchantIotDeviceBindModel;
import com.alipay.v3.model.AlipayMerchantIotDeviceQueryDefaultResponse;
import com.alipay.v3.model.AlipayMerchantIotDeviceQueryResponseModel;
import com.alipay.v3.model.AlipayMerchantIotDeviceVerifyDefaultResponse;
import com.alipay.v3.model.AlipayMerchantIotDeviceVerifyModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMerchantIotDeviceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMerchantIotDeviceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMerchantIotDeviceApi(ApiClient apiClient) {
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
     * Build call for bind
     * @param alipayMerchantIotDeviceBindModel  (optional)
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
    public okhttp3.Call bindCall(AlipayMerchantIotDeviceBindModel alipayMerchantIotDeviceBindModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMerchantIotDeviceBindModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/merchant/iot/device/bind";

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
    private okhttp3.Call bindValidateBeforeCall(AlipayMerchantIotDeviceBindModel alipayMerchantIotDeviceBindModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = bindCall(alipayMerchantIotDeviceBindModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * IoT设备绑定门店
     * 同步IoT设备、商户和门店的绑定关系
     * @param alipayMerchantIotDeviceBindModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object bind(AlipayMerchantIotDeviceBindModel alipayMerchantIotDeviceBindModel) throws ApiException {
        ApiResponse<Object> localVarResp = bindWithHttpInfo(alipayMerchantIotDeviceBindModel, null);
        return localVarResp.getData();
    }

    public Object bind(AlipayMerchantIotDeviceBindModel alipayMerchantIotDeviceBindModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = bindWithHttpInfo(alipayMerchantIotDeviceBindModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * IoT设备绑定门店
     * 同步IoT设备、商户和门店的绑定关系
     * @param alipayMerchantIotDeviceBindModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> bindWithHttpInfo(AlipayMerchantIotDeviceBindModel alipayMerchantIotDeviceBindModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = bindValidateBeforeCall(alipayMerchantIotDeviceBindModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMerchantIotDeviceBindDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * IoT设备绑定门店 (asynchronously)
     * 同步IoT设备、商户和门店的绑定关系
     * @param alipayMerchantIotDeviceBindModel  (optional)
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
    public okhttp3.Call bindAsync(AlipayMerchantIotDeviceBindModel alipayMerchantIotDeviceBindModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = bindValidateBeforeCall(alipayMerchantIotDeviceBindModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call bindAsync(AlipayMerchantIotDeviceBindModel alipayMerchantIotDeviceBindModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = bindValidateBeforeCall(alipayMerchantIotDeviceBindModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param deviceIdType 可选方式 [ID,SN]。ID-使用biztid作为设备唯一识别标识；SN-使用supplier_id、device_sn联合作为设备唯一识别标识。由于不同机型的supplier_id不同，推荐使用 ID 。 (optional)
     * @param bizTid 设备 ID ，device_id_type 为 ID 时填写。 (optional)
     * @param supplierId 设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。 (optional)
     * @param deviceSn 设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。 (optional)
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
    public okhttp3.Call queryCall(String deviceIdType, String bizTid, String supplierId, String deviceSn, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/merchant/iot/device/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (deviceIdType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("device_id_type", deviceIdType));
        }

        if (bizTid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_tid", bizTid));
        }

        if (supplierId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("supplier_id", supplierId));
        }

        if (deviceSn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("device_sn", deviceSn));
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
    private okhttp3.Call queryValidateBeforeCall(String deviceIdType, String bizTid, String supplierId, String deviceSn, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(deviceIdType, bizTid, supplierId, deviceSn, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * IoT设备绑定关系查询
     * 通过设备唯一标识查询设备绑定关系
     * @param deviceIdType 可选方式 [ID,SN]。ID-使用biztid作为设备唯一识别标识；SN-使用supplier_id、device_sn联合作为设备唯一识别标识。由于不同机型的supplier_id不同，推荐使用 ID 。 (optional)
     * @param bizTid 设备 ID ，device_id_type 为 ID 时填写。 (optional)
     * @param supplierId 设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。 (optional)
     * @param deviceSn 设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。 (optional)
     * @return AlipayMerchantIotDeviceQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMerchantIotDeviceQueryResponseModel query(String deviceIdType, String bizTid, String supplierId, String deviceSn) throws ApiException {
        ApiResponse<AlipayMerchantIotDeviceQueryResponseModel> localVarResp = queryWithHttpInfo(deviceIdType, bizTid, supplierId, deviceSn, null);
        return localVarResp.getData();
    }

    public AlipayMerchantIotDeviceQueryResponseModel query(String deviceIdType, String bizTid, String supplierId, String deviceSn, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMerchantIotDeviceQueryResponseModel> localVarResp = queryWithHttpInfo(deviceIdType, bizTid, supplierId, deviceSn, customizedParams);
        return localVarResp.getData();
    }

    /**
     * IoT设备绑定关系查询
     * 通过设备唯一标识查询设备绑定关系
     * @param deviceIdType 可选方式 [ID,SN]。ID-使用biztid作为设备唯一识别标识；SN-使用supplier_id、device_sn联合作为设备唯一识别标识。由于不同机型的supplier_id不同，推荐使用 ID 。 (optional)
     * @param bizTid 设备 ID ，device_id_type 为 ID 时填写。 (optional)
     * @param supplierId 设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。 (optional)
     * @param deviceSn 设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。 (optional)
     * @return ApiResponse&lt;AlipayMerchantIotDeviceQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMerchantIotDeviceQueryResponseModel> queryWithHttpInfo(String deviceIdType, String bizTid, String supplierId, String deviceSn, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(deviceIdType, bizTid, supplierId, deviceSn, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMerchantIotDeviceQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMerchantIotDeviceQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * IoT设备绑定关系查询 (asynchronously)
     * 通过设备唯一标识查询设备绑定关系
     * @param deviceIdType 可选方式 [ID,SN]。ID-使用biztid作为设备唯一识别标识；SN-使用supplier_id、device_sn联合作为设备唯一识别标识。由于不同机型的supplier_id不同，推荐使用 ID 。 (optional)
     * @param bizTid 设备 ID ，device_id_type 为 ID 时填写。 (optional)
     * @param supplierId 设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。 (optional)
     * @param deviceSn 设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。 (optional)
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
    public okhttp3.Call queryAsync(String deviceIdType, String bizTid, String supplierId, String deviceSn, final ApiCallback<AlipayMerchantIotDeviceQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(deviceIdType, bizTid, supplierId, deviceSn, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMerchantIotDeviceQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String deviceIdType, String bizTid, String supplierId, String deviceSn, final ApiCallback<AlipayMerchantIotDeviceQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(deviceIdType, bizTid, supplierId, deviceSn, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMerchantIotDeviceQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for verify
     * @param alipayMerchantIotDeviceVerifyModel  (optional)
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
    public okhttp3.Call verifyCall(AlipayMerchantIotDeviceVerifyModel alipayMerchantIotDeviceVerifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMerchantIotDeviceVerifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/merchant/iot/device/verify";

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
    private okhttp3.Call verifyValidateBeforeCall(AlipayMerchantIotDeviceVerifyModel alipayMerchantIotDeviceVerifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = verifyCall(alipayMerchantIotDeviceVerifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * IoT设备绑定校验
     * 校验IoT设备和商户收单账号的对应关系
     * @param alipayMerchantIotDeviceVerifyModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object verify(AlipayMerchantIotDeviceVerifyModel alipayMerchantIotDeviceVerifyModel) throws ApiException {
        ApiResponse<Object> localVarResp = verifyWithHttpInfo(alipayMerchantIotDeviceVerifyModel, null);
        return localVarResp.getData();
    }

    public Object verify(AlipayMerchantIotDeviceVerifyModel alipayMerchantIotDeviceVerifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = verifyWithHttpInfo(alipayMerchantIotDeviceVerifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * IoT设备绑定校验
     * 校验IoT设备和商户收单账号的对应关系
     * @param alipayMerchantIotDeviceVerifyModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> verifyWithHttpInfo(AlipayMerchantIotDeviceVerifyModel alipayMerchantIotDeviceVerifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = verifyValidateBeforeCall(alipayMerchantIotDeviceVerifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMerchantIotDeviceVerifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * IoT设备绑定校验 (asynchronously)
     * 校验IoT设备和商户收单账号的对应关系
     * @param alipayMerchantIotDeviceVerifyModel  (optional)
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
    public okhttp3.Call verifyAsync(AlipayMerchantIotDeviceVerifyModel alipayMerchantIotDeviceVerifyModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = verifyValidateBeforeCall(alipayMerchantIotDeviceVerifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call verifyAsync(AlipayMerchantIotDeviceVerifyModel alipayMerchantIotDeviceVerifyModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = verifyValidateBeforeCall(alipayMerchantIotDeviceVerifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
