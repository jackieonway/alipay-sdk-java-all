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
 * AlipayEcoSignflowsUrlQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoSignflowsUrlQueryResponseModel {
  public static final String SERIALIZED_NAME_PREVIEW_SHORT_URL = "preview_short_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_SHORT_URL)
  private String previewShortUrl;

  public static final String SERIALIZED_NAME_PREVIEW_URL = "preview_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_URL)
  private String previewUrl;

  public static final String SERIALIZED_NAME_SIGN_SHORT_URL = "sign_short_url";
  @SerializedName(SERIALIZED_NAME_SIGN_SHORT_URL)
  private String signShortUrl;

  public static final String SERIALIZED_NAME_SIGN_URL = "sign_url";
  @SerializedName(SERIALIZED_NAME_SIGN_URL)
  private String signUrl;

  public AlipayEcoSignflowsUrlQueryResponseModel() { 
  }

  public AlipayEcoSignflowsUrlQueryResponseModel previewShortUrl(String previewShortUrl) {
    
    this.previewShortUrl = previewShortUrl;
    return this;
  }

   /**
   * 预览短链地址（30天有效）
   * @return previewShortUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://testfront.tsign.cn", value = "预览短链地址（30天有效）")

  public String getPreviewShortUrl() {
    return previewShortUrl;
  }


  public void setPreviewShortUrl(String previewShortUrl) {
    this.previewShortUrl = previewShortUrl;
  }


  public AlipayEcoSignflowsUrlQueryResponseModel previewUrl(String previewUrl) {
    
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * 预览长链地址(永久有效)
   * @return previewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://testt.tsign.cn/55vebd3omU7k", value = "预览长链地址(永久有效)")

  public String getPreviewUrl() {
    return previewUrl;
  }


  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }


  public AlipayEcoSignflowsUrlQueryResponseModel signShortUrl(String signShortUrl) {
    
    this.signShortUrl = signShortUrl;
    return this;
  }

   /**
   * 签署短链地址（30天有效）
   * @return signShortUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://testfront.tsign.cn:8821", value = "签署短链地址（30天有效）")

  public String getSignShortUrl() {
    return signShortUrl;
  }


  public void setSignShortUrl(String signShortUrl) {
    this.signShortUrl = signShortUrl;
  }


  public AlipayEcoSignflowsUrlQueryResponseModel signUrl(String signUrl) {
    
    this.signUrl = signUrl;
    return this;
  }

   /**
   * 签署长链地址(永久有效)
   * @return signUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://testt.tsign.cn/55vebd3omU7k", value = "签署长链地址(永久有效)")

  public String getSignUrl() {
    return signUrl;
  }


  public void setSignUrl(String signUrl) {
    this.signUrl = signUrl;
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
   * @return the AlipayEcoSignflowsUrlQueryResponseModel instance itself
   */
  public AlipayEcoSignflowsUrlQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayEcoSignflowsUrlQueryResponseModel alipayEcoSignflowsUrlQueryResponseModel = (AlipayEcoSignflowsUrlQueryResponseModel) o;
    return Objects.equals(this.previewShortUrl, alipayEcoSignflowsUrlQueryResponseModel.previewShortUrl) &&
        Objects.equals(this.previewUrl, alipayEcoSignflowsUrlQueryResponseModel.previewUrl) &&
        Objects.equals(this.signShortUrl, alipayEcoSignflowsUrlQueryResponseModel.signShortUrl) &&
        Objects.equals(this.signUrl, alipayEcoSignflowsUrlQueryResponseModel.signUrl)&&
        Objects.equals(this.additionalProperties, alipayEcoSignflowsUrlQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previewShortUrl, previewUrl, signShortUrl, signUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoSignflowsUrlQueryResponseModel {\n");
    sb.append("    previewShortUrl: ").append(toIndentedString(previewShortUrl)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    signShortUrl: ").append(toIndentedString(signShortUrl)).append("\n");
    sb.append("    signUrl: ").append(toIndentedString(signUrl)).append("\n");
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
    openapiFields.add("preview_short_url");
    openapiFields.add("preview_url");
    openapiFields.add("sign_short_url");
    openapiFields.add("sign_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoSignflowsUrlQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoSignflowsUrlQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoSignflowsUrlQueryResponseModel is not found in the empty JSON string", AlipayEcoSignflowsUrlQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("preview_short_url") != null && !jsonObj.get("preview_short_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preview_short_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preview_short_url").toString()));
      }
      if (jsonObj.get("preview_url") != null && !jsonObj.get("preview_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preview_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preview_url").toString()));
      }
      if (jsonObj.get("sign_short_url") != null && !jsonObj.get("sign_short_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_short_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_short_url").toString()));
      }
      if (jsonObj.get("sign_url") != null && !jsonObj.get("sign_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoSignflowsUrlQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoSignflowsUrlQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoSignflowsUrlQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoSignflowsUrlQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoSignflowsUrlQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoSignflowsUrlQueryResponseModel value) throws IOException {
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
           public AlipayEcoSignflowsUrlQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEcoSignflowsUrlQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEcoSignflowsUrlQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoSignflowsUrlQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoSignflowsUrlQueryResponseModel
  */
  public static AlipayEcoSignflowsUrlQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoSignflowsUrlQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoSignflowsUrlQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

