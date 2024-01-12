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
 * IndirectSupportCredentials
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndirectSupportCredentials {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district;

  public static final String SERIALIZED_NAME_DISTRICT_CODE = "district_code";
  @SerializedName(SERIALIZED_NAME_DISTRICT_CODE)
  private String districtCode;

  public static final String SERIALIZED_NAME_MERCHANT_TYPE = "merchant_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TYPE)
  private String merchantType;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private String province;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public static final String SERIALIZED_NAME_STORE_ADDRESS = "store_address";
  @SerializedName(SERIALIZED_NAME_STORE_ADDRESS)
  private String storeAddress;

  public static final String SERIALIZED_NAME_STORE_DOOR_IMG = "store_door_img";
  @SerializedName(SERIALIZED_NAME_STORE_DOOR_IMG)
  private String storeDoorImg;

  public static final String SERIALIZED_NAME_STORE_INNER_IMG = "store_inner_img";
  @SerializedName(SERIALIZED_NAME_STORE_INNER_IMG)
  private String storeInnerImg;

  public static final String SERIALIZED_NAME_STORE_NAME = "store_name";
  @SerializedName(SERIALIZED_NAME_STORE_NAME)
  private String storeName;

  public IndirectSupportCredentials() { 
  }

  public IndirectSupportCredentials city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 门店城市
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州市", value = "门店城市")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public IndirectSupportCredentials cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 门店市行政区号（数字）
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3310303", value = "门店市行政区号（数字）")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public IndirectSupportCredentials district(String district) {
    
    this.district = district;
    return this;
  }

   /**
   * 门店街道
   * @return district
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "西湖区留下街道", value = "门店街道")

  public String getDistrict() {
    return district;
  }


  public void setDistrict(String district) {
    this.district = district;
  }


  public IndirectSupportCredentials districtCode(String districtCode) {
    
    this.districtCode = districtCode;
    return this;
  }

   /**
   * 门店街道区号（数字）
   * @return districtCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3301000", value = "门店街道区号（数字）")

  public String getDistrictCode() {
    return districtCode;
  }


  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }


  public IndirectSupportCredentials merchantType(String merchantType) {
    
    this.merchantType = merchantType;
    return this;
  }

   /**
   * 小微商户经营类型，枚举值：门店场所（STORE）、流动经营（STALL）
   * @return merchantType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STORE", value = "小微商户经营类型，枚举值：门店场所（STORE）、流动经营（STALL）")

  public String getMerchantType() {
    return merchantType;
  }


  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }


  public IndirectSupportCredentials province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * 门店省份
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江省", value = "门店省份")

  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    this.province = province;
  }


  public IndirectSupportCredentials provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 门店省行政区号（数字
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330100", value = "门店省行政区号（数字")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }


  public IndirectSupportCredentials storeAddress(String storeAddress) {
    
    this.storeAddress = storeAddress;
    return this;
  }

   /**
   * 门店场所填写门店详细地址，流动经营类型填“无”
   * @return storeAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx街道xxx门牌号", value = "门店场所填写门店详细地址，流动经营类型填“无”")

  public String getStoreAddress() {
    return storeAddress;
  }


  public void setStoreAddress(String storeAddress) {
    this.storeAddress = storeAddress;
  }


  public IndirectSupportCredentials storeDoorImg(String storeDoorImg) {
    
    this.storeDoorImg = storeDoorImg;
    return this;
  }

   /**
   * 门店门头照信息或摊位照（使用图片上传接口）
   * @return storeDoorImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a5d373f6-3e79-405f-9993-fb7ea051c372.jpg", value = "门店门头照信息或摊位照（使用图片上传接口）")

  public String getStoreDoorImg() {
    return storeDoorImg;
  }


  public void setStoreDoorImg(String storeDoorImg) {
    this.storeDoorImg = storeDoorImg;
  }


  public IndirectSupportCredentials storeInnerImg(String storeInnerImg) {
    
    this.storeInnerImg = storeInnerImg;
    return this;
  }

   /**
   * 门店店内照片或者摊位照侧面（使用图片上传接口）
   * @return storeInnerImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a5d373f6-3e79-405f-9993-fb7ea051c372.jpg", value = "门店店内照片或者摊位照侧面（使用图片上传接口）")

  public String getStoreInnerImg() {
    return storeInnerImg;
  }


  public void setStoreInnerImg(String storeInnerImg) {
    this.storeInnerImg = storeInnerImg;
  }


  public IndirectSupportCredentials storeName(String storeName) {
    
    this.storeName = storeName;
    return this;
  }

   /**
   * 门店名称
   * @return storeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "新新饭店", value = "门店名称")

  public String getStoreName() {
    return storeName;
  }


  public void setStoreName(String storeName) {
    this.storeName = storeName;
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
   * @return the IndirectSupportCredentials instance itself
   */
  public IndirectSupportCredentials putAdditionalProperty(String key, Object value) {
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
    IndirectSupportCredentials indirectSupportCredentials = (IndirectSupportCredentials) o;
    return Objects.equals(this.city, indirectSupportCredentials.city) &&
        Objects.equals(this.cityCode, indirectSupportCredentials.cityCode) &&
        Objects.equals(this.district, indirectSupportCredentials.district) &&
        Objects.equals(this.districtCode, indirectSupportCredentials.districtCode) &&
        Objects.equals(this.merchantType, indirectSupportCredentials.merchantType) &&
        Objects.equals(this.province, indirectSupportCredentials.province) &&
        Objects.equals(this.provinceCode, indirectSupportCredentials.provinceCode) &&
        Objects.equals(this.storeAddress, indirectSupportCredentials.storeAddress) &&
        Objects.equals(this.storeDoorImg, indirectSupportCredentials.storeDoorImg) &&
        Objects.equals(this.storeInnerImg, indirectSupportCredentials.storeInnerImg) &&
        Objects.equals(this.storeName, indirectSupportCredentials.storeName)&&
        Objects.equals(this.additionalProperties, indirectSupportCredentials.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, cityCode, district, districtCode, merchantType, province, provinceCode, storeAddress, storeDoorImg, storeInnerImg, storeName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndirectSupportCredentials {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    merchantType: ").append(toIndentedString(merchantType)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    storeAddress: ").append(toIndentedString(storeAddress)).append("\n");
    sb.append("    storeDoorImg: ").append(toIndentedString(storeDoorImg)).append("\n");
    sb.append("    storeInnerImg: ").append(toIndentedString(storeInnerImg)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("city_code");
    openapiFields.add("district");
    openapiFields.add("district_code");
    openapiFields.add("merchant_type");
    openapiFields.add("province");
    openapiFields.add("province_code");
    openapiFields.add("store_address");
    openapiFields.add("store_door_img");
    openapiFields.add("store_inner_img");
    openapiFields.add("store_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IndirectSupportCredentials
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IndirectSupportCredentials.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndirectSupportCredentials is not found in the empty JSON string", IndirectSupportCredentials.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("district") != null && !jsonObj.get("district").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district").toString()));
      }
      if (jsonObj.get("district_code") != null && !jsonObj.get("district_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_code").toString()));
      }
      if (jsonObj.get("merchant_type") != null && !jsonObj.get("merchant_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_type").toString()));
      }
      if (jsonObj.get("province") != null && !jsonObj.get("province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
      if (jsonObj.get("store_address") != null && !jsonObj.get("store_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_address").toString()));
      }
      if (jsonObj.get("store_door_img") != null && !jsonObj.get("store_door_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_door_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_door_img").toString()));
      }
      if (jsonObj.get("store_inner_img") != null && !jsonObj.get("store_inner_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_inner_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_inner_img").toString()));
      }
      if (jsonObj.get("store_name") != null && !jsonObj.get("store_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndirectSupportCredentials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndirectSupportCredentials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndirectSupportCredentials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndirectSupportCredentials.class));

       return (TypeAdapter<T>) new TypeAdapter<IndirectSupportCredentials>() {
           @Override
           public void write(JsonWriter out, IndirectSupportCredentials value) throws IOException {
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
           public IndirectSupportCredentials read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IndirectSupportCredentials instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IndirectSupportCredentials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndirectSupportCredentials
  * @throws IOException if the JSON string is invalid with respect to IndirectSupportCredentials
  */
  public static IndirectSupportCredentials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndirectSupportCredentials.class);
  }

 /**
  * Convert an instance of IndirectSupportCredentials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

