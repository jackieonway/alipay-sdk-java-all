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
 * AlipayEbppPdeductSignCancelModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppPdeductSignCancelModel {
  public static final String SERIALIZED_NAME_AGENT_CHANNEL = "agent_channel";
  @SerializedName(SERIALIZED_NAME_AGENT_CHANNEL)
  private String agentChannel;

  public static final String SERIALIZED_NAME_AGENT_CODE = "agent_code";
  @SerializedName(SERIALIZED_NAME_AGENT_CODE)
  private String agentCode;

  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_PAY_PASSWORD_TOKEN = "pay_password_token";
  @SerializedName(SERIALIZED_NAME_PAY_PASSWORD_TOKEN)
  private String payPasswordToken;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayEbppPdeductSignCancelModel() { 
  }

  public AlipayEbppPdeductSignCancelModel agentChannel(String agentChannel) {
    
    this.agentChannel = agentChannel;
    return this;
  }

   /**
   * 此值只是供代扣中心做最后的渠道统计用，并不做值是什么的强校验，只要不为空就可以
   * @return agentChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "操作来源  PUBLICPLATFORM：服务窗", value = "此值只是供代扣中心做最后的渠道统计用，并不做值是什么的强校验，只要不为空就可以")

  public String getAgentChannel() {
    return agentChannel;
  }


  public void setAgentChannel(String agentChannel) {
    this.agentChannel = agentChannel;
  }


  public AlipayEbppPdeductSignCancelModel agentCode(String agentCode) {
    
    this.agentCode = agentCode;
    return this;
  }

   /**
   * 标识发起方的ID，从服务窗发起则为appId的值，appId即开放平台分配给接入ISV的id，此处也可以随便真其它值，只要能标识唯一即可
   * @return agentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201603012984123", value = "标识发起方的ID，从服务窗发起则为appId的值，appId即开放平台分配给接入ISV的id，此处也可以随便真其它值，只要能标识唯一即可")

  public String getAgentCode() {
    return agentCode;
  }


  public void setAgentCode(String agentCode) {
    this.agentCode = agentCode;
  }


  public AlipayEbppPdeductSignCancelModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 支付宝代扣协议ID
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160512331244123124421", value = "支付宝代扣协议ID")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public AlipayEbppPdeductSignCancelModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户UserId在应用AppId下的唯一用户标识
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "用户UserId在应用AppId下的唯一用户标识")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayEbppPdeductSignCancelModel payPasswordToken(String payPasswordToken) {
    
    this.payPasswordToken = payPasswordToken;
    return this;
  }

   /**
   * 需要用户首先处于登陆态，然后访问https://ebppprod.alipay.com/deduct/enterMobileicPayPassword.htm?cb&#x3D;自己指定的回跳连接地址,访问页面后会进到独立密码校验页，用户输入密码校验成功后，会生成token回调到指定的回跳地址，如果设置cb&#x3D;www.baidu.com则最后回调的内容是www.baidu.com?token&#x3D;312314ADFDSFAS,然后签约时直接取得地址后token的值即可
   * @return payPasswordToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11505a6f41688644a4b85f9bf80ef071", value = "需要用户首先处于登陆态，然后访问https://ebppprod.alipay.com/deduct/enterMobileicPayPassword.htm?cb=自己指定的回跳连接地址,访问页面后会进到独立密码校验页，用户输入密码校验成功后，会生成token回调到指定的回跳地址，如果设置cb=www.baidu.com则最后回调的内容是www.baidu.com?token=312314ADFDSFAS,然后签约时直接取得地址后token的值即可")

  public String getPayPasswordToken() {
    return payPasswordToken;
  }


  public void setPayPasswordToken(String payPasswordToken) {
    this.payPasswordToken = payPasswordToken;
  }


  public AlipayEbppPdeductSignCancelModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123411112222", value = "用户ID")

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
   * @return the AlipayEbppPdeductSignCancelModel instance itself
   */
  public AlipayEbppPdeductSignCancelModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppPdeductSignCancelModel alipayEbppPdeductSignCancelModel = (AlipayEbppPdeductSignCancelModel) o;
    return Objects.equals(this.agentChannel, alipayEbppPdeductSignCancelModel.agentChannel) &&
        Objects.equals(this.agentCode, alipayEbppPdeductSignCancelModel.agentCode) &&
        Objects.equals(this.agreementId, alipayEbppPdeductSignCancelModel.agreementId) &&
        Objects.equals(this.openId, alipayEbppPdeductSignCancelModel.openId) &&
        Objects.equals(this.payPasswordToken, alipayEbppPdeductSignCancelModel.payPasswordToken) &&
        Objects.equals(this.userId, alipayEbppPdeductSignCancelModel.userId)&&
        Objects.equals(this.additionalProperties, alipayEbppPdeductSignCancelModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentChannel, agentCode, agreementId, openId, payPasswordToken, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppPdeductSignCancelModel {\n");
    sb.append("    agentChannel: ").append(toIndentedString(agentChannel)).append("\n");
    sb.append("    agentCode: ").append(toIndentedString(agentCode)).append("\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    payPasswordToken: ").append(toIndentedString(payPasswordToken)).append("\n");
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
    openapiFields.add("agent_channel");
    openapiFields.add("agent_code");
    openapiFields.add("agreement_id");
    openapiFields.add("open_id");
    openapiFields.add("pay_password_token");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppPdeductSignCancelModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppPdeductSignCancelModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppPdeductSignCancelModel is not found in the empty JSON string", AlipayEbppPdeductSignCancelModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agent_channel") != null && !jsonObj.get("agent_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_channel").toString()));
      }
      if (jsonObj.get("agent_code") != null && !jsonObj.get("agent_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_code").toString()));
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("pay_password_token") != null && !jsonObj.get("pay_password_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_password_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_password_token").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppPdeductSignCancelModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppPdeductSignCancelModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppPdeductSignCancelModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppPdeductSignCancelModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppPdeductSignCancelModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppPdeductSignCancelModel value) throws IOException {
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
           public AlipayEbppPdeductSignCancelModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppPdeductSignCancelModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppPdeductSignCancelModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppPdeductSignCancelModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppPdeductSignCancelModel
  */
  public static AlipayEbppPdeductSignCancelModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppPdeductSignCancelModel.class);
  }

 /**
  * Convert an instance of AlipayEbppPdeductSignCancelModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

