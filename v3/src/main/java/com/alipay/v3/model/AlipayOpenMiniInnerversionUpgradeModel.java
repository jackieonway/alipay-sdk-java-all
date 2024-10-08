/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-08
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
 * AlipayOpenMiniInnerversionUpgradeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionUpgradeModel {
  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private String appOrigin;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_VERSION = "template_version";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VERSION)
  private String templateVersion;

  public AlipayOpenMiniInnerversionUpgradeModel() { 
  }

  public AlipayOpenMiniInnerversionUpgradeModel appOrigin(String appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入。
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAA", value = "来源类型，新接入方需要向支付宝申请专用来源，否则不予接入。")

  public String getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(String appOrigin) {
    this.appOrigin = appOrigin;
  }


  public AlipayOpenMiniInnerversionUpgradeModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 端ID，多端场景下区分不同端
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.alipaywallet", value = "端ID，多端场景下区分不同端")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniInnerversionUpgradeModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID，特殊场景专用，普通业务方无需关注该参数。
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019032163637016", value = "小程序ID，特殊场景专用，普通业务方无需关注该参数。")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerversionUpgradeModel templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 用于升级的模板id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019032163637014", value = "用于升级的模板id")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public AlipayOpenMiniInnerversionUpgradeModel templateVersion(String templateVersion) {
    
    this.templateVersion = templateVersion;
    return this;
  }

   /**
   * 用于升级的模板版本号，版本号必须满足 x.y.z, 且均为数字
   * @return templateVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.3", value = "用于升级的模板版本号，版本号必须满足 x.y.z, 且均为数字")

  public String getTemplateVersion() {
    return templateVersion;
  }


  public void setTemplateVersion(String templateVersion) {
    this.templateVersion = templateVersion;
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
   * @return the AlipayOpenMiniInnerversionUpgradeModel instance itself
   */
  public AlipayOpenMiniInnerversionUpgradeModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniInnerversionUpgradeModel alipayOpenMiniInnerversionUpgradeModel = (AlipayOpenMiniInnerversionUpgradeModel) o;
    return Objects.equals(this.appOrigin, alipayOpenMiniInnerversionUpgradeModel.appOrigin) &&
        Objects.equals(this.bundleId, alipayOpenMiniInnerversionUpgradeModel.bundleId) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerversionUpgradeModel.miniAppId) &&
        Objects.equals(this.templateId, alipayOpenMiniInnerversionUpgradeModel.templateId) &&
        Objects.equals(this.templateVersion, alipayOpenMiniInnerversionUpgradeModel.templateVersion)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniInnerversionUpgradeModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appOrigin, bundleId, miniAppId, templateId, templateVersion, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionUpgradeModel {\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
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
    openapiFields.add("app_origin");
    openapiFields.add("bundle_id");
    openapiFields.add("mini_app_id");
    openapiFields.add("template_id");
    openapiFields.add("template_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionUpgradeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionUpgradeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionUpgradeModel is not found in the empty JSON string", AlipayOpenMiniInnerversionUpgradeModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("app_origin") != null && !jsonObj.get("app_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_origin").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (jsonObj.get("template_version") != null && !jsonObj.get("template_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionUpgradeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionUpgradeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionUpgradeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionUpgradeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionUpgradeModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionUpgradeModel value) throws IOException {
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
           public AlipayOpenMiniInnerversionUpgradeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniInnerversionUpgradeModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniInnerversionUpgradeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionUpgradeModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionUpgradeModel
  */
  public static AlipayOpenMiniInnerversionUpgradeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionUpgradeModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionUpgradeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

