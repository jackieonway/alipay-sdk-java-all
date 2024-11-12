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
 * LogisticInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogisticInfo {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_LOGISTIC_ID = "logistic_id";
  @SerializedName(SERIALIZED_NAME_LOGISTIC_ID)
  private String logisticId;

  public static final String SERIALIZED_NAME_SHIP_AREA = "ship_area";
  @SerializedName(SERIALIZED_NAME_SHIP_AREA)
  private String shipArea;

  public static final String SERIALIZED_NAME_SHIP_PERIOD = "ship_period";
  @SerializedName(SERIALIZED_NAME_SHIP_PERIOD)
  private String shipPeriod;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STOP_UPDATE_TIME = "stop_update_time";
  @SerializedName(SERIALIZED_NAME_STOP_UPDATE_TIME)
  private String stopUpdateTime;

  public LogisticInfo() { 
  }

  public LogisticInfo channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * 物流公司名称
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "菜鸟", value = "物流公司名称")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public LogisticInfo detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * 物流详情
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"time\":\"2022-09-09 09:09:09\",\"location\":\"北京\",\"operation\":\"揽收\"}]", value = "物流详情")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public LogisticInfo logisticId(String logisticId) {
    
    this.logisticId = logisticId;
    return this;
  }

   /**
   * 物流id
   * @return logisticId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "121414124124", value = "物流id")

  public String getLogisticId() {
    return logisticId;
  }


  public void setLogisticId(String logisticId) {
    this.logisticId = logisticId;
  }


  public LogisticInfo shipArea(String shipArea) {
    
    this.shipArea = shipArea;
    return this;
  }

   /**
   * 发货地
   * @return shipArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "北京", value = "发货地")

  public String getShipArea() {
    return shipArea;
  }


  public void setShipArea(String shipArea) {
    this.shipArea = shipArea;
  }


  public LogisticInfo shipPeriod(String shipPeriod) {
    
    this.shipPeriod = shipPeriod;
    return this;
  }

   /**
   * 发货时效
   * @return shipPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "48", value = "发货时效")

  public String getShipPeriod() {
    return shipPeriod;
  }


  public void setShipPeriod(String shipPeriod) {
    this.shipPeriod = shipPeriod;
  }


  public LogisticInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 物流状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "已签收", value = "物流状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public LogisticInfo stopUpdateTime(String stopUpdateTime) {
    
    this.stopUpdateTime = stopUpdateTime;
    return this;
  }

   /**
   * 物流停更时间
   * @return stopUpdateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "物流停更时间")

  public String getStopUpdateTime() {
    return stopUpdateTime;
  }


  public void setStopUpdateTime(String stopUpdateTime) {
    this.stopUpdateTime = stopUpdateTime;
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
   * @return the LogisticInfo instance itself
   */
  public LogisticInfo putAdditionalProperty(String key, Object value) {
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
    LogisticInfo logisticInfo = (LogisticInfo) o;
    return Objects.equals(this.channel, logisticInfo.channel) &&
        Objects.equals(this.detail, logisticInfo.detail) &&
        Objects.equals(this.logisticId, logisticInfo.logisticId) &&
        Objects.equals(this.shipArea, logisticInfo.shipArea) &&
        Objects.equals(this.shipPeriod, logisticInfo.shipPeriod) &&
        Objects.equals(this.status, logisticInfo.status) &&
        Objects.equals(this.stopUpdateTime, logisticInfo.stopUpdateTime)&&
        Objects.equals(this.additionalProperties, logisticInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, detail, logisticId, shipArea, shipPeriod, status, stopUpdateTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogisticInfo {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    logisticId: ").append(toIndentedString(logisticId)).append("\n");
    sb.append("    shipArea: ").append(toIndentedString(shipArea)).append("\n");
    sb.append("    shipPeriod: ").append(toIndentedString(shipPeriod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stopUpdateTime: ").append(toIndentedString(stopUpdateTime)).append("\n");
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
    openapiFields.add("channel");
    openapiFields.add("detail");
    openapiFields.add("logistic_id");
    openapiFields.add("ship_area");
    openapiFields.add("ship_period");
    openapiFields.add("status");
    openapiFields.add("stop_update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LogisticInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LogisticInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogisticInfo is not found in the empty JSON string", LogisticInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if (jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
      if (jsonObj.get("logistic_id") != null && !jsonObj.get("logistic_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logistic_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logistic_id").toString()));
      }
      if (jsonObj.get("ship_area") != null && !jsonObj.get("ship_area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ship_area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ship_area").toString()));
      }
      if (jsonObj.get("ship_period") != null && !jsonObj.get("ship_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ship_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ship_period").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("stop_update_time") != null && !jsonObj.get("stop_update_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stop_update_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stop_update_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogisticInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogisticInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogisticInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogisticInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<LogisticInfo>() {
           @Override
           public void write(JsonWriter out, LogisticInfo value) throws IOException {
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
           public LogisticInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LogisticInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LogisticInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogisticInfo
  * @throws IOException if the JSON string is invalid with respect to LogisticInfo
  */
  public static LogisticInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogisticInfo.class);
  }

 /**
  * Convert an instance of LogisticInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

