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
 * AlipayMarketingMaterialImageUploadResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingMaterialImageUploadResponseModel {
  public static final String SERIALIZED_NAME_RESOURCE_ENHANCE = "resource_enhance";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ENHANCE)
  private Boolean resourceEnhance;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_URL = "resource_url";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URL)
  private String resourceUrl;

  public AlipayMarketingMaterialImageUploadResponseModel() { 
  }

  public AlipayMarketingMaterialImageUploadResponseModel resourceEnhance(Boolean resourceEnhance) {
    
    this.resourceEnhance = resourceEnhance;
    return this;
  }

   /**
   * 图片是否优化过。系统会根据要求，若上传的图片不符合要求的尺寸，会对上传的图片做尺寸的优化。
   * @return resourceEnhance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "图片是否优化过。系统会根据要求，若上传的图片不符合要求的尺寸，会对上传的图片做尺寸的优化。")

  public Boolean getResourceEnhance() {
    return resourceEnhance;
  }


  public void setResourceEnhance(Boolean resourceEnhance) {
    this.resourceEnhance = resourceEnhance;
  }


  public AlipayMarketingMaterialImageUploadResponseModel resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * 图片唯一资源ID
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "adeDSktiQO-u5vJUqVbcQwAAACMAAQED", value = "图片唯一资源ID")

  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public AlipayMarketingMaterialImageUploadResponseModel resourceUrl(String resourceUrl) {
    
    this.resourceUrl = resourceUrl;
    return this;
  }

   /**
   * 上传后图片的url地址
   * @return resourceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://mdn.alipayobjects.com/afts/img/A*o-BSQa2Pnq4mIFdCjUnmqAAAARwnAQ/original?bz=promo_merchant", value = "上传后图片的url地址")

  public String getResourceUrl() {
    return resourceUrl;
  }


  public void setResourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
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
   * @return the AlipayMarketingMaterialImageUploadResponseModel instance itself
   */
  public AlipayMarketingMaterialImageUploadResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingMaterialImageUploadResponseModel alipayMarketingMaterialImageUploadResponseModel = (AlipayMarketingMaterialImageUploadResponseModel) o;
    return Objects.equals(this.resourceEnhance, alipayMarketingMaterialImageUploadResponseModel.resourceEnhance) &&
        Objects.equals(this.resourceId, alipayMarketingMaterialImageUploadResponseModel.resourceId) &&
        Objects.equals(this.resourceUrl, alipayMarketingMaterialImageUploadResponseModel.resourceUrl)&&
        Objects.equals(this.additionalProperties, alipayMarketingMaterialImageUploadResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceEnhance, resourceId, resourceUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingMaterialImageUploadResponseModel {\n");
    sb.append("    resourceEnhance: ").append(toIndentedString(resourceEnhance)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceUrl: ").append(toIndentedString(resourceUrl)).append("\n");
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
    openapiFields.add("resource_enhance");
    openapiFields.add("resource_id");
    openapiFields.add("resource_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingMaterialImageUploadResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingMaterialImageUploadResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingMaterialImageUploadResponseModel is not found in the empty JSON string", AlipayMarketingMaterialImageUploadResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("resource_id") != null && !jsonObj.get("resource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_id").toString()));
      }
      if (jsonObj.get("resource_url") != null && !jsonObj.get("resource_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingMaterialImageUploadResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingMaterialImageUploadResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingMaterialImageUploadResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingMaterialImageUploadResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingMaterialImageUploadResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingMaterialImageUploadResponseModel value) throws IOException {
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
           public AlipayMarketingMaterialImageUploadResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingMaterialImageUploadResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingMaterialImageUploadResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingMaterialImageUploadResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingMaterialImageUploadResponseModel
  */
  public static AlipayMarketingMaterialImageUploadResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingMaterialImageUploadResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingMaterialImageUploadResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

