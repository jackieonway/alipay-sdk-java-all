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
 * FailVoucherCodeDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FailVoucherCodeDetail {
  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MSG = "error_msg";
  @SerializedName(SERIALIZED_NAME_ERROR_MSG)
  private String errorMsg;

  public static final String SERIALIZED_NAME_VOUCHER_CODE = "voucher_code";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CODE)
  private String voucherCode;

  public FailVoucherCodeDetail() { 
  }

  public FailVoucherCodeDetail errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 券码导入失败错误码
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VOUCHER_CODE_DUPLICATE", value = "券码导入失败错误码")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public FailVoucherCodeDetail errorMsg(String errorMsg) {
    
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * 券码导入失败错误原因描述
   * @return errorMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "与之前导入的券码重复", value = "券码导入失败错误原因描述")

  public String getErrorMsg() {
    return errorMsg;
  }


  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }


  public FailVoucherCodeDetail voucherCode(String voucherCode) {
    
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * 券码
   * @return voucherCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "789CE", value = "券码")

  public String getVoucherCode() {
    return voucherCode;
  }


  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailVoucherCodeDetail failVoucherCodeDetail = (FailVoucherCodeDetail) o;
    return Objects.equals(this.errorCode, failVoucherCodeDetail.errorCode) &&
        Objects.equals(this.errorMsg, failVoucherCodeDetail.errorMsg) &&
        Objects.equals(this.voucherCode, failVoucherCodeDetail.voucherCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMsg, voucherCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailVoucherCodeDetail {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
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
    openapiFields.add("error_code");
    openapiFields.add("error_msg");
    openapiFields.add("voucher_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FailVoucherCodeDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FailVoucherCodeDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FailVoucherCodeDetail is not found in the empty JSON string", FailVoucherCodeDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FailVoucherCodeDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FailVoucherCodeDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("error_code") != null && !jsonObj.get("error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_code").toString()));
      }
      if (jsonObj.get("error_msg") != null && !jsonObj.get("error_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_msg").toString()));
      }
      if (jsonObj.get("voucher_code") != null && !jsonObj.get("voucher_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FailVoucherCodeDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FailVoucherCodeDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FailVoucherCodeDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FailVoucherCodeDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<FailVoucherCodeDetail>() {
           @Override
           public void write(JsonWriter out, FailVoucherCodeDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FailVoucherCodeDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FailVoucherCodeDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FailVoucherCodeDetail
  * @throws IOException if the JSON string is invalid with respect to FailVoucherCodeDetail
  */
  public static FailVoucherCodeDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FailVoucherCodeDetail.class);
  }

 /**
  * Convert an instance of FailVoucherCodeDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

