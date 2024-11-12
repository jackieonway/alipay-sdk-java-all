/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-11-12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.ExpenseMerchantInfo;
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
 * AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel {
  public static final String SERIALIZED_NAME_EXPENSE_MERCHANT_INFO_LIST = "expense_merchant_info_list";
  @SerializedName(SERIALIZED_NAME_EXPENSE_MERCHANT_INFO_LIST)
  private List<ExpenseMerchantInfo> expenseMerchantInfoList = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_COUNT = "total_page_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_COUNT)
  private Integer totalPageCount;

  public AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel() { 
  }

  public AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel expenseMerchantInfoList(List<ExpenseMerchantInfo> expenseMerchantInfoList) {
    
    this.expenseMerchantInfoList = expenseMerchantInfoList;
    return this;
  }

  public AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel addExpenseMerchantInfoListItem(ExpenseMerchantInfo expenseMerchantInfoListItem) {
    if (this.expenseMerchantInfoList == null) {
      this.expenseMerchantInfoList = new ArrayList<>();
    }
    this.expenseMerchantInfoList.add(expenseMerchantInfoListItem);
    return this;
  }

   /**
   * 商户信息
   * @return expenseMerchantInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户信息")

  public List<ExpenseMerchantInfo> getExpenseMerchantInfoList() {
    return expenseMerchantInfoList;
  }


  public void setExpenseMerchantInfoList(List<ExpenseMerchantInfo> expenseMerchantInfoList) {
    this.expenseMerchantInfoList = expenseMerchantInfoList;
  }


  public AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当前页数
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页数")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 当前记录数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "当前记录数")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel totalPageCount(Integer totalPageCount) {
    
    this.totalPageCount = totalPageCount;
    return this;
  }

   /**
   * 总页数
   * @return totalPageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "总页数")

  public Integer getTotalPageCount() {
    return totalPageCount;
  }


  public void setTotalPageCount(Integer totalPageCount) {
    this.totalPageCount = totalPageCount;
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
   * @return the AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel instance itself
   */
  public AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel alipayEbppInvoiceExpensesceneMerchantQueryResponseModel = (AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel) o;
    return Objects.equals(this.expenseMerchantInfoList, alipayEbppInvoiceExpensesceneMerchantQueryResponseModel.expenseMerchantInfoList) &&
        Objects.equals(this.pageNum, alipayEbppInvoiceExpensesceneMerchantQueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayEbppInvoiceExpensesceneMerchantQueryResponseModel.pageSize) &&
        Objects.equals(this.totalPageCount, alipayEbppInvoiceExpensesceneMerchantQueryResponseModel.totalPageCount)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceExpensesceneMerchantQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseMerchantInfoList, pageNum, pageSize, totalPageCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel {\n");
    sb.append("    expenseMerchantInfoList: ").append(toIndentedString(expenseMerchantInfoList)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalPageCount: ").append(toIndentedString(totalPageCount)).append("\n");
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
    openapiFields.add("expense_merchant_info_list");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("total_page_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel is not found in the empty JSON string", AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayexpenseMerchantInfoList = jsonObj.getAsJsonArray("expense_merchant_info_list");
      if (jsonArrayexpenseMerchantInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("expense_merchant_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `expense_merchant_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("expense_merchant_info_list").toString()));
        }

        // validate the optional field `expense_merchant_info_list` (array)
        for (int i = 0; i < jsonArrayexpenseMerchantInfoList.size(); i++) {
          ExpenseMerchantInfo.validateJsonObject(jsonArrayexpenseMerchantInfoList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel value) throws IOException {
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
           public AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel
  */
  public static AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

