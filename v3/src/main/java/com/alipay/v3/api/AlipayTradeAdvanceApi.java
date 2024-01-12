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


import com.alipay.v3.model.AlipayTradeAdvanceConsultDefaultResponse;
import com.alipay.v3.model.AlipayTradeAdvanceConsultResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayTradeAdvanceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayTradeAdvanceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayTradeAdvanceApi(ApiClient apiClient) {
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
     * @param alipayUserId 支付宝用户 id，2088开头的16为数字。 除单笔订单风险预评估场景(即consult_scene指定ORDER_RISK_EVALUATION)外，其他场景必选。 (optional)
     * @param consultScene 订单咨询类型，用以选择咨询的服务。不传时默认为垫资咨询，其他的场景需要按照对接的服务传入指定的值。 ORDER_RISK_EVALUATION：表示单笔订单风险预评估。 (optional)
     * @param industryProductCode 行业产品信息，咨询时会从该产品对应的销售方案中获取相关垫资规则配置。 (optional)
     * @param subMerchantId 子商户id (optional)
     * @param subMerchantType 子商户类型 (optional)
     * @param agreementNo 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，在进行单笔订单风险评估预咨询时必传。 (optional)
     * @param estimatedOrderAmount 预估订单总金额，单位为元，精确到小数点后两位，单笔订单风险预评估时使用，取值范围[0.01,100000000]。 (optional)
     * @param outTradeNo 商户请求时的外部订单号，在花芝场景下非空。 (optional)
     * @param needUserRiskPrediction 是否需要进行用户风险预测 (optional)
     * @param tradeDigest 交易信息摘要，需要进行用户风险预测时可传，用于结合场景的更加精细的预测。具体信息结构服务接入前咨询约定。 (optional)
     * @param userOutBindingPhone 用户在外部域账号系统绑定的手机号，需要进行用户风险预测时必传，用于预测用户是否面临被二次放号的场景。使用时需要对请求加密，加密后请求在公网传输时为加密文本。详见：https://opendocs.alipay.com/open/common/104567；https://opendocs.alipay.com/isv/grefvl/getaes (optional)
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
    public okhttp3.Call consultCall(String alipayUserId, String consultScene, String industryProductCode, String subMerchantId, String subMerchantType, String agreementNo, String estimatedOrderAmount, String outTradeNo, String needUserRiskPrediction, String tradeDigest, String userOutBindingPhone, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/trade/advance/consult";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (alipayUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alipay_user_id", alipayUserId));
        }

        if (consultScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("consult_scene", consultScene));
        }

        if (industryProductCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("industry_product_code", industryProductCode));
        }

        if (subMerchantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sub_merchant_id", subMerchantId));
        }

        if (subMerchantType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sub_merchant_type", subMerchantType));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (estimatedOrderAmount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("estimated_order_amount", estimatedOrderAmount));
        }

        if (outTradeNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_trade_no", outTradeNo));
        }

        if (needUserRiskPrediction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("need_user_risk_prediction", needUserRiskPrediction));
        }

        if (tradeDigest != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("trade_digest", tradeDigest));
        }

        if (userOutBindingPhone != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_out_binding_phone", userOutBindingPhone));
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
    private okhttp3.Call consultValidateBeforeCall(String alipayUserId, String consultScene, String industryProductCode, String subMerchantId, String subMerchantType, String agreementNo, String estimatedOrderAmount, String outTradeNo, String needUserRiskPrediction, String tradeDigest, String userOutBindingPhone, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = consultCall(alipayUserId, consultScene, industryProductCode, subMerchantId, subMerchantType, agreementNo, estimatedOrderAmount, outTradeNo, needUserRiskPrediction, tradeDigest, userOutBindingPhone, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 订单咨询服务
     * 商户通过此接口咨询，当前用户是否满足垫资服务条件 或者 针对单笔订单的风险评估进行预咨询服务。
     * @param alipayUserId 支付宝用户 id，2088开头的16为数字。 除单笔订单风险预评估场景(即consult_scene指定ORDER_RISK_EVALUATION)外，其他场景必选。 (optional)
     * @param consultScene 订单咨询类型，用以选择咨询的服务。不传时默认为垫资咨询，其他的场景需要按照对接的服务传入指定的值。 ORDER_RISK_EVALUATION：表示单笔订单风险预评估。 (optional)
     * @param industryProductCode 行业产品信息，咨询时会从该产品对应的销售方案中获取相关垫资规则配置。 (optional)
     * @param subMerchantId 子商户id (optional)
     * @param subMerchantType 子商户类型 (optional)
     * @param agreementNo 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，在进行单笔订单风险评估预咨询时必传。 (optional)
     * @param estimatedOrderAmount 预估订单总金额，单位为元，精确到小数点后两位，单笔订单风险预评估时使用，取值范围[0.01,100000000]。 (optional)
     * @param outTradeNo 商户请求时的外部订单号，在花芝场景下非空。 (optional)
     * @param needUserRiskPrediction 是否需要进行用户风险预测 (optional)
     * @param tradeDigest 交易信息摘要，需要进行用户风险预测时可传，用于结合场景的更加精细的预测。具体信息结构服务接入前咨询约定。 (optional)
     * @param userOutBindingPhone 用户在外部域账号系统绑定的手机号，需要进行用户风险预测时必传，用于预测用户是否面临被二次放号的场景。使用时需要对请求加密，加密后请求在公网传输时为加密文本。详见：https://opendocs.alipay.com/open/common/104567；https://opendocs.alipay.com/isv/grefvl/getaes (optional)
     * @return AlipayTradeAdvanceConsultResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayTradeAdvanceConsultResponseModel consult(String alipayUserId, String consultScene, String industryProductCode, String subMerchantId, String subMerchantType, String agreementNo, String estimatedOrderAmount, String outTradeNo, String needUserRiskPrediction, String tradeDigest, String userOutBindingPhone) throws ApiException {
        ApiResponse<AlipayTradeAdvanceConsultResponseModel> localVarResp = consultWithHttpInfo(alipayUserId, consultScene, industryProductCode, subMerchantId, subMerchantType, agreementNo, estimatedOrderAmount, outTradeNo, needUserRiskPrediction, tradeDigest, userOutBindingPhone, null);
        return localVarResp.getData();
    }

    public AlipayTradeAdvanceConsultResponseModel consult(String alipayUserId, String consultScene, String industryProductCode, String subMerchantId, String subMerchantType, String agreementNo, String estimatedOrderAmount, String outTradeNo, String needUserRiskPrediction, String tradeDigest, String userOutBindingPhone, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayTradeAdvanceConsultResponseModel> localVarResp = consultWithHttpInfo(alipayUserId, consultScene, industryProductCode, subMerchantId, subMerchantType, agreementNo, estimatedOrderAmount, outTradeNo, needUserRiskPrediction, tradeDigest, userOutBindingPhone, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 订单咨询服务
     * 商户通过此接口咨询，当前用户是否满足垫资服务条件 或者 针对单笔订单的风险评估进行预咨询服务。
     * @param alipayUserId 支付宝用户 id，2088开头的16为数字。 除单笔订单风险预评估场景(即consult_scene指定ORDER_RISK_EVALUATION)外，其他场景必选。 (optional)
     * @param consultScene 订单咨询类型，用以选择咨询的服务。不传时默认为垫资咨询，其他的场景需要按照对接的服务传入指定的值。 ORDER_RISK_EVALUATION：表示单笔订单风险预评估。 (optional)
     * @param industryProductCode 行业产品信息，咨询时会从该产品对应的销售方案中获取相关垫资规则配置。 (optional)
     * @param subMerchantId 子商户id (optional)
     * @param subMerchantType 子商户类型 (optional)
     * @param agreementNo 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，在进行单笔订单风险评估预咨询时必传。 (optional)
     * @param estimatedOrderAmount 预估订单总金额，单位为元，精确到小数点后两位，单笔订单风险预评估时使用，取值范围[0.01,100000000]。 (optional)
     * @param outTradeNo 商户请求时的外部订单号，在花芝场景下非空。 (optional)
     * @param needUserRiskPrediction 是否需要进行用户风险预测 (optional)
     * @param tradeDigest 交易信息摘要，需要进行用户风险预测时可传，用于结合场景的更加精细的预测。具体信息结构服务接入前咨询约定。 (optional)
     * @param userOutBindingPhone 用户在外部域账号系统绑定的手机号，需要进行用户风险预测时必传，用于预测用户是否面临被二次放号的场景。使用时需要对请求加密，加密后请求在公网传输时为加密文本。详见：https://opendocs.alipay.com/open/common/104567；https://opendocs.alipay.com/isv/grefvl/getaes (optional)
     * @return ApiResponse&lt;AlipayTradeAdvanceConsultResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayTradeAdvanceConsultResponseModel> consultWithHttpInfo(String alipayUserId, String consultScene, String industryProductCode, String subMerchantId, String subMerchantType, String agreementNo, String estimatedOrderAmount, String outTradeNo, String needUserRiskPrediction, String tradeDigest, String userOutBindingPhone, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = consultValidateBeforeCall(alipayUserId, consultScene, industryProductCode, subMerchantId, subMerchantType, agreementNo, estimatedOrderAmount, outTradeNo, needUserRiskPrediction, tradeDigest, userOutBindingPhone, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayTradeAdvanceConsultResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayTradeAdvanceConsultDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 订单咨询服务 (asynchronously)
     * 商户通过此接口咨询，当前用户是否满足垫资服务条件 或者 针对单笔订单的风险评估进行预咨询服务。
     * @param alipayUserId 支付宝用户 id，2088开头的16为数字。 除单笔订单风险预评估场景(即consult_scene指定ORDER_RISK_EVALUATION)外，其他场景必选。 (optional)
     * @param consultScene 订单咨询类型，用以选择咨询的服务。不传时默认为垫资咨询，其他的场景需要按照对接的服务传入指定的值。 ORDER_RISK_EVALUATION：表示单笔订单风险预评估。 (optional)
     * @param industryProductCode 行业产品信息，咨询时会从该产品对应的销售方案中获取相关垫资规则配置。 (optional)
     * @param subMerchantId 子商户id (optional)
     * @param subMerchantType 子商户类型 (optional)
     * @param agreementNo 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，在进行单笔订单风险评估预咨询时必传。 (optional)
     * @param estimatedOrderAmount 预估订单总金额，单位为元，精确到小数点后两位，单笔订单风险预评估时使用，取值范围[0.01,100000000]。 (optional)
     * @param outTradeNo 商户请求时的外部订单号，在花芝场景下非空。 (optional)
     * @param needUserRiskPrediction 是否需要进行用户风险预测 (optional)
     * @param tradeDigest 交易信息摘要，需要进行用户风险预测时可传，用于结合场景的更加精细的预测。具体信息结构服务接入前咨询约定。 (optional)
     * @param userOutBindingPhone 用户在外部域账号系统绑定的手机号，需要进行用户风险预测时必传，用于预测用户是否面临被二次放号的场景。使用时需要对请求加密，加密后请求在公网传输时为加密文本。详见：https://opendocs.alipay.com/open/common/104567；https://opendocs.alipay.com/isv/grefvl/getaes (optional)
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
    public okhttp3.Call consultAsync(String alipayUserId, String consultScene, String industryProductCode, String subMerchantId, String subMerchantType, String agreementNo, String estimatedOrderAmount, String outTradeNo, String needUserRiskPrediction, String tradeDigest, String userOutBindingPhone, final ApiCallback<AlipayTradeAdvanceConsultResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(alipayUserId, consultScene, industryProductCode, subMerchantId, subMerchantType, agreementNo, estimatedOrderAmount, outTradeNo, needUserRiskPrediction, tradeDigest, userOutBindingPhone, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayTradeAdvanceConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call consultAsync(String alipayUserId, String consultScene, String industryProductCode, String subMerchantId, String subMerchantType, String agreementNo, String estimatedOrderAmount, String outTradeNo, String needUserRiskPrediction, String tradeDigest, String userOutBindingPhone, final ApiCallback<AlipayTradeAdvanceConsultResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(alipayUserId, consultScene, industryProductCode, subMerchantId, subMerchantType, agreementNo, estimatedOrderAmount, outTradeNo, needUserRiskPrediction, tradeDigest, userOutBindingPhone, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayTradeAdvanceConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
