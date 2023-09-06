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
 * BizfundSettleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BizfundSettleInfo {
  public static final String SERIALIZED_NAME_SETTLE_MODE = "settle_mode";
  @SerializedName(SERIALIZED_NAME_SETTLE_MODE)
  private String settleMode;

  public static final String SERIALIZED_NAME_SETTLE_TARGET_TYPE = "settle_target_type";
  @SerializedName(SERIALIZED_NAME_SETTLE_TARGET_TYPE)
  private String settleTargetType;

  public BizfundSettleInfo() { 
  }

  public BizfundSettleInfo settleMode(String settleMode) {
    
    this.settleMode = settleMode;
    return this;
  }

   /**
   * 请款|账期 模式
   * @return settleMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请款|账期 模式")

  public String getSettleMode() {
    return settleMode;
  }


  public void setSettleMode(String settleMode) {
    this.settleMode = settleMode;
  }


  public BizfundSettleInfo settleTargetType(String settleTargetType) {
    
    this.settleTargetType = settleTargetType;
    return this;
  }

   /**
   * 结算的目标对象类型
   * @return settleTargetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结算的目标对象类型")

  public String getSettleTargetType() {
    return settleTargetType;
  }


  public void setSettleTargetType(String settleTargetType) {
    this.settleTargetType = settleTargetType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BizfundSettleInfo bizfundSettleInfo = (BizfundSettleInfo) o;
    return Objects.equals(this.settleMode, bizfundSettleInfo.settleMode) &&
        Objects.equals(this.settleTargetType, bizfundSettleInfo.settleTargetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settleMode, settleTargetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BizfundSettleInfo {\n");
    sb.append("    settleMode: ").append(toIndentedString(settleMode)).append("\n");
    sb.append("    settleTargetType: ").append(toIndentedString(settleTargetType)).append("\n");
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
    openapiFields.add("settle_mode");
    openapiFields.add("settle_target_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BizfundSettleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BizfundSettleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BizfundSettleInfo is not found in the empty JSON string", BizfundSettleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BizfundSettleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BizfundSettleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("settle_mode") != null && !jsonObj.get("settle_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_mode").toString()));
      }
      if (jsonObj.get("settle_target_type") != null && !jsonObj.get("settle_target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_target_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BizfundSettleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BizfundSettleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BizfundSettleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BizfundSettleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BizfundSettleInfo>() {
           @Override
           public void write(JsonWriter out, BizfundSettleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BizfundSettleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BizfundSettleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BizfundSettleInfo
  * @throws IOException if the JSON string is invalid with respect to BizfundSettleInfo
  */
  public static BizfundSettleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BizfundSettleInfo.class);
  }

 /**
  * Convert an instance of BizfundSettleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

