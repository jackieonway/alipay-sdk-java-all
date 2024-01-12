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
 * ExchangeVoucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExchangeVoucher {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_MOBILE = "customer_service_mobile";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_MOBILE)
  private String customerServiceMobile;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_URL = "customer_service_url";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_URL)
  private String customerServiceUrl;

  public static final String SERIALIZED_NAME_FLOOR_AMOUNT = "floor_amount";
  @SerializedName(SERIALIZED_NAME_FLOOR_AMOUNT)
  private String floorAmount;

  public static final String SERIALIZED_NAME_OVERDUE_REFUNDABLE = "overdue_refundable";
  @SerializedName(SERIALIZED_NAME_OVERDUE_REFUNDABLE)
  private Boolean overdueRefundable;

  public static final String SERIALIZED_NAME_PAYEE_PID = "payee_pid";
  @SerializedName(SERIALIZED_NAME_PAYEE_PID)
  private String payeePid;

  public static final String SERIALIZED_NAME_REFUNDABLE = "refundable";
  @SerializedName(SERIALIZED_NAME_REFUNDABLE)
  private Boolean refundable;

  public static final String SERIALIZED_NAME_SALE_AMOUNT = "sale_amount";
  @SerializedName(SERIALIZED_NAME_SALE_AMOUNT)
  private String saleAmount;

  public static final String SERIALIZED_NAME_SETTLE_TYPE = "settle_type";
  @SerializedName(SERIALIZED_NAME_SETTLE_TYPE)
  private String settleType;

  public static final String SERIALIZED_NAME_VOUCHER_DETAIL_URL = "voucher_detail_url";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DETAIL_URL)
  private String voucherDetailUrl;

  public static final String SERIALIZED_NAME_VOUCHER_NAME = "voucher_name";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NAME)
  private String voucherName;

  public ExchangeVoucher() { 
  }

  public ExchangeVoucher amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 券的价值
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券的价值")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ExchangeVoucher bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 兑换券业务类型。  枚举值 团购券：GROUP_BUY_EXCHANGE_VOUCHER 代金券：FIX_EXCHANGE_VOUCHER 注意：兑换券通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/pre-open/repo-00tbta\&quot;&gt;大促活动权益报名&lt;/a&gt;能力推广至支付宝会场时，本参数必填。
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "兑换券业务类型。  枚举值 团购券：GROUP_BUY_EXCHANGE_VOUCHER 代金券：FIX_EXCHANGE_VOUCHER 注意：兑换券通过<a href=\"https://opendocs.alipay.com/pre-open/repo-00tbta\">大促活动权益报名</a>能力推广至支付宝会场时，本参数必填。")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public ExchangeVoucher customerServiceMobile(String customerServiceMobile) {
    
    this.customerServiceMobile = customerServiceMobile;
    return this;
  }

   /**
   * 客服电话
   * @return customerServiceMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "客服电话")

  public String getCustomerServiceMobile() {
    return customerServiceMobile;
  }


  public void setCustomerServiceMobile(String customerServiceMobile) {
    this.customerServiceMobile = customerServiceMobile;
  }


  public ExchangeVoucher customerServiceUrl(String customerServiceUrl) {
    
    this.customerServiceUrl = customerServiceUrl;
    return this;
  }

   /**
   * 客服链接
   * @return customerServiceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "客服链接")

  public String getCustomerServiceUrl() {
    return customerServiceUrl;
  }


  public void setCustomerServiceUrl(String customerServiceUrl) {
    this.customerServiceUrl = customerServiceUrl;
  }


  public ExchangeVoucher floorAmount(String floorAmount) {
    
    this.floorAmount = floorAmount;
    return this;
  }

   /**
   * 门槛金额。说明：该字段可不填，认为无门槛;
   * @return floorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门槛金额。说明：该字段可不填，认为无门槛;")

  public String getFloorAmount() {
    return floorAmount;
  }


  public void setFloorAmount(String floorAmount) {
    this.floorAmount = floorAmount;
  }


  public ExchangeVoucher overdueRefundable(Boolean overdueRefundable) {
    
    this.overdueRefundable = overdueRefundable;
    return this;
  }

   /**
   * 是否支持优惠券过期后，自动退款给用户。 不填默认否，枚举值： true：是 false：否
   * @return overdueRefundable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否支持优惠券过期后，自动退款给用户。 不填默认否，枚举值： true：是 false：否")

  public Boolean getOverdueRefundable() {
    return overdueRefundable;
  }


  public void setOverdueRefundable(Boolean overdueRefundable) {
    this.overdueRefundable = overdueRefundable;
  }


  public ExchangeVoucher payeePid(String payeePid) {
    
    this.payeePid = payeePid;
    return this;
  }

   /**
   * 收款账号。目前的结算规则是，每核销一笔优惠券，支付宝会打款到该收款账户。
   * @return payeePid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收款账号。目前的结算规则是，每核销一笔优惠券，支付宝会打款到该收款账户。")

  public String getPayeePid() {
    return payeePid;
  }


  public void setPayeePid(String payeePid) {
    this.payeePid = payeePid;
  }


  public ExchangeVoucher refundable(Boolean refundable) {
    
    this.refundable = refundable;
    return this;
  }

   /**
   * 购买的优惠券是否允许退款。不填默认否，枚举值： true：是 false：否
   * @return refundable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "购买的优惠券是否允许退款。不填默认否，枚举值： true：是 false：否")

  public Boolean getRefundable() {
    return refundable;
  }


  public void setRefundable(Boolean refundable) {
    this.refundable = refundable;
  }


  public ExchangeVoucher saleAmount(String saleAmount) {
    
    this.saleAmount = saleAmount;
    return this;
  }

   /**
   * 用户购买优惠券需要支付的金额
   * @return saleAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户购买优惠券需要支付的金额")

  public String getSaleAmount() {
    return saleAmount;
  }


  public void setSaleAmount(String saleAmount) {
    this.saleAmount = saleAmount;
  }


  public ExchangeVoucher settleType(String settleType) {
    
    this.settleType = settleType;
    return this;
  }

   /**
   * 解决类型。
   * @return settleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "解决类型。")

  public String getSettleType() {
    return settleType;
  }


  public void setSettleType(String settleType) {
    this.settleType = settleType;
  }


  public ExchangeVoucher voucherDetailUrl(String voucherDetailUrl) {
    
    this.voucherDetailUrl = voucherDetailUrl;
    return this;
  }

   /**
   * 领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。
   * @return voucherDetailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。")

  public String getVoucherDetailUrl() {
    return voucherDetailUrl;
  }


  public void setVoucherDetailUrl(String voucherDetailUrl) {
    this.voucherDetailUrl = voucherDetailUrl;
  }


  public ExchangeVoucher voucherName(String voucherName) {
    
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
   * @return the ExchangeVoucher instance itself
   */
  public ExchangeVoucher putAdditionalProperty(String key, Object value) {
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
    ExchangeVoucher exchangeVoucher = (ExchangeVoucher) o;
    return Objects.equals(this.amount, exchangeVoucher.amount) &&
        Objects.equals(this.bizType, exchangeVoucher.bizType) &&
        Objects.equals(this.customerServiceMobile, exchangeVoucher.customerServiceMobile) &&
        Objects.equals(this.customerServiceUrl, exchangeVoucher.customerServiceUrl) &&
        Objects.equals(this.floorAmount, exchangeVoucher.floorAmount) &&
        Objects.equals(this.overdueRefundable, exchangeVoucher.overdueRefundable) &&
        Objects.equals(this.payeePid, exchangeVoucher.payeePid) &&
        Objects.equals(this.refundable, exchangeVoucher.refundable) &&
        Objects.equals(this.saleAmount, exchangeVoucher.saleAmount) &&
        Objects.equals(this.settleType, exchangeVoucher.settleType) &&
        Objects.equals(this.voucherDetailUrl, exchangeVoucher.voucherDetailUrl) &&
        Objects.equals(this.voucherName, exchangeVoucher.voucherName)&&
        Objects.equals(this.additionalProperties, exchangeVoucher.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bizType, customerServiceMobile, customerServiceUrl, floorAmount, overdueRefundable, payeePid, refundable, saleAmount, settleType, voucherDetailUrl, voucherName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeVoucher {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    customerServiceMobile: ").append(toIndentedString(customerServiceMobile)).append("\n");
    sb.append("    customerServiceUrl: ").append(toIndentedString(customerServiceUrl)).append("\n");
    sb.append("    floorAmount: ").append(toIndentedString(floorAmount)).append("\n");
    sb.append("    overdueRefundable: ").append(toIndentedString(overdueRefundable)).append("\n");
    sb.append("    payeePid: ").append(toIndentedString(payeePid)).append("\n");
    sb.append("    refundable: ").append(toIndentedString(refundable)).append("\n");
    sb.append("    saleAmount: ").append(toIndentedString(saleAmount)).append("\n");
    sb.append("    settleType: ").append(toIndentedString(settleType)).append("\n");
    sb.append("    voucherDetailUrl: ").append(toIndentedString(voucherDetailUrl)).append("\n");
    sb.append("    voucherName: ").append(toIndentedString(voucherName)).append("\n");
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
    openapiFields.add("biz_type");
    openapiFields.add("customer_service_mobile");
    openapiFields.add("customer_service_url");
    openapiFields.add("floor_amount");
    openapiFields.add("overdue_refundable");
    openapiFields.add("payee_pid");
    openapiFields.add("refundable");
    openapiFields.add("sale_amount");
    openapiFields.add("settle_type");
    openapiFields.add("voucher_detail_url");
    openapiFields.add("voucher_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExchangeVoucher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExchangeVoucher.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExchangeVoucher is not found in the empty JSON string", ExchangeVoucher.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("customer_service_mobile") != null && !jsonObj.get("customer_service_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_service_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_service_mobile").toString()));
      }
      if (jsonObj.get("customer_service_url") != null && !jsonObj.get("customer_service_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_service_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_service_url").toString()));
      }
      if (jsonObj.get("floor_amount") != null && !jsonObj.get("floor_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floor_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floor_amount").toString()));
      }
      if (jsonObj.get("payee_pid") != null && !jsonObj.get("payee_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_pid").toString()));
      }
      if (jsonObj.get("sale_amount") != null && !jsonObj.get("sale_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sale_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sale_amount").toString()));
      }
      if (jsonObj.get("settle_type") != null && !jsonObj.get("settle_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_type").toString()));
      }
      if (jsonObj.get("voucher_detail_url") != null && !jsonObj.get("voucher_detail_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_detail_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_detail_url").toString()));
      }
      if (jsonObj.get("voucher_name") != null && !jsonObj.get("voucher_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExchangeVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExchangeVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExchangeVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExchangeVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<ExchangeVoucher>() {
           @Override
           public void write(JsonWriter out, ExchangeVoucher value) throws IOException {
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
           public ExchangeVoucher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExchangeVoucher instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExchangeVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExchangeVoucher
  * @throws IOException if the JSON string is invalid with respect to ExchangeVoucher
  */
  public static ExchangeVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExchangeVoucher.class);
  }

 /**
  * Convert an instance of ExchangeVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

