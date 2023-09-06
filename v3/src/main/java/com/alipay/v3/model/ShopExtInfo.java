/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-09-06
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
 * ShopExtInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShopExtInfo {
  public static final String SERIALIZED_NAME_KEY_NAME = "key_name";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ShopExtInfo() { 
  }

  public ShopExtInfo keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * KV数据对的key，表示该kv对象表示什么含义。
   * @return keyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KV数据对的key，表示该kv对象表示什么含义。")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public ShopExtInfo value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * kv对象的值
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "kv对象的值")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopExtInfo shopExtInfo = (ShopExtInfo) o;
    return Objects.equals(this.keyName, shopExtInfo.keyName) &&
        Objects.equals(this.value, shopExtInfo.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopExtInfo {\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("key_name");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopExtInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShopExtInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopExtInfo is not found in the empty JSON string", ShopExtInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopExtInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopExtInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("key_name") != null && !jsonObj.get("key_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_name").toString()));
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopExtInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopExtInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopExtInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopExtInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopExtInfo>() {
           @Override
           public void write(JsonWriter out, ShopExtInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopExtInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopExtInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopExtInfo
  * @throws IOException if the JSON string is invalid with respect to ShopExtInfo
  */
  public static ShopExtInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopExtInfo.class);
  }

 /**
  * Convert an instance of ShopExtInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

