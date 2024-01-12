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
 * SignData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignData {
  public static final String SERIALIZED_NAME_ORI_APP_ID = "ori_app_id";
  @SerializedName(SERIALIZED_NAME_ORI_APP_ID)
  private String oriAppId;

  public static final String SERIALIZED_NAME_ORI_CHAR_SET = "ori_char_set";
  @SerializedName(SERIALIZED_NAME_ORI_CHAR_SET)
  private String oriCharSet;

  public static final String SERIALIZED_NAME_ORI_OUT_BIZ_NO = "ori_out_biz_no";
  @SerializedName(SERIALIZED_NAME_ORI_OUT_BIZ_NO)
  private String oriOutBizNo;

  public static final String SERIALIZED_NAME_ORI_SIGN = "ori_sign";
  @SerializedName(SERIALIZED_NAME_ORI_SIGN)
  private String oriSign;

  public static final String SERIALIZED_NAME_ORI_SIGN_TYPE = "ori_sign_type";
  @SerializedName(SERIALIZED_NAME_ORI_SIGN_TYPE)
  private String oriSignType;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public SignData() { 
  }

  public SignData oriAppId(String oriAppId) {
    
    this.oriAppId = oriAppId;
    return this;
  }

   /**
   * 签名商户开放平台应用APPID
   * @return oriAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021000185629012", value = "签名商户开放平台应用APPID")

  public String getOriAppId() {
    return oriAppId;
  }


  public void setOriAppId(String oriAppId) {
    this.oriAppId = oriAppId;
  }


  public SignData oriCharSet(String oriCharSet) {
    
    this.oriCharSet = oriCharSet;
    return this;
  }

   /**
   * 编码类型（大小写敏感）
   * @return oriCharSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UTF-8", value = "编码类型（大小写敏感）")

  public String getOriCharSet() {
    return oriCharSet;
  }


  public void setOriCharSet(String oriCharSet) {
    this.oriCharSet = oriCharSet;
  }


  public SignData oriOutBizNo(String oriOutBizNo) {
    
    this.oriOutBizNo = oriOutBizNo;
    return this;
  }

   /**
   * ori_out_biz_no_001
   * @return oriOutBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商户订单号", value = "ori_out_biz_no_001")

  public String getOriOutBizNo() {
    return oriOutBizNo;
  }


  public void setOriOutBizNo(String oriOutBizNo) {
    this.oriOutBizNo = oriOutBizNo;
  }


  public SignData oriSign(String oriSign) {
    
    this.oriSign = oriSign;
    return this;
  }

   /**
   * 签名密文
   * @return oriSign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EqHFP0z4a9iaQ1ep==", value = "签名密文")

  public String getOriSign() {
    return oriSign;
  }


  public void setOriSign(String oriSign) {
    this.oriSign = oriSign;
  }


  public SignData oriSignType(String oriSignType) {
    
    this.oriSignType = oriSignType;
    return this;
  }

   /**
   * 签名算法（大小写敏感）
   * @return oriSignType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RSA2", value = "签名算法（大小写敏感）")

  public String getOriSignType() {
    return oriSignType;
  }


  public void setOriSignType(String oriSignType) {
    this.oriSignType = oriSignType;
  }


  public SignData partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 2088041181118800
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "签名被授权方支付宝账号ID", value = "2088041181118800")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
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
   * @return the SignData instance itself
   */
  public SignData putAdditionalProperty(String key, Object value) {
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
    SignData signData = (SignData) o;
    return Objects.equals(this.oriAppId, signData.oriAppId) &&
        Objects.equals(this.oriCharSet, signData.oriCharSet) &&
        Objects.equals(this.oriOutBizNo, signData.oriOutBizNo) &&
        Objects.equals(this.oriSign, signData.oriSign) &&
        Objects.equals(this.oriSignType, signData.oriSignType) &&
        Objects.equals(this.partnerId, signData.partnerId)&&
        Objects.equals(this.additionalProperties, signData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oriAppId, oriCharSet, oriOutBizNo, oriSign, oriSignType, partnerId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignData {\n");
    sb.append("    oriAppId: ").append(toIndentedString(oriAppId)).append("\n");
    sb.append("    oriCharSet: ").append(toIndentedString(oriCharSet)).append("\n");
    sb.append("    oriOutBizNo: ").append(toIndentedString(oriOutBizNo)).append("\n");
    sb.append("    oriSign: ").append(toIndentedString(oriSign)).append("\n");
    sb.append("    oriSignType: ").append(toIndentedString(oriSignType)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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
    openapiFields.add("ori_app_id");
    openapiFields.add("ori_char_set");
    openapiFields.add("ori_out_biz_no");
    openapiFields.add("ori_sign");
    openapiFields.add("ori_sign_type");
    openapiFields.add("partner_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SignData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignData is not found in the empty JSON string", SignData.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("ori_app_id") != null && !jsonObj.get("ori_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_app_id").toString()));
      }
      if (jsonObj.get("ori_char_set") != null && !jsonObj.get("ori_char_set").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_char_set` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_char_set").toString()));
      }
      if (jsonObj.get("ori_out_biz_no") != null && !jsonObj.get("ori_out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_out_biz_no").toString()));
      }
      if (jsonObj.get("ori_sign") != null && !jsonObj.get("ori_sign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_sign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_sign").toString()));
      }
      if (jsonObj.get("ori_sign_type") != null && !jsonObj.get("ori_sign_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_sign_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_sign_type").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignData.class));

       return (TypeAdapter<T>) new TypeAdapter<SignData>() {
           @Override
           public void write(JsonWriter out, SignData value) throws IOException {
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
           public SignData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignData
  * @throws IOException if the JSON string is invalid with respect to SignData
  */
  public static SignData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignData.class);
  }

 /**
  * Convert an instance of SignData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

