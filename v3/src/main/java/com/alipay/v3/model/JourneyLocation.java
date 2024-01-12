/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.OrderExtInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * JourneyLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JourneyLocation {
  public static final String SERIALIZED_NAME_AOI_ID = "aoi_id";
  @SerializedName(SERIALIZED_NAME_AOI_ID)
  private String aoiId;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<OrderExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public static final String SERIALIZED_NAME_LOCATION_ID_TYPE = "location_id_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID_TYPE)
  private String locationIdType;

  public static final String SERIALIZED_NAME_MERCHANT_DIVISION_ID = "merchant_division_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_DIVISION_ID)
  private String merchantDivisionId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_MERCHANT_POI = "merchant_poi";
  @SerializedName(SERIALIZED_NAME_MERCHANT_POI)
  private String merchantPoi;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POI_ID = "poi_id";
  @SerializedName(SERIALIZED_NAME_POI_ID)
  private String poiId;

  public JourneyLocation() { 
  }

  public JourneyLocation aoiId(String aoiId) {
    
    this.aoiId = aoiId;
    return this;
  }

   /**
   * 支付宝域内aoiId
   * @return aoiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝域内aoiId")

  public String getAoiId() {
    return aoiId;
  }


  public void setAoiId(String aoiId) {
    this.aoiId = aoiId;
  }


  public JourneyLocation city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 城市名
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "城市名")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public JourneyLocation extInfo(List<OrderExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public JourneyLocation addExtInfoItem(OrderExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * 扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息")

  public List<OrderExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<OrderExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public JourneyLocation locationId(String locationId) {
    
    this.locationId = locationId;
    return this;
  }

   /**
   * 支付宝侧地点id
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝侧地点id")

  public String getLocationId() {
    return locationId;
  }


  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  public JourneyLocation locationIdType(String locationIdType) {
    
    this.locationIdType = locationIdType;
    return this;
  }

   /**
   * 地点id类型
   * @return locationIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地点id类型")

  public String getLocationIdType() {
    return locationIdType;
  }


  public void setLocationIdType(String locationIdType) {
    this.locationIdType = locationIdType;
  }


  public JourneyLocation merchantDivisionId(String merchantDivisionId) {
    
    this.merchantDivisionId = merchantDivisionId;
    return this;
  }

   /**
   * 商户侧行政区划代码
   * @return merchantDivisionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户侧行政区划代码")

  public String getMerchantDivisionId() {
    return merchantDivisionId;
  }


  public void setMerchantDivisionId(String merchantDivisionId) {
    this.merchantDivisionId = merchantDivisionId;
  }


  public JourneyLocation merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * (废弃)商户侧地点id
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(废弃)商户侧地点id")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public JourneyLocation merchantPoi(String merchantPoi) {
    
    this.merchantPoi = merchantPoi;
    return this;
  }

   /**
   * 商户侧poi信息
   * @return merchantPoi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户侧poi信息")

  public String getMerchantPoi() {
    return merchantPoi;
  }


  public void setMerchantPoi(String merchantPoi) {
    this.merchantPoi = merchantPoi;
  }


  public JourneyLocation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 地点名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "地点名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JourneyLocation poiId(String poiId) {
    
    this.poiId = poiId;
    return this;
  }

   /**
   * 支付宝域内poiId
   * @return poiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝域内poiId")

  public String getPoiId() {
    return poiId;
  }


  public void setPoiId(String poiId) {
    this.poiId = poiId;
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
   * @return the JourneyLocation instance itself
   */
  public JourneyLocation putAdditionalProperty(String key, Object value) {
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
    JourneyLocation journeyLocation = (JourneyLocation) o;
    return Objects.equals(this.aoiId, journeyLocation.aoiId) &&
        Objects.equals(this.city, journeyLocation.city) &&
        Objects.equals(this.extInfo, journeyLocation.extInfo) &&
        Objects.equals(this.locationId, journeyLocation.locationId) &&
        Objects.equals(this.locationIdType, journeyLocation.locationIdType) &&
        Objects.equals(this.merchantDivisionId, journeyLocation.merchantDivisionId) &&
        Objects.equals(this.merchantId, journeyLocation.merchantId) &&
        Objects.equals(this.merchantPoi, journeyLocation.merchantPoi) &&
        Objects.equals(this.name, journeyLocation.name) &&
        Objects.equals(this.poiId, journeyLocation.poiId)&&
        Objects.equals(this.additionalProperties, journeyLocation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aoiId, city, extInfo, locationId, locationIdType, merchantDivisionId, merchantId, merchantPoi, name, poiId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyLocation {\n");
    sb.append("    aoiId: ").append(toIndentedString(aoiId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationIdType: ").append(toIndentedString(locationIdType)).append("\n");
    sb.append("    merchantDivisionId: ").append(toIndentedString(merchantDivisionId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantPoi: ").append(toIndentedString(merchantPoi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
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
    openapiFields.add("aoi_id");
    openapiFields.add("city");
    openapiFields.add("ext_info");
    openapiFields.add("location_id");
    openapiFields.add("location_id_type");
    openapiFields.add("merchant_division_id");
    openapiFields.add("merchant_id");
    openapiFields.add("merchant_poi");
    openapiFields.add("name");
    openapiFields.add("poi_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JourneyLocation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JourneyLocation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JourneyLocation is not found in the empty JSON string", JourneyLocation.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("aoi_id") != null && !jsonObj.get("aoi_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aoi_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aoi_id").toString()));
      }
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          OrderExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("location_id") != null && !jsonObj.get("location_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location_id").toString()));
      }
      if (jsonObj.get("location_id_type") != null && !jsonObj.get("location_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location_id_type").toString()));
      }
      if (jsonObj.get("merchant_division_id") != null && !jsonObj.get("merchant_division_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_division_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_division_id").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("merchant_poi") != null && !jsonObj.get("merchant_poi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_poi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_poi").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("poi_id") != null && !jsonObj.get("poi_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poi_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poi_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JourneyLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JourneyLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JourneyLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JourneyLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<JourneyLocation>() {
           @Override
           public void write(JsonWriter out, JourneyLocation value) throws IOException {
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
           public JourneyLocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JourneyLocation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JourneyLocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JourneyLocation
  * @throws IOException if the JSON string is invalid with respect to JourneyLocation
  */
  public static JourneyLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JourneyLocation.class);
  }

 /**
  * Convert an instance of JourneyLocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

