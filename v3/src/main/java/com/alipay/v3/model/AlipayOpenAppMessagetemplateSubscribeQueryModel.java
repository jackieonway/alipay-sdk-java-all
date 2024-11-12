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
 * AlipayOpenAppMessagetemplateSubscribeQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppMessagetemplateSubscribeQueryModel {
  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID_LIST = "template_id_list";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID_LIST)
  private List<String> templateIdList = null;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayOpenAppMessagetemplateSubscribeQueryModel() { 
  }

  public AlipayOpenAppMessagetemplateSubscribeQueryModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝openId，用于支付宝用户在当前应用下的用户标识。
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝openId，用于支付宝用户在当前应用下的用户标识。")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayOpenAppMessagetemplateSubscribeQueryModel templateIdList(List<String> templateIdList) {
    
    this.templateIdList = templateIdList;
    return this;
  }

  public AlipayOpenAppMessagetemplateSubscribeQueryModel addTemplateIdListItem(String templateIdListItem) {
    if (this.templateIdList == null) {
      this.templateIdList = new ArrayList<>();
    }
    this.templateIdList.add(templateIdListItem);
    return this;
  }

   /**
   * 消息模板id，可以填写多个，最多不超过3个。模板id需要保持同一个应用主体，并且展示在同一个订阅组件中的模板id。 模板id获取详情参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/01rnqx\&quot;&gt;模板消息&lt;/a&gt;。
   * @return templateIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"6511999536b14ba5830e3a0289ea69a\",\"0b1fcca882aa435382ae98641e14d37\",\"a3b396be6fd345579221af5dea35028\"]", value = "消息模板id，可以填写多个，最多不超过3个。模板id需要保持同一个应用主体，并且展示在同一个订阅组件中的模板id。 模板id获取详情参见<a href=\"https://opendocs.alipay.com/mini/01rnqx\">模板消息</a>。")

  public List<String> getTemplateIdList() {
    return templateIdList;
  }


  public void setTemplateIdList(List<String> templateIdList) {
    this.templateIdList = templateIdList;
  }


  public AlipayOpenAppMessagetemplateSubscribeQueryModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 订阅消息模板用户的支付宝唯一标识，2088开头。
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20882028****0410", value = "订阅消息模板用户的支付宝唯一标识，2088开头。")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
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
   * @return the AlipayOpenAppMessagetemplateSubscribeQueryModel instance itself
   */
  public AlipayOpenAppMessagetemplateSubscribeQueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenAppMessagetemplateSubscribeQueryModel alipayOpenAppMessagetemplateSubscribeQueryModel = (AlipayOpenAppMessagetemplateSubscribeQueryModel) o;
    return Objects.equals(this.openId, alipayOpenAppMessagetemplateSubscribeQueryModel.openId) &&
        Objects.equals(this.templateIdList, alipayOpenAppMessagetemplateSubscribeQueryModel.templateIdList) &&
        Objects.equals(this.userId, alipayOpenAppMessagetemplateSubscribeQueryModel.userId)&&
        Objects.equals(this.additionalProperties, alipayOpenAppMessagetemplateSubscribeQueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openId, templateIdList, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppMessagetemplateSubscribeQueryModel {\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    templateIdList: ").append(toIndentedString(templateIdList)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("open_id");
    openapiFields.add("template_id_list");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppMessagetemplateSubscribeQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppMessagetemplateSubscribeQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppMessagetemplateSubscribeQueryModel is not found in the empty JSON string", AlipayOpenAppMessagetemplateSubscribeQueryModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("template_id_list") != null && !jsonObj.get("template_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("template_id_list").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppMessagetemplateSubscribeQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppMessagetemplateSubscribeQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppMessagetemplateSubscribeQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppMessagetemplateSubscribeQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppMessagetemplateSubscribeQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppMessagetemplateSubscribeQueryModel value) throws IOException {
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
           public AlipayOpenAppMessagetemplateSubscribeQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAppMessagetemplateSubscribeQueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenAppMessagetemplateSubscribeQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppMessagetemplateSubscribeQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppMessagetemplateSubscribeQueryModel
  */
  public static AlipayOpenAppMessagetemplateSubscribeQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppMessagetemplateSubscribeQueryModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppMessagetemplateSubscribeQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

