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
 * AlipayOpenAppServiceSchemaQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppServiceSchemaQueryResponseModel {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private String schemaVersion;

  public static final String SERIALIZED_NAME_SCHEMA_XML = "schema_xml";
  @SerializedName(SERIALIZED_NAME_SCHEMA_XML)
  private String schemaXml;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template_type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private String templateType;

  public static final String SERIALIZED_NAME_USER_SERVICE_DELIVERY_TYPE = "user_service_delivery_type";
  @SerializedName(SERIALIZED_NAME_USER_SERVICE_DELIVERY_TYPE)
  private String userServiceDeliveryType;

  public AlipayOpenAppServiceSchemaQueryResponseModel() { 
  }

  public AlipayOpenAppServiceSchemaQueryResponseModel categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 类目id
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c11111", value = "类目id")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public AlipayOpenAppServiceSchemaQueryResponseModel schemaVersion(String schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * 服务schema版本
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v1.0", value = "服务schema版本")

  public String getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  public AlipayOpenAppServiceSchemaQueryResponseModel schemaXml(String schemaXml) {
    
    this.schemaXml = schemaXml;
    return this;
  }

   /**
   * 服务schema
   * @return schemaXml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<serviceSchema><attribute id=\"serviceName\" name=\"服务名称\" type=\"single\" valueType=\"text\"><rules><rule type=\"valid\" code=\"maxLength\" name=\"最大长度\" value=\"10\"/><rule type=\"valid\" code=\"reg\" name=\"正则表达式\" value=\"[^A-Za-z0-9一-龥]\"/><rule type=\"tips\" code=\"inputTip\" name=\"底纹提示文案\" value=\"请输入服务名称,不超过8个字符,不含特殊字符\"/></rules></attribute></serviceSchema>", value = "服务schema")

  public String getSchemaXml() {
    return schemaXml;
  }


  public void setSchemaXml(String schemaXml) {
    this.schemaXml = schemaXml;
  }


  public AlipayOpenAppServiceSchemaQueryResponseModel templateType(String templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * 服务模版类型，默认值: DEFAULT
   * @return templateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "服务模版类型，默认值: DEFAULT")

  public String getTemplateType() {
    return templateType;
  }


  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }


  public AlipayOpenAppServiceSchemaQueryResponseModel userServiceDeliveryType(String userServiceDeliveryType) {
    
    this.userServiceDeliveryType = userServiceDeliveryType;
    return this;
  }

   /**
   * 商户提报服务履约类型
   * @return userServiceDeliveryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRADE_SERVICE_DELIVERY", value = "商户提报服务履约类型")

  public String getUserServiceDeliveryType() {
    return userServiceDeliveryType;
  }


  public void setUserServiceDeliveryType(String userServiceDeliveryType) {
    this.userServiceDeliveryType = userServiceDeliveryType;
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
   * @return the AlipayOpenAppServiceSchemaQueryResponseModel instance itself
   */
  public AlipayOpenAppServiceSchemaQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenAppServiceSchemaQueryResponseModel alipayOpenAppServiceSchemaQueryResponseModel = (AlipayOpenAppServiceSchemaQueryResponseModel) o;
    return Objects.equals(this.categoryId, alipayOpenAppServiceSchemaQueryResponseModel.categoryId) &&
        Objects.equals(this.schemaVersion, alipayOpenAppServiceSchemaQueryResponseModel.schemaVersion) &&
        Objects.equals(this.schemaXml, alipayOpenAppServiceSchemaQueryResponseModel.schemaXml) &&
        Objects.equals(this.templateType, alipayOpenAppServiceSchemaQueryResponseModel.templateType) &&
        Objects.equals(this.userServiceDeliveryType, alipayOpenAppServiceSchemaQueryResponseModel.userServiceDeliveryType)&&
        Objects.equals(this.additionalProperties, alipayOpenAppServiceSchemaQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, schemaVersion, schemaXml, templateType, userServiceDeliveryType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppServiceSchemaQueryResponseModel {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    schemaXml: ").append(toIndentedString(schemaXml)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    userServiceDeliveryType: ").append(toIndentedString(userServiceDeliveryType)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("schema_version");
    openapiFields.add("schema_xml");
    openapiFields.add("template_type");
    openapiFields.add("user_service_delivery_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppServiceSchemaQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppServiceSchemaQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppServiceSchemaQueryResponseModel is not found in the empty JSON string", AlipayOpenAppServiceSchemaQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("schema_version") != null && !jsonObj.get("schema_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_version").toString()));
      }
      if (jsonObj.get("schema_xml") != null && !jsonObj.get("schema_xml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_xml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_xml").toString()));
      }
      if (jsonObj.get("template_type") != null && !jsonObj.get("template_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_type").toString()));
      }
      if (jsonObj.get("user_service_delivery_type") != null && !jsonObj.get("user_service_delivery_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_service_delivery_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_service_delivery_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppServiceSchemaQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppServiceSchemaQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppServiceSchemaQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppServiceSchemaQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppServiceSchemaQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppServiceSchemaQueryResponseModel value) throws IOException {
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
           public AlipayOpenAppServiceSchemaQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAppServiceSchemaQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenAppServiceSchemaQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppServiceSchemaQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppServiceSchemaQueryResponseModel
  */
  public static AlipayOpenAppServiceSchemaQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppServiceSchemaQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppServiceSchemaQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

