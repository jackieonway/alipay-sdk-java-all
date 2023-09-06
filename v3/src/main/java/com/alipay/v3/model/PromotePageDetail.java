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
import com.alipay.v3.model.PromotePageProperty;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PromotePageDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PromotePageDetail {
  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPERTY_LIST = "property_list";
  @SerializedName(SERIALIZED_NAME_PROPERTY_LIST)
  private List<PromotePageProperty> propertyList = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public PromotePageDetail() { 
  }

  public PromotePageDetail gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 推广页创建时间，格式：yyyy-mm-dd hh:mm:ss
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-12 12:20:30", value = "推广页创建时间，格式：yyyy-mm-dd hh:mm:ss")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public PromotePageDetail id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 推广页id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018374", value = "推广页id")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public PromotePageDetail name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 推广页名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试留资推广页", value = "推广页名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PromotePageDetail propertyList(List<PromotePageProperty> propertyList) {
    
    this.propertyList = propertyList;
    return this;
  }

  public PromotePageDetail addPropertyListItem(PromotePageProperty propertyListItem) {
    if (this.propertyList == null) {
      this.propertyList = new ArrayList<>();
    }
    this.propertyList.add(propertyListItem);
    return this;
  }

   /**
   * 推广留资schema
   * @return propertyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "推广留资schema")

  public List<PromotePageProperty> getPropertyList() {
    return propertyList;
  }


  public void setPropertyList(List<PromotePageProperty> propertyList) {
    this.propertyList = propertyList;
  }


  public PromotePageDetail type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 推广页类型：COLLECT_INFO -  普通留资；TRADE - 交易留资
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COLLECT_INFO", value = "推广页类型：COLLECT_INFO -  普通留资；TRADE - 交易留资")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotePageDetail promotePageDetail = (PromotePageDetail) o;
    return Objects.equals(this.gmtCreate, promotePageDetail.gmtCreate) &&
        Objects.equals(this.id, promotePageDetail.id) &&
        Objects.equals(this.name, promotePageDetail.name) &&
        Objects.equals(this.propertyList, promotePageDetail.propertyList) &&
        Objects.equals(this.type, promotePageDetail.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmtCreate, id, name, propertyList, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotePageDetail {\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyList: ").append(toIndentedString(propertyList)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("gmt_create");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("property_list");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PromotePageDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PromotePageDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromotePageDetail is not found in the empty JSON string", PromotePageDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PromotePageDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PromotePageDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      JsonArray jsonArraypropertyList = jsonObj.getAsJsonArray("property_list");
      if (jsonArraypropertyList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("property_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `property_list` to be an array in the JSON string but got `%s`", jsonObj.get("property_list").toString()));
        }

        // validate the optional field `property_list` (array)
        for (int i = 0; i < jsonArraypropertyList.size(); i++) {
          PromotePageProperty.validateJsonObject(jsonArraypropertyList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotePageDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotePageDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotePageDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotePageDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotePageDetail>() {
           @Override
           public void write(JsonWriter out, PromotePageDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotePageDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotePageDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotePageDetail
  * @throws IOException if the JSON string is invalid with respect to PromotePageDetail
  */
  public static PromotePageDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotePageDetail.class);
  }

 /**
  * Convert an instance of PromotePageDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

