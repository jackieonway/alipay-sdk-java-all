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
import com.alipay.v3.model.TargetInfo;
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
 * AlipayMerchantTradecomplainBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantTradecomplainBatchqueryModel {
  public static final String SERIALIZED_NAME_BEGIN_TIME = "begin_time";
  @SerializedName(SERIALIZED_NAME_BEGIN_TIME)
  private String beginTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TARGET_INFOS = "target_infos";
  @SerializedName(SERIALIZED_NAME_TARGET_INFOS)
  private List<TargetInfo> targetInfos = null;

  public AlipayMerchantTradecomplainBatchqueryModel() { 
  }

  public AlipayMerchantTradecomplainBatchqueryModel beginTime(String beginTime) {
    
    this.beginTime = beginTime;
    return this;
  }

   /**
   * 查询开始时间 时间格式：yyyy-MM-dd HH:mm:ss 若不填写，则默认当前时间30天前。 注意：begin_time和end_time时间跨度最大一年
   * @return beginTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"2020-02-14 14:23:12\"", value = "查询开始时间 时间格式：yyyy-MM-dd HH:mm:ss 若不填写，则默认当前时间30天前。 注意：begin_time和end_time时间跨度最大一年")

  public String getBeginTime() {
    return beginTime;
  }


  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }


  public AlipayMerchantTradecomplainBatchqueryModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 查询结束时间 时间格式：yyyy-MM-dd HH:mm:ss 若不填写，则默认当前时间。 注意：begin_time和end_time时间跨度最大一年
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"2020-02-14 14:23:12\"", value = "查询结束时间 时间格式：yyyy-MM-dd HH:mm:ss 若不填写，则默认当前时间。 注意：begin_time和end_time时间跨度最大一年")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayMerchantTradecomplainBatchqueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当前页，从1开始
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页，从1开始")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayMerchantTradecomplainBatchqueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页条数，默认10条，最多支持20条
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "每页条数，默认10条，最多支持20条")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayMerchantTradecomplainBatchqueryModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 状态如下 待处理：MERCHANT_PROCESSING  已处理：MERCHANT_FEEDBACKED  投诉完结：FINISHED  投诉关闭：CANCELLED  客服处理中：PLATFORM_PROCESSING  客服处理完结：PLATFORM_FINISH  投诉关闭：CLOSED
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MERCHANT_PROCESSING", value = "状态如下 待处理：MERCHANT_PROCESSING  已处理：MERCHANT_FEEDBACKED  投诉完结：FINISHED  投诉关闭：CANCELLED  客服处理中：PLATFORM_PROCESSING  客服处理完结：PLATFORM_FINISH  投诉关闭：CLOSED")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayMerchantTradecomplainBatchqueryModel targetInfos(List<TargetInfo> targetInfos) {
    
    this.targetInfos = targetInfos;
    return this;
  }

  public AlipayMerchantTradecomplainBatchqueryModel addTargetInfosItem(TargetInfo targetInfosItem) {
    if (this.targetInfos == null) {
      this.targetInfos = new ArrayList<>();
    }
    this.targetInfos.add(targetInfosItem);
    return this;
  }

   /**
   * 应用信息
   * @return targetInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "应用信息")

  public List<TargetInfo> getTargetInfos() {
    return targetInfos;
  }


  public void setTargetInfos(List<TargetInfo> targetInfos) {
    this.targetInfos = targetInfos;
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
   * @return the AlipayMerchantTradecomplainBatchqueryModel instance itself
   */
  public AlipayMerchantTradecomplainBatchqueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayMerchantTradecomplainBatchqueryModel alipayMerchantTradecomplainBatchqueryModel = (AlipayMerchantTradecomplainBatchqueryModel) o;
    return Objects.equals(this.beginTime, alipayMerchantTradecomplainBatchqueryModel.beginTime) &&
        Objects.equals(this.endTime, alipayMerchantTradecomplainBatchqueryModel.endTime) &&
        Objects.equals(this.pageNum, alipayMerchantTradecomplainBatchqueryModel.pageNum) &&
        Objects.equals(this.pageSize, alipayMerchantTradecomplainBatchqueryModel.pageSize) &&
        Objects.equals(this.status, alipayMerchantTradecomplainBatchqueryModel.status) &&
        Objects.equals(this.targetInfos, alipayMerchantTradecomplainBatchqueryModel.targetInfos)&&
        Objects.equals(this.additionalProperties, alipayMerchantTradecomplainBatchqueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginTime, endTime, pageNum, pageSize, status, targetInfos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantTradecomplainBatchqueryModel {\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetInfos: ").append(toIndentedString(targetInfos)).append("\n");
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
    openapiFields.add("begin_time");
    openapiFields.add("end_time");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("status");
    openapiFields.add("target_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantTradecomplainBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantTradecomplainBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantTradecomplainBatchqueryModel is not found in the empty JSON string", AlipayMerchantTradecomplainBatchqueryModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("begin_time") != null && !jsonObj.get("begin_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `begin_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("begin_time").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      JsonArray jsonArraytargetInfos = jsonObj.getAsJsonArray("target_infos");
      if (jsonArraytargetInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("target_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `target_infos` to be an array in the JSON string but got `%s`", jsonObj.get("target_infos").toString()));
        }

        // validate the optional field `target_infos` (array)
        for (int i = 0; i < jsonArraytargetInfos.size(); i++) {
          TargetInfo.validateJsonObject(jsonArraytargetInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantTradecomplainBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantTradecomplainBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantTradecomplainBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantTradecomplainBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantTradecomplainBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantTradecomplainBatchqueryModel value) throws IOException {
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
           public AlipayMerchantTradecomplainBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMerchantTradecomplainBatchqueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMerchantTradecomplainBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantTradecomplainBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantTradecomplainBatchqueryModel
  */
  public static AlipayMerchantTradecomplainBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantTradecomplainBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantTradecomplainBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

