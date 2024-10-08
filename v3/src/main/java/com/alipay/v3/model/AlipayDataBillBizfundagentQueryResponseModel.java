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
import com.alipay.v3.model.BizFundReportResult;
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
 * AlipayDataBillBizfundagentQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayDataBillBizfundagentQueryResponseModel {
  public static final String SERIALIZED_NAME_DETAIL_LIST = "detail_list";
  @SerializedName(SERIALIZED_NAME_DETAIL_LIST)
  private List<BizFundReportResult> detailList = null;

  public static final String SERIALIZED_NAME_PAGE_NO = "page_no";
  @SerializedName(SERIALIZED_NAME_PAGE_NO)
  private String pageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private String totalSize;

  public AlipayDataBillBizfundagentQueryResponseModel() { 
  }

  public AlipayDataBillBizfundagentQueryResponseModel detailList(List<BizFundReportResult> detailList) {
    
    this.detailList = detailList;
    return this;
  }

  public AlipayDataBillBizfundagentQueryResponseModel addDetailListItem(BizFundReportResult detailListItem) {
    if (this.detailList == null) {
      this.detailList = new ArrayList<>();
    }
    this.detailList.add(detailListItem);
    return this;
  }

   /**
   * 资金明细记录
   * @return detailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "资金明细记录")

  public List<BizFundReportResult> getDetailList() {
    return detailList;
  }


  public void setDetailList(List<BizFundReportResult> detailList) {
    this.detailList = detailList;
  }


  public AlipayDataBillBizfundagentQueryResponseModel pageNo(String pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * 分页号，从1开始
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "分页号，从1开始")

  public String getPageNo() {
    return pageNo;
  }


  public void setPageNo(String pageNo) {
    this.pageNo = pageNo;
  }


  public AlipayDataBillBizfundagentQueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页面大小，最大2000
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "页面大小，最大2000")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayDataBillBizfundagentQueryResponseModel totalSize(String totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 数据分页总页数
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "数据分页总页数")

  public String getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(String totalSize) {
    this.totalSize = totalSize;
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
   * @return the AlipayDataBillBizfundagentQueryResponseModel instance itself
   */
  public AlipayDataBillBizfundagentQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayDataBillBizfundagentQueryResponseModel alipayDataBillBizfundagentQueryResponseModel = (AlipayDataBillBizfundagentQueryResponseModel) o;
    return Objects.equals(this.detailList, alipayDataBillBizfundagentQueryResponseModel.detailList) &&
        Objects.equals(this.pageNo, alipayDataBillBizfundagentQueryResponseModel.pageNo) &&
        Objects.equals(this.pageSize, alipayDataBillBizfundagentQueryResponseModel.pageSize) &&
        Objects.equals(this.totalSize, alipayDataBillBizfundagentQueryResponseModel.totalSize)&&
        Objects.equals(this.additionalProperties, alipayDataBillBizfundagentQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailList, pageNo, pageSize, totalSize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayDataBillBizfundagentQueryResponseModel {\n");
    sb.append("    detailList: ").append(toIndentedString(detailList)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
    openapiFields.add("detail_list");
    openapiFields.add("page_no");
    openapiFields.add("page_size");
    openapiFields.add("total_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayDataBillBizfundagentQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayDataBillBizfundagentQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayDataBillBizfundagentQueryResponseModel is not found in the empty JSON string", AlipayDataBillBizfundagentQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArraydetailList = jsonObj.getAsJsonArray("detail_list");
      if (jsonArraydetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("detail_list").toString()));
        }

        // validate the optional field `detail_list` (array)
        for (int i = 0; i < jsonArraydetailList.size(); i++) {
          BizFundReportResult.validateJsonObject(jsonArraydetailList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("page_no") != null && !jsonObj.get("page_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_no").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("total_size") != null && !jsonObj.get("total_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayDataBillBizfundagentQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayDataBillBizfundagentQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayDataBillBizfundagentQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayDataBillBizfundagentQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayDataBillBizfundagentQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayDataBillBizfundagentQueryResponseModel value) throws IOException {
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
           public AlipayDataBillBizfundagentQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayDataBillBizfundagentQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayDataBillBizfundagentQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayDataBillBizfundagentQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayDataBillBizfundagentQueryResponseModel
  */
  public static AlipayDataBillBizfundagentQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayDataBillBizfundagentQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayDataBillBizfundagentQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

