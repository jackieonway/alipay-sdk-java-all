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
 * DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel {
  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public static final String SERIALIZED_NAME_IDENTITY_INFO = "identity_info";
  @SerializedName(SERIALIZED_NAME_IDENTITY_INFO)
  private String identityInfo;

  public static final String SERIALIZED_NAME_MATERIAL_INFO = "material_info";
  @SerializedName(SERIALIZED_NAME_MATERIAL_INFO)
  private String materialInfo;

  public static final String SERIALIZED_NAME_PASSED = "passed";
  @SerializedName(SERIALIZED_NAME_PASSED)
  private String passed;

  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel() { 
  }

  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 认证错误原因，扩展字段，默认不返回
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Z1147", value = "认证错误原因，扩展字段，默认不返回")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel identityInfo(String identityInfo) {
    
    this.identityInfo = identityInfo;
    return this;
  }

   /**
   * 刷脸用户的身份信息，目前返回为空
   * @return identityInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "刷脸用户的身份信息，目前返回为空")

  public String getIdentityInfo() {
    return identityInfo;
  }


  public void setIdentityInfo(String identityInfo) {
    this.identityInfo = identityInfo;
  }


  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel materialInfo(String materialInfo) {
    
    this.materialInfo = materialInfo;
    return this;
  }

   /**
   * 认证主体附件信息，主要为图片类材料，一般的认证场景都是返回空
   * @return materialInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "认证主体附件信息，主要为图片类材料，一般的认证场景都是返回空")

  public String getMaterialInfo() {
    return materialInfo;
  }


  public void setMaterialInfo(String materialInfo) {
    this.materialInfo = materialInfo;
  }


  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel passed(String passed) {
    
    this.passed = passed;
    return this;
  }

   /**
   * 是否通过，通过为T，不通过为F
   * @return passed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "是否通过，通过为T，不通过为F")

  public String getPassed() {
    return passed;
  }


  public void setPassed(String passed) {
    this.passed = passed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel = (DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel) o;
    return Objects.equals(this.failReason, datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.failReason) &&
        Objects.equals(this.identityInfo, datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.identityInfo) &&
        Objects.equals(this.materialInfo, datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.materialInfo) &&
        Objects.equals(this.passed, datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.passed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failReason, identityInfo, materialInfo, passed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel {\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    identityInfo: ").append(toIndentedString(identityInfo)).append("\n");
    sb.append("    materialInfo: ").append(toIndentedString(materialInfo)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
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
    openapiFields.add("fail_reason");
    openapiFields.add("identity_info");
    openapiFields.add("material_info");
    openapiFields.add("passed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
      if (jsonObj.get("identity_info") != null && !jsonObj.get("identity_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_info").toString()));
      }
      if (jsonObj.get("material_info") != null && !jsonObj.get("material_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_info").toString()));
      }
      if (jsonObj.get("passed") != null && !jsonObj.get("passed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel
  */
  public static DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

