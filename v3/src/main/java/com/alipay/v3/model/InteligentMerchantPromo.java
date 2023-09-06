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
import com.alipay.v3.model.InteligentGeneralMerchantPromo;
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
 * InteligentMerchantPromo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentMerchantPromo {
  public static final String SERIALIZED_NAME_GENERAL_PROMO = "general_promo";
  @SerializedName(SERIALIZED_NAME_GENERAL_PROMO)
  private InteligentGeneralMerchantPromo generalPromo;

  public static final String SERIALIZED_NAME_PROMO_TYPE = "promo_type";
  @SerializedName(SERIALIZED_NAME_PROMO_TYPE)
  private String promoType;

  public InteligentMerchantPromo() { 
  }

  public InteligentMerchantPromo generalPromo(InteligentGeneralMerchantPromo generalPromo) {
    
    this.generalPromo = generalPromo;
    return this;
  }

   /**
   * Get generalPromo
   * @return generalPromo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentGeneralMerchantPromo getGeneralPromo() {
    return generalPromo;
  }


  public void setGeneralPromo(InteligentGeneralMerchantPromo generalPromo) {
    this.generalPromo = generalPromo;
  }


  public InteligentMerchantPromo promoType(String promoType) {
    
    this.promoType = promoType;
    return this;
  }

   /**
   * 子活动营销类型；枚举值：（GENERAL_MERCHANT：商户自运营活动）
   * @return promoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GENERAL_MERCHANT", value = "子活动营销类型；枚举值：（GENERAL_MERCHANT：商户自运营活动）")

  public String getPromoType() {
    return promoType;
  }


  public void setPromoType(String promoType) {
    this.promoType = promoType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentMerchantPromo inteligentMerchantPromo = (InteligentMerchantPromo) o;
    return Objects.equals(this.generalPromo, inteligentMerchantPromo.generalPromo) &&
        Objects.equals(this.promoType, inteligentMerchantPromo.promoType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generalPromo, promoType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentMerchantPromo {\n");
    sb.append("    generalPromo: ").append(toIndentedString(generalPromo)).append("\n");
    sb.append("    promoType: ").append(toIndentedString(promoType)).append("\n");
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
    openapiFields.add("general_promo");
    openapiFields.add("promo_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentMerchantPromo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentMerchantPromo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentMerchantPromo is not found in the empty JSON string", InteligentMerchantPromo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentMerchantPromo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentMerchantPromo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `general_promo`
      if (jsonObj.getAsJsonObject("general_promo") != null) {
        InteligentGeneralMerchantPromo.validateJsonObject(jsonObj.getAsJsonObject("general_promo"));
      }
      if (jsonObj.get("promo_type") != null && !jsonObj.get("promo_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promo_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promo_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentMerchantPromo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentMerchantPromo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentMerchantPromo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentMerchantPromo.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentMerchantPromo>() {
           @Override
           public void write(JsonWriter out, InteligentMerchantPromo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentMerchantPromo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentMerchantPromo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentMerchantPromo
  * @throws IOException if the JSON string is invalid with respect to InteligentMerchantPromo
  */
  public static InteligentMerchantPromo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentMerchantPromo.class);
  }

 /**
  * Convert an instance of InteligentMerchantPromo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

