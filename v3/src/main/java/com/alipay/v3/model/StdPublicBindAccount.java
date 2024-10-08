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
 * StdPublicBindAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StdPublicBindAccount {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_BIND_ACCOUNT_NO = "bind_account_no";
  @SerializedName(SERIALIZED_NAME_BIND_ACCOUNT_NO)
  private String bindAccountNo;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FROM_USER_ID = "from_user_id";
  @SerializedName(SERIALIZED_NAME_FROM_USER_ID)
  private String fromUserId;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_REAL_NAME = "real_name";
  @SerializedName(SERIALIZED_NAME_REAL_NAME)
  private String realName;

  public StdPublicBindAccount() { 
  }

  public StdPublicBindAccount agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 协议号是商户会员在支付宝公众账号中的唯一标识。
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20131017000001476688", value = "协议号是商户会员在支付宝公众账号中的唯一标识。")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public StdPublicBindAccount appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 公众账号ID
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013091300001633", value = "公众账号ID")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public StdPublicBindAccount bindAccountNo(String bindAccountNo) {
    
    this.bindAccountNo = bindAccountNo;
    return this;
  }

   /**
   * 绑定的商户会员号
   * @return bindAccountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6226250032060088", value = "绑定的商户会员号")

  public String getBindAccountNo() {
    return bindAccountNo;
  }


  public void setBindAccountNo(String bindAccountNo) {
    this.bindAccountNo = bindAccountNo;
  }


  public StdPublicBindAccount displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * 公众账号期望支付宝用户在公众账号首页看到的关于该用户的显示信息，最长10个汉字。
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "尾号0088", value = "公众账号期望支付宝用户在公众账号首页看到的关于该用户的显示信息，最长10个汉字。")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public StdPublicBindAccount fromUserId(String fromUserId) {
    
    this.fromUserId = fromUserId;
    return this;
  }

   /**
   * 绑定的商户会员对应的支付宝用户号，以2088 开头的16位数字。
   * @return fromUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123412341234", value = "绑定的商户会员对应的支付宝用户号，以2088 开头的16位数字。")

  public String getFromUserId() {
    return fromUserId;
  }


  public void setFromUserId(String fromUserId) {
    this.fromUserId = fromUserId;
  }


  public StdPublicBindAccount openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 1
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "1")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public StdPublicBindAccount realName(String realName) {
    
    this.realName = realName;
    return this;
  }

   /**
   * 绑定的商户会员的真实姓名，最长10个汉字。
   * @return realName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "王小毛", value = "绑定的商户会员的真实姓名，最长10个汉字。")

  public String getRealName() {
    return realName;
  }


  public void setRealName(String realName) {
    this.realName = realName;
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
   * @return the StdPublicBindAccount instance itself
   */
  public StdPublicBindAccount putAdditionalProperty(String key, Object value) {
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
    StdPublicBindAccount stdPublicBindAccount = (StdPublicBindAccount) o;
    return Objects.equals(this.agreementId, stdPublicBindAccount.agreementId) &&
        Objects.equals(this.appId, stdPublicBindAccount.appId) &&
        Objects.equals(this.bindAccountNo, stdPublicBindAccount.bindAccountNo) &&
        Objects.equals(this.displayName, stdPublicBindAccount.displayName) &&
        Objects.equals(this.fromUserId, stdPublicBindAccount.fromUserId) &&
        Objects.equals(this.openId, stdPublicBindAccount.openId) &&
        Objects.equals(this.realName, stdPublicBindAccount.realName)&&
        Objects.equals(this.additionalProperties, stdPublicBindAccount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, appId, bindAccountNo, displayName, fromUserId, openId, realName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StdPublicBindAccount {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    bindAccountNo: ").append(toIndentedString(bindAccountNo)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("app_id");
    openapiFields.add("bind_account_no");
    openapiFields.add("display_name");
    openapiFields.add("from_user_id");
    openapiFields.add("open_id");
    openapiFields.add("real_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StdPublicBindAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StdPublicBindAccount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StdPublicBindAccount is not found in the empty JSON string", StdPublicBindAccount.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("app_id") != null && !jsonObj.get("app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_id").toString()));
      }
      if (jsonObj.get("bind_account_no") != null && !jsonObj.get("bind_account_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind_account_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind_account_no").toString()));
      }
      if (jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if (jsonObj.get("from_user_id") != null && !jsonObj.get("from_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from_user_id").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("real_name") != null && !jsonObj.get("real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StdPublicBindAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StdPublicBindAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StdPublicBindAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StdPublicBindAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<StdPublicBindAccount>() {
           @Override
           public void write(JsonWriter out, StdPublicBindAccount value) throws IOException {
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
           public StdPublicBindAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StdPublicBindAccount instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StdPublicBindAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StdPublicBindAccount
  * @throws IOException if the JSON string is invalid with respect to StdPublicBindAccount
  */
  public static StdPublicBindAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StdPublicBindAccount.class);
  }

 /**
  * Convert an instance of StdPublicBindAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

