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
 * AlipayPcreditHuabeiAuthAgreementQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPcreditHuabeiAuthAgreementQueryResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_NAME = "agreement_name";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NAME)
  private String agreementName;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_AGREEMENT_STATUS = "agreement_status";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_STATUS)
  private String agreementStatus;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_AUTH_SCENE = "auth_scene";
  @SerializedName(SERIALIZED_NAME_AUTH_SCENE)
  private String authScene;

  public static final String SERIALIZED_NAME_EXTERNAL_LOGON_ID = "external_logon_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_LOGON_ID)
  private String externalLogonId;

  public static final String SERIALIZED_NAME_GMT_SIGN = "gmt_sign";
  @SerializedName(SERIALIZED_NAME_GMT_SIGN)
  private String gmtSign;

  public static final String SERIALIZED_NAME_GMT_UNSIGN = "gmt_unsign";
  @SerializedName(SERIALIZED_NAME_GMT_UNSIGN)
  private String gmtUnsign;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_BIZ_TYPE = "out_biz_type";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_TYPE)
  private String outBizType;

  public static final String SERIALIZED_NAME_OUT_SIGN_NO = "out_sign_no";
  @SerializedName(SERIALIZED_NAME_OUT_SIGN_NO)
  private String outSignNo;

  public static final String SERIALIZED_NAME_REST_FREEZE_AMOUNT = "rest_freeze_amount";
  @SerializedName(SERIALIZED_NAME_REST_FREEZE_AMOUNT)
  private String restFreezeAmount;

  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel() { 
  }

  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel agreementName(String agreementName) {
    
    this.agreementName = agreementName;
    return this;
  }

   /**
   * 协议名称
   * @return agreementName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "花呗先享会员", value = "协议名称")

  public String getAgreementName() {
    return agreementName;
  }


  public void setAgreementName(String agreementName) {
    this.agreementName = agreementName;
  }


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员协议号。
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20185513447859192007", value = "支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员协议号。")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel agreementStatus(String agreementStatus) {
    
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


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 支付宝用户userId
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302424419340", value = "支付宝用户userId")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel authScene(String authScene) {
    
    this.authScene = authScene;
    return this;
  }

   /**
   * 花芝轻会员签约场景，商户和支付宝签约时确定，商户接入时需要咨询技术支持。
   * @return authScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXTERNAL_PCARD", value = "花芝轻会员签约场景，商户和支付宝签约时确定，商户接入时需要咨询技术支持。")

  public String getAuthScene() {
    return authScene;
  }


  public void setAuthScene(String authScene) {
    this.authScene = authScene;
  }


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel externalLogonId(String externalLogonId) {
    
    this.externalLogonId = externalLogonId;
    return this;
  }

   /**
   * 用户在商户网站的登录账号
   * @return externalLogonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sample@126.com", value = "用户在商户网站的登录账号")

  public String getExternalLogonId() {
    return externalLogonId;
  }


  public void setExternalLogonId(String externalLogonId) {
    this.externalLogonId = externalLogonId;
  }


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel gmtSign(String gmtSign) {
    
    this.gmtSign = gmtSign;
    return this;
  }

   /**
   * 签约时间。如果是在签状态，返回签约时间。
   * @return gmtSign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-15 11:23:04", value = "签约时间。如果是在签状态，返回签约时间。")

  public String getGmtSign() {
    return gmtSign;
  }


  public void setGmtSign(String gmtSign) {
    this.gmtSign = gmtSign;
  }


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel gmtUnsign(String gmtUnsign) {
    
    this.gmtUnsign = gmtUnsign;
    return this;
  }

   /**
   * 花芝轻会员协议解约时间。如果是解约状态，才返回该字段。
   * @return gmtUnsign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-15 11:23:04", value = "花芝轻会员协议解约时间。如果是解约状态，才返回该字段。")

  public String getGmtUnsign() {
    return gmtUnsign;
  }


  public void setGmtUnsign(String gmtUnsign) {
    this.gmtUnsign = gmtUnsign;
  }


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户userId
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户userId")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel outBizType(String outBizType) {
    
    this.outBizType = outBizType;
    return this;
  }

   /**
   * 外部业务类型，用于区分本次业务交互在商户侧具体的业务类别，提供给商家进行特定逻辑的处理
   * @return outBizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL_BIZ_TYPE", value = "外部业务类型，用于区分本次业务交互在商户侧具体的业务类别，提供给商家进行特定逻辑的处理")

  public String getOutBizType() {
    return outBizType;
  }


  public void setOutBizType(String outBizType) {
    this.outBizType = outBizType;
  }


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel outSignNo(String outSignNo) {
    
    this.outSignNo = outSignNo;
    return this;
  }

   /**
   * 外部签约号，由商户提供，花芝轻会员协议中标识用户的唯一签约号（确保在商户系统中唯一）。由商户签约时传入，最终返回给商户。
   * @return outSignNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018053100073208416400000002", value = "外部签约号，由商户提供，花芝轻会员协议中标识用户的唯一签约号（确保在商户系统中唯一）。由商户签约时传入，最终返回给商户。")

  public String getOutSignNo() {
    return outSignNo;
  }


  public void setOutSignNo(String outSignNo) {
    this.outSignNo = outSignNo;
  }


  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel restFreezeAmount(String restFreezeAmount) {
    
    this.restFreezeAmount = restFreezeAmount;
    return this;
  }

   /**
   * 用户在本花芝轻会员协议中，剩余的总冻结额度（资金池总余额），数值能实时准确，可以用于核对。两位小数，单位元。
   * @return restFreezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200.00", value = "用户在本花芝轻会员协议中，剩余的总冻结额度（资金池总余额），数值能实时准确，可以用于核对。两位小数，单位元。")

  public String getRestFreezeAmount() {
    return restFreezeAmount;
  }


  public void setRestFreezeAmount(String restFreezeAmount) {
    this.restFreezeAmount = restFreezeAmount;
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
   * @return the AlipayPcreditHuabeiAuthAgreementQueryResponseModel instance itself
   */
  public AlipayPcreditHuabeiAuthAgreementQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayPcreditHuabeiAuthAgreementQueryResponseModel alipayPcreditHuabeiAuthAgreementQueryResponseModel = (AlipayPcreditHuabeiAuthAgreementQueryResponseModel) o;
    return Objects.equals(this.agreementName, alipayPcreditHuabeiAuthAgreementQueryResponseModel.agreementName) &&
        Objects.equals(this.agreementNo, alipayPcreditHuabeiAuthAgreementQueryResponseModel.agreementNo) &&
        Objects.equals(this.agreementStatus, alipayPcreditHuabeiAuthAgreementQueryResponseModel.agreementStatus) &&
        Objects.equals(this.alipayUserId, alipayPcreditHuabeiAuthAgreementQueryResponseModel.alipayUserId) &&
        Objects.equals(this.authScene, alipayPcreditHuabeiAuthAgreementQueryResponseModel.authScene) &&
        Objects.equals(this.externalLogonId, alipayPcreditHuabeiAuthAgreementQueryResponseModel.externalLogonId) &&
        Objects.equals(this.gmtSign, alipayPcreditHuabeiAuthAgreementQueryResponseModel.gmtSign) &&
        Objects.equals(this.gmtUnsign, alipayPcreditHuabeiAuthAgreementQueryResponseModel.gmtUnsign) &&
        Objects.equals(this.openId, alipayPcreditHuabeiAuthAgreementQueryResponseModel.openId) &&
        Objects.equals(this.outBizType, alipayPcreditHuabeiAuthAgreementQueryResponseModel.outBizType) &&
        Objects.equals(this.outSignNo, alipayPcreditHuabeiAuthAgreementQueryResponseModel.outSignNo) &&
        Objects.equals(this.restFreezeAmount, alipayPcreditHuabeiAuthAgreementQueryResponseModel.restFreezeAmount)&&
        Objects.equals(this.additionalProperties, alipayPcreditHuabeiAuthAgreementQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementName, agreementNo, agreementStatus, alipayUserId, authScene, externalLogonId, gmtSign, gmtUnsign, openId, outBizType, outSignNo, restFreezeAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPcreditHuabeiAuthAgreementQueryResponseModel {\n");
    sb.append("    agreementName: ").append(toIndentedString(agreementName)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    agreementStatus: ").append(toIndentedString(agreementStatus)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    authScene: ").append(toIndentedString(authScene)).append("\n");
    sb.append("    externalLogonId: ").append(toIndentedString(externalLogonId)).append("\n");
    sb.append("    gmtSign: ").append(toIndentedString(gmtSign)).append("\n");
    sb.append("    gmtUnsign: ").append(toIndentedString(gmtUnsign)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outBizType: ").append(toIndentedString(outBizType)).append("\n");
    sb.append("    outSignNo: ").append(toIndentedString(outSignNo)).append("\n");
    sb.append("    restFreezeAmount: ").append(toIndentedString(restFreezeAmount)).append("\n");
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
    openapiFields.add("agreement_name");
    openapiFields.add("agreement_no");
    openapiFields.add("agreement_status");
    openapiFields.add("alipay_user_id");
    openapiFields.add("auth_scene");
    openapiFields.add("external_logon_id");
    openapiFields.add("gmt_sign");
    openapiFields.add("gmt_unsign");
    openapiFields.add("open_id");
    openapiFields.add("out_biz_type");
    openapiFields.add("out_sign_no");
    openapiFields.add("rest_freeze_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPcreditHuabeiAuthAgreementQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPcreditHuabeiAuthAgreementQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPcreditHuabeiAuthAgreementQueryResponseModel is not found in the empty JSON string", AlipayPcreditHuabeiAuthAgreementQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agreement_name") != null && !jsonObj.get("agreement_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_name").toString()));
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
      if (jsonObj.get("auth_scene") != null && !jsonObj.get("auth_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_scene").toString()));
      }
      if (jsonObj.get("external_logon_id") != null && !jsonObj.get("external_logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_logon_id").toString()));
      }
      if (jsonObj.get("gmt_sign") != null && !jsonObj.get("gmt_sign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_sign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_sign").toString()));
      }
      if (jsonObj.get("gmt_unsign") != null && !jsonObj.get("gmt_unsign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_unsign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_unsign").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_biz_type") != null && !jsonObj.get("out_biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_type").toString()));
      }
      if (jsonObj.get("out_sign_no") != null && !jsonObj.get("out_sign_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_sign_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_sign_no").toString()));
      }
      if (jsonObj.get("rest_freeze_amount") != null && !jsonObj.get("rest_freeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rest_freeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rest_freeze_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPcreditHuabeiAuthAgreementQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPcreditHuabeiAuthAgreementQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPcreditHuabeiAuthAgreementQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPcreditHuabeiAuthAgreementQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPcreditHuabeiAuthAgreementQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayPcreditHuabeiAuthAgreementQueryResponseModel value) throws IOException {
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
           public AlipayPcreditHuabeiAuthAgreementQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayPcreditHuabeiAuthAgreementQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayPcreditHuabeiAuthAgreementQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPcreditHuabeiAuthAgreementQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPcreditHuabeiAuthAgreementQueryResponseModel
  */
  public static AlipayPcreditHuabeiAuthAgreementQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPcreditHuabeiAuthAgreementQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayPcreditHuabeiAuthAgreementQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

