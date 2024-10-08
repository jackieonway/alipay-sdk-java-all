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
import com.alipay.v3.model.UserRiskPrediction;
import com.alipay.v3.model.WaitRepaymentOrderInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AlipayTradeAdvanceConsultResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeAdvanceConsultResponseModel {
  public static final String SERIALIZED_NAME_REFER_RESULT = "refer_result";
  @SerializedName(SERIALIZED_NAME_REFER_RESULT)
  private Boolean referResult;

  public static final String SERIALIZED_NAME_RESULT_CODE = "result_code";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_RESULT_MESSAGE = "result_message";
  @SerializedName(SERIALIZED_NAME_RESULT_MESSAGE)
  private String resultMessage;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private String riskLevel;

  public static final String SERIALIZED_NAME_USER_RISK_PREDICTION = "user_risk_prediction";
  @SerializedName(SERIALIZED_NAME_USER_RISK_PREDICTION)
  private UserRiskPrediction userRiskPrediction;

  public static final String SERIALIZED_NAME_WAIT_REPAYMENT_AMOUNT = "wait_repayment_amount";
  @SerializedName(SERIALIZED_NAME_WAIT_REPAYMENT_AMOUNT)
  private String waitRepaymentAmount;

  public static final String SERIALIZED_NAME_WAIT_REPAYMENT_ORDER_COUNT = "wait_repayment_order_count";
  @SerializedName(SERIALIZED_NAME_WAIT_REPAYMENT_ORDER_COUNT)
  private Integer waitRepaymentOrderCount;

  public static final String SERIALIZED_NAME_WAIT_REPAYMENT_ORDER_INFOS = "wait_repayment_order_infos";
  @SerializedName(SERIALIZED_NAME_WAIT_REPAYMENT_ORDER_INFOS)
  private List<WaitRepaymentOrderInfo> waitRepaymentOrderInfos = null;

  public AlipayTradeAdvanceConsultResponseModel() { 
  }

  public AlipayTradeAdvanceConsultResponseModel referResult(Boolean referResult) {
    
    this.referResult = referResult;
    return this;
  }

   /**
   * true 代表当前时间点，用户允许垫资 false 代表当前时间，用户不允许垫资
   * @return referResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "true 代表当前时间点，用户允许垫资 false 代表当前时间，用户不允许垫资")

  public Boolean getReferResult() {
    return referResult;
  }


  public void setReferResult(Boolean referResult) {
    this.referResult = referResult;
  }


  public AlipayTradeAdvanceConsultResponseModel resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 用户被注销
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USER_NOT_EXIST", value = "用户被注销")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public AlipayTradeAdvanceConsultResponseModel resultMessage(String resultMessage) {
    
    this.resultMessage = resultMessage;
    return this;
  }

   /**
   * 返回用户不准入原因
   * @return resultMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "用户不准入", value = "返回用户不准入原因")

  public String getResultMessage() {
    return resultMessage;
  }


  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }


  public AlipayTradeAdvanceConsultResponseModel riskLevel(String riskLevel) {
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * 订单风险评估等级，在单笔订单风险预评估时返回。当基础风险校验通过时，可通过该值获取业务风险评估等级。取值：2-高风险；1-低风险。
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "订单风险评估等级，在单笔订单风险预评估时返回。当基础风险校验通过时，可通过该值获取业务风险评估等级。取值：2-高风险；1-低风险。")

  public String getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }


  public AlipayTradeAdvanceConsultResponseModel userRiskPrediction(UserRiskPrediction userRiskPrediction) {
    
    this.userRiskPrediction = userRiskPrediction;
    return this;
  }

   /**
   * Get userRiskPrediction
   * @return userRiskPrediction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserRiskPrediction getUserRiskPrediction() {
    return userRiskPrediction;
  }


  public void setUserRiskPrediction(UserRiskPrediction userRiskPrediction) {
    this.userRiskPrediction = userRiskPrediction;
  }


  public AlipayTradeAdvanceConsultResponseModel waitRepaymentAmount(String waitRepaymentAmount) {
    
    this.waitRepaymentAmount = waitRepaymentAmount;
    return this;
  }

   /**
   * 用户剩余的总待还金额，无论当前用户是否允许垫资，都会返回该属性。
   * @return waitRepaymentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.48", value = "用户剩余的总待还金额，无论当前用户是否允许垫资，都会返回该属性。")

  public String getWaitRepaymentAmount() {
    return waitRepaymentAmount;
  }


  public void setWaitRepaymentAmount(String waitRepaymentAmount) {
    this.waitRepaymentAmount = waitRepaymentAmount;
  }


  public AlipayTradeAdvanceConsultResponseModel waitRepaymentOrderCount(Integer waitRepaymentOrderCount) {
    
    this.waitRepaymentOrderCount = waitRepaymentOrderCount;
    return this;
  }

   /**
   * 用户总的未还的垫资笔数，无论用户是否允许垫资，都会返回该属性
   * @return waitRepaymentOrderCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "用户总的未还的垫资笔数，无论用户是否允许垫资，都会返回该属性")

  public Integer getWaitRepaymentOrderCount() {
    return waitRepaymentOrderCount;
  }


  public void setWaitRepaymentOrderCount(Integer waitRepaymentOrderCount) {
    this.waitRepaymentOrderCount = waitRepaymentOrderCount;
  }


  public AlipayTradeAdvanceConsultResponseModel waitRepaymentOrderInfos(List<WaitRepaymentOrderInfo> waitRepaymentOrderInfos) {
    
    this.waitRepaymentOrderInfos = waitRepaymentOrderInfos;
    return this;
  }

  public AlipayTradeAdvanceConsultResponseModel addWaitRepaymentOrderInfosItem(WaitRepaymentOrderInfo waitRepaymentOrderInfosItem) {
    if (this.waitRepaymentOrderInfos == null) {
      this.waitRepaymentOrderInfos = new ArrayList<>();
    }
    this.waitRepaymentOrderInfos.add(waitRepaymentOrderInfosItem);
    return this;
  }

   /**
   * 待还订单列表，无论用户当前状态是否允许垫资，都会返回当前用户在商户下的待还订单信息
   * @return waitRepaymentOrderInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "待还订单列表，无论用户当前状态是否允许垫资，都会返回当前用户在商户下的待还订单信息")

  public List<WaitRepaymentOrderInfo> getWaitRepaymentOrderInfos() {
    return waitRepaymentOrderInfos;
  }


  public void setWaitRepaymentOrderInfos(List<WaitRepaymentOrderInfo> waitRepaymentOrderInfos) {
    this.waitRepaymentOrderInfos = waitRepaymentOrderInfos;
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
   * @return the AlipayTradeAdvanceConsultResponseModel instance itself
   */
  public AlipayTradeAdvanceConsultResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeAdvanceConsultResponseModel alipayTradeAdvanceConsultResponseModel = (AlipayTradeAdvanceConsultResponseModel) o;
    return Objects.equals(this.referResult, alipayTradeAdvanceConsultResponseModel.referResult) &&
        Objects.equals(this.resultCode, alipayTradeAdvanceConsultResponseModel.resultCode) &&
        Objects.equals(this.resultMessage, alipayTradeAdvanceConsultResponseModel.resultMessage) &&
        Objects.equals(this.riskLevel, alipayTradeAdvanceConsultResponseModel.riskLevel) &&
        Objects.equals(this.userRiskPrediction, alipayTradeAdvanceConsultResponseModel.userRiskPrediction) &&
        Objects.equals(this.waitRepaymentAmount, alipayTradeAdvanceConsultResponseModel.waitRepaymentAmount) &&
        Objects.equals(this.waitRepaymentOrderCount, alipayTradeAdvanceConsultResponseModel.waitRepaymentOrderCount) &&
        Objects.equals(this.waitRepaymentOrderInfos, alipayTradeAdvanceConsultResponseModel.waitRepaymentOrderInfos)&&
        Objects.equals(this.additionalProperties, alipayTradeAdvanceConsultResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referResult, resultCode, resultMessage, riskLevel, userRiskPrediction, waitRepaymentAmount, waitRepaymentOrderCount, waitRepaymentOrderInfos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeAdvanceConsultResponseModel {\n");
    sb.append("    referResult: ").append(toIndentedString(referResult)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    userRiskPrediction: ").append(toIndentedString(userRiskPrediction)).append("\n");
    sb.append("    waitRepaymentAmount: ").append(toIndentedString(waitRepaymentAmount)).append("\n");
    sb.append("    waitRepaymentOrderCount: ").append(toIndentedString(waitRepaymentOrderCount)).append("\n");
    sb.append("    waitRepaymentOrderInfos: ").append(toIndentedString(waitRepaymentOrderInfos)).append("\n");
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
    openapiFields.add("refer_result");
    openapiFields.add("result_code");
    openapiFields.add("result_message");
    openapiFields.add("risk_level");
    openapiFields.add("user_risk_prediction");
    openapiFields.add("wait_repayment_amount");
    openapiFields.add("wait_repayment_order_count");
    openapiFields.add("wait_repayment_order_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeAdvanceConsultResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeAdvanceConsultResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeAdvanceConsultResponseModel is not found in the empty JSON string", AlipayTradeAdvanceConsultResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("result_code") != null && !jsonObj.get("result_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_code").toString()));
      }
      if (jsonObj.get("result_message") != null && !jsonObj.get("result_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_message").toString()));
      }
      if (jsonObj.get("risk_level") != null && !jsonObj.get("risk_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `risk_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("risk_level").toString()));
      }
      // validate the optional field `user_risk_prediction`
      if (jsonObj.getAsJsonObject("user_risk_prediction") != null) {
        UserRiskPrediction.validateJsonObject(jsonObj.getAsJsonObject("user_risk_prediction"));
      }
      if (jsonObj.get("wait_repayment_amount") != null && !jsonObj.get("wait_repayment_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wait_repayment_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wait_repayment_amount").toString()));
      }
      JsonArray jsonArraywaitRepaymentOrderInfos = jsonObj.getAsJsonArray("wait_repayment_order_infos");
      if (jsonArraywaitRepaymentOrderInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("wait_repayment_order_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `wait_repayment_order_infos` to be an array in the JSON string but got `%s`", jsonObj.get("wait_repayment_order_infos").toString()));
        }

        // validate the optional field `wait_repayment_order_infos` (array)
        for (int i = 0; i < jsonArraywaitRepaymentOrderInfos.size(); i++) {
          WaitRepaymentOrderInfo.validateJsonObject(jsonArraywaitRepaymentOrderInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeAdvanceConsultResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeAdvanceConsultResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeAdvanceConsultResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeAdvanceConsultResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeAdvanceConsultResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeAdvanceConsultResponseModel value) throws IOException {
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
           public AlipayTradeAdvanceConsultResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeAdvanceConsultResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeAdvanceConsultResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeAdvanceConsultResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeAdvanceConsultResponseModel
  */
  public static AlipayTradeAdvanceConsultResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeAdvanceConsultResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeAdvanceConsultResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

