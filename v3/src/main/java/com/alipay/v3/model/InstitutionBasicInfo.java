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
 * InstitutionBasicInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstitutionBasicInfo {
  public static final String SERIALIZED_NAME_CONSULT_MODE = "consult_mode";
  @SerializedName(SERIALIZED_NAME_CONSULT_MODE)
  private String consultMode;

  public static final String SERIALIZED_NAME_EFFECTIVE = "effective";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE)
  private String effective;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_INSTITUTION_DESC = "institution_desc";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_DESC)
  private String institutionDesc;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public InstitutionBasicInfo() { 
  }

  public InstitutionBasicInfo consultMode(String consultMode) {
    
    this.consultMode = consultMode;
    return this;
  }

   /**
   * 费控咨询模式
   * @return consultMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "费控咨询模式")

  public String getConsultMode() {
    return consultMode;
  }


  public void setConsultMode(String consultMode) {
    this.consultMode = consultMode;
  }


  public InstitutionBasicInfo effective(String effective) {
    
    this.effective = effective;
    return this;
  }

   /**
   * 制度是否启用
   * @return effective
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "制度是否启用")

  public String getEffective() {
    return effective;
  }


  public void setEffective(String effective) {
    this.effective = effective;
  }


  public InstitutionBasicInfo effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 制度生效结束时间
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-07-05 23:59:59", value = "制度生效结束时间")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public InstitutionBasicInfo effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 制度生效起始时间
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-07-04 00:00:00", value = "制度生效起始时间")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public InstitutionBasicInfo institutionDesc(String institutionDesc) {
    
    this.institutionDesc = institutionDesc;
    return this;
  }

   /**
   * 制度描述
   * @return institutionDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "工作餐制度", value = "制度描述")

  public String getInstitutionDesc() {
    return institutionDesc;
  }


  public void setInstitutionDesc(String institutionDesc) {
    this.institutionDesc = institutionDesc;
  }


  public InstitutionBasicInfo institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * 制度id
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023042600152617860000076000", value = "制度id")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public InstitutionBasicInfo institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * 制度名称
   * @return institutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "餐补制度", value = "制度名称")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionBasicInfo institutionBasicInfo = (InstitutionBasicInfo) o;
    return Objects.equals(this.consultMode, institutionBasicInfo.consultMode) &&
        Objects.equals(this.effective, institutionBasicInfo.effective) &&
        Objects.equals(this.effectiveEndDate, institutionBasicInfo.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, institutionBasicInfo.effectiveStartDate) &&
        Objects.equals(this.institutionDesc, institutionBasicInfo.institutionDesc) &&
        Objects.equals(this.institutionId, institutionBasicInfo.institutionId) &&
        Objects.equals(this.institutionName, institutionBasicInfo.institutionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultMode, effective, effectiveEndDate, effectiveStartDate, institutionDesc, institutionId, institutionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionBasicInfo {\n");
    sb.append("    consultMode: ").append(toIndentedString(consultMode)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    institutionDesc: ").append(toIndentedString(institutionDesc)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
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
    openapiFields.add("consult_mode");
    openapiFields.add("effective");
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("institution_desc");
    openapiFields.add("institution_id");
    openapiFields.add("institution_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstitutionBasicInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InstitutionBasicInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstitutionBasicInfo is not found in the empty JSON string", InstitutionBasicInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstitutionBasicInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstitutionBasicInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("consult_mode") != null && !jsonObj.get("consult_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consult_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consult_mode").toString()));
      }
      if (jsonObj.get("effective") != null && !jsonObj.get("effective").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective").toString()));
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      if (jsonObj.get("institution_desc") != null && !jsonObj.get("institution_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_desc").toString()));
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      if (jsonObj.get("institution_name") != null && !jsonObj.get("institution_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstitutionBasicInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstitutionBasicInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstitutionBasicInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstitutionBasicInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<InstitutionBasicInfo>() {
           @Override
           public void write(JsonWriter out, InstitutionBasicInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstitutionBasicInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstitutionBasicInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstitutionBasicInfo
  * @throws IOException if the JSON string is invalid with respect to InstitutionBasicInfo
  */
  public static InstitutionBasicInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstitutionBasicInfo.class);
  }

 /**
  * Convert an instance of InstitutionBasicInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

