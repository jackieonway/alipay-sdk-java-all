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
 * SubTaskInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubTaskInfo {
  public static final String SERIALIZED_NAME_EXECUTE_RESULT = "execute_result";
  @SerializedName(SERIALIZED_NAME_EXECUTE_RESULT)
  private String executeResult;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TYPE_DESC = "type_desc";
  @SerializedName(SERIALIZED_NAME_TYPE_DESC)
  private String typeDesc;

  public SubTaskInfo() { 
  }

  public SubTaskInfo executeResult(String executeResult) {
    
    this.executeResult = executeResult;
    return this;
  }

   /**
   * 子任务执行结果；执行成功为成功，失败则填充失败结果
   * @return executeResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "航旅交通1经营内容涉及传销，金融互助平台不合作;", value = "子任务执行结果；执行成功为成功，失败则填充失败结果")

  public String getExecuteResult() {
    return executeResult;
  }


  public void setExecuteResult(String executeResult) {
    this.executeResult = executeResult;
  }


  public SubTaskInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * \&quot;子任务状态状态 INIT:初始化 FAILURE:失败 FINISH:成功\&quot;
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INIT", value = "\"子任务状态状态 INIT:初始化 FAILURE:失败 FINISH:成功\"")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public SubTaskInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 子任务类型 SIGN_TASK：签约子任务 OPE_TASK：代运营授权子任务 APP_TASK：应用授权子任务
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SIGN_TASK", value = "子任务类型 SIGN_TASK：签约子任务 OPE_TASK：代运营授权子任务 APP_TASK：应用授权子任务")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public SubTaskInfo typeDesc(String typeDesc) {
    
    this.typeDesc = typeDesc;
    return this;
  }

   /**
   * 子任务类型描述
   * @return typeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "签约子任务", value = "子任务类型描述")

  public String getTypeDesc() {
    return typeDesc;
  }


  public void setTypeDesc(String typeDesc) {
    this.typeDesc = typeDesc;
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
   * @return the SubTaskInfo instance itself
   */
  public SubTaskInfo putAdditionalProperty(String key, Object value) {
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
    SubTaskInfo subTaskInfo = (SubTaskInfo) o;
    return Objects.equals(this.executeResult, subTaskInfo.executeResult) &&
        Objects.equals(this.status, subTaskInfo.status) &&
        Objects.equals(this.type, subTaskInfo.type) &&
        Objects.equals(this.typeDesc, subTaskInfo.typeDesc)&&
        Objects.equals(this.additionalProperties, subTaskInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executeResult, status, type, typeDesc, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubTaskInfo {\n");
    sb.append("    executeResult: ").append(toIndentedString(executeResult)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeDesc: ").append(toIndentedString(typeDesc)).append("\n");
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
    openapiFields.add("execute_result");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("type_desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubTaskInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubTaskInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubTaskInfo is not found in the empty JSON string", SubTaskInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("execute_result") != null && !jsonObj.get("execute_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `execute_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("execute_result").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("type_desc") != null && !jsonObj.get("type_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubTaskInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubTaskInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubTaskInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubTaskInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SubTaskInfo>() {
           @Override
           public void write(JsonWriter out, SubTaskInfo value) throws IOException {
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
           public SubTaskInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SubTaskInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SubTaskInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubTaskInfo
  * @throws IOException if the JSON string is invalid with respect to SubTaskInfo
  */
  public static SubTaskInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubTaskInfo.class);
  }

 /**
  * Convert an instance of SubTaskInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

