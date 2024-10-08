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
import com.alipay.v3.model.BuyerPayDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AlipayTradeOrderPayModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeOrderPayModel {
  public static final String SERIALIZED_NAME_ADVANCE_PAYMENT_TYPE = "advance_payment_type";
  @SerializedName(SERIALIZED_NAME_ADVANCE_PAYMENT_TYPE)
  private String advancePaymentType;

  public static final String SERIALIZED_NAME_BUYER_ID = "buyer_id";
  @SerializedName(SERIALIZED_NAME_BUYER_ID)
  private String buyerId;

  public static final String SERIALIZED_NAME_BUYER_OPEN_ID = "buyer_open_id";
  @SerializedName(SERIALIZED_NAME_BUYER_OPEN_ID)
  private String buyerOpenId;

  public static final String SERIALIZED_NAME_BUYER_PAY_DETAIL = "buyer_pay_detail";
  @SerializedName(SERIALIZED_NAME_BUYER_PAY_DETAIL)
  private List<BuyerPayDetail> buyerPayDetail = null;

  public static final String SERIALIZED_NAME_FULFILLMENT_AMOUNT = "fulfillment_amount";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_AMOUNT)
  private String fulfillmentAmount;

  public static final String SERIALIZED_NAME_IS_ASYNC_PAY = "is_async_pay";
  @SerializedName(SERIALIZED_NAME_IS_ASYNC_PAY)
  private Boolean isAsyncPay;

  public static final String SERIALIZED_NAME_ORDER_PAY_MODE = "order_pay_mode";
  @SerializedName(SERIALIZED_NAME_ORDER_PAY_MODE)
  private String orderPayMode;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeOrderPayModel() { 
  }

  public AlipayTradeOrderPayModel advancePaymentType(String advancePaymentType) {
    
    this.advancePaymentType = advancePaymentType;
    return this;
  }

   /**
   * 垫资支付模式。支付时需要垫资的场景才传入。具体传参需与支付宝约定。 CREDIT_FULFILLMENT_ZM 表示先用后付产品履约动作支持芝麻垫资。
   * @return advancePaymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREDIT_FULFILLMENT_ZM", value = "垫资支付模式。支付时需要垫资的场景才传入。具体传参需与支付宝约定。 CREDIT_FULFILLMENT_ZM 表示先用后付产品履约动作支持芝麻垫资。")

  public String getAdvancePaymentType() {
    return advancePaymentType;
  }


  public void setAdvancePaymentType(String advancePaymentType) {
    this.advancePaymentType = advancePaymentType;
  }


  public AlipayTradeOrderPayModel buyerId(String buyerId) {
    
    this.buyerId = buyerId;
    return this;
  }

   /**
   * 买家的支付宝用户id    注：  1.用于校验与已存交易中的买家是否相等
   * @return buyerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088202954065786", value = "买家的支付宝用户id    注：  1.用于校验与已存交易中的买家是否相等")

  public String getBuyerId() {
    return buyerId;
  }


  public void setBuyerId(String buyerId) {
    this.buyerId = buyerId;
  }


  public AlipayTradeOrderPayModel buyerOpenId(String buyerOpenId) {
    
    this.buyerOpenId = buyerOpenId;
    return this;
  }

   /**
   * 买家支付宝用户唯一标识  注： 1.用于校验与已存交易中的买家是否相等
   * @return buyerOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "买家支付宝用户唯一标识  注： 1.用于校验与已存交易中的买家是否相等")

  public String getBuyerOpenId() {
    return buyerOpenId;
  }


  public void setBuyerOpenId(String buyerOpenId) {
    this.buyerOpenId = buyerOpenId;
  }


  public AlipayTradeOrderPayModel buyerPayDetail(List<BuyerPayDetail> buyerPayDetail) {
    
    this.buyerPayDetail = buyerPayDetail;
    return this;
  }

  public AlipayTradeOrderPayModel addBuyerPayDetailItem(BuyerPayDetail buyerPayDetailItem) {
    if (this.buyerPayDetail == null) {
      this.buyerPayDetail = new ArrayList<>();
    }
    this.buyerPayDetail.add(buyerPayDetailItem);
    return this;
  }

   /**
   * 买家支付明细    目前支持的支付渠道为：  - offline_pos：本次买家使用的是pos刷卡支付    注：  各支付工具金额总和&#x3D;订单总金额
   * @return buyerPayDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "买家支付明细    目前支持的支付渠道为：  - offline_pos：本次买家使用的是pos刷卡支付    注：  各支付工具金额总和=订单总金额")

  public List<BuyerPayDetail> getBuyerPayDetail() {
    return buyerPayDetail;
  }


  public void setBuyerPayDetail(List<BuyerPayDetail> buyerPayDetail) {
    this.buyerPayDetail = buyerPayDetail;
  }


  public AlipayTradeOrderPayModel fulfillmentAmount(String fulfillmentAmount) {
    
    this.fulfillmentAmount = fulfillmentAmount;
    return this;
  }

   /**
   * 本次履约支付金额，单位为元，精确到小数点后两位。履约支付场景才需要传入。
   * @return fulfillmentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "88.88", value = "本次履约支付金额，单位为元，精确到小数点后两位。履约支付场景才需要传入。")

  public String getFulfillmentAmount() {
    return fulfillmentAmount;
  }


  public void setFulfillmentAmount(String fulfillmentAmount) {
    this.fulfillmentAmount = fulfillmentAmount;
  }


  public AlipayTradeOrderPayModel isAsyncPay(Boolean isAsyncPay) {
    
    this.isAsyncPay = isAsyncPay;
    return this;
  }

   /**
   * 是否异步支付，传入true时，表明本次期望走异步支付，会先将支付请求受理下来，再异步推进。商户可以通过交易的异步通知或者轮询交易的状态来确定最终的交易结果
   * @return isAsyncPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否异步支付，传入true时，表明本次期望走异步支付，会先将支付请求受理下来，再异步推进。商户可以通过交易的异步通知或者轮询交易的状态来确定最终的交易结果")

  public Boolean getIsAsyncPay() {
    return isAsyncPay;
  }


  public void setIsAsyncPay(Boolean isAsyncPay) {
    this.isAsyncPay = isAsyncPay;
  }


  public AlipayTradeOrderPayModel orderPayMode(String orderPayMode) {
    
    this.orderPayMode = orderPayMode;
    return this;
  }

   /**
   * 订单支付模式。特殊支付场景才需要传入。具体传参需与支付宝约定。 CREDIT_FULFILLMENT_ZM表示基于芝麻授信的履约支付模式，比如芝麻先用后付产品。
   * @return orderPayMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREDIT_FULFILLMENT_ZM", value = "订单支付模式。特殊支付场景才需要传入。具体传参需与支付宝约定。 CREDIT_FULFILLMENT_ZM表示基于芝麻授信的履约支付模式，比如芝麻先用后付产品。")

  public String getOrderPayMode() {
    return orderPayMode;
  }


  public void setOrderPayMode(String orderPayMode) {
    this.orderPayMode = orderPayMode;
  }


  public AlipayTradeOrderPayModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户请求号，标识一次请求的唯一id，用于幂等控制。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20200320010101001", value = "商户请求号，标识一次请求的唯一id，用于幂等控制。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeOrderPayModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 销售产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SETTLE_OFFLINE_GROUP", value = "销售产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public AlipayTradeOrderPayModel totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]    注：  1.用于校验与已存交易中的金额是否相等
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "88.88", value = "订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]    注：  1.用于校验与已存交易中的金额是否相等")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public AlipayTradeOrderPayModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018062721001004150200645134", value = "支付宝交易号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
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
   * @return the AlipayTradeOrderPayModel instance itself
   */
  public AlipayTradeOrderPayModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeOrderPayModel alipayTradeOrderPayModel = (AlipayTradeOrderPayModel) o;
    return Objects.equals(this.advancePaymentType, alipayTradeOrderPayModel.advancePaymentType) &&
        Objects.equals(this.buyerId, alipayTradeOrderPayModel.buyerId) &&
        Objects.equals(this.buyerOpenId, alipayTradeOrderPayModel.buyerOpenId) &&
        Objects.equals(this.buyerPayDetail, alipayTradeOrderPayModel.buyerPayDetail) &&
        Objects.equals(this.fulfillmentAmount, alipayTradeOrderPayModel.fulfillmentAmount) &&
        Objects.equals(this.isAsyncPay, alipayTradeOrderPayModel.isAsyncPay) &&
        Objects.equals(this.orderPayMode, alipayTradeOrderPayModel.orderPayMode) &&
        Objects.equals(this.outRequestNo, alipayTradeOrderPayModel.outRequestNo) &&
        Objects.equals(this.productCode, alipayTradeOrderPayModel.productCode) &&
        Objects.equals(this.totalAmount, alipayTradeOrderPayModel.totalAmount) &&
        Objects.equals(this.tradeNo, alipayTradeOrderPayModel.tradeNo)&&
        Objects.equals(this.additionalProperties, alipayTradeOrderPayModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancePaymentType, buyerId, buyerOpenId, buyerPayDetail, fulfillmentAmount, isAsyncPay, orderPayMode, outRequestNo, productCode, totalAmount, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeOrderPayModel {\n");
    sb.append("    advancePaymentType: ").append(toIndentedString(advancePaymentType)).append("\n");
    sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
    sb.append("    buyerOpenId: ").append(toIndentedString(buyerOpenId)).append("\n");
    sb.append("    buyerPayDetail: ").append(toIndentedString(buyerPayDetail)).append("\n");
    sb.append("    fulfillmentAmount: ").append(toIndentedString(fulfillmentAmount)).append("\n");
    sb.append("    isAsyncPay: ").append(toIndentedString(isAsyncPay)).append("\n");
    sb.append("    orderPayMode: ").append(toIndentedString(orderPayMode)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("advance_payment_type");
    openapiFields.add("buyer_id");
    openapiFields.add("buyer_open_id");
    openapiFields.add("buyer_pay_detail");
    openapiFields.add("fulfillment_amount");
    openapiFields.add("is_async_pay");
    openapiFields.add("order_pay_mode");
    openapiFields.add("out_request_no");
    openapiFields.add("product_code");
    openapiFields.add("total_amount");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeOrderPayModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeOrderPayModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeOrderPayModel is not found in the empty JSON string", AlipayTradeOrderPayModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("advance_payment_type") != null && !jsonObj.get("advance_payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advance_payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advance_payment_type").toString()));
      }
      if (jsonObj.get("buyer_id") != null && !jsonObj.get("buyer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_id").toString()));
      }
      if (jsonObj.get("buyer_open_id") != null && !jsonObj.get("buyer_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_open_id").toString()));
      }
      JsonArray jsonArraybuyerPayDetail = jsonObj.getAsJsonArray("buyer_pay_detail");
      if (jsonArraybuyerPayDetail != null) {
        // ensure the json data is an array
        if (!jsonObj.get("buyer_pay_detail").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `buyer_pay_detail` to be an array in the JSON string but got `%s`", jsonObj.get("buyer_pay_detail").toString()));
        }

        // validate the optional field `buyer_pay_detail` (array)
        for (int i = 0; i < jsonArraybuyerPayDetail.size(); i++) {
          BuyerPayDetail.validateJsonObject(jsonArraybuyerPayDetail.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("fulfillment_amount") != null && !jsonObj.get("fulfillment_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillment_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillment_amount").toString()));
      }
      if (jsonObj.get("order_pay_mode") != null && !jsonObj.get("order_pay_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_pay_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_pay_mode").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeOrderPayModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeOrderPayModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeOrderPayModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeOrderPayModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeOrderPayModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeOrderPayModel value) throws IOException {
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
           public AlipayTradeOrderPayModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeOrderPayModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeOrderPayModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeOrderPayModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeOrderPayModel
  */
  public static AlipayTradeOrderPayModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeOrderPayModel.class);
  }

 /**
  * Convert an instance of AlipayTradeOrderPayModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

