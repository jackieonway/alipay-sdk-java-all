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
import com.alipay.v3.model.OrderExtInfo;
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
 * OrderParticipantInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderParticipantInfo {
  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<OrderExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_LOGO_MATERIAL_ID = "logo_material_id";
  @SerializedName(SERIALIZED_NAME_LOGO_MATERIAL_ID)
  private String logoMaterialId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_NAME = "short_name";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public OrderParticipantInfo() { 
  }

  public OrderParticipantInfo extInfo(List<OrderExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public OrderParticipantInfo addExtInfoItem(OrderExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * 扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息")

  public List<OrderExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<OrderExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public OrderParticipantInfo logoMaterialId(String logoMaterialId) {
    
    this.logoMaterialId = logoMaterialId;
    return this;
  }

   /**
   * 参与方logo素材id 开发者通过 alipay.merchant.item.file.upload(商品文件上传接口)上传图片，获取到对应的素材 ID( material_id )
   * @return logoMaterialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019010100502200000000000001", value = "参与方logo素材id 开发者通过 alipay.merchant.item.file.upload(商品文件上传接口)上传图片，获取到对应的素材 ID( material_id )")

  public String getLogoMaterialId() {
    return logoMaterialId;
  }


  public void setLogoMaterialId(String logoMaterialId) {
    this.logoMaterialId = logoMaterialId;
  }


  public OrderParticipantInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 参与方名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "东方航空", value = "参与方名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrderParticipantInfo shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * 参与方简称
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "东航", value = "参与方简称")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public OrderParticipantInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 参与方类型
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "服务提供商", value = "参与方类型")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public OrderParticipantInfo uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * 参与方支付宝uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088202905583404", value = "参与方支付宝uid")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderParticipantInfo orderParticipantInfo = (OrderParticipantInfo) o;
    return Objects.equals(this.extInfo, orderParticipantInfo.extInfo) &&
        Objects.equals(this.logoMaterialId, orderParticipantInfo.logoMaterialId) &&
        Objects.equals(this.name, orderParticipantInfo.name) &&
        Objects.equals(this.shortName, orderParticipantInfo.shortName) &&
        Objects.equals(this.type, orderParticipantInfo.type) &&
        Objects.equals(this.uid, orderParticipantInfo.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extInfo, logoMaterialId, name, shortName, type, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderParticipantInfo {\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    logoMaterialId: ").append(toIndentedString(logoMaterialId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("ext_info");
    openapiFields.add("logo_material_id");
    openapiFields.add("name");
    openapiFields.add("short_name");
    openapiFields.add("type");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderParticipantInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderParticipantInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderParticipantInfo is not found in the empty JSON string", OrderParticipantInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderParticipantInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderParticipantInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          OrderExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("logo_material_id") != null && !jsonObj.get("logo_material_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_material_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_material_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("short_name") != null && !jsonObj.get("short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_name").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderParticipantInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderParticipantInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderParticipantInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderParticipantInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderParticipantInfo>() {
           @Override
           public void write(JsonWriter out, OrderParticipantInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderParticipantInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderParticipantInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderParticipantInfo
  * @throws IOException if the JSON string is invalid with respect to OrderParticipantInfo
  */
  public static OrderParticipantInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderParticipantInfo.class);
  }

 /**
  * Convert an instance of OrderParticipantInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

