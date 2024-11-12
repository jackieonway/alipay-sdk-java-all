/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-11-12
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
 * UserVoucherBaseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserVoucherBaseInfo {
  public static final String SERIALIZED_NAME_ASSOCIATE_TRADE_NO = "associate_trade_no";
  @SerializedName(SERIALIZED_NAME_ASSOCIATE_TRADE_NO)
  private String associateTradeNo;

  public static final String SERIALIZED_NAME_BELONG_MERCHANT_ID = "belong_merchant_id";
  @SerializedName(SERIALIZED_NAME_BELONG_MERCHANT_ID)
  private String belongMerchantId;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_VALID_BEGIN_TIME = "valid_begin_time";
  @SerializedName(SERIALIZED_NAME_VALID_BEGIN_TIME)
  private String validBeginTime;

  public static final String SERIALIZED_NAME_VALID_END_TIME = "valid_end_time";
  @SerializedName(SERIALIZED_NAME_VALID_END_TIME)
  private String validEndTime;

  public static final String SERIALIZED_NAME_VOUCHER_CODE = "voucher_code";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CODE)
  private String voucherCode;

  public static final String SERIALIZED_NAME_VOUCHER_ID = "voucher_id";
  @SerializedName(SERIALIZED_NAME_VOUCHER_ID)
  private String voucherId;

  public static final String SERIALIZED_NAME_VOUCHER_MAX_USE_TIMES = "voucher_max_use_times";
  @SerializedName(SERIALIZED_NAME_VOUCHER_MAX_USE_TIMES)
  private Integer voucherMaxUseTimes;

  public static final String SERIALIZED_NAME_VOUCHER_NAME = "voucher_name";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NAME)
  private String voucherName;

  public static final String SERIALIZED_NAME_VOUCHER_STATUS = "voucher_status";
  @SerializedName(SERIALIZED_NAME_VOUCHER_STATUS)
  private String voucherStatus;

  public static final String SERIALIZED_NAME_VOUCHER_USED_TIMES = "voucher_used_times";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USED_TIMES)
  private Integer voucherUsedTimes;

  public UserVoucherBaseInfo() { 
  }

  public UserVoucherBaseInfo associateTradeNo(String associateTradeNo) {
    
    this.associateTradeNo = associateTradeNo;
    return this;
  }

   /**
   * 若商家券操作过关联商户订单信息，则该字段返回商家券已关联的商户订单号。
   * @return associateTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "若商家券操作过关联商户订单信息，则该字段返回商家券已关联的商户订单号。")

  public String getAssociateTradeNo() {
    return associateTradeNo;
  }


  public void setAssociateTradeNo(String associateTradeNo) {
    this.associateTradeNo = associateTradeNo;
  }


  public UserVoucherBaseInfo belongMerchantId(String belongMerchantId) {
    
    this.belongMerchantId = belongMerchantId;
    return this;
  }

   /**
   * 券归属商户
   * @return belongMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券归属商户")

  public String getBelongMerchantId() {
    return belongMerchantId;
  }


  public void setBelongMerchantId(String belongMerchantId) {
    this.belongMerchantId = belongMerchantId;
  }


  public UserVoucherBaseInfo createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 领券时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "领券时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public UserVoucherBaseInfo validBeginTime(String validBeginTime) {
    
    this.validBeginTime = validBeginTime;
    return this;
  }

   /**
   * 券可使用的开始时间。 格式为：yyyy-MM-dd HH:mm:ss
   * @return validBeginTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可使用的开始时间。 格式为：yyyy-MM-dd HH:mm:ss")

  public String getValidBeginTime() {
    return validBeginTime;
  }


  public void setValidBeginTime(String validBeginTime) {
    this.validBeginTime = validBeginTime;
  }


  public UserVoucherBaseInfo validEndTime(String validEndTime) {
    
    this.validEndTime = validEndTime;
    return this;
  }

   /**
   * 券可使用的结束时间。 格式为yyyy-MM-dd HH:mm:ss
   * @return validEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可使用的结束时间。 格式为yyyy-MM-dd HH:mm:ss")

  public String getValidEndTime() {
    return validEndTime;
  }


  public void setValidEndTime(String validEndTime) {
    this.validEndTime = validEndTime;
  }


  public UserVoucherBaseInfo voucherCode(String voucherCode) {
    
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * 用户领取的券码code,支付宝商家券活动才会返回券码，其他优惠券活动该值为空
   * @return voucherCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户领取的券码code,支付宝商家券活动才会返回券码，其他优惠券活动该值为空")

  public String getVoucherCode() {
    return voucherCode;
  }


  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }


  public UserVoucherBaseInfo voucherId(String voucherId) {
    
    this.voucherId = voucherId;
    return this;
  }

   /**
   * 用户券 id。支付宝为用户优惠券唯一分配的 id。
   * @return voucherId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户券 id。支付宝为用户优惠券唯一分配的 id。")

  public String getVoucherId() {
    return voucherId;
  }


  public void setVoucherId(String voucherId) {
    this.voucherId = voucherId;
  }


  public UserVoucherBaseInfo voucherMaxUseTimes(Integer voucherMaxUseTimes) {
    
    this.voucherMaxUseTimes = voucherMaxUseTimes;
    return this;
  }

   /**
   * 券最大核销次数
   * @return voucherMaxUseTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券最大核销次数")

  public Integer getVoucherMaxUseTimes() {
    return voucherMaxUseTimes;
  }


  public void setVoucherMaxUseTimes(Integer voucherMaxUseTimes) {
    this.voucherMaxUseTimes = voucherMaxUseTimes;
  }


  public UserVoucherBaseInfo voucherName(String voucherName) {
    
    this.voucherName = voucherName;
    return this;
  }

   /**
   * 对消费者展示的券(商品)名称。
   * @return voucherName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "对消费者展示的券(商品)名称。")

  public String getVoucherName() {
    return voucherName;
  }


  public void setVoucherName(String voucherName) {
    this.voucherName = voucherName;
  }


  public UserVoucherBaseInfo voucherStatus(String voucherStatus) {
    
    this.voucherStatus = voucherStatus;
    return this;
  }

   /**
   * 券状态。SENDED:可用 USED:已核销(即完全使用), EXPIRED:已过期(只能查询6个月内数据)
   * @return voucherStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券状态。SENDED:可用 USED:已核销(即完全使用), EXPIRED:已过期(只能查询6个月内数据)")

  public String getVoucherStatus() {
    return voucherStatus;
  }


  public void setVoucherStatus(String voucherStatus) {
    this.voucherStatus = voucherStatus;
  }


  public UserVoucherBaseInfo voucherUsedTimes(Integer voucherUsedTimes) {
    
    this.voucherUsedTimes = voucherUsedTimes;
    return this;
  }

   /**
   * 券已核销次数
   * @return voucherUsedTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券已核销次数")

  public Integer getVoucherUsedTimes() {
    return voucherUsedTimes;
  }


  public void setVoucherUsedTimes(Integer voucherUsedTimes) {
    this.voucherUsedTimes = voucherUsedTimes;
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
   * @return the UserVoucherBaseInfo instance itself
   */
  public UserVoucherBaseInfo putAdditionalProperty(String key, Object value) {
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
    UserVoucherBaseInfo userVoucherBaseInfo = (UserVoucherBaseInfo) o;
    return Objects.equals(this.associateTradeNo, userVoucherBaseInfo.associateTradeNo) &&
        Objects.equals(this.belongMerchantId, userVoucherBaseInfo.belongMerchantId) &&
        Objects.equals(this.createTime, userVoucherBaseInfo.createTime) &&
        Objects.equals(this.validBeginTime, userVoucherBaseInfo.validBeginTime) &&
        Objects.equals(this.validEndTime, userVoucherBaseInfo.validEndTime) &&
        Objects.equals(this.voucherCode, userVoucherBaseInfo.voucherCode) &&
        Objects.equals(this.voucherId, userVoucherBaseInfo.voucherId) &&
        Objects.equals(this.voucherMaxUseTimes, userVoucherBaseInfo.voucherMaxUseTimes) &&
        Objects.equals(this.voucherName, userVoucherBaseInfo.voucherName) &&
        Objects.equals(this.voucherStatus, userVoucherBaseInfo.voucherStatus) &&
        Objects.equals(this.voucherUsedTimes, userVoucherBaseInfo.voucherUsedTimes)&&
        Objects.equals(this.additionalProperties, userVoucherBaseInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateTradeNo, belongMerchantId, createTime, validBeginTime, validEndTime, voucherCode, voucherId, voucherMaxUseTimes, voucherName, voucherStatus, voucherUsedTimes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVoucherBaseInfo {\n");
    sb.append("    associateTradeNo: ").append(toIndentedString(associateTradeNo)).append("\n");
    sb.append("    belongMerchantId: ").append(toIndentedString(belongMerchantId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    validBeginTime: ").append(toIndentedString(validBeginTime)).append("\n");
    sb.append("    validEndTime: ").append(toIndentedString(validEndTime)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    voucherMaxUseTimes: ").append(toIndentedString(voucherMaxUseTimes)).append("\n");
    sb.append("    voucherName: ").append(toIndentedString(voucherName)).append("\n");
    sb.append("    voucherStatus: ").append(toIndentedString(voucherStatus)).append("\n");
    sb.append("    voucherUsedTimes: ").append(toIndentedString(voucherUsedTimes)).append("\n");
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
    openapiFields.add("associate_trade_no");
    openapiFields.add("belong_merchant_id");
    openapiFields.add("create_time");
    openapiFields.add("valid_begin_time");
    openapiFields.add("valid_end_time");
    openapiFields.add("voucher_code");
    openapiFields.add("voucher_id");
    openapiFields.add("voucher_max_use_times");
    openapiFields.add("voucher_name");
    openapiFields.add("voucher_status");
    openapiFields.add("voucher_used_times");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserVoucherBaseInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserVoucherBaseInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserVoucherBaseInfo is not found in the empty JSON string", UserVoucherBaseInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("associate_trade_no") != null && !jsonObj.get("associate_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `associate_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("associate_trade_no").toString()));
      }
      if (jsonObj.get("belong_merchant_id") != null && !jsonObj.get("belong_merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `belong_merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("belong_merchant_id").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("valid_begin_time") != null && !jsonObj.get("valid_begin_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_begin_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_begin_time").toString()));
      }
      if (jsonObj.get("valid_end_time") != null && !jsonObj.get("valid_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_end_time").toString()));
      }
      if (jsonObj.get("voucher_code") != null && !jsonObj.get("voucher_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_code").toString()));
      }
      if (jsonObj.get("voucher_id") != null && !jsonObj.get("voucher_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_id").toString()));
      }
      if (jsonObj.get("voucher_name") != null && !jsonObj.get("voucher_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_name").toString()));
      }
      if (jsonObj.get("voucher_status") != null && !jsonObj.get("voucher_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserVoucherBaseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserVoucherBaseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserVoucherBaseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserVoucherBaseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<UserVoucherBaseInfo>() {
           @Override
           public void write(JsonWriter out, UserVoucherBaseInfo value) throws IOException {
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
           public UserVoucherBaseInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserVoucherBaseInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserVoucherBaseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserVoucherBaseInfo
  * @throws IOException if the JSON string is invalid with respect to UserVoucherBaseInfo
  */
  public static UserVoucherBaseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserVoucherBaseInfo.class);
  }

 /**
  * Convert an instance of UserVoucherBaseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

