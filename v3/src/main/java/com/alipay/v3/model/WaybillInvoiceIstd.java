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
 * WaybillInvoiceIstd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WaybillInvoiceIstd {
  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_SHOP_NO = "shop_no";
  @SerializedName(SERIALIZED_NAME_SHOP_NO)
  private String shopNo;

  public static final String SERIALIZED_NAME_WAYBILL_AMOUNT = "waybill_amount";
  @SerializedName(SERIALIZED_NAME_WAYBILL_AMOUNT)
  private String waybillAmount;

  public static final String SERIALIZED_NAME_WAYBILL_INVOICE_STATUS = "waybill_invoice_status";
  @SerializedName(SERIALIZED_NAME_WAYBILL_INVOICE_STATUS)
  private Integer waybillInvoiceStatus;

  public static final String SERIALIZED_NAME_WAYBILL_NO = "waybill_no";
  @SerializedName(SERIALIZED_NAME_WAYBILL_NO)
  private String waybillNo;

  public WaybillInvoiceIstd() { 
  }

  public WaybillInvoiceIstd reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 失败原因，需要传单个配送单的驳回原因
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "开票失败原因", value = "失败原因，需要传单个配送单的驳回原因")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public WaybillInvoiceIstd shopNo(String shopNo) {
    
    this.shopNo = shopNo;
    return this;
  }

   /**
   * 商家门店编号
   * @return shopNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "shop_no_00001", value = "商家门店编号")

  public String getShopNo() {
    return shopNo;
  }


  public void setShopNo(String shopNo) {
    this.shopNo = shopNo;
  }


  public WaybillInvoiceIstd waybillAmount(String waybillAmount) {
    
    this.waybillAmount = waybillAmount;
    return this;
  }

   /**
   * 即时配送运单金额，waybill_invoce_status为1的情况下不能为空
   * @return waybillAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "即时配送运单金额，waybill_invoce_status为1的情况下不能为空")

  public String getWaybillAmount() {
    return waybillAmount;
  }


  public void setWaybillAmount(String waybillAmount) {
    this.waybillAmount = waybillAmount;
  }


  public WaybillInvoiceIstd waybillInvoiceStatus(Integer waybillInvoiceStatus) {
    
    this.waybillInvoiceStatus = waybillInvoiceStatus;
    return this;
  }

   /**
   * 明细的运单开票状态，1：开票成功 2：不可开票 3：可开票；整体开票状态为0的情况下，无开票明细；整体开票状态为1，明细开票状态全部是1；整体开票状态为2，明细开票状态为2或者3
   * @return waybillInvoiceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "明细的运单开票状态，1：开票成功 2：不可开票 3：可开票；整体开票状态为0的情况下，无开票明细；整体开票状态为1，明细开票状态全部是1；整体开票状态为2，明细开票状态为2或者3")

  public Integer getWaybillInvoiceStatus() {
    return waybillInvoiceStatus;
  }


  public void setWaybillInvoiceStatus(Integer waybillInvoiceStatus) {
    this.waybillInvoiceStatus = waybillInvoiceStatus;
  }


  public WaybillInvoiceIstd waybillNo(String waybillNo) {
    
    this.waybillNo = waybillNo;
    return this;
  }

   /**
   * 即时配送运单编号
   * @return waybillNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "waybillNo_20200811", value = "即时配送运单编号")

  public String getWaybillNo() {
    return waybillNo;
  }


  public void setWaybillNo(String waybillNo) {
    this.waybillNo = waybillNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaybillInvoiceIstd waybillInvoiceIstd = (WaybillInvoiceIstd) o;
    return Objects.equals(this.reason, waybillInvoiceIstd.reason) &&
        Objects.equals(this.shopNo, waybillInvoiceIstd.shopNo) &&
        Objects.equals(this.waybillAmount, waybillInvoiceIstd.waybillAmount) &&
        Objects.equals(this.waybillInvoiceStatus, waybillInvoiceIstd.waybillInvoiceStatus) &&
        Objects.equals(this.waybillNo, waybillInvoiceIstd.waybillNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, shopNo, waybillAmount, waybillInvoiceStatus, waybillNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaybillInvoiceIstd {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    shopNo: ").append(toIndentedString(shopNo)).append("\n");
    sb.append("    waybillAmount: ").append(toIndentedString(waybillAmount)).append("\n");
    sb.append("    waybillInvoiceStatus: ").append(toIndentedString(waybillInvoiceStatus)).append("\n");
    sb.append("    waybillNo: ").append(toIndentedString(waybillNo)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("shop_no");
    openapiFields.add("waybill_amount");
    openapiFields.add("waybill_invoice_status");
    openapiFields.add("waybill_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WaybillInvoiceIstd
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WaybillInvoiceIstd.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WaybillInvoiceIstd is not found in the empty JSON string", WaybillInvoiceIstd.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WaybillInvoiceIstd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WaybillInvoiceIstd` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (jsonObj.get("shop_no") != null && !jsonObj.get("shop_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_no").toString()));
      }
      if (jsonObj.get("waybill_amount") != null && !jsonObj.get("waybill_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waybill_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waybill_amount").toString()));
      }
      if (jsonObj.get("waybill_no") != null && !jsonObj.get("waybill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waybill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waybill_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WaybillInvoiceIstd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WaybillInvoiceIstd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WaybillInvoiceIstd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WaybillInvoiceIstd.class));

       return (TypeAdapter<T>) new TypeAdapter<WaybillInvoiceIstd>() {
           @Override
           public void write(JsonWriter out, WaybillInvoiceIstd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WaybillInvoiceIstd read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WaybillInvoiceIstd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WaybillInvoiceIstd
  * @throws IOException if the JSON string is invalid with respect to WaybillInvoiceIstd
  */
  public static WaybillInvoiceIstd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WaybillInvoiceIstd.class);
  }

 /**
  * Convert an instance of WaybillInvoiceIstd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

