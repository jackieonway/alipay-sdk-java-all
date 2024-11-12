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
 * AlipayEcoMycarParkingEnterinfoSyncResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingEnterinfoSyncResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_SCENE = "agreement_scene";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_SCENE)
  private String agreementScene;

  public static final String SERIALIZED_NAME_AGREEMENT_STATUS = "agreement_status";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_STATUS)
  private String agreementStatus;

  public static final String SERIALIZED_NAME_CAR_STATUS = "car_status";
  @SerializedName(SERIALIZED_NAME_CAR_STATUS)
  private String carStatus;

  public static final String SERIALIZED_NAME_CURRENT_TIME = "current_time";
  @SerializedName(SERIALIZED_NAME_CURRENT_TIME)
  private String currentTime;

  public static final String SERIALIZED_NAME_SERIAL_NO = "serial_no";
  @SerializedName(SERIALIZED_NAME_SERIAL_NO)
  private String serialNo;

  public AlipayEcoMycarParkingEnterinfoSyncResponseModel() { 
  }

  public AlipayEcoMycarParkingEnterinfoSyncResponseModel agreementScene(String agreementScene) {
    
    this.agreementScene = agreementScene;
    return this;
  }

   /**
   * 用户签约的代扣场景字符集，多个英文逗号分割，当车场为ORC识别车牌的场景，返回值包含PLATE_PAY时，表示代扣协议可用。 当车场为ETC设备识别车牌，返回值包含ETC_PAY时表示协议可用。当用户未签约任何代扣场景时返回NO_AGREEMENT_SCENE
   * @return agreementScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PLATE_PAY,ETC_PAY", value = "用户签约的代扣场景字符集，多个英文逗号分割，当车场为ORC识别车牌的场景，返回值包含PLATE_PAY时，表示代扣协议可用。 当车场为ETC设备识别车牌，返回值包含ETC_PAY时表示协议可用。当用户未签约任何代扣场景时返回NO_AGREEMENT_SCENE")

  public String getAgreementScene() {
    return agreementScene;
  }


  public void setAgreementScene(String agreementScene) {
    this.agreementScene = agreementScene;
  }


  public AlipayEcoMycarParkingEnterinfoSyncResponseModel agreementStatus(String agreementStatus) {
    
    this.agreementStatus = agreementStatus;
    return this;
  }

   /**
   * 该字段已废弃,请使用agreement_scene字段
   * @return agreementStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0：已签约无感代扣 1：未签约", value = "该字段已废弃,请使用agreement_scene字段")

  public String getAgreementStatus() {
    return agreementStatus;
  }


  public void setAgreementStatus(String agreementStatus) {
    this.agreementStatus = agreementStatus;
  }


  public AlipayEcoMycarParkingEnterinfoSyncResponseModel carStatus(String carStatus) {
    
    this.carStatus = carStatus;
    return this;
  }

   /**
   * 当前车辆在支付宝侧的信息，是否可以使用无感支付，可选返回项为： NORMAL：正常缴费用户 NON-SENSE-PAY：可无感支付用户
   * @return carStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL", value = "当前车辆在支付宝侧的信息，是否可以使用无感支付，可选返回项为： NORMAL：正常缴费用户 NON-SENSE-PAY：可无感支付用户")

  public String getCarStatus() {
    return carStatus;
  }


  public void setCarStatus(String carStatus) {
    this.carStatus = carStatus;
  }


  public AlipayEcoMycarParkingEnterinfoSyncResponseModel currentTime(String currentTime) {
    
    this.currentTime = currentTime;
    return this;
  }

   /**
   * 当前时间戳(查询签约状态和是否支持无感支付仅代表当前时间点查询结果，不作为最后代扣结果，应在发起代扣前再次查询)
   * @return currentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-27 15:40:00", value = "当前时间戳(查询签约状态和是否支持无感支付仅代表当前时间点查询结果，不作为最后代扣结果，应在发起代扣前再次查询)")

  public String getCurrentTime() {
    return currentTime;
  }


  public void setCurrentTime(String currentTime) {
    this.currentTime = currentTime;
  }


  public AlipayEcoMycarParkingEnterinfoSyncResponseModel serialNo(String serialNo) {
    
    this.serialNo = serialNo;
    return this;
  }

   /**
   * 支付宝业务流水号，用于记录车辆从驶入到驶出的全流程
   * @return serialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090711003017233600000001", value = "支付宝业务流水号，用于记录车辆从驶入到驶出的全流程")

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
   * @return the AlipayEcoMycarParkingEnterinfoSyncResponseModel instance itself
   */
  public AlipayEcoMycarParkingEnterinfoSyncResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayEcoMycarParkingEnterinfoSyncResponseModel alipayEcoMycarParkingEnterinfoSyncResponseModel = (AlipayEcoMycarParkingEnterinfoSyncResponseModel) o;
    return Objects.equals(this.agreementScene, alipayEcoMycarParkingEnterinfoSyncResponseModel.agreementScene) &&
        Objects.equals(this.agreementStatus, alipayEcoMycarParkingEnterinfoSyncResponseModel.agreementStatus) &&
        Objects.equals(this.carStatus, alipayEcoMycarParkingEnterinfoSyncResponseModel.carStatus) &&
        Objects.equals(this.currentTime, alipayEcoMycarParkingEnterinfoSyncResponseModel.currentTime) &&
        Objects.equals(this.serialNo, alipayEcoMycarParkingEnterinfoSyncResponseModel.serialNo)&&
        Objects.equals(this.additionalProperties, alipayEcoMycarParkingEnterinfoSyncResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementScene, agreementStatus, carStatus, currentTime, serialNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingEnterinfoSyncResponseModel {\n");
    sb.append("    agreementScene: ").append(toIndentedString(agreementScene)).append("\n");
    sb.append("    agreementStatus: ").append(toIndentedString(agreementStatus)).append("\n");
    sb.append("    carStatus: ").append(toIndentedString(carStatus)).append("\n");
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
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
    openapiFields.add("agreement_scene");
    openapiFields.add("agreement_status");
    openapiFields.add("car_status");
    openapiFields.add("current_time");
    openapiFields.add("serial_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingEnterinfoSyncResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingEnterinfoSyncResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingEnterinfoSyncResponseModel is not found in the empty JSON string", AlipayEcoMycarParkingEnterinfoSyncResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agreement_scene") != null && !jsonObj.get("agreement_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_scene").toString()));
      }
      if (jsonObj.get("agreement_status") != null && !jsonObj.get("agreement_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_status").toString()));
      }
      if (jsonObj.get("car_status") != null && !jsonObj.get("car_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `car_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("car_status").toString()));
      }
      if (jsonObj.get("current_time") != null && !jsonObj.get("current_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_time").toString()));
      }
      if (jsonObj.get("serial_no") != null && !jsonObj.get("serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingEnterinfoSyncResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingEnterinfoSyncResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingEnterinfoSyncResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingEnterinfoSyncResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingEnterinfoSyncResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingEnterinfoSyncResponseModel value) throws IOException {
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
           public AlipayEcoMycarParkingEnterinfoSyncResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEcoMycarParkingEnterinfoSyncResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEcoMycarParkingEnterinfoSyncResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingEnterinfoSyncResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingEnterinfoSyncResponseModel
  */
  public static AlipayEcoMycarParkingEnterinfoSyncResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingEnterinfoSyncResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingEnterinfoSyncResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

