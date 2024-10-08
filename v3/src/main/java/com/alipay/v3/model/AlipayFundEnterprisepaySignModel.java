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
 * AlipayFundEnterprisepaySignModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundEnterprisepaySignModel {
  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_APPOINT_SIGN_TERMINAL = "appoint_sign_terminal";
  @SerializedName(SERIALIZED_NAME_APPOINT_SIGN_TERMINAL)
  private String appointSignTerminal;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_EXT_PARAMS = "ext_params";
  @SerializedName(SERIALIZED_NAME_EXT_PARAMS)
  private String extParams;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_IDENTITY_NAME = "identity_name";
  @SerializedName(SERIALIZED_NAME_IDENTITY_NAME)
  private String identityName;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_OUT_ENTITY_ID = "out_entity_id";
  @SerializedName(SERIALIZED_NAME_OUT_ENTITY_ID)
  private String outEntityId;

  public static final String SERIALIZED_NAME_OUT_SOURCE = "out_source";
  @SerializedName(SERIALIZED_NAME_OUT_SOURCE)
  private String outSource;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public AlipayFundEnterprisepaySignModel() { 
  }

  public AlipayFundEnterprisepaySignModel accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * 企业简称，传空采用默认规则命名，使用公司名称
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Anonymity", value = "企业简称，传空采用默认规则命名，使用公司名称")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public AlipayFundEnterprisepaySignModel appointSignTerminal(String appointSignTerminal) {
    
    this.appointSignTerminal = appointSignTerminal;
    return this;
  }

   /**
   * 指定签约终端类型 PC-电脑浏览器 MOBILE-手机端
   * @return appointSignTerminal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PC", value = "指定签约终端类型 PC-电脑浏览器 MOBILE-手机端")

  public String getAppointSignTerminal() {
    return appointSignTerminal;
  }


  public void setAppointSignTerminal(String appointSignTerminal) {
    this.appointSignTerminal = appointSignTerminal;
  }


  public AlipayFundEnterprisepaySignModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 业务场景，联系支付宝分配
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "业务场景，联系支付宝分配")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundEnterprisepaySignModel extParams(String extParams) {
    
    this.extParams = extParams;
    return this;
  }

   /**
   * 特殊场景下扩展字段
   * @return extParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"{\\\"key\\\":\\\"value\\\"}\"", value = "特殊场景下扩展字段")

  public String getExtParams() {
    return extParams;
  }


  public void setExtParams(String extParams) {
    this.extParams = extParams;
  }


  public AlipayFundEnterprisepaySignModel identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * 开户账号： 当identity_type是ALIPAY_USER_ID时填支付宝会员ID（2088开头）； 当identity_type是ALIPAY_LOGON_ID 时填支付宝登录号； 当identity_type是OUT_USER_ID时填外部平台的用户uid; 当identity_type是ALIPAY_OPEN_ID时填用户openId
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "name@email.com", value = "开户账号： 当identity_type是ALIPAY_USER_ID时填支付宝会员ID（2088开头）； 当identity_type是ALIPAY_LOGON_ID 时填支付宝登录号； 当identity_type是OUT_USER_ID时填外部平台的用户uid; 当identity_type是ALIPAY_OPEN_ID时填用户openId")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public AlipayFundEnterprisepaySignModel identityName(String identityName) {
    
    this.identityName = identityName;
    return this;
  }

   /**
   * 开户用户名称，identity_type为ALIPAY_LOGON_ID时必填
   * @return identityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "开户用户名称，identity_type为ALIPAY_LOGON_ID时必填")

  public String getIdentityName() {
    return identityName;
  }


  public void setIdentityName(String identityName) {
    this.identityName = identityName;
  }


  public AlipayFundEnterprisepaySignModel identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * 账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式 3、OUT_USER_ID：外部用户uid
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALIPAY_LOGON_ID", value = "账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式 3、OUT_USER_ID：外部用户uid")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public AlipayFundEnterprisepaySignModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 商户侧单号（幂等字段） ，补充说明：幂等逻辑（商户appid+out_biz_no），商户集成时需注意，如换号重复发起，则认为是一笔新的请求
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1650353507572", value = "商户侧单号（幂等字段） ，补充说明：幂等逻辑（商户appid+out_biz_no），商户集成时需注意，如换号重复发起，则认为是一笔新的请求")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayFundEnterprisepaySignModel outEntityId(String outEntityId) {
    
    this.outEntityId = outEntityId;
    return this;
  }

   /**
   * 外部实体ID，一般表述为外部操作人操作某个外部实体。比如企业码2284号
   * @return outEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2488888888", value = "外部实体ID，一般表述为外部操作人操作某个外部实体。比如企业码2284号")

  public String getOutEntityId() {
    return outEntityId;
  }


  public void setOutEntityId(String outEntityId) {
    this.outEntityId = outEntityId;
  }


  public AlipayFundEnterprisepaySignModel outSource(String outSource) {
    
    this.outSource = outSource;
    return this;
  }

   /**
   * ISV平台定义的共同账户开户来源
   * @return outSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DINGDING", value = "ISV平台定义的共同账户开户来源")

  public String getOutSource() {
    return outSource;
  }


  public void setOutSource(String outSource) {
    this.outSource = outSource;
  }


  public AlipayFundEnterprisepaySignModel productCode(String productCode) {
    
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
   * @return the AlipayFundEnterprisepaySignModel instance itself
   */
  public AlipayFundEnterprisepaySignModel putAdditionalProperty(String key, Object value) {
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
    AlipayFundEnterprisepaySignModel alipayFundEnterprisepaySignModel = (AlipayFundEnterprisepaySignModel) o;
    return Objects.equals(this.accountName, alipayFundEnterprisepaySignModel.accountName) &&
        Objects.equals(this.appointSignTerminal, alipayFundEnterprisepaySignModel.appointSignTerminal) &&
        Objects.equals(this.bizScene, alipayFundEnterprisepaySignModel.bizScene) &&
        Objects.equals(this.extParams, alipayFundEnterprisepaySignModel.extParams) &&
        Objects.equals(this.identity, alipayFundEnterprisepaySignModel.identity) &&
        Objects.equals(this.identityName, alipayFundEnterprisepaySignModel.identityName) &&
        Objects.equals(this.identityType, alipayFundEnterprisepaySignModel.identityType) &&
        Objects.equals(this.outBizNo, alipayFundEnterprisepaySignModel.outBizNo) &&
        Objects.equals(this.outEntityId, alipayFundEnterprisepaySignModel.outEntityId) &&
        Objects.equals(this.outSource, alipayFundEnterprisepaySignModel.outSource) &&
        Objects.equals(this.productCode, alipayFundEnterprisepaySignModel.productCode)&&
        Objects.equals(this.additionalProperties, alipayFundEnterprisepaySignModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, appointSignTerminal, bizScene, extParams, identity, identityName, identityType, outBizNo, outEntityId, outSource, productCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundEnterprisepaySignModel {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    appointSignTerminal: ").append(toIndentedString(appointSignTerminal)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    extParams: ").append(toIndentedString(extParams)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    identityName: ").append(toIndentedString(identityName)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    outEntityId: ").append(toIndentedString(outEntityId)).append("\n");
    sb.append("    outSource: ").append(toIndentedString(outSource)).append("\n");
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
    openapiFields.add("account_name");
    openapiFields.add("appoint_sign_terminal");
    openapiFields.add("biz_scene");
    openapiFields.add("ext_params");
    openapiFields.add("identity");
    openapiFields.add("identity_name");
    openapiFields.add("identity_type");
    openapiFields.add("out_biz_no");
    openapiFields.add("out_entity_id");
    openapiFields.add("out_source");
    openapiFields.add("product_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundEnterprisepaySignModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundEnterprisepaySignModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundEnterprisepaySignModel is not found in the empty JSON string", AlipayFundEnterprisepaySignModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_name") != null && !jsonObj.get("account_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_name").toString()));
      }
      if (jsonObj.get("appoint_sign_terminal") != null && !jsonObj.get("appoint_sign_terminal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appoint_sign_terminal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appoint_sign_terminal").toString()));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("ext_params") != null && !jsonObj.get("ext_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_params").toString()));
      }
      if (jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if (jsonObj.get("identity_name") != null && !jsonObj.get("identity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_name").toString()));
      }
      if (jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("out_entity_id") != null && !jsonObj.get("out_entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_entity_id").toString()));
      }
      if (jsonObj.get("out_source") != null && !jsonObj.get("out_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_source").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundEnterprisepaySignModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundEnterprisepaySignModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundEnterprisepaySignModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundEnterprisepaySignModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundEnterprisepaySignModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundEnterprisepaySignModel value) throws IOException {
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
           public AlipayFundEnterprisepaySignModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayFundEnterprisepaySignModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayFundEnterprisepaySignModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundEnterprisepaySignModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundEnterprisepaySignModel
  */
  public static AlipayFundEnterprisepaySignModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundEnterprisepaySignModel.class);
  }

 /**
  * Convert an instance of AlipayFundEnterprisepaySignModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

