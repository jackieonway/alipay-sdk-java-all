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
import com.alipay.v3.model.Org;
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
 * SignerBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignerBean {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private String idNumber;

  public static final String SERIALIZED_NAME_ID_TYPE = "id_type";
  @SerializedName(SERIALIZED_NAME_ID_TYPE)
  private String idType;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  private Org org;

  public static final String SERIALIZED_NAME_THIRD_PARTY_USER_ID = "third_party_user_id";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_USER_ID)
  private String thirdPartyUserId;

  public SignerBean() { 
  }

  public SignerBean email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 个人邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "593100192@tsign.cn", value = "个人邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public SignerBean idNumber(String idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * 个人证件号
   * @return idNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330304199801011111", value = "个人证件号")

  public String getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }


  public SignerBean idType(String idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * 个人证件类型（证件号不为空时必填，详见个人证件类型说明 ）
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CRED_PSN_CH_IDCARD", value = "个人证件类型（证件号不为空时必填，详见个人证件类型说明 ）")

  public String getIdType() {
    return idType;
  }


  public void setIdType(String idType) {
    this.idType = idType;
  }


  public SignerBean mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * 个人手机号
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18888888888", value = "个人手机号")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public SignerBean name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 个人姓名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "折颜", value = "个人姓名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SignerBean org(Org org) {
    
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Org getOrg() {
    return org;
  }


  public void setOrg(Org org) {
    this.org = org;
  }


  public SignerBean thirdPartyUserId(String thirdPartyUserId) {
    
    this.thirdPartyUserId = thirdPartyUserId;
    return this;
  }

   /**
   * 个人唯一标识：可传入平台的个人用户id、支付宝userid、证件号、手机号、邮箱等。
   * @return thirdPartyUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102924502823", value = "个人唯一标识：可传入平台的个人用户id、支付宝userid、证件号、手机号、邮箱等。")

  public String getThirdPartyUserId() {
    return thirdPartyUserId;
  }


  public void setThirdPartyUserId(String thirdPartyUserId) {
    this.thirdPartyUserId = thirdPartyUserId;
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
   * @return the SignerBean instance itself
   */
  public SignerBean putAdditionalProperty(String key, Object value) {
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
    SignerBean signerBean = (SignerBean) o;
    return Objects.equals(this.email, signerBean.email) &&
        Objects.equals(this.idNumber, signerBean.idNumber) &&
        Objects.equals(this.idType, signerBean.idType) &&
        Objects.equals(this.mobile, signerBean.mobile) &&
        Objects.equals(this.name, signerBean.name) &&
        Objects.equals(this.org, signerBean.org) &&
        Objects.equals(this.thirdPartyUserId, signerBean.thirdPartyUserId)&&
        Objects.equals(this.additionalProperties, signerBean.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, idNumber, idType, mobile, name, org, thirdPartyUserId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignerBean {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    thirdPartyUserId: ").append(toIndentedString(thirdPartyUserId)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("id_number");
    openapiFields.add("id_type");
    openapiFields.add("mobile");
    openapiFields.add("name");
    openapiFields.add("org");
    openapiFields.add("third_party_user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignerBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SignerBean.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignerBean is not found in the empty JSON string", SignerBean.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("id_number") != null && !jsonObj.get("id_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_number").toString()));
      }
      if (jsonObj.get("id_type") != null && !jsonObj.get("id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_type").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `org`
      if (jsonObj.getAsJsonObject("org") != null) {
        Org.validateJsonObject(jsonObj.getAsJsonObject("org"));
      }
      if (jsonObj.get("third_party_user_id") != null && !jsonObj.get("third_party_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_party_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_party_user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignerBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignerBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignerBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignerBean.class));

       return (TypeAdapter<T>) new TypeAdapter<SignerBean>() {
           @Override
           public void write(JsonWriter out, SignerBean value) throws IOException {
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
           public SignerBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignerBean instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignerBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignerBean
  * @throws IOException if the JSON string is invalid with respect to SignerBean
  */
  public static SignerBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignerBean.class);
  }

 /**
  * Convert an instance of SignerBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

