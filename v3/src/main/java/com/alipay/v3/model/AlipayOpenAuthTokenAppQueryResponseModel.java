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
import java.util.ArrayList;
import java.util.List;

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
 * AlipayOpenAuthTokenAppQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAuthTokenAppQueryResponseModel {
  public static final String SERIALIZED_NAME_AUTH_APP_ID = "auth_app_id";
  @SerializedName(SERIALIZED_NAME_AUTH_APP_ID)
  private String authAppId;

  public static final String SERIALIZED_NAME_AUTH_END = "auth_end";
  @SerializedName(SERIALIZED_NAME_AUTH_END)
  private String authEnd;

  public static final String SERIALIZED_NAME_AUTH_METHODS = "auth_methods";
  @SerializedName(SERIALIZED_NAME_AUTH_METHODS)
  private List<String> authMethods = null;

  public static final String SERIALIZED_NAME_AUTH_START = "auth_start";
  @SerializedName(SERIALIZED_NAME_AUTH_START)
  private String authStart;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;

  public static final String SERIALIZED_NAME_IS_BY_APP_AUTH = "is_by_app_auth";
  @SerializedName(SERIALIZED_NAME_IS_BY_APP_AUTH)
  private Boolean isByAppAuth;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayOpenAuthTokenAppQueryResponseModel() { 
  }

  public AlipayOpenAuthTokenAppQueryResponseModel authAppId(String authAppId) {
    
    this.authAppId = authAppId;
    return this;
  }

   /**
   * 授权商户的appid
   * @return authAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013121100055554", value = "授权商户的appid")

  public String getAuthAppId() {
    return authAppId;
  }


  public void setAuthAppId(String authAppId) {
    this.authAppId = authAppId;
  }


  public AlipayOpenAuthTokenAppQueryResponseModel authEnd(String authEnd) {
    
    this.authEnd = authEnd;
    return this;
  }

   /**
   * 授权失效时间
   * @return authEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-11-03 01:59:57", value = "授权失效时间")

  public String getAuthEnd() {
    return authEnd;
  }


  public void setAuthEnd(String authEnd) {
    this.authEnd = authEnd;
  }


  public AlipayOpenAuthTokenAppQueryResponseModel authMethods(List<String> authMethods) {
    
    this.authMethods = authMethods;
    return this;
  }

  public AlipayOpenAuthTokenAppQueryResponseModel addAuthMethodsItem(String authMethodsItem) {
    if (this.authMethods == null) {
      this.authMethods = new ArrayList<>();
    }
    this.authMethods.add(authMethodsItem);
    return this;
  }

   /**
   * 当前app_auth_token的授权接口列表
   * @return authMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"alipay.open.auth.token.app.query\",\"alipay.system.oauth.token\",\"alipay.open.auth.token.app\"", value = "当前app_auth_token的授权接口列表")

  public List<String> getAuthMethods() {
    return authMethods;
  }


  public void setAuthMethods(List<String> authMethods) {
    this.authMethods = authMethods;
  }


  public AlipayOpenAuthTokenAppQueryResponseModel authStart(String authStart) {
    
    this.authStart = authStart;
    return this;
  }

   /**
   * 授权生效时间
   * @return authStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-11-03 01:59:57", value = "授权生效时间")

  public String getAuthStart() {
    return authStart;
  }


  public void setAuthStart(String authStart) {
    this.authStart = authStart;
  }


  public AlipayOpenAuthTokenAppQueryResponseModel expiresIn(Integer expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * 应用授权令牌失效时间，单位到秒
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31536000", value = "应用授权令牌失效时间，单位到秒")

  public Integer getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  public AlipayOpenAuthTokenAppQueryResponseModel isByAppAuth(Boolean isByAppAuth) {
    
    this.isByAppAuth = isByAppAuth;
    return this;
  }

   /**
   * 当商家选择全权委托授权时值为true，未选择时为false。
   * @return isByAppAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "当商家选择全权委托授权时值为true，未选择时为false。")

  public Boolean getIsByAppAuth() {
    return isByAppAuth;
  }


  public void setIsByAppAuth(Boolean isByAppAuth) {
    this.isByAppAuth = isByAppAuth;
  }


  public AlipayOpenAuthTokenAppQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * valid：有效状态；invalid：无效状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "valid", value = "valid：有效状态；invalid：无效状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenAuthTokenAppQueryResponseModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 授权商户的user_id
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102150527498", value = "授权商户的user_id")

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
   * @return the AlipayOpenAuthTokenAppQueryResponseModel instance itself
   */
  public AlipayOpenAuthTokenAppQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenAuthTokenAppQueryResponseModel alipayOpenAuthTokenAppQueryResponseModel = (AlipayOpenAuthTokenAppQueryResponseModel) o;
    return Objects.equals(this.authAppId, alipayOpenAuthTokenAppQueryResponseModel.authAppId) &&
        Objects.equals(this.authEnd, alipayOpenAuthTokenAppQueryResponseModel.authEnd) &&
        Objects.equals(this.authMethods, alipayOpenAuthTokenAppQueryResponseModel.authMethods) &&
        Objects.equals(this.authStart, alipayOpenAuthTokenAppQueryResponseModel.authStart) &&
        Objects.equals(this.expiresIn, alipayOpenAuthTokenAppQueryResponseModel.expiresIn) &&
        Objects.equals(this.isByAppAuth, alipayOpenAuthTokenAppQueryResponseModel.isByAppAuth) &&
        Objects.equals(this.status, alipayOpenAuthTokenAppQueryResponseModel.status) &&
        Objects.equals(this.userId, alipayOpenAuthTokenAppQueryResponseModel.userId)&&
        Objects.equals(this.additionalProperties, alipayOpenAuthTokenAppQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authAppId, authEnd, authMethods, authStart, expiresIn, isByAppAuth, status, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAuthTokenAppQueryResponseModel {\n");
    sb.append("    authAppId: ").append(toIndentedString(authAppId)).append("\n");
    sb.append("    authEnd: ").append(toIndentedString(authEnd)).append("\n");
    sb.append("    authMethods: ").append(toIndentedString(authMethods)).append("\n");
    sb.append("    authStart: ").append(toIndentedString(authStart)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    isByAppAuth: ").append(toIndentedString(isByAppAuth)).append("\n");
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
    openapiFields.add("auth_app_id");
    openapiFields.add("auth_end");
    openapiFields.add("auth_methods");
    openapiFields.add("auth_start");
    openapiFields.add("expires_in");
    openapiFields.add("is_by_app_auth");
    openapiFields.add("status");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAuthTokenAppQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAuthTokenAppQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAuthTokenAppQueryResponseModel is not found in the empty JSON string", AlipayOpenAuthTokenAppQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("auth_app_id") != null && !jsonObj.get("auth_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_app_id").toString()));
      }
      if (jsonObj.get("auth_end") != null && !jsonObj.get("auth_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_end").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("auth_methods") != null && !jsonObj.get("auth_methods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_methods` to be an array in the JSON string but got `%s`", jsonObj.get("auth_methods").toString()));
      }
      if (jsonObj.get("auth_start") != null && !jsonObj.get("auth_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_start").toString()));
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
       if (!AlipayOpenAuthTokenAppQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAuthTokenAppQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAuthTokenAppQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAuthTokenAppQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAuthTokenAppQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAuthTokenAppQueryResponseModel value) throws IOException {
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
           public AlipayOpenAuthTokenAppQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAuthTokenAppQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenAuthTokenAppQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAuthTokenAppQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAuthTokenAppQueryResponseModel
  */
  public static AlipayOpenAuthTokenAppQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAuthTokenAppQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAuthTokenAppQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

