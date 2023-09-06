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
        Objects.equals(this.status, alipayCommerceLogisticsWaybillIstddetailQueryResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reachDuration, riderLat, riderLng, riderMobileNo, riderName, riderPoiLink, status);
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

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

