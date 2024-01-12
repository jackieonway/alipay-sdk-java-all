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
import com.alipay.v3.model.VoucherAvailableGeographyAllShopInfo;
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
 * VoucherAvailableGeographyShopInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherAvailableGeographyShopInfo {
  public static final String SERIALIZED_NAME_AVAILABLE_GEOGRAPHY_ALL_SHOP = "available_geography_all_shop";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_GEOGRAPHY_ALL_SHOP)
  private VoucherAvailableGeographyAllShopInfo availableGeographyAllShop;

  public static final String SERIALIZED_NAME_AVAILABLE_REAL_SHOP_IDS = "available_real_shop_ids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REAL_SHOP_IDS)
  private List<String> availableRealShopIds = null;

  public static final String SERIALIZED_NAME_AVAILABLE_SHOP_IDS = "available_shop_ids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_SHOP_IDS)
  private List<String> availableShopIds = null;

  public VoucherAvailableGeographyShopInfo() { 
  }

  public VoucherAvailableGeographyShopInfo availableGeographyAllShop(VoucherAvailableGeographyAllShopInfo availableGeographyAllShop) {
    
    this.availableGeographyAllShop = availableGeographyAllShop;
    return this;
  }

   /**
   * Get availableGeographyAllShop
   * @return availableGeographyAllShop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableGeographyAllShopInfo getAvailableGeographyAllShop() {
    return availableGeographyAllShop;
  }


  public void setAvailableGeographyAllShop(VoucherAvailableGeographyAllShopInfo availableGeographyAllShop) {
    this.availableGeographyAllShop = availableGeographyAllShop;
  }


  public VoucherAvailableGeographyShopInfo availableRealShopIds(List<String> availableRealShopIds) {
    
    this.availableRealShopIds = availableRealShopIds;
    return this;
  }

  public VoucherAvailableGeographyShopInfo addAvailableRealShopIdsItem(String availableRealShopIdsItem) {
    if (this.availableRealShopIds == null) {
      this.availableRealShopIds = new ArrayList<>();
    }
    this.availableRealShopIds.add(availableRealShopIdsItem);
    return this;
  }

   /**
   * 代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id 接口参数是列表类型。
   * @return availableRealShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id 接口参数是列表类型。")

  public List<String> getAvailableRealShopIds() {
    return availableRealShopIds;
  }


  public void setAvailableRealShopIds(List<String> availableRealShopIds) {
    this.availableRealShopIds = availableRealShopIds;
  }


  public VoucherAvailableGeographyShopInfo availableShopIds(List<String> availableShopIds) {
    
    this.availableShopIds = availableShopIds;
    return this;
  }

  public VoucherAvailableGeographyShopInfo addAvailableShopIdsItem(String availableShopIdsItem) {
    if (this.availableShopIds == null) {
      this.availableShopIds = new ArrayList<>();
    }
    this.availableShopIds.add(availableShopIdsItem);
    return this;
  }

   /**
   * 券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 接口参数是列表类型。
   * @return availableShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 接口参数是列表类型。")

  public List<String> getAvailableShopIds() {
    return availableShopIds;
  }


  public void setAvailableShopIds(List<String> availableShopIds) {
    this.availableShopIds = availableShopIds;
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
   * @return the VoucherAvailableGeographyShopInfo instance itself
   */
  public VoucherAvailableGeographyShopInfo putAdditionalProperty(String key, Object value) {
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
    VoucherAvailableGeographyShopInfo voucherAvailableGeographyShopInfo = (VoucherAvailableGeographyShopInfo) o;
    return Objects.equals(this.availableGeographyAllShop, voucherAvailableGeographyShopInfo.availableGeographyAllShop) &&
        Objects.equals(this.availableRealShopIds, voucherAvailableGeographyShopInfo.availableRealShopIds) &&
        Objects.equals(this.availableShopIds, voucherAvailableGeographyShopInfo.availableShopIds)&&
        Objects.equals(this.additionalProperties, voucherAvailableGeographyShopInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableGeographyAllShop, availableRealShopIds, availableShopIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherAvailableGeographyShopInfo {\n");
    sb.append("    availableGeographyAllShop: ").append(toIndentedString(availableGeographyAllShop)).append("\n");
    sb.append("    availableRealShopIds: ").append(toIndentedString(availableRealShopIds)).append("\n");
    sb.append("    availableShopIds: ").append(toIndentedString(availableShopIds)).append("\n");
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
    openapiFields.add("available_geography_all_shop");
    openapiFields.add("available_real_shop_ids");
    openapiFields.add("available_shop_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherAvailableGeographyShopInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherAvailableGeographyShopInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherAvailableGeographyShopInfo is not found in the empty JSON string", VoucherAvailableGeographyShopInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `available_geography_all_shop`
      if (jsonObj.getAsJsonObject("available_geography_all_shop") != null) {
        VoucherAvailableGeographyAllShopInfo.validateJsonObject(jsonObj.getAsJsonObject("available_geography_all_shop"));
      }
      // ensure the json data is an array
      if (jsonObj.get("available_real_shop_ids") != null && !jsonObj.get("available_real_shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_real_shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("available_real_shop_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("available_shop_ids") != null && !jsonObj.get("available_shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("available_shop_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherAvailableGeographyShopInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherAvailableGeographyShopInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherAvailableGeographyShopInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherAvailableGeographyShopInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherAvailableGeographyShopInfo>() {
           @Override
           public void write(JsonWriter out, VoucherAvailableGeographyShopInfo value) throws IOException {
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
           public VoucherAvailableGeographyShopInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherAvailableGeographyShopInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherAvailableGeographyShopInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherAvailableGeographyShopInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherAvailableGeographyShopInfo
  */
  public static VoucherAvailableGeographyShopInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherAvailableGeographyShopInfo.class);
  }

 /**
  * Convert an instance of VoucherAvailableGeographyShopInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

