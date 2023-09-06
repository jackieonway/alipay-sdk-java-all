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
 * ZMGORightConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZMGORightConfig {
  public static final String SERIALIZED_NAME_CUMULATIVE_PREFERENTIAL_REDIRECT_SCHEMA = "cumulative_preferential_redirect_schema";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_PREFERENTIAL_REDIRECT_SCHEMA)
  private String cumulativePreferentialRedirectSchema;

  public static final String SERIALIZED_NAME_CUSTOM_BENEFIT_DESC = "custom_benefit_desc";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BENEFIT_DESC)
  private String customBenefitDesc;

  public static final String SERIALIZED_NAME_CUSTOM_SUB_BENEFIT_DESC = "custom_sub_benefit_desc";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SUB_BENEFIT_DESC)
  private String customSubBenefitDesc;

  public ZMGORightConfig() { 
  }

  public ZMGORightConfig cumulativePreferentialRedirectSchema(String cumulativePreferentialRedirectSchema) {
    
    this.cumulativePreferentialRedirectSchema = cumulativePreferentialRedirectSchema;
    return this;
  }

   /**
   * 芝麻GO管理页已享优惠进度的重定向链接
   * @return cumulativePreferentialRedirectSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "芝麻GO管理页已享优惠进度的重定向链接")

  public String getCumulativePreferentialRedirectSchema() {
    return cumulativePreferentialRedirectSchema;
  }


  public void setCumulativePreferentialRedirectSchema(String cumulativePreferentialRedirectSchema) {
    this.cumulativePreferentialRedirectSchema = cumulativePreferentialRedirectSchema;
  }


  public ZMGORightConfig customBenefitDesc(String customBenefitDesc) {
    
    this.customBenefitDesc = customBenefitDesc;
    return this;
  }

   /**
   * 权益描述
   * @return customBenefitDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益描述")

  public String getCustomBenefitDesc() {
    return customBenefitDesc;
  }


  public void setCustomBenefitDesc(String customBenefitDesc) {
    this.customBenefitDesc = customBenefitDesc;
  }


  public ZMGORightConfig customSubBenefitDesc(String customSubBenefitDesc) {
    
    this.customSubBenefitDesc = customSubBenefitDesc;
    return this;
  }

   /**
   * 权益描述子标题
   * @return customSubBenefitDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益描述子标题")

  public String getCustomSubBenefitDesc() {
    return customSubBenefitDesc;
  }


  public void setCustomSubBenefitDesc(String customSubBenefitDesc) {
    this.customSubBenefitDesc = customSubBenefitDesc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZMGORightConfig zmGORightConfig = (ZMGORightConfig) o;
    return Objects.equals(this.cumulativePreferentialRedirectSchema, zmGORightConfig.cumulativePreferentialRedirectSchema) &&
        Objects.equals(this.customBenefitDesc, zmGORightConfig.customBenefitDesc) &&
        Objects.equals(this.customSubBenefitDesc, zmGORightConfig.customSubBenefitDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cumulativePreferentialRedirectSchema, customBenefitDesc, customSubBenefitDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZMGORightConfig {\n");
    sb.append("    cumulativePreferentialRedirectSchema: ").append(toIndentedString(cumulativePreferentialRedirectSchema)).append("\n");
    sb.append("    customBenefitDesc: ").append(toIndentedString(customBenefitDesc)).append("\n");
    sb.append("    customSubBenefitDesc: ").append(toIndentedString(customSubBenefitDesc)).append("\n");
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
    openapiFields.add("cumulative_preferential_redirect_schema");
    openapiFields.add("custom_benefit_desc");
    openapiFields.add("custom_sub_benefit_desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZMGORightConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZMGORightConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZMGORightConfig is not found in the empty JSON string", ZMGORightConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZMGORightConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZMGORightConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cumulative_preferential_redirect_schema") != null && !jsonObj.get("cumulative_preferential_redirect_schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cumulative_preferential_redirect_schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cumulative_preferential_redirect_schema").toString()));
      }
      if (jsonObj.get("custom_benefit_desc") != null && !jsonObj.get("custom_benefit_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_benefit_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_benefit_desc").toString()));
      }
      if (jsonObj.get("custom_sub_benefit_desc") != null && !jsonObj.get("custom_sub_benefit_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_sub_benefit_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_sub_benefit_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZMGORightConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZMGORightConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZMGORightConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZMGORightConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ZMGORightConfig>() {
           @Override
           public void write(JsonWriter out, ZMGORightConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZMGORightConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZMGORightConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZMGORightConfig
  * @throws IOException if the JSON string is invalid with respect to ZMGORightConfig
  */
  public static ZMGORightConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZMGORightConfig.class);
  }

 /**
  * Convert an instance of ZMGORightConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

