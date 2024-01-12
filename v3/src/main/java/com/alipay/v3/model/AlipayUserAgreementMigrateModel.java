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
 * AlipayUserAgreementMigrateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserAgreementMigrateModel {
  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_TARGET_APP_ID = "target_app_id";
  @SerializedName(SERIALIZED_NAME_TARGET_APP_ID)
  private String targetAppId;

  public static final String SERIALIZED_NAME_TARGET_INVOKE_APP_ID = "target_invoke_app_id";
  @SerializedName(SERIALIZED_NAME_TARGET_INVOKE_APP_ID)
  private String targetInvokeAppId;

  public static final String SERIALIZED_NAME_TARGET_PARTNER_ID = "target_partner_id";
  @SerializedName(SERIALIZED_NAME_TARGET_PARTNER_ID)
  private String targetPartnerId;

  public AlipayUserAgreementMigrateModel() { 
  }

  public AlipayUserAgreementMigrateModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170322450983769228", value = "支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayUserAgreementMigrateModel targetAppId(String targetAppId) {
    
    this.targetAppId = targetAppId;
    return this;
  }

   /**
   * 需要迁移的目标商户应用id
   * @return targetAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014072300007148", value = "需要迁移的目标商户应用id")

  public String getTargetAppId() {
    return targetAppId;
  }


  public void setTargetAppId(String targetAppId) {
    this.targetAppId = targetAppId;
  }


  public AlipayUserAgreementMigrateModel targetInvokeAppId(String targetInvokeAppId) {
    
    this.targetInvokeAppId = targetInvokeAppId;
    return this;
  }

   /**
   * 需要迁移的目标商户调用应用id
   * @return targetInvokeAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014072300007148", value = "需要迁移的目标商户调用应用id")

  public String getTargetInvokeAppId() {
    return targetInvokeAppId;
  }


  public void setTargetInvokeAppId(String targetInvokeAppId) {
    this.targetInvokeAppId = targetInvokeAppId;
  }


  public AlipayUserAgreementMigrateModel targetPartnerId(String targetPartnerId) {
    
    this.targetPartnerId = targetPartnerId;
    return this;
  }

   /**
   * 需要迁移的目标商户id
   * @return targetPartnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101122675263", value = "需要迁移的目标商户id")

  public String getTargetPartnerId() {
    return targetPartnerId;
  }


  public void setTargetPartnerId(String targetPartnerId) {
    this.targetPartnerId = targetPartnerId;
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
   * @return the AlipayUserAgreementMigrateModel instance itself
   */
  public AlipayUserAgreementMigrateModel putAdditionalProperty(String key, Object value) {
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
    AlipayUserAgreementMigrateModel alipayUserAgreementMigrateModel = (AlipayUserAgreementMigrateModel) o;
    return Objects.equals(this.agreementNo, alipayUserAgreementMigrateModel.agreementNo) &&
        Objects.equals(this.targetAppId, alipayUserAgreementMigrateModel.targetAppId) &&
        Objects.equals(this.targetInvokeAppId, alipayUserAgreementMigrateModel.targetInvokeAppId) &&
        Objects.equals(this.targetPartnerId, alipayUserAgreementMigrateModel.targetPartnerId)&&
        Objects.equals(this.additionalProperties, alipayUserAgreementMigrateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNo, targetAppId, targetInvokeAppId, targetPartnerId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserAgreementMigrateModel {\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    targetAppId: ").append(toIndentedString(targetAppId)).append("\n");
    sb.append("    targetInvokeAppId: ").append(toIndentedString(targetInvokeAppId)).append("\n");
    sb.append("    targetPartnerId: ").append(toIndentedString(targetPartnerId)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("target_app_id");
    openapiFields.add("target_invoke_app_id");
    openapiFields.add("target_partner_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserAgreementMigrateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserAgreementMigrateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserAgreementMigrateModel is not found in the empty JSON string", AlipayUserAgreementMigrateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("target_app_id") != null && !jsonObj.get("target_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_app_id").toString()));
      }
      if (jsonObj.get("target_invoke_app_id") != null && !jsonObj.get("target_invoke_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_invoke_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_invoke_app_id").toString()));
      }
      if (jsonObj.get("target_partner_id") != null && !jsonObj.get("target_partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_partner_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserAgreementMigrateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserAgreementMigrateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserAgreementMigrateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserAgreementMigrateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserAgreementMigrateModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserAgreementMigrateModel value) throws IOException {
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
           public AlipayUserAgreementMigrateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayUserAgreementMigrateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayUserAgreementMigrateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserAgreementMigrateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserAgreementMigrateModel
  */
  public static AlipayUserAgreementMigrateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserAgreementMigrateModel.class);
  }

 /**
  * Convert an instance of AlipayUserAgreementMigrateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

