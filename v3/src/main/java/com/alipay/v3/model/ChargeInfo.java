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
import com.alipay.v3.model.SubFee;
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
 * ChargeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChargeInfo {
  public static final String SERIALIZED_NAME_CHARGE_FEE = "charge_fee";
  @SerializedName(SERIALIZED_NAME_CHARGE_FEE)
  private String chargeFee;

  public static final String SERIALIZED_NAME_CHARGE_TYPE = "charge_type";
  @SerializedName(SERIALIZED_NAME_CHARGE_TYPE)
  private String chargeType;

  public static final String SERIALIZED_NAME_IS_RATING_ON_SWITCH = "is_rating_on_switch";
  @SerializedName(SERIALIZED_NAME_IS_RATING_ON_SWITCH)
  private String isRatingOnSwitch;

  public static final String SERIALIZED_NAME_IS_RATING_ON_TRADE_RECEIVER = "is_rating_on_trade_receiver";
  @SerializedName(SERIALIZED_NAME_IS_RATING_ON_TRADE_RECEIVER)
  private String isRatingOnTradeReceiver;

  public static final String SERIALIZED_NAME_ORIGINAL_CHARGE_FEE = "original_charge_fee";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_CHARGE_FEE)
  private String originalChargeFee;

  public static final String SERIALIZED_NAME_SUB_FEE_DETAIL_LIST = "sub_fee_detail_list";
  @SerializedName(SERIALIZED_NAME_SUB_FEE_DETAIL_LIST)
  private List<SubFee> subFeeDetailList = null;

  public static final String SERIALIZED_NAME_SWITCH_FEE_RATE = "switch_fee_rate";
  @SerializedName(SERIALIZED_NAME_SWITCH_FEE_RATE)
  private String switchFeeRate;

  public ChargeInfo() { 
  }

  public ChargeInfo chargeFee(String chargeFee) {
    
    this.chargeFee = chargeFee;
    return this;
  }

   /**
   * 实收费用
   * @return chargeFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "实收费用")

  public String getChargeFee() {
    return chargeFee;
  }


  public void setChargeFee(String chargeFee) {
    this.chargeFee = chargeFee;
  }


  public ChargeInfo chargeType(String chargeType) {
    
    this.chargeType = chargeType;
    return this;
  }

   /**
   * 收单手续费trade，花呗分期手续hbfq，其他手续费charge
   * @return chargeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收单手续费trade，花呗分期手续hbfq，其他手续费charge")

  public String getChargeType() {
    return chargeType;
  }


  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }


  public ChargeInfo isRatingOnSwitch(String isRatingOnSwitch) {
    
    this.isRatingOnSwitch = isRatingOnSwitch;
    return this;
  }

   /**
   * 是否合约指定收费账号出资，值为\&quot;Y\&quot;或\&quot;N\&quot;
   * @return isRatingOnSwitch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否合约指定收费账号出资，值为\"Y\"或\"N\"")

  public String getIsRatingOnSwitch() {
    return isRatingOnSwitch;
  }


  public void setIsRatingOnSwitch(String isRatingOnSwitch) {
    this.isRatingOnSwitch = isRatingOnSwitch;
  }


  public ChargeInfo isRatingOnTradeReceiver(String isRatingOnTradeReceiver) {
    
    this.isRatingOnTradeReceiver = isRatingOnTradeReceiver;
    return this;
  }

   /**
   * 是否收款账号出资，值为\&quot;Y\&quot;或\&quot;N\&quot;
   * @return isRatingOnTradeReceiver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否收款账号出资，值为\"Y\"或\"N\"")

  public String getIsRatingOnTradeReceiver() {
    return isRatingOnTradeReceiver;
  }


  public void setIsRatingOnTradeReceiver(String isRatingOnTradeReceiver) {
    this.isRatingOnTradeReceiver = isRatingOnTradeReceiver;
  }


  public ChargeInfo originalChargeFee(String originalChargeFee) {
    
    this.originalChargeFee = originalChargeFee;
    return this;
  }

   /**
   * 原始费用
   * @return originalChargeFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "原始费用")

  public String getOriginalChargeFee() {
    return originalChargeFee;
  }


  public void setOriginalChargeFee(String originalChargeFee) {
    this.originalChargeFee = originalChargeFee;
  }


  public ChargeInfo subFeeDetailList(List<SubFee> subFeeDetailList) {
    
    this.subFeeDetailList = subFeeDetailList;
    return this;
  }

  public ChargeInfo addSubFeeDetailListItem(SubFee subFeeDetailListItem) {
    if (this.subFeeDetailList == null) {
      this.subFeeDetailList = new ArrayList<>();
    }
    this.subFeeDetailList.add(subFeeDetailListItem);
    return this;
  }

   /**
   * 组合支付收费明细
   * @return subFeeDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "组合支付收费明细")

  public List<SubFee> getSubFeeDetailList() {
    return subFeeDetailList;
  }


  public void setSubFeeDetailList(List<SubFee> subFeeDetailList) {
    this.subFeeDetailList = subFeeDetailList;
  }


  public ChargeInfo switchFeeRate(String switchFeeRate) {
    
    this.switchFeeRate = switchFeeRate;
    return this;
  }

   /**
   * 签约费率
   * @return switchFeeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "签约费率")

  public String getSwitchFeeRate() {
    return switchFeeRate;
  }


  public void setSwitchFeeRate(String switchFeeRate) {
    this.switchFeeRate = switchFeeRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeInfo chargeInfo = (ChargeInfo) o;
    return Objects.equals(this.chargeFee, chargeInfo.chargeFee) &&
        Objects.equals(this.chargeType, chargeInfo.chargeType) &&
        Objects.equals(this.isRatingOnSwitch, chargeInfo.isRatingOnSwitch) &&
        Objects.equals(this.isRatingOnTradeReceiver, chargeInfo.isRatingOnTradeReceiver) &&
        Objects.equals(this.originalChargeFee, chargeInfo.originalChargeFee) &&
        Objects.equals(this.subFeeDetailList, chargeInfo.subFeeDetailList) &&
        Objects.equals(this.switchFeeRate, chargeInfo.switchFeeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeFee, chargeType, isRatingOnSwitch, isRatingOnTradeReceiver, originalChargeFee, subFeeDetailList, switchFeeRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeInfo {\n");
    sb.append("    chargeFee: ").append(toIndentedString(chargeFee)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    isRatingOnSwitch: ").append(toIndentedString(isRatingOnSwitch)).append("\n");
    sb.append("    isRatingOnTradeReceiver: ").append(toIndentedString(isRatingOnTradeReceiver)).append("\n");
    sb.append("    originalChargeFee: ").append(toIndentedString(originalChargeFee)).append("\n");
    sb.append("    subFeeDetailList: ").append(toIndentedString(subFeeDetailList)).append("\n");
    sb.append("    switchFeeRate: ").append(toIndentedString(switchFeeRate)).append("\n");
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
    openapiFields.add("charge_fee");
    openapiFields.add("charge_type");
    openapiFields.add("is_rating_on_switch");
    openapiFields.add("is_rating_on_trade_receiver");
    openapiFields.add("original_charge_fee");
    openapiFields.add("sub_fee_detail_list");
    openapiFields.add("switch_fee_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChargeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChargeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargeInfo is not found in the empty JSON string", ChargeInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChargeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChargeInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("charge_fee") != null && !jsonObj.get("charge_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_fee").toString()));
      }
      if (jsonObj.get("charge_type") != null && !jsonObj.get("charge_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_type").toString()));
      }
      if (jsonObj.get("is_rating_on_switch") != null && !jsonObj.get("is_rating_on_switch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_rating_on_switch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_rating_on_switch").toString()));
      }
      if (jsonObj.get("is_rating_on_trade_receiver") != null && !jsonObj.get("is_rating_on_trade_receiver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_rating_on_trade_receiver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_rating_on_trade_receiver").toString()));
      }
      if (jsonObj.get("original_charge_fee") != null && !jsonObj.get("original_charge_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_charge_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_charge_fee").toString()));
      }
      JsonArray jsonArraysubFeeDetailList = jsonObj.getAsJsonArray("sub_fee_detail_list");
      if (jsonArraysubFeeDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sub_fee_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sub_fee_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("sub_fee_detail_list").toString()));
        }

        // validate the optional field `sub_fee_detail_list` (array)
        for (int i = 0; i < jsonArraysubFeeDetailList.size(); i++) {
          SubFee.validateJsonObject(jsonArraysubFeeDetailList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("switch_fee_rate") != null && !jsonObj.get("switch_fee_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `switch_fee_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("switch_fee_rate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargeInfo>() {
           @Override
           public void write(JsonWriter out, ChargeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChargeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChargeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargeInfo
  * @throws IOException if the JSON string is invalid with respect to ChargeInfo
  */
  public static ChargeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargeInfo.class);
  }

 /**
  * Convert an instance of ChargeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

