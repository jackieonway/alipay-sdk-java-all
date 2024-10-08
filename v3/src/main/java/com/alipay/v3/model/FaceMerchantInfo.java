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
 * FaceMerchantInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FaceMerchantInfo {
  public static final String SERIALIZED_NAME_AREA_CODE = "area_code";
  @SerializedName(SERIALIZED_NAME_AREA_CODE)
  private String areaCode;

  public static final String SERIALIZED_NAME_BRAND_CODE = "brand_code";
  @SerializedName(SERIALIZED_NAME_BRAND_CODE)
  private String brandCode;

  public static final String SERIALIZED_NAME_DEVICE_MAC = "device_mac";
  @SerializedName(SERIALIZED_NAME_DEVICE_MAC)
  private String deviceMac;

  public static final String SERIALIZED_NAME_DEVICE_NUM = "device_num";
  @SerializedName(SERIALIZED_NAME_DEVICE_NUM)
  private String deviceNum;

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private String geo;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_STORE_CODE = "store_code";
  @SerializedName(SERIALIZED_NAME_STORE_CODE)
  private String storeCode;

  public static final String SERIALIZED_NAME_WIFIMAC = "wifimac";
  @SerializedName(SERIALIZED_NAME_WIFIMAC)
  private String wifimac;

  public static final String SERIALIZED_NAME_WIFINAME = "wifiname";
  @SerializedName(SERIALIZED_NAME_WIFINAME)
  private String wifiname;

  public FaceMerchantInfo() { 
  }

  public FaceMerchantInfo areaCode(String areaCode) {
    
    this.areaCode = areaCode;
    return this;
  }

   /**
   * 区域编码
   * @return areaCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "华中", value = "区域编码")

  public String getAreaCode() {
    return areaCode;
  }


  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  public FaceMerchantInfo brandCode(String brandCode) {
    
    this.brandCode = brandCode;
    return this;
  }

   /**
   * 品牌编码
   * @return brandCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KFC", value = "品牌编码")

  public String getBrandCode() {
    return brandCode;
  }


  public void setBrandCode(String brandCode) {
    this.brandCode = brandCode;
  }


  public FaceMerchantInfo deviceMac(String deviceMac) {
    
    this.deviceMac = deviceMac;
    return this;
  }

   /**
   * 机具Mac地址
   * @return deviceMac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1c:aa:07:b0:e7:af", value = "机具Mac地址")

  public String getDeviceMac() {
    return deviceMac;
  }


  public void setDeviceMac(String deviceMac) {
    this.deviceMac = deviceMac;
  }


  public FaceMerchantInfo deviceNum(String deviceNum) {
    
    this.deviceNum = deviceNum;
    return this;
  }

   /**
   * 机具编码
   * @return deviceNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TEST_ZOLOZ_TEST", value = "机具编码")

  public String getDeviceNum() {
    return deviceNum;
  }


  public void setDeviceNum(String deviceNum) {
    this.deviceNum = deviceNum;
  }


  public FaceMerchantInfo geo(String geo) {
    
    this.geo = geo;
    return this;
  }

   /**
   * 经纬度
   * @return geo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120.10785,30.26708", value = "经纬度")

  public String getGeo() {
    return geo;
  }


  public void setGeo(String geo) {
    this.geo = geo;
  }


  public FaceMerchantInfo group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * 机具分组编码
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "group1", value = "机具分组编码")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public FaceMerchantInfo merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 商户ID
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302068579978", value = "商户ID")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public FaceMerchantInfo partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * ISV ID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302068579978", value = "ISV ID")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public FaceMerchantInfo storeCode(String storeCode) {
    
    this.storeCode = storeCode;
    return this;
  }

   /**
   * 门店编码
   * @return storeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TEST", value = "门店编码")

  public String getStoreCode() {
    return storeCode;
  }


  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }


  public FaceMerchantInfo wifimac(String wifimac) {
    
    this.wifimac = wifimac;
    return this;
  }

   /**
   * WI-FI Mac地址
   * @return wifimac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1c:aa:07:b0:e7:af", value = "WI-FI Mac地址")

  public String getWifimac() {
    return wifimac;
  }


  public void setWifimac(String wifimac) {
    this.wifimac = wifimac;
  }


  public FaceMerchantInfo wifiname(String wifiname) {
    
    this.wifiname = wifiname;
    return this;
  }

   /**
   * WI-FI 名称
   * @return wifiname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Alipay-Test", value = "WI-FI 名称")

  public String getWifiname() {
    return wifiname;
  }


  public void setWifiname(String wifiname) {
    this.wifiname = wifiname;
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
   * @return the FaceMerchantInfo instance itself
   */
  public FaceMerchantInfo putAdditionalProperty(String key, Object value) {
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
    FaceMerchantInfo faceMerchantInfo = (FaceMerchantInfo) o;
    return Objects.equals(this.areaCode, faceMerchantInfo.areaCode) &&
        Objects.equals(this.brandCode, faceMerchantInfo.brandCode) &&
        Objects.equals(this.deviceMac, faceMerchantInfo.deviceMac) &&
        Objects.equals(this.deviceNum, faceMerchantInfo.deviceNum) &&
        Objects.equals(this.geo, faceMerchantInfo.geo) &&
        Objects.equals(this.group, faceMerchantInfo.group) &&
        Objects.equals(this.merchantId, faceMerchantInfo.merchantId) &&
        Objects.equals(this.partnerId, faceMerchantInfo.partnerId) &&
        Objects.equals(this.storeCode, faceMerchantInfo.storeCode) &&
        Objects.equals(this.wifimac, faceMerchantInfo.wifimac) &&
        Objects.equals(this.wifiname, faceMerchantInfo.wifiname)&&
        Objects.equals(this.additionalProperties, faceMerchantInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaCode, brandCode, deviceMac, deviceNum, geo, group, merchantId, partnerId, storeCode, wifimac, wifiname, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceMerchantInfo {\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    brandCode: ").append(toIndentedString(brandCode)).append("\n");
    sb.append("    deviceMac: ").append(toIndentedString(deviceMac)).append("\n");
    sb.append("    deviceNum: ").append(toIndentedString(deviceNum)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
    sb.append("    wifimac: ").append(toIndentedString(wifimac)).append("\n");
    sb.append("    wifiname: ").append(toIndentedString(wifiname)).append("\n");
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
    openapiFields.add("brand_code");
    openapiFields.add("device_mac");
    openapiFields.add("device_num");
    openapiFields.add("geo");
    openapiFields.add("group");
    openapiFields.add("merchant_id");
    openapiFields.add("partner_id");
    openapiFields.add("store_code");
    openapiFields.add("wifimac");
    openapiFields.add("wifiname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FaceMerchantInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FaceMerchantInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FaceMerchantInfo is not found in the empty JSON string", FaceMerchantInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("area_code") != null && !jsonObj.get("area_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area_code").toString()));
      }
      if (jsonObj.get("brand_code") != null && !jsonObj.get("brand_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_code").toString()));
      }
      if (jsonObj.get("device_mac") != null && !jsonObj.get("device_mac").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_mac` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_mac").toString()));
      }
      if (jsonObj.get("device_num") != null && !jsonObj.get("device_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_num").toString()));
      }
      if (jsonObj.get("geo") != null && !jsonObj.get("geo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `geo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("geo").toString()));
      }
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("store_code") != null && !jsonObj.get("store_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_code").toString()));
      }
      if (jsonObj.get("wifimac") != null && !jsonObj.get("wifimac").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wifimac` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wifimac").toString()));
      }
      if (jsonObj.get("wifiname") != null && !jsonObj.get("wifiname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wifiname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wifiname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FaceMerchantInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FaceMerchantInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FaceMerchantInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FaceMerchantInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<FaceMerchantInfo>() {
           @Override
           public void write(JsonWriter out, FaceMerchantInfo value) throws IOException {
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
           public FaceMerchantInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FaceMerchantInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FaceMerchantInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FaceMerchantInfo
  * @throws IOException if the JSON string is invalid with respect to FaceMerchantInfo
  */
  public static FaceMerchantInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FaceMerchantInfo.class);
  }

 /**
  * Convert an instance of FaceMerchantInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

