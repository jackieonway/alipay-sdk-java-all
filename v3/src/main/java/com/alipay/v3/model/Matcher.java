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
 * Matcher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Matcher {
  public static final String SERIALIZED_NAME_IDENTITY_CARD = "identity_card";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD)
  private String identityCard;

  public static final String SERIALIZED_NAME_MOBILE_NO = "mobile_no";
  @SerializedName(SERIALIZED_NAME_MOBILE_NO)
  private String mobileNo;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public Matcher() { 
  }

  public Matcher identityCard(String identityCard) {
    
    this.identityCard = identityCard;
    return this;
  }

   /**
   * 身份证号码，与user_id、mobile_no不能同时为空
   * @return identityCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "身份证号码，与user_id、mobile_no不能同时为空")

  public String getIdentityCard() {
    return identityCard;
  }


  public void setIdentityCard(String identityCard) {
    this.identityCard = identityCard;
  }


  public Matcher mobileNo(String mobileNo) {
    
    this.mobileNo = mobileNo;
    return this;
  }

   /**
   * 手机号码，与user_id、identity_card不能同时为空
   * @return mobileNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "手机号码，与user_id、identity_card不能同时为空")

  public String getMobileNo() {
    return mobileNo;
  }


  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }


  public Matcher openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户openid
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝用户openid")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public Matcher userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 支付宝用户id，2088开头16位长度的字符串，与mobile_no、identity_card不能同时为空
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝用户id，2088开头16位长度的字符串，与mobile_no、identity_card不能同时为空")

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
   * @return the Matcher instance itself
   */
  public Matcher putAdditionalProperty(String key, Object value) {
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
    Matcher matcher = (Matcher) o;
    return Objects.equals(this.identityCard, matcher.identityCard) &&
        Objects.equals(this.mobileNo, matcher.mobileNo) &&
        Objects.equals(this.openId, matcher.openId) &&
        Objects.equals(this.userId, matcher.userId)&&
        Objects.equals(this.additionalProperties, matcher.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityCard, mobileNo, openId, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Matcher {\n");
    sb.append("    identityCard: ").append(toIndentedString(identityCard)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
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
    openapiFields.add("identity_card");
    openapiFields.add("mobile_no");
    openapiFields.add("open_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Matcher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Matcher.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Matcher is not found in the empty JSON string", Matcher.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("identity_card") != null && !jsonObj.get("identity_card").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_card` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_card").toString()));
      }
      if (jsonObj.get("mobile_no") != null && !jsonObj.get("mobile_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_no").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Matcher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Matcher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Matcher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Matcher.class));

       return (TypeAdapter<T>) new TypeAdapter<Matcher>() {
           @Override
           public void write(JsonWriter out, Matcher value) throws IOException {
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
           public Matcher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Matcher instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Matcher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Matcher
  * @throws IOException if the JSON string is invalid with respect to Matcher
  */
  public static Matcher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Matcher.class);
  }

 /**
  * Convert an instance of Matcher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

