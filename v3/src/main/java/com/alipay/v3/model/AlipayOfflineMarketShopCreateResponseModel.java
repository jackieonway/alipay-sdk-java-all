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
 * AlipayOfflineMarketShopCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOfflineMarketShopCreateResponseModel {
  public static final String SERIALIZED_NAME_APPLY_ID = "apply_id";
  @SerializedName(SERIALIZED_NAME_APPLY_ID)
  private String applyId;

  public static final String SERIALIZED_NAME_AUDIT_DESC = "audit_desc";
  @SerializedName(SERIALIZED_NAME_AUDIT_DESC)
  private String auditDesc;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private String auditStatus;

  public static final String SERIALIZED_NAME_IS_ONLINE = "is_online";
  @SerializedName(SERIALIZED_NAME_IS_ONLINE)
  private String isOnline;

  public static final String SERIALIZED_NAME_IS_SHOW = "is_show";
  @SerializedName(SERIALIZED_NAME_IS_SHOW)
  private String isShow;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_RESULT_CODE = "result_code";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public AlipayOfflineMarketShopCreateResponseModel() { 
  }

  public AlipayOfflineMarketShopCreateResponseModel applyId(String applyId) {
    
    this.applyId = applyId;
    return this;
  }

   /**
   * 开店请求受理成功后返回的支付宝流水ID，根据此ID调用接口  alipay.offline.market.applyorder.batchquery，能够获取当前开店请求审核状态、驳回原因等信息。
   * @return applyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015111410223410000001", value = "开店请求受理成功后返回的支付宝流水ID，根据此ID调用接口  alipay.offline.market.applyorder.batchquery，能够获取当前开店请求审核状态、驳回原因等信息。")

  public String getApplyId() {
    return applyId;
  }


  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }


  public AlipayOfflineMarketShopCreateResponseModel auditDesc(String auditDesc) {
    
    this.auditDesc = auditDesc;
    return this;
  }

   /**
   * 废弃字段。
   * @return auditDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "信息不准确", value = "废弃字段。")

  public String getAuditDesc() {
    return auditDesc;
  }


  public void setAuditDesc(String auditDesc) {
    this.auditDesc = auditDesc;
  }


  public AlipayOfflineMarketShopCreateResponseModel auditStatus(String auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 同步请求如果支付宝受理成功，将返回AUDITING状态。
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDITING", value = "同步请求如果支付宝受理成功，将返回AUDITING状态。")

  public String getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
  }


  public AlipayOfflineMarketShopCreateResponseModel isOnline(String isOnline) {
    
    this.isOnline = isOnline;
    return this;
  }

   /**
   * 废弃字段，T表示上架,F表示未上架。
   * @return isOnline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "废弃字段，T表示上架,F表示未上架。")

  public String getIsOnline() {
    return isOnline;
  }


  public void setIsOnline(String isOnline) {
    this.isOnline = isOnline;
  }


  public AlipayOfflineMarketShopCreateResponseModel isShow(String isShow) {
    
    this.isShow = isShow;
    return this;
  }

   /**
   * 废弃字段，T表示显示，F表示隐藏。
   * @return isShow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "F", value = "废弃字段，T表示显示，F表示隐藏。")

  public String getIsShow() {
    return isShow;
  }


  public void setIsShow(String isShow) {
    this.isShow = isShow;
  }


  public AlipayOfflineMarketShopCreateResponseModel rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * 门店费率值，指定的ISV可用。创建门店时，为符合情况的门店，进行费率单独设置。若费率不符合门店类目的设置，则会创建门店失败。
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.006", value = "门店费率值，指定的ISV可用。创建门店时，为符合情况的门店，进行费率单独设置。若费率不符合门店类目的设置，则会创建门店失败。")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    this.rate = rate;
  }


  public AlipayOfflineMarketShopCreateResponseModel resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 开店请求结果码：  WAIT_MERCHANT_CONFIRM：等待商户确认  当开店需要商户确认时返回此结果码，商户需要登录到商家中心e.alipay.com进行开店确认。例如，ISV帮商户开店时，出现需要改签口碑当面付主体，接口同步返回此错误码，并且支付宝发送短信告知商户登录商家中心进行改签确认，确认后进入到后续审核流程。
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WAIT_MERCHANT_CONFIRM", value = "开店请求结果码：  WAIT_MERCHANT_CONFIRM：等待商户确认  当开店需要商户确认时返回此结果码，商户需要登录到商家中心e.alipay.com进行开店确认。例如，ISV帮商户开店时，出现需要改签口碑当面付主体，接口同步返回此错误码，并且支付宝发送短信告知商户登录商家中心进行改签确认，确认后进入到后续审核流程。")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public AlipayOfflineMarketShopCreateResponseModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 废弃字段，支付宝门店ID。
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015052100077000000000120773", value = "废弃字段，支付宝门店ID。")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
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
   * @return the AlipayOfflineMarketShopCreateResponseModel instance itself
   */
  public AlipayOfflineMarketShopCreateResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOfflineMarketShopCreateResponseModel alipayOfflineMarketShopCreateResponseModel = (AlipayOfflineMarketShopCreateResponseModel) o;
    return Objects.equals(this.applyId, alipayOfflineMarketShopCreateResponseModel.applyId) &&
        Objects.equals(this.auditDesc, alipayOfflineMarketShopCreateResponseModel.auditDesc) &&
        Objects.equals(this.auditStatus, alipayOfflineMarketShopCreateResponseModel.auditStatus) &&
        Objects.equals(this.isOnline, alipayOfflineMarketShopCreateResponseModel.isOnline) &&
        Objects.equals(this.isShow, alipayOfflineMarketShopCreateResponseModel.isShow) &&
        Objects.equals(this.rate, alipayOfflineMarketShopCreateResponseModel.rate) &&
        Objects.equals(this.resultCode, alipayOfflineMarketShopCreateResponseModel.resultCode) &&
        Objects.equals(this.shopId, alipayOfflineMarketShopCreateResponseModel.shopId)&&
        Objects.equals(this.additionalProperties, alipayOfflineMarketShopCreateResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyId, auditDesc, auditStatus, isOnline, isShow, rate, resultCode, shopId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOfflineMarketShopCreateResponseModel {\n");
    sb.append("    applyId: ").append(toIndentedString(applyId)).append("\n");
    sb.append("    auditDesc: ").append(toIndentedString(auditDesc)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    isShow: ").append(toIndentedString(isShow)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
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
    openapiFields.add("apply_id");
    openapiFields.add("audit_desc");
    openapiFields.add("audit_status");
    openapiFields.add("is_online");
    openapiFields.add("is_show");
    openapiFields.add("rate");
    openapiFields.add("result_code");
    openapiFields.add("shop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOfflineMarketShopCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOfflineMarketShopCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOfflineMarketShopCreateResponseModel is not found in the empty JSON string", AlipayOfflineMarketShopCreateResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("apply_id") != null && !jsonObj.get("apply_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_id").toString()));
      }
      if (jsonObj.get("audit_desc") != null && !jsonObj.get("audit_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_desc").toString()));
      }
      if (jsonObj.get("audit_status") != null && !jsonObj.get("audit_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_status").toString()));
      }
      if (jsonObj.get("is_online") != null && !jsonObj.get("is_online").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_online` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_online").toString()));
      }
      if (jsonObj.get("is_show") != null && !jsonObj.get("is_show").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_show` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_show").toString()));
      }
      if (jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      if (jsonObj.get("result_code") != null && !jsonObj.get("result_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_code").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOfflineMarketShopCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOfflineMarketShopCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOfflineMarketShopCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOfflineMarketShopCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOfflineMarketShopCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOfflineMarketShopCreateResponseModel value) throws IOException {
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
           public AlipayOfflineMarketShopCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOfflineMarketShopCreateResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOfflineMarketShopCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOfflineMarketShopCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOfflineMarketShopCreateResponseModel
  */
  public static AlipayOfflineMarketShopCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOfflineMarketShopCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOfflineMarketShopCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

