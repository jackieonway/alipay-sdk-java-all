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
 * OrderExtInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderExtInfo {
  public static final String SERIALIZED_NAME_EXT_KEY = "ext_key";
  @SerializedName(SERIALIZED_NAME_EXT_KEY)
  private String extKey;

  public static final String SERIALIZED_NAME_EXT_VALUE = "ext_value";
  @SerializedName(SERIALIZED_NAME_EXT_VALUE)
  private String extValue;

  public OrderExtInfo() { 
  }

  public OrderExtInfo extKey(String extKey) {
    
    this.extKey = extKey;
    return this;
  }

   /**
   * 键值
   * @return extKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "键值")

  public String getExtKey() {
    return extKey;
  }


  public void setExtKey(String extKey) {
    this.extKey = extKey;
  }


  public OrderExtInfo extValue(String extValue) {
    
    this.extValue = extValue;
    return this;
  }

   /**
   * 值
   * @return extValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "值")

  public String getExtValue() {
    return extValue;
  }


  public void setExtValue(String extValue) {
    this.extValue = extValue;
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
   * @return the OrderExtInfo instance itself
   */
  public OrderExtInfo putAdditionalProperty(String key, Object value) {
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
    OrderExtInfo orderExtInfo = (OrderExtInfo) o;
    return Objects.equals(this.extKey, orderExtInfo.extKey) &&
        Objects.equals(this.extValue, orderExtInfo.extValue)&&
        Objects.equals(this.additionalProperties, orderExtInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extKey, extValue, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderExtInfo {\n");
    sb.append("    extKey: ").append(toIndentedString(extKey)).append("\n");
    sb.append("    extValue: ").append(toIndentedString(extValue)).append("\n");
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
    openapiFields.add("ext_key");
    openapiFields.add("ext_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderExtInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderExtInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderExtInfo is not found in the empty JSON string", OrderExtInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("ext_key") != null && !jsonObj.get("ext_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_key").toString()));
      }
      if (jsonObj.get("ext_value") != null && !jsonObj.get("ext_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderExtInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderExtInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderExtInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderExtInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderExtInfo>() {
           @Override
           public void write(JsonWriter out, OrderExtInfo value) throws IOException {
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
           public OrderExtInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrderExtInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderExtInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderExtInfo
  * @throws IOException if the JSON string is invalid with respect to OrderExtInfo
  */
  public static OrderExtInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderExtInfo.class);
  }

 /**
  * Convert an instance of OrderExtInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

