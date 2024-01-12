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
 * ExpenseConsumeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseConsumeInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACTUAL_ACCOUNT_NUMBER = "actual_account_number";
  @SerializedName(SERIALIZED_NAME_ACTUAL_ACCOUNT_NUMBER)
  private String actualAccountNumber;

  public static final String SERIALIZED_NAME_BATCH_ID = "batch_id";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public static final String SERIALIZED_NAME_BILL_NO = "bill_no";
  @SerializedName(SERIALIZED_NAME_BILL_NO)
  private String billNo;

  public static final String SERIALIZED_NAME_BILL_TYPE = "bill_type";
  @SerializedName(SERIALIZED_NAME_BILL_TYPE)
  private String billType;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_CONSUME_AMOUNT = "consume_amount";
  @SerializedName(SERIALIZED_NAME_CONSUME_AMOUNT)
  private String consumeAmount;

  public static final String SERIALIZED_NAME_CONSUME_DATE = "consume_date";
  @SerializedName(SERIALIZED_NAME_CONSUME_DATE)
  private String consumeDate;

  public static final String SERIALIZED_NAME_CONSUME_TITLE = "consume_title";
  @SerializedName(SERIALIZED_NAME_CONSUME_TITLE)
  private String consumeTitle;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_OPEN_ID = "employee_open_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_OPEN_ID)
  private String employeeOpenId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_MSHOP_ID = "mshop_id";
  @SerializedName(SERIALIZED_NAME_MSHOP_ID)
  private String mshopId;

  public static final String SERIALIZED_NAME_OPEN_MODEL = "open_model";
  @SerializedName(SERIALIZED_NAME_OPEN_MODEL)
  private String openModel;

  public static final String SERIALIZED_NAME_ORIGINAL_VOUCHER_ID = "original_voucher_id";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_VOUCHER_ID)
  private String originalVoucherId;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_P_PAY_AMOUNT = "p_pay_amount";
  @SerializedName(SERIALIZED_NAME_P_PAY_AMOUNT)
  private String pPayAmount;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "payee_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_PROJIECT_ID = "projiect_id";
  @SerializedName(SERIALIZED_NAME_PROJIECT_ID)
  private String projiectId;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_REFUND_STATUS = "refund_status";
  @SerializedName(SERIALIZED_NAME_REFUND_STATUS)
  private String refundStatus;

  public static final String SERIALIZED_NAME_STANDARD_ID = "standard_id";
  @SerializedName(SERIALIZED_NAME_STANDARD_ID)
  private String standardId;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_SUMMARY_ID = "summary_id";
  @SerializedName(SERIALIZED_NAME_SUMMARY_ID)
  private String summaryId;

  public static final String SERIALIZED_NAME_TP_SIGN = "tp_sign";
  @SerializedName(SERIALIZED_NAME_TP_SIGN)
  private String tpSign;

  public static final String SERIALIZED_NAME_VOUCHER_ID = "voucher_id";
  @SerializedName(SERIALIZED_NAME_VOUCHER_ID)
  private String voucherId;

  public ExpenseConsumeInfo() { 
  }

  public ExpenseConsumeInfo accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ExpenseConsumeInfo actualAccountNumber(String actualAccountNumber) {
    
    this.actualAccountNumber = actualAccountNumber;
    return this;
  }

   /**
   * 实际出资企业支付宝账号
   * @return actualAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "实际出资企业支付宝账号")

  public String getActualAccountNumber() {
    return actualAccountNumber;
  }


  public void setActualAccountNumber(String actualAccountNumber) {
    this.actualAccountNumber = actualAccountNumber;
  }


  public ExpenseConsumeInfo batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * 汇总批次ID(废弃)
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "汇总批次ID(废弃)")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  public ExpenseConsumeInfo billNo(String billNo) {
    
    this.billNo = billNo;
    return this;
  }

   /**
   * 支付流水号
   * @return billNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付流水号")

  public String getBillNo() {
    return billNo;
  }


  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }


  public ExpenseConsumeInfo billType(String billType) {
    
    this.billType = billType;
    return this;
  }

   /**
   * 账单类型（CONSUME-消费账单、REFUND-退款、TRANSFER-转账）
   * @return billType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "账单类型（CONSUME-消费账单、REFUND-退款、TRANSFER-转账）")

  public String getBillType() {
    return billType;
  }


  public void setBillType(String billType) {
    this.billType = billType;
  }


  public ExpenseConsumeInfo categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 账单行业分类（交通出行，餐饮美食，商业服务，日用百货等等）
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "账单行业分类（交通出行，餐饮美食，商业服务，日用百货等等）")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public ExpenseConsumeInfo consumeAmount(String consumeAmount) {
    
    this.consumeAmount = consumeAmount;
    return this;
  }

   /**
   * 账单金额（单位：元）
   * @return consumeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "账单金额（单位：元）")

  public String getConsumeAmount() {
    return consumeAmount;
  }


  public void setConsumeAmount(String consumeAmount) {
    this.consumeAmount = consumeAmount;
  }


  public ExpenseConsumeInfo consumeDate(String consumeDate) {
    
    this.consumeDate = consumeDate;
    return this;
  }

   /**
   * 交易日期
   * @return consumeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易日期")

  public String getConsumeDate() {
    return consumeDate;
  }


  public void setConsumeDate(String consumeDate) {
    this.consumeDate = consumeDate;
  }


  public ExpenseConsumeInfo consumeTitle(String consumeTitle) {
    
    this.consumeTitle = consumeTitle;
    return this;
  }

   /**
   * 账单展示标题
   * @return consumeTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "账单展示标题")

  public String getConsumeTitle() {
    return consumeTitle;
  }


  public void setConsumeTitle(String consumeTitle) {
    this.consumeTitle = consumeTitle;
  }


  public ExpenseConsumeInfo employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 所属员工支付宝uid
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "所属员工支付宝uid")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public ExpenseConsumeInfo employeeOpenId(String employeeOpenId) {
    
    this.employeeOpenId = employeeOpenId;
    return this;
  }

   /**
   * 所属员工支付宝uid
   * @return employeeOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "所属员工支付宝uid")

  public String getEmployeeOpenId() {
    return employeeOpenId;
  }


  public void setEmployeeOpenId(String employeeOpenId) {
    this.employeeOpenId = employeeOpenId;
  }


  public ExpenseConsumeInfo merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 商户id
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户id")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public ExpenseConsumeInfo mshopId(String mshopId) {
    
    this.mshopId = mshopId;
    return this;
  }

   /**
   * 门店id
   * @return mshopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门店id")

  public String getMshopId() {
    return mshopId;
  }


  public void setMshopId(String mshopId) {
    this.mshopId = mshopId;
  }


  public ExpenseConsumeInfo openModel(String openModel) {
    
    this.openModel = openModel;
    return this;
  }

   /**
   * 开票模式（汇总开：ENTERPRISE_AUTO_BATCH）
   * @return openModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开票模式（汇总开：ENTERPRISE_AUTO_BATCH）")

  public String getOpenModel() {
    return openModel;
  }


  public void setOpenModel(String openModel) {
    this.openModel = openModel;
  }


  public ExpenseConsumeInfo originalVoucherId(String originalVoucherId) {
    
    this.originalVoucherId = originalVoucherId;
    return this;
  }

   /**
   * 退款交易关联正交易单号(对应正交易的bill_no)
   * @return originalVoucherId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "退款交易关联正交易单号(对应正交易的bill_no)")

  public String getOriginalVoucherId() {
    return originalVoucherId;
  }


  public void setOriginalVoucherId(String originalVoucherId) {
    this.originalVoucherId = originalVoucherId;
  }


  public ExpenseConsumeInfo outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部流水号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外部流水号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public ExpenseConsumeInfo pPayAmount(String pPayAmount) {
    
    this.pPayAmount = pPayAmount;
    return this;
  }

   /**
   * 企业支付金额（单位：元）
   * @return pPayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业支付金额（单位：元）")

  public String getpPayAmount() {
    return pPayAmount;
  }


  public void setpPayAmount(String pPayAmount) {
    this.pPayAmount = pPayAmount;
  }


  public ExpenseConsumeInfo payeeName(String payeeName) {
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * 商家名称
   * @return payeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家名称")

  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }


  public ExpenseConsumeInfo projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 费控规则中的项目ID
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费控规则中的项目ID")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public ExpenseConsumeInfo projiectId(String projiectId) {
    
    this.projiectId = projiectId;
    return this;
  }

   /**
   * 支付使用的项目号（成本中心）此字段废弃
   * @return projiectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付使用的项目号（成本中心）此字段废弃")

  public String getProjiectId() {
    return projiectId;
  }


  public void setProjiectId(String projiectId) {
    this.projiectId = projiectId;
  }


  public ExpenseConsumeInfo refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 消费账单的退款金额（元）
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消费账单的退款金额（元）")

  public String getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public ExpenseConsumeInfo refundStatus(String refundStatus) {
    
    this.refundStatus = refundStatus;
    return this;
  }

   /**
   * 消费账单的退款状态
   * @return refundStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消费账单的退款状态")

  public String getRefundStatus() {
    return refundStatus;
  }


  public void setRefundStatus(String refundStatus) {
    this.refundStatus = refundStatus;
  }


  public ExpenseConsumeInfo standardId(String standardId) {
    
    this.standardId = standardId;
    return this;
  }

   /**
   * 费控规则ID
   * @return standardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费控规则ID")

  public String getStandardId() {
    return standardId;
  }


  public void setStandardId(String standardId) {
    this.standardId = standardId;
  }


  public ExpenseConsumeInfo storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 外部门店id
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外部门店id")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public ExpenseConsumeInfo summaryId(String summaryId) {
    
    this.summaryId = summaryId;
    return this;
  }

   /**
   * 批次id
   * @return summaryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "批次id")

  public String getSummaryId() {
    return summaryId;
  }


  public void setSummaryId(String summaryId) {
    this.summaryId = summaryId;
  }


  public ExpenseConsumeInfo tpSign(String tpSign) {
    
    this.tpSign = tpSign;
    return this;
  }

   /**
   * 出资类型： PERSONAL:个人垫付 ENTERPRISE:企业垫资 TP:三方合作伙伴垫资 ACCOUNTING:记账
   * @return tpSign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出资类型： PERSONAL:个人垫付 ENTERPRISE:企业垫资 TP:三方合作伙伴垫资 ACCOUNTING:记账")

  public String getTpSign() {
    return tpSign;
  }


  public void setTpSign(String tpSign) {
    this.tpSign = tpSign;
  }


  public ExpenseConsumeInfo voucherId(String voucherId) {
    
    this.voucherId = voucherId;
    return this;
  }

   /**
   * 凭证ID
   * @return voucherId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "凭证ID")

  public String getVoucherId() {
    return voucherId;
  }


  public void setVoucherId(String voucherId) {
    this.voucherId = voucherId;
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
   * @return the ExpenseConsumeInfo instance itself
   */
  public ExpenseConsumeInfo putAdditionalProperty(String key, Object value) {
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
    ExpenseConsumeInfo expenseConsumeInfo = (ExpenseConsumeInfo) o;
    return Objects.equals(this.accountId, expenseConsumeInfo.accountId) &&
        Objects.equals(this.actualAccountNumber, expenseConsumeInfo.actualAccountNumber) &&
        Objects.equals(this.batchId, expenseConsumeInfo.batchId) &&
        Objects.equals(this.billNo, expenseConsumeInfo.billNo) &&
        Objects.equals(this.billType, expenseConsumeInfo.billType) &&
        Objects.equals(this.categoryName, expenseConsumeInfo.categoryName) &&
        Objects.equals(this.consumeAmount, expenseConsumeInfo.consumeAmount) &&
        Objects.equals(this.consumeDate, expenseConsumeInfo.consumeDate) &&
        Objects.equals(this.consumeTitle, expenseConsumeInfo.consumeTitle) &&
        Objects.equals(this.employeeId, expenseConsumeInfo.employeeId) &&
        Objects.equals(this.employeeOpenId, expenseConsumeInfo.employeeOpenId) &&
        Objects.equals(this.merchantId, expenseConsumeInfo.merchantId) &&
        Objects.equals(this.mshopId, expenseConsumeInfo.mshopId) &&
        Objects.equals(this.openModel, expenseConsumeInfo.openModel) &&
        Objects.equals(this.originalVoucherId, expenseConsumeInfo.originalVoucherId) &&
        Objects.equals(this.outBizNo, expenseConsumeInfo.outBizNo) &&
        Objects.equals(this.pPayAmount, expenseConsumeInfo.pPayAmount) &&
        Objects.equals(this.payeeName, expenseConsumeInfo.payeeName) &&
        Objects.equals(this.projectId, expenseConsumeInfo.projectId) &&
        Objects.equals(this.projiectId, expenseConsumeInfo.projiectId) &&
        Objects.equals(this.refundAmount, expenseConsumeInfo.refundAmount) &&
        Objects.equals(this.refundStatus, expenseConsumeInfo.refundStatus) &&
        Objects.equals(this.standardId, expenseConsumeInfo.standardId) &&
        Objects.equals(this.storeId, expenseConsumeInfo.storeId) &&
        Objects.equals(this.summaryId, expenseConsumeInfo.summaryId) &&
        Objects.equals(this.tpSign, expenseConsumeInfo.tpSign) &&
        Objects.equals(this.voucherId, expenseConsumeInfo.voucherId)&&
        Objects.equals(this.additionalProperties, expenseConsumeInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, actualAccountNumber, batchId, billNo, billType, categoryName, consumeAmount, consumeDate, consumeTitle, employeeId, employeeOpenId, merchantId, mshopId, openModel, originalVoucherId, outBizNo, pPayAmount, payeeName, projectId, projiectId, refundAmount, refundStatus, standardId, storeId, summaryId, tpSign, voucherId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseConsumeInfo {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    actualAccountNumber: ").append(toIndentedString(actualAccountNumber)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    consumeAmount: ").append(toIndentedString(consumeAmount)).append("\n");
    sb.append("    consumeDate: ").append(toIndentedString(consumeDate)).append("\n");
    sb.append("    consumeTitle: ").append(toIndentedString(consumeTitle)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeOpenId: ").append(toIndentedString(employeeOpenId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    mshopId: ").append(toIndentedString(mshopId)).append("\n");
    sb.append("    openModel: ").append(toIndentedString(openModel)).append("\n");
    sb.append("    originalVoucherId: ").append(toIndentedString(originalVoucherId)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    pPayAmount: ").append(toIndentedString(pPayAmount)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projiectId: ").append(toIndentedString(projiectId)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
    sb.append("    standardId: ").append(toIndentedString(standardId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    summaryId: ").append(toIndentedString(summaryId)).append("\n");
    sb.append("    tpSign: ").append(toIndentedString(tpSign)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("actual_account_number");
    openapiFields.add("batch_id");
    openapiFields.add("bill_no");
    openapiFields.add("bill_type");
    openapiFields.add("category_name");
    openapiFields.add("consume_amount");
    openapiFields.add("consume_date");
    openapiFields.add("consume_title");
    openapiFields.add("employee_id");
    openapiFields.add("employee_open_id");
    openapiFields.add("merchant_id");
    openapiFields.add("mshop_id");
    openapiFields.add("open_model");
    openapiFields.add("original_voucher_id");
    openapiFields.add("out_biz_no");
    openapiFields.add("p_pay_amount");
    openapiFields.add("payee_name");
    openapiFields.add("project_id");
    openapiFields.add("projiect_id");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_status");
    openapiFields.add("standard_id");
    openapiFields.add("store_id");
    openapiFields.add("summary_id");
    openapiFields.add("tp_sign");
    openapiFields.add("voucher_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseConsumeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExpenseConsumeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseConsumeInfo is not found in the empty JSON string", ExpenseConsumeInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("actual_account_number") != null && !jsonObj.get("actual_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_account_number").toString()));
      }
      if (jsonObj.get("batch_id") != null && !jsonObj.get("batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_id").toString()));
      }
      if (jsonObj.get("bill_no") != null && !jsonObj.get("bill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_no").toString()));
      }
      if (jsonObj.get("bill_type") != null && !jsonObj.get("bill_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_type").toString()));
      }
      if (jsonObj.get("category_name") != null && !jsonObj.get("category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_name").toString()));
      }
      if (jsonObj.get("consume_amount") != null && !jsonObj.get("consume_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_amount").toString()));
      }
      if (jsonObj.get("consume_date") != null && !jsonObj.get("consume_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_date").toString()));
      }
      if (jsonObj.get("consume_title") != null && !jsonObj.get("consume_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_title").toString()));
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("employee_open_id") != null && !jsonObj.get("employee_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_open_id").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("mshop_id") != null && !jsonObj.get("mshop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mshop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mshop_id").toString()));
      }
      if (jsonObj.get("open_model") != null && !jsonObj.get("open_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_model").toString()));
      }
      if (jsonObj.get("original_voucher_id") != null && !jsonObj.get("original_voucher_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_voucher_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_voucher_id").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("p_pay_amount") != null && !jsonObj.get("p_pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `p_pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("p_pay_amount").toString()));
      }
      if (jsonObj.get("payee_name") != null && !jsonObj.get("payee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_name").toString()));
      }
      if (jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if (jsonObj.get("projiect_id") != null && !jsonObj.get("projiect_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projiect_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projiect_id").toString()));
      }
      if (jsonObj.get("refund_amount") != null && !jsonObj.get("refund_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_amount").toString()));
      }
      if (jsonObj.get("refund_status") != null && !jsonObj.get("refund_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_status").toString()));
      }
      if (jsonObj.get("standard_id") != null && !jsonObj.get("standard_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_id").toString()));
      }
      if (jsonObj.get("store_id") != null && !jsonObj.get("store_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_id").toString()));
      }
      if (jsonObj.get("summary_id") != null && !jsonObj.get("summary_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary_id").toString()));
      }
      if (jsonObj.get("tp_sign") != null && !jsonObj.get("tp_sign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tp_sign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tp_sign").toString()));
      }
      if (jsonObj.get("voucher_id") != null && !jsonObj.get("voucher_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseConsumeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseConsumeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseConsumeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseConsumeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseConsumeInfo>() {
           @Override
           public void write(JsonWriter out, ExpenseConsumeInfo value) throws IOException {
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
           public ExpenseConsumeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExpenseConsumeInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExpenseConsumeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseConsumeInfo
  * @throws IOException if the JSON string is invalid with respect to ExpenseConsumeInfo
  */
  public static ExpenseConsumeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseConsumeInfo.class);
  }

 /**
  * Convert an instance of ExpenseConsumeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

