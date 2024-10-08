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
import com.alipay.v3.model.ZMGoOutDiscountInfo;
import com.alipay.v3.model.ZMGoTradeInfo;
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
 * AmountTypeData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AmountTypeData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OUT_DISCOUNT_INFOS = "out_discount_infos";
  @SerializedName(SERIALIZED_NAME_OUT_DISCOUNT_INFOS)
  private List<ZMGoOutDiscountInfo> outDiscountInfos = null;

  public static final String SERIALIZED_NAME_TRADE_INFO = "trade_info";
  @SerializedName(SERIALIZED_NAME_TRADE_INFO)
  private ZMGoTradeInfo tradeInfo;

  public AmountTypeData() { 
  }

  public AmountTypeData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 累计类型为金额类型的累计名称。为必传入参。
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "优惠累计名称001", value = "累计类型为金额类型的累计名称。为必传入参。")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AmountTypeData outDiscountInfos(List<ZMGoOutDiscountInfo> outDiscountInfos) {
    
    this.outDiscountInfos = outDiscountInfos;
    return this;
  }

  public AmountTypeData addOutDiscountInfosItem(ZMGoOutDiscountInfo outDiscountInfosItem) {
    if (this.outDiscountInfos == null) {
      this.outDiscountInfos = new ArrayList<>();
    }
    this.outDiscountInfos.add(outDiscountInfosItem);
    return this;
  }

   /**
   * 优惠信息。为List类型，支持传入多笔优惠，大部分场景传入一笔。包含：优惠名称，优惠类型，优惠金额（单位元）。 字段必传场景： 1.当累计模式为【交易绑定模式】时，为必传入参。 2.当累计模式为【交易解耦模式】，同时需要累计优惠信息时，为必传入参。
   * @return outDiscountInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "优惠信息。为List类型，支持传入多笔优惠，大部分场景传入一笔。包含：优惠名称，优惠类型，优惠金额（单位元）。 字段必传场景： 1.当累计模式为【交易绑定模式】时，为必传入参。 2.当累计模式为【交易解耦模式】，同时需要累计优惠信息时，为必传入参。")

  public List<ZMGoOutDiscountInfo> getOutDiscountInfos() {
    return outDiscountInfos;
  }


  public void setOutDiscountInfos(List<ZMGoOutDiscountInfo> outDiscountInfos) {
    this.outDiscountInfos = outDiscountInfos;
  }


  public AmountTypeData tradeInfo(ZMGoTradeInfo tradeInfo) {
    
    this.tradeInfo = tradeInfo;
    return this;
  }

   /**
   * Get tradeInfo
   * @return tradeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZMGoTradeInfo getTradeInfo() {
    return tradeInfo;
  }


  public void setTradeInfo(ZMGoTradeInfo tradeInfo) {
    this.tradeInfo = tradeInfo;
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
   * @return the AmountTypeData instance itself
   */
  public AmountTypeData putAdditionalProperty(String key, Object value) {
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
    AmountTypeData amountTypeData = (AmountTypeData) o;
    return Objects.equals(this.name, amountTypeData.name) &&
        Objects.equals(this.outDiscountInfos, amountTypeData.outDiscountInfos) &&
        Objects.equals(this.tradeInfo, amountTypeData.tradeInfo)&&
        Objects.equals(this.additionalProperties, amountTypeData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, outDiscountInfos, tradeInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountTypeData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outDiscountInfos: ").append(toIndentedString(outDiscountInfos)).append("\n");
    sb.append("    tradeInfo: ").append(toIndentedString(tradeInfo)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("out_discount_infos");
    openapiFields.add("trade_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AmountTypeData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AmountTypeData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AmountTypeData is not found in the empty JSON string", AmountTypeData.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      JsonArray jsonArrayoutDiscountInfos = jsonObj.getAsJsonArray("out_discount_infos");
      if (jsonArrayoutDiscountInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("out_discount_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `out_discount_infos` to be an array in the JSON string but got `%s`", jsonObj.get("out_discount_infos").toString()));
        }

        // validate the optional field `out_discount_infos` (array)
        for (int i = 0; i < jsonArrayoutDiscountInfos.size(); i++) {
          ZMGoOutDiscountInfo.validateJsonObject(jsonArrayoutDiscountInfos.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `trade_info`
      if (jsonObj.getAsJsonObject("trade_info") != null) {
        ZMGoTradeInfo.validateJsonObject(jsonObj.getAsJsonObject("trade_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmountTypeData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmountTypeData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmountTypeData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmountTypeData.class));

       return (TypeAdapter<T>) new TypeAdapter<AmountTypeData>() {
           @Override
           public void write(JsonWriter out, AmountTypeData value) throws IOException {
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
           public AmountTypeData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AmountTypeData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AmountTypeData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AmountTypeData
  * @throws IOException if the JSON string is invalid with respect to AmountTypeData
  */
  public static AmountTypeData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmountTypeData.class);
  }

 /**
  * Convert an instance of AmountTypeData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

