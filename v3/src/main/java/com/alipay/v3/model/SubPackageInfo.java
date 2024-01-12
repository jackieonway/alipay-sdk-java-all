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
 * SubPackageInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubPackageInfo {
  public static final String SERIALIZED_NAME_BUILDED_PACKAGE_URL = "builded_package_url";
  @SerializedName(SERIALIZED_NAME_BUILDED_PACKAGE_URL)
  private String buildedPackageUrl;

  public static final String SERIALIZED_NAME_NEW_BUILDED_PACKAGE_URL = "new_builded_package_url";
  @SerializedName(SERIALIZED_NAME_NEW_BUILDED_PACKAGE_URL)
  private String newBuildedPackageUrl;

  public static final String SERIALIZED_NAME_NEW_SIZE = "new_size";
  @SerializedName(SERIALIZED_NAME_NEW_SIZE)
  private String newSize;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_SOURCE_URL = "source_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_URL)
  private String sourceUrl;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public SubPackageInfo() { 
  }

  public SubPackageInfo buildedPackageUrl(String buildedPackageUrl) {
    
    this.buildedPackageUrl = buildedPackageUrl;
    return this;
  }

   /**
   * 构建好的结果地址
   * @return buildedPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "构建好的结果地址", value = "构建好的结果地址")

  public String getBuildedPackageUrl() {
    return buildedPackageUrl;
  }


  public void setBuildedPackageUrl(String buildedPackageUrl) {
    this.buildedPackageUrl = buildedPackageUrl;
  }


  public SubPackageInfo newBuildedPackageUrl(String newBuildedPackageUrl) {
    
    this.newBuildedPackageUrl = newBuildedPackageUrl;
    return this;
  }

   /**
   * 构建好的分包地址
   * @return newBuildedPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "构建好的分包地址", value = "构建好的分包地址")

  public String getNewBuildedPackageUrl() {
    return newBuildedPackageUrl;
  }


  public void setNewBuildedPackageUrl(String newBuildedPackageUrl) {
    this.newBuildedPackageUrl = newBuildedPackageUrl;
  }


  public SubPackageInfo newSize(String newSize) {
    
    this.newSize = newSize;
    return this;
  }

   /**
   * 2.0分包大小，单位字节
   * @return newSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "2.0分包大小，单位字节")

  public String getNewSize() {
    return newSize;
  }


  public void setNewSize(String newSize) {
    this.newSize = newSize;
  }


  public SubPackageInfo path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * 分包路径
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "main/packageA/packageB", value = "分包路径")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public SubPackageInfo size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * 分包大小，单位字节
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "分包大小，单位字节")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public SubPackageInfo sourceUrl(String sourceUrl) {
    
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * 源码地址
   * @return sourceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "源码地址", value = "源码地址")

  public String getSourceUrl() {
    return sourceUrl;
  }


  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }


  public SubPackageInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 分包类型： MAIN ｜ SUB
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MAIN", value = "分包类型： MAIN ｜ SUB")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
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
   * @return the SubPackageInfo instance itself
   */
  public SubPackageInfo putAdditionalProperty(String key, Object value) {
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
    SubPackageInfo subPackageInfo = (SubPackageInfo) o;
    return Objects.equals(this.buildedPackageUrl, subPackageInfo.buildedPackageUrl) &&
        Objects.equals(this.newBuildedPackageUrl, subPackageInfo.newBuildedPackageUrl) &&
        Objects.equals(this.newSize, subPackageInfo.newSize) &&
        Objects.equals(this.path, subPackageInfo.path) &&
        Objects.equals(this.size, subPackageInfo.size) &&
        Objects.equals(this.sourceUrl, subPackageInfo.sourceUrl) &&
        Objects.equals(this.type, subPackageInfo.type)&&
        Objects.equals(this.additionalProperties, subPackageInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildedPackageUrl, newBuildedPackageUrl, newSize, path, size, sourceUrl, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubPackageInfo {\n");
    sb.append("    buildedPackageUrl: ").append(toIndentedString(buildedPackageUrl)).append("\n");
    sb.append("    newBuildedPackageUrl: ").append(toIndentedString(newBuildedPackageUrl)).append("\n");
    sb.append("    newSize: ").append(toIndentedString(newSize)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("builded_package_url");
    openapiFields.add("new_builded_package_url");
    openapiFields.add("new_size");
    openapiFields.add("path");
    openapiFields.add("size");
    openapiFields.add("source_url");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubPackageInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubPackageInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubPackageInfo is not found in the empty JSON string", SubPackageInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("builded_package_url") != null && !jsonObj.get("builded_package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `builded_package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("builded_package_url").toString()));
      }
      if (jsonObj.get("new_builded_package_url") != null && !jsonObj.get("new_builded_package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_builded_package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_builded_package_url").toString()));
      }
      if (jsonObj.get("new_size") != null && !jsonObj.get("new_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_size").toString()));
      }
      if (jsonObj.get("path") != null && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (jsonObj.get("size") != null && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
      if (jsonObj.get("source_url") != null && !jsonObj.get("source_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_url").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubPackageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubPackageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubPackageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubPackageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SubPackageInfo>() {
           @Override
           public void write(JsonWriter out, SubPackageInfo value) throws IOException {
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
           public SubPackageInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SubPackageInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SubPackageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubPackageInfo
  * @throws IOException if the JSON string is invalid with respect to SubPackageInfo
  */
  public static SubPackageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubPackageInfo.class);
  }

 /**
  * Convert an instance of SubPackageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

