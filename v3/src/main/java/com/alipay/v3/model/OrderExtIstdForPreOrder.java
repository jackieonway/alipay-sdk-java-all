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
 * OrderExtIstdForPreOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderExtIstdForPreOrder {
  public static final String SERIALIZED_NAME_CASH_ON_DELIVERY = "cash_on_delivery";
  @SerializedName(SERIALIZED_NAME_CASH_ON_DELIVERY)
  private String cashOnDelivery;

  public static final String SERIALIZED_NAME_CASH_ON_PICKUP = "cash_on_pickup";
  @SerializedName(SERIALIZED_NAME_CASH_ON_PICKUP)
  private String cashOnPickup;

  public static final String SERIALIZED_NAME_CONSUMER_ORDER_TIME = "consumer_order_time";
  @SerializedName(SERIALIZED_NAME_CONSUMER_ORDER_TIME)
  private String consumerOrderTime;

  public static final String SERIALIZED_NAME_DELIVERY_DIRECTION = "delivery_direction";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DIRECTION)
  private Integer deliveryDirection;

  public static final String SERIALIZED_NAME_DELIVERY_TYPE = "delivery_type";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TYPE)
  private Integer deliveryType;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_EXPECTED_DELIVERY_TIME = "expected_delivery_time";
  @SerializedName(SERIALIZED_NAME_EXPECTED_DELIVERY_TIME)
  private String expectedDeliveryTime;

  public static final String SERIALIZED_NAME_EXPECTED_FINISH_TIME = "expected_finish_time";
  @SerializedName(SERIALIZED_NAME_EXPECTED_FINISH_TIME)
  private String expectedFinishTime;

  public static final String SERIALIZED_NAME_EXPECTED_PICK_TIME = "expected_pick_time";
  @SerializedName(SERIALIZED_NAME_EXPECTED_PICK_TIME)
  private String expectedPickTime;

  public static final String SERIALIZED_NAME_INSURE_PRICE = "insure_price";
  @SerializedName(SERIALIZED_NAME_INSURE_PRICE)
  private String insurePrice;

  public static final String SERIALIZED_NAME_IS_DIRECT_DELIVERY = "is_direct_delivery";
  @SerializedName(SERIALIZED_NAME_IS_DIRECT_DELIVERY)
  private Integer isDirectDelivery;

  public static final String SERIALIZED_NAME_IS_FINISH_CODE_NEEDED = "is_finish_code_needed";
  @SerializedName(SERIALIZED_NAME_IS_FINISH_CODE_NEEDED)
  private Integer isFinishCodeNeeded;

  public static final String SERIALIZED_NAME_IS_INSURED = "is_insured";
  @SerializedName(SERIALIZED_NAME_IS_INSURED)
  private Integer isInsured;

  public static final String SERIALIZED_NAME_IS_PICKUP_CODE_NEEDED = "is_pickup_code_needed";
  @SerializedName(SERIALIZED_NAME_IS_PICKUP_CODE_NEEDED)
  private Integer isPickupCodeNeeded;

  public static final String SERIALIZED_NAME_POI_SEQ = "poi_seq";
  @SerializedName(SERIALIZED_NAME_POI_SEQ)
  private String poiSeq;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public OrderExtIstdForPreOrder() { 
  }

  public OrderExtIstdForPreOrder cashOnDelivery(String cashOnDelivery) {
    
    this.cashOnDelivery = cashOnDelivery;
    return this;
  }

   /**
   * 骑手应付金额
   * @return cashOnDelivery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15.00", value = "骑手应付金额")

  public String getCashOnDelivery() {
    return cashOnDelivery;
  }


  public void setCashOnDelivery(String cashOnDelivery) {
    this.cashOnDelivery = cashOnDelivery;
  }


  public OrderExtIstdForPreOrder cashOnPickup(String cashOnPickup) {
    
    this.cashOnPickup = cashOnPickup;
    return this;
  }

   /**
   * 骑手应收金额
   * @return cashOnPickup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13.00", value = "骑手应收金额")

  public String getCashOnPickup() {
    return cashOnPickup;
  }


  public void setCashOnPickup(String cashOnPickup) {
    this.cashOnPickup = cashOnPickup;
  }


  public OrderExtIstdForPreOrder consumerOrderTime(String consumerOrderTime) {
    
    this.consumerOrderTime = consumerOrderTime;
    return this;
  }

   /**
   * 消费者下单时间
   * @return consumerOrderTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-01 13:23:00", value = "消费者下单时间")

  public String getConsumerOrderTime() {
    return consumerOrderTime;
  }


  public void setConsumerOrderTime(String consumerOrderTime) {
    this.consumerOrderTime = consumerOrderTime;
  }


  public OrderExtIstdForPreOrder deliveryDirection(Integer deliveryDirection) {
    
    this.deliveryDirection = deliveryDirection;
    return this;
  }

   /**
   * 物流流向，1：从门店取件送至用户；2：从用户取件送至门店
   * @return deliveryDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "物流流向，1：从门店取件送至用户；2：从用户取件送至门店")

  public Integer getDeliveryDirection() {
    return deliveryDirection;
  }


  public void setDeliveryDirection(Integer deliveryDirection) {
    this.deliveryDirection = deliveryDirection;
  }


  public OrderExtIstdForPreOrder deliveryType(Integer deliveryType) {
    
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * 配送类型, 0: 即时单 1 预约单
   * @return deliveryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "配送类型, 0: 即时单 1 预约单")

  public Integer getDeliveryType() {
    return deliveryType;
  }


  public void setDeliveryType(Integer deliveryType) {
    this.deliveryType = deliveryType;
  }


  public OrderExtIstdForPreOrder desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 备注
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "备注", value = "备注")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public OrderExtIstdForPreOrder expectedDeliveryTime(String expectedDeliveryTime) {
    
    this.expectedDeliveryTime = expectedDeliveryTime;
    return this;
  }

   /**
   * 期望派单时间
   * @return expectedDeliveryTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-27 15:45:57", value = "期望派单时间")

  public String getExpectedDeliveryTime() {
    return expectedDeliveryTime;
  }


  public void setExpectedDeliveryTime(String expectedDeliveryTime) {
    this.expectedDeliveryTime = expectedDeliveryTime;
  }


  public OrderExtIstdForPreOrder expectedFinishTime(String expectedFinishTime) {
    
    this.expectedFinishTime = expectedFinishTime;
    return this;
  }

   /**
   * 期望送达时间
   * @return expectedFinishTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-01 13:23:00", value = "期望送达时间")

  public String getExpectedFinishTime() {
    return expectedFinishTime;
  }


  public void setExpectedFinishTime(String expectedFinishTime) {
    this.expectedFinishTime = expectedFinishTime;
  }


  public OrderExtIstdForPreOrder expectedPickTime(String expectedPickTime) {
    
    this.expectedPickTime = expectedPickTime;
    return this;
  }

   /**
   * 期望取件时间
   * @return expectedPickTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-01 13:23:00", value = "期望取件时间")

  public String getExpectedPickTime() {
    return expectedPickTime;
  }


  public void setExpectedPickTime(String expectedPickTime) {
    this.expectedPickTime = expectedPickTime;
  }


  public OrderExtIstdForPreOrder insurePrice(String insurePrice) {
    
    this.insurePrice = insurePrice;
    return this;
  }

   /**
   * 保价金额
   * @return insurePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "保价金额")

  public String getInsurePrice() {
    return insurePrice;
  }


  public void setInsurePrice(String insurePrice) {
    this.insurePrice = insurePrice;
  }


  public OrderExtIstdForPreOrder isDirectDelivery(Integer isDirectDelivery) {
    
    this.isDirectDelivery = isDirectDelivery;
    return this;
  }

   /**
   * 是否直拿直送，1:直拿直送 0:非直拿直送
   * @return isDirectDelivery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "是否直拿直送，1:直拿直送 0:非直拿直送")

  public Integer getIsDirectDelivery() {
    return isDirectDelivery;
  }


  public void setIsDirectDelivery(Integer isDirectDelivery) {
    this.isDirectDelivery = isDirectDelivery;
  }


  public OrderExtIstdForPreOrder isFinishCodeNeeded(Integer isFinishCodeNeeded) {
    
    this.isFinishCodeNeeded = isFinishCodeNeeded;
    return this;
  }

   /**
   * 是否需要收货码，1:需要 0:不需要
   * @return isFinishCodeNeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "是否需要收货码，1:需要 0:不需要")

  public Integer getIsFinishCodeNeeded() {
    return isFinishCodeNeeded;
  }


  public void setIsFinishCodeNeeded(Integer isFinishCodeNeeded) {
    this.isFinishCodeNeeded = isFinishCodeNeeded;
  }


  public OrderExtIstdForPreOrder isInsured(Integer isInsured) {
    
    this.isInsured = isInsured;
    return this;
  }

   /**
   * 是否保价，1:保价 0:不保价
   * @return isInsured
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "是否保价，1:保价 0:不保价")

  public Integer getIsInsured() {
    return isInsured;
  }


  public void setIsInsured(Integer isInsured) {
    this.isInsured = isInsured;
  }


  public OrderExtIstdForPreOrder isPickupCodeNeeded(Integer isPickupCodeNeeded) {
    
    this.isPickupCodeNeeded = isPickupCodeNeeded;
    return this;
  }

   /**
   * 是否需要取货码，1:需要 0:不需要
   * @return isPickupCodeNeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "是否需要取货码，1:需要 0:不需要")

  public Integer getIsPickupCodeNeeded() {
    return isPickupCodeNeeded;
  }


  public void setIsPickupCodeNeeded(Integer isPickupCodeNeeded) {
    this.isPickupCodeNeeded = isPickupCodeNeeded;
  }


  public OrderExtIstdForPreOrder poiSeq(String poiSeq) {
    
    this.poiSeq = poiSeq;
    return this;
  }

   /**
   * 门店订单流水号
   * @return poiSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx", value = "门店订单流水号")

  public String getPoiSeq() {
    return poiSeq;
  }


  public void setPoiSeq(String poiSeq) {
    this.poiSeq = poiSeq;
  }


  public OrderExtIstdForPreOrder serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 即时配送公司的服务代码
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001", value = "即时配送公司的服务代码")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderExtIstdForPreOrder orderExtIstdForPreOrder = (OrderExtIstdForPreOrder) o;
    return Objects.equals(this.cashOnDelivery, orderExtIstdForPreOrder.cashOnDelivery) &&
        Objects.equals(this.cashOnPickup, orderExtIstdForPreOrder.cashOnPickup) &&
        Objects.equals(this.consumerOrderTime, orderExtIstdForPreOrder.consumerOrderTime) &&
        Objects.equals(this.deliveryDirection, orderExtIstdForPreOrder.deliveryDirection) &&
        Objects.equals(this.deliveryType, orderExtIstdForPreOrder.deliveryType) &&
        Objects.equals(this.desc, orderExtIstdForPreOrder.desc) &&
        Objects.equals(this.expectedDeliveryTime, orderExtIstdForPreOrder.expectedDeliveryTime) &&
        Objects.equals(this.expectedFinishTime, orderExtIstdForPreOrder.expectedFinishTime) &&
        Objects.equals(this.expectedPickTime, orderExtIstdForPreOrder.expectedPickTime) &&
        Objects.equals(this.insurePrice, orderExtIstdForPreOrder.insurePrice) &&
        Objects.equals(this.isDirectDelivery, orderExtIstdForPreOrder.isDirectDelivery) &&
        Objects.equals(this.isFinishCodeNeeded, orderExtIstdForPreOrder.isFinishCodeNeeded) &&
        Objects.equals(this.isInsured, orderExtIstdForPreOrder.isInsured) &&
        Objects.equals(this.isPickupCodeNeeded, orderExtIstdForPreOrder.isPickupCodeNeeded) &&
        Objects.equals(this.poiSeq, orderExtIstdForPreOrder.poiSeq) &&
        Objects.equals(this.serviceCode, orderExtIstdForPreOrder.serviceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashOnDelivery, cashOnPickup, consumerOrderTime, deliveryDirection, deliveryType, desc, expectedDeliveryTime, expectedFinishTime, expectedPickTime, insurePrice, isDirectDelivery, isFinishCodeNeeded, isInsured, isPickupCodeNeeded, poiSeq, serviceCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderExtIstdForPreOrder {\n");
    sb.append("    cashOnDelivery: ").append(toIndentedString(cashOnDelivery)).append("\n");
    sb.append("    cashOnPickup: ").append(toIndentedString(cashOnPickup)).append("\n");
    sb.append("    consumerOrderTime: ").append(toIndentedString(consumerOrderTime)).append("\n");
    sb.append("    deliveryDirection: ").append(toIndentedString(deliveryDirection)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    expectedDeliveryTime: ").append(toIndentedString(expectedDeliveryTime)).append("\n");
    sb.append("    expectedFinishTime: ").append(toIndentedString(expectedFinishTime)).append("\n");
    sb.append("    expectedPickTime: ").append(toIndentedString(expectedPickTime)).append("\n");
    sb.append("    insurePrice: ").append(toIndentedString(insurePrice)).append("\n");
    sb.append("    isDirectDelivery: ").append(toIndentedString(isDirectDelivery)).append("\n");
    sb.append("    isFinishCodeNeeded: ").append(toIndentedString(isFinishCodeNeeded)).append("\n");
    sb.append("    isInsured: ").append(toIndentedString(isInsured)).append("\n");
    sb.append("    isPickupCodeNeeded: ").append(toIndentedString(isPickupCodeNeeded)).append("\n");
    sb.append("    poiSeq: ").append(toIndentedString(poiSeq)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
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
    openapiFields.add("cash_on_delivery");
    openapiFields.add("cash_on_pickup");
    openapiFields.add("consumer_order_time");
    openapiFields.add("delivery_direction");
    openapiFields.add("delivery_type");
    openapiFields.add("desc");
    openapiFields.add("expected_delivery_time");
    openapiFields.add("expected_finish_time");
    openapiFields.add("expected_pick_time");
    openapiFields.add("insure_price");
    openapiFields.add("is_direct_delivery");
    openapiFields.add("is_finish_code_needed");
    openapiFields.add("is_insured");
    openapiFields.add("is_pickup_code_needed");
    openapiFields.add("poi_seq");
    openapiFields.add("service_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderExtIstdForPreOrder
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderExtIstdForPreOrder.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderExtIstdForPreOrder is not found in the empty JSON string", OrderExtIstdForPreOrder.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderExtIstdForPreOrder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderExtIstdForPreOrder` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cash_on_delivery") != null && !jsonObj.get("cash_on_delivery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cash_on_delivery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cash_on_delivery").toString()));
      }
      if (jsonObj.get("cash_on_pickup") != null && !jsonObj.get("cash_on_pickup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cash_on_pickup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cash_on_pickup").toString()));
      }
      if (jsonObj.get("consumer_order_time") != null && !jsonObj.get("consumer_order_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumer_order_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumer_order_time").toString()));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("expected_delivery_time") != null && !jsonObj.get("expected_delivery_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected_delivery_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected_delivery_time").toString()));
      }
      if (jsonObj.get("expected_finish_time") != null && !jsonObj.get("expected_finish_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected_finish_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected_finish_time").toString()));
      }
      if (jsonObj.get("expected_pick_time") != null && !jsonObj.get("expected_pick_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected_pick_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected_pick_time").toString()));
      }
      if (jsonObj.get("insure_price") != null && !jsonObj.get("insure_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insure_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insure_price").toString()));
      }
      if (jsonObj.get("poi_seq") != null && !jsonObj.get("poi_seq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poi_seq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poi_seq").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderExtIstdForPreOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderExtIstdForPreOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderExtIstdForPreOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderExtIstdForPreOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderExtIstdForPreOrder>() {
           @Override
           public void write(JsonWriter out, OrderExtIstdForPreOrder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderExtIstdForPreOrder read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderExtIstdForPreOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderExtIstdForPreOrder
  * @throws IOException if the JSON string is invalid with respect to OrderExtIstdForPreOrder
  */
  public static OrderExtIstdForPreOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderExtIstdForPreOrder.class);
  }

 /**
  * Convert an instance of OrderExtIstdForPreOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

