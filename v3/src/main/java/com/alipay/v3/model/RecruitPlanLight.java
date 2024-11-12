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
 * RecruitPlanLight
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecruitPlanLight {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENROLL_END_TIME = "enroll_end_time";
  @SerializedName(SERIALIZED_NAME_ENROLL_END_TIME)
  private String enrollEndTime;

  public static final String SERIALIZED_NAME_ENROLL_SCENE_TYPE = "enroll_scene_type";
  @SerializedName(SERIALIZED_NAME_ENROLL_SCENE_TYPE)
  private String enrollSceneType;

  public static final String SERIALIZED_NAME_ENROLL_START_TIME = "enroll_start_time";
  @SerializedName(SERIALIZED_NAME_ENROLL_START_TIME)
  private String enrollStartTime;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PLAN_NAME = "plan_name";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public RecruitPlanLight() { 
  }

  public RecruitPlanLight description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 招商方案描述：富文本内容，可能包含html标签
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<p><span style=\\\"color:#000000\\\"><span style=\\\"font-size:14px\\\"><span style=\\\"background-color:#ffffff\\\">招商规则说明</span></span></span></p>", value = "招商方案描述：富文本内容，可能包含html标签")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RecruitPlanLight enrollEndTime(String enrollEndTime) {
    
    this.enrollEndTime = enrollEndTime;
    return this;
  }

   /**
   * 报名结束时间
   * @return enrollEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 01:01:01", value = "报名结束时间")

  public String getEnrollEndTime() {
    return enrollEndTime;
  }


  public void setEnrollEndTime(String enrollEndTime) {
    this.enrollEndTime = enrollEndTime;
  }


  public RecruitPlanLight enrollSceneType(String enrollSceneType) {
    
    this.enrollSceneType = enrollSceneType;
    return this;
  }

   /**
   * 招商方案所属报名场景 枚举值： VOUCHER：券报名场景； MINI_APP：小程序报名场景；
   * @return enrollSceneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VOUCHER", value = "招商方案所属报名场景 枚举值： VOUCHER：券报名场景； MINI_APP：小程序报名场景；")

  public String getEnrollSceneType() {
    return enrollSceneType;
  }


  public void setEnrollSceneType(String enrollSceneType) {
    this.enrollSceneType = enrollSceneType;
  }


  public RecruitPlanLight enrollStartTime(String enrollStartTime) {
    
    this.enrollStartTime = enrollStartTime;
    return this;
  }

   /**
   * 报名开始时间
   * @return enrollStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 01:01:01", value = "报名开始时间")

  public String getEnrollStartTime() {
    return enrollStartTime;
  }


  public void setEnrollStartTime(String enrollStartTime) {
    this.enrollStartTime = enrollStartTime;
  }


  public RecruitPlanLight logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * 方案头图链接，150x150 以上尺寸的方形图片
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://xxxx", value = "方案头图链接，150x150 以上尺寸的方形图片")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public RecruitPlanLight planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * 招商方案ID
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021041201000100000000999999", value = "招商方案ID")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public RecruitPlanLight planName(String planName) {
    
    this.planName = planName;
    return this;
  }

   /**
   * 招商方案名称
   * @return planName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "中秋招商方案", value = "招商方案名称")

  public String getPlanName() {
    return planName;
  }


  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public RecruitPlanLight status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 招商方案状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENABLED", value = "招商方案状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the RecruitPlanLight instance itself
   */
  public RecruitPlanLight putAdditionalProperty(String key, Object value) {
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
    RecruitPlanLight recruitPlanLight = (RecruitPlanLight) o;
    return Objects.equals(this.description, recruitPlanLight.description) &&
        Objects.equals(this.enrollEndTime, recruitPlanLight.enrollEndTime) &&
        Objects.equals(this.enrollSceneType, recruitPlanLight.enrollSceneType) &&
        Objects.equals(this.enrollStartTime, recruitPlanLight.enrollStartTime) &&
        Objects.equals(this.logo, recruitPlanLight.logo) &&
        Objects.equals(this.planId, recruitPlanLight.planId) &&
        Objects.equals(this.planName, recruitPlanLight.planName) &&
        Objects.equals(this.status, recruitPlanLight.status)&&
        Objects.equals(this.additionalProperties, recruitPlanLight.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enrollEndTime, enrollSceneType, enrollStartTime, logo, planId, planName, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitPlanLight {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enrollEndTime: ").append(toIndentedString(enrollEndTime)).append("\n");
    sb.append("    enrollSceneType: ").append(toIndentedString(enrollSceneType)).append("\n");
    sb.append("    enrollStartTime: ").append(toIndentedString(enrollStartTime)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("enroll_end_time");
    openapiFields.add("enroll_scene_type");
    openapiFields.add("enroll_start_time");
    openapiFields.add("logo");
    openapiFields.add("plan_id");
    openapiFields.add("plan_name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecruitPlanLight
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RecruitPlanLight.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecruitPlanLight is not found in the empty JSON string", RecruitPlanLight.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("enroll_end_time") != null && !jsonObj.get("enroll_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_end_time").toString()));
      }
      if (jsonObj.get("enroll_scene_type") != null && !jsonObj.get("enroll_scene_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_scene_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_scene_type").toString()));
      }
      if (jsonObj.get("enroll_start_time") != null && !jsonObj.get("enroll_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_start_time").toString()));
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if (jsonObj.get("plan_name") != null && !jsonObj.get("plan_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_name").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecruitPlanLight.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecruitPlanLight' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecruitPlanLight> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecruitPlanLight.class));

       return (TypeAdapter<T>) new TypeAdapter<RecruitPlanLight>() {
           @Override
           public void write(JsonWriter out, RecruitPlanLight value) throws IOException {
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
           public RecruitPlanLight read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecruitPlanLight instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RecruitPlanLight given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecruitPlanLight
  * @throws IOException if the JSON string is invalid with respect to RecruitPlanLight
  */
  public static RecruitPlanLight fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecruitPlanLight.class);
  }

 /**
  * Convert an instance of RecruitPlanLight to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

