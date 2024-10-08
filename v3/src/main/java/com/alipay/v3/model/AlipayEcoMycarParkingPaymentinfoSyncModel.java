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
 * AlipayEcoMycarParkingPaymentinfoSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingPaymentinfoSyncModel {
  public static final String SERIALIZED_NAME_CAR_NUMBER = "car_number";
  @SerializedName(SERIALIZED_NAME_CAR_NUMBER)
  private String carNumber;

  public static final String SERIALIZED_NAME_ISV_URL = "isv_url";
  @SerializedName(SERIALIZED_NAME_ISV_URL)
  private String isvUrl;

  public static final String SERIALIZED_NAME_OUT_SERIAL_NO = "out_serial_no";
  @SerializedName(SERIALIZED_NAME_OUT_SERIAL_NO)
  private String outSerialNo;

  public static final String SERIALIZED_NAME_PARKING_ID = "parking_id";
  @SerializedName(SERIALIZED_NAME_PARKING_ID)
  private String parkingId;

  public static final String SERIALIZED_NAME_PAYMENT_FREE_MINUTES = "payment_free_minutes";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FREE_MINUTES)
  private Integer paymentFreeMinutes;

  public static final String SERIALIZED_NAME_PAYMENT_TIME = "payment_time";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TIME)
  private String paymentTime;

  public static final String SERIALIZED_NAME_SERIAL_NO = "serial_no";
  @SerializedName(SERIALIZED_NAME_SERIAL_NO)
  private String serialNo;

  public AlipayEcoMycarParkingPaymentinfoSyncModel() { 
  }

  public AlipayEcoMycarParkingPaymentinfoSyncModel carNumber(String carNumber) {
    
    this.carNumber = carNumber;
    return this;
  }

   /**
   * 车牌号
   * @return carNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙Axxxxx", value = "车牌号")

  public String getCarNumber() {
    return carNumber;
  }


  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
  }


  public AlipayEcoMycarParkingPaymentinfoSyncModel isvUrl(String isvUrl) {
    
    this.isvUrl = isvUrl;
    return this;
  }

   /**
   * 停车消息透出后，消息详情的落地承接页链接，可配置ISV维度的统一值
   * @return isvUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://xxxxx", value = "停车消息透出后，消息详情的落地承接页链接，可配置ISV维度的统一值")

  public String getIsvUrl() {
    return isvUrl;
  }


  public void setIsvUrl(String isvUrl) {
    this.isvUrl = isvUrl;
  }


  public AlipayEcoMycarParkingPaymentinfoSyncModel outSerialNo(String outSerialNo) {
    
    this.outSerialNo = outSerialNo;
    return this;
  }

   /**
   * 外部业务停车流水号(用于串通进场与出场信息)。如果 out_serial_no与serial_no都传递，则一起校验。 ● serial_no与out_serial_no二选一必填。 ● 入参有serial_no和out_serial_no，则优先根据serial_no和out_serial_no一起匹配进出场事件 ● 入参仅有serial_no，则优先根据serial_no匹配进出场事件 ● 入参仅有out_serial_no，则根据out_serial_no匹配进出场事件
   * @return outSerialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090711003017233600000001", value = "外部业务停车流水号(用于串通进场与出场信息)。如果 out_serial_no与serial_no都传递，则一起校验。 ● serial_no与out_serial_no二选一必填。 ● 入参有serial_no和out_serial_no，则优先根据serial_no和out_serial_no一起匹配进出场事件 ● 入参仅有serial_no，则优先根据serial_no匹配进出场事件 ● 入参仅有out_serial_no，则根据out_serial_no匹配进出场事件")

  public String getOutSerialNo() {
    return outSerialNo;
  }


  public void setOutSerialNo(String outSerialNo) {
    this.outSerialNo = outSerialNo;
  }


  public AlipayEcoMycarParkingPaymentinfoSyncModel parkingId(String parkingId) {
    
    this.parkingId = parkingId;
    return this;
  }

   /**
   * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 alipay.eco.mycar.parking.parkinglotinfo.create(录入停车场信息)接口获取。
   * @return parkingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015042321001004720200028594", value = "支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 alipay.eco.mycar.parking.parkinglotinfo.create(录入停车场信息)接口获取。")

  public String getParkingId() {
    return parkingId;
  }


  public void setParkingId(String parkingId) {
    this.parkingId = parkingId;
  }


  public AlipayEcoMycarParkingPaymentinfoSyncModel paymentFreeMinutes(Integer paymentFreeMinutes) {
    
    this.paymentFreeMinutes = paymentFreeMinutes;
    return this;
  }

   /**
   * 停车场内缴费后，允许出场的免费时长分钟数
   * @return paymentFreeMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "停车场内缴费后，允许出场的免费时长分钟数")

  public Integer getPaymentFreeMinutes() {
    return paymentFreeMinutes;
  }


  public void setPaymentFreeMinutes(Integer paymentFreeMinutes) {
    this.paymentFreeMinutes = paymentFreeMinutes;
  }


  public AlipayEcoMycarParkingPaymentinfoSyncModel paymentTime(String paymentTime) {
    
    this.paymentTime = paymentTime;
    return this;
  }

   /**
   * 场内缴费时间，格式\&quot;YYYY-MM-DD HH:mm:ss\&quot;，24小时制，请保证服务器时间准确，场内缴费不应晚于当前网络时间
   * @return paymentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-06-12 15:29:55", value = "场内缴费时间，格式\"YYYY-MM-DD HH:mm:ss\"，24小时制，请保证服务器时间准确，场内缴费不应晚于当前网络时间")

  public String getPaymentTime() {
    return paymentTime;
  }


  public void setPaymentTime(String paymentTime) {
    this.paymentTime = paymentTime;
  }


  public AlipayEcoMycarParkingPaymentinfoSyncModel serialNo(String serialNo) {
    
    this.serialNo = serialNo;
    return this;
  }

   /**
   * 支付宝业务流水号(用于串通进场与出场信息)。可通过 alipay.eco.mycar.parking.enterinfo.sync (车辆驶入接口)接口获取。 ● serial_no与out_serial_no二选一必填。 ● 入参有serial_no和out_serial_no，则优先根据serial_no和out_serial_no一起匹配进出场事件 ● 入参仅有serial_no，则优先根据serial_no匹配进出场事件 ● 入参仅有out_serial_no，则根据out_serial_no匹配进出场事件
   * @return serialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090711003017233600000001", value = "支付宝业务流水号(用于串通进场与出场信息)。可通过 alipay.eco.mycar.parking.enterinfo.sync (车辆驶入接口)接口获取。 ● serial_no与out_serial_no二选一必填。 ● 入参有serial_no和out_serial_no，则优先根据serial_no和out_serial_no一起匹配进出场事件 ● 入参仅有serial_no，则优先根据serial_no匹配进出场事件 ● 入参仅有out_serial_no，则根据out_serial_no匹配进出场事件")

  public String getSerialNo() {
    return serialNo;
  }


  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
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
   * @return the AlipayEcoMycarParkingPaymentinfoSyncModel instance itself
   */
  public AlipayEcoMycarParkingPaymentinfoSyncModel putAdditionalProperty(String key, Object value) {
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
    AlipayEcoMycarParkingPaymentinfoSyncModel alipayEcoMycarParkingPaymentinfoSyncModel = (AlipayEcoMycarParkingPaymentinfoSyncModel) o;
    return Objects.equals(this.carNumber, alipayEcoMycarParkingPaymentinfoSyncModel.carNumber) &&
        Objects.equals(this.isvUrl, alipayEcoMycarParkingPaymentinfoSyncModel.isvUrl) &&
        Objects.equals(this.outSerialNo, alipayEcoMycarParkingPaymentinfoSyncModel.outSerialNo) &&
        Objects.equals(this.parkingId, alipayEcoMycarParkingPaymentinfoSyncModel.parkingId) &&
        Objects.equals(this.paymentFreeMinutes, alipayEcoMycarParkingPaymentinfoSyncModel.paymentFreeMinutes) &&
        Objects.equals(this.paymentTime, alipayEcoMycarParkingPaymentinfoSyncModel.paymentTime) &&
        Objects.equals(this.serialNo, alipayEcoMycarParkingPaymentinfoSyncModel.serialNo)&&
        Objects.equals(this.additionalProperties, alipayEcoMycarParkingPaymentinfoSyncModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carNumber, isvUrl, outSerialNo, parkingId, paymentFreeMinutes, paymentTime, serialNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingPaymentinfoSyncModel {\n");
    sb.append("    carNumber: ").append(toIndentedString(carNumber)).append("\n");
    sb.append("    isvUrl: ").append(toIndentedString(isvUrl)).append("\n");
    sb.append("    outSerialNo: ").append(toIndentedString(outSerialNo)).append("\n");
    sb.append("    parkingId: ").append(toIndentedString(parkingId)).append("\n");
    sb.append("    paymentFreeMinutes: ").append(toIndentedString(paymentFreeMinutes)).append("\n");
    sb.append("    paymentTime: ").append(toIndentedString(paymentTime)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
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
    openapiFields.add("car_number");
    openapiFields.add("isv_url");
    openapiFields.add("out_serial_no");
    openapiFields.add("parking_id");
    openapiFields.add("payment_free_minutes");
    openapiFields.add("payment_time");
    openapiFields.add("serial_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingPaymentinfoSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingPaymentinfoSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingPaymentinfoSyncModel is not found in the empty JSON string", AlipayEcoMycarParkingPaymentinfoSyncModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("car_number") != null && !jsonObj.get("car_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `car_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("car_number").toString()));
      }
      if (jsonObj.get("isv_url") != null && !jsonObj.get("isv_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_url").toString()));
      }
      if (jsonObj.get("out_serial_no") != null && !jsonObj.get("out_serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_serial_no").toString()));
      }
      if (jsonObj.get("parking_id") != null && !jsonObj.get("parking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_id").toString()));
      }
      if (jsonObj.get("payment_time") != null && !jsonObj.get("payment_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_time").toString()));
      }
      if (jsonObj.get("serial_no") != null && !jsonObj.get("serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingPaymentinfoSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingPaymentinfoSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingPaymentinfoSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingPaymentinfoSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingPaymentinfoSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingPaymentinfoSyncModel value) throws IOException {
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
           public AlipayEcoMycarParkingPaymentinfoSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEcoMycarParkingPaymentinfoSyncModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEcoMycarParkingPaymentinfoSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingPaymentinfoSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingPaymentinfoSyncModel
  */
  public static AlipayEcoMycarParkingPaymentinfoSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingPaymentinfoSyncModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingPaymentinfoSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

