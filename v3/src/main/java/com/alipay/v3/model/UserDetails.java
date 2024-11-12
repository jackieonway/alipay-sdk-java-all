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
 * UserDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserDetails {
  public static final String SERIALIZED_NAME_USER_CHANGE_MOBILE = "user_change_mobile";
  @SerializedName(SERIALIZED_NAME_USER_CHANGE_MOBILE)
  private String userChangeMobile;

  public static final String SERIALIZED_NAME_USER_MOBILE = "user_mobile";
  @SerializedName(SERIALIZED_NAME_USER_MOBILE)
  private String userMobile;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_USER_RELATION = "user_relation";
  @SerializedName(SERIALIZED_NAME_USER_RELATION)
  private String userRelation;

  public UserDetails() { 
  }

  public UserDetails userChangeMobile(String userChangeMobile) {
    
    this.userChangeMobile = userChangeMobile;
    return this;
  }

   /**
   * 用户变更手机号，替换旧的手机号
   * @return userChangeMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户变更手机号，替换旧的手机号")

  public String getUserChangeMobile() {
    return userChangeMobile;
  }


  public void setUserChangeMobile(String userChangeMobile) {
    this.userChangeMobile = userChangeMobile;
  }


  public UserDetails userMobile(String userMobile) {
    
    this.userMobile = userMobile;
    return this;
  }

   /**
   * 孩子家长的手机号
   * @return userMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "孩子家长的手机号")

  public String getUserMobile() {
    return userMobile;
  }


  public void setUserMobile(String userMobile) {
    this.userMobile = userMobile;
  }


  public UserDetails userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 张三
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "张三")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public UserDetails userRelation(String userRelation) {
    
    this.userRelation = userRelation;
    return this;
  }

   /**
   * 孩子与家长的关系： 1、爸爸  2、妈妈  3、爷爷  4、奶奶  5、外公  6、外婆  7、家长
   * @return userRelation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "孩子与家长的关系： 1、爸爸  2、妈妈  3、爷爷  4、奶奶  5、外公  6、外婆  7、家长")

  public String getUserRelation() {
    return userRelation;
  }


  public void setUserRelation(String userRelation) {
    this.userRelation = userRelation;
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
   * @return the UserDetails instance itself
   */
  public UserDetails putAdditionalProperty(String key, Object value) {
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
    UserDetails userDetails = (UserDetails) o;
    return Objects.equals(this.userChangeMobile, userDetails.userChangeMobile) &&
        Objects.equals(this.userMobile, userDetails.userMobile) &&
        Objects.equals(this.userName, userDetails.userName) &&
        Objects.equals(this.userRelation, userDetails.userRelation)&&
        Objects.equals(this.additionalProperties, userDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userChangeMobile, userMobile, userName, userRelation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetails {\n");
    sb.append("    userChangeMobile: ").append(toIndentedString(userChangeMobile)).append("\n");
    sb.append("    userMobile: ").append(toIndentedString(userMobile)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userRelation: ").append(toIndentedString(userRelation)).append("\n");
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
    openapiFields.add("user_change_mobile");
    openapiFields.add("user_mobile");
    openapiFields.add("user_name");
    openapiFields.add("user_relation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserDetails is not found in the empty JSON string", UserDetails.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("user_change_mobile") != null && !jsonObj.get("user_change_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_change_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_change_mobile").toString()));
      }
      if (jsonObj.get("user_mobile") != null && !jsonObj.get("user_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_mobile").toString()));
      }
      if (jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
      if (jsonObj.get("user_relation") != null && !jsonObj.get("user_relation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_relation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_relation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UserDetails>() {
           @Override
           public void write(JsonWriter out, UserDetails value) throws IOException {
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
           public UserDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserDetails
  * @throws IOException if the JSON string is invalid with respect to UserDetails
  */
  public static UserDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserDetails.class);
  }

 /**
  * Convert an instance of UserDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

