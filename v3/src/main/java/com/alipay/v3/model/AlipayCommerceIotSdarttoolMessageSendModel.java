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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * AlipayCommerceIotSdarttoolMessageSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceIotSdarttoolMessageSendModel {
  public static final String SERIALIZED_NAME_BI_DA = "bi_da";
  @SerializedName(SERIALIZED_NAME_BI_DA)
  private Boolean biDa;

  public static final String SERIALIZED_NAME_DEVICE_QUERY_TYPE = "device_query_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_QUERY_TYPE)
  private String deviceQueryType;

  public static final String SERIALIZED_NAME_IMMEDIATE_MSG = "immediate_msg";
  @SerializedName(SERIALIZED_NAME_IMMEDIATE_MSG)
  private Boolean immediateMsg;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_MSG_CONTENT = "msg_content";
  @SerializedName(SERIALIZED_NAME_MSG_CONTENT)
  private String msgContent;

  public static final String SERIALIZED_NAME_MSG_CONTENT_TYPE = "msg_content_type";
  @SerializedName(SERIALIZED_NAME_MSG_CONTENT_TYPE)
  private String msgContentType;

  public static final String SERIALIZED_NAME_MSG_EXPIRE = "msg_expire";
  @SerializedName(SERIALIZED_NAME_MSG_EXPIRE)
  private Integer msgExpire;

  public static final String SERIALIZED_NAME_MSG_PRIORITY = "msg_priority";
  @SerializedName(SERIALIZED_NAME_MSG_PRIORITY)
  private Integer msgPriority;

  public static final String SERIALIZED_NAME_MSG_TYPE = "msg_type";
  @SerializedName(SERIALIZED_NAME_MSG_TYPE)
  private String msgType;

  public static final String SERIALIZED_NAME_SERVICE_ID = "service_id";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_SN = "sn";
  @SerializedName(SERIALIZED_NAME_SN)
  private String sn;

  public static final String SERIALIZED_NAME_SUPPLIER_ID = "supplier_id";
  @SerializedName(SERIALIZED_NAME_SUPPLIER_ID)
  private String supplierId;

  public AlipayCommerceIotSdarttoolMessageSendModel() { 
  }

  public AlipayCommerceIotSdarttoolMessageSendModel biDa(Boolean biDa) {
    
    this.biDa = biDa;
    return this;
  }

   /**
   * 消息是否必达(immediate_msg为false时此字段设置有效)，消息过期时间顺延3*24h. 建议使用expire_time设置消息过期时间
   * @return biDa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "消息是否必达(immediate_msg为false时此字段设置有效)，消息过期时间顺延3*24h. 建议使用expire_time设置消息过期时间")

  public Boolean getBiDa() {
    return biDa;
  }


  public void setBiDa(Boolean biDa) {
    this.biDa = biDa;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel deviceQueryType(String deviceQueryType) {
    
    this.deviceQueryType = deviceQueryType;
    return this;
  }

   /**
   * 设备查询条件类型 ；SUPPLIERID_SN:supplierid+sn ;  ITEMID_SN:itemid + sn; SN:sn
   * @return deviceQueryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ITEMID_SN", value = "设备查询条件类型 ；SUPPLIERID_SN:supplierid+sn ;  ITEMID_SN:itemid + sn; SN:sn")

  public String getDeviceQueryType() {
    return deviceQueryType;
  }


  public void setDeviceQueryType(String deviceQueryType) {
    this.deviceQueryType = deviceQueryType;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel immediateMsg(Boolean immediateMsg) {
    
    this.immediateMsg = immediateMsg;
    return this;
  }

   /**
   * 是否即时消息; true-校验设备是否在线，false-不校验设备是否在线
   * @return immediateMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否即时消息; true-校验设备是否在线，false-不校验设备是否在线")

  public Boolean getImmediateMsg() {
    return immediateMsg;
  }


  public void setImmediateMsg(Boolean immediateMsg) {
    this.immediateMsg = immediateMsg;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 产品ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019111304877238", value = "产品ID")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel msgContent(String msgContent) {
    
    this.msgContent = msgContent;
    return this;
  }

   /**
   * 消息内容
   * @return msgContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"contentParams\":[\"消息内容\"]}", value = "消息内容")

  public String getMsgContent() {
    return msgContent;
  }


  public void setMsgContent(String msgContent) {
    this.msgContent = msgContent;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel msgContentType(String msgContentType) {
    
    this.msgContentType = msgContentType;
    return this;
  }

   /**
   * 消息内容格式
   * @return msgContentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "text", value = "消息内容格式")

  public String getMsgContentType() {
    return msgContentType;
  }


  public void setMsgContentType(String msgContentType) {
    this.msgContentType = msgContentType;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel msgExpire(Integer msgExpire) {
    
    this.msgExpire = msgExpire;
    return this;
  }

   /**
   * 消息过期时间戳(ms)， 默认为当前时间顺延24h有效。当设备在线时消息服务过期之前尝试推送。最大过期时间顺延3*24h
   * @return msgExpire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1573107942000", value = "消息过期时间戳(ms)， 默认为当前时间顺延24h有效。当设备在线时消息服务过期之前尝试推送。最大过期时间顺延3*24h")

  public Integer getMsgExpire() {
    return msgExpire;
  }


  public void setMsgExpire(Integer msgExpire) {
    this.msgExpire = msgExpire;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel msgPriority(Integer msgPriority) {
    
    this.msgPriority = msgPriority;
    return this;
  }

   /**
   * 消息优先级（immediate_msg为false此字段设置有效）数字越大优先发送。
   * @return msgPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "消息优先级（immediate_msg为false此字段设置有效）数字越大优先发送。")

  public Integer getMsgPriority() {
    return msgPriority;
  }


  public void setMsgPriority(Integer msgPriority) {
    this.msgPriority = msgPriority;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel msgType(String msgType) {
    
    this.msgType = msgType;
    return this;
  }

   /**
   * 消息类型： xpaas_common-小程序消息； ruyi_ordermsg-如意订单消息
   * @return msgType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xpaas_common", value = "消息类型： xpaas_common-小程序消息； ruyi_ordermsg-如意订单消息")

  public String getMsgType() {
    return msgType;
  }


  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * 服务ID，当小程序消费消息时必传(传入的是小程序ID)
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201808903221", value = "服务ID，当小程序消费消息时必传(传入的是小程序ID)")

  public String getServiceId() {
    return serviceId;
  }


  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel sn(String sn) {
    
    this.sn = sn;
    return this;
  }

   /**
   * 设备sn号
   * @return sn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000000001", value = "设备sn号")

  public String getSn() {
    return sn;
  }


  public void setSn(String sn) {
    this.sn = sn;
  }


  public AlipayCommerceIotSdarttoolMessageSendModel supplierId(String supplierId) {
    
    this.supplierId = supplierId;
    return this;
  }

   /**
   * 厂商ID
   * @return supplierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20000000001", value = "厂商ID")

  public String getSupplierId() {
    return supplierId;
  }


  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
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
   * @return the AlipayCommerceIotSdarttoolMessageSendModel instance itself
   */
  public AlipayCommerceIotSdarttoolMessageSendModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceIotSdarttoolMessageSendModel alipayCommerceIotSdarttoolMessageSendModel = (AlipayCommerceIotSdarttoolMessageSendModel) o;
    return Objects.equals(this.biDa, alipayCommerceIotSdarttoolMessageSendModel.biDa) &&
        Objects.equals(this.deviceQueryType, alipayCommerceIotSdarttoolMessageSendModel.deviceQueryType) &&
        Objects.equals(this.immediateMsg, alipayCommerceIotSdarttoolMessageSendModel.immediateMsg) &&
        Objects.equals(this.itemId, alipayCommerceIotSdarttoolMessageSendModel.itemId) &&
        Objects.equals(this.msgContent, alipayCommerceIotSdarttoolMessageSendModel.msgContent) &&
        Objects.equals(this.msgContentType, alipayCommerceIotSdarttoolMessageSendModel.msgContentType) &&
        Objects.equals(this.msgExpire, alipayCommerceIotSdarttoolMessageSendModel.msgExpire) &&
        Objects.equals(this.msgPriority, alipayCommerceIotSdarttoolMessageSendModel.msgPriority) &&
        Objects.equals(this.msgType, alipayCommerceIotSdarttoolMessageSendModel.msgType) &&
        Objects.equals(this.serviceId, alipayCommerceIotSdarttoolMessageSendModel.serviceId) &&
        Objects.equals(this.sn, alipayCommerceIotSdarttoolMessageSendModel.sn) &&
        Objects.equals(this.supplierId, alipayCommerceIotSdarttoolMessageSendModel.supplierId)&&
        Objects.equals(this.additionalProperties, alipayCommerceIotSdarttoolMessageSendModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biDa, deviceQueryType, immediateMsg, itemId, msgContent, msgContentType, msgExpire, msgPriority, msgType, serviceId, sn, supplierId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceIotSdarttoolMessageSendModel {\n");
    sb.append("    biDa: ").append(toIndentedString(biDa)).append("\n");
    sb.append("    deviceQueryType: ").append(toIndentedString(deviceQueryType)).append("\n");
    sb.append("    immediateMsg: ").append(toIndentedString(immediateMsg)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    msgContent: ").append(toIndentedString(msgContent)).append("\n");
    sb.append("    msgContentType: ").append(toIndentedString(msgContentType)).append("\n");
    sb.append("    msgExpire: ").append(toIndentedString(msgExpire)).append("\n");
    sb.append("    msgPriority: ").append(toIndentedString(msgPriority)).append("\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
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
    openapiFields.add("bi_da");
    openapiFields.add("device_query_type");
    openapiFields.add("immediate_msg");
    openapiFields.add("item_id");
    openapiFields.add("msg_content");
    openapiFields.add("msg_content_type");
    openapiFields.add("msg_expire");
    openapiFields.add("msg_priority");
    openapiFields.add("msg_type");
    openapiFields.add("service_id");
    openapiFields.add("sn");
    openapiFields.add("supplier_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceIotSdarttoolMessageSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceIotSdarttoolMessageSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceIotSdarttoolMessageSendModel is not found in the empty JSON string", AlipayCommerceIotSdarttoolMessageSendModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("device_query_type") != null && !jsonObj.get("device_query_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_query_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_query_type").toString()));
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      if (jsonObj.get("msg_content") != null && !jsonObj.get("msg_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg_content").toString()));
      }
      if (jsonObj.get("msg_content_type") != null && !jsonObj.get("msg_content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg_content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg_content_type").toString()));
      }
      if (jsonObj.get("msg_type") != null && !jsonObj.get("msg_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg_type").toString()));
      }
      if (jsonObj.get("service_id") != null && !jsonObj.get("service_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_id").toString()));
      }
      if (jsonObj.get("sn") != null && !jsonObj.get("sn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sn").toString()));
      }
      if (jsonObj.get("supplier_id") != null && !jsonObj.get("supplier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supplier_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceIotSdarttoolMessageSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceIotSdarttoolMessageSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceIotSdarttoolMessageSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceIotSdarttoolMessageSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceIotSdarttoolMessageSendModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceIotSdarttoolMessageSendModel value) throws IOException {
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
           public AlipayCommerceIotSdarttoolMessageSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceIotSdarttoolMessageSendModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceIotSdarttoolMessageSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceIotSdarttoolMessageSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceIotSdarttoolMessageSendModel
  */
  public static AlipayCommerceIotSdarttoolMessageSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceIotSdarttoolMessageSendModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceIotSdarttoolMessageSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

