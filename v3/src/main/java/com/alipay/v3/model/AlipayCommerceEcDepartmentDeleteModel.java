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
 * AlipayCommerceEcDepartmentDeleteModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcDepartmentDeleteModel {
  public static final String SERIALIZED_NAME_DEPARTMENT_ID = "department_id";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_ID)
  private String departmentId;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public AlipayCommerceEcDepartmentDeleteModel() { 
  }

  public AlipayCommerceEcDepartmentDeleteModel departmentId(String departmentId) {
    
    this.departmentId = departmentId;
    return this;
  }

   /**
   * 部门id
   * @return departmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1001169000136660", value = "部门id")

  public String getDepartmentId() {
    return departmentId;
  }


  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }


  public AlipayCommerceEcDepartmentDeleteModel enterpriseId(String enterpriseId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEcDepartmentDeleteModel alipayCommerceEcDepartmentDeleteModel = (AlipayCommerceEcDepartmentDeleteModel) o;
    return Objects.equals(this.departmentId, alipayCommerceEcDepartmentDeleteModel.departmentId) &&
        Objects.equals(this.enterpriseId, alipayCommerceEcDepartmentDeleteModel.enterpriseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentId, enterpriseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcDepartmentDeleteModel {\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
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
    openapiFields.add("department_id");
    openapiFields.add("enterprise_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcDepartmentDeleteModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcDepartmentDeleteModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcDepartmentDeleteModel is not found in the empty JSON string", AlipayCommerceEcDepartmentDeleteModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEcDepartmentDeleteModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEcDepartmentDeleteModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("department_id") != null && !jsonObj.get("department_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `department_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("department_id").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcDepartmentDeleteModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcDepartmentDeleteModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcDepartmentDeleteModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcDepartmentDeleteModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcDepartmentDeleteModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcDepartmentDeleteModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEcDepartmentDeleteModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEcDepartmentDeleteModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcDepartmentDeleteModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcDepartmentDeleteModel
  */
  public static AlipayCommerceEcDepartmentDeleteModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcDepartmentDeleteModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcDepartmentDeleteModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

