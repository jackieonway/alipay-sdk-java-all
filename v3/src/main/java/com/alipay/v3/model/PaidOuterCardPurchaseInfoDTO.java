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
 * PaidOuterCardPurchaseInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaidOuterCardPurchaseInfoDTO {
  public static final String SERIALIZED_NAME_ACTION_DATE = "action_date";
  @SerializedName(SERIALIZED_NAME_ACTION_DATE)
  private String actionDate;

  public static final String SERIALIZED_NAME_ALIPAY_TRADE_NO = "alipay_trade_no";
  @SerializedName(SERIALIZED_NAME_ALIPAY_TRADE_NO)
  private String alipayTradeNo;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public PaidOuterCardPurchaseInfoDTO() { 
  }

  public PaidOuterCardPurchaseInfoDTO actionDate(String actionDate) {
    
    this.actionDate = actionDate;
    return this;
  }

   /**
   * 用户购买、升级、降级、续费的操作时间。格式为：yyyy-MM-dd hh:mm:ss
   * @return actionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户购买、升级、降级、续费的操作时间。格式为：yyyy-MM-dd hh:mm:ss")

  public String getActionDate() {
    return actionDate;
  }


  public void setActionDate(String actionDate) {
    this.actionDate = actionDate;
  }


  public PaidOuterCardPurchaseInfoDTO alipayTradeNo(String alipayTradeNo) {
    
    this.alipayTradeNo = alipayTradeNo;
    return this;
  }

   /**
   * 支付宝交易号，由api: alipay.trade.create 返回
   * @return alipayTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝交易号，由api: alipay.trade.create 返回")

  public String getAlipayTradeNo() {
    return alipayTradeNo;
  }


  public void setAlipayTradeNo(String alipayTradeNo) {
    this.alipayTradeNo = alipayTradeNo;
  }


  public PaidOuterCardPurchaseInfoDTO outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 商户订单号。与创建订单api：alipay.trade.create保持一致
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户订单号。与创建订单api：alipay.trade.create保持一致")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public PaidOuterCardPurchaseInfoDTO price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 用户购买金额。当购买/升级/续费场景必填，单位元，精确到小数点后2位
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户购买金额。当购买/升级/续费场景必填，单位元，精确到小数点后2位")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public PaidOuterCardPurchaseInfoDTO source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 用户操作来源
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户操作来源")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
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
   * @return the PaidOuterCardPurchaseInfoDTO instance itself
   */
  public PaidOuterCardPurchaseInfoDTO putAdditionalProperty(String key, Object value) {
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
    PaidOuterCardPurchaseInfoDTO paidOuterCardPurchaseInfoDTO = (PaidOuterCardPurchaseInfoDTO) o;
    return Objects.equals(this.actionDate, paidOuterCardPurchaseInfoDTO.actionDate) &&
        Objects.equals(this.alipayTradeNo, paidOuterCardPurchaseInfoDTO.alipayTradeNo) &&
        Objects.equals(this.outTradeNo, paidOuterCardPurchaseInfoDTO.outTradeNo) &&
        Objects.equals(this.price, paidOuterCardPurchaseInfoDTO.price) &&
        Objects.equals(this.source, paidOuterCardPurchaseInfoDTO.source)&&
        Objects.equals(this.additionalProperties, paidOuterCardPurchaseInfoDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDate, alipayTradeNo, outTradeNo, price, source, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaidOuterCardPurchaseInfoDTO {\n");
    sb.append("    actionDate: ").append(toIndentedString(actionDate)).append("\n");
    sb.append("    alipayTradeNo: ").append(toIndentedString(alipayTradeNo)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("action_date");
    openapiFields.add("alipay_trade_no");
    openapiFields.add("out_trade_no");
    openapiFields.add("price");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaidOuterCardPurchaseInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaidOuterCardPurchaseInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaidOuterCardPurchaseInfoDTO is not found in the empty JSON string", PaidOuterCardPurchaseInfoDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("action_date") != null && !jsonObj.get("action_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_date").toString()));
      }
      if (jsonObj.get("alipay_trade_no") != null && !jsonObj.get("alipay_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_trade_no").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaidOuterCardPurchaseInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaidOuterCardPurchaseInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaidOuterCardPurchaseInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaidOuterCardPurchaseInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PaidOuterCardPurchaseInfoDTO>() {
           @Override
           public void write(JsonWriter out, PaidOuterCardPurchaseInfoDTO value) throws IOException {
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
           public PaidOuterCardPurchaseInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaidOuterCardPurchaseInfoDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaidOuterCardPurchaseInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaidOuterCardPurchaseInfoDTO
  * @throws IOException if the JSON string is invalid with respect to PaidOuterCardPurchaseInfoDTO
  */
  public static PaidOuterCardPurchaseInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaidOuterCardPurchaseInfoDTO.class);
  }

 /**
  * Convert an instance of PaidOuterCardPurchaseInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

