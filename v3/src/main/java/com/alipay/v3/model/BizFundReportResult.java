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


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * BizFundReportResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BizFundReportResult {
  public static final String SERIALIZED_NAME_ALIPAY_AMOUNT = "alipay_amount";
  @SerializedName(SERIALIZED_NAME_ALIPAY_AMOUNT)
  private String alipayAmount;

  public static final String SERIALIZED_NAME_BATCH_TYPE = "batch_type";
  @SerializedName(SERIALIZED_NAME_BATCH_TYPE)
  private String batchType;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_BIZ_TYPE_DESC = "biz_type_desc";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE_DESC)
  private String bizTypeDesc;

  public static final String SERIALIZED_NAME_CHARGE_FEE = "charge_fee";
  @SerializedName(SERIALIZED_NAME_CHARGE_FEE)
  private String chargeFee;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_INSTRUCTION_ID = "instruction_id";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION_ID)
  private String instructionId;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_NO_MBILL_ENCRYPT = "no_mbill_encrypt";
  @SerializedName(SERIALIZED_NAME_NO_MBILL_ENCRYPT)
  private String noMbillEncrypt;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private String payAmount;

  public static final String SERIALIZED_NAME_PAYEE_CARD_NO = "payee_card_no";
  @SerializedName(SERIALIZED_NAME_PAYEE_CARD_NO)
  private String payeeCardNo;

  public static final String SERIALIZED_NAME_PAYEE_FULL_NAME = "payee_full_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_FULL_NAME)
  private String payeeFullName;

  public static final String SERIALIZED_NAME_PAYEE_FUND_TYPE = "payee_fund_type";
  @SerializedName(SERIALIZED_NAME_PAYEE_FUND_TYPE)
  private String payeeFundType;

  public static final String SERIALIZED_NAME_PAYEE_FUND_TYPE_DESC = "payee_fund_type_desc";
  @SerializedName(SERIALIZED_NAME_PAYEE_FUND_TYPE_DESC)
  private String payeeFundTypeDesc;

  public static final String SERIALIZED_NAME_PAYEE_INST_NAME = "payee_inst_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_INST_NAME)
  private String payeeInstName;

  public static final String SERIALIZED_NAME_PAYEE_LOGIN_EMAIL = "payee_login_email";
  @SerializedName(SERIALIZED_NAME_PAYEE_LOGIN_EMAIL)
  private String payeeLoginEmail;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "payee_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName;

  public static final String SERIALIZED_NAME_PAYER_FUND_TYPE = "payer_fund_type";
  @SerializedName(SERIALIZED_NAME_PAYER_FUND_TYPE)
  private String payerFundType;

  public static final String SERIALIZED_NAME_PAYER_FUND_TYPE_DESC = "payer_fund_type_desc";
  @SerializedName(SERIALIZED_NAME_PAYER_FUND_TYPE_DESC)
  private String payerFundTypeDesc;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_SHOW_DETAIL = "show_detail";
  @SerializedName(SERIALIZED_NAME_SHOW_DETAIL)
  private String showDetail;

  public static final String SERIALIZED_NAME_SHOW_VOUCHER = "show_voucher";
  @SerializedName(SERIALIZED_NAME_SHOW_VOUCHER)
  private String showVoucher;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DESC = "status_desc";
  @SerializedName(SERIALIZED_NAME_STATUS_DESC)
  private String statusDesc;

  public static final String SERIALIZED_NAME_SUB_BIZ_TYPE = "sub_biz_type";
  @SerializedName(SERIALIZED_NAME_SUB_BIZ_TYPE)
  private String subBizType;

  public static final String SERIALIZED_NAME_SUB_BIZ_TYPE_DESC = "sub_biz_type_desc";
  @SerializedName(SERIALIZED_NAME_SUB_BIZ_TYPE_DESC)
  private String subBizTypeDesc;

  public BizFundReportResult() { 
  }

  public BizFundReportResult alipayAmount(String alipayAmount) {
    
    this.alipayAmount = alipayAmount;
    return this;
  }

   /**
   * 实付金额（元）
   * @return alipayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000.0", value = "实付金额（元）")

  public String getAlipayAmount() {
    return alipayAmount;
  }


  public void setAlipayAmount(String alipayAmount) {
    this.alipayAmount = alipayAmount;
  }


  public BizFundReportResult batchType(String batchType) {
    
    this.batchType = batchType;
    return this;
  }

   /**
   * 是否批量转账
   * @return batchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否批量转账")

  public String getBatchType() {
    return batchType;
  }


  public void setBatchType(String batchType) {
    this.batchType = batchType;
  }


  public BizFundReportResult bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 业务类型
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEPOSIT", value = "业务类型")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public BizFundReportResult bizTypeDesc(String bizTypeDesc) {
    
    this.bizTypeDesc = bizTypeDesc;
    return this;
  }

   /**
   * 业务类型描述
   * @return bizTypeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "转账", value = "业务类型描述")

  public String getBizTypeDesc() {
    return bizTypeDesc;
  }


  public void setBizTypeDesc(String bizTypeDesc) {
    this.bizTypeDesc = bizTypeDesc;
  }


  public BizFundReportResult chargeFee(String chargeFee) {
    
    this.chargeFee = chargeFee;
    return this;
  }

   /**
   * 服务费（元）
   * @return chargeFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.00", value = "服务费（元）")

  public String getChargeFee() {
    return chargeFee;
  }


  public void setChargeFee(String chargeFee) {
    this.chargeFee = chargeFee;
  }


  public BizFundReportResult gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 交易时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"2021-06-22 19:47:15\"", value = "交易时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public BizFundReportResult instructionId(String instructionId) {
    
    this.instructionId = instructionId;
    return this;
  }

   /**
   * 2020xxx
   * @return instructionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "银行单据号", value = "2020xxx")

  public String getInstructionId() {
    return instructionId;
  }


  public void setInstructionId(String instructionId) {
    this.instructionId = instructionId;
  }


  public BizFundReportResult memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 出借
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "备注", value = "出借")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public BizFundReportResult noMbillEncrypt(String noMbillEncrypt) {
    
    this.noMbillEncrypt = noMbillEncrypt;
    return this;
  }

   /**
   * 是否脱敏
   * @return noMbillEncrypt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否脱敏")

  public String getNoMbillEncrypt() {
    return noMbillEncrypt;
  }


  public void setNoMbillEncrypt(String noMbillEncrypt) {
    this.noMbillEncrypt = noMbillEncrypt;
  }


  public BizFundReportResult orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 业务订单号
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"20210622*******4\"", value = "业务订单号")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public BizFundReportResult payAmount(String payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 实付金额（元）
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20000.00", value = "实付金额（元）")

  public String getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(String payAmount) {
    this.payAmount = payAmount;
  }


  public BizFundReportResult payeeCardNo(String payeeCardNo) {
    
    this.payeeCardNo = payeeCardNo;
    return this;
  }

   /**
   * 收款方银行卡号
   * @return payeeCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23**", value = "收款方银行卡号")

  public String getPayeeCardNo() {
    return payeeCardNo;
  }


  public void setPayeeCardNo(String payeeCardNo) {
    this.payeeCardNo = payeeCardNo;
  }


  public BizFundReportResult payeeFullName(String payeeFullName) {
    
    this.payeeFullName = payeeFullName;
    return this;
  }

   /**
   * 收款方全名
   * @return payeeFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "**(123213**)", value = "收款方全名")

  public String getPayeeFullName() {
    return payeeFullName;
  }


  public void setPayeeFullName(String payeeFullName) {
    this.payeeFullName = payeeFullName;
  }


  public BizFundReportResult payeeFundType(String payeeFundType) {
    
    this.payeeFundType = payeeFundType;
    return this;
  }

   /**
   * 收款方资金类型
   * @return payeeFundType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "收款方资金类型")

  public String getPayeeFundType() {
    return payeeFundType;
  }


  public void setPayeeFundType(String payeeFundType) {
    this.payeeFundType = payeeFundType;
  }


  public BizFundReportResult payeeFundTypeDesc(String payeeFundTypeDesc) {
    
    this.payeeFundTypeDesc = payeeFundTypeDesc;
    return this;
  }

   /**
   * 支付宝余额
   * @return payeeFundTypeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "收款方资金类型描述", value = "支付宝余额")

  public String getPayeeFundTypeDesc() {
    return payeeFundTypeDesc;
  }


  public void setPayeeFundTypeDesc(String payeeFundTypeDesc) {
    this.payeeFundTypeDesc = payeeFundTypeDesc;
  }


  public BizFundReportResult payeeInstName(String payeeInstName) {
    
    this.payeeInstName = payeeInstName;
    return this;
  }

   /**
   * 收款银行中文简称
   * @return payeeInstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "工行", value = "收款银行中文简称")

  public String getPayeeInstName() {
    return payeeInstName;
  }


  public void setPayeeInstName(String payeeInstName) {
    this.payeeInstName = payeeInstName;
  }


  public BizFundReportResult payeeLoginEmail(String payeeLoginEmail) {
    
    this.payeeLoginEmail = payeeLoginEmail;
    return this;
  }

   /**
   * 收款方登录Id
   * @return payeeLoginEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "888@email.com", value = "收款方登录Id")

  public String getPayeeLoginEmail() {
    return payeeLoginEmail;
  }


  public void setPayeeLoginEmail(String payeeLoginEmail) {
    this.payeeLoginEmail = payeeLoginEmail;
  }


  public BizFundReportResult payeeName(String payeeName) {
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * 收款方姓名
   * @return payeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "**小二", value = "收款方姓名")

  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }


  public BizFundReportResult payerFundType(String payerFundType) {
    
    this.payerFundType = payerFundType;
    return this;
  }

   /**
   * 付款方资金类型
   * @return payerFundType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "付款方资金类型")

  public String getPayerFundType() {
    return payerFundType;
  }


  public void setPayerFundType(String payerFundType) {
    this.payerFundType = payerFundType;
  }


  public BizFundReportResult payerFundTypeDesc(String payerFundTypeDesc) {
    
    this.payerFundTypeDesc = payerFundTypeDesc;
    return this;
  }

   /**
   * 付款方资金类型描述
   * @return payerFundTypeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝余额", value = "付款方资金类型描述")

  public String getPayerFundTypeDesc() {
    return payerFundTypeDesc;
  }


  public void setPayerFundTypeDesc(String payerFundTypeDesc) {
    this.payerFundTypeDesc = payerFundTypeDesc;
  }


  public BizFundReportResult refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 退款金额（元）
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.00", value = "退款金额（元）")

  public String getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public BizFundReportResult showDetail(String showDetail) {
    
    this.showDetail = showDetail;
    return this;
  }

   /**
   * 是否展示细节，默认为true
   * @return showDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否展示细节，默认为true")

  public String getShowDetail() {
    return showDetail;
  }


  public void setShowDetail(String showDetail) {
    this.showDetail = showDetail;
  }


  public BizFundReportResult showVoucher(String showVoucher) {
    
    this.showVoucher = showVoucher;
    return this;
  }

   /**
   * 是否出示凭证
   * @return showVoucher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否出示凭证")

  public String getShowVoucher() {
    return showVoucher;
  }


  public void setShowVoucher(String showVoucher) {
    this.showVoucher = showVoucher;
  }


  public BizFundReportResult source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 数据来源
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bizfund", value = "数据来源")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public BizFundReportResult status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 单据状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "单据状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public BizFundReportResult statusDesc(String statusDesc) {
    
    this.statusDesc = statusDesc;
    return this;
  }

   /**
   * 单据状态描述
   * @return statusDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "成功", value = "单据状态描述")

  public String getStatusDesc() {
    return statusDesc;
  }


  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }


  public BizFundReportResult subBizType(String subBizType) {
    
    this.subBizType = subBizType;
    return this;
  }

   /**
   * 普通转账
   * @return subBizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMMON_TRANSFER", value = "普通转账")

  public String getSubBizType() {
    return subBizType;
  }


  public void setSubBizType(String subBizType) {
    this.subBizType = subBizType;
  }


  public BizFundReportResult subBizTypeDesc(String subBizTypeDesc) {
    
    this.subBizTypeDesc = subBizTypeDesc;
    return this;
  }

   /**
   * 业务子类型描述
   * @return subBizTypeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "普通转账", value = "业务子类型描述")

  public String getSubBizTypeDesc() {
    return subBizTypeDesc;
  }


  public void setSubBizTypeDesc(String subBizTypeDesc) {
    this.subBizTypeDesc = subBizTypeDesc;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BizFundReportResult instance itself
   */
  public BizFundReportResult putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BizFundReportResult bizFundReportResult = (BizFundReportResult) o;
    return Objects.equals(this.alipayAmount, bizFundReportResult.alipayAmount) &&
        Objects.equals(this.batchType, bizFundReportResult.batchType) &&
        Objects.equals(this.bizType, bizFundReportResult.bizType) &&
        Objects.equals(this.bizTypeDesc, bizFundReportResult.bizTypeDesc) &&
        Objects.equals(this.chargeFee, bizFundReportResult.chargeFee) &&
        Objects.equals(this.gmtCreate, bizFundReportResult.gmtCreate) &&
        Objects.equals(this.instructionId, bizFundReportResult.instructionId) &&
        Objects.equals(this.memo, bizFundReportResult.memo) &&
        Objects.equals(this.noMbillEncrypt, bizFundReportResult.noMbillEncrypt) &&
        Objects.equals(this.orderId, bizFundReportResult.orderId) &&
        Objects.equals(this.payAmount, bizFundReportResult.payAmount) &&
        Objects.equals(this.payeeCardNo, bizFundReportResult.payeeCardNo) &&
        Objects.equals(this.payeeFullName, bizFundReportResult.payeeFullName) &&
        Objects.equals(this.payeeFundType, bizFundReportResult.payeeFundType) &&
        Objects.equals(this.payeeFundTypeDesc, bizFundReportResult.payeeFundTypeDesc) &&
        Objects.equals(this.payeeInstName, bizFundReportResult.payeeInstName) &&
        Objects.equals(this.payeeLoginEmail, bizFundReportResult.payeeLoginEmail) &&
        Objects.equals(this.payeeName, bizFundReportResult.payeeName) &&
        Objects.equals(this.payerFundType, bizFundReportResult.payerFundType) &&
        Objects.equals(this.payerFundTypeDesc, bizFundReportResult.payerFundTypeDesc) &&
        Objects.equals(this.refundAmount, bizFundReportResult.refundAmount) &&
        Objects.equals(this.showDetail, bizFundReportResult.showDetail) &&
        Objects.equals(this.showVoucher, bizFundReportResult.showVoucher) &&
        Objects.equals(this.source, bizFundReportResult.source) &&
        Objects.equals(this.status, bizFundReportResult.status) &&
        Objects.equals(this.statusDesc, bizFundReportResult.statusDesc) &&
        Objects.equals(this.subBizType, bizFundReportResult.subBizType) &&
        Objects.equals(this.subBizTypeDesc, bizFundReportResult.subBizTypeDesc)&&
        Objects.equals(this.additionalProperties, bizFundReportResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayAmount, batchType, bizType, bizTypeDesc, chargeFee, gmtCreate, instructionId, memo, noMbillEncrypt, orderId, payAmount, payeeCardNo, payeeFullName, payeeFundType, payeeFundTypeDesc, payeeInstName, payeeLoginEmail, payeeName, payerFundType, payerFundTypeDesc, refundAmount, showDetail, showVoucher, source, status, statusDesc, subBizType, subBizTypeDesc, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BizFundReportResult {\n");
    sb.append("    alipayAmount: ").append(toIndentedString(alipayAmount)).append("\n");
    sb.append("    batchType: ").append(toIndentedString(batchType)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    bizTypeDesc: ").append(toIndentedString(bizTypeDesc)).append("\n");
    sb.append("    chargeFee: ").append(toIndentedString(chargeFee)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    instructionId: ").append(toIndentedString(instructionId)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    noMbillEncrypt: ").append(toIndentedString(noMbillEncrypt)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    payeeCardNo: ").append(toIndentedString(payeeCardNo)).append("\n");
    sb.append("    payeeFullName: ").append(toIndentedString(payeeFullName)).append("\n");
    sb.append("    payeeFundType: ").append(toIndentedString(payeeFundType)).append("\n");
    sb.append("    payeeFundTypeDesc: ").append(toIndentedString(payeeFundTypeDesc)).append("\n");
    sb.append("    payeeInstName: ").append(toIndentedString(payeeInstName)).append("\n");
    sb.append("    payeeLoginEmail: ").append(toIndentedString(payeeLoginEmail)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    payerFundType: ").append(toIndentedString(payerFundType)).append("\n");
    sb.append("    payerFundTypeDesc: ").append(toIndentedString(payerFundTypeDesc)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    showDetail: ").append(toIndentedString(showDetail)).append("\n");
    sb.append("    showVoucher: ").append(toIndentedString(showVoucher)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    subBizType: ").append(toIndentedString(subBizType)).append("\n");
    sb.append("    subBizTypeDesc: ").append(toIndentedString(subBizTypeDesc)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("alipay_amount");
    openapiFields.add("batch_type");
    openapiFields.add("biz_type");
    openapiFields.add("biz_type_desc");
    openapiFields.add("charge_fee");
    openapiFields.add("gmt_create");
    openapiFields.add("instruction_id");
    openapiFields.add("memo");
    openapiFields.add("no_mbill_encrypt");
    openapiFields.add("order_id");
    openapiFields.add("pay_amount");
    openapiFields.add("payee_card_no");
    openapiFields.add("payee_full_name");
    openapiFields.add("payee_fund_type");
    openapiFields.add("payee_fund_type_desc");
    openapiFields.add("payee_inst_name");
    openapiFields.add("payee_login_email");
    openapiFields.add("payee_name");
    openapiFields.add("payer_fund_type");
    openapiFields.add("payer_fund_type_desc");
    openapiFields.add("refund_amount");
    openapiFields.add("show_detail");
    openapiFields.add("show_voucher");
    openapiFields.add("source");
    openapiFields.add("status");
    openapiFields.add("status_desc");
    openapiFields.add("sub_biz_type");
    openapiFields.add("sub_biz_type_desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BizFundReportResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BizFundReportResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BizFundReportResult is not found in the empty JSON string", BizFundReportResult.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("alipay_amount") != null && !jsonObj.get("alipay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_amount").toString()));
      }
      if (jsonObj.get("batch_type") != null && !jsonObj.get("batch_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_type").toString()));
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("biz_type_desc") != null && !jsonObj.get("biz_type_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type_desc").toString()));
      }
      if (jsonObj.get("charge_fee") != null && !jsonObj.get("charge_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_fee").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("instruction_id") != null && !jsonObj.get("instruction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instruction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instruction_id").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("no_mbill_encrypt") != null && !jsonObj.get("no_mbill_encrypt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `no_mbill_encrypt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("no_mbill_encrypt").toString()));
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("pay_amount") != null && !jsonObj.get("pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_amount").toString()));
      }
      if (jsonObj.get("payee_card_no") != null && !jsonObj.get("payee_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_card_no").toString()));
      }
      if (jsonObj.get("payee_full_name") != null && !jsonObj.get("payee_full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_full_name").toString()));
      }
      if (jsonObj.get("payee_fund_type") != null && !jsonObj.get("payee_fund_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_fund_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_fund_type").toString()));
      }
      if (jsonObj.get("payee_fund_type_desc") != null && !jsonObj.get("payee_fund_type_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_fund_type_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_fund_type_desc").toString()));
      }
      if (jsonObj.get("payee_inst_name") != null && !jsonObj.get("payee_inst_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_inst_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_inst_name").toString()));
      }
      if (jsonObj.get("payee_login_email") != null && !jsonObj.get("payee_login_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_login_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_login_email").toString()));
      }
      if (jsonObj.get("payee_name") != null && !jsonObj.get("payee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_name").toString()));
      }
      if (jsonObj.get("payer_fund_type") != null && !jsonObj.get("payer_fund_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_fund_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_fund_type").toString()));
      }
      if (jsonObj.get("payer_fund_type_desc") != null && !jsonObj.get("payer_fund_type_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_fund_type_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_fund_type_desc").toString()));
      }
      if (jsonObj.get("refund_amount") != null && !jsonObj.get("refund_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_amount").toString()));
      }
      if (jsonObj.get("show_detail") != null && !jsonObj.get("show_detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `show_detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("show_detail").toString()));
      }
      if (jsonObj.get("show_voucher") != null && !jsonObj.get("show_voucher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `show_voucher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("show_voucher").toString()));
      }
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("status_desc") != null && !jsonObj.get("status_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_desc").toString()));
      }
      if (jsonObj.get("sub_biz_type") != null && !jsonObj.get("sub_biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_biz_type").toString()));
      }
      if (jsonObj.get("sub_biz_type_desc") != null && !jsonObj.get("sub_biz_type_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_biz_type_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_biz_type_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BizFundReportResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BizFundReportResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BizFundReportResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BizFundReportResult.class));

       return (TypeAdapter<T>) new TypeAdapter<BizFundReportResult>() {
           @Override
           public void write(JsonWriter out, BizFundReportResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BizFundReportResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BizFundReportResult instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BizFundReportResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BizFundReportResult
  * @throws IOException if the JSON string is invalid with respect to BizFundReportResult
  */
  public static BizFundReportResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BizFundReportResult.class);
  }

 /**
  * Convert an instance of BizFundReportResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

