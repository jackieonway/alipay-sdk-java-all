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
 * PaidOuterCardCycleSellConfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaidOuterCardCycleSellConfDTO {
  public static final String SERIALIZED_NAME_CYCLE_SELLING_URL = "cycle_selling_url";
  @SerializedName(SERIALIZED_NAME_CYCLE_SELLING_URL)
  private String cycleSellingUrl;

  public static final String SERIALIZED_NAME_CYCLE_TYPE = "cycle_type";
  @SerializedName(SERIALIZED_NAME_CYCLE_TYPE)
  private List<String> cycleType = null;

  public static final String SERIALIZED_NAME_SUPPORT_CYCLE_SELL = "support_cycle_sell";
  @SerializedName(SERIALIZED_NAME_SUPPORT_CYCLE_SELL)
  private Boolean supportCycleSell;

  public PaidOuterCardCycleSellConfDTO() { 
  }

  public PaidOuterCardCycleSellConfDTO cycleSellingUrl(String cycleSellingUrl) {
    
    this.cycleSellingUrl = cycleSellingUrl;
    return this;
  }

   /**
   * 用户开通连续购买地址
   * @return cycleSellingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户开通连续购买地址")

  public String getCycleSellingUrl() {
    return cycleSellingUrl;
  }


  public void setCycleSellingUrl(String cycleSellingUrl) {
    this.cycleSellingUrl = cycleSellingUrl;
  }


  public PaidOuterCardCycleSellConfDTO cycleType(List<String> cycleType) {
    
    this.cycleType = cycleType;
    return this;
  }

  public PaidOuterCardCycleSellConfDTO addCycleTypeItem(String cycleTypeItem) {
    if (this.cycleType == null) {
      this.cycleType = new ArrayList<>();
    }
    this.cycleType.add(cycleTypeItem);
    return this;
  }

   /**
   * 周期购买类型。
   * @return cycleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期购买类型。")

  public List<String> getCycleType() {
    return cycleType;
  }


  public void setCycleType(List<String> cycleType) {
    this.cycleType = cycleType;
  }


  public PaidOuterCardCycleSellConfDTO supportCycleSell(Boolean supportCycleSell) {
    
    this.supportCycleSell = supportCycleSell;
    return this;
  }

   /**
   * 是否支持用户连续购买
   * @return supportCycleSell
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否支持用户连续购买")

  public Boolean getSupportCycleSell() {
    return supportCycleSell;
  }


  public void setSupportCycleSell(Boolean supportCycleSell) {
    this.supportCycleSell = supportCycleSell;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaidOuterCardCycleSellConfDTO paidOuterCardCycleSellConfDTO = (PaidOuterCardCycleSellConfDTO) o;
    return Objects.equals(this.cycleSellingUrl, paidOuterCardCycleSellConfDTO.cycleSellingUrl) &&
        Objects.equals(this.cycleType, paidOuterCardCycleSellConfDTO.cycleType) &&
        Objects.equals(this.supportCycleSell, paidOuterCardCycleSellConfDTO.supportCycleSell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleSellingUrl, cycleType, supportCycleSell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaidOuterCardCycleSellConfDTO {\n");
    sb.append("    cycleSellingUrl: ").append(toIndentedString(cycleSellingUrl)).append("\n");
    sb.append("    cycleType: ").append(toIndentedString(cycleType)).append("\n");
    sb.append("    supportCycleSell: ").append(toIndentedString(supportCycleSell)).append("\n");
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
    openapiFields.add("cycle_selling_url");
    openapiFields.add("cycle_type");
    openapiFields.add("support_cycle_sell");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaidOuterCardCycleSellConfDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaidOuterCardCycleSellConfDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaidOuterCardCycleSellConfDTO is not found in the empty JSON string", PaidOuterCardCycleSellConfDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaidOuterCardCycleSellConfDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaidOuterCardCycleSellConfDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cycle_selling_url") != null && !jsonObj.get("cycle_selling_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_selling_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_selling_url").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("cycle_type") != null && !jsonObj.get("cycle_type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_type` to be an array in the JSON string but got `%s`", jsonObj.get("cycle_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaidOuterCardCycleSellConfDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaidOuterCardCycleSellConfDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaidOuterCardCycleSellConfDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaidOuterCardCycleSellConfDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PaidOuterCardCycleSellConfDTO>() {
           @Override
           public void write(JsonWriter out, PaidOuterCardCycleSellConfDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaidOuterCardCycleSellConfDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaidOuterCardCycleSellConfDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaidOuterCardCycleSellConfDTO
  * @throws IOException if the JSON string is invalid with respect to PaidOuterCardCycleSellConfDTO
  */
  public static PaidOuterCardCycleSellConfDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaidOuterCardCycleSellConfDTO.class);
  }

 /**
  * Convert an instance of PaidOuterCardCycleSellConfDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

