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
 * AppTokenExchangeSubElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppTokenExchangeSubElement {
  public static final String SERIALIZED_NAME_APP_AUTH_TOKEN = "app_auth_token";
  @SerializedName(SERIALIZED_NAME_APP_AUTH_TOKEN)
  private String appAuthToken;

  public static final String SERIALIZED_NAME_APP_REFRESH_TOKEN = "app_refresh_token";
  @SerializedName(SERIALIZED_NAME_APP_REFRESH_TOKEN)
  private String appRefreshToken;

  public static final String SERIALIZED_NAME_AUTH_APP_ID = "auth_app_id";
  @SerializedName(SERIALIZED_NAME_AUTH_APP_ID)
  private String authAppId;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private String expiresIn;

  public static final String SERIALIZED_NAME_RE_EXPIRES_IN = "re_expires_in";
  @SerializedName(SERIALIZED_NAME_RE_EXPIRES_IN)
  private String reExpiresIn;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AppTokenExchangeSubElement() { 
  }

  public AppTokenExchangeSubElement appAuthToken(String appAuthToken) {
    
    this.appAuthToken = appAuthToken;
    return this;
  }

   /**
   * 应用授权令牌
   * @return appAuthToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201509BBeff9351ad1874306903e96b91d248A36", value = "应用授权令牌")

  public String getAppAuthToken() {
    return appAuthToken;
  }


  public void setAppAuthToken(String appAuthToken) {
    this.appAuthToken = appAuthToken;
  }


  public AppTokenExchangeSubElement appRefreshToken(String appRefreshToken) {
    
    this.appRefreshToken = appRefreshToken;
    return this;
  }

   /**
   * 刷新令牌
   * @return appRefreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201509BBdcba1e3347de4e75ba3fed2c9abebE36", value = "刷新令牌")

  public String getAppRefreshToken() {
    return appRefreshToken;
  }


  public void setAppRefreshToken(String appRefreshToken) {
    this.appRefreshToken = appRefreshToken;
  }


  public AppTokenExchangeSubElement authAppId(String authAppId) {
    
    this.authAppId = authAppId;
    return this;
  }

   /**
   * 授权商户appid
   * @return authAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013121100055554", value = "授权商户appid")

  public String getAuthAppId() {
    return authAppId;
  }


  public void setAuthAppId(String authAppId) {
    this.authAppId = authAppId;
  }


  public AppTokenExchangeSubElement expiresIn(String expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * 过期时间，单位为秒
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "过期时间，单位为秒")

  public String getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }


  public AppTokenExchangeSubElement reExpiresIn(String reExpiresIn) {
    
    this.reExpiresIn = reExpiresIn;
    return this;
  }

   /**
   * 刷新令牌过期时间，单位为秒
   * @return reExpiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "刷新令牌过期时间，单位为秒")

  public String getReExpiresIn() {
    return reExpiresIn;
  }


  public void setReExpiresIn(String reExpiresIn) {
    this.reExpiresIn = reExpiresIn;
  }


  public AppTokenExchangeSubElement userId(String userId) {
    
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
   * @return the AppTokenExchangeSubElement instance itself
   */
  public AppTokenExchangeSubElement putAdditionalProperty(String key, Object value) {
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
    AppTokenExchangeSubElement appTokenExchangeSubElement = (AppTokenExchangeSubElement) o;
    return Objects.equals(this.appAuthToken, appTokenExchangeSubElement.appAuthToken) &&
        Objects.equals(this.appRefreshToken, appTokenExchangeSubElement.appRefreshToken) &&
        Objects.equals(this.authAppId, appTokenExchangeSubElement.authAppId) &&
        Objects.equals(this.expiresIn, appTokenExchangeSubElement.expiresIn) &&
        Objects.equals(this.reExpiresIn, appTokenExchangeSubElement.reExpiresIn) &&
        Objects.equals(this.userId, appTokenExchangeSubElement.userId)&&
        Objects.equals(this.additionalProperties, appTokenExchangeSubElement.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appAuthToken, appRefreshToken, authAppId, expiresIn, reExpiresIn, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppTokenExchangeSubElement {\n");
    sb.append("    appAuthToken: ").append(toIndentedString(appAuthToken)).append("\n");
    sb.append("    appRefreshToken: ").append(toIndentedString(appRefreshToken)).append("\n");
    sb.append("    authAppId: ").append(toIndentedString(authAppId)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    reExpiresIn: ").append(toIndentedString(reExpiresIn)).append("\n");
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
    openapiFields.add("app_auth_token");
    openapiFields.add("app_refresh_token");
    openapiFields.add("auth_app_id");
    openapiFields.add("expires_in");
    openapiFields.add("re_expires_in");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppTokenExchangeSubElement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AppTokenExchangeSubElement.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppTokenExchangeSubElement is not found in the empty JSON string", AppTokenExchangeSubElement.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("app_auth_token") != null && !jsonObj.get("app_auth_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_auth_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_auth_token").toString()));
      }
      if (jsonObj.get("app_refresh_token") != null && !jsonObj.get("app_refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_refresh_token").toString()));
      }
      if (jsonObj.get("auth_app_id") != null && !jsonObj.get("auth_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_app_id").toString()));
      }
      if (jsonObj.get("expires_in") != null && !jsonObj.get("expires_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_in").toString()));
      }
      if (jsonObj.get("re_expires_in") != null && !jsonObj.get("re_expires_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `re_expires_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("re_expires_in").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppTokenExchangeSubElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppTokenExchangeSubElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppTokenExchangeSubElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppTokenExchangeSubElement.class));

       return (TypeAdapter<T>) new TypeAdapter<AppTokenExchangeSubElement>() {
           @Override
           public void write(JsonWriter out, AppTokenExchangeSubElement value) throws IOException {
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
           public AppTokenExchangeSubElement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AppTokenExchangeSubElement instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AppTokenExchangeSubElement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppTokenExchangeSubElement
  * @throws IOException if the JSON string is invalid with respect to AppTokenExchangeSubElement
  */
  public static AppTokenExchangeSubElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppTokenExchangeSubElement.class);
  }

 /**
  * Convert an instance of AppTokenExchangeSubElement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

