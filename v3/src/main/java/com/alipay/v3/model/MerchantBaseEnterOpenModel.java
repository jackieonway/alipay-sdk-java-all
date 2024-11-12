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
 * MerchantBaseEnterOpenModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantBaseEnterOpenModel {
  public static final String SERIALIZED_NAME_LOGIN_ID = "login_id";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private String loginId;

  public static final String SERIALIZED_NAME_LOGO_INFO = "logo_info";
  @SerializedName(SERIALIZED_NAME_LOGO_INFO)
  private String logoInfo;

  public static final String SERIALIZED_NAME_M_NAME = "m_name";
  @SerializedName(SERIALIZED_NAME_M_NAME)
  private String mName;

  public static final String SERIALIZED_NAME_M_SHORT_NAME = "m_short_name";
  @SerializedName(SERIALIZED_NAME_M_SHORT_NAME)
  private String mShortName;

  public MerchantBaseEnterOpenModel() { 
  }

  public MerchantBaseEnterOpenModel loginId(String loginId) {
    
    this.loginId = loginId;
    return this;
  }

   /**
   * 登陆账号
   * @return loginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15587665764", value = "登陆账号")

  public String getLoginId() {
    return loginId;
  }


  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  public MerchantBaseEnterOpenModel logoInfo(String logoInfo) {
    
    this.logoInfo = logoInfo;
    return this;
  }

   /**
   * 商户logo文件流信息，该字段为文件流经base64编码后得到的字符串。
   * @return logoInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/9j/4AAQSkZJRgABAQEASABIAAD/2wBDAA...", value = "商户logo文件流信息，该字段为文件流经base64编码后得到的字符串。")

  public String getLogoInfo() {
    return logoInfo;
  }


  public void setLogoInfo(String logoInfo) {
    this.logoInfo = logoInfo;
  }


  public MerchantBaseEnterOpenModel mName(String mName) {
    
    this.mName = mName;
    return this;
  }

   /**
   * 商户品牌全称。
   * @return mName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "蚂蚁金融服务集团", value = "商户品牌全称。")

  public String getmName() {
    return mName;
  }


  public void setmName(String mName) {
    this.mName = mName;
  }


  public MerchantBaseEnterOpenModel mShortName(String mShortName) {
    
    this.mShortName = mShortName;
    return this;
  }

   /**
   * 商户品牌简称
   * @return mShortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MYJF", value = "商户品牌简称")

  public String getmShortName() {
    return mShortName;
  }


  public void setmShortName(String mShortName) {
    this.mShortName = mShortName;
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
   * @return the MerchantBaseEnterOpenModel instance itself
   */
  public MerchantBaseEnterOpenModel putAdditionalProperty(String key, Object value) {
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
    MerchantBaseEnterOpenModel merchantBaseEnterOpenModel = (MerchantBaseEnterOpenModel) o;
    return Objects.equals(this.loginId, merchantBaseEnterOpenModel.loginId) &&
        Objects.equals(this.logoInfo, merchantBaseEnterOpenModel.logoInfo) &&
        Objects.equals(this.mName, merchantBaseEnterOpenModel.mName) &&
        Objects.equals(this.mShortName, merchantBaseEnterOpenModel.mShortName)&&
        Objects.equals(this.additionalProperties, merchantBaseEnterOpenModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginId, logoInfo, mName, mShortName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantBaseEnterOpenModel {\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    logoInfo: ").append(toIndentedString(logoInfo)).append("\n");
    sb.append("    mName: ").append(toIndentedString(mName)).append("\n");
    sb.append("    mShortName: ").append(toIndentedString(mShortName)).append("\n");
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
    openapiFields.add("login_id");
    openapiFields.add("logo_info");
    openapiFields.add("m_name");
    openapiFields.add("m_short_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantBaseEnterOpenModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantBaseEnterOpenModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantBaseEnterOpenModel is not found in the empty JSON string", MerchantBaseEnterOpenModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("login_id") != null && !jsonObj.get("login_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_id").toString()));
      }
      if (jsonObj.get("logo_info") != null && !jsonObj.get("logo_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_info").toString()));
      }
      if (jsonObj.get("m_name") != null && !jsonObj.get("m_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_name").toString()));
      }
      if (jsonObj.get("m_short_name") != null && !jsonObj.get("m_short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_short_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantBaseEnterOpenModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantBaseEnterOpenModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantBaseEnterOpenModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantBaseEnterOpenModel.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantBaseEnterOpenModel>() {
           @Override
           public void write(JsonWriter out, MerchantBaseEnterOpenModel value) throws IOException {
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
           public MerchantBaseEnterOpenModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantBaseEnterOpenModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantBaseEnterOpenModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantBaseEnterOpenModel
  * @throws IOException if the JSON string is invalid with respect to MerchantBaseEnterOpenModel
  */
  public static MerchantBaseEnterOpenModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantBaseEnterOpenModel.class);
  }

 /**
  * Convert an instance of MerchantBaseEnterOpenModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

