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
 * AlipayOpenAppServiceApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppServiceApplyModel {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private String schemaVersion;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SERVICE_XML = "service_xml";
  @SerializedName(SERIALIZED_NAME_SERVICE_XML)
  private String serviceXml;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template_type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private String templateType;

  public AlipayOpenAppServiceApplyModel() { 
  }

  public AlipayOpenAppServiceApplyModel categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 行业类目id
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C102423081", value = "行业类目id")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public AlipayOpenAppServiceApplyModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务编号,平台会基于appId+out_biz_no做幂等控制，如果出现幂等，会返回幂等的service_code
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678", value = "外部业务编号,平台会基于appId+out_biz_no做幂等控制，如果出现幂等，会返回幂等的service_code")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayOpenAppServiceApplyModel schemaVersion(String schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * 服务schema版本
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "服务schema版本")

  public String getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  public AlipayOpenAppServiceApplyModel serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 服务编码, 首次提报时设置空值，支付宝侧返回ServiceCode；当传入serviceCode，则对已提报服务做编辑操作。
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021011521000858813900", value = "服务编码, 首次提报时设置空值，支付宝侧返回ServiceCode；当传入serviceCode，则对已提报服务做编辑操作。")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public AlipayOpenAppServiceApplyModel serviceXml(String serviceXml) {
    
    this.serviceXml = serviceXml;
    return this;
  }

   /**
   * 服务xml
   * @return serviceXml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<serviceSchema></serviceSchema>", value = "服务xml")

  public String getServiceXml() {
    return serviceXml;
  }


  public void setServiceXml(String serviceXml) {
    this.serviceXml = serviceXml;
  }


  public AlipayOpenAppServiceApplyModel templateType(String templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * 服务模版。若当前服务类目只有一个服务模版，可不填。
   * @return templateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "服务模版。若当前服务类目只有一个服务模版，可不填。")

  public String getTemplateType() {
    return templateType;
  }


  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAppServiceApplyModel alipayOpenAppServiceApplyModel = (AlipayOpenAppServiceApplyModel) o;
    return Objects.equals(this.categoryId, alipayOpenAppServiceApplyModel.categoryId) &&
        Objects.equals(this.outBizNo, alipayOpenAppServiceApplyModel.outBizNo) &&
        Objects.equals(this.schemaVersion, alipayOpenAppServiceApplyModel.schemaVersion) &&
        Objects.equals(this.serviceCode, alipayOpenAppServiceApplyModel.serviceCode) &&
        Objects.equals(this.serviceXml, alipayOpenAppServiceApplyModel.serviceXml) &&
        Objects.equals(this.templateType, alipayOpenAppServiceApplyModel.templateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, outBizNo, schemaVersion, serviceCode, serviceXml, templateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppServiceApplyModel {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    serviceXml: ").append(toIndentedString(serviceXml)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
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
    openapiFields.add("out_biz_no");
    openapiFields.add("schema_version");
    openapiFields.add("service_code");
    openapiFields.add("service_xml");
    openapiFields.add("template_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppServiceApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppServiceApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppServiceApplyModel is not found in the empty JSON string", AlipayOpenAppServiceApplyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAppServiceApplyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAppServiceApplyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("schema_version") != null && !jsonObj.get("schema_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_version").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("service_xml") != null && !jsonObj.get("service_xml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_xml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_xml").toString()));
      }
      if (jsonObj.get("template_type") != null && !jsonObj.get("template_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppServiceApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppServiceApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppServiceApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppServiceApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppServiceApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppServiceApplyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAppServiceApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAppServiceApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppServiceApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppServiceApplyModel
  */
  public static AlipayOpenAppServiceApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppServiceApplyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppServiceApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

