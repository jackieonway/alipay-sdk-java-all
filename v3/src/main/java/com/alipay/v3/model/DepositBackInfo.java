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
 * DepositBackInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepositBackInfo {
  public static final String SERIALIZED_NAME_BANK_ACK_TIME = "bank_ack_time";
  @SerializedName(SERIALIZED_NAME_BANK_ACK_TIME)
  private String bankAckTime;

  public static final String SERIALIZED_NAME_DBACK_AMOUNT = "dback_amount";
  @SerializedName(SERIALIZED_NAME_DBACK_AMOUNT)
  private String dbackAmount;

  public static final String SERIALIZED_NAME_DBACK_STATUS = "dback_status";
  @SerializedName(SERIALIZED_NAME_DBACK_STATUS)
  private String dbackStatus;

  public static final String SERIALIZED_NAME_EST_BANK_RECEIPT_TIME = "est_bank_receipt_time";
  @SerializedName(SERIALIZED_NAME_EST_BANK_RECEIPT_TIME)
  private String estBankReceiptTime;

  public static final String SERIALIZED_NAME_HAS_DEPOSIT_BACK = "has_deposit_back";
  @SerializedName(SERIALIZED_NAME_HAS_DEPOSIT_BACK)
  private String hasDepositBack;

  public DepositBackInfo() { 
  }

  public DepositBackInfo bankAckTime(String bankAckTime) {
    
    this.bankAckTime = bankAckTime;
    return this;
  }

   /**
   * 银行响应时间，格式为yyyy-MM-dd HH:mm:ss
   * @return bankAckTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "银行响应时间，格式为yyyy-MM-dd HH:mm:ss")

  public String getBankAckTime() {
    return bankAckTime;
  }


  public void setBankAckTime(String bankAckTime) {
    this.bankAckTime = bankAckTime;
  }


  public DepositBackInfo dbackAmount(String dbackAmount) {
    
    this.dbackAmount = dbackAmount;
    return this;
  }

   /**
   * 银行卡冲退金额。单位：元。
   * @return dbackAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "银行卡冲退金额。单位：元。")

  public String getDbackAmount() {
    return dbackAmount;
  }


  public void setDbackAmount(String dbackAmount) {
    this.dbackAmount = dbackAmount;
  }


  public DepositBackInfo dbackStatus(String dbackStatus) {
    
    this.dbackStatus = dbackStatus;
    return this;
  }

   /**
   * 银行卡冲退状态。S-成功，F-失败，P-处理中。银行卡冲退失败，资金自动转入用户支付宝余额。
   * @return dbackStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "银行卡冲退状态。S-成功，F-失败，P-处理中。银行卡冲退失败，资金自动转入用户支付宝余额。")

  public String getDbackStatus() {
    return dbackStatus;
  }


  public void setDbackStatus(String dbackStatus) {
    this.dbackStatus = dbackStatus;
  }


  public DepositBackInfo estBankReceiptTime(String estBankReceiptTime) {
    
    this.estBankReceiptTime = estBankReceiptTime;
    return this;
  }

   /**
   * 预估银行到账时间，格式为yyyy-MM-dd HH:mm:ss
   * @return estBankReceiptTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预估银行到账时间，格式为yyyy-MM-dd HH:mm:ss")

  public String getEstBankReceiptTime() {
    return estBankReceiptTime;
  }


  public void setEstBankReceiptTime(String estBankReceiptTime) {
    this.estBankReceiptTime = estBankReceiptTime;
  }


  public DepositBackInfo hasDepositBack(String hasDepositBack) {
    
    this.hasDepositBack = hasDepositBack;
    return this;
  }

   /**
   * 是否存在银行卡冲退信息。
   * @return hasDepositBack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否存在银行卡冲退信息。")

  public String getHasDepositBack() {
    return hasDepositBack;
  }


  public void setHasDepositBack(String hasDepositBack) {
    this.hasDepositBack = hasDepositBack;
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
   * @return the DepositBackInfo instance itself
   */
  public DepositBackInfo putAdditionalProperty(String key, Object value) {
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
    DepositBackInfo depositBackInfo = (DepositBackInfo) o;
    return Objects.equals(this.bankAckTime, depositBackInfo.bankAckTime) &&
        Objects.equals(this.dbackAmount, depositBackInfo.dbackAmount) &&
        Objects.equals(this.dbackStatus, depositBackInfo.dbackStatus) &&
        Objects.equals(this.estBankReceiptTime, depositBackInfo.estBankReceiptTime) &&
        Objects.equals(this.hasDepositBack, depositBackInfo.hasDepositBack)&&
        Objects.equals(this.additionalProperties, depositBackInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAckTime, dbackAmount, dbackStatus, estBankReceiptTime, hasDepositBack, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositBackInfo {\n");
    sb.append("    bankAckTime: ").append(toIndentedString(bankAckTime)).append("\n");
    sb.append("    dbackAmount: ").append(toIndentedString(dbackAmount)).append("\n");
    sb.append("    dbackStatus: ").append(toIndentedString(dbackStatus)).append("\n");
    sb.append("    estBankReceiptTime: ").append(toIndentedString(estBankReceiptTime)).append("\n");
    sb.append("    hasDepositBack: ").append(toIndentedString(hasDepositBack)).append("\n");
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
    openapiFields.add("bank_ack_time");
    openapiFields.add("dback_amount");
    openapiFields.add("dback_status");
    openapiFields.add("est_bank_receipt_time");
    openapiFields.add("has_deposit_back");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DepositBackInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DepositBackInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DepositBackInfo is not found in the empty JSON string", DepositBackInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("bank_ack_time") != null && !jsonObj.get("bank_ack_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_ack_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_ack_time").toString()));
      }
      if (jsonObj.get("dback_amount") != null && !jsonObj.get("dback_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dback_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dback_amount").toString()));
      }
      if (jsonObj.get("dback_status") != null && !jsonObj.get("dback_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dback_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dback_status").toString()));
      }
      if (jsonObj.get("est_bank_receipt_time") != null && !jsonObj.get("est_bank_receipt_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `est_bank_receipt_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("est_bank_receipt_time").toString()));
      }
      if (jsonObj.get("has_deposit_back") != null && !jsonObj.get("has_deposit_back").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `has_deposit_back` to be a primitive type in the JSON string but got `%s`", jsonObj.get("has_deposit_back").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DepositBackInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DepositBackInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DepositBackInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DepositBackInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DepositBackInfo>() {
           @Override
           public void write(JsonWriter out, DepositBackInfo value) throws IOException {
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
           public DepositBackInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DepositBackInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DepositBackInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DepositBackInfo
  * @throws IOException if the JSON string is invalid with respect to DepositBackInfo
  */
  public static DepositBackInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DepositBackInfo.class);
  }

 /**
  * Convert an instance of DepositBackInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

