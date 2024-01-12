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


import com.alipay.v3.model.AlipayEcoSignflowsUrlQueryDefaultResponse;
import com.alipay.v3.model.AlipayEcoSignflowsUrlQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEcoSignflowsUrlApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEcoSignflowsUrlApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEcoSignflowsUrlApi(ApiClient apiClient) {
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
     * @param targetAppId 目标isv应用ID (optional)
     * @param flowId 流程id，通过 &lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\&quot;&gt;创建电子合同签署流程&lt;/a&gt;(alipay.eco.contract.signflows.create)接口获取。 (optional)
     * @param thirdPartyUserId 创建流程时指定个人唯一标识 (optional)
     * @param orgThirdPartyUserId 创建流程时指定企业唯一标识 (optional)
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
    public okhttp3.Call queryCall(String targetAppId, String flowId, String thirdPartyUserId, String orgThirdPartyUserId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/eco/signflows/url/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_app_id", targetAppId));
        }

        if (flowId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("flow_id", flowId));
        }

        if (thirdPartyUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("third_party_user_id", thirdPartyUserId));
        }

        if (orgThirdPartyUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("org_third_party_user_id", orgThirdPartyUserId));
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
    private okhttp3.Call queryValidateBeforeCall(String targetAppId, String flowId, String thirdPartyUserId, String orgThirdPartyUserId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(targetAppId, flowId, thirdPartyUserId, orgThirdPartyUserId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 获取签署地址
     * 创建流程后，获取指定签署人的签署链接地址，可在应用内集成H5签署页，或者通过短信发送签署链接。 传入个人唯一标识，则获取的签署任务链接仅包含个人人的签署任务；如同时传入企业唯一标识，则获取的签署任务链接包含企业与个人的签署任务。 预览链接：支持签署人先查看合同原文，后进行登录并完成签署。适用于应用内集成场景。 签署链接：签署人需要登录后查看合同原文并签署。适用用短信发送场景。
     * @param targetAppId 目标isv应用ID (optional)
     * @param flowId 流程id，通过 &lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\&quot;&gt;创建电子合同签署流程&lt;/a&gt;(alipay.eco.contract.signflows.create)接口获取。 (optional)
     * @param thirdPartyUserId 创建流程时指定个人唯一标识 (optional)
     * @param orgThirdPartyUserId 创建流程时指定企业唯一标识 (optional)
     * @return AlipayEcoSignflowsUrlQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEcoSignflowsUrlQueryResponseModel query(String targetAppId, String flowId, String thirdPartyUserId, String orgThirdPartyUserId) throws ApiException {
        ApiResponse<AlipayEcoSignflowsUrlQueryResponseModel> localVarResp = queryWithHttpInfo(targetAppId, flowId, thirdPartyUserId, orgThirdPartyUserId, null);
        return localVarResp.getData();
    }

    public AlipayEcoSignflowsUrlQueryResponseModel query(String targetAppId, String flowId, String thirdPartyUserId, String orgThirdPartyUserId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEcoSignflowsUrlQueryResponseModel> localVarResp = queryWithHttpInfo(targetAppId, flowId, thirdPartyUserId, orgThirdPartyUserId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 获取签署地址
     * 创建流程后，获取指定签署人的签署链接地址，可在应用内集成H5签署页，或者通过短信发送签署链接。 传入个人唯一标识，则获取的签署任务链接仅包含个人人的签署任务；如同时传入企业唯一标识，则获取的签署任务链接包含企业与个人的签署任务。 预览链接：支持签署人先查看合同原文，后进行登录并完成签署。适用于应用内集成场景。 签署链接：签署人需要登录后查看合同原文并签署。适用用短信发送场景。
     * @param targetAppId 目标isv应用ID (optional)
     * @param flowId 流程id，通过 &lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\&quot;&gt;创建电子合同签署流程&lt;/a&gt;(alipay.eco.contract.signflows.create)接口获取。 (optional)
     * @param thirdPartyUserId 创建流程时指定个人唯一标识 (optional)
     * @param orgThirdPartyUserId 创建流程时指定企业唯一标识 (optional)
     * @return ApiResponse&lt;AlipayEcoSignflowsUrlQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEcoSignflowsUrlQueryResponseModel> queryWithHttpInfo(String targetAppId, String flowId, String thirdPartyUserId, String orgThirdPartyUserId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(targetAppId, flowId, thirdPartyUserId, orgThirdPartyUserId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEcoSignflowsUrlQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoSignflowsUrlQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 获取签署地址 (asynchronously)
     * 创建流程后，获取指定签署人的签署链接地址，可在应用内集成H5签署页，或者通过短信发送签署链接。 传入个人唯一标识，则获取的签署任务链接仅包含个人人的签署任务；如同时传入企业唯一标识，则获取的签署任务链接包含企业与个人的签署任务。 预览链接：支持签署人先查看合同原文，后进行登录并完成签署。适用于应用内集成场景。 签署链接：签署人需要登录后查看合同原文并签署。适用用短信发送场景。
     * @param targetAppId 目标isv应用ID (optional)
     * @param flowId 流程id，通过 &lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\&quot;&gt;创建电子合同签署流程&lt;/a&gt;(alipay.eco.contract.signflows.create)接口获取。 (optional)
     * @param thirdPartyUserId 创建流程时指定个人唯一标识 (optional)
     * @param orgThirdPartyUserId 创建流程时指定企业唯一标识 (optional)
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
    public okhttp3.Call queryAsync(String targetAppId, String flowId, String thirdPartyUserId, String orgThirdPartyUserId, final ApiCallback<AlipayEcoSignflowsUrlQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(targetAppId, flowId, thirdPartyUserId, orgThirdPartyUserId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEcoSignflowsUrlQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String targetAppId, String flowId, String thirdPartyUserId, String orgThirdPartyUserId, final ApiCallback<AlipayEcoSignflowsUrlQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(targetAppId, flowId, thirdPartyUserId, orgThirdPartyUserId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEcoSignflowsUrlQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
