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
 * AlipayCommerceEcEnterpriseCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcEnterpriseCreateModel {
  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_CREATE_FUND_ACCOUNT = "create_fund_account";
  @SerializedName(SERIALIZED_NAME_CREATE_FUND_ACCOUNT)
  private Boolean createFundAccount;

  public static final String SERIALIZED_NAME_CREATE_IOT_GROUP = "create_iot_group";
  @SerializedName(SERIALIZED_NAME_CREATE_IOT_GROUP)
  private Boolean createIotGroup;

  public static final String SERIALIZED_NAME_ENTERPRISE_ALIAS = "enterprise_alias";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ALIAS)
  private String enterpriseAlias;

  public static final String SERIALIZED_NAME_ENTERPRISE_NAME = "enterprise_name";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_NAME)
  private String enterpriseName;

  public static final String SERIALIZED_NAME_GROUP_APP_ID = "group_app_id";
  @SerializedName(SERIALIZED_NAME_GROUP_APP_ID)
  private String groupAppId;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_IDENTITY_NAME = "identity_name";
  @SerializedName(SERIALIZED_NAME_IDENTITY_NAME)
  private String identityName;

  public static final String SERIALIZED_NAME_IDENTITY_OPEN_ID = "identity_open_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_OPEN_ID)
  private String identityOpenId;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_SIGN_RETURN_URL = "sign_return_url";
  @SerializedName(SERIALIZED_NAME_SIGN_RETURN_URL)
  private String signReturnUrl;

  public static final String SERIALIZED_NAME_SIGN_TERMINAL = "sign_terminal";
  @SerializedName(SERIALIZED_NAME_SIGN_TERMINAL)
  private String signTerminal;

  public AlipayCommerceEcEnterpriseCreateModel() { 
  }

  public AlipayCommerceEcEnterpriseCreateModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 用于区分资金因公付协议、以及收银台文案等差异；
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ISV_QYM", value = "用于区分资金因公付协议、以及收银台文案等差异；")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayCommerceEcEnterpriseCreateModel createFundAccount(Boolean createFundAccount) {
    
    this.createFundAccount = createFundAccount;
    return this;
  }

   /**
   * 是否设置管理员支付宝为企业出资账户
   * @return createFundAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否设置管理员支付宝为企业出资账户")

  public Boolean getCreateFundAccount() {
    return createFundAccount;
  }


  public void setCreateFundAccount(Boolean createFundAccount) {
    this.createFundAccount = createFundAccount;
  }


  public AlipayCommerceEcEnterpriseCreateModel createIotGroup(Boolean createIotGroup) {
    
    this.createIotGroup = createIotGroup;
    return this;
  }

   /**
   * 是否创建企业人脸库，适用于对接团餐刷脸付、门禁刷脸通行等场景
   * @return createIotGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否创建企业人脸库，适用于对接团餐刷脸付、门禁刷脸通行等场景")

  public Boolean getCreateIotGroup() {
    return createIotGroup;
  }


  public void setCreateIotGroup(Boolean createIotGroup) {
    this.createIotGroup = createIotGroup;
  }


  public AlipayCommerceEcEnterpriseCreateModel enterpriseAlias(String enterpriseAlias) {
    
    this.enterpriseAlias = enterpriseAlias;
    return this;
  }

   /**
   * 企业简称
   * @return enterpriseAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "企业码测试", value = "企业简称")

  public String getEnterpriseAlias() {
    return enterpriseAlias;
  }


  public void setEnterpriseAlias(String enterpriseAlias) {
    this.enterpriseAlias = enterpriseAlias;
  }


  public AlipayCommerceEcEnterpriseCreateModel enterpriseName(String enterpriseName) {
    
    this.enterpriseName = enterpriseName;
    return this;
  }

   /**
   * 企业名称
   * @return enterpriseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "企业码测试有限公司", value = "企业名称")

  public String getEnterpriseName() {
    return enterpriseName;
  }


  public void setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }


  public AlipayCommerceEcEnterpriseCreateModel groupAppId(String groupAppId) {
    
    this.groupAppId = groupAppId;
    return this;
  }

   /**
   * 订购【一脸通行开通插件】的小程序appId
   * @return groupAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001188888888", value = "订购【一脸通行开通插件】的小程序appId")

  public String getGroupAppId() {
    return groupAppId;
  }


  public void setGroupAppId(String groupAppId) {
    this.groupAppId = groupAppId;
  }


  public AlipayCommerceEcEnterpriseCreateModel identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * 管理员身份标识
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088501412314698", value = "管理员身份标识")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public AlipayCommerceEcEnterpriseCreateModel identityName(String identityName) {
    
    this.identityName = identityName;
    return this;
  }

   /**
   * 管理员姓名
   * @return identityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "管理员姓名")

  public String getIdentityName() {
    return identityName;
  }


  public void setIdentityName(String identityName) {
    this.identityName = identityName;
  }


  public AlipayCommerceEcEnterpriseCreateModel identityOpenId(String identityOpenId) {
    
    this.identityOpenId = identityOpenId;
    return this;
  }

   /**
   * 管理员身份openId
   * @return identityOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "管理员身份openId")

  public String getIdentityOpenId() {
    return identityOpenId;
  }


  public void setIdentityOpenId(String identityOpenId) {
    this.identityOpenId = identityOpenId;
  }


  public AlipayCommerceEcEnterpriseCreateModel identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * 管理员身份类型
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALIPAY_USER_ID", value = "管理员身份类型")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public AlipayCommerceEcEnterpriseCreateModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28839390030030", value = "外部业务号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayCommerceEcEnterpriseCreateModel signReturnUrl(String signReturnUrl) {
    
    this.signReturnUrl = signReturnUrl;
    return this;
  }

   /**
   * 企业码签约后回跳地址。不传默认为空，签约后停留在当前页。
   * @return signReturnUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.alipay.com", value = "企业码签约后回跳地址。不传默认为空，签约后停留在当前页。")

  public String getSignReturnUrl() {
    return signReturnUrl;
  }


  public void setSignReturnUrl(String signReturnUrl) {
    this.signReturnUrl = signReturnUrl;
  }


  public AlipayCommerceEcEnterpriseCreateModel signTerminal(String signTerminal) {
    
    this.signTerminal = signTerminal;
    return this;
  }

   /**
   * 管理员签约终端类型(字段已废弃，不需要服务商传入)
   * @return signTerminal
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PC", value = "管理员签约终端类型(字段已废弃，不需要服务商传入)")

  public String getSignTerminal() {
    return signTerminal;
  }


  public void setSignTerminal(String signTerminal) {
    this.signTerminal = signTerminal;
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
   * @return the AlipayCommerceEcEnterpriseCreateModel instance itself
   */
  public AlipayCommerceEcEnterpriseCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceEcEnterpriseCreateModel alipayCommerceEcEnterpriseCreateModel = (AlipayCommerceEcEnterpriseCreateModel) o;
    return Objects.equals(this.bizScene, alipayCommerceEcEnterpriseCreateModel.bizScene) &&
        Objects.equals(this.createFundAccount, alipayCommerceEcEnterpriseCreateModel.createFundAccount) &&
        Objects.equals(this.createIotGroup, alipayCommerceEcEnterpriseCreateModel.createIotGroup) &&
        Objects.equals(this.enterpriseAlias, alipayCommerceEcEnterpriseCreateModel.enterpriseAlias) &&
        Objects.equals(this.enterpriseName, alipayCommerceEcEnterpriseCreateModel.enterpriseName) &&
        Objects.equals(this.groupAppId, alipayCommerceEcEnterpriseCreateModel.groupAppId) &&
        Objects.equals(this.identity, alipayCommerceEcEnterpriseCreateModel.identity) &&
        Objects.equals(this.identityName, alipayCommerceEcEnterpriseCreateModel.identityName) &&
        Objects.equals(this.identityOpenId, alipayCommerceEcEnterpriseCreateModel.identityOpenId) &&
        Objects.equals(this.identityType, alipayCommerceEcEnterpriseCreateModel.identityType) &&
        Objects.equals(this.outBizNo, alipayCommerceEcEnterpriseCreateModel.outBizNo) &&
        Objects.equals(this.signReturnUrl, alipayCommerceEcEnterpriseCreateModel.signReturnUrl) &&
        Objects.equals(this.signTerminal, alipayCommerceEcEnterpriseCreateModel.signTerminal)&&
        Objects.equals(this.additionalProperties, alipayCommerceEcEnterpriseCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizScene, createFundAccount, createIotGroup, enterpriseAlias, enterpriseName, groupAppId, identity, identityName, identityOpenId, identityType, outBizNo, signReturnUrl, signTerminal, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcEnterpriseCreateModel {\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    createFundAccount: ").append(toIndentedString(createFundAccount)).append("\n");
    sb.append("    createIotGroup: ").append(toIndentedString(createIotGroup)).append("\n");
    sb.append("    enterpriseAlias: ").append(toIndentedString(enterpriseAlias)).append("\n");
    sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
    sb.append("    groupAppId: ").append(toIndentedString(groupAppId)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    identityName: ").append(toIndentedString(identityName)).append("\n");
    sb.append("    identityOpenId: ").append(toIndentedString(identityOpenId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    signReturnUrl: ").append(toIndentedString(signReturnUrl)).append("\n");
    sb.append("    signTerminal: ").append(toIndentedString(signTerminal)).append("\n");
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
    openapiFields.add("biz_scene");
    openapiFields.add("create_fund_account");
    openapiFields.add("create_iot_group");
    openapiFields.add("enterprise_alias");
    openapiFields.add("enterprise_name");
    openapiFields.add("group_app_id");
    openapiFields.add("identity");
    openapiFields.add("identity_name");
    openapiFields.add("identity_open_id");
    openapiFields.add("identity_type");
    openapiFields.add("out_biz_no");
    openapiFields.add("sign_return_url");
    openapiFields.add("sign_terminal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcEnterpriseCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcEnterpriseCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcEnterpriseCreateModel is not found in the empty JSON string", AlipayCommerceEcEnterpriseCreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("enterprise_alias") != null && !jsonObj.get("enterprise_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_alias").toString()));
      }
      if (jsonObj.get("enterprise_name") != null && !jsonObj.get("enterprise_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_name").toString()));
      }
      if (jsonObj.get("group_app_id") != null && !jsonObj.get("group_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_app_id").toString()));
      }
      if (jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if (jsonObj.get("identity_name") != null && !jsonObj.get("identity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_name").toString()));
      }
      if (jsonObj.get("identity_open_id") != null && !jsonObj.get("identity_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_open_id").toString()));
      }
      if (jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("sign_return_url") != null && !jsonObj.get("sign_return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_return_url").toString()));
      }
      if (jsonObj.get("sign_terminal") != null && !jsonObj.get("sign_terminal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_terminal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_terminal").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcEnterpriseCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcEnterpriseCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcEnterpriseCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcEnterpriseCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcEnterpriseCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcEnterpriseCreateModel value) throws IOException {
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
           public AlipayCommerceEcEnterpriseCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceEcEnterpriseCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceEcEnterpriseCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcEnterpriseCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcEnterpriseCreateModel
  */
  public static AlipayCommerceEcEnterpriseCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcEnterpriseCreateModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcEnterpriseCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

