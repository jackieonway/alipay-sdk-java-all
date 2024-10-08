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
import com.alipay.v3.model.AssetShareSourceInfo;
import com.alipay.v3.model.ExpenseCtrRuleInfo;
import com.alipay.v3.model.StandardConditionInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AlipayEbppInvoiceInstitutionExpenseruleModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceInstitutionExpenseruleModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ASSET_SHARE_SOURCE_INFO = "asset_share_source_info";
  @SerializedName(SERIALIZED_NAME_ASSET_SHARE_SOURCE_INFO)
  private AssetShareSourceInfo assetShareSourceInfo;

  public static final String SERIALIZED_NAME_CONSUME_MODE = "consume_mode";
  @SerializedName(SERIALIZED_NAME_CONSUME_MODE)
  private String consumeMode;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_LIST = "expense_ctrl_rule_info_list";
  @SerializedName(SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_LIST)
  private List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList = null;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_OPEN_RULE_ID = "open_rule_id";
  @SerializedName(SERIALIZED_NAME_OPEN_RULE_ID)
  private String openRuleId;

  public static final String SERIALIZED_NAME_PAYMENT_POLICY = "payment_policy";
  @SerializedName(SERIALIZED_NAME_PAYMENT_POLICY)
  private String paymentPolicy;

  public static final String SERIALIZED_NAME_PERSONAL_QRCODE_MODE = "personal_qrcode_mode";
  @SerializedName(SERIALIZED_NAME_PERSONAL_QRCODE_MODE)
  private Integer personalQrcodeMode;

  public static final String SERIALIZED_NAME_STANDARD_CONDITION_INFO_LIST = "standard_condition_info_list";
  @SerializedName(SERIALIZED_NAME_STANDARD_CONDITION_INFO_LIST)
  private List<StandardConditionInfo> standardConditionInfoList = null;

  public static final String SERIALIZED_NAME_STANDARD_DESC = "standard_desc";
  @SerializedName(SERIALIZED_NAME_STANDARD_DESC)
  private String standardDesc;

  public static final String SERIALIZED_NAME_STANDARD_ID = "standard_id";
  @SerializedName(SERIALIZED_NAME_STANDARD_ID)
  private String standardId;

  public static final String SERIALIZED_NAME_STANDARD_NAME = "standard_name";
  @SerializedName(SERIALIZED_NAME_STANDARD_NAME)
  private String standardName;

  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel() { 
  }

  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业共同账户id（该字段将废弃，不建议使用，可用enterprise_id字段替换）(该字段将废弃，不建议使用，可用enterprise_id字段替换)
   * @return accountId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业共同账户id（该字段将废弃，不建议使用，可用enterprise_id字段替换）(该字段将废弃，不建议使用，可用enterprise_id字段替换)")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * 修改使用规则
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MODIFY_BASIC_INFO", value = "修改使用规则")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel agreementNo(String agreementNo) {
    
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


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel assetShareSourceInfo(AssetShareSourceInfo assetShareSourceInfo) {
    
    this.assetShareSourceInfo = assetShareSourceInfo;
    return this;
  }

   /**
   * Get assetShareSourceInfo
   * @return assetShareSourceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetShareSourceInfo getAssetShareSourceInfo() {
    return assetShareSourceInfo;
  }


  public void setAssetShareSourceInfo(AssetShareSourceInfo assetShareSourceInfo) {
    this.assetShareSourceInfo = assetShareSourceInfo;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel consumeMode(String consumeMode) {
    
    this.consumeMode = consumeMode;
    return this;
  }

   /**
   * 该使用规则支持的资产消费模式，不填写则为默认模式，默认模式下有余额时使用余额，没有余额则使用规则中的限额，点券模式为只能使用点券，点券+余额模式为可以使用点券和余额。
   * @return consumeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "该使用规则支持的资产消费模式，不填写则为默认模式，默认模式下有余额时使用余额，没有余额则使用规则中的限额，点券模式为只能使用点券，点券+余额模式为可以使用点券和余额。")

  public String getConsumeMode() {
    return consumeMode;
  }


  public void setConsumeMode(String consumeMode) {
    this.consumeMode = consumeMode;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel expenseCtrlRuleInfoList(List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList) {
    
    this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel addExpenseCtrlRuleInfoListItem(ExpenseCtrRuleInfo expenseCtrlRuleInfoListItem) {
    if (this.expenseCtrlRuleInfoList == null) {
      this.expenseCtrlRuleInfoList = new ArrayList<>();
    }
    this.expenseCtrlRuleInfoList.add(expenseCtrlRuleInfoListItem);
    return this;
  }

   /**
   * 使用规则条件列表（已废弃）
   * @return expenseCtrlRuleInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "使用规则条件列表（已废弃）")

  public List<ExpenseCtrRuleInfo> getExpenseCtrlRuleInfoList() {
    return expenseCtrlRuleInfoList;
  }


  public void setExpenseCtrlRuleInfoList(List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList) {
    this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * 制度id
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022070600152617780000000001", value = "制度id")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel openRuleId(String openRuleId) {
    
    this.openRuleId = openRuleId;
    return this;
  }

   /**
   * 开票规则id
   * @return openRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022070600152608780000000001", value = "开票规则id")

  public String getOpenRuleId() {
    return openRuleId;
  }


  public void setOpenRuleId(String openRuleId) {
    this.openRuleId = openRuleId;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel paymentPolicy(String paymentPolicy) {
    
    this.paymentPolicy = paymentPolicy;
    return this;
  }

   /**
   * 当笔消费金额大于规则可用余额时，用于控制支付策略
   * @return paymentPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMBINATION", value = "当笔消费金额大于规则可用余额时，用于控制支付策略")

  public String getPaymentPolicy() {
    return paymentPolicy;
  }


  public void setPaymentPolicy(String paymentPolicy) {
    this.paymentPolicy = paymentPolicy;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel personalQrcodeMode(Integer personalQrcodeMode) {
    
    this.personalQrcodeMode = personalQrcodeMode;
    return this;
  }

   /**
   * 个人收款码转账是否支持因公付，默认为0。可选值：0（不支持）、1（支持）
   * @return personalQrcodeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "个人收款码转账是否支持因公付，默认为0。可选值：0（不支持）、1（支持）")

  public Integer getPersonalQrcodeMode() {
    return personalQrcodeMode;
  }


  public void setPersonalQrcodeMode(Integer personalQrcodeMode) {
    this.personalQrcodeMode = personalQrcodeMode;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel standardConditionInfoList(List<StandardConditionInfo> standardConditionInfoList) {
    
    this.standardConditionInfoList = standardConditionInfoList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel addStandardConditionInfoListItem(StandardConditionInfo standardConditionInfoListItem) {
    if (this.standardConditionInfoList == null) {
      this.standardConditionInfoList = new ArrayList<>();
    }
    this.standardConditionInfoList.add(standardConditionInfoListItem);
    return this;
  }

   /**
   * 规则条件列表
   * @return standardConditionInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "规则条件列表")

  public List<StandardConditionInfo> getStandardConditionInfoList() {
    return standardConditionInfoList;
  }


  public void setStandardConditionInfoList(List<StandardConditionInfo> standardConditionInfoList) {
    this.standardConditionInfoList = standardConditionInfoList;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel standardDesc(String standardDesc) {
    
    this.standardDesc = standardDesc;
    return this;
  }

   /**
   * 规则描述
   * @return standardDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "当前规则为午餐餐补规则", value = "规则描述")

  public String getStandardDesc() {
    return standardDesc;
  }


  public void setStandardDesc(String standardDesc) {
    this.standardDesc = standardDesc;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel standardId(String standardId) {
    
    this.standardId = standardId;
    return this;
  }

   /**
   * 使用规则id
   * @return standardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022070600152621780000000001", value = "使用规则id")

  public String getStandardId() {
    return standardId;
  }


  public void setStandardId(String standardId) {
    this.standardId = standardId;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel standardName(String standardName) {
    
    this.standardName = standardName;
    return this;
  }

   /**
   * 规则名称
   * @return standardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "午餐规则", value = "规则名称")

  public String getStandardName() {
    return standardName;
  }


  public void setStandardName(String standardName) {
    this.standardName = standardName;
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
   * @return the AlipayEbppInvoiceInstitutionExpenseruleModifyModel instance itself
   */
  public AlipayEbppInvoiceInstitutionExpenseruleModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceInstitutionExpenseruleModifyModel alipayEbppInvoiceInstitutionExpenseruleModifyModel = (AlipayEbppInvoiceInstitutionExpenseruleModifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceInstitutionExpenseruleModifyModel.accountId) &&
        Objects.equals(this.action, alipayEbppInvoiceInstitutionExpenseruleModifyModel.action) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceInstitutionExpenseruleModifyModel.agreementNo) &&
        Objects.equals(this.assetShareSourceInfo, alipayEbppInvoiceInstitutionExpenseruleModifyModel.assetShareSourceInfo) &&
        Objects.equals(this.consumeMode, alipayEbppInvoiceInstitutionExpenseruleModifyModel.consumeMode) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceInstitutionExpenseruleModifyModel.enterpriseId) &&
        Objects.equals(this.expenseCtrlRuleInfoList, alipayEbppInvoiceInstitutionExpenseruleModifyModel.expenseCtrlRuleInfoList) &&
        Objects.equals(this.institutionId, alipayEbppInvoiceInstitutionExpenseruleModifyModel.institutionId) &&
        Objects.equals(this.openRuleId, alipayEbppInvoiceInstitutionExpenseruleModifyModel.openRuleId) &&
        Objects.equals(this.paymentPolicy, alipayEbppInvoiceInstitutionExpenseruleModifyModel.paymentPolicy) &&
        Objects.equals(this.personalQrcodeMode, alipayEbppInvoiceInstitutionExpenseruleModifyModel.personalQrcodeMode) &&
        Objects.equals(this.standardConditionInfoList, alipayEbppInvoiceInstitutionExpenseruleModifyModel.standardConditionInfoList) &&
        Objects.equals(this.standardDesc, alipayEbppInvoiceInstitutionExpenseruleModifyModel.standardDesc) &&
        Objects.equals(this.standardId, alipayEbppInvoiceInstitutionExpenseruleModifyModel.standardId) &&
        Objects.equals(this.standardName, alipayEbppInvoiceInstitutionExpenseruleModifyModel.standardName)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceInstitutionExpenseruleModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, action, agreementNo, assetShareSourceInfo, consumeMode, enterpriseId, expenseCtrlRuleInfoList, institutionId, openRuleId, paymentPolicy, personalQrcodeMode, standardConditionInfoList, standardDesc, standardId, standardName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceInstitutionExpenseruleModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    assetShareSourceInfo: ").append(toIndentedString(assetShareSourceInfo)).append("\n");
    sb.append("    consumeMode: ").append(toIndentedString(consumeMode)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    expenseCtrlRuleInfoList: ").append(toIndentedString(expenseCtrlRuleInfoList)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    openRuleId: ").append(toIndentedString(openRuleId)).append("\n");
    sb.append("    paymentPolicy: ").append(toIndentedString(paymentPolicy)).append("\n");
    sb.append("    personalQrcodeMode: ").append(toIndentedString(personalQrcodeMode)).append("\n");
    sb.append("    standardConditionInfoList: ").append(toIndentedString(standardConditionInfoList)).append("\n");
    sb.append("    standardDesc: ").append(toIndentedString(standardDesc)).append("\n");
    sb.append("    standardId: ").append(toIndentedString(standardId)).append("\n");
    sb.append("    standardName: ").append(toIndentedString(standardName)).append("\n");
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
    openapiFields.add("asset_share_source_info");
    openapiFields.add("consume_mode");
    openapiFields.add("enterprise_id");
    openapiFields.add("expense_ctrl_rule_info_list");
    openapiFields.add("institution_id");
    openapiFields.add("open_rule_id");
    openapiFields.add("payment_policy");
    openapiFields.add("personal_qrcode_mode");
    openapiFields.add("standard_condition_info_list");
    openapiFields.add("standard_desc");
    openapiFields.add("standard_id");
    openapiFields.add("standard_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceInstitutionExpenseruleModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceInstitutionExpenseruleModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceInstitutionExpenseruleModifyModel is not found in the empty JSON string", AlipayEbppInvoiceInstitutionExpenseruleModifyModel.openapiRequiredFields.toString()));
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
      // validate the optional field `asset_share_source_info`
      if (jsonObj.getAsJsonObject("asset_share_source_info") != null) {
        AssetShareSourceInfo.validateJsonObject(jsonObj.getAsJsonObject("asset_share_source_info"));
      }
      if (jsonObj.get("consume_mode") != null && !jsonObj.get("consume_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_mode").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      JsonArray jsonArrayexpenseCtrlRuleInfoList = jsonObj.getAsJsonArray("expense_ctrl_rule_info_list");
      if (jsonArrayexpenseCtrlRuleInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("expense_ctrl_rule_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `expense_ctrl_rule_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("expense_ctrl_rule_info_list").toString()));
        }

        // validate the optional field `expense_ctrl_rule_info_list` (array)
        for (int i = 0; i < jsonArrayexpenseCtrlRuleInfoList.size(); i++) {
          ExpenseCtrRuleInfo.validateJsonObject(jsonArrayexpenseCtrlRuleInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      if (jsonObj.get("open_rule_id") != null && !jsonObj.get("open_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_rule_id").toString()));
      }
      if (jsonObj.get("payment_policy") != null && !jsonObj.get("payment_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_policy").toString()));
      }
      JsonArray jsonArraystandardConditionInfoList = jsonObj.getAsJsonArray("standard_condition_info_list");
      if (jsonArraystandardConditionInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("standard_condition_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `standard_condition_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("standard_condition_info_list").toString()));
        }

        // validate the optional field `standard_condition_info_list` (array)
        for (int i = 0; i < jsonArraystandardConditionInfoList.size(); i++) {
          StandardConditionInfo.validateJsonObject(jsonArraystandardConditionInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("standard_desc") != null && !jsonObj.get("standard_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_desc").toString()));
      }
      if (jsonObj.get("standard_id") != null && !jsonObj.get("standard_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_id").toString()));
      }
      if (jsonObj.get("standard_name") != null && !jsonObj.get("standard_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceInstitutionExpenseruleModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceInstitutionExpenseruleModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceInstitutionExpenseruleModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceInstitutionExpenseruleModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceInstitutionExpenseruleModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceInstitutionExpenseruleModifyModel value) throws IOException {
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
           public AlipayEbppInvoiceInstitutionExpenseruleModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceInstitutionExpenseruleModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceInstitutionExpenseruleModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceInstitutionExpenseruleModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceInstitutionExpenseruleModifyModel
  */
  public static AlipayEbppInvoiceInstitutionExpenseruleModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceInstitutionExpenseruleModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceInstitutionExpenseruleModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

