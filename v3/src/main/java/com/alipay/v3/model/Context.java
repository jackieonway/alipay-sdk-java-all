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
import com.alipay.v3.model.Keyword;
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
 * Context
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Context {
  public static final String SERIALIZED_NAME_ACTION_NAME = "action_name";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private Keyword first;

  public static final String SERIALIZED_NAME_HEAD_COLOR = "head_color";
  @SerializedName(SERIALIZED_NAME_HEAD_COLOR)
  private String headColor;

  public static final String SERIALIZED_NAME_KEYWORD1 = "keyword1";
  @SerializedName(SERIALIZED_NAME_KEYWORD1)
  private Keyword keyword1;

  public static final String SERIALIZED_NAME_KEYWORD2 = "keyword2";
  @SerializedName(SERIALIZED_NAME_KEYWORD2)
  private Keyword keyword2;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private Keyword remark;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public Context() { 
  }

  public Context actionName(String actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * 底部链接描述文字，如“查看详情”，最多能传8个汉字或16个英文字符，长度超出会报错
   * @return actionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "查看详情", value = "底部链接描述文字，如“查看详情”，最多能传8个汉字或16个英文字符，长度超出会报错")

  public String getActionName() {
    return actionName;
  }


  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public Context first(Keyword first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Keyword getFirst() {
    return first;
  }


  public void setFirst(Keyword first) {
    this.first = first;
  }


  public Context headColor(String headColor) {
    
    this.headColor = headColor;
    return this;
  }

   /**
   * 顶部色条的色值
   * @return headColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "#85be53", value = "顶部色条的色值")

  public String getHeadColor() {
    return headColor;
  }


  public void setHeadColor(String headColor) {
    this.headColor = headColor;
  }


  public Context keyword1(Keyword keyword1) {
    
    this.keyword1 = keyword1;
    return this;
  }

   /**
   * Get keyword1
   * @return keyword1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Keyword getKeyword1() {
    return keyword1;
  }


  public void setKeyword1(Keyword keyword1) {
    this.keyword1 = keyword1;
  }


  public Context keyword2(Keyword keyword2) {
    
    this.keyword2 = keyword2;
    return this;
  }

   /**
   * Get keyword2
   * @return keyword2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Keyword getKeyword2() {
    return keyword2;
  }


  public void setKeyword2(Keyword keyword2) {
    this.keyword2 = keyword2;
  }


  public Context remark(Keyword remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Keyword getRemark() {
    return remark;
  }


  public void setRemark(Keyword remark) {
    this.remark = remark;
  }


  public Context url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 点击消息后承接页的地址
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://m.baidu.com", value = "点击消息后承接页的地址")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
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
   * @return the Context instance itself
   */
  public Context putAdditionalProperty(String key, Object value) {
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
    Context context = (Context) o;
    return Objects.equals(this.actionName, context.actionName) &&
        Objects.equals(this.first, context.first) &&
        Objects.equals(this.headColor, context.headColor) &&
        Objects.equals(this.keyword1, context.keyword1) &&
        Objects.equals(this.keyword2, context.keyword2) &&
        Objects.equals(this.remark, context.remark) &&
        Objects.equals(this.url, context.url)&&
        Objects.equals(this.additionalProperties, context.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, first, headColor, keyword1, keyword2, remark, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    headColor: ").append(toIndentedString(headColor)).append("\n");
    sb.append("    keyword1: ").append(toIndentedString(keyword1)).append("\n");
    sb.append("    keyword2: ").append(toIndentedString(keyword2)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("action_name");
    openapiFields.add("first");
    openapiFields.add("head_color");
    openapiFields.add("keyword1");
    openapiFields.add("keyword2");
    openapiFields.add("remark");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Context
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Context.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Context is not found in the empty JSON string", Context.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("action_name") != null && !jsonObj.get("action_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_name").toString()));
      }
      // validate the optional field `first`
      if (jsonObj.getAsJsonObject("first") != null) {
        Keyword.validateJsonObject(jsonObj.getAsJsonObject("first"));
      }
      if (jsonObj.get("head_color") != null && !jsonObj.get("head_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_color").toString()));
      }
      // validate the optional field `keyword1`
      if (jsonObj.getAsJsonObject("keyword1") != null) {
        Keyword.validateJsonObject(jsonObj.getAsJsonObject("keyword1"));
      }
      // validate the optional field `keyword2`
      if (jsonObj.getAsJsonObject("keyword2") != null) {
        Keyword.validateJsonObject(jsonObj.getAsJsonObject("keyword2"));
      }
      // validate the optional field `remark`
      if (jsonObj.getAsJsonObject("remark") != null) {
        Keyword.validateJsonObject(jsonObj.getAsJsonObject("remark"));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Context.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Context' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Context> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Context.class));

       return (TypeAdapter<T>) new TypeAdapter<Context>() {
           @Override
           public void write(JsonWriter out, Context value) throws IOException {
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
           public Context read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Context instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Context given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Context
  * @throws IOException if the JSON string is invalid with respect to Context
  */
  public static Context fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Context.class);
  }

 /**
  * Convert an instance of Context to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

