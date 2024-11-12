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
 * RegionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegionInfo {
  public static final String SERIALIZED_NAME_AREA_CODE = "area_code";
  @SerializedName(SERIALIZED_NAME_AREA_CODE)
  private String areaCode;

  public static final String SERIALIZED_NAME_AREA_NAME = "area_name";
  @SerializedName(SERIALIZED_NAME_AREA_NAME)
  private String areaName;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public static final String SERIALIZED_NAME_PROVINCE_NAME = "province_name";
  @SerializedName(SERIALIZED_NAME_PROVINCE_NAME)
  private String provinceName;

  public RegionInfo() { 
  }

  public RegionInfo areaCode(String areaCode) {
    
    this.areaCode = areaCode;
    return this;
  }

   /**
   * 地址所属区代码
   * @return areaCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地址所属区代码")

  public String getAreaCode() {
    return areaCode;
  }


  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  public RegionInfo areaName(String areaName) {
    
    this.areaName = areaName;
    return this;
  }

   /**
   * 地址所属区名称
   * @return areaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地址所属区名称")

  public String getAreaName() {
    return areaName;
  }


  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }


  public RegionInfo cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 地址所属市代码
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地址所属市代码")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public RegionInfo cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 地址所属市名称
   * @return cityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地址所属市名称")

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public RegionInfo provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 地址所属省份代码
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地址所属省份代码")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }


  public RegionInfo provinceName(String provinceName) {
    
    this.provinceName = provinceName;
    return this;
  }

   /**
   * 地址所属省份名称
   * @return provinceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地址所属省份名称")

  public String getProvinceName() {
    return provinceName;
  }


  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
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
   * @return the RegionInfo instance itself
   */
  public RegionInfo putAdditionalProperty(String key, Object value) {
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
    RegionInfo regionInfo = (RegionInfo) o;
    return Objects.equals(this.areaCode, regionInfo.areaCode) &&
        Objects.equals(this.areaName, regionInfo.areaName) &&
        Objects.equals(this.cityCode, regionInfo.cityCode) &&
        Objects.equals(this.cityName, regionInfo.cityName) &&
        Objects.equals(this.provinceCode, regionInfo.provinceCode) &&
        Objects.equals(this.provinceName, regionInfo.provinceName)&&
        Objects.equals(this.additionalProperties, regionInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaCode, areaName, cityCode, cityName, provinceCode, provinceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionInfo {\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    areaName: ").append(toIndentedString(areaName)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    provinceName: ").append(toIndentedString(provinceName)).append("\n");
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
    openapiFields.add("area_code");
    openapiFields.add("area_name");
    openapiFields.add("city_code");
    openapiFields.add("city_name");
    openapiFields.add("province_code");
    openapiFields.add("province_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RegionInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RegionInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RegionInfo is not found in the empty JSON string", RegionInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("area_code") != null && !jsonObj.get("area_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area_code").toString()));
      }
      if (jsonObj.get("area_name") != null && !jsonObj.get("area_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area_name").toString()));
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("city_name") != null && !jsonObj.get("city_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_name").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
      if (jsonObj.get("province_name") != null && !jsonObj.get("province_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RegionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RegionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RegionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RegionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RegionInfo>() {
           @Override
           public void write(JsonWriter out, RegionInfo value) throws IOException {
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
           public RegionInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RegionInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RegionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RegionInfo
  * @throws IOException if the JSON string is invalid with respect to RegionInfo
  */
  public static RegionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RegionInfo.class);
  }

 /**
  * Convert an instance of RegionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

