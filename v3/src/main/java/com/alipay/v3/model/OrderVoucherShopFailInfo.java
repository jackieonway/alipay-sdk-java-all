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
 * OrderVoucherShopFailInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderVoucherShopFailInfo {
  public static final String SERIALIZED_NAME_FAIL_MESSAGE = "fail_message";
  @SerializedName(SERIALIZED_NAME_FAIL_MESSAGE)
  private String failMessage;

  public static final String SERIALIZED_NAME_FAIL_REASONS = "fail_reasons";
  @SerializedName(SERIALIZED_NAME_FAIL_REASONS)
  private List<String> failReasons = null;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public OrderVoucherShopFailInfo() { 
  }

  public OrderVoucherShopFailInfo failMessage(String failMessage) {
    
    this.failMessage = failMessage;
    return this;
  }

   /**
   * 请求失败提示信息。
   * @return failMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求失败提示信息。")

  public String getFailMessage() {
    return failMessage;
  }


  public void setFailMessage(String failMessage) {
    this.failMessage = failMessage;
  }


  public OrderVoucherShopFailInfo failReasons(List<String> failReasons) {
    
    this.failReasons = failReasons;
    return this;
  }

  public OrderVoucherShopFailInfo addFailReasonsItem(String failReasonsItem) {
    if (this.failReasons == null) {
      this.failReasons = new ArrayList<>();
    }
    this.failReasons.add(failReasonsItem);
    return this;
  }

   /**
   * 请求失败的原因。
   * @return failReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求失败的原因。")

  public List<String> getFailReasons() {
    return failReasons;
  }


  public void setFailReasons(List<String> failReasons) {
    this.failReasons = failReasons;
  }


  public OrderVoucherShopFailInfo shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 支付宝侧蚂蚁店铺 id。
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝侧蚂蚁店铺 id。")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
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
   * @return the OrderVoucherShopFailInfo instance itself
   */
  public OrderVoucherShopFailInfo putAdditionalProperty(String key, Object value) {
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
    OrderVoucherShopFailInfo orderVoucherShopFailInfo = (OrderVoucherShopFailInfo) o;
    return Objects.equals(this.failMessage, orderVoucherShopFailInfo.failMessage) &&
        Objects.equals(this.failReasons, orderVoucherShopFailInfo.failReasons) &&
        Objects.equals(this.shopId, orderVoucherShopFailInfo.shopId)&&
        Objects.equals(this.additionalProperties, orderVoucherShopFailInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failMessage, failReasons, shopId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderVoucherShopFailInfo {\n");
    sb.append("    failMessage: ").append(toIndentedString(failMessage)).append("\n");
    sb.append("    failReasons: ").append(toIndentedString(failReasons)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
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
    openapiFields.add("fail_message");
    openapiFields.add("fail_reasons");
    openapiFields.add("shop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderVoucherShopFailInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderVoucherShopFailInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderVoucherShopFailInfo is not found in the empty JSON string", OrderVoucherShopFailInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("fail_message") != null && !jsonObj.get("fail_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_message").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("fail_reasons") != null && !jsonObj.get("fail_reasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reasons` to be an array in the JSON string but got `%s`", jsonObj.get("fail_reasons").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderVoucherShopFailInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderVoucherShopFailInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderVoucherShopFailInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderVoucherShopFailInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderVoucherShopFailInfo>() {
           @Override
           public void write(JsonWriter out, OrderVoucherShopFailInfo value) throws IOException {
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
           public OrderVoucherShopFailInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrderVoucherShopFailInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderVoucherShopFailInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderVoucherShopFailInfo
  * @throws IOException if the JSON string is invalid with respect to OrderVoucherShopFailInfo
  */
  public static OrderVoucherShopFailInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderVoucherShopFailInfo.class);
  }

 /**
  * Convert an instance of OrderVoucherShopFailInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

