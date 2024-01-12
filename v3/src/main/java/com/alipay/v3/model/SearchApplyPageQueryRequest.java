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
 * SearchApplyPageQueryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchApplyPageQueryRequest {
  public static final String SERIALIZED_NAME_APPLY_TYPE = "apply_type";
  @SerializedName(SERIALIZED_NAME_APPLY_TYPE)
  private String applyType;

  public static final String SERIALIZED_NAME_AUDIT_STATUS_LIST = "audit_status_list";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS_LIST)
  private List<String> auditStatusList = null;

  public static final String SERIALIZED_NAME_CATEGORY_CODE = "category_code";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE)
  private String categoryCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private String pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SERVICE_ID = "service_id";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_START_ROW = "start_row";
  @SerializedName(SERIALIZED_NAME_START_ROW)
  private String startRow;

  public static final String SERIALIZED_NAME_SUB_SERVICE_CODE = "sub_service_code";
  @SerializedName(SERIALIZED_NAME_SUB_SERVICE_CODE)
  private String subServiceCode;

  public SearchApplyPageQueryRequest() { 
  }

  public SearchApplyPageQueryRequest applyType(String applyType) {
    
    this.applyType = applyType;
    return this;
  }

   /**
   * 申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
   * @return applyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BRAND_BOX", value = "申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达")

  public String getApplyType() {
    return applyType;
  }


  public void setApplyType(String applyType) {
    this.applyType = applyType;
  }


  public SearchApplyPageQueryRequest auditStatusList(List<String> auditStatusList) {
    
    this.auditStatusList = auditStatusList;
    return this;
  }

  public SearchApplyPageQueryRequest addAuditStatusListItem(String auditStatusListItem) {
    if (this.auditStatusList == null) {
      this.auditStatusList = new ArrayList<>();
    }
    this.auditStatusList.add(auditStatusListItem);
    return this;
  }

   /**
   * 筛选状态数组 AUDIT AGREE REJECT CANCEL EDIT
   * @return auditStatusList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"AUDIT\",\"AGREE\"]", value = "筛选状态数组 AUDIT AGREE REJECT CANCEL EDIT")

  public List<String> getAuditStatusList() {
    return auditStatusList;
  }


  public void setAuditStatusList(List<String> auditStatusList) {
    this.auditStatusList = auditStatusList;
  }


  public SearchApplyPageQueryRequest categoryCode(String categoryCode) {
    
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * 类目编码
   * @return categoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001162676276", value = "类目编码")

  public String getCategoryCode() {
    return categoryCode;
  }


  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  public SearchApplyPageQueryRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 服务名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "服务名称", value = "服务名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SearchApplyPageQueryRequest pageNum(String pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当前页码
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "当前页码")

  public String getPageNum() {
    return pageNum;
  }


  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }


  public SearchApplyPageQueryRequest pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页面的显示记录条数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "页面的显示记录条数")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public SearchApplyPageQueryRequest serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 服务code
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020062021000575859547", value = "服务code")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public SearchApplyPageQueryRequest serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * 小程序appid
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020072301000006648885", value = "小程序appid")

  public String getServiceId() {
    return serviceId;
  }


  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public SearchApplyPageQueryRequest startRow(String startRow) {
    
    this.startRow = startRow;
    return this;
  }

   /**
   * 起始记录，起始：0
   * @return startRow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "起始记录，起始：0")

  public String getStartRow() {
    return startRow;
  }


  public void setStartRow(String startRow) {
    this.startRow = startRow;
  }


  public SearchApplyPageQueryRequest subServiceCode(String subServiceCode) {
    
    this.subServiceCode = subServiceCode;
    return this;
  }

   /**
   * 二级服务code
   * @return subServiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020062021000575859547", value = "二级服务code")

  public String getSubServiceCode() {
    return subServiceCode;
  }


  public void setSubServiceCode(String subServiceCode) {
    this.subServiceCode = subServiceCode;
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
   * @return the SearchApplyPageQueryRequest instance itself
   */
  public SearchApplyPageQueryRequest putAdditionalProperty(String key, Object value) {
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
    SearchApplyPageQueryRequest searchApplyPageQueryRequest = (SearchApplyPageQueryRequest) o;
    return Objects.equals(this.applyType, searchApplyPageQueryRequest.applyType) &&
        Objects.equals(this.auditStatusList, searchApplyPageQueryRequest.auditStatusList) &&
        Objects.equals(this.categoryCode, searchApplyPageQueryRequest.categoryCode) &&
        Objects.equals(this.name, searchApplyPageQueryRequest.name) &&
        Objects.equals(this.pageNum, searchApplyPageQueryRequest.pageNum) &&
        Objects.equals(this.pageSize, searchApplyPageQueryRequest.pageSize) &&
        Objects.equals(this.serviceCode, searchApplyPageQueryRequest.serviceCode) &&
        Objects.equals(this.serviceId, searchApplyPageQueryRequest.serviceId) &&
        Objects.equals(this.startRow, searchApplyPageQueryRequest.startRow) &&
        Objects.equals(this.subServiceCode, searchApplyPageQueryRequest.subServiceCode)&&
        Objects.equals(this.additionalProperties, searchApplyPageQueryRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyType, auditStatusList, categoryCode, name, pageNum, pageSize, serviceCode, serviceId, startRow, subServiceCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchApplyPageQueryRequest {\n");
    sb.append("    applyType: ").append(toIndentedString(applyType)).append("\n");
    sb.append("    auditStatusList: ").append(toIndentedString(auditStatusList)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    startRow: ").append(toIndentedString(startRow)).append("\n");
    sb.append("    subServiceCode: ").append(toIndentedString(subServiceCode)).append("\n");
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
    openapiFields.add("apply_type");
    openapiFields.add("audit_status_list");
    openapiFields.add("category_code");
    openapiFields.add("name");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("service_code");
    openapiFields.add("service_id");
    openapiFields.add("start_row");
    openapiFields.add("sub_service_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchApplyPageQueryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchApplyPageQueryRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchApplyPageQueryRequest is not found in the empty JSON string", SearchApplyPageQueryRequest.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("apply_type") != null && !jsonObj.get("apply_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_type").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("audit_status_list") != null && !jsonObj.get("audit_status_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_status_list` to be an array in the JSON string but got `%s`", jsonObj.get("audit_status_list").toString()));
      }
      if (jsonObj.get("category_code") != null && !jsonObj.get("category_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_code").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("page_num") != null && !jsonObj.get("page_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_num").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("service_id") != null && !jsonObj.get("service_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_id").toString()));
      }
      if (jsonObj.get("start_row") != null && !jsonObj.get("start_row").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_row` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_row").toString()));
      }
      if (jsonObj.get("sub_service_code") != null && !jsonObj.get("sub_service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_service_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchApplyPageQueryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchApplyPageQueryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchApplyPageQueryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchApplyPageQueryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchApplyPageQueryRequest>() {
           @Override
           public void write(JsonWriter out, SearchApplyPageQueryRequest value) throws IOException {
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
           public SearchApplyPageQueryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchApplyPageQueryRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchApplyPageQueryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchApplyPageQueryRequest
  * @throws IOException if the JSON string is invalid with respect to SearchApplyPageQueryRequest
  */
  public static SearchApplyPageQueryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchApplyPageQueryRequest.class);
  }

 /**
  * Convert an instance of SearchApplyPageQueryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

