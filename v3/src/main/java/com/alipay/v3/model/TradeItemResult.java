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
 * TradeItemResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TradeItemResult {
  public static final String SERIALIZED_NAME_ALIPAY_ORDER_NO = "alipay_order_no";
  @SerializedName(SERIALIZED_NAME_ALIPAY_ORDER_NO)
  private String alipayOrderNo;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_PAY = "gmt_pay";
  @SerializedName(SERIALIZED_NAME_GMT_PAY)
  private String gmtPay;

  public static final String SERIALIZED_NAME_GMT_REFUND = "gmt_refund";
  @SerializedName(SERIALIZED_NAME_GMT_REFUND)
  private String gmtRefund;

  public static final String SERIALIZED_NAME_GOODS_MEMO = "goods_memo";
  @SerializedName(SERIALIZED_NAME_GOODS_MEMO)
  private String goodsMemo;

  public static final String SERIALIZED_NAME_GOODS_TITLE = "goods_title";
  @SerializedName(SERIALIZED_NAME_GOODS_TITLE)
  private String goodsTitle;

  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "merchant_order_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_NET_MDISCOUNT = "net_mdiscount";
  @SerializedName(SERIALIZED_NAME_NET_MDISCOUNT)
  private String netMdiscount;

  public static final String SERIALIZED_NAME_OTHER_ACCOUNT = "other_account";
  @SerializedName(SERIALIZED_NAME_OTHER_ACCOUNT)
  private String otherAccount;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_SERVICE_FEE = "service_fee";
  @SerializedName(SERIALIZED_NAME_SERVICE_FEE)
  private String serviceFee;

  public static final String SERIALIZED_NAME_STORE_NAME = "store_name";
  @SerializedName(SERIALIZED_NAME_STORE_NAME)
  private String storeName;

  public static final String SERIALIZED_NAME_STORE_NO = "store_no";
  @SerializedName(SERIALIZED_NAME_STORE_NO)
  private String storeNo;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_TRADE_STATUS = "trade_status";
  @SerializedName(SERIALIZED_NAME_TRADE_STATUS)
  private String tradeStatus;

  public static final String SERIALIZED_NAME_TRADE_TYPE = "trade_type";
  @SerializedName(SERIALIZED_NAME_TRADE_TYPE)
  private String tradeType;

  public TradeItemResult() { 
  }

  public TradeItemResult alipayOrderNo(String alipayOrderNo) {
    
    this.alipayOrderNo = alipayOrderNo;
    return this;
  }

   /**
   * 支付宝订单号。对账使用，不脱敏
   * @return alipayOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝订单号。对账使用，不脱敏")

  public String getAlipayOrderNo() {
    return alipayOrderNo;
  }


  public void setAlipayOrderNo(String alipayOrderNo) {
    this.alipayOrderNo = alipayOrderNo;
  }


  public TradeItemResult gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 交易创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public TradeItemResult gmtPay(String gmtPay) {
    
    this.gmtPay = gmtPay;
    return this;
  }

   /**
   * 交易支付时间
   * @return gmtPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易支付时间")

  public String getGmtPay() {
    return gmtPay;
  }


  public void setGmtPay(String gmtPay) {
    this.gmtPay = gmtPay;
  }


  public TradeItemResult gmtRefund(String gmtRefund) {
    
    this.gmtRefund = gmtRefund;
    return this;
  }

   /**
   * 交易退款时间
   * @return gmtRefund
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易退款时间")

  public String getGmtRefund() {
    return gmtRefund;
  }


  public void setGmtRefund(String gmtRefund) {
    this.gmtRefund = gmtRefund;
  }


  public TradeItemResult goodsMemo(String goodsMemo) {
    
    this.goodsMemo = goodsMemo;
    return this;
  }

   /**
   * 商品备注信息
   * @return goodsMemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品备注信息")

  public String getGoodsMemo() {
    return goodsMemo;
  }


  public void setGoodsMemo(String goodsMemo) {
    this.goodsMemo = goodsMemo;
  }


  public TradeItemResult goodsTitle(String goodsTitle) {
    
    this.goodsTitle = goodsTitle;
    return this;
  }

   /**
   * 商品名称
   * @return goodsTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品名称")

  public String getGoodsTitle() {
    return goodsTitle;
  }


  public void setGoodsTitle(String goodsTitle) {
    this.goodsTitle = goodsTitle;
  }


  public TradeItemResult merchantOrderNo(String merchantOrderNo) {
    
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * 商户订单号，创建支付宝交易时传入的信息。对账使用，不脱敏
   * @return merchantOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户订单号，创建支付宝交易时传入的信息。对账使用，不脱敏")

  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }


  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }


  public TradeItemResult netMdiscount(String netMdiscount) {
    
    this.netMdiscount = netMdiscount;
    return this;
  }

   /**
   * 商家优惠金额
   * @return netMdiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家优惠金额")

  public String getNetMdiscount() {
    return netMdiscount;
  }


  public void setNetMdiscount(String netMdiscount) {
    this.netMdiscount = netMdiscount;
  }


  public TradeItemResult otherAccount(String otherAccount) {
    
    this.otherAccount = otherAccount;
    return this;
  }

   /**
   * 对方账户
   * @return otherAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "对方账户")

  public String getOtherAccount() {
    return otherAccount;
  }


  public void setOtherAccount(String otherAccount) {
    this.otherAccount = otherAccount;
  }


  public TradeItemResult refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 订单退款金额
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "订单退款金额")

  public String getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public TradeItemResult serviceFee(String serviceFee) {
    
    this.serviceFee = serviceFee;
    return this;
  }

   /**
   * 服务费金额
   * @return serviceFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务费金额")

  public String getServiceFee() {
    return serviceFee;
  }


  public void setServiceFee(String serviceFee) {
    this.serviceFee = serviceFee;
  }


  public TradeItemResult storeName(String storeName) {
    
    this.storeName = storeName;
    return this;
  }

   /**
   * 门店名称
   * @return storeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门店名称")

  public String getStoreName() {
    return storeName;
  }


  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  public TradeItemResult storeNo(String storeNo) {
    
    this.storeNo = storeNo;
    return this;
  }

   /**
   * 门店编号
   * @return storeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门店编号")

  public String getStoreNo() {
    return storeNo;
  }


  public void setStoreNo(String storeNo) {
    this.storeNo = storeNo;
  }


  public TradeItemResult totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 订单金额
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "订单金额")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public TradeItemResult tradeStatus(String tradeStatus) {
    
    this.tradeStatus = tradeStatus;
    return this;
  }

   /**
   * 订单状态(待付款,成功,关闭,待发货,待确认收货,已预付,进行中)
   * @return tradeStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "订单状态(待付款,成功,关闭,待发货,待确认收货,已预付,进行中)")

  public String getTradeStatus() {
    return tradeStatus;
  }


  public void setTradeStatus(String tradeStatus) {
    this.tradeStatus = tradeStatus;
  }


  public TradeItemResult tradeType(String tradeType) {
    
    this.tradeType = tradeType;
    return this;
  }

   /**
   * 业务类型，帮助商户作为对账参考
   * @return tradeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "业务类型，帮助商户作为对账参考")

  public String getTradeType() {
    return tradeType;
  }


  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
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
   * @return the TradeItemResult instance itself
   */
  public TradeItemResult putAdditionalProperty(String key, Object value) {
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
    TradeItemResult tradeItemResult = (TradeItemResult) o;
    return Objects.equals(this.alipayOrderNo, tradeItemResult.alipayOrderNo) &&
        Objects.equals(this.gmtCreate, tradeItemResult.gmtCreate) &&
        Objects.equals(this.gmtPay, tradeItemResult.gmtPay) &&
        Objects.equals(this.gmtRefund, tradeItemResult.gmtRefund) &&
        Objects.equals(this.goodsMemo, tradeItemResult.goodsMemo) &&
        Objects.equals(this.goodsTitle, tradeItemResult.goodsTitle) &&
        Objects.equals(this.merchantOrderNo, tradeItemResult.merchantOrderNo) &&
        Objects.equals(this.netMdiscount, tradeItemResult.netMdiscount) &&
        Objects.equals(this.otherAccount, tradeItemResult.otherAccount) &&
        Objects.equals(this.refundAmount, tradeItemResult.refundAmount) &&
        Objects.equals(this.serviceFee, tradeItemResult.serviceFee) &&
        Objects.equals(this.storeName, tradeItemResult.storeName) &&
        Objects.equals(this.storeNo, tradeItemResult.storeNo) &&
        Objects.equals(this.totalAmount, tradeItemResult.totalAmount) &&
        Objects.equals(this.tradeStatus, tradeItemResult.tradeStatus) &&
        Objects.equals(this.tradeType, tradeItemResult.tradeType)&&
        Objects.equals(this.additionalProperties, tradeItemResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayOrderNo, gmtCreate, gmtPay, gmtRefund, goodsMemo, goodsTitle, merchantOrderNo, netMdiscount, otherAccount, refundAmount, serviceFee, storeName, storeNo, totalAmount, tradeStatus, tradeType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeItemResult {\n");
    sb.append("    alipayOrderNo: ").append(toIndentedString(alipayOrderNo)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtPay: ").append(toIndentedString(gmtPay)).append("\n");
    sb.append("    gmtRefund: ").append(toIndentedString(gmtRefund)).append("\n");
    sb.append("    goodsMemo: ").append(toIndentedString(goodsMemo)).append("\n");
    sb.append("    goodsTitle: ").append(toIndentedString(goodsTitle)).append("\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    netMdiscount: ").append(toIndentedString(netMdiscount)).append("\n");
    sb.append("    otherAccount: ").append(toIndentedString(otherAccount)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    serviceFee: ").append(toIndentedString(serviceFee)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    storeNo: ").append(toIndentedString(storeNo)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    tradeStatus: ").append(toIndentedString(tradeStatus)).append("\n");
    sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
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
    openapiFields.add("alipay_order_no");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_pay");
    openapiFields.add("gmt_refund");
    openapiFields.add("goods_memo");
    openapiFields.add("goods_title");
    openapiFields.add("merchant_order_no");
    openapiFields.add("net_mdiscount");
    openapiFields.add("other_account");
    openapiFields.add("refund_amount");
    openapiFields.add("service_fee");
    openapiFields.add("store_name");
    openapiFields.add("store_no");
    openapiFields.add("total_amount");
    openapiFields.add("trade_status");
    openapiFields.add("trade_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TradeItemResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TradeItemResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TradeItemResult is not found in the empty JSON string", TradeItemResult.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("alipay_order_no") != null && !jsonObj.get("alipay_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_order_no").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_pay") != null && !jsonObj.get("gmt_pay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_pay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_pay").toString()));
      }
      if (jsonObj.get("gmt_refund") != null && !jsonObj.get("gmt_refund").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_refund` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_refund").toString()));
      }
      if (jsonObj.get("goods_memo") != null && !jsonObj.get("goods_memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_memo").toString()));
      }
      if (jsonObj.get("goods_title") != null && !jsonObj.get("goods_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_title").toString()));
      }
      if (jsonObj.get("merchant_order_no") != null && !jsonObj.get("merchant_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_order_no").toString()));
      }
      if (jsonObj.get("net_mdiscount") != null && !jsonObj.get("net_mdiscount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `net_mdiscount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("net_mdiscount").toString()));
      }
      if (jsonObj.get("other_account") != null && !jsonObj.get("other_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_account").toString()));
      }
      if (jsonObj.get("refund_amount") != null && !jsonObj.get("refund_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_amount").toString()));
      }
      if (jsonObj.get("service_fee") != null && !jsonObj.get("service_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_fee").toString()));
      }
      if (jsonObj.get("store_name") != null && !jsonObj.get("store_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_name").toString()));
      }
      if (jsonObj.get("store_no") != null && !jsonObj.get("store_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_no").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
      if (jsonObj.get("trade_status") != null && !jsonObj.get("trade_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_status").toString()));
      }
      if (jsonObj.get("trade_type") != null && !jsonObj.get("trade_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TradeItemResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TradeItemResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TradeItemResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TradeItemResult.class));

       return (TypeAdapter<T>) new TypeAdapter<TradeItemResult>() {
           @Override
           public void write(JsonWriter out, TradeItemResult value) throws IOException {
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
           public TradeItemResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TradeItemResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TradeItemResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TradeItemResult
  * @throws IOException if the JSON string is invalid with respect to TradeItemResult
  */
  public static TradeItemResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TradeItemResult.class);
  }

 /**
  * Convert an instance of TradeItemResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

