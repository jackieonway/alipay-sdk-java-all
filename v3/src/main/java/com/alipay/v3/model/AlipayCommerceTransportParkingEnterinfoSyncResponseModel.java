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
 * AlipayCommerceTransportParkingEnterinfoSyncResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceTransportParkingEnterinfoSyncResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_SCENE = "agreement_scene";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_SCENE)
  private String agreementScene;

  public static final String SERIALIZED_NAME_BIZ_CODE = "biz_code";
  @SerializedName(SERIALIZED_NAME_BIZ_CODE)
  private String bizCode;

  public static final String SERIALIZED_NAME_BIZ_MSG = "biz_msg";
  @SerializedName(SERIALIZED_NAME_BIZ_MSG)
  private String bizMsg;

  public static final String SERIALIZED_NAME_SERIAL_NO = "serial_no";
  @SerializedName(SERIALIZED_NAME_SERIAL_NO)
  private String serialNo;

  public AlipayCommerceTransportParkingEnterinfoSyncResponseModel() { 
  }

  public AlipayCommerceTransportParkingEnterinfoSyncResponseModel agreementScene(String agreementScene) {
    
    this.agreementScene = agreementScene;
    return this;
  }

   /**
   * 用户签约的代扣场景字符集，多个英文逗号分割，当车场为ORC识别车牌的场景，返回值包含PLATE_PAY时，表示代扣协议可用。 当车场为ETC设备识别车牌，返回值包含ETC_PAY时表示协议可用。当用户未签约任何代扣场景时返回NO_AGREEMENT_SCENE
   * @return agreementScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PLATE_PAY", value = "用户签约的代扣场景字符集，多个英文逗号分割，当车场为ORC识别车牌的场景，返回值包含PLATE_PAY时，表示代扣协议可用。 当车场为ETC设备识别车牌，返回值包含ETC_PAY时表示协议可用。当用户未签约任何代扣场景时返回NO_AGREEMENT_SCENE")

  public String getAgreementScene() {
    return agreementScene;
  }


  public void setAgreementScene(String agreementScene) {
    this.agreementScene = agreementScene;
  }


  public AlipayCommerceTransportParkingEnterinfoSyncResponseModel bizCode(String bizCode) {
    
    this.bizCode = bizCode;
    return this;
  }

   /**
   * 具体错误code
   * @return bizCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INVALID_PARAMETER", value = "具体错误code")

  public String getBizCode() {
    return bizCode;
  }


  public void setBizCode(String bizCode) {
    this.bizCode = bizCode;
  }


  public AlipayCommerceTransportParkingEnterinfoSyncResponseModel bizMsg(String bizMsg) {
    
    this.bizMsg = bizMsg;
    return this;
  }

   /**
   * 具体错误描述
   * @return bizMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "车牌不合法", value = "具体错误描述")

  public String getBizMsg() {
    return bizMsg;
  }


  public void setBizMsg(String bizMsg) {
    this.bizMsg = bizMsg;
  }


  public AlipayCommerceTransportParkingEnterinfoSyncResponseModel serialNo(String serialNo) {
    
    this.serialNo = serialNo;
    return this;
  }

   /**
   * 支付宝停车纪录流水号，串联一次停车行为；
   * @return serialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2024xxxxxxxxxxxx9292", value = "支付宝停车纪录流水号，串联一次停车行为；")

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
   * @return the AlipayCommerceTransportParkingEnterinfoSyncResponseModel instance itself
   */
  public AlipayCommerceTransportParkingEnterinfoSyncResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceTransportParkingEnterinfoSyncResponseModel alipayCommerceTransportParkingEnterinfoSyncResponseModel = (AlipayCommerceTransportParkingEnterinfoSyncResponseModel) o;
    return Objects.equals(this.agreementScene, alipayCommerceTransportParkingEnterinfoSyncResponseModel.agreementScene) &&
        Objects.equals(this.bizCode, alipayCommerceTransportParkingEnterinfoSyncResponseModel.bizCode) &&
        Objects.equals(this.bizMsg, alipayCommerceTransportParkingEnterinfoSyncResponseModel.bizMsg) &&
        Objects.equals(this.serialNo, alipayCommerceTransportParkingEnterinfoSyncResponseModel.serialNo)&&
        Objects.equals(this.additionalProperties, alipayCommerceTransportParkingEnterinfoSyncResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementScene, bizCode, bizMsg, serialNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceTransportParkingEnterinfoSyncResponseModel {\n");
    sb.append("    agreementScene: ").append(toIndentedString(agreementScene)).append("\n");
    sb.append("    bizCode: ").append(toIndentedString(bizCode)).append("\n");
    sb.append("    bizMsg: ").append(toIndentedString(bizMsg)).append("\n");
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
    openapiFields.add("biz_code");
    openapiFields.add("biz_msg");
    openapiFields.add("serial_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceTransportParkingEnterinfoSyncResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceTransportParkingEnterinfoSyncResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceTransportParkingEnterinfoSyncResponseModel is not found in the empty JSON string", AlipayCommerceTransportParkingEnterinfoSyncResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agreement_scene") != null && !jsonObj.get("agreement_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_scene").toString()));
      }
      if (jsonObj.get("biz_code") != null && !jsonObj.get("biz_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_code").toString()));
      }
      if (jsonObj.get("biz_msg") != null && !jsonObj.get("biz_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_msg").toString()));
      }
      if (jsonObj.get("serial_no") != null && !jsonObj.get("serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceTransportParkingEnterinfoSyncResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceTransportParkingEnterinfoSyncResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceTransportParkingEnterinfoSyncResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceTransportParkingEnterinfoSyncResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceTransportParkingEnterinfoSyncResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceTransportParkingEnterinfoSyncResponseModel value) throws IOException {
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
           public AlipayCommerceTransportParkingEnterinfoSyncResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceTransportParkingEnterinfoSyncResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceTransportParkingEnterinfoSyncResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceTransportParkingEnterinfoSyncResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceTransportParkingEnterinfoSyncResponseModel
  */
  public static AlipayCommerceTransportParkingEnterinfoSyncResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceTransportParkingEnterinfoSyncResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceTransportParkingEnterinfoSyncResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

