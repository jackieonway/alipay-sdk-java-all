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
import com.alipay.v3.model.ActivityBaseInfo;
import com.alipay.v3.model.PaymentVoucherUseRuleModify;
import com.alipay.v3.model.VoucherAvailableScopeInfo;
import com.alipay.v3.model.VoucherSendModeInfo;
import com.alipay.v3.model.VoucherUseRuleInfo;
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
 * AlipayMarketingActivityVoucherModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityVoucherModifyModel {
  public static final String SERIALIZED_NAME_ACTIVITY_BASE_INFO = "activity_base_info";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_BASE_INFO)
  private ActivityBaseInfo activityBaseInfo;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_MERCHANT_ACCESS_MODE = "merchant_access_mode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCESS_MODE)
  private String merchantAccessMode;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PUBLISH_END_TIME = "publish_end_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_END_TIME)
  private String publishEndTime;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO = "voucher_available_scope_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO)
  private VoucherAvailableScopeInfo voucherAvailableScopeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO = "voucher_send_mode_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO)
  private VoucherSendModeInfo voucherSendModeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE = "voucher_use_rule";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE)
  private PaymentVoucherUseRuleModify voucherUseRule;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_INFO = "voucher_use_rule_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_INFO)
  private VoucherUseRuleInfo voucherUseRuleInfo;

  public AlipayMarketingActivityVoucherModifyModel() { 
  }

  public AlipayMarketingActivityVoucherModifyModel activityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    
    this.activityBaseInfo = activityBaseInfo;
    return this;
  }

   /**
   * Get activityBaseInfo
   * @return activityBaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActivityBaseInfo getActivityBaseInfo() {
    return activityBaseInfo;
  }


  public void setActivityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    this.activityBaseInfo = activityBaseInfo;
  }


  public AlipayMarketingActivityVoucherModifyModel activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动id
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016042700826004508401111111", value = "活动id")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public AlipayMarketingActivityVoucherModifyModel merchantAccessMode(String merchantAccessMode) {
    
    this.merchantAccessMode = merchantAccessMode;
    return this;
  }

   /**
   * 商户接入模式
   * @return merchantAccessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AGENCY_MODE", value = "商户接入模式")

  public String getMerchantAccessMode() {
    return merchantAccessMode;
  }


  public void setMerchantAccessMode(String merchantAccessMode) {
    this.merchantAccessMode = merchantAccessMode;
  }


  public AlipayMarketingActivityVoucherModifyModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170101000001654bb46ba", value = "外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayMarketingActivityVoucherModifyModel publishEndTime(String publishEndTime) {
    
    this.publishEndTime = publishEndTime;
    return this;
  }

   /**
   * 券发放结束时间。格式为：yyyy-MM-dd HH:mm:ss
   * @return publishEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-29 23:59:59", value = "券发放结束时间。格式为：yyyy-MM-dd HH:mm:ss")

  public String getPublishEndTime() {
    return publishEndTime;
  }


  public void setPublishEndTime(String publishEndTime) {
    this.publishEndTime = publishEndTime;
  }


  public AlipayMarketingActivityVoucherModifyModel voucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
    return this;
  }

   /**
   * Get voucherAvailableScopeInfo
   * @return voucherAvailableScopeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableScopeInfo getVoucherAvailableScopeInfo() {
    return voucherAvailableScopeInfo;
  }


  public void setVoucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
  }


  public AlipayMarketingActivityVoucherModifyModel voucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    
    this.voucherSendModeInfo = voucherSendModeInfo;
    return this;
  }

   /**
   * Get voucherSendModeInfo
   * @return voucherSendModeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSendModeInfo getVoucherSendModeInfo() {
    return voucherSendModeInfo;
  }


  public void setVoucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    this.voucherSendModeInfo = voucherSendModeInfo;
  }


  public AlipayMarketingActivityVoucherModifyModel voucherUseRule(PaymentVoucherUseRuleModify voucherUseRule) {
    
    this.voucherUseRule = voucherUseRule;
    return this;
  }

   /**
   * Get voucherUseRule
   * @return voucherUseRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherUseRuleModify getVoucherUseRule() {
    return voucherUseRule;
  }


  public void setVoucherUseRule(PaymentVoucherUseRuleModify voucherUseRule) {
    this.voucherUseRule = voucherUseRule;
  }


  public AlipayMarketingActivityVoucherModifyModel voucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    
    this.voucherUseRuleInfo = voucherUseRuleInfo;
    return this;
  }

   /**
   * Get voucherUseRuleInfo
   * @return voucherUseRuleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseRuleInfo getVoucherUseRuleInfo() {
    return voucherUseRuleInfo;
  }


  public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    this.voucherUseRuleInfo = voucherUseRuleInfo;
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
   * @return the AlipayMarketingActivityVoucherModifyModel instance itself
   */
  public AlipayMarketingActivityVoucherModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingActivityVoucherModifyModel alipayMarketingActivityVoucherModifyModel = (AlipayMarketingActivityVoucherModifyModel) o;
    return Objects.equals(this.activityBaseInfo, alipayMarketingActivityVoucherModifyModel.activityBaseInfo) &&
        Objects.equals(this.activityId, alipayMarketingActivityVoucherModifyModel.activityId) &&
        Objects.equals(this.merchantAccessMode, alipayMarketingActivityVoucherModifyModel.merchantAccessMode) &&
        Objects.equals(this.outBizNo, alipayMarketingActivityVoucherModifyModel.outBizNo) &&
        Objects.equals(this.publishEndTime, alipayMarketingActivityVoucherModifyModel.publishEndTime) &&
        Objects.equals(this.voucherAvailableScopeInfo, alipayMarketingActivityVoucherModifyModel.voucherAvailableScopeInfo) &&
        Objects.equals(this.voucherSendModeInfo, alipayMarketingActivityVoucherModifyModel.voucherSendModeInfo) &&
        Objects.equals(this.voucherUseRule, alipayMarketingActivityVoucherModifyModel.voucherUseRule) &&
        Objects.equals(this.voucherUseRuleInfo, alipayMarketingActivityVoucherModifyModel.voucherUseRuleInfo)&&
        Objects.equals(this.additionalProperties, alipayMarketingActivityVoucherModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityBaseInfo, activityId, merchantAccessMode, outBizNo, publishEndTime, voucherAvailableScopeInfo, voucherSendModeInfo, voucherUseRule, voucherUseRuleInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityVoucherModifyModel {\n");
    sb.append("    activityBaseInfo: ").append(toIndentedString(activityBaseInfo)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    merchantAccessMode: ").append(toIndentedString(merchantAccessMode)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    publishEndTime: ").append(toIndentedString(publishEndTime)).append("\n");
    sb.append("    voucherAvailableScopeInfo: ").append(toIndentedString(voucherAvailableScopeInfo)).append("\n");
    sb.append("    voucherSendModeInfo: ").append(toIndentedString(voucherSendModeInfo)).append("\n");
    sb.append("    voucherUseRule: ").append(toIndentedString(voucherUseRule)).append("\n");
    sb.append("    voucherUseRuleInfo: ").append(toIndentedString(voucherUseRuleInfo)).append("\n");
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
    openapiFields.add("activity_base_info");
    openapiFields.add("activity_id");
    openapiFields.add("merchant_access_mode");
    openapiFields.add("out_biz_no");
    openapiFields.add("publish_end_time");
    openapiFields.add("voucher_available_scope_info");
    openapiFields.add("voucher_send_mode_info");
    openapiFields.add("voucher_use_rule");
    openapiFields.add("voucher_use_rule_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityVoucherModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityVoucherModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityVoucherModifyModel is not found in the empty JSON string", AlipayMarketingActivityVoucherModifyModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `activity_base_info`
      if (jsonObj.getAsJsonObject("activity_base_info") != null) {
        ActivityBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("activity_base_info"));
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      if (jsonObj.get("merchant_access_mode") != null && !jsonObj.get("merchant_access_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_access_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_access_mode").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("publish_end_time") != null && !jsonObj.get("publish_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_end_time").toString()));
      }
      // validate the optional field `voucher_available_scope_info`
      if (jsonObj.getAsJsonObject("voucher_available_scope_info") != null) {
        VoucherAvailableScopeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_scope_info"));
      }
      // validate the optional field `voucher_send_mode_info`
      if (jsonObj.getAsJsonObject("voucher_send_mode_info") != null) {
        VoucherSendModeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_mode_info"));
      }
      // validate the optional field `voucher_use_rule`
      if (jsonObj.getAsJsonObject("voucher_use_rule") != null) {
        PaymentVoucherUseRuleModify.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule"));
      }
      // validate the optional field `voucher_use_rule_info`
      if (jsonObj.getAsJsonObject("voucher_use_rule_info") != null) {
        VoucherUseRuleInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityVoucherModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityVoucherModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityVoucherModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityVoucherModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityVoucherModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityVoucherModifyModel value) throws IOException {
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
           public AlipayMarketingActivityVoucherModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingActivityVoucherModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingActivityVoucherModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityVoucherModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityVoucherModifyModel
  */
  public static AlipayMarketingActivityVoucherModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityVoucherModifyModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityVoucherModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

