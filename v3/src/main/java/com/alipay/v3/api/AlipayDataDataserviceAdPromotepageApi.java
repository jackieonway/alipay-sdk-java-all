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


import com.alipay.v3.model.AlipayDataDataserviceAdPromotepageBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayDataDataserviceAdPromotepageBatchqueryResponseModel;
import com.alipay.v3.model.AlipayDataDataserviceAdPromotepageDownloadDefaultResponse;
import com.alipay.v3.model.AlipayDataDataserviceAdPromotepageDownloadResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayDataDataserviceAdPromotepageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayDataDataserviceAdPromotepageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayDataDataserviceAdPromotepageApi(ApiClient apiClient) {
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
     * @param bizToken 代理商访问灯火平台的token (optional)
     * @param principalTag 商家标志 (optional)
     * @param type 推广页类型：COLLECT_INFO -  免费留资；TRADE - 付费留资； OPERATION_PAID - 运营商付费留资；待扩展 (optional)
     * @param pageNo 分页参数之页数，从1开始 (optional)
     * @param pageSize 分页参数之每页大小，最大1000 (optional)
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
    public okhttp3.Call batchqueryCall(String bizToken, String principalTag, String type, Integer pageNo, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/data/dataservice/ad/promotepage/batchquery";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (bizToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_token", bizToken));
        }

        if (principalTag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("principal_tag", principalTag));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (pageNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_no", pageNo));
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
    private okhttp3.Call batchqueryValidateBeforeCall(String bizToken, String principalTag, String type, Integer pageNo, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(bizToken, principalTag, type, pageNo, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 自建推广页列表批量查询
     * 用于获取指定商家的自建推广页列表
     * @param bizToken 代理商访问灯火平台的token (optional)
     * @param principalTag 商家标志 (optional)
     * @param type 推广页类型：COLLECT_INFO -  免费留资；TRADE - 付费留资； OPERATION_PAID - 运营商付费留资；待扩展 (optional)
     * @param pageNo 分页参数之页数，从1开始 (optional)
     * @param pageSize 分页参数之每页大小，最大1000 (optional)
     * @return AlipayDataDataserviceAdPromotepageBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayDataDataserviceAdPromotepageBatchqueryResponseModel batchquery(String bizToken, String principalTag, String type, Integer pageNo, Integer pageSize) throws ApiException {
        ApiResponse<AlipayDataDataserviceAdPromotepageBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(bizToken, principalTag, type, pageNo, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayDataDataserviceAdPromotepageBatchqueryResponseModel batchquery(String bizToken, String principalTag, String type, Integer pageNo, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayDataDataserviceAdPromotepageBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(bizToken, principalTag, type, pageNo, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 自建推广页列表批量查询
     * 用于获取指定商家的自建推广页列表
     * @param bizToken 代理商访问灯火平台的token (optional)
     * @param principalTag 商家标志 (optional)
     * @param type 推广页类型：COLLECT_INFO -  免费留资；TRADE - 付费留资； OPERATION_PAID - 运营商付费留资；待扩展 (optional)
     * @param pageNo 分页参数之页数，从1开始 (optional)
     * @param pageSize 分页参数之每页大小，最大1000 (optional)
     * @return ApiResponse&lt;AlipayDataDataserviceAdPromotepageBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayDataDataserviceAdPromotepageBatchqueryResponseModel> batchqueryWithHttpInfo(String bizToken, String principalTag, String type, Integer pageNo, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(bizToken, principalTag, type, pageNo, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayDataDataserviceAdPromotepageBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayDataDataserviceAdPromotepageBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 自建推广页列表批量查询 (asynchronously)
     * 用于获取指定商家的自建推广页列表
     * @param bizToken 代理商访问灯火平台的token (optional)
     * @param principalTag 商家标志 (optional)
     * @param type 推广页类型：COLLECT_INFO -  免费留资；TRADE - 付费留资； OPERATION_PAID - 运营商付费留资；待扩展 (optional)
     * @param pageNo 分页参数之页数，从1开始 (optional)
     * @param pageSize 分页参数之每页大小，最大1000 (optional)
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
    public okhttp3.Call batchqueryAsync(String bizToken, String principalTag, String type, Integer pageNo, Integer pageSize, final ApiCallback<AlipayDataDataserviceAdPromotepageBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(bizToken, principalTag, type, pageNo, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayDataDataserviceAdPromotepageBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call batchqueryAsync(String bizToken, String principalTag, String type, Integer pageNo, Integer pageSize, final ApiCallback<AlipayDataDataserviceAdPromotepageBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(bizToken, principalTag, type, pageNo, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayDataDataserviceAdPromotepageBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for download
     * @param startDate 留资开始日期，格式：yyyy-mm-dd，不能早于30天前 (optional)
     * @param endDate 留资结束日期，格式：yyyy-mm-dd；不能晚于当天 (optional)
     * @param pageNo 分页参数之页数，从1开始 (optional)
     * @param pageSize 分页参数之每页大小，最大1000 (optional)
     * @param bizToken 代理商访问灯火平台的token (optional)
     * @param principalTag 商家标志 (optional)
     * @param promotePageId 推广页id (optional)
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
    public okhttp3.Call downloadCall(String startDate, String endDate, Integer pageNo, Integer pageSize, String bizToken, String principalTag, Integer promotePageId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/data/dataservice/ad/promotepage/download";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (pageNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_no", pageNo));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (bizToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_token", bizToken));
        }

        if (principalTag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("principal_tag", principalTag));
        }

        if (promotePageId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("promote_page_id", promotePageId));
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
    private okhttp3.Call downloadValidateBeforeCall(String startDate, String endDate, Integer pageNo, Integer pageSize, String bizToken, String principalTag, Integer promotePageId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = downloadCall(startDate, endDate, pageNo, pageSize, bizToken, principalTag, promotePageId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 自建推广页留资数据查询
     * 用于获取指定商家指定推广页的留资数据，注意调用频次小于20qps
     * @param startDate 留资开始日期，格式：yyyy-mm-dd，不能早于30天前 (optional)
     * @param endDate 留资结束日期，格式：yyyy-mm-dd；不能晚于当天 (optional)
     * @param pageNo 分页参数之页数，从1开始 (optional)
     * @param pageSize 分页参数之每页大小，最大1000 (optional)
     * @param bizToken 代理商访问灯火平台的token (optional)
     * @param principalTag 商家标志 (optional)
     * @param promotePageId 推广页id (optional)
     * @return AlipayDataDataserviceAdPromotepageDownloadResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayDataDataserviceAdPromotepageDownloadResponseModel download(String startDate, String endDate, Integer pageNo, Integer pageSize, String bizToken, String principalTag, Integer promotePageId) throws ApiException {
        ApiResponse<AlipayDataDataserviceAdPromotepageDownloadResponseModel> localVarResp = downloadWithHttpInfo(startDate, endDate, pageNo, pageSize, bizToken, principalTag, promotePageId, null);
        return localVarResp.getData();
    }

    public AlipayDataDataserviceAdPromotepageDownloadResponseModel download(String startDate, String endDate, Integer pageNo, Integer pageSize, String bizToken, String principalTag, Integer promotePageId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayDataDataserviceAdPromotepageDownloadResponseModel> localVarResp = downloadWithHttpInfo(startDate, endDate, pageNo, pageSize, bizToken, principalTag, promotePageId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 自建推广页留资数据查询
     * 用于获取指定商家指定推广页的留资数据，注意调用频次小于20qps
     * @param startDate 留资开始日期，格式：yyyy-mm-dd，不能早于30天前 (optional)
     * @param endDate 留资结束日期，格式：yyyy-mm-dd；不能晚于当天 (optional)
     * @param pageNo 分页参数之页数，从1开始 (optional)
     * @param pageSize 分页参数之每页大小，最大1000 (optional)
     * @param bizToken 代理商访问灯火平台的token (optional)
     * @param principalTag 商家标志 (optional)
     * @param promotePageId 推广页id (optional)
     * @return ApiResponse&lt;AlipayDataDataserviceAdPromotepageDownloadResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayDataDataserviceAdPromotepageDownloadResponseModel> downloadWithHttpInfo(String startDate, String endDate, Integer pageNo, Integer pageSize, String bizToken, String principalTag, Integer promotePageId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = downloadValidateBeforeCall(startDate, endDate, pageNo, pageSize, bizToken, principalTag, promotePageId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayDataDataserviceAdPromotepageDownloadResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayDataDataserviceAdPromotepageDownloadDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 自建推广页留资数据查询 (asynchronously)
     * 用于获取指定商家指定推广页的留资数据，注意调用频次小于20qps
     * @param startDate 留资开始日期，格式：yyyy-mm-dd，不能早于30天前 (optional)
     * @param endDate 留资结束日期，格式：yyyy-mm-dd；不能晚于当天 (optional)
     * @param pageNo 分页参数之页数，从1开始 (optional)
     * @param pageSize 分页参数之每页大小，最大1000 (optional)
     * @param bizToken 代理商访问灯火平台的token (optional)
     * @param principalTag 商家标志 (optional)
     * @param promotePageId 推广页id (optional)
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
    public okhttp3.Call downloadAsync(String startDate, String endDate, Integer pageNo, Integer pageSize, String bizToken, String principalTag, Integer promotePageId, final ApiCallback<AlipayDataDataserviceAdPromotepageDownloadResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadValidateBeforeCall(startDate, endDate, pageNo, pageSize, bizToken, principalTag, promotePageId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayDataDataserviceAdPromotepageDownloadResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call downloadAsync(String startDate, String endDate, Integer pageNo, Integer pageSize, String bizToken, String principalTag, Integer promotePageId, final ApiCallback<AlipayDataDataserviceAdPromotepageDownloadResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = downloadValidateBeforeCall(startDate, endDate, pageNo, pageSize, bizToken, principalTag, promotePageId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayDataDataserviceAdPromotepageDownloadResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
