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
import com.alipay.v3.model.ItemSkuPropertyInfo;
import com.alipay.v3.model.MaterialInfo;
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
 * CmItemSkuInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CmItemSkuInfo {
  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_INVENTORY = "inventory";
  @SerializedName(SERIALIZED_NAME_INVENTORY)
  private Integer inventory;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_MATERIAL_LIST = "material_list";
  @SerializedName(SERIALIZED_NAME_MATERIAL_LIST)
  private List<MaterialInfo> materialList = null;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private Integer originalPrice;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_REMAIN_INVENTORY = "remain_inventory";
  @SerializedName(SERIALIZED_NAME_REMAIN_INVENTORY)
  private Integer remainInventory;

  public static final String SERIALIZED_NAME_SKU_ID = "sku_id";
  @SerializedName(SERIALIZED_NAME_SKU_ID)
  private String skuId;

  public static final String SERIALIZED_NAME_SKU_PROPERTY_LIST = "sku_property_list";
  @SerializedName(SERIALIZED_NAME_SKU_PROPERTY_LIST)
  private List<ItemSkuPropertyInfo> skuPropertyList = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public CmItemSkuInfo() { 
  }

  public CmItemSkuInfo gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public CmItemSkuInfo gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public CmItemSkuInfo inventory(Integer inventory) {
    
    this.inventory = inventory;
    return this;
  }

   /**
   * 库存
   * @return inventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "库存")

  public Integer getInventory() {
    return inventory;
  }


  public void setInventory(Integer inventory) {
    this.inventory = inventory;
  }


  public CmItemSkuInfo itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 商品ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品ID")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CmItemSkuInfo materialList(List<MaterialInfo> materialList) {
    
    this.materialList = materialList;
    return this;
  }

  public CmItemSkuInfo addMaterialListItem(MaterialInfo materialListItem) {
    if (this.materialList == null) {
      this.materialList = new ArrayList<>();
    }
    this.materialList.add(materialListItem);
    return this;
  }

   /**
   * 素材列表
   * @return materialList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "素材列表")

  public List<MaterialInfo> getMaterialList() {
    return materialList;
  }


  public void setMaterialList(List<MaterialInfo> materialList) {
    this.materialList = materialList;
  }


  public CmItemSkuInfo originalPrice(Integer originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * 标价，单位分
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标价，单位分")

  public Integer getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(Integer originalPrice) {
    this.originalPrice = originalPrice;
  }


  public CmItemSkuInfo price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * 售价，单位分
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "售价，单位分")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public CmItemSkuInfo remainInventory(Integer remainInventory) {
    
    this.remainInventory = remainInventory;
    return this;
  }

   /**
   * 剩余库存
   * @return remainInventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "剩余库存")

  public Integer getRemainInventory() {
    return remainInventory;
  }


  public void setRemainInventory(Integer remainInventory) {
    this.remainInventory = remainInventory;
  }


  public CmItemSkuInfo skuId(String skuId) {
    
    this.skuId = skuId;
    return this;
  }

   /**
   * 商品SKU ID
   * @return skuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品SKU ID")

  public String getSkuId() {
    return skuId;
  }


  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public CmItemSkuInfo skuPropertyList(List<ItemSkuPropertyInfo> skuPropertyList) {
    
    this.skuPropertyList = skuPropertyList;
    return this;
  }

  public CmItemSkuInfo addSkuPropertyListItem(ItemSkuPropertyInfo skuPropertyListItem) {
    if (this.skuPropertyList == null) {
      this.skuPropertyList = new ArrayList<>();
    }
    this.skuPropertyList.add(skuPropertyListItem);
    return this;
  }

   /**
   * SKU属性列表
   * @return skuPropertyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SKU属性列表")

  public List<ItemSkuPropertyInfo> getSkuPropertyList() {
    return skuPropertyList;
  }


  public void setSkuPropertyList(List<ItemSkuPropertyInfo> skuPropertyList) {
    this.skuPropertyList = skuPropertyList;
  }


  public CmItemSkuInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 商品SKU状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品SKU状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the CmItemSkuInfo instance itself
   */
  public CmItemSkuInfo putAdditionalProperty(String key, Object value) {
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
    CmItemSkuInfo cmItemSkuInfo = (CmItemSkuInfo) o;
    return Objects.equals(this.gmtCreate, cmItemSkuInfo.gmtCreate) &&
        Objects.equals(this.gmtModified, cmItemSkuInfo.gmtModified) &&
        Objects.equals(this.inventory, cmItemSkuInfo.inventory) &&
        Objects.equals(this.itemId, cmItemSkuInfo.itemId) &&
        Objects.equals(this.materialList, cmItemSkuInfo.materialList) &&
        Objects.equals(this.originalPrice, cmItemSkuInfo.originalPrice) &&
        Objects.equals(this.price, cmItemSkuInfo.price) &&
        Objects.equals(this.remainInventory, cmItemSkuInfo.remainInventory) &&
        Objects.equals(this.skuId, cmItemSkuInfo.skuId) &&
        Objects.equals(this.skuPropertyList, cmItemSkuInfo.skuPropertyList) &&
        Objects.equals(this.status, cmItemSkuInfo.status)&&
        Objects.equals(this.additionalProperties, cmItemSkuInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmtCreate, gmtModified, inventory, itemId, materialList, originalPrice, price, remainInventory, skuId, skuPropertyList, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CmItemSkuInfo {\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    materialList: ").append(toIndentedString(materialList)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    remainInventory: ").append(toIndentedString(remainInventory)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    skuPropertyList: ").append(toIndentedString(skuPropertyList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("inventory");
    openapiFields.add("item_id");
    openapiFields.add("material_list");
    openapiFields.add("original_price");
    openapiFields.add("price");
    openapiFields.add("remain_inventory");
    openapiFields.add("sku_id");
    openapiFields.add("sku_property_list");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CmItemSkuInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CmItemSkuInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CmItemSkuInfo is not found in the empty JSON string", CmItemSkuInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      JsonArray jsonArraymaterialList = jsonObj.getAsJsonArray("material_list");
      if (jsonArraymaterialList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("material_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `material_list` to be an array in the JSON string but got `%s`", jsonObj.get("material_list").toString()));
        }

        // validate the optional field `material_list` (array)
        for (int i = 0; i < jsonArraymaterialList.size(); i++) {
          MaterialInfo.validateJsonObject(jsonArraymaterialList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("sku_id") != null && !jsonObj.get("sku_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku_id").toString()));
      }
      JsonArray jsonArrayskuPropertyList = jsonObj.getAsJsonArray("sku_property_list");
      if (jsonArrayskuPropertyList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sku_property_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sku_property_list` to be an array in the JSON string but got `%s`", jsonObj.get("sku_property_list").toString()));
        }

        // validate the optional field `sku_property_list` (array)
        for (int i = 0; i < jsonArrayskuPropertyList.size(); i++) {
          ItemSkuPropertyInfo.validateJsonObject(jsonArrayskuPropertyList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CmItemSkuInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CmItemSkuInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CmItemSkuInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CmItemSkuInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CmItemSkuInfo>() {
           @Override
           public void write(JsonWriter out, CmItemSkuInfo value) throws IOException {
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
           public CmItemSkuInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CmItemSkuInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CmItemSkuInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CmItemSkuInfo
  * @throws IOException if the JSON string is invalid with respect to CmItemSkuInfo
  */
  public static CmItemSkuInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CmItemSkuInfo.class);
  }

 /**
  * Convert an instance of CmItemSkuInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

