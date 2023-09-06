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
 * AlipayCommerceEcDepartmentInfoModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcDepartmentInfoModifyModel {
  public static final String SERIALIZED_NAME_DEPARTMENT_CODE = "department_code";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_CODE)
  private String departmentCode;

  public static final String SERIALIZED_NAME_DEPARTMENT_ID = "department_id";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_ID)
  private String departmentId;

  public static final String SERIALIZED_NAME_DEPARTMENT_NAME = "department_name";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_NAME)
  private String departmentName;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_PARENT_DEPARTMENT_ID = "parent_department_id";
  @SerializedName(SERIALIZED_NAME_PARENT_DEPARTMENT_ID)
  private String parentDepartmentId;

  public AlipayCommerceEcDepartmentInfoModifyModel() { 
  }

  public AlipayCommerceEcDepartmentInfoModifyModel departmentCode(String departmentCode) {
    
    this.departmentCode = departmentCode;
    return this;
  }

   /**
   * 部门编码，不同部门的编码不能相同，为空则代表不修改
   * @return departmentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "D00001", value = "部门编码，不同部门的编码不能相同，为空则代表不修改")

  public String getDepartmentCode() {
    return departmentCode;
  }


  public void setDepartmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
  }


  public AlipayCommerceEcDepartmentInfoModifyModel departmentId(String departmentId) {
    
    this.departmentId = departmentId;
    return this;
  }

   /**
   * 待修改部门的部门id
   * @return departmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1001169000136660", value = "待修改部门的部门id")

  public String getDepartmentId() {
    return departmentId;
  }


  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }


  public AlipayCommerceEcDepartmentInfoModifyModel departmentName(String departmentName) {
    
    this.departmentName = departmentName;
    return this;
  }

   /**
   * 部门名称，为空则代表不修改
   * @return departmentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "财务部", value = "部门名称，为空则代表不修改")

  public String getDepartmentName() {
    return departmentName;
  }


  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }


  public AlipayCommerceEcDepartmentInfoModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088501412314698", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayCommerceEcDepartmentInfoModifyModel parentDepartmentId(String parentDepartmentId) {
    
    this.parentDepartmentId = parentDepartmentId;
    return this;
  }

   /**
   * 上级部门id，为空则代表不修改
   * @return parentDepartmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1001169000136660", value = "上级部门id，为空则代表不修改")

  public String getParentDepartmentId() {
    return parentDepartmentId;
  }


  public void setParentDepartmentId(String parentDepartmentId) {
    this.parentDepartmentId = parentDepartmentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEcDepartmentInfoModifyModel alipayCommerceEcDepartmentInfoModifyModel = (AlipayCommerceEcDepartmentInfoModifyModel) o;
    return Objects.equals(this.departmentCode, alipayCommerceEcDepartmentInfoModifyModel.departmentCode) &&
        Objects.equals(this.departmentId, alipayCommerceEcDepartmentInfoModifyModel.departmentId) &&
        Objects.equals(this.departmentName, alipayCommerceEcDepartmentInfoModifyModel.departmentName) &&
        Objects.equals(this.enterpriseId, alipayCommerceEcDepartmentInfoModifyModel.enterpriseId) &&
        Objects.equals(this.parentDepartmentId, alipayCommerceEcDepartmentInfoModifyModel.parentDepartmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentCode, departmentId, departmentName, enterpriseId, parentDepartmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcDepartmentInfoModifyModel {\n");
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    parentDepartmentId: ").append(toIndentedString(parentDepartmentId)).append("\n");
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
    openapiFields.add("department_code");
    openapiFields.add("department_id");
    openapiFields.add("department_name");
    openapiFields.add("enterprise_id");
    openapiFields.add("parent_department_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcDepartmentInfoModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcDepartmentInfoModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcDepartmentInfoModifyModel is not found in the empty JSON string", AlipayCommerceEcDepartmentInfoModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEcDepartmentInfoModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEcDepartmentInfoModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("department_code") != null && !jsonObj.get("department_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `department_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("department_code").toString()));
      }
      if (jsonObj.get("department_id") != null && !jsonObj.get("department_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `department_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("department_id").toString()));
      }
      if (jsonObj.get("department_name") != null && !jsonObj.get("department_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `department_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("department_name").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("parent_department_id") != null && !jsonObj.get("parent_department_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_department_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_department_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcDepartmentInfoModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcDepartmentInfoModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcDepartmentInfoModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcDepartmentInfoModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcDepartmentInfoModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcDepartmentInfoModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEcDepartmentInfoModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEcDepartmentInfoModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcDepartmentInfoModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcDepartmentInfoModifyModel
  */
  public static AlipayCommerceEcDepartmentInfoModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcDepartmentInfoModifyModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcDepartmentInfoModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

