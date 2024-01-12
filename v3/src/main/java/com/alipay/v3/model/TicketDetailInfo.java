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
 * TicketDetailInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TicketDetailInfo {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_END_STATION = "end_station";
  @SerializedName(SERIALIZED_NAME_END_STATION)
  private String endStation;

  public static final String SERIALIZED_NAME_END_STATION_NAME = "end_station_name";
  @SerializedName(SERIALIZED_NAME_END_STATION_NAME)
  private String endStationName;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public static final String SERIALIZED_NAME_START_STATION = "start_station";
  @SerializedName(SERIALIZED_NAME_START_STATION)
  private String startStation;

  public static final String SERIALIZED_NAME_START_STATION_NAME = "start_station_name";
  @SerializedName(SERIALIZED_NAME_START_STATION_NAME)
  private String startStationName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TICKET_PRICE = "ticket_price";
  @SerializedName(SERIALIZED_NAME_TICKET_PRICE)
  private String ticketPrice;

  public static final String SERIALIZED_NAME_TICKET_TYPE = "ticket_type";
  @SerializedName(SERIALIZED_NAME_TICKET_TYPE)
  private String ticketType;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public TicketDetailInfo() { 
  }

  public TicketDetailInfo amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 总金额，元为单位
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "总金额，元为单位")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TicketDetailInfo endStation(String endStation) {
    
    this.endStation = endStation;
    return this;
  }

   /**
   * 终点站编码
   * @return endStation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21003002", value = "终点站编码")

  public String getEndStation() {
    return endStation;
  }


  public void setEndStation(String endStation) {
    this.endStation = endStation;
  }


  public TicketDetailInfo endStationName(String endStationName) {
    
    this.endStationName = endStationName;
    return this;
  }

   /**
   * 终点站中文名称
   * @return endStationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浦电路", value = "终点站中文名称")

  public String getEndStationName() {
    return endStationName;
  }


  public void setEndStationName(String endStationName) {
    this.endStationName = endStationName;
  }


  public TicketDetailInfo quantity(String quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * 票数量
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "票数量")

  public String getQuantity() {
    return quantity;
  }


  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  public TicketDetailInfo startStation(String startStation) {
    
    this.startStation = startStation;
    return this;
  }

   /**
   * 起点站编码
   * @return startStation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12300002", value = "起点站编码")

  public String getStartStation() {
    return startStation;
  }


  public void setStartStation(String startStation) {
    this.startStation = startStation;
  }


  public TicketDetailInfo startStationName(String startStationName) {
    
    this.startStationName = startStationName;
    return this;
  }

   /**
   * 起点站中文名称
   * @return startStationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "蓝村路", value = "起点站中文名称")

  public String getStartStationName() {
    return startStationName;
  }


  public void setStartStationName(String startStationName) {
    this.startStationName = startStationName;
  }


  public TicketDetailInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 订单状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "订单状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TicketDetailInfo ticketPrice(String ticketPrice) {
    
    this.ticketPrice = ticketPrice;
    return this;
  }

   /**
   * 单价，元为单位
   * @return ticketPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.00", value = "单价，元为单位")

  public String getTicketPrice() {
    return ticketPrice;
  }


  public void setTicketPrice(String ticketPrice) {
    this.ticketPrice = ticketPrice;
  }


  public TicketDetailInfo ticketType(String ticketType) {
    
    this.ticketType = ticketType;
    return this;
  }

   /**
   * 票类型
   * @return ticketType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "oneway", value = "票类型")

  public String getTicketType() {
    return ticketType;
  }


  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }


  public TicketDetailInfo tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0123456789", value = "支付宝交易号")

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
   * @return the TicketDetailInfo instance itself
   */
  public TicketDetailInfo putAdditionalProperty(String key, Object value) {
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
    TicketDetailInfo ticketDetailInfo = (TicketDetailInfo) o;
    return Objects.equals(this.amount, ticketDetailInfo.amount) &&
        Objects.equals(this.endStation, ticketDetailInfo.endStation) &&
        Objects.equals(this.endStationName, ticketDetailInfo.endStationName) &&
        Objects.equals(this.quantity, ticketDetailInfo.quantity) &&
        Objects.equals(this.startStation, ticketDetailInfo.startStation) &&
        Objects.equals(this.startStationName, ticketDetailInfo.startStationName) &&
        Objects.equals(this.status, ticketDetailInfo.status) &&
        Objects.equals(this.ticketPrice, ticketDetailInfo.ticketPrice) &&
        Objects.equals(this.ticketType, ticketDetailInfo.ticketType) &&
        Objects.equals(this.tradeNo, ticketDetailInfo.tradeNo)&&
        Objects.equals(this.additionalProperties, ticketDetailInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, endStation, endStationName, quantity, startStation, startStationName, status, ticketPrice, ticketType, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketDetailInfo {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    endStation: ").append(toIndentedString(endStation)).append("\n");
    sb.append("    endStationName: ").append(toIndentedString(endStationName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    startStation: ").append(toIndentedString(startStation)).append("\n");
    sb.append("    startStationName: ").append(toIndentedString(startStationName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ticketPrice: ").append(toIndentedString(ticketPrice)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("end_station");
    openapiFields.add("end_station_name");
    openapiFields.add("quantity");
    openapiFields.add("start_station");
    openapiFields.add("start_station_name");
    openapiFields.add("status");
    openapiFields.add("ticket_price");
    openapiFields.add("ticket_type");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TicketDetailInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TicketDetailInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TicketDetailInfo is not found in the empty JSON string", TicketDetailInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("end_station") != null && !jsonObj.get("end_station").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_station` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_station").toString()));
      }
      if (jsonObj.get("end_station_name") != null && !jsonObj.get("end_station_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_station_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_station_name").toString()));
      }
      if (jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
      if (jsonObj.get("start_station") != null && !jsonObj.get("start_station").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_station` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_station").toString()));
      }
      if (jsonObj.get("start_station_name") != null && !jsonObj.get("start_station_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_station_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_station_name").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("ticket_price") != null && !jsonObj.get("ticket_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_price").toString()));
      }
      if (jsonObj.get("ticket_type") != null && !jsonObj.get("ticket_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_type").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TicketDetailInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TicketDetailInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TicketDetailInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TicketDetailInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TicketDetailInfo>() {
           @Override
           public void write(JsonWriter out, TicketDetailInfo value) throws IOException {
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
           public TicketDetailInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TicketDetailInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TicketDetailInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TicketDetailInfo
  * @throws IOException if the JSON string is invalid with respect to TicketDetailInfo
  */
  public static TicketDetailInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TicketDetailInfo.class);
  }

 /**
  * Convert an instance of TicketDetailInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

