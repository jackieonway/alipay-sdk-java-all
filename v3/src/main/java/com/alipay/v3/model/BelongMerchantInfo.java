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
 * BelongMerchantInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BelongMerchantInfo {
  public static final String SERIALIZED_NAME_BUSINESS_TYPE = "business_type";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TYPE)
  private String businessType;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_MERCHANT_ID_TYPE = "merchant_id_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID_TYPE)
  private String merchantIdType;

  public BelongMerchantInfo() { 
  }

  public BelongMerchantInfo businessType(String businessType) {
    
    this.businessType = businessType;
    return this;
  }

   /**
   * 合作业务类型,默认为ISV_FOR_MERCHANT
   * @return businessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "合作业务类型,默认为ISV_FOR_MERCHANT")

  public String getBusinessType() {
    return businessType;
  }


  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }


  public BelongMerchantInfo merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 商户PID,默认为当前接口调用商户。
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户PID,默认为当前接口调用商户。")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public BelongMerchantInfo merchantIdType(String merchantIdType) {
    
    this.merchantIdType = merchantIdType;
    return this;
  }

   /**
   * 商户id类型。特别说明：如果merchant_id_type选择SMID。则表明当前商家券活动的归属者是该SMID所绑定的支付宝PID。因此要求该SMID必须绑定相应的支付宝PID。
   * @return merchantIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户id类型。特别说明：如果merchant_id_type选择SMID。则表明当前商家券活动的归属者是该SMID所绑定的支付宝PID。因此要求该SMID必须绑定相应的支付宝PID。")

  public String getMerchantIdType() {
    return merchantIdType;
  }


  public void setMerchantIdType(String merchantIdType) {
    this.merchantIdType = merchantIdType;
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
   * @return the BelongMerchantInfo instance itself
   */
  public BelongMerchantInfo putAdditionalProperty(String key, Object value) {
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
    BelongMerchantInfo belongMerchantInfo = (BelongMerchantInfo) o;
    return Objects.equals(this.businessType, belongMerchantInfo.businessType) &&
        Objects.equals(this.merchantId, belongMerchantInfo.merchantId) &&
        Objects.equals(this.merchantIdType, belongMerchantInfo.merchantIdType)&&
        Objects.equals(this.additionalProperties, belongMerchantInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessType, merchantId, merchantIdType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BelongMerchantInfo {\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantIdType: ").append(toIndentedString(merchantIdType)).append("\n");
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
    openapiFields.add("business_type");
    openapiFields.add("merchant_id");
    openapiFields.add("merchant_id_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BelongMerchantInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BelongMerchantInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BelongMerchantInfo is not found in the empty JSON string", BelongMerchantInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("business_type") != null && !jsonObj.get("business_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_type").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("merchant_id_type") != null && !jsonObj.get("merchant_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BelongMerchantInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BelongMerchantInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BelongMerchantInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BelongMerchantInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BelongMerchantInfo>() {
           @Override
           public void write(JsonWriter out, BelongMerchantInfo value) throws IOException {
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
           public BelongMerchantInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BelongMerchantInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BelongMerchantInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BelongMerchantInfo
  * @throws IOException if the JSON string is invalid with respect to BelongMerchantInfo
  */
  public static BelongMerchantInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BelongMerchantInfo.class);
  }

 /**
  * Convert an instance of BelongMerchantInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

