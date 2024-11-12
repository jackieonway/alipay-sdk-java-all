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
 * AlipayCommerceEcEmployeeAddResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcEmployeeAddResponseModel {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_IOT_UNIQUE_ID = "iot_unique_id";
  @SerializedName(SERIALIZED_NAME_IOT_UNIQUE_ID)
  private String iotUniqueId;

  public static final String SERIALIZED_NAME_SHARE_CODE = "share_code";
  @SerializedName(SERIALIZED_NAME_SHARE_CODE)
  private String shareCode;

  public static final String SERIALIZED_NAME_SIGN_URL = "sign_url";
  @SerializedName(SERIALIZED_NAME_SIGN_URL)
  private String signUrl;

  public AlipayCommerceEcEmployeeAddResponseModel() { 
  }

  public AlipayCommerceEcEmployeeAddResponseModel employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 企业码生成的员工ID
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2288033000090876", value = "企业码生成的员工ID")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public AlipayCommerceEcEmployeeAddResponseModel iotUniqueId(String iotUniqueId) {
    
    this.iotUniqueId = iotUniqueId;
    return this;
  }

   /**
   * 员工开通IOT企业刷脸付的唯一流水号
   * @return iotUniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3444950005320032", value = "员工开通IOT企业刷脸付的唯一流水号")

  public String getIotUniqueId() {
    return iotUniqueId;
  }


  public void setIotUniqueId(String iotUniqueId) {
    this.iotUniqueId = iotUniqueId;
  }


  public AlipayCommerceEcEmployeeAddResponseModel shareCode(String shareCode) {
    
    this.shareCode = shareCode;
    return this;
  }

   /**
   * 员工签约激活吱口令
   * @return shareCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://xxxxx，或复制此消息打开吱搜索，加入企业码，使用企业应公付", value = "员工签约激活吱口令")

  public String getShareCode() {
    return shareCode;
  }


  public void setShareCode(String shareCode) {
    this.shareCode = shareCode;
  }


  public AlipayCommerceEcEmployeeAddResponseModel signUrl(String signUrl) {
    
    this.signUrl = signUrl;
    return this;
  }

   /**
   * 员工签约激活页面链接
   * @return signUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://ur.alipay.com/3I2tPbLkAiktIoqe2dseZUzT", value = "员工签约激活页面链接")

  public String getSignUrl() {
    return signUrl;
  }


  public void setSignUrl(String signUrl) {
    this.signUrl = signUrl;
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
   * @return the AlipayCommerceEcEmployeeAddResponseModel instance itself
   */
  public AlipayCommerceEcEmployeeAddResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceEcEmployeeAddResponseModel alipayCommerceEcEmployeeAddResponseModel = (AlipayCommerceEcEmployeeAddResponseModel) o;
    return Objects.equals(this.employeeId, alipayCommerceEcEmployeeAddResponseModel.employeeId) &&
        Objects.equals(this.iotUniqueId, alipayCommerceEcEmployeeAddResponseModel.iotUniqueId) &&
        Objects.equals(this.shareCode, alipayCommerceEcEmployeeAddResponseModel.shareCode) &&
        Objects.equals(this.signUrl, alipayCommerceEcEmployeeAddResponseModel.signUrl)&&
        Objects.equals(this.additionalProperties, alipayCommerceEcEmployeeAddResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, iotUniqueId, shareCode, signUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcEmployeeAddResponseModel {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    iotUniqueId: ").append(toIndentedString(iotUniqueId)).append("\n");
    sb.append("    shareCode: ").append(toIndentedString(shareCode)).append("\n");
    sb.append("    signUrl: ").append(toIndentedString(signUrl)).append("\n");
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
    openapiFields.add("employee_id");
    openapiFields.add("iot_unique_id");
    openapiFields.add("share_code");
    openapiFields.add("sign_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcEmployeeAddResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcEmployeeAddResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcEmployeeAddResponseModel is not found in the empty JSON string", AlipayCommerceEcEmployeeAddResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("iot_unique_id") != null && !jsonObj.get("iot_unique_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iot_unique_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iot_unique_id").toString()));
      }
      if (jsonObj.get("share_code") != null && !jsonObj.get("share_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `share_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("share_code").toString()));
      }
      if (jsonObj.get("sign_url") != null && !jsonObj.get("sign_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcEmployeeAddResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcEmployeeAddResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcEmployeeAddResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcEmployeeAddResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcEmployeeAddResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcEmployeeAddResponseModel value) throws IOException {
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
           public AlipayCommerceEcEmployeeAddResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceEcEmployeeAddResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceEcEmployeeAddResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcEmployeeAddResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcEmployeeAddResponseModel
  */
  public static AlipayCommerceEcEmployeeAddResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcEmployeeAddResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcEmployeeAddResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

