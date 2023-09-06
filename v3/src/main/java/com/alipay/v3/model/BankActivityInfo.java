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
 * BankActivityInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BankActivityInfo {
  public static final String SERIALIZED_NAME_BIND_CARD = "bind_card";
  @SerializedName(SERIALIZED_NAME_BIND_CARD)
  private Boolean bindCard;

  public static final String SERIALIZED_NAME_CARD_NAME = "card_name";
  @SerializedName(SERIALIZED_NAME_CARD_NAME)
  private String cardName;

  public static final String SERIALIZED_NAME_DISCOUNT_DESC = "discount_desc";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_DESC)
  private String discountDesc;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public BankActivityInfo() { 
  }

  public BankActivityInfo bindCard(Boolean bindCard) {
    
    this.bindCard = bindCard;
    return this;
  }

   /**
   * 是否绑定银行卡
   * @return bindCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否绑定银行卡")

  public Boolean getBindCard() {
    return bindCard;
  }


  public void setBindCard(Boolean bindCard) {
    this.bindCard = bindCard;
  }


  public BankActivityInfo cardName(String cardName) {
    
    this.cardName = cardName;
    return this;
  }

   /**
   * 银行卡名称
   * @return cardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "广发银行储蓄卡", value = "银行卡名称")

  public String getCardName() {
    return cardName;
  }


  public void setCardName(String cardName) {
    this.cardName = cardName;
  }


  public BankActivityInfo discountDesc(String discountDesc) {
    
    this.discountDesc = discountDesc;
    return this;
  }

   /**
   * 优惠描述
   * @return discountDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "满50元减10元", value = "优惠描述")

  public String getDiscountDesc() {
    return discountDesc;
  }


  public void setDiscountDesc(String discountDesc) {
    this.discountDesc = discountDesc;
  }


  public BankActivityInfo logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * 活动logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http:xxxx", value = "活动logo")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankActivityInfo bankActivityInfo = (BankActivityInfo) o;
    return Objects.equals(this.bindCard, bankActivityInfo.bindCard) &&
        Objects.equals(this.cardName, bankActivityInfo.cardName) &&
        Objects.equals(this.discountDesc, bankActivityInfo.discountDesc) &&
        Objects.equals(this.logo, bankActivityInfo.logo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindCard, cardName, discountDesc, logo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankActivityInfo {\n");
    sb.append("    bindCard: ").append(toIndentedString(bindCard)).append("\n");
    sb.append("    cardName: ").append(toIndentedString(cardName)).append("\n");
    sb.append("    discountDesc: ").append(toIndentedString(discountDesc)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
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
    openapiFields.add("bind_card");
    openapiFields.add("card_name");
    openapiFields.add("discount_desc");
    openapiFields.add("logo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BankActivityInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BankActivityInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BankActivityInfo is not found in the empty JSON string", BankActivityInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BankActivityInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BankActivityInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("card_name") != null && !jsonObj.get("card_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_name").toString()));
      }
      if (jsonObj.get("discount_desc") != null && !jsonObj.get("discount_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_desc").toString()));
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BankActivityInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BankActivityInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BankActivityInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BankActivityInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BankActivityInfo>() {
           @Override
           public void write(JsonWriter out, BankActivityInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BankActivityInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BankActivityInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BankActivityInfo
  * @throws IOException if the JSON string is invalid with respect to BankActivityInfo
  */
  public static BankActivityInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BankActivityInfo.class);
  }

 /**
  * Convert an instance of BankActivityInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

