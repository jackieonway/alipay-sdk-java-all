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
import com.alipay.v3.model.OrderExtInfo;
import com.alipay.v3.model.OrderJourneyElement;
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
 * OrderJourneyInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderJourneyInfo {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<OrderExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_JOURNEY_CREATE_TIME = "journey_create_time";
  @SerializedName(SERIALIZED_NAME_JOURNEY_CREATE_TIME)
  private String journeyCreateTime;

  public static final String SERIALIZED_NAME_JOURNEY_DESC = "journey_desc";
  @SerializedName(SERIALIZED_NAME_JOURNEY_DESC)
  private String journeyDesc;

  public static final String SERIALIZED_NAME_JOURNEY_ELEMENTS = "journey_elements";
  @SerializedName(SERIALIZED_NAME_JOURNEY_ELEMENTS)
  private List<OrderJourneyElement> journeyElements = null;

  public static final String SERIALIZED_NAME_JOURNEY_INDEX = "journey_index";
  @SerializedName(SERIALIZED_NAME_JOURNEY_INDEX)
  private String journeyIndex;

  public static final String SERIALIZED_NAME_JOURNEY_MODIFY_TIME = "journey_modify_time";
  @SerializedName(SERIALIZED_NAME_JOURNEY_MODIFY_TIME)
  private String journeyModifyTime;

  public static final String SERIALIZED_NAME_MERCHANT_JOURNEY_NO = "merchant_journey_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_JOURNEY_NO)
  private String merchantJourneyNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DESC = "status_desc";
  @SerializedName(SERIALIZED_NAME_STATUS_DESC)
  private String statusDesc;

  public static final String SERIALIZED_NAME_SUB_TYPE = "sub_type";
  @SerializedName(SERIALIZED_NAME_SUB_TYPE)
  private String subType;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public OrderJourneyInfo() { 
  }

  public OrderJourneyInfo action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * 操作动作
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DELETE", value = "操作动作")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public OrderJourneyInfo extInfo(List<OrderExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public OrderJourneyInfo addExtInfoItem(OrderExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * 扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息")

  public List<OrderExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<OrderExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public OrderJourneyInfo journeyCreateTime(String journeyCreateTime) {
    
    this.journeyCreateTime = journeyCreateTime;
    return this;
  }

   /**
   * 行程创建时间
   * @return journeyCreateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-16 12:12:12", value = "行程创建时间")

  public String getJourneyCreateTime() {
    return journeyCreateTime;
  }


  public void setJourneyCreateTime(String journeyCreateTime) {
    this.journeyCreateTime = journeyCreateTime;
  }


  public OrderJourneyInfo journeyDesc(String journeyDesc) {
    
    this.journeyDesc = journeyDesc;
    return this;
  }

   /**
   * 行程描述
   * @return journeyDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "中国航空公司 C8888 上海-北京", value = "行程描述")

  public String getJourneyDesc() {
    return journeyDesc;
  }


  public void setJourneyDesc(String journeyDesc) {
    this.journeyDesc = journeyDesc;
  }


  public OrderJourneyInfo journeyElements(List<OrderJourneyElement> journeyElements) {
    
    this.journeyElements = journeyElements;
    return this;
  }

  public OrderJourneyInfo addJourneyElementsItem(OrderJourneyElement journeyElementsItem) {
    if (this.journeyElements == null) {
      this.journeyElements = new ArrayList<>();
    }
    this.journeyElements.add(journeyElementsItem);
    return this;
  }

   /**
   * 行程元素列表
   * @return journeyElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "行程元素列表")

  public List<OrderJourneyElement> getJourneyElements() {
    return journeyElements;
  }


  public void setJourneyElements(List<OrderJourneyElement> journeyElements) {
    this.journeyElements = journeyElements;
  }


  public OrderJourneyInfo journeyIndex(String journeyIndex) {
    
    this.journeyIndex = journeyIndex;
    return this;
  }

   /**
   * 描述本行程为整个行程中的第几程
   * @return journeyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "描述本行程为整个行程中的第几程")

  public String getJourneyIndex() {
    return journeyIndex;
  }


  public void setJourneyIndex(String journeyIndex) {
    this.journeyIndex = journeyIndex;
  }


  public OrderJourneyInfo journeyModifyTime(String journeyModifyTime) {
    
    this.journeyModifyTime = journeyModifyTime;
    return this;
  }

   /**
   * 行程修改时间
   * @return journeyModifyTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-16 16:16:16", value = "行程修改时间")

  public String getJourneyModifyTime() {
    return journeyModifyTime;
  }


  public void setJourneyModifyTime(String journeyModifyTime) {
    this.journeyModifyTime = journeyModifyTime;
  }


  public OrderJourneyInfo merchantJourneyNo(String merchantJourneyNo) {
    
    this.merchantJourneyNo = merchantJourneyNo;
    return this;
  }

   /**
   * 商户行程单号
   * @return merchantJourneyNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "202101130000001", value = "商户行程单号")

  public String getMerchantJourneyNo() {
    return merchantJourneyNo;
  }


  public void setMerchantJourneyNo(String merchantJourneyNo) {
    this.merchantJourneyNo = merchantJourneyNo;
  }


  public OrderJourneyInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 行程状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MERCHANT_FINISHED", value = "行程状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public OrderJourneyInfo statusDesc(String statusDesc) {
    
    this.statusDesc = statusDesc;
    return this;
  }

   /**
   * 行程状态描述
   * @return statusDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "已完成", value = "行程状态描述")

  public String getStatusDesc() {
    return statusDesc;
  }


  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }


  public OrderJourneyInfo subType(String subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * 行程子类型
   * @return subType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abroad", value = "行程子类型")

  public String getSubType() {
    return subType;
  }


  public void setSubType(String subType) {
    this.subType = subType;
  }


  public OrderJourneyInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 行程标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "标题", value = "行程标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public OrderJourneyInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 行程类型
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "airticket", value = "行程类型")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
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
   * @return the OrderJourneyInfo instance itself
   */
  public OrderJourneyInfo putAdditionalProperty(String key, Object value) {
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
    OrderJourneyInfo orderJourneyInfo = (OrderJourneyInfo) o;
    return Objects.equals(this.action, orderJourneyInfo.action) &&
        Objects.equals(this.extInfo, orderJourneyInfo.extInfo) &&
        Objects.equals(this.journeyCreateTime, orderJourneyInfo.journeyCreateTime) &&
        Objects.equals(this.journeyDesc, orderJourneyInfo.journeyDesc) &&
        Objects.equals(this.journeyElements, orderJourneyInfo.journeyElements) &&
        Objects.equals(this.journeyIndex, orderJourneyInfo.journeyIndex) &&
        Objects.equals(this.journeyModifyTime, orderJourneyInfo.journeyModifyTime) &&
        Objects.equals(this.merchantJourneyNo, orderJourneyInfo.merchantJourneyNo) &&
        Objects.equals(this.status, orderJourneyInfo.status) &&
        Objects.equals(this.statusDesc, orderJourneyInfo.statusDesc) &&
        Objects.equals(this.subType, orderJourneyInfo.subType) &&
        Objects.equals(this.title, orderJourneyInfo.title) &&
        Objects.equals(this.type, orderJourneyInfo.type)&&
        Objects.equals(this.additionalProperties, orderJourneyInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, extInfo, journeyCreateTime, journeyDesc, journeyElements, journeyIndex, journeyModifyTime, merchantJourneyNo, status, statusDesc, subType, title, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderJourneyInfo {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    journeyCreateTime: ").append(toIndentedString(journeyCreateTime)).append("\n");
    sb.append("    journeyDesc: ").append(toIndentedString(journeyDesc)).append("\n");
    sb.append("    journeyElements: ").append(toIndentedString(journeyElements)).append("\n");
    sb.append("    journeyIndex: ").append(toIndentedString(journeyIndex)).append("\n");
    sb.append("    journeyModifyTime: ").append(toIndentedString(journeyModifyTime)).append("\n");
    sb.append("    merchantJourneyNo: ").append(toIndentedString(merchantJourneyNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("ext_info");
    openapiFields.add("journey_create_time");
    openapiFields.add("journey_desc");
    openapiFields.add("journey_elements");
    openapiFields.add("journey_index");
    openapiFields.add("journey_modify_time");
    openapiFields.add("merchant_journey_no");
    openapiFields.add("status");
    openapiFields.add("status_desc");
    openapiFields.add("sub_type");
    openapiFields.add("title");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderJourneyInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderJourneyInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderJourneyInfo is not found in the empty JSON string", OrderJourneyInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          OrderExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("journey_create_time") != null && !jsonObj.get("journey_create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `journey_create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("journey_create_time").toString()));
      }
      if (jsonObj.get("journey_desc") != null && !jsonObj.get("journey_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `journey_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("journey_desc").toString()));
      }
      JsonArray jsonArrayjourneyElements = jsonObj.getAsJsonArray("journey_elements");
      if (jsonArrayjourneyElements != null) {
        // ensure the json data is an array
        if (!jsonObj.get("journey_elements").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `journey_elements` to be an array in the JSON string but got `%s`", jsonObj.get("journey_elements").toString()));
        }

        // validate the optional field `journey_elements` (array)
        for (int i = 0; i < jsonArrayjourneyElements.size(); i++) {
          OrderJourneyElement.validateJsonObject(jsonArrayjourneyElements.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("journey_index") != null && !jsonObj.get("journey_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `journey_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("journey_index").toString()));
      }
      if (jsonObj.get("journey_modify_time") != null && !jsonObj.get("journey_modify_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `journey_modify_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("journey_modify_time").toString()));
      }
      if (jsonObj.get("merchant_journey_no") != null && !jsonObj.get("merchant_journey_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_journey_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_journey_no").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("status_desc") != null && !jsonObj.get("status_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_desc").toString()));
      }
      if (jsonObj.get("sub_type") != null && !jsonObj.get("sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_type").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderJourneyInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderJourneyInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderJourneyInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderJourneyInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderJourneyInfo>() {
           @Override
           public void write(JsonWriter out, OrderJourneyInfo value) throws IOException {
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
           public OrderJourneyInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrderJourneyInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderJourneyInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderJourneyInfo
  * @throws IOException if the JSON string is invalid with respect to OrderJourneyInfo
  */
  public static OrderJourneyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderJourneyInfo.class);
  }

 /**
  * Convert an instance of OrderJourneyInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

