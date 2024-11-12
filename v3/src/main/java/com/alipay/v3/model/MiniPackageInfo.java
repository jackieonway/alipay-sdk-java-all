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
 * MiniPackageInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiniPackageInfo {
  public static final String SERIALIZED_NAME_DOC_URL = "doc_url";
  @SerializedName(SERIALIZED_NAME_DOC_URL)
  private String docUrl;

  public static final String SERIALIZED_NAME_PACKAGE_DESC = "package_desc";
  @SerializedName(SERIALIZED_NAME_PACKAGE_DESC)
  private String packageDesc;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName;

  public static final String SERIALIZED_NAME_PACKAGE_OPEN_TYPE = "package_open_type";
  @SerializedName(SERIALIZED_NAME_PACKAGE_OPEN_TYPE)
  private String packageOpenType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public MiniPackageInfo() { 
  }

  public MiniPackageInfo docUrl(String docUrl) {
    
    this.docUrl = docUrl;
    return this;
  }

   /**
   * 功能包文档地址
   * @return docUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://doc.aaa.alipay.com", value = "功能包文档地址")

  public String getDocUrl() {
    return docUrl;
  }


  public void setDocUrl(String docUrl) {
    this.docUrl = docUrl;
  }


  public MiniPackageInfo packageDesc(String packageDesc) {
    
    this.packageDesc = packageDesc;
    return this;
  }

   /**
   * 功能包描述
   * @return packageDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "通用能力", value = "功能包描述")

  public String getPackageDesc() {
    return packageDesc;
  }


  public void setPackageDesc(String packageDesc) {
    this.packageDesc = packageDesc;
  }


  public MiniPackageInfo packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 功能包名称
   * @return packageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序基础功能包", value = "功能包名称")

  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public MiniPackageInfo packageOpenType(String packageOpenType) {
    
    this.packageOpenType = packageOpenType;
    return this;
  }

   /**
   * 功能包开通方式
   * @return packageOpenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPLY", value = "功能包开通方式")

  public String getPackageOpenType() {
    return packageOpenType;
  }


  public void setPackageOpenType(String packageOpenType) {
    this.packageOpenType = packageOpenType;
  }


  public MiniPackageInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 功能包签约状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "valid", value = "功能包签约状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the MiniPackageInfo instance itself
   */
  public MiniPackageInfo putAdditionalProperty(String key, Object value) {
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
    MiniPackageInfo miniPackageInfo = (MiniPackageInfo) o;
    return Objects.equals(this.docUrl, miniPackageInfo.docUrl) &&
        Objects.equals(this.packageDesc, miniPackageInfo.packageDesc) &&
        Objects.equals(this.packageName, miniPackageInfo.packageName) &&
        Objects.equals(this.packageOpenType, miniPackageInfo.packageOpenType) &&
        Objects.equals(this.status, miniPackageInfo.status)&&
        Objects.equals(this.additionalProperties, miniPackageInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docUrl, packageDesc, packageName, packageOpenType, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiniPackageInfo {\n");
    sb.append("    docUrl: ").append(toIndentedString(docUrl)).append("\n");
    sb.append("    packageDesc: ").append(toIndentedString(packageDesc)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    packageOpenType: ").append(toIndentedString(packageOpenType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("doc_url");
    openapiFields.add("package_desc");
    openapiFields.add("package_name");
    openapiFields.add("package_open_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MiniPackageInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MiniPackageInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiniPackageInfo is not found in the empty JSON string", MiniPackageInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("doc_url") != null && !jsonObj.get("doc_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_url").toString()));
      }
      if (jsonObj.get("package_desc") != null && !jsonObj.get("package_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_desc").toString()));
      }
      if (jsonObj.get("package_name") != null && !jsonObj.get("package_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_name").toString()));
      }
      if (jsonObj.get("package_open_type") != null && !jsonObj.get("package_open_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_open_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_open_type").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiniPackageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiniPackageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiniPackageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiniPackageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MiniPackageInfo>() {
           @Override
           public void write(JsonWriter out, MiniPackageInfo value) throws IOException {
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
           public MiniPackageInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MiniPackageInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MiniPackageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MiniPackageInfo
  * @throws IOException if the JSON string is invalid with respect to MiniPackageInfo
  */
  public static MiniPackageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiniPackageInfo.class);
  }

 /**
  * Convert an instance of MiniPackageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

