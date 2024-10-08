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
import com.alipay.v3.model.ShopSummaryQueryResponse;
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
 * AlipayOfflineMarketShopSummaryBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOfflineMarketShopSummaryBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_CURRENT_PAGE_NO = "current_page_no";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_NO)
  private String currentPageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_SHOP_SUMMARY_INFOS = "shop_summary_infos";
  @SerializedName(SERIALIZED_NAME_SHOP_SUMMARY_INFOS)
  private List<ShopSummaryQueryResponse> shopSummaryInfos = null;

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "total_items";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private String totalItems;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_NO = "total_page_no";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_NO)
  private String totalPageNo;

  public AlipayOfflineMarketShopSummaryBatchqueryResponseModel() { 
  }

  public AlipayOfflineMarketShopSummaryBatchqueryResponseModel currentPageNo(String currentPageNo) {
    
    this.currentPageNo = currentPageNo;
    return this;
  }

   /**
   * 当前页码
   * @return currentPageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页码")

  public String getCurrentPageNo() {
    return currentPageNo;
  }


  public void setCurrentPageNo(String currentPageNo) {
    this.currentPageNo = currentPageNo;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页记录数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "每页记录数")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryResponseModel shopSummaryInfos(List<ShopSummaryQueryResponse> shopSummaryInfos) {
    
    this.shopSummaryInfos = shopSummaryInfos;
    return this;
  }

  public AlipayOfflineMarketShopSummaryBatchqueryResponseModel addShopSummaryInfosItem(ShopSummaryQueryResponse shopSummaryInfosItem) {
    if (this.shopSummaryInfos == null) {
      this.shopSummaryInfos = new ArrayList<>();
    }
    this.shopSummaryInfos.add(shopSummaryInfosItem);
    return this;
  }

   /**
   * 支付宝门店摘要信息列表
   * @return shopSummaryInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝门店摘要信息列表")

  public List<ShopSummaryQueryResponse> getShopSummaryInfos() {
    return shopSummaryInfos;
  }


  public void setShopSummaryInfos(List<ShopSummaryQueryResponse> shopSummaryInfos) {
    this.shopSummaryInfos = shopSummaryInfos;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryResponseModel totalItems(String totalItems) {
    
    this.totalItems = totalItems;
    return this;
  }

   /**
   * 总记录数
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "总记录数")

  public String getTotalItems() {
    return totalItems;
  }


  public void setTotalItems(String totalItems) {
    this.totalItems = totalItems;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryResponseModel totalPageNo(String totalPageNo) {
    
    this.totalPageNo = totalPageNo;
    return this;
  }

   /**
   * 总页码数目
   * @return totalPageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "总页码数目")

  public String getTotalPageNo() {
    return totalPageNo;
  }


  public void setTotalPageNo(String totalPageNo) {
    this.totalPageNo = totalPageNo;
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
   * @return the AlipayOfflineMarketShopSummaryBatchqueryResponseModel instance itself
   */
  public AlipayOfflineMarketShopSummaryBatchqueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOfflineMarketShopSummaryBatchqueryResponseModel alipayOfflineMarketShopSummaryBatchqueryResponseModel = (AlipayOfflineMarketShopSummaryBatchqueryResponseModel) o;
    return Objects.equals(this.currentPageNo, alipayOfflineMarketShopSummaryBatchqueryResponseModel.currentPageNo) &&
        Objects.equals(this.pageSize, alipayOfflineMarketShopSummaryBatchqueryResponseModel.pageSize) &&
        Objects.equals(this.shopSummaryInfos, alipayOfflineMarketShopSummaryBatchqueryResponseModel.shopSummaryInfos) &&
        Objects.equals(this.totalItems, alipayOfflineMarketShopSummaryBatchqueryResponseModel.totalItems) &&
        Objects.equals(this.totalPageNo, alipayOfflineMarketShopSummaryBatchqueryResponseModel.totalPageNo)&&
        Objects.equals(this.additionalProperties, alipayOfflineMarketShopSummaryBatchqueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPageNo, pageSize, shopSummaryInfos, totalItems, totalPageNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOfflineMarketShopSummaryBatchqueryResponseModel {\n");
    sb.append("    currentPageNo: ").append(toIndentedString(currentPageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    shopSummaryInfos: ").append(toIndentedString(shopSummaryInfos)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalPageNo: ").append(toIndentedString(totalPageNo)).append("\n");
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
    openapiFields.add("current_page_no");
    openapiFields.add("page_size");
    openapiFields.add("shop_summary_infos");
    openapiFields.add("total_items");
    openapiFields.add("total_page_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOfflineMarketShopSummaryBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOfflineMarketShopSummaryBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOfflineMarketShopSummaryBatchqueryResponseModel is not found in the empty JSON string", AlipayOfflineMarketShopSummaryBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("current_page_no") != null && !jsonObj.get("current_page_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_page_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_page_no").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      JsonArray jsonArrayshopSummaryInfos = jsonObj.getAsJsonArray("shop_summary_infos");
      if (jsonArrayshopSummaryInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("shop_summary_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `shop_summary_infos` to be an array in the JSON string but got `%s`", jsonObj.get("shop_summary_infos").toString()));
        }

        // validate the optional field `shop_summary_infos` (array)
        for (int i = 0; i < jsonArrayshopSummaryInfos.size(); i++) {
          ShopSummaryQueryResponse.validateJsonObject(jsonArrayshopSummaryInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("total_items") != null && !jsonObj.get("total_items").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_items` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_items").toString()));
      }
      if (jsonObj.get("total_page_no") != null && !jsonObj.get("total_page_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_page_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_page_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOfflineMarketShopSummaryBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOfflineMarketShopSummaryBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOfflineMarketShopSummaryBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOfflineMarketShopSummaryBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOfflineMarketShopSummaryBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOfflineMarketShopSummaryBatchqueryResponseModel value) throws IOException {
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
           public AlipayOfflineMarketShopSummaryBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOfflineMarketShopSummaryBatchqueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOfflineMarketShopSummaryBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOfflineMarketShopSummaryBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOfflineMarketShopSummaryBatchqueryResponseModel
  */
  public static AlipayOfflineMarketShopSummaryBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOfflineMarketShopSummaryBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOfflineMarketShopSummaryBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

