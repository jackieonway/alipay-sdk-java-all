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
 * VoucherPackageBaseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherPackageBaseInfo {
  public static final String SERIALIZED_NAME_PURCHASE_END_TIME = "purchase_end_time";
  @SerializedName(SERIALIZED_NAME_PURCHASE_END_TIME)
  private String purchaseEndTime;

  public static final String SERIALIZED_NAME_PURCHASE_START_TIME = "purchase_start_time";
  @SerializedName(SERIALIZED_NAME_PURCHASE_START_TIME)
  private String purchaseStartTime;

  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_ID = "voucher_package_id";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_ID)
  private String voucherPackageId;

  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_NAME = "voucher_package_name";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_NAME)
  private String voucherPackageName;

  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_STATUS = "voucher_package_status";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_STATUS)
  private String voucherPackageStatus;

  public static final String SERIALIZED_NAME_VOUCHER_TOTAL_AMOUNT = "voucher_total_amount";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TOTAL_AMOUNT)
  private String voucherTotalAmount;

  public VoucherPackageBaseInfo() { 
  }

  public VoucherPackageBaseInfo purchaseEndTime(String purchaseEndTime) {
    
    this.purchaseEndTime = purchaseEndTime;
    return this;
  }

   /**
   * 券包购买结束时间
   * @return purchaseEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券包购买结束时间")

  public String getPurchaseEndTime() {
    return purchaseEndTime;
  }


  public void setPurchaseEndTime(String purchaseEndTime) {
    this.purchaseEndTime = purchaseEndTime;
  }


  public VoucherPackageBaseInfo purchaseStartTime(String purchaseStartTime) {
    
    this.purchaseStartTime = purchaseStartTime;
    return this;
  }

   /**
   * 券包购买开始时间
   * @return purchaseStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券包购买开始时间")

  public String getPurchaseStartTime() {
    return purchaseStartTime;
  }


  public void setPurchaseStartTime(String purchaseStartTime) {
    this.purchaseStartTime = purchaseStartTime;
  }


  public VoucherPackageBaseInfo voucherPackageId(String voucherPackageId) {
    
    this.voucherPackageId = voucherPackageId;
    return this;
  }

   /**
   * 券包id
   * @return voucherPackageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券包id")

  public String getVoucherPackageId() {
    return voucherPackageId;
  }


  public void setVoucherPackageId(String voucherPackageId) {
    this.voucherPackageId = voucherPackageId;
  }


  public VoucherPackageBaseInfo voucherPackageName(String voucherPackageName) {
    
    this.voucherPackageName = voucherPackageName;
    return this;
  }

   /**
   * 券包名称
   * @return voucherPackageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券包名称")

  public String getVoucherPackageName() {
    return voucherPackageName;
  }


  public void setVoucherPackageName(String voucherPackageName) {
    this.voucherPackageName = voucherPackageName;
  }


  public VoucherPackageBaseInfo voucherPackageStatus(String voucherPackageStatus) {
    
    this.voucherPackageStatus = voucherPackageStatus;
    return this;
  }

   /**
   * 券包状态
   * @return voucherPackageStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券包状态")

  public String getVoucherPackageStatus() {
    return voucherPackageStatus;
  }


  public void setVoucherPackageStatus(String voucherPackageStatus) {
    this.voucherPackageStatus = voucherPackageStatus;
  }


  public VoucherPackageBaseInfo voucherTotalAmount(String voucherTotalAmount) {
    
    this.voucherTotalAmount = voucherTotalAmount;
    return this;
  }

   /**
   * 券包总价值（单位是元）： 券包下券的优惠总额（满减券指优惠面额，折扣券指优惠上限，特价券指原价减去特价）
   * @return voucherTotalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券包总价值（单位是元）： 券包下券的优惠总额（满减券指优惠面额，折扣券指优惠上限，特价券指原价减去特价）")

  public String getVoucherTotalAmount() {
    return voucherTotalAmount;
  }


  public void setVoucherTotalAmount(String voucherTotalAmount) {
    this.voucherTotalAmount = voucherTotalAmount;
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
   * @return the VoucherPackageBaseInfo instance itself
   */
  public VoucherPackageBaseInfo putAdditionalProperty(String key, Object value) {
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
    VoucherPackageBaseInfo voucherPackageBaseInfo = (VoucherPackageBaseInfo) o;
    return Objects.equals(this.purchaseEndTime, voucherPackageBaseInfo.purchaseEndTime) &&
        Objects.equals(this.purchaseStartTime, voucherPackageBaseInfo.purchaseStartTime) &&
        Objects.equals(this.voucherPackageId, voucherPackageBaseInfo.voucherPackageId) &&
        Objects.equals(this.voucherPackageName, voucherPackageBaseInfo.voucherPackageName) &&
        Objects.equals(this.voucherPackageStatus, voucherPackageBaseInfo.voucherPackageStatus) &&
        Objects.equals(this.voucherTotalAmount, voucherPackageBaseInfo.voucherTotalAmount)&&
        Objects.equals(this.additionalProperties, voucherPackageBaseInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseEndTime, purchaseStartTime, voucherPackageId, voucherPackageName, voucherPackageStatus, voucherTotalAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherPackageBaseInfo {\n");
    sb.append("    purchaseEndTime: ").append(toIndentedString(purchaseEndTime)).append("\n");
    sb.append("    purchaseStartTime: ").append(toIndentedString(purchaseStartTime)).append("\n");
    sb.append("    voucherPackageId: ").append(toIndentedString(voucherPackageId)).append("\n");
    sb.append("    voucherPackageName: ").append(toIndentedString(voucherPackageName)).append("\n");
    sb.append("    voucherPackageStatus: ").append(toIndentedString(voucherPackageStatus)).append("\n");
    sb.append("    voucherTotalAmount: ").append(toIndentedString(voucherTotalAmount)).append("\n");
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
    openapiFields.add("purchase_end_time");
    openapiFields.add("purchase_start_time");
    openapiFields.add("voucher_package_id");
    openapiFields.add("voucher_package_name");
    openapiFields.add("voucher_package_status");
    openapiFields.add("voucher_total_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherPackageBaseInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherPackageBaseInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherPackageBaseInfo is not found in the empty JSON string", VoucherPackageBaseInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("purchase_end_time") != null && !jsonObj.get("purchase_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchase_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purchase_end_time").toString()));
      }
      if (jsonObj.get("purchase_start_time") != null && !jsonObj.get("purchase_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchase_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purchase_start_time").toString()));
      }
      if (jsonObj.get("voucher_package_id") != null && !jsonObj.get("voucher_package_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_package_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_package_id").toString()));
      }
      if (jsonObj.get("voucher_package_name") != null && !jsonObj.get("voucher_package_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_package_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_package_name").toString()));
      }
      if (jsonObj.get("voucher_package_status") != null && !jsonObj.get("voucher_package_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_package_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_package_status").toString()));
      }
      if (jsonObj.get("voucher_total_amount") != null && !jsonObj.get("voucher_total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_total_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherPackageBaseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherPackageBaseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherPackageBaseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherPackageBaseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherPackageBaseInfo>() {
           @Override
           public void write(JsonWriter out, VoucherPackageBaseInfo value) throws IOException {
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
           public VoucherPackageBaseInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherPackageBaseInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherPackageBaseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherPackageBaseInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherPackageBaseInfo
  */
  public static VoucherPackageBaseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherPackageBaseInfo.class);
  }

 /**
  * Convert an instance of VoucherPackageBaseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

