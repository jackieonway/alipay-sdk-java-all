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
 * MerchantActivityModifyVoucherInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantActivityModifyVoucherInfo {
  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_USER_INTRODUCTIONS = "user_introductions";
  @SerializedName(SERIALIZED_NAME_USER_INTRODUCTIONS)
  private String userIntroductions;

  public static final String SERIALIZED_NAME_VALID_DAYS_RANGE_TO = "valid_days_range_to";
  @SerializedName(SERIALIZED_NAME_VALID_DAYS_RANGE_TO)
  private Integer validDaysRangeTo;

  public static final String SERIALIZED_NAME_VALID_TIME_RANGE_TO = "valid_time_range_to";
  @SerializedName(SERIALIZED_NAME_VALID_TIME_RANGE_TO)
  private String validTimeRangeTo;

  public static final String SERIALIZED_NAME_VALID_TIME_TYPE = "valid_time_type";
  @SerializedName(SERIALIZED_NAME_VALID_TIME_TYPE)
  private String validTimeType;

  public MerchantActivityModifyVoucherInfo() { 
  }

  public MerchantActivityModifyVoucherInfo logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * 券logo  券logo最大字符数不能超过64
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "券logo", value = "券logo  券logo最大字符数不能超过64")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public MerchantActivityModifyVoucherInfo userIntroductions(String userIntroductions) {
    
    this.userIntroductions = userIntroductions;
    return this;
  }

   /**
   * 使用须知  券使用须知最大字符数不能超过256
   * @return userIntroductions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "使用须知", value = "使用须知  券使用须知最大字符数不能超过256")

  public String getUserIntroductions() {
    return userIntroductions;
  }


  public void setUserIntroductions(String userIntroductions) {
    this.userIntroductions = userIntroductions;
  }


  public MerchantActivityModifyVoucherInfo validDaysRangeTo(Integer validDaysRangeTo) {
    
    this.validDaysRangeTo = validDaysRangeTo;
    return this;
  }

   /**
   * 领取后, 第几天失效  valid_time_type&#x3D;RELATIVE时有效且必填  只允许增加领取后可用天数
   * @return validDaysRangeTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "领取后, 第几天失效  valid_time_type=RELATIVE时有效且必填  只允许增加领取后可用天数")

  public Integer getValidDaysRangeTo() {
    return validDaysRangeTo;
  }


  public void setValidDaysRangeTo(Integer validDaysRangeTo) {
    this.validDaysRangeTo = validDaysRangeTo;
  }


  public MerchantActivityModifyVoucherInfo validTimeRangeTo(String validTimeRangeTo) {
    
    this.validTimeRangeTo = validTimeRangeTo;
    return this;
  }

   /**
   * 有效期截止时间  valid_time_type&#x3D;FIXED时有效且必填  券有效结束时间格式必须为yyyy-MM-dd HH:mm:ss  只允许延长固定时间的结束时间（支持到分）
   * @return validTimeRangeTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-05-12 21:59:22", value = "有效期截止时间  valid_time_type=FIXED时有效且必填  券有效结束时间格式必须为yyyy-MM-dd HH:mm:ss  只允许延长固定时间的结束时间（支持到分）")

  public String getValidTimeRangeTo() {
    return validTimeRangeTo;
  }


  public void setValidTimeRangeTo(String validTimeRangeTo) {
    this.validTimeRangeTo = validTimeRangeTo;
  }


  public MerchantActivityModifyVoucherInfo validTimeType(String validTimeType) {
    
    this.validTimeType = validTimeType;
    return this;
  }

   /**
   * 有效期类型：  枚举值：RELATIVE/FIXED
   * @return validTimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RELATIVE", value = "有效期类型：  枚举值：RELATIVE/FIXED")

  public String getValidTimeType() {
    return validTimeType;
  }


  public void setValidTimeType(String validTimeType) {
    this.validTimeType = validTimeType;
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
   * @return the MerchantActivityModifyVoucherInfo instance itself
   */
  public MerchantActivityModifyVoucherInfo putAdditionalProperty(String key, Object value) {
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
    MerchantActivityModifyVoucherInfo merchantActivityModifyVoucherInfo = (MerchantActivityModifyVoucherInfo) o;
    return Objects.equals(this.logo, merchantActivityModifyVoucherInfo.logo) &&
        Objects.equals(this.userIntroductions, merchantActivityModifyVoucherInfo.userIntroductions) &&
        Objects.equals(this.validDaysRangeTo, merchantActivityModifyVoucherInfo.validDaysRangeTo) &&
        Objects.equals(this.validTimeRangeTo, merchantActivityModifyVoucherInfo.validTimeRangeTo) &&
        Objects.equals(this.validTimeType, merchantActivityModifyVoucherInfo.validTimeType)&&
        Objects.equals(this.additionalProperties, merchantActivityModifyVoucherInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logo, userIntroductions, validDaysRangeTo, validTimeRangeTo, validTimeType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantActivityModifyVoucherInfo {\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    userIntroductions: ").append(toIndentedString(userIntroductions)).append("\n");
    sb.append("    validDaysRangeTo: ").append(toIndentedString(validDaysRangeTo)).append("\n");
    sb.append("    validTimeRangeTo: ").append(toIndentedString(validTimeRangeTo)).append("\n");
    sb.append("    validTimeType: ").append(toIndentedString(validTimeType)).append("\n");
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
    openapiFields.add("logo");
    openapiFields.add("user_introductions");
    openapiFields.add("valid_days_range_to");
    openapiFields.add("valid_time_range_to");
    openapiFields.add("valid_time_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantActivityModifyVoucherInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantActivityModifyVoucherInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantActivityModifyVoucherInfo is not found in the empty JSON string", MerchantActivityModifyVoucherInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (jsonObj.get("user_introductions") != null && !jsonObj.get("user_introductions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_introductions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_introductions").toString()));
      }
      if (jsonObj.get("valid_time_range_to") != null && !jsonObj.get("valid_time_range_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_time_range_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_time_range_to").toString()));
      }
      if (jsonObj.get("valid_time_type") != null && !jsonObj.get("valid_time_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_time_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_time_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantActivityModifyVoucherInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantActivityModifyVoucherInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantActivityModifyVoucherInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantActivityModifyVoucherInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantActivityModifyVoucherInfo>() {
           @Override
           public void write(JsonWriter out, MerchantActivityModifyVoucherInfo value) throws IOException {
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
           public MerchantActivityModifyVoucherInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantActivityModifyVoucherInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantActivityModifyVoucherInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantActivityModifyVoucherInfo
  * @throws IOException if the JSON string is invalid with respect to MerchantActivityModifyVoucherInfo
  */
  public static MerchantActivityModifyVoucherInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantActivityModifyVoucherInfo.class);
  }

 /**
  * Convert an instance of MerchantActivityModifyVoucherInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

