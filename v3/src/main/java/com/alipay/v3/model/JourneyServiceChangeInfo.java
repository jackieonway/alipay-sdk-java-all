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
 * JourneyServiceChangeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JourneyServiceChangeInfo {
  public static final String SERIALIZED_NAME_CHANGE_STATUS = "change_status";
  @SerializedName(SERIALIZED_NAME_CHANGE_STATUS)
  private String changeStatus;

  public static final String SERIALIZED_NAME_DETAIL_URL = "detail_url";
  @SerializedName(SERIALIZED_NAME_DETAIL_URL)
  private String detailUrl;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<OrderExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_REMIND_CONTENT = "remind_content";
  @SerializedName(SERIALIZED_NAME_REMIND_CONTENT)
  private String remindContent;

  public JourneyServiceChangeInfo() { 
  }

  public JourneyServiceChangeInfo changeStatus(String changeStatus) {
    
    this.changeStatus = changeStatus;
    return this;
  }

   /**
   * 变更状态
   * @return changeStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DELAY", value = "变更状态")

  public String getChangeStatus() {
    return changeStatus;
  }


  public void setChangeStatus(String changeStatus) {
    this.changeStatus = changeStatus;
  }


  public JourneyServiceChangeInfo detailUrl(String detailUrl) {
    
    this.detailUrl = detailUrl;
    return this;
  }

   /**
   * 详情url
   * @return detailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startApp?appId=2019050664392666&page=page/test/detailurl", value = "详情url")

  public String getDetailUrl() {
    return detailUrl;
  }


  public void setDetailUrl(String detailUrl) {
    this.detailUrl = detailUrl;
  }


  public JourneyServiceChangeInfo extInfo(List<OrderExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public JourneyServiceChangeInfo addExtInfoItem(OrderExtInfo extInfoItem) {
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


  public JourneyServiceChangeInfo remindContent(String remindContent) {
    
    this.remindContent = remindContent;
    return this;
  }

   /**
   * 提醒内容
   * @return remindContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "该航班预计起飞时间由2月1日14:40延后至2月2日01:00。", value = "提醒内容")

  public String getRemindContent() {
    return remindContent;
  }


  public void setRemindContent(String remindContent) {
    this.remindContent = remindContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyServiceChangeInfo journeyServiceChangeInfo = (JourneyServiceChangeInfo) o;
    return Objects.equals(this.changeStatus, journeyServiceChangeInfo.changeStatus) &&
        Objects.equals(this.detailUrl, journeyServiceChangeInfo.detailUrl) &&
        Objects.equals(this.extInfo, journeyServiceChangeInfo.extInfo) &&
        Objects.equals(this.remindContent, journeyServiceChangeInfo.remindContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeStatus, detailUrl, extInfo, remindContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyServiceChangeInfo {\n");
    sb.append("    changeStatus: ").append(toIndentedString(changeStatus)).append("\n");
    sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    remindContent: ").append(toIndentedString(remindContent)).append("\n");
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
    openapiFields.add("change_status");
    openapiFields.add("detail_url");
    openapiFields.add("ext_info");
    openapiFields.add("remind_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JourneyServiceChangeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JourneyServiceChangeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JourneyServiceChangeInfo is not found in the empty JSON string", JourneyServiceChangeInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JourneyServiceChangeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JourneyServiceChangeInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("change_status") != null && !jsonObj.get("change_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `change_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("change_status").toString()));
      }
      if (jsonObj.get("detail_url") != null && !jsonObj.get("detail_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail_url").toString()));
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
      if (jsonObj.get("remind_content") != null && !jsonObj.get("remind_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remind_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remind_content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JourneyServiceChangeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JourneyServiceChangeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JourneyServiceChangeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JourneyServiceChangeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<JourneyServiceChangeInfo>() {
           @Override
           public void write(JsonWriter out, JourneyServiceChangeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JourneyServiceChangeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JourneyServiceChangeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JourneyServiceChangeInfo
  * @throws IOException if the JSON string is invalid with respect to JourneyServiceChangeInfo
  */
  public static JourneyServiceChangeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JourneyServiceChangeInfo.class);
  }

 /**
  * Convert an instance of JourneyServiceChangeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

