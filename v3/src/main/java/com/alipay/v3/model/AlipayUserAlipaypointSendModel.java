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
 * AlipayUserAlipaypointSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserAlipaypointSendModel {
  public static final String SERIALIZED_NAME_BUDGET_CODE = "budget_code";
  @SerializedName(SERIALIZED_NAME_BUDGET_CODE)
  private String budgetCode;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_PARTNER_BIZ_NO = "partner_biz_no";
  @SerializedName(SERIALIZED_NAME_PARTNER_BIZ_NO)
  private String partnerBizNo;

  public static final String SERIALIZED_NAME_POINT_AMOUNT = "point_amount";
  @SerializedName(SERIALIZED_NAME_POINT_AMOUNT)
  private Integer pointAmount;

  public static final String SERIALIZED_NAME_USER_ACCOUNT = "user_account";
  @SerializedName(SERIALIZED_NAME_USER_ACCOUNT)
  private String userAccount;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayUserAlipaypointSendModel() { 
  }

  public AlipayUserAlipaypointSendModel budgetCode(String budgetCode) {
    
    this.budgetCode = budgetCode;
    return this;
  }

   /**
   * 签约商户的集分宝的预算库，扣除此预算库的集分宝发放给用户。会校验budgetcode和业务方appId的签约商户pid的关联关系，若无关则发放失败。
   * @return budgetCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02559A591572", value = "签约商户的集分宝的预算库，扣除此预算库的集分宝发放给用户。会校验budgetcode和业务方appId的签约商户pid的关联关系，若无关则发放失败。")

  public String getBudgetCode() {
    return budgetCode;
  }


  public void setBudgetCode(String budgetCode) {
    this.budgetCode = budgetCode;
  }


  public AlipayUserAlipaypointSendModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 商户关于该笔发放的描述或者信息补充，仅存储，无实际校验功能，该信息会在\&quot;集分宝\&quot;小程序的\&quot;集分宝明细\&quot;中展示给用户。
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商户小程序签到送集分宝", value = "商户关于该笔发放的描述或者信息补充，仅存储，无实际校验功能，该信息会在\"集分宝\"小程序的\"集分宝明细\"中展示给用户。")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayUserAlipaypointSendModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 被发放集分宝用户ID，商户app_id维度下的用户标识，与user_account字段二选一。 建议优先使该字段指定发放用户，接口性能更佳
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "被发放集分宝用户ID，商户app_id维度下的用户标识，与user_account字段二选一。 建议优先使该字段指定发放用户，接口性能更佳")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayUserAlipaypointSendModel partnerBizNo(String partnerBizNo) {
    
    this.partnerBizNo = partnerBizNo;
    return this;
  }

   /**
   * 接入方自己交易的唯一流水ID号，不同交易请保证幂等号唯一性，集分宝服务将依据该字段来进行幂等控制，重试请求不要更换幂等号，需要慎重传递，否则可能会造成损失。
   * @return partnerBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "011022222222212", value = "接入方自己交易的唯一流水ID号，不同交易请保证幂等号唯一性，集分宝服务将依据该字段来进行幂等控制，重试请求不要更换幂等号，需要慎重传递，否则可能会造成损失。")

  public String getPartnerBizNo() {
    return partnerBizNo;
  }


  public void setPartnerBizNo(String partnerBizNo) {
    this.partnerBizNo = partnerBizNo;
  }


  public AlipayUserAlipaypointSendModel pointAmount(Integer pointAmount) {
    
    this.pointAmount = pointAmount;
    return this;
  }

   /**
   * 发放给用户的集分宝个数。个数区间为 [1,10000000]，需为整数。
   * @return pointAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "发放给用户的集分宝个数。个数区间为 [1,10000000]，需为整数。")

  public Integer getPointAmount() {
    return pointAmount;
  }


  public void setPointAmount(Integer pointAmount) {
    this.pointAmount = pointAmount;
  }


  public AlipayUserAlipaypointSendModel userAccount(String userAccount) {
    
    this.userAccount = userAccount;
    return this;
  }

   /**
   * 被发放集分宝用户的支付宝登录号，邮箱地址或者手机号均可，与user_id字段二选一，在有user_id时，优先使用user_id字段。
   * @return userAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user_logon_id@test.com/1860000001", value = "被发放集分宝用户的支付宝登录号，邮箱地址或者手机号均可，与user_id字段二选一，在有user_id时，优先使用user_id字段。")

  public String getUserAccount() {
    return userAccount;
  }


  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }


  public AlipayUserAlipaypointSendModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 被发放集分宝用户的蚂蚁统一会员ID，与user_account字段二选一。 建议优先使用user_id，接口性能更佳，user_id和user_account都传递时，系统优先使用本字段。
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000000001", value = "被发放集分宝用户的蚂蚁统一会员ID，与user_account字段二选一。 建议优先使用user_id，接口性能更佳，user_id和user_account都传递时，系统优先使用本字段。")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
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
   * @return the AlipayUserAlipaypointSendModel instance itself
   */
  public AlipayUserAlipaypointSendModel putAdditionalProperty(String key, Object value) {
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
    AlipayUserAlipaypointSendModel alipayUserAlipaypointSendModel = (AlipayUserAlipaypointSendModel) o;
    return Objects.equals(this.budgetCode, alipayUserAlipaypointSendModel.budgetCode) &&
        Objects.equals(this.memo, alipayUserAlipaypointSendModel.memo) &&
        Objects.equals(this.openId, alipayUserAlipaypointSendModel.openId) &&
        Objects.equals(this.partnerBizNo, alipayUserAlipaypointSendModel.partnerBizNo) &&
        Objects.equals(this.pointAmount, alipayUserAlipaypointSendModel.pointAmount) &&
        Objects.equals(this.userAccount, alipayUserAlipaypointSendModel.userAccount) &&
        Objects.equals(this.userId, alipayUserAlipaypointSendModel.userId)&&
        Objects.equals(this.additionalProperties, alipayUserAlipaypointSendModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetCode, memo, openId, partnerBizNo, pointAmount, userAccount, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserAlipaypointSendModel {\n");
    sb.append("    budgetCode: ").append(toIndentedString(budgetCode)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    partnerBizNo: ").append(toIndentedString(partnerBizNo)).append("\n");
    sb.append("    pointAmount: ").append(toIndentedString(pointAmount)).append("\n");
    sb.append("    userAccount: ").append(toIndentedString(userAccount)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("budget_code");
    openapiFields.add("memo");
    openapiFields.add("open_id");
    openapiFields.add("partner_biz_no");
    openapiFields.add("point_amount");
    openapiFields.add("user_account");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserAlipaypointSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserAlipaypointSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserAlipaypointSendModel is not found in the empty JSON string", AlipayUserAlipaypointSendModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("budget_code") != null && !jsonObj.get("budget_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budget_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budget_code").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("partner_biz_no") != null && !jsonObj.get("partner_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_biz_no").toString()));
      }
      if (jsonObj.get("user_account") != null && !jsonObj.get("user_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_account").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserAlipaypointSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserAlipaypointSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserAlipaypointSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserAlipaypointSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserAlipaypointSendModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserAlipaypointSendModel value) throws IOException {
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
           public AlipayUserAlipaypointSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayUserAlipaypointSendModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayUserAlipaypointSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserAlipaypointSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserAlipaypointSendModel
  */
  public static AlipayUserAlipaypointSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserAlipaypointSendModel.class);
  }

 /**
  * Convert an instance of AlipayUserAlipaypointSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

