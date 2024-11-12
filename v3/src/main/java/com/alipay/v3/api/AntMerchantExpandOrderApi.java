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


import com.alipay.v3.model.AntMerchantExpandOrderQueryDefaultResponse;
import com.alipay.v3.model.AntMerchantExpandOrderQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AntMerchantExpandOrderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AntMerchantExpandOrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AntMerchantExpandOrderApi(ApiClient apiClient) {
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
     * Build call for query
     * @param orderId 申请单 id。 1.蚂蚁门店管理场景：通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/05afbc4a_ant.merchant.expand.shop.create?scene&#x3D;common&amp;pathHash&#x3D;bf443b73\&quot;&gt; ant.merchant.expand.shop.create&lt;/a&gt;(蚂蚁店铺创建)接口进件时返回的order_id。 2.直付通二级商户进件场景：通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/028xr0?pathHash&#x3D;c9ca6d68\&quot;&gt;ant.merchant.expand.indirect.zft.create&lt;/a&gt;(直付通二级商户创建)接口进件时返回的order_id。  (required)
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
    public okhttp3.Call queryCall(String orderId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/ant/merchant/order/{order_id}"
            .replaceAll("\\{" + "order_id" + "\\}", localVarApiClient.escapeString(orderId.toString()));

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
    private okhttp3.Call queryValidateBeforeCall(String orderId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        
        // verify the required path parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling query(Async)");
        }
        

        okhttp3.Call localVarCall = queryCall(orderId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 商户申请单查询
     * 服务商根据申请单id，查询自己提交的商户进件、管理等申请单
     * @param orderId 申请单 id。 1.蚂蚁门店管理场景：通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/05afbc4a_ant.merchant.expand.shop.create?scene&#x3D;common&amp;pathHash&#x3D;bf443b73\&quot;&gt; ant.merchant.expand.shop.create&lt;/a&gt;(蚂蚁店铺创建)接口进件时返回的order_id。 2.直付通二级商户进件场景：通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/028xr0?pathHash&#x3D;c9ca6d68\&quot;&gt;ant.merchant.expand.indirect.zft.create&lt;/a&gt;(直付通二级商户创建)接口进件时返回的order_id。  (required)
     * @return AntMerchantExpandOrderQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AntMerchantExpandOrderQueryResponseModel query(String orderId) throws ApiException {
        ApiResponse<AntMerchantExpandOrderQueryResponseModel> localVarResp = queryWithHttpInfo(orderId, null);
        return localVarResp.getData();
    }

    public AntMerchantExpandOrderQueryResponseModel query(String orderId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AntMerchantExpandOrderQueryResponseModel> localVarResp = queryWithHttpInfo(orderId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 商户申请单查询
     * 服务商根据申请单id，查询自己提交的商户进件、管理等申请单
     * @param orderId 申请单 id。 1.蚂蚁门店管理场景：通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/05afbc4a_ant.merchant.expand.shop.create?scene&#x3D;common&amp;pathHash&#x3D;bf443b73\&quot;&gt; ant.merchant.expand.shop.create&lt;/a&gt;(蚂蚁店铺创建)接口进件时返回的order_id。 2.直付通二级商户进件场景：通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/028xr0?pathHash&#x3D;c9ca6d68\&quot;&gt;ant.merchant.expand.indirect.zft.create&lt;/a&gt;(直付通二级商户创建)接口进件时返回的order_id。  (required)
     * @return ApiResponse&lt;AntMerchantExpandOrderQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AntMerchantExpandOrderQueryResponseModel> queryWithHttpInfo(String orderId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(orderId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AntMerchantExpandOrderQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AntMerchantExpandOrderQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 商户申请单查询 (asynchronously)
     * 服务商根据申请单id，查询自己提交的商户进件、管理等申请单
     * @param orderId 申请单 id。 1.蚂蚁门店管理场景：通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/05afbc4a_ant.merchant.expand.shop.create?scene&#x3D;common&amp;pathHash&#x3D;bf443b73\&quot;&gt; ant.merchant.expand.shop.create&lt;/a&gt;(蚂蚁店铺创建)接口进件时返回的order_id。 2.直付通二级商户进件场景：通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/028xr0?pathHash&#x3D;c9ca6d68\&quot;&gt;ant.merchant.expand.indirect.zft.create&lt;/a&gt;(直付通二级商户创建)接口进件时返回的order_id。  (required)
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
    public okhttp3.Call queryAsync(String orderId, final ApiCallback<AntMerchantExpandOrderQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(orderId, _callback, null);
        Type localVarReturnType = new TypeToken<AntMerchantExpandOrderQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String orderId, final ApiCallback<AntMerchantExpandOrderQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(orderId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AntMerchantExpandOrderQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
