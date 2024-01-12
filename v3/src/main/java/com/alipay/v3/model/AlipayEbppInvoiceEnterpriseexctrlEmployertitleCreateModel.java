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
 * AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_TAX_REGISTER_NO = "tax_register_no";
  @SerializedName(SERIALIZED_NAME_TAX_REGISTER_NO)
  private String taxRegisterNo;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_TITLE_NAME = "title_name";
  @SerializedName(SERIALIZED_NAME_TITLE_NAME)
  private String titleName;

  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel() { 
  }

  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业共同账户id
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业共同账户id")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 企业地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "***省***市****区", value = "企业地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001181407500", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel bankAccount(String bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * 开户行账号
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "622000********", value = "开户行账号")

  public String getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * 开户行名称
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "招商银行", value = "开户行名称")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel enterpriseId(String enterpriseId) {
    
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


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel taxRegisterNo(String taxRegisterNo) {
    
    this.taxRegisterNo = taxRegisterNo;
    return this;
  }

   /**
   * 税号
   * @return taxRegisterNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9133*********5852F", value = "税号")

  public String getTaxRegisterNo() {
    return taxRegisterNo;
  }


  public void setTaxRegisterNo(String taxRegisterNo) {
    this.taxRegisterNo = taxRegisterNo;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * 电话
   * @return telephone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0739-56*****", value = "电话")

  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel titleName(String titleName) {
    
    this.titleName = titleName;
    return this;
  }

   /**
   * 企业抬头名称
   * @return titleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "*****有限公司", value = "企业抬头名称")

  public String getTitleName() {
    return titleName;
  }


  public void setTitleName(String titleName) {
    this.titleName = titleName;
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
   * @return the AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel instance itself
   */
  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel = (AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.accountId) &&
        Objects.equals(this.address, alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.address) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.agreementNo) &&
        Objects.equals(this.bankAccount, alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.bankAccount) &&
        Objects.equals(this.bankName, alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.bankName) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.enterpriseId) &&
        Objects.equals(this.taxRegisterNo, alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.taxRegisterNo) &&
        Objects.equals(this.telephone, alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.telephone) &&
        Objects.equals(this.titleName, alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.titleName)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, address, agreementNo, bankAccount, bankName, enterpriseId, taxRegisterNo, telephone, titleName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    taxRegisterNo: ").append(toIndentedString(taxRegisterNo)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    titleName: ").append(toIndentedString(titleName)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("agreement_no");
    openapiFields.add("bank_account");
    openapiFields.add("bank_name");
    openapiFields.add("enterprise_id");
    openapiFields.add("tax_register_no");
    openapiFields.add("telephone");
    openapiFields.add("title_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel is not found in the empty JSON string", AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("bank_account") != null && !jsonObj.get("bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account").toString()));
      }
      if (jsonObj.get("bank_name") != null && !jsonObj.get("bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_name").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("tax_register_no") != null && !jsonObj.get("tax_register_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_register_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_register_no").toString()));
      }
      if (jsonObj.get("telephone") != null && !jsonObj.get("telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephone").toString()));
      }
      if (jsonObj.get("title_name") != null && !jsonObj.get("title_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel value) throws IOException {
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
           public AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel
  */
  public static AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

