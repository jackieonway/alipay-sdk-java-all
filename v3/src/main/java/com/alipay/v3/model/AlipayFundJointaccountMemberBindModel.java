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
import com.alipay.v3.model.IdentityVerifiedInfoDTO;
import com.alipay.v3.model.InviteMemberBusinessParamsDTO;
import com.alipay.v3.model.JointAccountQuotaDTO;
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
 * AlipayFundJointaccountMemberBindModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountMemberBindModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_QUOTA = "account_quota";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_QUOTA)
  private JointAccountQuotaDTO accountQuota;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_AGREEMENT_SIGN_INFO = "agreement_sign_info";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_SIGN_INFO)
  private String agreementSignInfo;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_BUSINESS_PARAMS = "business_params";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PARAMS)
  private InviteMemberBusinessParamsDTO businessParams;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_IDENTITY_VERIFIED_INFO = "identity_verified_info";
  @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFIED_INFO)
  private IdentityVerifiedInfoDTO identityVerifiedInfo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public AlipayFundJointaccountMemberBindModel() { 
  }

  public AlipayFundJointaccountMemberBindModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 账本ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000166406784", value = "账本ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayFundJointaccountMemberBindModel accountQuota(JointAccountQuotaDTO accountQuota) {
    
    this.accountQuota = accountQuota;
    return this;
  }

   /**
   * Get accountQuota
   * @return accountQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JointAccountQuotaDTO getAccountQuota() {
    return accountQuota;
  }


  public void setAccountQuota(JointAccountQuotaDTO accountQuota) {
    this.accountQuota = accountQuota;
  }


  public AlipayFundJointaccountMemberBindModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20214922001380716008", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayFundJointaccountMemberBindModel agreementSignInfo(String agreementSignInfo) {
    
    this.agreementSignInfo = agreementSignInfo;
    return this;
  }

   /**
   * 关联代扣协议签约串
   * @return agreementSignInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipay_sdk%3Dalipay-sdk-java-dynamicVersionNo%26app_id%3D2019072465924554%26biz_content%3D%257B%2522sign_validity_p", value = "关联代扣协议签约串")

  public String getAgreementSignInfo() {
    return agreementSignInfo;
  }


  public void setAgreementSignInfo(String agreementSignInfo) {
    this.agreementSignInfo = agreementSignInfo;
  }


  public AlipayFundJointaccountMemberBindModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 业务场景，联系支付宝分配
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ISV_STANDARD", value = "业务场景，联系支付宝分配")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundJointaccountMemberBindModel businessParams(InviteMemberBusinessParamsDTO businessParams) {
    
    this.businessParams = businessParams;
    return this;
  }

   /**
   * Get businessParams
   * @return businessParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InviteMemberBusinessParamsDTO getBusinessParams() {
    return businessParams;
  }


  public void setBusinessParams(InviteMemberBusinessParamsDTO businessParams) {
    this.businessParams = businessParams;
  }


  public AlipayFundJointaccountMemberBindModel identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * 该字段为被邀请方账号ID： 当identity_type为ALIPAY_USER_ID时，需要填支付宝ID；当identity_type为ALIPAY_LOGON_ID时，需要填支付宝登录号；当identity_type为ALIPAY_OPEN_ID时，需要填支付宝openId
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "name@email.com", value = "该字段为被邀请方账号ID： 当identity_type为ALIPAY_USER_ID时，需要填支付宝ID；当identity_type为ALIPAY_LOGON_ID时，需要填支付宝登录号；当identity_type为ALIPAY_OPEN_ID时，需要填支付宝openId")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public AlipayFundJointaccountMemberBindModel identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * 账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID  2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式 3、ALIPAY_OPEN_ID：支付宝openId
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALIPAY_LOGON_ID", value = "账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID  2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式 3、ALIPAY_OPEN_ID：支付宝openId")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public AlipayFundJointaccountMemberBindModel identityVerifiedInfo(IdentityVerifiedInfoDTO identityVerifiedInfo) {
    
    this.identityVerifiedInfo = identityVerifiedInfo;
    return this;
  }

   /**
   * Get identityVerifiedInfo
   * @return identityVerifiedInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityVerifiedInfoDTO getIdentityVerifiedInfo() {
    return identityVerifiedInfo;
  }


  public void setIdentityVerifiedInfo(IdentityVerifiedInfoDTO identityVerifiedInfo) {
    this.identityVerifiedInfo = identityVerifiedInfo;
  }


  public AlipayFundJointaccountMemberBindModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 成员姓名，账号类型为ALIPAY_LOGON_ID时必填
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "成员姓名，账号类型为ALIPAY_LOGON_ID时必填")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AlipayFundJointaccountMemberBindModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY", value = "产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
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
   * @return the AlipayFundJointaccountMemberBindModel instance itself
   */
  public AlipayFundJointaccountMemberBindModel putAdditionalProperty(String key, Object value) {
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
    AlipayFundJointaccountMemberBindModel alipayFundJointaccountMemberBindModel = (AlipayFundJointaccountMemberBindModel) o;
    return Objects.equals(this.accountId, alipayFundJointaccountMemberBindModel.accountId) &&
        Objects.equals(this.accountQuota, alipayFundJointaccountMemberBindModel.accountQuota) &&
        Objects.equals(this.agreementNo, alipayFundJointaccountMemberBindModel.agreementNo) &&
        Objects.equals(this.agreementSignInfo, alipayFundJointaccountMemberBindModel.agreementSignInfo) &&
        Objects.equals(this.bizScene, alipayFundJointaccountMemberBindModel.bizScene) &&
        Objects.equals(this.businessParams, alipayFundJointaccountMemberBindModel.businessParams) &&
        Objects.equals(this.identity, alipayFundJointaccountMemberBindModel.identity) &&
        Objects.equals(this.identityType, alipayFundJointaccountMemberBindModel.identityType) &&
        Objects.equals(this.identityVerifiedInfo, alipayFundJointaccountMemberBindModel.identityVerifiedInfo) &&
        Objects.equals(this.name, alipayFundJointaccountMemberBindModel.name) &&
        Objects.equals(this.productCode, alipayFundJointaccountMemberBindModel.productCode)&&
        Objects.equals(this.additionalProperties, alipayFundJointaccountMemberBindModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountQuota, agreementNo, agreementSignInfo, bizScene, businessParams, identity, identityType, identityVerifiedInfo, name, productCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountMemberBindModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountQuota: ").append(toIndentedString(accountQuota)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    agreementSignInfo: ").append(toIndentedString(agreementSignInfo)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    businessParams: ").append(toIndentedString(businessParams)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    identityVerifiedInfo: ").append(toIndentedString(identityVerifiedInfo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_quota");
    openapiFields.add("agreement_no");
    openapiFields.add("agreement_sign_info");
    openapiFields.add("biz_scene");
    openapiFields.add("business_params");
    openapiFields.add("identity");
    openapiFields.add("identity_type");
    openapiFields.add("identity_verified_info");
    openapiFields.add("name");
    openapiFields.add("product_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountMemberBindModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountMemberBindModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountMemberBindModel is not found in the empty JSON string", AlipayFundJointaccountMemberBindModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      // validate the optional field `account_quota`
      if (jsonObj.getAsJsonObject("account_quota") != null) {
        JointAccountQuotaDTO.validateJsonObject(jsonObj.getAsJsonObject("account_quota"));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("agreement_sign_info") != null && !jsonObj.get("agreement_sign_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_sign_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_sign_info").toString()));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      // validate the optional field `business_params`
      if (jsonObj.getAsJsonObject("business_params") != null) {
        InviteMemberBusinessParamsDTO.validateJsonObject(jsonObj.getAsJsonObject("business_params"));
      }
      if (jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if (jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      // validate the optional field `identity_verified_info`
      if (jsonObj.getAsJsonObject("identity_verified_info") != null) {
        IdentityVerifiedInfoDTO.validateJsonObject(jsonObj.getAsJsonObject("identity_verified_info"));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountMemberBindModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountMemberBindModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountMemberBindModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountMemberBindModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountMemberBindModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountMemberBindModel value) throws IOException {
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
           public AlipayFundJointaccountMemberBindModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayFundJointaccountMemberBindModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayFundJointaccountMemberBindModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountMemberBindModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountMemberBindModel
  */
  public static AlipayFundJointaccountMemberBindModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountMemberBindModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountMemberBindModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

