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
 * ZMGOCycleFlexConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZMGOCycleFlexConfig {
  public static final String SERIALIZED_NAME_CYCLE_FLEX_WITHHOLD_FEE_NAME = "cycle_flex_withhold_fee_name";
  @SerializedName(SERIALIZED_NAME_CYCLE_FLEX_WITHHOLD_FEE_NAME)
  private String cycleFlexWithholdFeeName;

  public static final String SERIALIZED_NAME_CYCLE_FLEX_WITHHOLD_MAX_PRICE = "cycle_flex_withhold_max_price";
  @SerializedName(SERIALIZED_NAME_CYCLE_FLEX_WITHHOLD_MAX_PRICE)
  private String cycleFlexWithholdMaxPrice;

  public static final String SERIALIZED_NAME_CYCLE_FLEX_WITHHOLD_TOTAL_PERIOD_COUNT = "cycle_flex_withhold_total_period_count";
  @SerializedName(SERIALIZED_NAME_CYCLE_FLEX_WITHHOLD_TOTAL_PERIOD_COUNT)
  private Integer cycleFlexWithholdTotalPeriodCount;

  public ZMGOCycleFlexConfig() { 
  }

  public ZMGOCycleFlexConfig cycleFlexWithholdFeeName(String cycleFlexWithholdFeeName) {
    
    this.cycleFlexWithholdFeeName = cycleFlexWithholdFeeName;
    return this;
  }

   /**
   * 周期灵活扣的费用名称
   * @return cycleFlexWithholdFeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期灵活扣的费用名称")

  public String getCycleFlexWithholdFeeName() {
    return cycleFlexWithholdFeeName;
  }


  public void setCycleFlexWithholdFeeName(String cycleFlexWithholdFeeName) {
    this.cycleFlexWithholdFeeName = cycleFlexWithholdFeeName;
  }


  public ZMGOCycleFlexConfig cycleFlexWithholdMaxPrice(String cycleFlexWithholdMaxPrice) {
    
    this.cycleFlexWithholdMaxPrice = cycleFlexWithholdMaxPrice;
    return this;
  }

   /**
   * 周期灵活扣单期扣款的最大额度
   * @return cycleFlexWithholdMaxPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期灵活扣单期扣款的最大额度")

  public String getCycleFlexWithholdMaxPrice() {
    return cycleFlexWithholdMaxPrice;
  }


  public void setCycleFlexWithholdMaxPrice(String cycleFlexWithholdMaxPrice) {
    this.cycleFlexWithholdMaxPrice = cycleFlexWithholdMaxPrice;
  }


  public ZMGOCycleFlexConfig cycleFlexWithholdTotalPeriodCount(Integer cycleFlexWithholdTotalPeriodCount) {
    
    this.cycleFlexWithholdTotalPeriodCount = cycleFlexWithholdTotalPeriodCount;
    return this;
  }

   /**
   * 周期灵活扣的总期数
   * @return cycleFlexWithholdTotalPeriodCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期灵活扣的总期数")

  public Integer getCycleFlexWithholdTotalPeriodCount() {
    return cycleFlexWithholdTotalPeriodCount;
  }


  public void setCycleFlexWithholdTotalPeriodCount(Integer cycleFlexWithholdTotalPeriodCount) {
    this.cycleFlexWithholdTotalPeriodCount = cycleFlexWithholdTotalPeriodCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZMGOCycleFlexConfig zmGOCycleFlexConfig = (ZMGOCycleFlexConfig) o;
    return Objects.equals(this.cycleFlexWithholdFeeName, zmGOCycleFlexConfig.cycleFlexWithholdFeeName) &&
        Objects.equals(this.cycleFlexWithholdMaxPrice, zmGOCycleFlexConfig.cycleFlexWithholdMaxPrice) &&
        Objects.equals(this.cycleFlexWithholdTotalPeriodCount, zmGOCycleFlexConfig.cycleFlexWithholdTotalPeriodCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleFlexWithholdFeeName, cycleFlexWithholdMaxPrice, cycleFlexWithholdTotalPeriodCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZMGOCycleFlexConfig {\n");
    sb.append("    cycleFlexWithholdFeeName: ").append(toIndentedString(cycleFlexWithholdFeeName)).append("\n");
    sb.append("    cycleFlexWithholdMaxPrice: ").append(toIndentedString(cycleFlexWithholdMaxPrice)).append("\n");
    sb.append("    cycleFlexWithholdTotalPeriodCount: ").append(toIndentedString(cycleFlexWithholdTotalPeriodCount)).append("\n");
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
    openapiFields.add("cycle_flex_withhold_fee_name");
    openapiFields.add("cycle_flex_withhold_max_price");
    openapiFields.add("cycle_flex_withhold_total_period_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZMGOCycleFlexConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZMGOCycleFlexConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZMGOCycleFlexConfig is not found in the empty JSON string", ZMGOCycleFlexConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZMGOCycleFlexConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZMGOCycleFlexConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cycle_flex_withhold_fee_name") != null && !jsonObj.get("cycle_flex_withhold_fee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_flex_withhold_fee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_flex_withhold_fee_name").toString()));
      }
      if (jsonObj.get("cycle_flex_withhold_max_price") != null && !jsonObj.get("cycle_flex_withhold_max_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_flex_withhold_max_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_flex_withhold_max_price").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZMGOCycleFlexConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZMGOCycleFlexConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZMGOCycleFlexConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZMGOCycleFlexConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ZMGOCycleFlexConfig>() {
           @Override
           public void write(JsonWriter out, ZMGOCycleFlexConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZMGOCycleFlexConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZMGOCycleFlexConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZMGOCycleFlexConfig
  * @throws IOException if the JSON string is invalid with respect to ZMGOCycleFlexConfig
  */
  public static ZMGOCycleFlexConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZMGOCycleFlexConfig.class);
  }

 /**
  * Convert an instance of ZMGOCycleFlexConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

