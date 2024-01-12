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
 * AlipayOfflineMaterialImageUploadModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOfflineMaterialImageUploadModel {
  public static final String SERIALIZED_NAME_IMAGE_NAME = "image_name";
  @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
  private String imageName;

  public static final String SERIALIZED_NAME_IMAGE_PID = "image_pid";
  @SerializedName(SERIALIZED_NAME_IMAGE_PID)
  private String imagePid;

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "image_type";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public AlipayOfflineMaterialImageUploadModel() { 
  }

  public AlipayOfflineMaterialImageUploadModel imageName(String imageName) {
    
    this.imageName = imageName;
    return this;
  }

   /**
   * 图片/视频名称
   * @return imageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "海底捞", value = "图片/视频名称")

  public String getImageName() {
    return imageName;
  }


  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public AlipayOfflineMaterialImageUploadModel imagePid(String imagePid) {
    
    this.imagePid = imagePid;
    return this;
  }

   /**
   * 用于显示指定图片/视频所属的partnerId（支付宝内部使用，外部商户无需填写此字段）
   * @return imagePid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088021822217233", value = "用于显示指定图片/视频所属的partnerId（支付宝内部使用，外部商户无需填写此字段）")

  public String getImagePid() {
    return imagePid;
  }


  public void setImagePid(String imagePid) {
    this.imagePid = imagePid;
  }


  public AlipayOfflineMaterialImageUploadModel imageType(String imageType) {
    
    this.imageType = imageType;
    return this;
  }

   /**
   * 图片/视频格式
   * @return imageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jpg或mp4", value = "图片/视频格式")

  public String getImageType() {
    return imageType;
  }


  public void setImageType(String imageType) {
    this.imageType = imageType;
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
   * @return the AlipayOfflineMaterialImageUploadModel instance itself
   */
  public AlipayOfflineMaterialImageUploadModel putAdditionalProperty(String key, Object value) {
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
    AlipayOfflineMaterialImageUploadModel alipayOfflineMaterialImageUploadModel = (AlipayOfflineMaterialImageUploadModel) o;
    return Objects.equals(this.imageName, alipayOfflineMaterialImageUploadModel.imageName) &&
        Objects.equals(this.imagePid, alipayOfflineMaterialImageUploadModel.imagePid) &&
        Objects.equals(this.imageType, alipayOfflineMaterialImageUploadModel.imageType)&&
        Objects.equals(this.additionalProperties, alipayOfflineMaterialImageUploadModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageName, imagePid, imageType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOfflineMaterialImageUploadModel {\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imagePid: ").append(toIndentedString(imagePid)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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
    openapiFields.add("image_name");
    openapiFields.add("image_pid");
    openapiFields.add("image_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOfflineMaterialImageUploadModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOfflineMaterialImageUploadModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOfflineMaterialImageUploadModel is not found in the empty JSON string", AlipayOfflineMaterialImageUploadModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("image_name") != null && !jsonObj.get("image_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_name").toString()));
      }
      if (jsonObj.get("image_pid") != null && !jsonObj.get("image_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_pid").toString()));
      }
      if (jsonObj.get("image_type") != null && !jsonObj.get("image_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOfflineMaterialImageUploadModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOfflineMaterialImageUploadModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOfflineMaterialImageUploadModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOfflineMaterialImageUploadModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOfflineMaterialImageUploadModel>() {
           @Override
           public void write(JsonWriter out, AlipayOfflineMaterialImageUploadModel value) throws IOException {
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
           public AlipayOfflineMaterialImageUploadModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOfflineMaterialImageUploadModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOfflineMaterialImageUploadModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOfflineMaterialImageUploadModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOfflineMaterialImageUploadModel
  */
  public static AlipayOfflineMaterialImageUploadModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOfflineMaterialImageUploadModel.class);
  }

 /**
  * Convert an instance of AlipayOfflineMaterialImageUploadModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

