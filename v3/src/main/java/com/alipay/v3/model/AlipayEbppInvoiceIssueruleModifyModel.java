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
 * AlipayEbppInvoiceIssueruleModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceIssueruleModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_EFFECTIVE = "effective";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE)
  private String effective;

  public static final String SERIALIZED_NAME_EFFECTIVE_PERIOD = "effective_period";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_PERIOD)
  private String effectivePeriod;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_INVALID_MODE = "invalid_mode";
  @SerializedName(SERIALIZED_NAME_INVALID_MODE)
  private Integer invalidMode;

  public static final String SERIALIZED_NAME_INVALID_MODE_VALUE = "invalid_mode_value";
  @SerializedName(SERIALIZED_NAME_INVALID_MODE_VALUE)
  private String invalidModeValue;

  public static final String SERIALIZED_NAME_ISSUE_AMOUNT_VALUE = "issue_amount_value";
  @SerializedName(SERIALIZED_NAME_ISSUE_AMOUNT_VALUE)
  private String issueAmountValue;

  public static final String SERIALIZED_NAME_ISSUE_END_DATE = "issue_end_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_END_DATE)
  private String issueEndDate;

  public static final String SERIALIZED_NAME_ISSUE_RULE_ID = "issue_rule_id";
  @SerializedName(SERIALIZED_NAME_ISSUE_RULE_ID)
  private String issueRuleId;

  public static final String SERIALIZED_NAME_ISSUE_RULE_NAME = "issue_rule_name";
  @SerializedName(SERIALIZED_NAME_ISSUE_RULE_NAME)
  private String issueRuleName;

  public static final String SERIALIZED_NAME_ISSUE_START_DATE = "issue_start_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_START_DATE)
  private String issueStartDate;

  public static final String SERIALIZED_NAME_ISSUE_TYPE = "issue_type";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE)
  private String issueType;

  public static final String SERIALIZED_NAME_QUOTA_TYPE = "quota_type";
  @SerializedName(SERIALIZED_NAME_QUOTA_TYPE)
  private String quotaType;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private Integer shareMode;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public AlipayEbppInvoiceIssueruleModifyModel() { 
  }

  public AlipayEbppInvoiceIssueruleModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户id（该字段将废弃，不建议使用，可用enterprise_id字段替换）(该字段将废弃，不建议使用，可用enterprise_id字段替换)
   * @return accountId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "共同账户id（该字段将废弃，不建议使用，可用enterprise_id字段替换）(该字段将废弃，不建议使用，可用enterprise_id字段替换)")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceIssueruleModifyModel action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * 修改类型，枚举： MODIFY_BASIC_INFO（修改发放规则基本信息）
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MODIFY_BASIC_INFO", value = "修改类型，枚举： MODIFY_BASIC_INFO（修改发放规则基本信息）")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public AlipayEbppInvoiceIssueruleModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号（该字段将废弃，不建议使用，可用enterprise_id字段替换）(该字段将废弃，不建议使用，可用enterprise_id字段替换)
   * @return agreementNo
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001112341234", value = "授权签约协议号（该字段将废弃，不建议使用，可用enterprise_id字段替换）(该字段将废弃，不建议使用，可用enterprise_id字段替换)")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceIssueruleModifyModel effective(String effective) {
    
    this.effective = effective;
    return this;
  }

   /**
   * 是否启用，\&quot;0\&quot;为停用，\&quot;1\&quot;为启用；
   * @return effective
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "是否启用，\"0\"为停用，\"1\"为启用；")

  public String getEffective() {
    return effective;
  }


  public void setEffective(String effective) {
    this.effective = effective;
  }


  public AlipayEbppInvoiceIssueruleModifyModel effectivePeriod(String effectivePeriod) {
    
    this.effectivePeriod = effectivePeriod;
    return this;
  }

   /**
   * 生效周期（不传则不修改），不限：\&quot;{\\\&quot;all\\\&quot;:true}\&quot;
   * @return effectivePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\\\"all\\\":true}", value = "生效周期（不传则不修改），不限：\"{\\\"all\\\":true}\"")

  public String getEffectivePeriod() {
    return effectivePeriod;
  }


  public void setEffectivePeriod(String effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }


  public AlipayEbppInvoiceIssueruleModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业ID")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceIssueruleModifyModel invalidMode(Integer invalidMode) {
    
    this.invalidMode = invalidMode;
    return this;
  }

   /**
   * 是否可累计（不传则不修改）可选值：0（不可累计）、1（可累计），2（累计天数），3（累计到固定时间）
   * @return invalidMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "是否可累计（不传则不修改）可选值：0（不可累计）、1（可累计），2（累计天数），3（累计到固定时间）")

  public Integer getInvalidMode() {
    return invalidMode;
  }


  public void setInvalidMode(Integer invalidMode) {
    this.invalidMode = invalidMode;
  }


  public AlipayEbppInvoiceIssueruleModifyModel invalidModeValue(String invalidModeValue) {
    
    this.invalidModeValue = invalidModeValue;
    return this;
  }

   /**
   * 累计值
   * @return invalidModeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "累计值")

  public String getInvalidModeValue() {
    return invalidModeValue;
  }


  public void setInvalidModeValue(String invalidModeValue) {
    this.invalidModeValue = invalidModeValue;
  }


  public AlipayEbppInvoiceIssueruleModifyModel issueAmountValue(String issueAmountValue) {
    
    this.issueAmountValue = issueAmountValue;
    return this;
  }

   /**
   * 发放金额（不传则不修改），单位（元）
   * @return issueAmountValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "发放金额（不传则不修改），单位（元）")

  public String getIssueAmountValue() {
    return issueAmountValue;
  }


  public void setIssueAmountValue(String issueAmountValue) {
    this.issueAmountValue = issueAmountValue;
  }


  public AlipayEbppInvoiceIssueruleModifyModel issueEndDate(String issueEndDate) {
    
    this.issueEndDate = issueEndDate;
    return this;
  }

   /**
   * 发放规则的截止时间
   * @return issueEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 12:00:00", value = "发放规则的截止时间")

  public String getIssueEndDate() {
    return issueEndDate;
  }


  public void setIssueEndDate(String issueEndDate) {
    this.issueEndDate = issueEndDate;
  }


  public AlipayEbppInvoiceIssueruleModifyModel issueRuleId(String issueRuleId) {
    
    this.issueRuleId = issueRuleId;
    return this;
  }

   /**
   * 发放规则id
   * @return issueRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022052000152618690000000005", value = "发放规则id")

  public String getIssueRuleId() {
    return issueRuleId;
  }


  public void setIssueRuleId(String issueRuleId) {
    this.issueRuleId = issueRuleId;
  }


  public AlipayEbppInvoiceIssueruleModifyModel issueRuleName(String issueRuleName) {
    
    this.issueRuleName = issueRuleName;
    return this;
  }

   /**
   * 发放规则名称（不传则不修改）
   * @return issueRuleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "晚餐发放", value = "发放规则名称（不传则不修改）")

  public String getIssueRuleName() {
    return issueRuleName;
  }


  public void setIssueRuleName(String issueRuleName) {
    this.issueRuleName = issueRuleName;
  }


  public AlipayEbppInvoiceIssueruleModifyModel issueStartDate(String issueStartDate) {
    
    this.issueStartDate = issueStartDate;
    return this;
  }

   /**
   * 发放规则的开始时间
   * @return issueStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 12:00:00", value = "发放规则的开始时间")

  public String getIssueStartDate() {
    return issueStartDate;
  }


  public void setIssueStartDate(String issueStartDate) {
    this.issueStartDate = issueStartDate;
  }


  public AlipayEbppInvoiceIssueruleModifyModel issueType(String issueType) {
    
    this.issueType = issueType;
    return this;
  }

   /**
   * 发放类型
   * @return issueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ISSUE_MONTH", value = "发放类型")

  public String getIssueType() {
    return issueType;
  }


  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }


  public AlipayEbppInvoiceIssueruleModifyModel quotaType(String quotaType) {
    
    this.quotaType = quotaType;
    return this;
  }

   /**
   * 额度类型
   * @return quotaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COUPON", value = "额度类型")

  public String getQuotaType() {
    return quotaType;
  }


  public void setQuotaType(String quotaType) {
    this.quotaType = quotaType;
  }


  public AlipayEbppInvoiceIssueruleModifyModel shareMode(Integer shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * 是否可转赠（不传则不修改），可选值：0（不可转赠）、1（可转赠），默认为0，按城市发放不支持可转赠
   * @return shareMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "是否可转赠（不传则不修改），可选值：0（不可转赠）、1（可转赠），默认为0，按城市发放不支持可转赠")

  public Integer getShareMode() {
    return shareMode;
  }


  public void setShareMode(Integer shareMode) {
    this.shareMode = shareMode;
  }


  public AlipayEbppInvoiceIssueruleModifyModel targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 发放规则关联的目标值 target_type为制度时：制度id
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022052000152618690000000005", value = "发放规则关联的目标值 target_type为制度时：制度id")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public AlipayEbppInvoiceIssueruleModifyModel targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 发放规则关联的目标类型
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INSTITUTION", value = "发放规则关联的目标类型")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
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
   * @return the AlipayEbppInvoiceIssueruleModifyModel instance itself
   */
  public AlipayEbppInvoiceIssueruleModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceIssueruleModifyModel alipayEbppInvoiceIssueruleModifyModel = (AlipayEbppInvoiceIssueruleModifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceIssueruleModifyModel.accountId) &&
        Objects.equals(this.action, alipayEbppInvoiceIssueruleModifyModel.action) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceIssueruleModifyModel.agreementNo) &&
        Objects.equals(this.effective, alipayEbppInvoiceIssueruleModifyModel.effective) &&
        Objects.equals(this.effectivePeriod, alipayEbppInvoiceIssueruleModifyModel.effectivePeriod) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceIssueruleModifyModel.enterpriseId) &&
        Objects.equals(this.invalidMode, alipayEbppInvoiceIssueruleModifyModel.invalidMode) &&
        Objects.equals(this.invalidModeValue, alipayEbppInvoiceIssueruleModifyModel.invalidModeValue) &&
        Objects.equals(this.issueAmountValue, alipayEbppInvoiceIssueruleModifyModel.issueAmountValue) &&
        Objects.equals(this.issueEndDate, alipayEbppInvoiceIssueruleModifyModel.issueEndDate) &&
        Objects.equals(this.issueRuleId, alipayEbppInvoiceIssueruleModifyModel.issueRuleId) &&
        Objects.equals(this.issueRuleName, alipayEbppInvoiceIssueruleModifyModel.issueRuleName) &&
        Objects.equals(this.issueStartDate, alipayEbppInvoiceIssueruleModifyModel.issueStartDate) &&
        Objects.equals(this.issueType, alipayEbppInvoiceIssueruleModifyModel.issueType) &&
        Objects.equals(this.quotaType, alipayEbppInvoiceIssueruleModifyModel.quotaType) &&
        Objects.equals(this.shareMode, alipayEbppInvoiceIssueruleModifyModel.shareMode) &&
        Objects.equals(this.targetId, alipayEbppInvoiceIssueruleModifyModel.targetId) &&
        Objects.equals(this.targetType, alipayEbppInvoiceIssueruleModifyModel.targetType)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceIssueruleModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, action, agreementNo, effective, effectivePeriod, enterpriseId, invalidMode, invalidModeValue, issueAmountValue, issueEndDate, issueRuleId, issueRuleName, issueStartDate, issueType, quotaType, shareMode, targetId, targetType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceIssueruleModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    effectivePeriod: ").append(toIndentedString(effectivePeriod)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    invalidMode: ").append(toIndentedString(invalidMode)).append("\n");
    sb.append("    invalidModeValue: ").append(toIndentedString(invalidModeValue)).append("\n");
    sb.append("    issueAmountValue: ").append(toIndentedString(issueAmountValue)).append("\n");
    sb.append("    issueEndDate: ").append(toIndentedString(issueEndDate)).append("\n");
    sb.append("    issueRuleId: ").append(toIndentedString(issueRuleId)).append("\n");
    sb.append("    issueRuleName: ").append(toIndentedString(issueRuleName)).append("\n");
    sb.append("    issueStartDate: ").append(toIndentedString(issueStartDate)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("agreement_no");
    openapiFields.add("effective");
    openapiFields.add("effective_period");
    openapiFields.add("enterprise_id");
    openapiFields.add("invalid_mode");
    openapiFields.add("invalid_mode_value");
    openapiFields.add("issue_amount_value");
    openapiFields.add("issue_end_date");
    openapiFields.add("issue_rule_id");
    openapiFields.add("issue_rule_name");
    openapiFields.add("issue_start_date");
    openapiFields.add("issue_type");
    openapiFields.add("quota_type");
    openapiFields.add("share_mode");
    openapiFields.add("target_id");
    openapiFields.add("target_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceIssueruleModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceIssueruleModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceIssueruleModifyModel is not found in the empty JSON string", AlipayEbppInvoiceIssueruleModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("effective") != null && !jsonObj.get("effective").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective").toString()));
      }
      if (jsonObj.get("effective_period") != null && !jsonObj.get("effective_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_period").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("invalid_mode_value") != null && !jsonObj.get("invalid_mode_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invalid_mode_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invalid_mode_value").toString()));
      }
      if (jsonObj.get("issue_amount_value") != null && !jsonObj.get("issue_amount_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_amount_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_amount_value").toString()));
      }
      if (jsonObj.get("issue_end_date") != null && !jsonObj.get("issue_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_end_date").toString()));
      }
      if (jsonObj.get("issue_rule_id") != null && !jsonObj.get("issue_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_rule_id").toString()));
      }
      if (jsonObj.get("issue_rule_name") != null && !jsonObj.get("issue_rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_rule_name").toString()));
      }
      if (jsonObj.get("issue_start_date") != null && !jsonObj.get("issue_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_start_date").toString()));
      }
      if (jsonObj.get("issue_type") != null && !jsonObj.get("issue_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_type").toString()));
      }
      if (jsonObj.get("quota_type") != null && !jsonObj.get("quota_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_type").toString()));
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceIssueruleModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceIssueruleModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceIssueruleModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceIssueruleModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceIssueruleModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceIssueruleModifyModel value) throws IOException {
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
           public AlipayEbppInvoiceIssueruleModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceIssueruleModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceIssueruleModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceIssueruleModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceIssueruleModifyModel
  */
  public static AlipayEbppInvoiceIssueruleModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceIssueruleModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceIssueruleModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

