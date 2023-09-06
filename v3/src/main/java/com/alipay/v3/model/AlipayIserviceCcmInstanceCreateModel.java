/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-09-06
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
 * AlipayIserviceCcmInstanceCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmInstanceCreateModel {
  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private String creatorId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public AlipayIserviceCcmInstanceCreateModel() { 
  }

  public AlipayIserviceCcmInstanceCreateModel creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * 创建人id
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "246534573", value = "创建人id")

  public String getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public AlipayIserviceCcmInstanceCreateModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 租户实例（数据权限）描述信息
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我是租户实例（数据权限）描述", value = "租户实例（数据权限）描述信息")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AlipayIserviceCcmInstanceCreateModel externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * 外部id
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "29488293", value = "外部id")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public AlipayIserviceCcmInstanceCreateModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 租户实例（数据权限）名称，如果名称已经存在，将创建失败
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试租户实例（数据权限）", value = "租户实例（数据权限）名称，如果名称已经存在，将创建失败")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmInstanceCreateModel alipayIserviceCcmInstanceCreateModel = (AlipayIserviceCcmInstanceCreateModel) o;
    return Objects.equals(this.creatorId, alipayIserviceCcmInstanceCreateModel.creatorId) &&
        Objects.equals(this.description, alipayIserviceCcmInstanceCreateModel.description) &&
        Objects.equals(this.externalId, alipayIserviceCcmInstanceCreateModel.externalId) &&
        Objects.equals(this.name, alipayIserviceCcmInstanceCreateModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorId, description, externalId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmInstanceCreateModel {\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("creator_id");
    openapiFields.add("description");
    openapiFields.add("external_id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmInstanceCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmInstanceCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmInstanceCreateModel is not found in the empty JSON string", AlipayIserviceCcmInstanceCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmInstanceCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmInstanceCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("creator_id") != null && !jsonObj.get("creator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_id").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmInstanceCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmInstanceCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmInstanceCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmInstanceCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmInstanceCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmInstanceCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmInstanceCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmInstanceCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmInstanceCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmInstanceCreateModel
  */
  public static AlipayIserviceCcmInstanceCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmInstanceCreateModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmInstanceCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

