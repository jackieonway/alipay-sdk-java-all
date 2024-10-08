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
 * AlipayEbppInvoiceInstitutionModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceInstitutionModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_CONSULT_MODE = "consult_mode";
  @SerializedName(SERIALIZED_NAME_CONSULT_MODE)
  private String consultMode;

  public static final String SERIALIZED_NAME_EFFECTIVE = "effective";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE)
  private String effective;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_INSTITUTION_DESC = "institution_desc";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_DESC)
  private String institutionDesc;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public AlipayEbppInvoiceInstitutionModifyModel() { 
  }

  public AlipayEbppInvoiceInstitutionModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业共同账户id （该字段将废弃，不建议使用，可用enterprise_id字段替换）(推荐使用enterprise_id)
   * @return accountId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业共同账户id （该字段将废弃，不建议使用，可用enterprise_id字段替换）(推荐使用enterprise_id)")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceInstitutionModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号 （该字段将废弃，不建议使用，可用enterprise_id字段替换）(推荐使用enterprise_id)
   * @return agreementNo
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001181407500", value = "授权签约协议号 （该字段将废弃，不建议使用，可用enterprise_id字段替换）(推荐使用enterprise_id)")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceInstitutionModifyModel consultMode(String consultMode) {
    
    this.consultMode = consultMode;
    return this;
  }

   /**
   * 费控咨询模式： 0-支付宝内部计算规则可用金额 1-咨询外部服务商规则可用金额
   * @return consultMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "费控咨询模式： 0-支付宝内部计算规则可用金额 1-咨询外部服务商规则可用金额")

  public String getConsultMode() {
    return consultMode;
  }


  public void setConsultMode(String consultMode) {
    this.consultMode = consultMode;
  }


  public AlipayEbppInvoiceInstitutionModifyModel effective(String effective) {
    
    this.effective = effective;
    return this;
  }

   /**
   * 制度是否启用
   * @return effective
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "制度是否启用")

  public String getEffective() {
    return effective;
  }


  public void setEffective(String effective) {
    this.effective = effective;
  }


  public AlipayEbppInvoiceInstitutionModifyModel effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 制度生效结束时间（可空），最小粒度为天，最早是当日
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-09-30 23:59:59", value = "制度生效结束时间（可空），最小粒度为天，最早是当日")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public AlipayEbppInvoiceInstitutionModifyModel effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 制度生效起始时间
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-09-10 00:00:00", value = "制度生效起始时间")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public AlipayEbppInvoiceInstitutionModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123412341234", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceInstitutionModifyModel institutionDesc(String institutionDesc) {
    
    this.institutionDesc = institutionDesc;
    return this;
  }

   /**
   * 制度描述
   * @return institutionDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "餐补制度", value = "制度描述")

  public String getInstitutionDesc() {
    return institutionDesc;
  }


  public void setInstitutionDesc(String institutionDesc) {
    this.institutionDesc = institutionDesc;
  }


  public AlipayEbppInvoiceInstitutionModifyModel institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * 制度id
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022031000152617000000000001", value = "制度id")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public AlipayEbppInvoiceInstitutionModifyModel institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * 制度名称
   * @return institutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "费用制度", value = "制度名称")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
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
   * @return the AlipayEbppInvoiceInstitutionModifyModel instance itself
   */
  public AlipayEbppInvoiceInstitutionModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceInstitutionModifyModel alipayEbppInvoiceInstitutionModifyModel = (AlipayEbppInvoiceInstitutionModifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceInstitutionModifyModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceInstitutionModifyModel.agreementNo) &&
        Objects.equals(this.consultMode, alipayEbppInvoiceInstitutionModifyModel.consultMode) &&
        Objects.equals(this.effective, alipayEbppInvoiceInstitutionModifyModel.effective) &&
        Objects.equals(this.effectiveEndDate, alipayEbppInvoiceInstitutionModifyModel.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, alipayEbppInvoiceInstitutionModifyModel.effectiveStartDate) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceInstitutionModifyModel.enterpriseId) &&
        Objects.equals(this.institutionDesc, alipayEbppInvoiceInstitutionModifyModel.institutionDesc) &&
        Objects.equals(this.institutionId, alipayEbppInvoiceInstitutionModifyModel.institutionId) &&
        Objects.equals(this.institutionName, alipayEbppInvoiceInstitutionModifyModel.institutionName)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceInstitutionModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, consultMode, effective, effectiveEndDate, effectiveStartDate, enterpriseId, institutionDesc, institutionId, institutionName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceInstitutionModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    consultMode: ").append(toIndentedString(consultMode)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    institutionDesc: ").append(toIndentedString(institutionDesc)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("consult_mode");
    openapiFields.add("effective");
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("enterprise_id");
    openapiFields.add("institution_desc");
    openapiFields.add("institution_id");
    openapiFields.add("institution_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceInstitutionModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceInstitutionModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceInstitutionModifyModel is not found in the empty JSON string", AlipayEbppInvoiceInstitutionModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("consult_mode") != null && !jsonObj.get("consult_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consult_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consult_mode").toString()));
      }
      if (jsonObj.get("effective") != null && !jsonObj.get("effective").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective").toString()));
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("institution_desc") != null && !jsonObj.get("institution_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_desc").toString()));
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      if (jsonObj.get("institution_name") != null && !jsonObj.get("institution_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceInstitutionModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceInstitutionModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceInstitutionModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceInstitutionModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceInstitutionModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceInstitutionModifyModel value) throws IOException {
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
           public AlipayEbppInvoiceInstitutionModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceInstitutionModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceInstitutionModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceInstitutionModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceInstitutionModifyModel
  */
  public static AlipayEbppInvoiceInstitutionModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceInstitutionModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceInstitutionModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

