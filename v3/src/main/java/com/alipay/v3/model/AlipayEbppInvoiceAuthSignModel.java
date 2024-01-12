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
 * AlipayEbppInvoiceAuthSignModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceAuthSignModel {
  public static final String SERIALIZED_NAME_AUTHORIZATION_TYPE = "authorization_type";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_TYPE)
  private String authorizationType;

  public static final String SERIALIZED_NAME_EXTEND_FIELDS = "extend_fields";
  @SerializedName(SERIALIZED_NAME_EXTEND_FIELDS)
  private String extendFields;

  public static final String SERIALIZED_NAME_M_SHORT_NAME = "m_short_name";
  @SerializedName(SERIALIZED_NAME_M_SHORT_NAME)
  private String mShortName;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayEbppInvoiceAuthSignModel() { 
  }

  public AlipayEbppInvoiceAuthSignModel authorizationType(String authorizationType) {
    
    this.authorizationType = authorizationType;
    return this;
  }

   /**
   * 发票授权类型，可选值：INVOICE_AUTO_SYNC（发票自动回传） INVOICE_TWOWAY_AUTO_SYNC（发票双向自动回传）
   * @return authorizationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INVOICE_AUTO_SYNC", value = "发票授权类型，可选值：INVOICE_AUTO_SYNC（发票自动回传） INVOICE_TWOWAY_AUTO_SYNC（发票双向自动回传）")

  public String getAuthorizationType() {
    return authorizationType;
  }


  public void setAuthorizationType(String authorizationType) {
    this.authorizationType = authorizationType;
  }


  public AlipayEbppInvoiceAuthSignModel extendFields(String extendFields) {
    
    this.extendFields = extendFields;
    return this;
  }

   /**
   * 扩展字段，格式为：KEY1&#x3D;VALUE1,KEY2&#x3D;VALUE2,KEY3&#x3D;VALUE3 邮箱地址KEY为EMAIL_ADDRESS
   * @return extendFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EMAIL_ADDRESS=example@alipay.com", value = "扩展字段，格式为：KEY1=VALUE1,KEY2=VALUE2,KEY3=VALUE3 邮箱地址KEY为EMAIL_ADDRESS")

  public String getExtendFields() {
    return extendFields;
  }


  public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
  }


  public AlipayEbppInvoiceAuthSignModel mShortName(String mShortName) {
    
    this.mShortName = mShortName;
    return this;
  }

   /**
   * 开票商户品牌简称，与商户入驻时的品牌简称保持一致。
   * @return mShortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CSD", value = "开票商户品牌简称，与商户入驻时的品牌简称保持一致。")

  public String getmShortName() {
    return mShortName;
  }


  public void setmShortName(String mShortName) {
    this.mShortName = mShortName;
  }


  public AlipayEbppInvoiceAuthSignModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户userId
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户userId")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayEbppInvoiceAuthSignModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 支付宝用户userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088399922382233", value = "支付宝用户userId")

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
   * @return the AlipayEbppInvoiceAuthSignModel instance itself
   */
  public AlipayEbppInvoiceAuthSignModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceAuthSignModel alipayEbppInvoiceAuthSignModel = (AlipayEbppInvoiceAuthSignModel) o;
    return Objects.equals(this.authorizationType, alipayEbppInvoiceAuthSignModel.authorizationType) &&
        Objects.equals(this.extendFields, alipayEbppInvoiceAuthSignModel.extendFields) &&
        Objects.equals(this.mShortName, alipayEbppInvoiceAuthSignModel.mShortName) &&
        Objects.equals(this.openId, alipayEbppInvoiceAuthSignModel.openId) &&
        Objects.equals(this.userId, alipayEbppInvoiceAuthSignModel.userId)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceAuthSignModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationType, extendFields, mShortName, openId, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceAuthSignModel {\n");
    sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
    sb.append("    extendFields: ").append(toIndentedString(extendFields)).append("\n");
    sb.append("    mShortName: ").append(toIndentedString(mShortName)).append("\n");
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
    openapiFields.add("authorization_type");
    openapiFields.add("extend_fields");
    openapiFields.add("m_short_name");
    openapiFields.add("open_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceAuthSignModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceAuthSignModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceAuthSignModel is not found in the empty JSON string", AlipayEbppInvoiceAuthSignModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("authorization_type") != null && !jsonObj.get("authorization_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_type").toString()));
      }
      if (jsonObj.get("extend_fields") != null && !jsonObj.get("extend_fields").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_fields` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_fields").toString()));
      }
      if (jsonObj.get("m_short_name") != null && !jsonObj.get("m_short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_short_name").toString()));
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
       if (!AlipayEbppInvoiceAuthSignModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceAuthSignModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceAuthSignModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceAuthSignModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceAuthSignModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceAuthSignModel value) throws IOException {
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
           public AlipayEbppInvoiceAuthSignModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceAuthSignModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceAuthSignModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceAuthSignModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceAuthSignModel
  */
  public static AlipayEbppInvoiceAuthSignModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceAuthSignModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceAuthSignModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

