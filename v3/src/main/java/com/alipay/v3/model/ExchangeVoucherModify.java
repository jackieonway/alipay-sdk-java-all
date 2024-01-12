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
 * ExchangeVoucherModify
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExchangeVoucherModify {
  public static final String SERIALIZED_NAME_VOUCHER_DETAIL_URL = "voucher_detail_url";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DETAIL_URL)
  private String voucherDetailUrl;

  public static final String SERIALIZED_NAME_VOUCHER_NAME = "voucher_name";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NAME)
  private String voucherName;

  public ExchangeVoucherModify() { 
  }

  public ExchangeVoucherModify voucherDetailUrl(String voucherDetailUrl) {
    
    this.voucherDetailUrl = voucherDetailUrl;
    return this;
  }

   /**
   * 领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。
   * @return voucherDetailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId=xxxx", value = "领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。")

  public String getVoucherDetailUrl() {
    return voucherDetailUrl;
  }


  public void setVoucherDetailUrl(String voucherDetailUrl) {
    this.voucherDetailUrl = voucherDetailUrl;
  }


  public ExchangeVoucherModify voucherName(String voucherName) {
    
    this.voucherName = voucherName;
    return this;
  }

   /**
   * 对消费者展示的券(商品)名称。
   * @return voucherName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "满10减1", value = "对消费者展示的券(商品)名称。")

  public String getVoucherName() {
    return voucherName;
  }


  public void setVoucherName(String voucherName) {
    this.voucherName = voucherName;
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
   * @return the ExchangeVoucherModify instance itself
   */
  public ExchangeVoucherModify putAdditionalProperty(String key, Object value) {
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
    ExchangeVoucherModify exchangeVoucherModify = (ExchangeVoucherModify) o;
    return Objects.equals(this.voucherDetailUrl, exchangeVoucherModify.voucherDetailUrl) &&
        Objects.equals(this.voucherName, exchangeVoucherModify.voucherName)&&
        Objects.equals(this.additionalProperties, exchangeVoucherModify.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherDetailUrl, voucherName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeVoucherModify {\n");
    sb.append("    voucherDetailUrl: ").append(toIndentedString(voucherDetailUrl)).append("\n");
    sb.append("    voucherName: ").append(toIndentedString(voucherName)).append("\n");
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
    openapiFields.add("voucher_detail_url");
    openapiFields.add("voucher_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExchangeVoucherModify
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExchangeVoucherModify.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExchangeVoucherModify is not found in the empty JSON string", ExchangeVoucherModify.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("voucher_detail_url") != null && !jsonObj.get("voucher_detail_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_detail_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_detail_url").toString()));
      }
      if (jsonObj.get("voucher_name") != null && !jsonObj.get("voucher_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExchangeVoucherModify.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExchangeVoucherModify' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExchangeVoucherModify> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExchangeVoucherModify.class));

       return (TypeAdapter<T>) new TypeAdapter<ExchangeVoucherModify>() {
           @Override
           public void write(JsonWriter out, ExchangeVoucherModify value) throws IOException {
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
           public ExchangeVoucherModify read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExchangeVoucherModify instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExchangeVoucherModify given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExchangeVoucherModify
  * @throws IOException if the JSON string is invalid with respect to ExchangeVoucherModify
  */
  public static ExchangeVoucherModify fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExchangeVoucherModify.class);
  }

 /**
  * Convert an instance of ExchangeVoucherModify to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

