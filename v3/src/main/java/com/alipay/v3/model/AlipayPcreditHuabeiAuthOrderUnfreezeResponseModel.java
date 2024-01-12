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
 * AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_AGREEMENT_STATUS = "agreement_status";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_STATUS)
  private String agreementStatus;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_AUTH_OPT_ID = "auth_opt_id";
  @SerializedName(SERIALIZED_NAME_AUTH_OPT_ID)
  private String authOptId;

  public static final String SERIALIZED_NAME_GMT_TRANS = "gmt_trans";
  @SerializedName(SERIALIZED_NAME_GMT_TRANS)
  private String gmtTrans;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_REST_FREEZE_AMOUNT = "rest_freeze_amount";
  @SerializedName(SERIALIZED_NAME_REST_FREEZE_AMOUNT)
  private String restFreezeAmount;

  public static final String SERIALIZED_NAME_SELLER_ID = "seller_id";
  @SerializedName(SERIALIZED_NAME_SELLER_ID)
  private String sellerId;

  public static final String SERIALIZED_NAME_TRANS_STATUS = "trans_status";
  @SerializedName(SERIALIZED_NAME_TRANS_STATUS)
  private String transStatus;

  public static final String SERIALIZED_NAME_UNFREEZE_AMOUNT = "unfreeze_amount";
  @SerializedName(SERIALIZED_NAME_UNFREEZE_AMOUNT)
  private String unfreezeAmount;

  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel() { 
  }

  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20185513447859192007", value = "支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel agreementStatus(String agreementStatus) {
    
    this.agreementStatus = agreementStatus;
    return this;
  }

   /**
   * 协议状态。Y表示状态有效，N表示状态失效
   * @return agreementStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "协议状态。Y表示状态有效，N表示状态失效")

  public String getAgreementStatus() {
    return agreementStatus;
  }


  public void setAgreementStatus(String agreementStatus) {
    this.agreementStatus = agreementStatus;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "买家在支付宝的用户id")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel authOptId(String authOptId) {
    
    this.authOptId = authOptId;
    return this;
  }

   /**
   * 支付宝侧花呗冻结解冻操作单据id
   * @return authOptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018081010020817070009689955", value = "支付宝侧花呗冻结解冻操作单据id")

  public String getAuthOptId() {
    return authOptId;
  }


  public void setAuthOptId(String authOptId) {
    this.authOptId = authOptId;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel gmtTrans(String gmtTrans) {
    
    this.gmtTrans = gmtTrans;
    return this;
  }

   /**
   * 解冻成功时间
   * @return gmtTrans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-09-15 11:23:04", value = "解冻成功时间")

  public String getGmtTrans() {
    return gmtTrans;
  }


  public void setGmtTrans(String gmtTrans) {
    this.gmtTrans = gmtTrans;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "买家在支付宝的用户id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户本次操作的请求流水号，用于标识请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。由商户传入，最终返回给商户。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938032", value = "商户本次操作的请求流水号，用于标识请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。由商户传入，最终返回给商户。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel restFreezeAmount(String restFreezeAmount) {
    
    this.restFreezeAmount = restFreezeAmount;
    return this;
  }

   /**
   * 完成本次操作时，用户资金池余额快照。仅作提示用，请勿用于核对，并发情况下数值有可能不准确。两位小数，单位元。
   * @return restFreezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200.00", value = "完成本次操作时，用户资金池余额快照。仅作提示用，请勿用于核对，并发情况下数值有可能不准确。两位小数，单位元。")

  public String getRestFreezeAmount() {
    return restFreezeAmount;
  }


  public void setRestFreezeAmount(String restFreezeAmount) {
    this.restFreezeAmount = restFreezeAmount;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel sellerId(String sellerId) {
    
    this.sellerId = sellerId;
    return this;
  }

   /**
   * 商户的支付宝用户id
   * @return sellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088411663864410", value = "商户的支付宝用户id")

  public String getSellerId() {
    return sellerId;
  }


  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel transStatus(String transStatus) {
    
    this.transStatus = transStatus;
    return this;
  }

   /**
   * 业务操作状态，Y表示成功；N表示失败。
   * @return transStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "业务操作状态，Y表示成功；N表示失败。")

  public String getTransStatus() {
    return transStatus;
  }


  public void setTransStatus(String transStatus) {
    this.transStatus = transStatus;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel unfreezeAmount(String unfreezeAmount) {
    
    this.unfreezeAmount = unfreezeAmount;
    return this;
  }

   /**
   * 解冻金额
   * @return unfreezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "解冻金额")

  public String getUnfreezeAmount() {
    return unfreezeAmount;
  }


  public void setUnfreezeAmount(String unfreezeAmount) {
    this.unfreezeAmount = unfreezeAmount;
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
   * @return the AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel instance itself
   */
  public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel alipayPcreditHuabeiAuthOrderUnfreezeResponseModel = (AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel) o;
    return Objects.equals(this.agreementNo, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.agreementNo) &&
        Objects.equals(this.agreementStatus, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.agreementStatus) &&
        Objects.equals(this.alipayUserId, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.alipayUserId) &&
        Objects.equals(this.authOptId, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.authOptId) &&
        Objects.equals(this.gmtTrans, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.gmtTrans) &&
        Objects.equals(this.openId, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.openId) &&
        Objects.equals(this.outRequestNo, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.outRequestNo) &&
        Objects.equals(this.restFreezeAmount, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.restFreezeAmount) &&
        Objects.equals(this.sellerId, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.sellerId) &&
        Objects.equals(this.transStatus, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.transStatus) &&
        Objects.equals(this.unfreezeAmount, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.unfreezeAmount)&&
        Objects.equals(this.additionalProperties, alipayPcreditHuabeiAuthOrderUnfreezeResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNo, agreementStatus, alipayUserId, authOptId, gmtTrans, openId, outRequestNo, restFreezeAmount, sellerId, transStatus, unfreezeAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel {\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    agreementStatus: ").append(toIndentedString(agreementStatus)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    authOptId: ").append(toIndentedString(authOptId)).append("\n");
    sb.append("    gmtTrans: ").append(toIndentedString(gmtTrans)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    restFreezeAmount: ").append(toIndentedString(restFreezeAmount)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    transStatus: ").append(toIndentedString(transStatus)).append("\n");
    sb.append("    unfreezeAmount: ").append(toIndentedString(unfreezeAmount)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("agreement_status");
    openapiFields.add("alipay_user_id");
    openapiFields.add("auth_opt_id");
    openapiFields.add("gmt_trans");
    openapiFields.add("open_id");
    openapiFields.add("out_request_no");
    openapiFields.add("rest_freeze_amount");
    openapiFields.add("seller_id");
    openapiFields.add("trans_status");
    openapiFields.add("unfreeze_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel is not found in the empty JSON string", AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("agreement_status") != null && !jsonObj.get("agreement_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_status").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("auth_opt_id") != null && !jsonObj.get("auth_opt_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_opt_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_opt_id").toString()));
      }
      if (jsonObj.get("gmt_trans") != null && !jsonObj.get("gmt_trans").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_trans` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_trans").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("rest_freeze_amount") != null && !jsonObj.get("rest_freeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rest_freeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rest_freeze_amount").toString()));
      }
      if (jsonObj.get("seller_id") != null && !jsonObj.get("seller_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_id").toString()));
      }
      if (jsonObj.get("trans_status") != null && !jsonObj.get("trans_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_status").toString()));
      }
      if (jsonObj.get("unfreeze_amount") != null && !jsonObj.get("unfreeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unfreeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unfreeze_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel value) throws IOException {
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
           public AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel
  */
  public static AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel.class);
  }

 /**
  * Convert an instance of AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

