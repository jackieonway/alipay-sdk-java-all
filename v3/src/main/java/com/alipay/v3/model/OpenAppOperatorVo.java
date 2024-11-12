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
 * OpenAppOperatorVo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenAppOperatorVo {
  public static final String SERIALIZED_NAME_LOGON_ID = "logon_id";
  @SerializedName(SERIALIZED_NAME_LOGON_ID)
  private String logonId;

  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName;

  public static final String SERIALIZED_NAME_PORTRAIT = "portrait";
  @SerializedName(SERIALIZED_NAME_PORTRAIT)
  private String portrait;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public OpenAppOperatorVo() { 
  }

  public OpenAppOperatorVo logonId(String logonId) {
    
    this.logonId = logonId;
    return this;
  }

   /**
   * 登录账号
   * @return logonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "登录账号", value = "登录账号")

  public String getLogonId() {
    return logonId;
  }


  public void setLogonId(String logonId) {
    this.logonId = logonId;
  }


  public OpenAppOperatorVo nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * 昵称
   * @return nickName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "昵称")

  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public OpenAppOperatorVo portrait(String portrait) {
    
    this.portrait = portrait;
    return this;
  }

   /**
   * 用户头像
   * @return portrait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "htpt://_****", value = "用户头像")

  public String getPortrait() {
    return portrait;
  }


  public void setPortrait(String portrait) {
    this.portrait = portrait;
  }


  public OpenAppOperatorVo role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 角色
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPERATOR", value = "角色")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public OpenAppOperatorVo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VALID", value = "状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public OpenAppOperatorVo userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户Id
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "用户Id", value = "用户Id")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
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
   * @return the OpenAppOperatorVo instance itself
   */
  public OpenAppOperatorVo putAdditionalProperty(String key, Object value) {
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
    OpenAppOperatorVo openAppOperatorVo = (OpenAppOperatorVo) o;
    return Objects.equals(this.logonId, openAppOperatorVo.logonId) &&
        Objects.equals(this.nickName, openAppOperatorVo.nickName) &&
        Objects.equals(this.portrait, openAppOperatorVo.portrait) &&
        Objects.equals(this.role, openAppOperatorVo.role) &&
        Objects.equals(this.status, openAppOperatorVo.status) &&
        Objects.equals(this.userId, openAppOperatorVo.userId)&&
        Objects.equals(this.additionalProperties, openAppOperatorVo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logonId, nickName, portrait, role, status, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAppOperatorVo {\n");
    sb.append("    logonId: ").append(toIndentedString(logonId)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    portrait: ").append(toIndentedString(portrait)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("logon_id");
    openapiFields.add("nick_name");
    openapiFields.add("portrait");
    openapiFields.add("role");
    openapiFields.add("status");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OpenAppOperatorVo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OpenAppOperatorVo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenAppOperatorVo is not found in the empty JSON string", OpenAppOperatorVo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("logon_id") != null && !jsonObj.get("logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logon_id").toString()));
      }
      if (jsonObj.get("nick_name") != null && !jsonObj.get("nick_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nick_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nick_name").toString()));
      }
      if (jsonObj.get("portrait") != null && !jsonObj.get("portrait").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portrait` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portrait").toString()));
      }
      if (jsonObj.get("role") != null && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenAppOperatorVo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenAppOperatorVo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenAppOperatorVo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenAppOperatorVo.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenAppOperatorVo>() {
           @Override
           public void write(JsonWriter out, OpenAppOperatorVo value) throws IOException {
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
           public OpenAppOperatorVo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OpenAppOperatorVo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OpenAppOperatorVo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenAppOperatorVo
  * @throws IOException if the JSON string is invalid with respect to OpenAppOperatorVo
  */
  public static OpenAppOperatorVo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenAppOperatorVo.class);
  }

 /**
  * Convert an instance of OpenAppOperatorVo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

