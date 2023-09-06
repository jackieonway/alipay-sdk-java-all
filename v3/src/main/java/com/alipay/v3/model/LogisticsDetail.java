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
 * LogisticsDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogisticsDetail {
  public static final String SERIALIZED_NAME_LOGISTICS_TYPE = "logistics_type";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_TYPE)
  private String logisticsType;

  public LogisticsDetail() { 
  }

  public LogisticsDetail logisticsType(String logisticsType) {
    
    this.logisticsType = logisticsType;
    return this;
  }

   /**
   * 物流类型
   * @return logisticsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXPRESS", value = "物流类型")

  public String getLogisticsType() {
    return logisticsType;
  }


  public void setLogisticsType(String logisticsType) {
    this.logisticsType = logisticsType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogisticsDetail logisticsDetail = (LogisticsDetail) o;
    return Objects.equals(this.logisticsType, logisticsDetail.logisticsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logisticsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogisticsDetail {\n");
    sb.append("    logisticsType: ").append(toIndentedString(logisticsType)).append("\n");
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
    openapiFields.add("logistics_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LogisticsDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LogisticsDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogisticsDetail is not found in the empty JSON string", LogisticsDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LogisticsDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LogisticsDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("logistics_type") != null && !jsonObj.get("logistics_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logistics_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logistics_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogisticsDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogisticsDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogisticsDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogisticsDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<LogisticsDetail>() {
           @Override
           public void write(JsonWriter out, LogisticsDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LogisticsDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LogisticsDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogisticsDetail
  * @throws IOException if the JSON string is invalid with respect to LogisticsDetail
  */
  public static LogisticsDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogisticsDetail.class);
  }

 /**
  * Convert an instance of LogisticsDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

