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
 * McardTemplateBenefitQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class McardTemplateBenefitQuery {
  public static final String SERIALIZED_NAME_BENEFIT_DESC = "benefit_desc";
  @SerializedName(SERIALIZED_NAME_BENEFIT_DESC)
  private String benefitDesc;

  public static final String SERIALIZED_NAME_BENEFIT_ID = "benefit_id";
  @SerializedName(SERIALIZED_NAME_BENEFIT_ID)
  private String benefitId;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public McardTemplateBenefitQuery() { 
  }

  public McardTemplateBenefitQuery benefitDesc(String benefitDesc) {
    
    this.benefitDesc = benefitDesc;
    return this;
  }

   /**
   * 权益描述信息
   * @return benefitDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "使用会员卡享8折优惠", value = "权益描述信息")

  public String getBenefitDesc() {
    return benefitDesc;
  }


  public void setBenefitDesc(String benefitDesc) {
    this.benefitDesc = benefitDesc;
  }


  public McardTemplateBenefitQuery benefitId(String benefitId) {
    
    this.benefitId = benefitId;
    return this;
  }

   /**
   * 权益ID
   * @return benefitId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170322000000000068101000300041", value = "权益ID")

  public String getBenefitId() {
    return benefitId;
  }


  public void setBenefitId(String benefitId) {
    this.benefitId = benefitId;
  }


  public McardTemplateBenefitQuery endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 权益结束时间
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-04-18 15:10:23", value = "权益结束时间")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public McardTemplateBenefitQuery extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 会员卡模板权益扩展信息：JSON格式; openUrl 说明：跳转到商户的优惠活动页面
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"openUrl\":\"http://www.koubei.com\"}", value = "会员卡模板权益扩展信息：JSON格式; openUrl 说明：跳转到商户的优惠活动页面")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public McardTemplateBenefitQuery startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 权益开始时间
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-04-18 15:10:23", value = "权益开始时间")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public McardTemplateBenefitQuery templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 会员卡模板ID
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170322000000000068101000300041", value = "会员卡模板ID")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public McardTemplateBenefitQuery title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 权益标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "使用会员卡消费享8折优惠", value = "权益标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
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
   * @return the McardTemplateBenefitQuery instance itself
   */
  public McardTemplateBenefitQuery putAdditionalProperty(String key, Object value) {
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
    McardTemplateBenefitQuery mcardTemplateBenefitQuery = (McardTemplateBenefitQuery) o;
    return Objects.equals(this.benefitDesc, mcardTemplateBenefitQuery.benefitDesc) &&
        Objects.equals(this.benefitId, mcardTemplateBenefitQuery.benefitId) &&
        Objects.equals(this.endDate, mcardTemplateBenefitQuery.endDate) &&
        Objects.equals(this.extInfo, mcardTemplateBenefitQuery.extInfo) &&
        Objects.equals(this.startDate, mcardTemplateBenefitQuery.startDate) &&
        Objects.equals(this.templateId, mcardTemplateBenefitQuery.templateId) &&
        Objects.equals(this.title, mcardTemplateBenefitQuery.title)&&
        Objects.equals(this.additionalProperties, mcardTemplateBenefitQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefitDesc, benefitId, endDate, extInfo, startDate, templateId, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McardTemplateBenefitQuery {\n");
    sb.append("    benefitDesc: ").append(toIndentedString(benefitDesc)).append("\n");
    sb.append("    benefitId: ").append(toIndentedString(benefitId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("benefit_desc");
    openapiFields.add("benefit_id");
    openapiFields.add("end_date");
    openapiFields.add("ext_info");
    openapiFields.add("start_date");
    openapiFields.add("template_id");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to McardTemplateBenefitQuery
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (McardTemplateBenefitQuery.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in McardTemplateBenefitQuery is not found in the empty JSON string", McardTemplateBenefitQuery.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("benefit_desc") != null && !jsonObj.get("benefit_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefit_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefit_desc").toString()));
      }
      if (jsonObj.get("benefit_id") != null && !jsonObj.get("benefit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefit_id").toString()));
      }
      if (jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!McardTemplateBenefitQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'McardTemplateBenefitQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<McardTemplateBenefitQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(McardTemplateBenefitQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<McardTemplateBenefitQuery>() {
           @Override
           public void write(JsonWriter out, McardTemplateBenefitQuery value) throws IOException {
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
           public McardTemplateBenefitQuery read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             McardTemplateBenefitQuery instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of McardTemplateBenefitQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of McardTemplateBenefitQuery
  * @throws IOException if the JSON string is invalid with respect to McardTemplateBenefitQuery
  */
  public static McardTemplateBenefitQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, McardTemplateBenefitQuery.class);
  }

 /**
  * Convert an instance of McardTemplateBenefitQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

