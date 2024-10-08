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
 * AlipayFundTransUniTransferResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundTransUniTransferResponseModel {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PAY_FUND_ORDER_ID = "pay_fund_order_id";
  @SerializedName(SERIALIZED_NAME_PAY_FUND_ORDER_ID)
  private String payFundOrderId;

  public static final String SERIALIZED_NAME_SETTLE_SERIAL_NO = "settle_serial_no";
  @SerializedName(SERIALIZED_NAME_SETTLE_SERIAL_NO)
  private String settleSerialNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRANS_DATE = "trans_date";
  @SerializedName(SERIALIZED_NAME_TRANS_DATE)
  private String transDate;

  public AlipayFundTransUniTransferResponseModel() { 
  }

  public AlipayFundTransUniTransferResponseModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 转账金额，单位为元，默认为空，特殊场景提供。
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12.01", value = "转账金额，单位为元，默认为空，特殊场景提供。")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayFundTransUniTransferResponseModel orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 支付宝转账订单号
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190801110070000006380000250621", value = "支付宝转账订单号")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public AlipayFundTransUniTransferResponseModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 商户订单号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201808080001", value = "商户订单号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayFundTransUniTransferResponseModel payFundOrderId(String payFundOrderId) {
    
    this.payFundOrderId = payFundOrderId;
    return this;
  }

   /**
   * 支付宝支付资金流水号
   * @return payFundOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190801110070001506380000251556", value = "支付宝支付资金流水号")

  public String getPayFundOrderId() {
    return payFundOrderId;
  }


  public void setPayFundOrderId(String payFundOrderId) {
    this.payFundOrderId = payFundOrderId;
  }


  public AlipayFundTransUniTransferResponseModel settleSerialNo(String settleSerialNo) {
    
    this.settleSerialNo = settleSerialNo;
    return this;
  }

   /**
   * 金融机构发起签约类、支付类、差错类业务时，应为每笔业务分配唯一的交易流水号。31位交易流水号组成规则为：“8位日期”+“16位序列号”+“1位预留位”+“6位控制位”，其中： a）“8位日期”为系统当前日期，ISODate格式：“YYYYMMDD” b）“16位序列号”由金融机构生成，金融机构应确保该值在网联当日唯一 c）“1位预留位”由平台分配 d）“6位控制位”由金融机构通过平台获取 例如：2023052993044491260542090100400
   * @return settleSerialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023052993044491260542090100400", value = "金融机构发起签约类、支付类、差错类业务时，应为每笔业务分配唯一的交易流水号。31位交易流水号组成规则为：“8位日期”+“16位序列号”+“1位预留位”+“6位控制位”，其中： a）“8位日期”为系统当前日期，ISODate格式：“YYYYMMDD” b）“16位序列号”由金融机构生成，金融机构应确保该值在网联当日唯一 c）“1位预留位”由平台分配 d）“6位控制位”由金融机构通过平台获取 例如：2023052993044491260542090100400")

  public String getSettleSerialNo() {
    return settleSerialNo;
  }


  public void setSettleSerialNo(String settleSerialNo) {
    this.settleSerialNo = settleSerialNo;
  }


  public AlipayFundTransUniTransferResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 转账单据状态。 SUCCESS（该笔转账交易成功）：成功； FAIL：失败（具体失败原因请参见error_code以及fail_reason返回值）； DEALING：处理中（转账到支付宝账户不涉及）； REFUND：退票（转账到支付宝账户不涉及）；
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "转账单据状态。 SUCCESS（该笔转账交易成功）：成功； FAIL：失败（具体失败原因请参见error_code以及fail_reason返回值）； DEALING：处理中（转账到支付宝账户不涉及）； REFUND：退票（转账到支付宝账户不涉及）；")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayFundTransUniTransferResponseModel transDate(String transDate) {
    
    this.transDate = transDate;
    return this;
  }

   /**
   * 订单支付时间，格式为yyyy-MM-dd HH:mm:ss
   * @return transDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-08-21 00:00:00", value = "订单支付时间，格式为yyyy-MM-dd HH:mm:ss")

  public String getTransDate() {
    return transDate;
  }


  public void setTransDate(String transDate) {
    this.transDate = transDate;
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
   * @return the AlipayFundTransUniTransferResponseModel instance itself
   */
  public AlipayFundTransUniTransferResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayFundTransUniTransferResponseModel alipayFundTransUniTransferResponseModel = (AlipayFundTransUniTransferResponseModel) o;
    return Objects.equals(this.amount, alipayFundTransUniTransferResponseModel.amount) &&
        Objects.equals(this.orderId, alipayFundTransUniTransferResponseModel.orderId) &&
        Objects.equals(this.outBizNo, alipayFundTransUniTransferResponseModel.outBizNo) &&
        Objects.equals(this.payFundOrderId, alipayFundTransUniTransferResponseModel.payFundOrderId) &&
        Objects.equals(this.settleSerialNo, alipayFundTransUniTransferResponseModel.settleSerialNo) &&
        Objects.equals(this.status, alipayFundTransUniTransferResponseModel.status) &&
        Objects.equals(this.transDate, alipayFundTransUniTransferResponseModel.transDate)&&
        Objects.equals(this.additionalProperties, alipayFundTransUniTransferResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, orderId, outBizNo, payFundOrderId, settleSerialNo, status, transDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundTransUniTransferResponseModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    payFundOrderId: ").append(toIndentedString(payFundOrderId)).append("\n");
    sb.append("    settleSerialNo: ").append(toIndentedString(settleSerialNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transDate: ").append(toIndentedString(transDate)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("order_id");
    openapiFields.add("out_biz_no");
    openapiFields.add("pay_fund_order_id");
    openapiFields.add("settle_serial_no");
    openapiFields.add("status");
    openapiFields.add("trans_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundTransUniTransferResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundTransUniTransferResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundTransUniTransferResponseModel is not found in the empty JSON string", AlipayFundTransUniTransferResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("pay_fund_order_id") != null && !jsonObj.get("pay_fund_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_fund_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_fund_order_id").toString()));
      }
      if (jsonObj.get("settle_serial_no") != null && !jsonObj.get("settle_serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_serial_no").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("trans_date") != null && !jsonObj.get("trans_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundTransUniTransferResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundTransUniTransferResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundTransUniTransferResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundTransUniTransferResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundTransUniTransferResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundTransUniTransferResponseModel value) throws IOException {
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
           public AlipayFundTransUniTransferResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayFundTransUniTransferResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayFundTransUniTransferResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundTransUniTransferResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundTransUniTransferResponseModel
  */
  public static AlipayFundTransUniTransferResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundTransUniTransferResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundTransUniTransferResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

