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
import com.alipay.v3.model.VoucherRechargeInfo;
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
 * VoucherBudgetSupplyInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherBudgetSupplyInfo {
  public static final String SERIALIZED_NAME_BUDGET_TYPE = "budget_type";
  @SerializedName(SERIALIZED_NAME_BUDGET_TYPE)
  private String budgetType;

  public static final String SERIALIZED_NAME_VOUCHER_RECHARGE_INFO = "voucher_recharge_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_RECHARGE_INFO)
  private VoucherRechargeInfo voucherRechargeInfo;

  public VoucherBudgetSupplyInfo() { 
  }

  public VoucherBudgetSupplyInfo budgetType(String budgetType) {
    
    this.budgetType = budgetType;
    return this;
  }

   /**
   * 营销资金预算类型  1、免充值：制券方无需提前充值资金，用户核销支付券时，直接从订单原价中扣除优惠减价金额，最终只将用户实际支付的金额结算给核销商户，商户实收少于订单原价。   2.预充值:  制券方需将优惠预算提前充值到支付宝指定营销账户中，用户核销支付券时，系统从该账户可用余额中扣除优惠减价部分对应的资金，连同用户实际支付的资金，一并结算给核销商户，不影响实收。
   * @return budgetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营销资金预算类型  1、免充值：制券方无需提前充值资金，用户核销支付券时，直接从订单原价中扣除优惠减价金额，最终只将用户实际支付的金额结算给核销商户，商户实收少于订单原价。   2.预充值:  制券方需将优惠预算提前充值到支付宝指定营销账户中，用户核销支付券时，系统从该账户可用余额中扣除优惠减价部分对应的资金，连同用户实际支付的资金，一并结算给核销商户，不影响实收。")

  public String getBudgetType() {
    return budgetType;
  }


  public void setBudgetType(String budgetType) {
    this.budgetType = budgetType;
  }


  public VoucherBudgetSupplyInfo voucherRechargeInfo(VoucherRechargeInfo voucherRechargeInfo) {
    
    this.voucherRechargeInfo = voucherRechargeInfo;
    return this;
  }

   /**
   * Get voucherRechargeInfo
   * @return voucherRechargeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherRechargeInfo getVoucherRechargeInfo() {
    return voucherRechargeInfo;
  }


  public void setVoucherRechargeInfo(VoucherRechargeInfo voucherRechargeInfo) {
    this.voucherRechargeInfo = voucherRechargeInfo;
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
   * @return the VoucherBudgetSupplyInfo instance itself
   */
  public VoucherBudgetSupplyInfo putAdditionalProperty(String key, Object value) {
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
    VoucherBudgetSupplyInfo voucherBudgetSupplyInfo = (VoucherBudgetSupplyInfo) o;
    return Objects.equals(this.budgetType, voucherBudgetSupplyInfo.budgetType) &&
        Objects.equals(this.voucherRechargeInfo, voucherBudgetSupplyInfo.voucherRechargeInfo)&&
        Objects.equals(this.additionalProperties, voucherBudgetSupplyInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetType, voucherRechargeInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherBudgetSupplyInfo {\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    voucherRechargeInfo: ").append(toIndentedString(voucherRechargeInfo)).append("\n");
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
    openapiFields.add("budget_type");
    openapiFields.add("voucher_recharge_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherBudgetSupplyInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherBudgetSupplyInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherBudgetSupplyInfo is not found in the empty JSON string", VoucherBudgetSupplyInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("budget_type") != null && !jsonObj.get("budget_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budget_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budget_type").toString()));
      }
      // validate the optional field `voucher_recharge_info`
      if (jsonObj.getAsJsonObject("voucher_recharge_info") != null) {
        VoucherRechargeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_recharge_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherBudgetSupplyInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherBudgetSupplyInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherBudgetSupplyInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherBudgetSupplyInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherBudgetSupplyInfo>() {
           @Override
           public void write(JsonWriter out, VoucherBudgetSupplyInfo value) throws IOException {
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
           public VoucherBudgetSupplyInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherBudgetSupplyInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherBudgetSupplyInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherBudgetSupplyInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherBudgetSupplyInfo
  */
  public static VoucherBudgetSupplyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherBudgetSupplyInfo.class);
  }

 /**
  * Convert an instance of VoucherBudgetSupplyInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

