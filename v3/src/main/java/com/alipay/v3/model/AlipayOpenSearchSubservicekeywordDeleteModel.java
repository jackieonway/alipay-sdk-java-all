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
 * AlipayOpenSearchSubservicekeywordDeleteModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchSubservicekeywordDeleteModel {
  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private String configId;

  public static final String SERIALIZED_NAME_TARGET_APPID = "target_appid";
  @SerializedName(SERIALIZED_NAME_TARGET_APPID)
  private String targetAppid;

  public AlipayOpenSearchSubservicekeywordDeleteModel() { 
  }

  public AlipayOpenSearchSubservicekeywordDeleteModel configId(String configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 关键词配置ID
   * @return configId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220513000000165607", value = "关键词配置ID")

  public String getConfigId() {
    return configId;
  }


  public void setConfigId(String configId) {
    this.configId = configId;
  }


  public AlipayOpenSearchSubservicekeywordDeleteModel targetAppid(String targetAppid) {
    
    this.targetAppid = targetAppid;
    return this;
  }

   /**
   * 小程序id
   * @return targetAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001112626071", value = "小程序id")

  public String getTargetAppid() {
    return targetAppid;
  }


  public void setTargetAppid(String targetAppid) {
    this.targetAppid = targetAppid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSearchSubservicekeywordDeleteModel alipayOpenSearchSubservicekeywordDeleteModel = (AlipayOpenSearchSubservicekeywordDeleteModel) o;
    return Objects.equals(this.configId, alipayOpenSearchSubservicekeywordDeleteModel.configId) &&
        Objects.equals(this.targetAppid, alipayOpenSearchSubservicekeywordDeleteModel.targetAppid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, targetAppid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchSubservicekeywordDeleteModel {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    targetAppid: ").append(toIndentedString(targetAppid)).append("\n");
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
    openapiFields.add("config_id");
    openapiFields.add("target_appid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchSubservicekeywordDeleteModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchSubservicekeywordDeleteModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchSubservicekeywordDeleteModel is not found in the empty JSON string", AlipayOpenSearchSubservicekeywordDeleteModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchSubservicekeywordDeleteModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchSubservicekeywordDeleteModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("config_id") != null && !jsonObj.get("config_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `config_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("config_id").toString()));
      }
      if (jsonObj.get("target_appid") != null && !jsonObj.get("target_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchSubservicekeywordDeleteModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchSubservicekeywordDeleteModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchSubservicekeywordDeleteModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchSubservicekeywordDeleteModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchSubservicekeywordDeleteModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchSubservicekeywordDeleteModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchSubservicekeywordDeleteModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchSubservicekeywordDeleteModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchSubservicekeywordDeleteModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchSubservicekeywordDeleteModel
  */
  public static AlipayOpenSearchSubservicekeywordDeleteModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchSubservicekeywordDeleteModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchSubservicekeywordDeleteModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

