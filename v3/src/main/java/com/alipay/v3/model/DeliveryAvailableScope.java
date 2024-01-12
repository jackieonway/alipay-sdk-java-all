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
import com.alipay.v3.model.DeliveryAvailableCityCode;
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
 * DeliveryAvailableScope
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryAvailableScope {
  public static final String SERIALIZED_NAME_DELIVERY_AVAILABLE_CITY_CODE = "delivery_available_city_code";
  @SerializedName(SERIALIZED_NAME_DELIVERY_AVAILABLE_CITY_CODE)
  private DeliveryAvailableCityCode deliveryAvailableCityCode;

  public static final String SERIALIZED_NAME_DELIVERY_AVAILABLE_SCOPE_TYPE = "delivery_available_scope_type";
  @SerializedName(SERIALIZED_NAME_DELIVERY_AVAILABLE_SCOPE_TYPE)
  private String deliveryAvailableScopeType;

  public DeliveryAvailableScope() { 
  }

  public DeliveryAvailableScope deliveryAvailableCityCode(DeliveryAvailableCityCode deliveryAvailableCityCode) {
    
    this.deliveryAvailableCityCode = deliveryAvailableCityCode;
    return this;
  }

   /**
   * Get deliveryAvailableCityCode
   * @return deliveryAvailableCityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryAvailableCityCode getDeliveryAvailableCityCode() {
    return deliveryAvailableCityCode;
  }


  public void setDeliveryAvailableCityCode(DeliveryAvailableCityCode deliveryAvailableCityCode) {
    this.deliveryAvailableCityCode = deliveryAvailableCityCode;
  }


  public DeliveryAvailableScope deliveryAvailableScopeType(String deliveryAvailableScopeType) {
    
    this.deliveryAvailableScopeType = deliveryAvailableScopeType;
    return this;
  }

   /**
   * 投放可用范围类型，目前支持的类型是城市范围CITY_CODE
   * @return deliveryAvailableScopeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放可用范围类型，目前支持的类型是城市范围CITY_CODE")

  public String getDeliveryAvailableScopeType() {
    return deliveryAvailableScopeType;
  }


  public void setDeliveryAvailableScopeType(String deliveryAvailableScopeType) {
    this.deliveryAvailableScopeType = deliveryAvailableScopeType;
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
   * @return the DeliveryAvailableScope instance itself
   */
  public DeliveryAvailableScope putAdditionalProperty(String key, Object value) {
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
    DeliveryAvailableScope deliveryAvailableScope = (DeliveryAvailableScope) o;
    return Objects.equals(this.deliveryAvailableCityCode, deliveryAvailableScope.deliveryAvailableCityCode) &&
        Objects.equals(this.deliveryAvailableScopeType, deliveryAvailableScope.deliveryAvailableScopeType)&&
        Objects.equals(this.additionalProperties, deliveryAvailableScope.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryAvailableCityCode, deliveryAvailableScopeType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryAvailableScope {\n");
    sb.append("    deliveryAvailableCityCode: ").append(toIndentedString(deliveryAvailableCityCode)).append("\n");
    sb.append("    deliveryAvailableScopeType: ").append(toIndentedString(deliveryAvailableScopeType)).append("\n");
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
    openapiFields.add("delivery_available_city_code");
    openapiFields.add("delivery_available_scope_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryAvailableScope
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryAvailableScope.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryAvailableScope is not found in the empty JSON string", DeliveryAvailableScope.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `delivery_available_city_code`
      if (jsonObj.getAsJsonObject("delivery_available_city_code") != null) {
        DeliveryAvailableCityCode.validateJsonObject(jsonObj.getAsJsonObject("delivery_available_city_code"));
      }
      if (jsonObj.get("delivery_available_scope_type") != null && !jsonObj.get("delivery_available_scope_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_available_scope_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_available_scope_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryAvailableScope.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryAvailableScope' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryAvailableScope> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryAvailableScope.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryAvailableScope>() {
           @Override
           public void write(JsonWriter out, DeliveryAvailableScope value) throws IOException {
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
           public DeliveryAvailableScope read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeliveryAvailableScope instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeliveryAvailableScope given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryAvailableScope
  * @throws IOException if the JSON string is invalid with respect to DeliveryAvailableScope
  */
  public static DeliveryAvailableScope fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryAvailableScope.class);
  }

 /**
  * Convert an instance of DeliveryAvailableScope to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

