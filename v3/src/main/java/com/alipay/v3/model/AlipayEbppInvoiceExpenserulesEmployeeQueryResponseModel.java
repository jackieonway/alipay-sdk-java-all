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
 * AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel {
  public static final String SERIALIZED_NAME_EMPLOYEE_LIST = "employee_list";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_LIST)
  private List<String> employeeList = null;

  public static final String SERIALIZED_NAME_EMPLOYEE_OPEN_ID_LIST = "employee_open_id_list";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_OPEN_ID_LIST)
  private List<String> employeeOpenIdList = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_COUNT = "total_page_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_COUNT)
  private Integer totalPageCount;

  public AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel() { 
  }

  public AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel employeeList(List<String> employeeList) {
    
    this.employeeList = employeeList;
    return this;
  }

  public AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel addEmployeeListItem(String employeeListItem) {
    if (this.employeeList == null) {
      this.employeeList = new ArrayList<>();
    }
    this.employeeList.add(employeeListItem);
    return this;
  }

   /**
   * 切换open_id前请使用此字段：员工列表
   * @return employeeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088402331504664\",\"2088402331504664\",\"2088402331504664\"]", value = "切换open_id前请使用此字段：员工列表")

  public List<String> getEmployeeList() {
    return employeeList;
  }


  public void setEmployeeList(List<String> employeeList) {
    this.employeeList = employeeList;
  }


  public AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel employeeOpenIdList(List<String> employeeOpenIdList) {
    
    this.employeeOpenIdList = employeeOpenIdList;
    return this;
  }

  public AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel addEmployeeOpenIdListItem(String employeeOpenIdListItem) {
    if (this.employeeOpenIdList == null) {
      this.employeeOpenIdList = new ArrayList<>();
    }
    this.employeeOpenIdList.add(employeeOpenIdListItem);
    return this;
  }

   /**
   * 切换open_id后请使用此字段：员工open_id列表
   * @return employeeOpenIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcdxxxx\"]", value = "切换open_id后请使用此字段：员工open_id列表")

  public List<String> getEmployeeOpenIdList() {
    return employeeOpenIdList;
  }


  public void setEmployeeOpenIdList(List<String> employeeOpenIdList) {
    this.employeeOpenIdList = employeeOpenIdList;
  }


  public AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel pageNum(Integer pageNum) {
    
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


  public AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel pageSize(Integer pageSize) {
    
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


  public AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel totalPageCount(Integer totalPageCount) {
    
    this.totalPageCount = totalPageCount;
    return this;
  }

   /**
   * 总页数
   * @return totalPageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "总页数")

  public Integer getTotalPageCount() {
    return totalPageCount;
  }


  public void setTotalPageCount(Integer totalPageCount) {
    this.totalPageCount = totalPageCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel alipayEbppInvoiceExpenserulesEmployeeQueryResponseModel = (AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel) o;
    return Objects.equals(this.employeeList, alipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.employeeList) &&
        Objects.equals(this.employeeOpenIdList, alipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.employeeOpenIdList) &&
        Objects.equals(this.pageNum, alipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.pageSize) &&
        Objects.equals(this.totalPageCount, alipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.totalPageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeList, employeeOpenIdList, pageNum, pageSize, totalPageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel {\n");
    sb.append("    employeeList: ").append(toIndentedString(employeeList)).append("\n");
    sb.append("    employeeOpenIdList: ").append(toIndentedString(employeeOpenIdList)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalPageCount: ").append(toIndentedString(totalPageCount)).append("\n");
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
    openapiFields.add("employee_list");
    openapiFields.add("employee_open_id_list");
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
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel is not found in the empty JSON string", AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("employee_list") != null && !jsonObj.get("employee_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_list` to be an array in the JSON string but got `%s`", jsonObj.get("employee_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("employee_open_id_list") != null && !jsonObj.get("employee_open_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_open_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("employee_open_id_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel
  */
  public static AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

