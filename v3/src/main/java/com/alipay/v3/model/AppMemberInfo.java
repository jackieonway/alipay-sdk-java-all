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
 * AppMemberInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppMemberInfo {
  public static final String SERIALIZED_NAME_GMT_INVITE = "gmt_invite";
  @SerializedName(SERIALIZED_NAME_GMT_INVITE)
  private String gmtInvite;

  public static final String SERIALIZED_NAME_GMT_JOIN = "gmt_join";
  @SerializedName(SERIALIZED_NAME_GMT_JOIN)
  private String gmtJoin;

  public static final String SERIALIZED_NAME_LOGON_ID = "logon_id";
  @SerializedName(SERIALIZED_NAME_LOGON_ID)
  private String logonId;

  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

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

  public AppMemberInfo() { 
  }

  public AppMemberInfo gmtInvite(String gmtInvite) {
    
    this.gmtInvite = gmtInvite;
    return this;
  }

   /**
   * 邀请时间，格式为yyyy-MM-dd HH:mm:ss
   * @return gmtInvite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-09-08 12:00:00", value = "邀请时间，格式为yyyy-MM-dd HH:mm:ss")

  public String getGmtInvite() {
    return gmtInvite;
  }


  public void setGmtInvite(String gmtInvite) {
    this.gmtInvite = gmtInvite;
  }


  public AppMemberInfo gmtJoin(String gmtJoin) {
    
    this.gmtJoin = gmtJoin;
    return this;
  }

   /**
   * 加入时间，格式为yyyy-MM-dd
   * @return gmtJoin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-08-12", value = "加入时间，格式为yyyy-MM-dd")

  public String getGmtJoin() {
    return gmtJoin;
  }


  public void setGmtJoin(String gmtJoin) {
    this.gmtJoin = gmtJoin;
  }


  public AppMemberInfo logonId(String logonId) {
    
    this.logonId = logonId;
    return this;
  }

   /**
   * 支付宝登录账号
   * @return logonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test***@example.com", value = "支付宝登录账号")

  public String getLogonId() {
    return logonId;
  }


  public void setLogonId(String logonId) {
    this.logonId = logonId;
  }


  public AppMemberInfo nickName(String nickName) {
    
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


  public AppMemberInfo openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户openId
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户openId")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AppMemberInfo portrait(String portrait) {
    
    this.portrait = portrait;
    return this;
  }

   /**
   * 头像地址fileId(完整地址需自行拼接)
   * @return portrait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAA-AAAAAAAAA", value = "头像地址fileId(完整地址需自行拼接)")

  public String getPortrait() {
    return portrait;
  }


  public void setPortrait(String portrait) {
    this.portrait = portrait;
  }


  public AppMemberInfo role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 角色类型
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEVELOPER", value = "角色类型")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public AppMemberInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 成员的状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VALID", value = "成员的状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AppMemberInfo userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 支付宝用户id
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "208822294389xxxx", value = "支付宝用户id")

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
   * @return the AppMemberInfo instance itself
   */
  public AppMemberInfo putAdditionalProperty(String key, Object value) {
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
    AppMemberInfo appMemberInfo = (AppMemberInfo) o;
    return Objects.equals(this.gmtInvite, appMemberInfo.gmtInvite) &&
        Objects.equals(this.gmtJoin, appMemberInfo.gmtJoin) &&
        Objects.equals(this.logonId, appMemberInfo.logonId) &&
        Objects.equals(this.nickName, appMemberInfo.nickName) &&
        Objects.equals(this.openId, appMemberInfo.openId) &&
        Objects.equals(this.portrait, appMemberInfo.portrait) &&
        Objects.equals(this.role, appMemberInfo.role) &&
        Objects.equals(this.status, appMemberInfo.status) &&
        Objects.equals(this.userId, appMemberInfo.userId)&&
        Objects.equals(this.additionalProperties, appMemberInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmtInvite, gmtJoin, logonId, nickName, openId, portrait, role, status, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppMemberInfo {\n");
    sb.append("    gmtInvite: ").append(toIndentedString(gmtInvite)).append("\n");
    sb.append("    gmtJoin: ").append(toIndentedString(gmtJoin)).append("\n");
    sb.append("    logonId: ").append(toIndentedString(logonId)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
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
    openapiFields.add("gmt_invite");
    openapiFields.add("gmt_join");
    openapiFields.add("logon_id");
    openapiFields.add("nick_name");
    openapiFields.add("open_id");
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
  * @throws IOException if the JSON Object is invalid with respect to AppMemberInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AppMemberInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppMemberInfo is not found in the empty JSON string", AppMemberInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("gmt_invite") != null && !jsonObj.get("gmt_invite").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_invite` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_invite").toString()));
      }
      if (jsonObj.get("gmt_join") != null && !jsonObj.get("gmt_join").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_join` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_join").toString()));
      }
      if (jsonObj.get("logon_id") != null && !jsonObj.get("logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logon_id").toString()));
      }
      if (jsonObj.get("nick_name") != null && !jsonObj.get("nick_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nick_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nick_name").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
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
       if (!AppMemberInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppMemberInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppMemberInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppMemberInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppMemberInfo>() {
           @Override
           public void write(JsonWriter out, AppMemberInfo value) throws IOException {
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
           public AppMemberInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AppMemberInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AppMemberInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppMemberInfo
  * @throws IOException if the JSON string is invalid with respect to AppMemberInfo
  */
  public static AppMemberInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppMemberInfo.class);
  }

 /**
  * Convert an instance of AppMemberInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

