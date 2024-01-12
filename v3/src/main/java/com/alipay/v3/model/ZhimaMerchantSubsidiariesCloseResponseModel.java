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
 * ZhimaMerchantSubsidiariesCloseResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaMerchantSubsidiariesCloseResponseModel {
  public static final String SERIALIZED_NAME_BIZ_ERROR_CODE = "biz_error_code";
  @SerializedName(SERIALIZED_NAME_BIZ_ERROR_CODE)
  private String bizErrorCode;

  public static final String SERIALIZED_NAME_BIZ_ERROR_MESSAGE = "biz_error_message";
  @SerializedName(SERIALIZED_NAME_BIZ_ERROR_MESSAGE)
  private String bizErrorMessage;

  public static final String SERIALIZED_NAME_ORDER_MEMO = "order_memo";
  @SerializedName(SERIALIZED_NAME_ORDER_MEMO)
  private String orderMemo;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public ZhimaMerchantSubsidiariesCloseResponseModel() { 
  }

  public ZhimaMerchantSubsidiariesCloseResponseModel bizErrorCode(String bizErrorCode) {
    
    this.bizErrorCode = bizErrorCode;
    return this;
  }

   /**
   * 业务错误码
   * @return bizErrorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1001", value = "业务错误码")

  public String getBizErrorCode() {
    return bizErrorCode;
  }


  public void setBizErrorCode(String bizErrorCode) {
    this.bizErrorCode = bizErrorCode;
  }


  public ZhimaMerchantSubsidiariesCloseResponseModel bizErrorMessage(String bizErrorMessage) {
    
    this.bizErrorMessage = bizErrorMessage;
    return this;
  }

   /**
   * 业务错误信息
   * @return bizErrorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "处理失败", value = "业务错误信息")

  public String getBizErrorMessage() {
    return bizErrorMessage;
  }


  public void setBizErrorMessage(String bizErrorMessage) {
    this.bizErrorMessage = bizErrorMessage;
  }


  public ZhimaMerchantSubsidiariesCloseResponseModel orderMemo(String orderMemo) {
    
    this.orderMemo = orderMemo;
    return this;
  }

   /**
   * 工单审核备注
   * @return orderMemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "审核通过", value = "工单审核备注")

  public String getOrderMemo() {
    return orderMemo;
  }


  public void setOrderMemo(String orderMemo) {
    this.orderMemo = orderMemo;
  }


  public ZhimaMerchantSubsidiariesCloseResponseModel orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 工单标识，业务成功时返回工单号
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100010", value = "工单标识，业务成功时返回工单号")

  public String getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public ZhimaMerchantSubsidiariesCloseResponseModel orderStatus(String orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * 工单状态
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AGREE", value = "工单状态")

  public String getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
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
   * @return the ZhimaMerchantSubsidiariesCloseResponseModel instance itself
   */
  public ZhimaMerchantSubsidiariesCloseResponseModel putAdditionalProperty(String key, Object value) {
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
    ZhimaMerchantSubsidiariesCloseResponseModel zhimaMerchantSubsidiariesCloseResponseModel = (ZhimaMerchantSubsidiariesCloseResponseModel) o;
    return Objects.equals(this.bizErrorCode, zhimaMerchantSubsidiariesCloseResponseModel.bizErrorCode) &&
        Objects.equals(this.bizErrorMessage, zhimaMerchantSubsidiariesCloseResponseModel.bizErrorMessage) &&
        Objects.equals(this.orderMemo, zhimaMerchantSubsidiariesCloseResponseModel.orderMemo) &&
        Objects.equals(this.orderNo, zhimaMerchantSubsidiariesCloseResponseModel.orderNo) &&
        Objects.equals(this.orderStatus, zhimaMerchantSubsidiariesCloseResponseModel.orderStatus)&&
        Objects.equals(this.additionalProperties, zhimaMerchantSubsidiariesCloseResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizErrorCode, bizErrorMessage, orderMemo, orderNo, orderStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaMerchantSubsidiariesCloseResponseModel {\n");
    sb.append("    bizErrorCode: ").append(toIndentedString(bizErrorCode)).append("\n");
    sb.append("    bizErrorMessage: ").append(toIndentedString(bizErrorMessage)).append("\n");
    sb.append("    orderMemo: ").append(toIndentedString(orderMemo)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
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
    openapiFields.add("biz_error_code");
    openapiFields.add("biz_error_message");
    openapiFields.add("order_memo");
    openapiFields.add("order_no");
    openapiFields.add("order_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaMerchantSubsidiariesCloseResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaMerchantSubsidiariesCloseResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaMerchantSubsidiariesCloseResponseModel is not found in the empty JSON string", ZhimaMerchantSubsidiariesCloseResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_error_code") != null && !jsonObj.get("biz_error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_error_code").toString()));
      }
      if (jsonObj.get("biz_error_message") != null && !jsonObj.get("biz_error_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_error_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_error_message").toString()));
      }
      if (jsonObj.get("order_memo") != null && !jsonObj.get("order_memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_memo").toString()));
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
      }
      if (jsonObj.get("order_status") != null && !jsonObj.get("order_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaMerchantSubsidiariesCloseResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaMerchantSubsidiariesCloseResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaMerchantSubsidiariesCloseResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaMerchantSubsidiariesCloseResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaMerchantSubsidiariesCloseResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaMerchantSubsidiariesCloseResponseModel value) throws IOException {
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
           public ZhimaMerchantSubsidiariesCloseResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZhimaMerchantSubsidiariesCloseResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZhimaMerchantSubsidiariesCloseResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaMerchantSubsidiariesCloseResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaMerchantSubsidiariesCloseResponseModel
  */
  public static ZhimaMerchantSubsidiariesCloseResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaMerchantSubsidiariesCloseResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaMerchantSubsidiariesCloseResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

