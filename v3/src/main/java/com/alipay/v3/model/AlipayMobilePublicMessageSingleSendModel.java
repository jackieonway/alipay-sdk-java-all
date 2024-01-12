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
 * AlipayMobilePublicMessageSingleSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMobilePublicMessageSingleSendModel {
  public static final String SERIALIZED_NAME_BIZ_CONTENT = "biz_content";
  @SerializedName(SERIALIZED_NAME_BIZ_CONTENT)
  private String bizContent;

  public AlipayMobilePublicMessageSingleSendModel() { 
  }

  public AlipayMobilePublicMessageSingleSendModel bizContent(String bizContent) {
    
    this.bizContent = bizContent;
    return this;
  }

   /**
   * 业务内容，其中包括模板template和消息接收人toUserId两大块，具体参见“表1-2 服务窗单发模板消息的biz_content参数说明”。  &lt;a href&#x3D;\&quot;https://doc.open.alipay.com/doc2/detail.htm?spm&#x3D;a219a.7386797.0.0.eZqycg&amp;treeId&#x3D;53&amp;articleId&#x3D;103463&amp;docType&#x3D;1\&quot;&gt;详情请见&lt;/a&gt;
   * @return bizContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"toUserId\":\"208876427\",\"template\":{\"context\":{\"amount\":\"20元\",\"cardNo\":\"1855\"},\"templateId\":\"1ff2840464c4463187f5451119de8fea\"}}", value = "业务内容，其中包括模板template和消息接收人toUserId两大块，具体参见“表1-2 服务窗单发模板消息的biz_content参数说明”。  <a href=\"https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7386797.0.0.eZqycg&treeId=53&articleId=103463&docType=1\">详情请见</a>")

  public String getBizContent() {
    return bizContent;
  }


  public void setBizContent(String bizContent) {
    this.bizContent = bizContent;
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
   * @return the AlipayMobilePublicMessageSingleSendModel instance itself
   */
  public AlipayMobilePublicMessageSingleSendModel putAdditionalProperty(String key, Object value) {
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
    AlipayMobilePublicMessageSingleSendModel alipayMobilePublicMessageSingleSendModel = (AlipayMobilePublicMessageSingleSendModel) o;
    return Objects.equals(this.bizContent, alipayMobilePublicMessageSingleSendModel.bizContent)&&
        Objects.equals(this.additionalProperties, alipayMobilePublicMessageSingleSendModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizContent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMobilePublicMessageSingleSendModel {\n");
    sb.append("    bizContent: ").append(toIndentedString(bizContent)).append("\n");
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
    openapiFields.add("biz_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMobilePublicMessageSingleSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMobilePublicMessageSingleSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMobilePublicMessageSingleSendModel is not found in the empty JSON string", AlipayMobilePublicMessageSingleSendModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_content") != null && !jsonObj.get("biz_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMobilePublicMessageSingleSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMobilePublicMessageSingleSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMobilePublicMessageSingleSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMobilePublicMessageSingleSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMobilePublicMessageSingleSendModel>() {
           @Override
           public void write(JsonWriter out, AlipayMobilePublicMessageSingleSendModel value) throws IOException {
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
           public AlipayMobilePublicMessageSingleSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMobilePublicMessageSingleSendModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMobilePublicMessageSingleSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMobilePublicMessageSingleSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMobilePublicMessageSingleSendModel
  */
  public static AlipayMobilePublicMessageSingleSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMobilePublicMessageSingleSendModel.class);
  }

 /**
  * Convert an instance of AlipayMobilePublicMessageSingleSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

