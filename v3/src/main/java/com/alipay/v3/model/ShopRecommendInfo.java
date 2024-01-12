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
 * ShopRecommendInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShopRecommendInfo {
  public static final String SERIALIZED_NAME_RECOMMEND = "recommend";
  @SerializedName(SERIALIZED_NAME_RECOMMEND)
  private String recommend;

  public static final String SERIALIZED_NAME_RECOMMEND_ADDRESS = "recommend_address";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_ADDRESS)
  private String recommendAddress;

  public static final String SERIALIZED_NAME_RECOMMEND_LATITUDE = "recommend_latitude";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_LATITUDE)
  private String recommendLatitude;

  public static final String SERIALIZED_NAME_RECOMMEND_LONGTITUDE = "recommend_longtitude";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_LONGTITUDE)
  private String recommendLongtitude;

  public static final String SERIALIZED_NAME_RECOMMEND_NAME = "recommend_name";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_NAME)
  private String recommendName;

  public static final String SERIALIZED_NAME_UNCONFIDENCE_REASON = "unconfidence_reason";
  @SerializedName(SERIALIZED_NAME_UNCONFIDENCE_REASON)
  private String unconfidenceReason;

  public ShopRecommendInfo() { 
  }

  public ShopRecommendInfo recommend(String recommend) {
    
    this.recommend = recommend;
    return this;
  }

   /**
   * 门店修改建议
   * @return recommend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "请修改店名为真实经营的门店名称，如有分店，请修改成品牌（分店名），如大润发（杭州西溪店）", value = "门店修改建议")

  public String getRecommend() {
    return recommend;
  }


  public void setRecommend(String recommend) {
    this.recommend = recommend;
  }


  public ShopRecommendInfo recommendAddress(String recommendAddress) {
    
    this.recommendAddress = recommendAddress;
    return this;
  }

   /**
   * 推荐详细地址
   * @return recommendAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州市西湖区**路**号", value = "推荐详细地址")

  public String getRecommendAddress() {
    return recommendAddress;
  }


  public void setRecommendAddress(String recommendAddress) {
    this.recommendAddress = recommendAddress;
  }


  public ShopRecommendInfo recommendLatitude(String recommendLatitude) {
    
    this.recommendLatitude = recommendLatitude;
    return this;
  }

   /**
   * 推荐纬度
   * @return recommendLatitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30.111", value = "推荐纬度")

  public String getRecommendLatitude() {
    return recommendLatitude;
  }


  public void setRecommendLatitude(String recommendLatitude) {
    this.recommendLatitude = recommendLatitude;
  }


  public ShopRecommendInfo recommendLongtitude(String recommendLongtitude) {
    
    this.recommendLongtitude = recommendLongtitude;
    return this;
  }

   /**
   * 推荐经度
   * @return recommendLongtitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120.3333", value = "推荐经度")

  public String getRecommendLongtitude() {
    return recommendLongtitude;
  }


  public void setRecommendLongtitude(String recommendLongtitude) {
    this.recommendLongtitude = recommendLongtitude;
  }


  public ShopRecommendInfo recommendName(String recommendName) {
    
    this.recommendName = recommendName;
    return this;
  }

   /**
   * 推荐门店名称
   * @return recommendName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "大润发（杭州西溪店）", value = "推荐门店名称")

  public String getRecommendName() {
    return recommendName;
  }


  public void setRecommendName(String recommendName) {
    this.recommendName = recommendName;
  }


  public ShopRecommendInfo unconfidenceReason(String unconfidenceReason) {
    
    this.unconfidenceReason = unconfidenceReason;
    return this;
  }

   /**
   * 门店不置信原因
   * @return unconfidenceReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "店名不准确", value = "门店不置信原因")

  public String getUnconfidenceReason() {
    return unconfidenceReason;
  }


  public void setUnconfidenceReason(String unconfidenceReason) {
    this.unconfidenceReason = unconfidenceReason;
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
   * @return the ShopRecommendInfo instance itself
   */
  public ShopRecommendInfo putAdditionalProperty(String key, Object value) {
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
    ShopRecommendInfo shopRecommendInfo = (ShopRecommendInfo) o;
    return Objects.equals(this.recommend, shopRecommendInfo.recommend) &&
        Objects.equals(this.recommendAddress, shopRecommendInfo.recommendAddress) &&
        Objects.equals(this.recommendLatitude, shopRecommendInfo.recommendLatitude) &&
        Objects.equals(this.recommendLongtitude, shopRecommendInfo.recommendLongtitude) &&
        Objects.equals(this.recommendName, shopRecommendInfo.recommendName) &&
        Objects.equals(this.unconfidenceReason, shopRecommendInfo.unconfidenceReason)&&
        Objects.equals(this.additionalProperties, shopRecommendInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommend, recommendAddress, recommendLatitude, recommendLongtitude, recommendName, unconfidenceReason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopRecommendInfo {\n");
    sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
    sb.append("    recommendAddress: ").append(toIndentedString(recommendAddress)).append("\n");
    sb.append("    recommendLatitude: ").append(toIndentedString(recommendLatitude)).append("\n");
    sb.append("    recommendLongtitude: ").append(toIndentedString(recommendLongtitude)).append("\n");
    sb.append("    recommendName: ").append(toIndentedString(recommendName)).append("\n");
    sb.append("    unconfidenceReason: ").append(toIndentedString(unconfidenceReason)).append("\n");
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
    openapiFields.add("recommend");
    openapiFields.add("recommend_address");
    openapiFields.add("recommend_latitude");
    openapiFields.add("recommend_longtitude");
    openapiFields.add("recommend_name");
    openapiFields.add("unconfidence_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopRecommendInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShopRecommendInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopRecommendInfo is not found in the empty JSON string", ShopRecommendInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("recommend") != null && !jsonObj.get("recommend").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommend` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommend").toString()));
      }
      if (jsonObj.get("recommend_address") != null && !jsonObj.get("recommend_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommend_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommend_address").toString()));
      }
      if (jsonObj.get("recommend_latitude") != null && !jsonObj.get("recommend_latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommend_latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommend_latitude").toString()));
      }
      if (jsonObj.get("recommend_longtitude") != null && !jsonObj.get("recommend_longtitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommend_longtitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommend_longtitude").toString()));
      }
      if (jsonObj.get("recommend_name") != null && !jsonObj.get("recommend_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommend_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommend_name").toString()));
      }
      if (jsonObj.get("unconfidence_reason") != null && !jsonObj.get("unconfidence_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unconfidence_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unconfidence_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopRecommendInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopRecommendInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopRecommendInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopRecommendInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopRecommendInfo>() {
           @Override
           public void write(JsonWriter out, ShopRecommendInfo value) throws IOException {
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
           public ShopRecommendInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ShopRecommendInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ShopRecommendInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopRecommendInfo
  * @throws IOException if the JSON string is invalid with respect to ShopRecommendInfo
  */
  public static ShopRecommendInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopRecommendInfo.class);
  }

 /**
  * Convert an instance of ShopRecommendInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

