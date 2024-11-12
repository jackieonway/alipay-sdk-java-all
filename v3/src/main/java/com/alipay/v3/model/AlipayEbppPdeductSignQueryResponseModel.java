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
 * AlipayEbppPdeductSignQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppPdeductSignQueryResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_BILL_KEY = "bill_key";
  @SerializedName(SERIALIZED_NAME_BILL_KEY)
  private String billKey;

  public static final String SERIALIZED_NAME_CHARGE_INST = "charge_inst";
  @SerializedName(SERIALIZED_NAME_CHARGE_INST)
  private String chargeInst;

  public static final String SERIALIZED_NAME_OUT_AGREEMENT_ID = "out_agreement_id";
  @SerializedName(SERIALIZED_NAME_OUT_AGREEMENT_ID)
  private String outAgreementId;

  public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE)
  private String signDate;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayEbppPdeductSignQueryResponseModel() { 
  }

  public AlipayEbppPdeductSignQueryResponseModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 协议ID
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160331000700130000930600556911", value = "协议ID")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public AlipayEbppPdeductSignQueryResponseModel billKey(String billKey) {
    
    this.billKey = billKey;
    return this;
  }

   /**
   * 户号
   * @return billKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03983123", value = "户号")

  public String getBillKey() {
    return billKey;
  }


  public void setBillKey(String billKey) {
    this.billKey = billKey;
  }


  public AlipayEbppPdeductSignQueryResponseModel chargeInst(String chargeInst) {
    
    this.chargeInst = chargeInst;
    return this;
  }

   /**
   * 出账机构
   * @return chargeInst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HZYHWATER", value = "出账机构")

  public String getChargeInst() {
    return chargeInst;
  }


  public void setChargeInst(String chargeInst) {
    this.chargeInst = chargeInst;
  }


  public AlipayEbppPdeductSignQueryResponseModel outAgreementId(String outAgreementId) {
    
    this.outAgreementId = outAgreementId;
    return this;
  }

   /**
   * 朗新协议ID
   * @return outAgreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "738F4D9B6F825FDE9D07773E08BD0A2E", value = "朗新协议ID")

  public String getOutAgreementId() {
    return outAgreementId;
  }


  public void setOutAgreementId(String outAgreementId) {
    this.outAgreementId = outAgreementId;
  }


  public AlipayEbppPdeductSignQueryResponseModel signDate(String signDate) {
    
    this.signDate = signDate;
    return this;
  }

   /**
   * 签约时间
   * @return signDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-02-03 18:00:00", value = "签约时间")

  public String getSignDate() {
    return signDate;
  }


  public void setSignDate(String signDate) {
    this.signDate = signDate;
  }


  public AlipayEbppPdeductSignQueryResponseModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088022621144305", value = "用户ID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
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
   * @return the AlipayEbppPdeductSignQueryResponseModel instance itself
   */
  public AlipayEbppPdeductSignQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppPdeductSignQueryResponseModel alipayEbppPdeductSignQueryResponseModel = (AlipayEbppPdeductSignQueryResponseModel) o;
    return Objects.equals(this.agreementId, alipayEbppPdeductSignQueryResponseModel.agreementId) &&
        Objects.equals(this.billKey, alipayEbppPdeductSignQueryResponseModel.billKey) &&
        Objects.equals(this.chargeInst, alipayEbppPdeductSignQueryResponseModel.chargeInst) &&
        Objects.equals(this.outAgreementId, alipayEbppPdeductSignQueryResponseModel.outAgreementId) &&
        Objects.equals(this.signDate, alipayEbppPdeductSignQueryResponseModel.signDate) &&
        Objects.equals(this.userId, alipayEbppPdeductSignQueryResponseModel.userId)&&
        Objects.equals(this.additionalProperties, alipayEbppPdeductSignQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, billKey, chargeInst, outAgreementId, signDate, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppPdeductSignQueryResponseModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    billKey: ").append(toIndentedString(billKey)).append("\n");
    sb.append("    chargeInst: ").append(toIndentedString(chargeInst)).append("\n");
    sb.append("    outAgreementId: ").append(toIndentedString(outAgreementId)).append("\n");
    sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("bill_key");
    openapiFields.add("charge_inst");
    openapiFields.add("out_agreement_id");
    openapiFields.add("sign_date");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppPdeductSignQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppPdeductSignQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppPdeductSignQueryResponseModel is not found in the empty JSON string", AlipayEbppPdeductSignQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("bill_key") != null && !jsonObj.get("bill_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_key").toString()));
      }
      if (jsonObj.get("charge_inst") != null && !jsonObj.get("charge_inst").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_inst` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_inst").toString()));
      }
      if (jsonObj.get("out_agreement_id") != null && !jsonObj.get("out_agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_agreement_id").toString()));
      }
      if (jsonObj.get("sign_date") != null && !jsonObj.get("sign_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_date").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppPdeductSignQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppPdeductSignQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppPdeductSignQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppPdeductSignQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppPdeductSignQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppPdeductSignQueryResponseModel value) throws IOException {
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
           public AlipayEbppPdeductSignQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppPdeductSignQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppPdeductSignQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppPdeductSignQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppPdeductSignQueryResponseModel
  */
  public static AlipayEbppPdeductSignQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppPdeductSignQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppPdeductSignQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

