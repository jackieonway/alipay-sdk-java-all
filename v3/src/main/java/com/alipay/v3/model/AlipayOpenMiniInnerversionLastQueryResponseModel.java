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
 * AlipayOpenMiniInnerversionLastQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionLastQueryResponseModel {
  public static final String SERIALIZED_NAME_APP_DESC = "app_desc";
  @SerializedName(SERIALIZED_NAME_APP_DESC)
  private String appDesc;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "category_ids";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private String categoryIds;

  public static final String SERIALIZED_NAME_ENGLISH_NAME = "english_name";
  @SerializedName(SERIALIZED_NAME_ENGLISH_NAME)
  private String englishName;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_SERVICE_PHONE = "service_phone";
  @SerializedName(SERIALIZED_NAME_SERVICE_PHONE)
  private String servicePhone;

  public static final String SERIALIZED_NAME_SLOGAN = "slogan";
  @SerializedName(SERIALIZED_NAME_SLOGAN)
  private String slogan;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUB_APPLICATION_TYPE = "sub_application_type";
  @SerializedName(SERIALIZED_NAME_SUB_APPLICATION_TYPE)
  private String subApplicationType;

  public AlipayOpenMiniInnerversionLastQueryResponseModel() { 
  }

  public AlipayOpenMiniInnerversionLastQueryResponseModel appDesc(String appDesc) {
    
    this.appDesc = appDesc;
    return this;
  }

   /**
   * 小程序应用描述
   * @return appDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序官方示例Demo，展示已支持的接口能力及组件", value = "小程序应用描述")

  public String getAppDesc() {
    return appDesc;
  }


  public void setAppDesc(String appDesc) {
    this.appDesc = appDesc;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序的名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序名称", value = "小程序的名称")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 版本号
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0.1", value = "版本号")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 端信息
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝：com.alipay.alipaywallet 高德：com.amap.app", value = "端信息")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel categoryIds(String categoryIds) {
    
    this.categoryIds = categoryIds;
    return this;
  }

   /**
   * 小程序所属类目
   * @return categoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "107209_107226", value = "小程序所属类目")

  public String getCategoryIds() {
    return categoryIds;
  }


  public void setCategoryIds(String categoryIds) {
    this.categoryIds = categoryIds;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel englishName(String englishName) {
    
    this.englishName = englishName;
    return this;
  }

   /**
   * 小程序英文名称
   * @return englishName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xiaochengxu", value = "小程序英文名称")

  public String getEnglishName() {
    return englishName;
  }


  public void setEnglishName(String englishName) {
    this.englishName = englishName;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * 小程序应用logo图标
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/04843e84-f1fd-4717-a230-1c72de99aa5d.png", value = "小程序应用logo图标")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018********", value = "小程序ID")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel servicePhone(String servicePhone) {
    
    this.servicePhone = servicePhone;
    return this;
  }

   /**
   * 小程序客服电话
   * @return servicePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13110101010", value = "小程序客服电话")

  public String getServicePhone() {
    return servicePhone;
  }


  public void setServicePhone(String servicePhone) {
    this.servicePhone = servicePhone;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel slogan(String slogan) {
    
    this.slogan = slogan;
    return this;
  }

   /**
   * 小程序应用简介，一句话描述小程序功能
   * @return slogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "提供小程序示例功能", value = "小程序应用简介，一句话描述小程序功能")

  public String getSlogan() {
    return slogan;
  }


  public void setSlogan(String slogan) {
    this.slogan = slogan;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 版本状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INIT", value = "版本状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenMiniInnerversionLastQueryResponseModel subApplicationType(String subApplicationType) {
    
    this.subApplicationType = subApplicationType;
    return this;
  }

   /**
   * 小程序子类型，自研、模板类型
   * @return subApplicationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TINY_NORMAL", value = "小程序子类型，自研、模板类型")

  public String getSubApplicationType() {
    return subApplicationType;
  }


  public void setSubApplicationType(String subApplicationType) {
    this.subApplicationType = subApplicationType;
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
   * @return the AlipayOpenMiniInnerversionLastQueryResponseModel instance itself
   */
  public AlipayOpenMiniInnerversionLastQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniInnerversionLastQueryResponseModel alipayOpenMiniInnerversionLastQueryResponseModel = (AlipayOpenMiniInnerversionLastQueryResponseModel) o;
    return Objects.equals(this.appDesc, alipayOpenMiniInnerversionLastQueryResponseModel.appDesc) &&
        Objects.equals(this.appName, alipayOpenMiniInnerversionLastQueryResponseModel.appName) &&
        Objects.equals(this.appVersion, alipayOpenMiniInnerversionLastQueryResponseModel.appVersion) &&
        Objects.equals(this.bundleId, alipayOpenMiniInnerversionLastQueryResponseModel.bundleId) &&
        Objects.equals(this.categoryIds, alipayOpenMiniInnerversionLastQueryResponseModel.categoryIds) &&
        Objects.equals(this.englishName, alipayOpenMiniInnerversionLastQueryResponseModel.englishName) &&
        Objects.equals(this.logoUrl, alipayOpenMiniInnerversionLastQueryResponseModel.logoUrl) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerversionLastQueryResponseModel.miniAppId) &&
        Objects.equals(this.servicePhone, alipayOpenMiniInnerversionLastQueryResponseModel.servicePhone) &&
        Objects.equals(this.slogan, alipayOpenMiniInnerversionLastQueryResponseModel.slogan) &&
        Objects.equals(this.status, alipayOpenMiniInnerversionLastQueryResponseModel.status) &&
        Objects.equals(this.subApplicationType, alipayOpenMiniInnerversionLastQueryResponseModel.subApplicationType)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniInnerversionLastQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDesc, appName, appVersion, bundleId, categoryIds, englishName, logoUrl, miniAppId, servicePhone, slogan, status, subApplicationType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionLastQueryResponseModel {\n");
    sb.append("    appDesc: ").append(toIndentedString(appDesc)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    servicePhone: ").append(toIndentedString(servicePhone)).append("\n");
    sb.append("    slogan: ").append(toIndentedString(slogan)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subApplicationType: ").append(toIndentedString(subApplicationType)).append("\n");
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
    openapiFields.add("app_desc");
    openapiFields.add("app_name");
    openapiFields.add("app_version");
    openapiFields.add("bundle_id");
    openapiFields.add("category_ids");
    openapiFields.add("english_name");
    openapiFields.add("logo_url");
    openapiFields.add("mini_app_id");
    openapiFields.add("service_phone");
    openapiFields.add("slogan");
    openapiFields.add("status");
    openapiFields.add("sub_application_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionLastQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionLastQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionLastQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniInnerversionLastQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("app_desc") != null && !jsonObj.get("app_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_desc").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("category_ids") != null && !jsonObj.get("category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_ids").toString()));
      }
      if (jsonObj.get("english_name") != null && !jsonObj.get("english_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `english_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("english_name").toString()));
      }
      if (jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("service_phone") != null && !jsonObj.get("service_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_phone").toString()));
      }
      if (jsonObj.get("slogan") != null && !jsonObj.get("slogan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slogan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slogan").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("sub_application_type") != null && !jsonObj.get("sub_application_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_application_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_application_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionLastQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionLastQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionLastQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionLastQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionLastQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionLastQueryResponseModel value) throws IOException {
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
           public AlipayOpenMiniInnerversionLastQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniInnerversionLastQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniInnerversionLastQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionLastQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionLastQueryResponseModel
  */
  public static AlipayOpenMiniInnerversionLastQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionLastQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionLastQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

