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
 * SubButton
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubButton {
  public static final String SERIALIZED_NAME_ACTION_PARAM = "action_param";
  @SerializedName(SERIALIZED_NAME_ACTION_PARAM)
  private String actionParam;

  public static final String SERIALIZED_NAME_ACTION_TYPE = "action_type";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private String actionType;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public SubButton() { 
  }

  public SubButton actionParam(String actionParam) {
    
    this.actionParam = actionParam;
    return this;
  }

   /**
   * 当actionType为link时，该参数为url链接；   当actionType为out时，该参数为用户自定义参数；   当actionType为tel时，该参数为电话号码。   当action_type为map时，该参数为查看地图的关键字。   当action_type为consumption时，该参数可不传。   该参数最长255个字符，不允许冒号等特殊字符。
   * @return actionParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "当actionType为link时，该参数为url链接；   当actionType为out时，该参数为用户自定义参数；   当actionType为tel时，该参数为电话号码。   当action_type为map时，该参数为查看地图的关键字。   当action_type为consumption时，该参数可不传。   该参数最长255个字符，不允许冒号等特殊字符。")

  public String getActionParam() {
    return actionParam;
  }


  public void setActionParam(String actionParam) {
    this.actionParam = actionParam;
  }


  public SubButton actionType(String actionType) {
    
    this.actionType = actionType;
    return this;
  }

   /**
   * 菜单类型：  out——事件型菜单；  link——链接型菜单；  tel——点击拨打电话；  map——点击查看地图；  consumption——点击查看用户与生活号管理员账号之间的消费记录
   * @return actionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "菜单类型：  out——事件型菜单；  link——链接型菜单；  tel——点击拨打电话；  map——点击查看地图；  consumption——点击查看用户与生活号管理员账号之间的消费记录")

  public String getActionType() {
    return actionType;
  }


  public void setActionType(String actionType) {
    this.actionType = actionType;
  }


  public SubButton icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * icon图片url，必须是http协议的url，尺寸为60X60，最大不超过5M，请先调用&lt;a href&#x3D;\&quot;https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload\&quot;&gt; 图片上传接口&lt;/a&gt;获得图片url
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "icon图片url，必须是http协议的url，尺寸为60X60，最大不超过5M，请先调用<a href=\"https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload\"> 图片上传接口</a>获得图片url")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public SubButton name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 菜单名称，icon菜单名称不超过5个汉字，文本菜单名称不超过9个汉字，编码格式为GBK
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "菜单名称，icon菜单名称不超过5个汉字，文本菜单名称不超过9个汉字，编码格式为GBK")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
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
   * @return the SubButton instance itself
   */
  public SubButton putAdditionalProperty(String key, Object value) {
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
    SubButton subButton = (SubButton) o;
    return Objects.equals(this.actionParam, subButton.actionParam) &&
        Objects.equals(this.actionType, subButton.actionType) &&
        Objects.equals(this.icon, subButton.icon) &&
        Objects.equals(this.name, subButton.name)&&
        Objects.equals(this.additionalProperties, subButton.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionParam, actionType, icon, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubButton {\n");
    sb.append("    actionParam: ").append(toIndentedString(actionParam)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("action_param");
    openapiFields.add("action_type");
    openapiFields.add("icon");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubButton
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubButton.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubButton is not found in the empty JSON string", SubButton.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("action_param") != null && !jsonObj.get("action_param").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_param` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_param").toString()));
      }
      if (jsonObj.get("action_type") != null && !jsonObj.get("action_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_type").toString()));
      }
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubButton.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubButton' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubButton> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubButton.class));

       return (TypeAdapter<T>) new TypeAdapter<SubButton>() {
           @Override
           public void write(JsonWriter out, SubButton value) throws IOException {
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
           public SubButton read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SubButton instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SubButton given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubButton
  * @throws IOException if the JSON string is invalid with respect to SubButton
  */
  public static SubButton fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubButton.class);
  }

 /**
  * Convert an instance of SubButton to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

