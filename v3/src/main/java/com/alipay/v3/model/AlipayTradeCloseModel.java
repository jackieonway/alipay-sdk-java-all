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
 * AlipayTradeCloseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeCloseModel {
  public static final String SERIALIZED_NAME_NOTIFY_URL = "notify_url";
  @SerializedName(SERIALIZED_NAME_NOTIFY_URL)
  private String notifyUrl;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "operator_id";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private String operatorId;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeCloseModel() { 
  }

  public AlipayTradeCloseModel notifyUrl(String notifyUrl) {
    
    this.notifyUrl = notifyUrl;
    return this;
  }

   /**
   * 通知地址
   * @return notifyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "通知地址")

  public String getNotifyUrl() {
    return notifyUrl;
  }


  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }


  public AlipayTradeCloseModel operatorId(String operatorId) {
    
    this.operatorId = operatorId;
    return this;
  }

   /**
   * 商家操作员编号 id，由商家自定义。
   * @return operatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "YX01", value = "商家操作员编号 id，由商家自定义。")

  public String getOperatorId() {
    return operatorId;
  }


  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }


  public AlipayTradeCloseModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。 trade_no,out_trade_no如果同时存在优先取trade_no
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HZ0120131127001", value = "订单支付时传入的商户订单号,和支付宝交易号不能同时为空。 trade_no,out_trade_no如果同时存在优先取trade_no")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradeCloseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 该交易在支付宝系统中的交易流水号。最短 16 位，最长 64 位。和out_trade_no不能同时为空，如果同时传了 out_trade_no和 trade_no，则以 trade_no为准。
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013112611001004680073956707", value = "该交易在支付宝系统中的交易流水号。最短 16 位，最长 64 位。和out_trade_no不能同时为空，如果同时传了 out_trade_no和 trade_no，则以 trade_no为准。")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeCloseModel alipayTradeCloseModel = (AlipayTradeCloseModel) o;
    return Objects.equals(this.notifyUrl, alipayTradeCloseModel.notifyUrl) &&
        Objects.equals(this.operatorId, alipayTradeCloseModel.operatorId) &&
        Objects.equals(this.outTradeNo, alipayTradeCloseModel.outTradeNo) &&
        Objects.equals(this.tradeNo, alipayTradeCloseModel.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyUrl, operatorId, outTradeNo, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeCloseModel {\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("notify_url");
    openapiFields.add("operator_id");
    openapiFields.add("out_trade_no");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeCloseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeCloseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeCloseModel is not found in the empty JSON string", AlipayTradeCloseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeCloseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeCloseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("notify_url") != null && !jsonObj.get("notify_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_url").toString()));
      }
      if (jsonObj.get("operator_id") != null && !jsonObj.get("operator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator_id").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeCloseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeCloseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeCloseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeCloseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeCloseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeCloseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeCloseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeCloseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeCloseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeCloseModel
  */
  public static AlipayTradeCloseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeCloseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeCloseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

