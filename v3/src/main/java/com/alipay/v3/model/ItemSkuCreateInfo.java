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
import com.alipay.v3.model.ItemExtInfo;
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
 * ItemSkuCreateInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemSkuCreateInfo {
  public static final String SERIALIZED_NAME_COST_PRICE = "cost_price";
  @SerializedName(SERIALIZED_NAME_COST_PRICE)
  private Integer costPrice;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<ItemExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_EXTERNAL_SKU_ID = "external_sku_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SKU_ID)
  private String externalSkuId;

  public static final String SERIALIZED_NAME_INVENTORY = "inventory";
  @SerializedName(SERIALIZED_NAME_INVENTORY)
  private Integer inventory;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private Integer originalPrice;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public ItemSkuCreateInfo() { 
  }

  public ItemSkuCreateInfo costPrice(Integer costPrice) {
    
    this.costPrice = costPrice;
    return this;
  }

   /**
   * 成本价，单位分
   * @return costPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "成本价，单位分")

  public Integer getCostPrice() {
    return costPrice;
  }


  public void setCostPrice(Integer costPrice) {
    this.costPrice = costPrice;
  }


  public ItemSkuCreateInfo extInfo(List<ItemExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public ItemSkuCreateInfo addExtInfoItem(ItemExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * SKU扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SKU扩展信息")

  public List<ItemExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<ItemExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public ItemSkuCreateInfo externalSkuId(String externalSkuId) {
    
    this.externalSkuId = externalSkuId;
    return this;
  }

   /**
   * 外部SKU ID
   * @return externalSkuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201909161232534324124123", value = "外部SKU ID")

  public String getExternalSkuId() {
    return externalSkuId;
  }


  public void setExternalSkuId(String externalSkuId) {
    this.externalSkuId = externalSkuId;
  }


  public ItemSkuCreateInfo inventory(Integer inventory) {
    
    this.inventory = inventory;
    return this;
  }

   /**
   * 库存
   * @return inventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "库存")

  public Integer getInventory() {
    return inventory;
  }


  public void setInventory(Integer inventory) {
    this.inventory = inventory;
  }


  public ItemSkuCreateInfo originalPrice(Integer originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * 标价，单位分
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "标价，单位分")

  public Integer getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(Integer originalPrice) {
    this.originalPrice = originalPrice;
  }


  public ItemSkuCreateInfo price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * 售价，单位分
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "售价，单位分")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemSkuCreateInfo itemSkuCreateInfo = (ItemSkuCreateInfo) o;
    return Objects.equals(this.costPrice, itemSkuCreateInfo.costPrice) &&
        Objects.equals(this.extInfo, itemSkuCreateInfo.extInfo) &&
        Objects.equals(this.externalSkuId, itemSkuCreateInfo.externalSkuId) &&
        Objects.equals(this.inventory, itemSkuCreateInfo.inventory) &&
        Objects.equals(this.originalPrice, itemSkuCreateInfo.originalPrice) &&
        Objects.equals(this.price, itemSkuCreateInfo.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costPrice, extInfo, externalSkuId, inventory, originalPrice, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSkuCreateInfo {\n");
    sb.append("    costPrice: ").append(toIndentedString(costPrice)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    externalSkuId: ").append(toIndentedString(externalSkuId)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
    openapiFields.add("cost_price");
    openapiFields.add("ext_info");
    openapiFields.add("external_sku_id");
    openapiFields.add("inventory");
    openapiFields.add("original_price");
    openapiFields.add("price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemSkuCreateInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemSkuCreateInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemSkuCreateInfo is not found in the empty JSON string", ItemSkuCreateInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemSkuCreateInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemSkuCreateInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          ItemExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("external_sku_id") != null && !jsonObj.get("external_sku_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_sku_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_sku_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemSkuCreateInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemSkuCreateInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemSkuCreateInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemSkuCreateInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemSkuCreateInfo>() {
           @Override
           public void write(JsonWriter out, ItemSkuCreateInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemSkuCreateInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemSkuCreateInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemSkuCreateInfo
  * @throws IOException if the JSON string is invalid with respect to ItemSkuCreateInfo
  */
  public static ItemSkuCreateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemSkuCreateInfo.class);
  }

 /**
  * Convert an instance of ItemSkuCreateInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

