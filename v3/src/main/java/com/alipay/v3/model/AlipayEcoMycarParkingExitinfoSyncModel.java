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
 * AlipayEcoMycarParkingExitinfoSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingExitinfoSyncModel {
  public static final String SERIALIZED_NAME_ACTUAL_AMOUNT = "actual_amount";
  @SerializedName(SERIALIZED_NAME_ACTUAL_AMOUNT)
  private String actualAmount;

  public static final String SERIALIZED_NAME_CAR_COLOR = "car_color";
  @SerializedName(SERIALIZED_NAME_CAR_COLOR)
  private String carColor;

  public static final String SERIALIZED_NAME_CAR_NUMBER = "car_number";
  @SerializedName(SERIALIZED_NAME_CAR_NUMBER)
  private String carNumber;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private String discountAmount;

  public static final String SERIALIZED_NAME_EXIT_ID = "exit_id";
  @SerializedName(SERIALIZED_NAME_EXIT_ID)
  private String exitId;

  public static final String SERIALIZED_NAME_IS_ENCRYPT_CAR_NUMBER = "is_encrypt_car_number";
  @SerializedName(SERIALIZED_NAME_IS_ENCRYPT_CAR_NUMBER)
  private Boolean isEncryptCarNumber;

  public static final String SERIALIZED_NAME_ISV_URL = "isv_url";
  @SerializedName(SERIALIZED_NAME_ISV_URL)
  private String isvUrl;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private String orderAmount;

  public static final String SERIALIZED_NAME_OUT_SERIAL_NO = "out_serial_no";
  @SerializedName(SERIALIZED_NAME_OUT_SERIAL_NO)
  private String outSerialNo;

  public static final String SERIALIZED_NAME_OUT_TIME = "out_time";
  @SerializedName(SERIALIZED_NAME_OUT_TIME)
  private String outTime;

  public static final String SERIALIZED_NAME_PARKING_ID = "parking_id";
  @SerializedName(SERIALIZED_NAME_PARKING_ID)
  private String parkingId;

  public static final String SERIALIZED_NAME_SERIAL_NO = "serial_no";
  @SerializedName(SERIALIZED_NAME_SERIAL_NO)
  private String serialNo;

  public static final String SERIALIZED_NAME_SPACE_NUMBER = "space_number";
  @SerializedName(SERIALIZED_NAME_SPACE_NUMBER)
  private String spaceNumber;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public AlipayEcoMycarParkingExitinfoSyncModel() { 
  }

  public AlipayEcoMycarParkingExitinfoSyncModel actualAmount(String actualAmount) {
    
    this.actualAmount = actualAmount;
    return this;
  }

   /**
   * 实际金额
   * @return actualAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "实际金额")

  public String getActualAmount() {
    return actualAmount;
  }


  public void setActualAmount(String actualAmount) {
    this.actualAmount = actualAmount;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel carColor(String carColor) {
    
    this.carColor = carColor;
    return this;
  }

   /**
   * 车牌颜色，枚举支持： *BLUE：蓝。 *GREEN：绿。 *YELLOW：黄。 *WHITE：白。 *BLACK：黑。 *LIMEGREEN：黄绿色。
   * @return carColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BLUE", value = "车牌颜色，枚举支持： *BLUE：蓝。 *GREEN：绿。 *YELLOW：黄。 *WHITE：白。 *BLACK：黑。 *LIMEGREEN：黄绿色。")

  public String getCarColor() {
    return carColor;
  }


  public void setCarColor(String carColor) {
    this.carColor = carColor;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel carNumber(String carNumber) {
    
    this.carNumber = carNumber;
    return this;
  }

   /**
   * 车牌号
   * @return carNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "豫C33333", value = "车牌号")

  public String getCarNumber() {
    return carNumber;
  }


  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel discountAmount(String discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 折扣金额
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "折扣金额")

  public String getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel exitId(String exitId) {
    
    this.exitId = exitId;
    return this;
  }

   /**
   * 用于识别车辆出口，多出入口车场适用
   * @return exitId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SN001", value = "用于识别车辆出口，多出入口车场适用")

  public String getExitId() {
    return exitId;
  }


  public void setExitId(String exitId) {
    this.exitId = exitId;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel isEncryptCarNumber(Boolean isEncryptCarNumber) {
    
    this.isEncryptCarNumber = isEncryptCarNumber;
    return this;
  }

   /**
   * 是否加密，默认为false
   * @return isEncryptCarNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否加密，默认为false")

  public Boolean getIsEncryptCarNumber() {
    return isEncryptCarNumber;
  }


  public void setIsEncryptCarNumber(Boolean isEncryptCarNumber) {
    this.isEncryptCarNumber = isEncryptCarNumber;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel isvUrl(String isvUrl) {
    
    this.isvUrl = isvUrl;
    return this;
  }

   /**
   * 智能助理当前的跳转链接
   * @return isvUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://xxxxx", value = "智能助理当前的跳转链接")

  public String getIsvUrl() {
    return isvUrl;
  }


  public void setIsvUrl(String isvUrl) {
    this.isvUrl = isvUrl;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel orderAmount(String orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * 订单总金额
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "订单总金额")

  public String getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(String orderAmount) {
    this.orderAmount = orderAmount;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel outSerialNo(String outSerialNo) {
    
    this.outSerialNo = outSerialNo;
    return this;
  }

   /**
   * 外部停车流水号(用于串通进场与出场信息)
   * @return outSerialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090711003017233600000001", value = "外部停车流水号(用于串通进场与出场信息)")

  public String getOutSerialNo() {
    return outSerialNo;
  }


  public void setOutSerialNo(String outSerialNo) {
    this.outSerialNo = outSerialNo;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel outTime(String outTime) {
    
    this.outTime = outTime;
    return this;
  }

   /**
   * 车辆离场时间，格式\&quot;YYYY-MM-DD HH:mm:ss\&quot;，24小时制
   * @return outTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-07-24 03:07:50", value = "车辆离场时间，格式\"YYYY-MM-DD HH:mm:ss\"，24小时制")

  public String getOutTime() {
    return outTime;
  }


  public void setOutTime(String outTime) {
    this.outTime = outTime;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel parkingId(String parkingId) {
    
    this.parkingId = parkingId;
    return this;
  }

   /**
   * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个ISV或商户范围内唯一。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口获取。
   * @return parkingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PI1592907192010409114", value = "支付宝停车平台ID，由支付宝定义的该停车场标识，同一个ISV或商户范围内唯一。通过 <a href=\"https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口获取。")

  public String getParkingId() {
    return parkingId;
  }


  public void setParkingId(String parkingId) {
    this.parkingId = parkingId;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel serialNo(String serialNo) {
    
    this.serialNo = serialNo;
    return this;
  }

   /**
   * 支付宝业务流水号，用于记录车辆从驶入到驶出的全流程。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.enterinfo.sync\&quot;&gt;alipay.eco.mycar.parking.enterinfo.sync&lt;/a&gt;(车辆驶入接口)接口获取。
   * @return serialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090711003017233600000001", value = "支付宝业务流水号，用于记录车辆从驶入到驶出的全流程。通过 <a href=\"https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.enterinfo.sync\">alipay.eco.mycar.parking.enterinfo.sync</a>(车辆驶入接口)接口获取。")

  public String getSerialNo() {
    return serialNo;
  }


  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel spaceNumber(String spaceNumber) {
    
    this.spaceNumber = spaceNumber;
    return this;
  }

   /**
   * 用于标识车辆停放车位编号，路侧适用
   * @return spaceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PK001", value = "用于标识车辆停放车位编号，路侧适用")

  public String getSpaceNumber() {
    return spaceNumber;
  }


  public void setSpaceNumber(String spaceNumber) {
    this.spaceNumber = spaceNumber;
  }


  public AlipayEcoMycarParkingExitinfoSyncModel storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 与parking_id对应的外部停车场编号，在门店中维护
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "360xx", value = "与parking_id对应的外部停车场编号，在门店中维护")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
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
   * @return the AlipayEcoMycarParkingExitinfoSyncModel instance itself
   */
  public AlipayEcoMycarParkingExitinfoSyncModel putAdditionalProperty(String key, Object value) {
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
    AlipayEcoMycarParkingExitinfoSyncModel alipayEcoMycarParkingExitinfoSyncModel = (AlipayEcoMycarParkingExitinfoSyncModel) o;
    return Objects.equals(this.actualAmount, alipayEcoMycarParkingExitinfoSyncModel.actualAmount) &&
        Objects.equals(this.carColor, alipayEcoMycarParkingExitinfoSyncModel.carColor) &&
        Objects.equals(this.carNumber, alipayEcoMycarParkingExitinfoSyncModel.carNumber) &&
        Objects.equals(this.discountAmount, alipayEcoMycarParkingExitinfoSyncModel.discountAmount) &&
        Objects.equals(this.exitId, alipayEcoMycarParkingExitinfoSyncModel.exitId) &&
        Objects.equals(this.isEncryptCarNumber, alipayEcoMycarParkingExitinfoSyncModel.isEncryptCarNumber) &&
        Objects.equals(this.isvUrl, alipayEcoMycarParkingExitinfoSyncModel.isvUrl) &&
        Objects.equals(this.orderAmount, alipayEcoMycarParkingExitinfoSyncModel.orderAmount) &&
        Objects.equals(this.outSerialNo, alipayEcoMycarParkingExitinfoSyncModel.outSerialNo) &&
        Objects.equals(this.outTime, alipayEcoMycarParkingExitinfoSyncModel.outTime) &&
        Objects.equals(this.parkingId, alipayEcoMycarParkingExitinfoSyncModel.parkingId) &&
        Objects.equals(this.serialNo, alipayEcoMycarParkingExitinfoSyncModel.serialNo) &&
        Objects.equals(this.spaceNumber, alipayEcoMycarParkingExitinfoSyncModel.spaceNumber) &&
        Objects.equals(this.storeId, alipayEcoMycarParkingExitinfoSyncModel.storeId)&&
        Objects.equals(this.additionalProperties, alipayEcoMycarParkingExitinfoSyncModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualAmount, carColor, carNumber, discountAmount, exitId, isEncryptCarNumber, isvUrl, orderAmount, outSerialNo, outTime, parkingId, serialNo, spaceNumber, storeId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingExitinfoSyncModel {\n");
    sb.append("    actualAmount: ").append(toIndentedString(actualAmount)).append("\n");
    sb.append("    carColor: ").append(toIndentedString(carColor)).append("\n");
    sb.append("    carNumber: ").append(toIndentedString(carNumber)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    exitId: ").append(toIndentedString(exitId)).append("\n");
    sb.append("    isEncryptCarNumber: ").append(toIndentedString(isEncryptCarNumber)).append("\n");
    sb.append("    isvUrl: ").append(toIndentedString(isvUrl)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    outSerialNo: ").append(toIndentedString(outSerialNo)).append("\n");
    sb.append("    outTime: ").append(toIndentedString(outTime)).append("\n");
    sb.append("    parkingId: ").append(toIndentedString(parkingId)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    spaceNumber: ").append(toIndentedString(spaceNumber)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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
    openapiFields.add("actual_amount");
    openapiFields.add("car_color");
    openapiFields.add("car_number");
    openapiFields.add("discount_amount");
    openapiFields.add("exit_id");
    openapiFields.add("is_encrypt_car_number");
    openapiFields.add("isv_url");
    openapiFields.add("order_amount");
    openapiFields.add("out_serial_no");
    openapiFields.add("out_time");
    openapiFields.add("parking_id");
    openapiFields.add("serial_no");
    openapiFields.add("space_number");
    openapiFields.add("store_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingExitinfoSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingExitinfoSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingExitinfoSyncModel is not found in the empty JSON string", AlipayEcoMycarParkingExitinfoSyncModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("actual_amount") != null && !jsonObj.get("actual_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_amount").toString()));
      }
      if (jsonObj.get("car_color") != null && !jsonObj.get("car_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `car_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("car_color").toString()));
      }
      if (jsonObj.get("car_number") != null && !jsonObj.get("car_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `car_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("car_number").toString()));
      }
      if (jsonObj.get("discount_amount") != null && !jsonObj.get("discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_amount").toString()));
      }
      if (jsonObj.get("exit_id") != null && !jsonObj.get("exit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exit_id").toString()));
      }
      if (jsonObj.get("isv_url") != null && !jsonObj.get("isv_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_url").toString()));
      }
      if (jsonObj.get("order_amount") != null && !jsonObj.get("order_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_amount").toString()));
      }
      if (jsonObj.get("out_serial_no") != null && !jsonObj.get("out_serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_serial_no").toString()));
      }
      if (jsonObj.get("out_time") != null && !jsonObj.get("out_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_time").toString()));
      }
      if (jsonObj.get("parking_id") != null && !jsonObj.get("parking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_id").toString()));
      }
      if (jsonObj.get("serial_no") != null && !jsonObj.get("serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_no").toString()));
      }
      if (jsonObj.get("space_number") != null && !jsonObj.get("space_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `space_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("space_number").toString()));
      }
      if (jsonObj.get("store_id") != null && !jsonObj.get("store_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingExitinfoSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingExitinfoSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingExitinfoSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingExitinfoSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingExitinfoSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingExitinfoSyncModel value) throws IOException {
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
           public AlipayEcoMycarParkingExitinfoSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEcoMycarParkingExitinfoSyncModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEcoMycarParkingExitinfoSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingExitinfoSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingExitinfoSyncModel
  */
  public static AlipayEcoMycarParkingExitinfoSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingExitinfoSyncModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingExitinfoSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

