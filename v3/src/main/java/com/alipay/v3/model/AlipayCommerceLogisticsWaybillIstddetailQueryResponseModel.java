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
 * AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel {
  public static final String SERIALIZED_NAME_REACH_DURATION = "reach_duration";
  @SerializedName(SERIALIZED_NAME_REACH_DURATION)
  private Integer reachDuration;

  public static final String SERIALIZED_NAME_RIDER_LAT = "rider_lat";
  @SerializedName(SERIALIZED_NAME_RIDER_LAT)
  private String riderLat;

  public static final String SERIALIZED_NAME_RIDER_LNG = "rider_lng";
  @SerializedName(SERIALIZED_NAME_RIDER_LNG)
  private String riderLng;

  public static final String SERIALIZED_NAME_RIDER_MOBILE_NO = "rider_mobile_no";
  @SerializedName(SERIALIZED_NAME_RIDER_MOBILE_NO)
  private String riderMobileNo;

  public static final String SERIALIZED_NAME_RIDER_NAME = "rider_name";
  @SerializedName(SERIALIZED_NAME_RIDER_NAME)
  private String riderName;

  public static final String SERIALIZED_NAME_RIDER_POI_LINK = "rider_poi_link";
  @SerializedName(SERIALIZED_NAME_RIDER_POI_LINK)
  private String riderPoiLink;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel() { 
  }

  public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel reachDuration(Integer reachDuration) {
    
    this.reachDuration = reachDuration;
    return this;
  }

   /**
   * 预计还剩多久送达 单位：秒
   * @return reachDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "600", value = "预计还剩多久送达 单位：秒")

  public Integer getReachDuration() {
    return reachDuration;
  }


  public void setReachDuration(Integer reachDuration) {
    this.reachDuration = reachDuration;
  }


  public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel riderLat(String riderLat) {
    
    this.riderLat = riderLat;
    return this;
  }

   /**
   * 骑手位置纬度
   * @return riderLat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30.246984", value = "骑手位置纬度")

  public String getRiderLat() {
    return riderLat;
  }


  public void setRiderLat(String riderLat) {
    this.riderLat = riderLat;
  }


  public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel riderLng(String riderLng) {
    
    this.riderLng = riderLng;
    return this;
  }

   /**
   * 骑手位置经度
   * @return riderLng
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120.210568", value = "骑手位置经度")

  public String getRiderLng() {
    return riderLng;
  }


  public void setRiderLng(String riderLng) {
    this.riderLng = riderLng;
  }


  public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel riderMobileNo(String riderMobileNo) {
    
    this.riderMobileNo = riderMobileNo;
    return this;
  }

   /**
   * 骑手电话
   * @return riderMobileNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18962866666", value = "骑手电话")

  public String getRiderMobileNo() {
    return riderMobileNo;
  }


  public void setRiderMobileNo(String riderMobileNo) {
    this.riderMobileNo = riderMobileNo;
  }


  public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel riderName(String riderName) {
    
    this.riderName = riderName;
    return this;
  }

   /**
   * 骑手姓名
   * @return riderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小明", value = "骑手姓名")

  public String getRiderName() {
    return riderName;
  }


  public void setRiderName(String riderName) {
    this.riderName = riderName;
  }


  public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel riderPoiLink(String riderPoiLink) {
    
    this.riderPoiLink = riderPoiLink;
    return this;
  }

   /**
   * 骑手实时定位H5链接字段，在骑手已接单后，将可展示骑手实时位置的H5页面链接同步商户
   * @return riderPoiLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://aliyun.com", value = "骑手实时定位H5链接字段，在骑手已接单后，将可展示骑手实时位置的H5页面链接同步商户")

  public String getRiderPoiLink() {
    return riderPoiLink;
  }


  public void setRiderPoiLink(String riderPoiLink) {
    this.riderPoiLink = riderPoiLink;
  }


  public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 即时配送运单状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "i_102", value = "即时配送运单状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel instance itself
   */
  public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel alipayCommerceLogisticsWaybillIstddetailQueryResponseModel = (AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel) o;
    return Objects.equals(this.reachDuration, alipayCommerceLogisticsWaybillIstddetailQueryResponseModel.reachDuration) &&
        Objects.equals(this.riderLat, alipayCommerceLogisticsWaybillIstddetailQueryResponseModel.riderLat) &&
        Objects.equals(this.riderLng, alipayCommerceLogisticsWaybillIstddetailQueryResponseModel.riderLng) &&
        Objects.equals(this.riderMobileNo, alipayCommerceLogisticsWaybillIstddetailQueryResponseModel.riderMobileNo) &&
        Objects.equals(this.riderName, alipayCommerceLogisticsWaybillIstddetailQueryResponseModel.riderName) &&
        Objects.equals(this.riderPoiLink, alipayCommerceLogisticsWaybillIstddetailQueryResponseModel.riderPoiLink) &&
        Objects.equals(this.status, alipayCommerceLogisticsWaybillIstddetailQueryResponseModel.status)&&
        Objects.equals(this.additionalProperties, alipayCommerceLogisticsWaybillIstddetailQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reachDuration, riderLat, riderLng, riderMobileNo, riderName, riderPoiLink, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel {\n");
    sb.append("    reachDuration: ").append(toIndentedString(reachDuration)).append("\n");
    sb.append("    riderLat: ").append(toIndentedString(riderLat)).append("\n");
    sb.append("    riderLng: ").append(toIndentedString(riderLng)).append("\n");
    sb.append("    riderMobileNo: ").append(toIndentedString(riderMobileNo)).append("\n");
    sb.append("    riderName: ").append(toIndentedString(riderName)).append("\n");
    sb.append("    riderPoiLink: ").append(toIndentedString(riderPoiLink)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("reach_duration");
    openapiFields.add("rider_lat");
    openapiFields.add("rider_lng");
    openapiFields.add("rider_mobile_no");
    openapiFields.add("rider_name");
    openapiFields.add("rider_poi_link");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel is not found in the empty JSON string", AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("rider_lat") != null && !jsonObj.get("rider_lat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rider_lat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rider_lat").toString()));
      }
      if (jsonObj.get("rider_lng") != null && !jsonObj.get("rider_lng").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rider_lng` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rider_lng").toString()));
      }
      if (jsonObj.get("rider_mobile_no") != null && !jsonObj.get("rider_mobile_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rider_mobile_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rider_mobile_no").toString()));
      }
      if (jsonObj.get("rider_name") != null && !jsonObj.get("rider_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rider_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rider_name").toString()));
      }
      if (jsonObj.get("rider_poi_link") != null && !jsonObj.get("rider_poi_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rider_poi_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rider_poi_link").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel value) throws IOException {
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
           public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel
  */
  public static AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

