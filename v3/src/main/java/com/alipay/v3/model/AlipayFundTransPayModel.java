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
import com.alipay.v3.model.AuthInfo;
import com.alipay.v3.model.Participant;
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
 * AlipayFundTransPayModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundTransPayModel {
  public static final String SERIALIZED_NAME_AUTH_INFO = "auth_info";
  @SerializedName(SERIALIZED_NAME_AUTH_INFO)
  private AuthInfo authInfo;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_BUSINESS_PARAMS = "business_params";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PARAMS)
  private String businessParams;

  public static final String SERIALIZED_NAME_ORDER_TITLE = "order_title";
  @SerializedName(SERIALIZED_NAME_ORDER_TITLE)
  private String orderTitle;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PASSBACK_PARAMS = "passback_params";
  @SerializedName(SERIALIZED_NAME_PASSBACK_PARAMS)
  private String passbackParams;

  public static final String SERIALIZED_NAME_PAYEE_INFO = "payee_info";
  @SerializedName(SERIALIZED_NAME_PAYEE_INFO)
  private Participant payeeInfo;

  public static final String SERIALIZED_NAME_PAYER_INFO = "payer_info";
  @SerializedName(SERIALIZED_NAME_PAYER_INFO)
  private Participant payerInfo;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_REFUND_TIME_EXPIRE = "refund_time_expire";
  @SerializedName(SERIALIZED_NAME_REFUND_TIME_EXPIRE)
  private String refundTimeExpire;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public static final String SERIALIZED_NAME_TIME_EXPIRE = "time_expire";
  @SerializedName(SERIALIZED_NAME_TIME_EXPIRE)
  private String timeExpire;

  public static final String SERIALIZED_NAME_TRANS_AMOUNT = "trans_amount";
  @SerializedName(SERIALIZED_NAME_TRANS_AMOUNT)
  private String transAmount;

  public AlipayFundTransPayModel() { 
  }

  public AlipayFundTransPayModel authInfo(AuthInfo authInfo) {
    
    this.authInfo = authInfo;
    return this;
  }

   /**
   * Get authInfo
   * @return authInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthInfo getAuthInfo() {
    return authInfo;
  }


  public void setAuthInfo(AuthInfo authInfo) {
    this.authInfo = authInfo;
  }


  public AlipayFundTransPayModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 业务场景，比如群收款、红包等
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PARTY_MEMBERSHIP_DUES", value = "业务场景，比如群收款、红包等")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundTransPayModel businessParams(String businessParams) {
    
    this.businessParams = businessParams;
    return this;
  }

   /**
   * JSON格式，传递业务扩展参数，使用前请与支付宝工程师联系！
   * @return businessParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"MERCHANT_PAYER_ID\":\"1234567890\",\"MERCHANT_PAYER_PHONE:\"15012341234\"}", value = "JSON格式，传递业务扩展参数，使用前请与支付宝工程师联系！")

  public String getBusinessParams() {
    return businessParams;
  }


  public void setBusinessParams(String businessParams) {
    this.businessParams = businessParams;
  }


  public AlipayFundTransPayModel orderTitle(String orderTitle) {
    
    this.orderTitle = orderTitle;
    return this;
  }

   /**
   * 订单的标题，用于在收银台和消费记录展示
   * @return orderTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "钉钉红包", value = "订单的标题，用于在收银台和消费记录展示")

  public String getOrderTitle() {
    return orderTitle;
  }


  public void setOrderTitle(String orderTitle) {
    this.orderTitle = orderTitle;
  }


  public AlipayFundTransPayModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 商户端的唯一订单号，对于同一笔转账请求，商户需保证该订单号唯一。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201806300001", value = "商户端的唯一订单号，对于同一笔转账请求，商户需保证该订单号唯一。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayFundTransPayModel passbackParams(String passbackParams) {
    
    this.passbackParams = passbackParams;
    return this;
  }

   /**
   * 回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。
   * @return passbackParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"merchantBizType\":\"peerPay\"}", value = "回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。")

  public String getPassbackParams() {
    return passbackParams;
  }


  public void setPassbackParams(String passbackParams) {
    this.passbackParams = passbackParams;
  }


  public AlipayFundTransPayModel payeeInfo(Participant payeeInfo) {
    
    this.payeeInfo = payeeInfo;
    return this;
  }

   /**
   * Get payeeInfo
   * @return payeeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Participant getPayeeInfo() {
    return payeeInfo;
  }


  public void setPayeeInfo(Participant payeeInfo) {
    this.payeeInfo = payeeInfo;
  }


  public AlipayFundTransPayModel payerInfo(Participant payerInfo) {
    
    this.payerInfo = payerInfo;
    return this;
  }

   /**
   * Get payerInfo
   * @return payerInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Participant getPayerInfo() {
    return payerInfo;
  }


  public void setPayerInfo(Participant payerInfo) {
    this.payerInfo = payerInfo;
  }


  public AlipayFundTransPayModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 销售产品码，商家和支付宝签约的产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STD_APP_TRANSFER", value = "销售产品码，商家和支付宝签约的产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public AlipayFundTransPayModel refundTimeExpire(String refundTimeExpire) {
    
    this.refundTimeExpire = refundTimeExpire;
    return this;
  }

   /**
   * 退款超时时间，格式yyyy-MM-dd HH:mm。到指定时间后，系统会自动触发退款，并原路退回到付款账户。如果指定了退款时间，必须早于销售方案里设置的最晚退款时间。
   * @return refundTimeExpire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-11-08 10:00", value = "退款超时时间，格式yyyy-MM-dd HH:mm。到指定时间后，系统会自动触发退款，并原路退回到付款账户。如果指定了退款时间，必须早于销售方案里设置的最晚退款时间。")

  public String getRefundTimeExpire() {
    return refundTimeExpire;
  }


  public void setRefundTimeExpire(String refundTimeExpire) {
    this.refundTimeExpire = refundTimeExpire;
  }


  public AlipayFundTransPayModel remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 备注
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "报销付款", value = "备注")

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public AlipayFundTransPayModel timeExpire(String timeExpire) {
    
    this.timeExpire = timeExpire;
    return this;
  }

   /**
   * 绝对超时时间，格式为yyyy-MM-dd HH:mm
   * @return timeExpire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-03-23 19:15", value = "绝对超时时间，格式为yyyy-MM-dd HH:mm")

  public String getTimeExpire() {
    return timeExpire;
  }


  public void setTimeExpire(String timeExpire) {
    this.timeExpire = timeExpire;
  }


  public AlipayFundTransPayModel transAmount(String transAmount) {
    
    this.transAmount = transAmount;
    return this;
  }

   /**
   * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
   * @return transAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.88", value = "订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]")

  public String getTransAmount() {
    return transAmount;
  }


  public void setTransAmount(String transAmount) {
    this.transAmount = transAmount;
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
   * @return the AlipayFundTransPayModel instance itself
   */
  public AlipayFundTransPayModel putAdditionalProperty(String key, Object value) {
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
    AlipayFundTransPayModel alipayFundTransPayModel = (AlipayFundTransPayModel) o;
    return Objects.equals(this.authInfo, alipayFundTransPayModel.authInfo) &&
        Objects.equals(this.bizScene, alipayFundTransPayModel.bizScene) &&
        Objects.equals(this.businessParams, alipayFundTransPayModel.businessParams) &&
        Objects.equals(this.orderTitle, alipayFundTransPayModel.orderTitle) &&
        Objects.equals(this.outBizNo, alipayFundTransPayModel.outBizNo) &&
        Objects.equals(this.passbackParams, alipayFundTransPayModel.passbackParams) &&
        Objects.equals(this.payeeInfo, alipayFundTransPayModel.payeeInfo) &&
        Objects.equals(this.payerInfo, alipayFundTransPayModel.payerInfo) &&
        Objects.equals(this.productCode, alipayFundTransPayModel.productCode) &&
        Objects.equals(this.refundTimeExpire, alipayFundTransPayModel.refundTimeExpire) &&
        Objects.equals(this.remark, alipayFundTransPayModel.remark) &&
        Objects.equals(this.timeExpire, alipayFundTransPayModel.timeExpire) &&
        Objects.equals(this.transAmount, alipayFundTransPayModel.transAmount)&&
        Objects.equals(this.additionalProperties, alipayFundTransPayModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authInfo, bizScene, businessParams, orderTitle, outBizNo, passbackParams, payeeInfo, payerInfo, productCode, refundTimeExpire, remark, timeExpire, transAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundTransPayModel {\n");
    sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    businessParams: ").append(toIndentedString(businessParams)).append("\n");
    sb.append("    orderTitle: ").append(toIndentedString(orderTitle)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    passbackParams: ").append(toIndentedString(passbackParams)).append("\n");
    sb.append("    payeeInfo: ").append(toIndentedString(payeeInfo)).append("\n");
    sb.append("    payerInfo: ").append(toIndentedString(payerInfo)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    refundTimeExpire: ").append(toIndentedString(refundTimeExpire)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    timeExpire: ").append(toIndentedString(timeExpire)).append("\n");
    sb.append("    transAmount: ").append(toIndentedString(transAmount)).append("\n");
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
    openapiFields.add("auth_info");
    openapiFields.add("biz_scene");
    openapiFields.add("business_params");
    openapiFields.add("order_title");
    openapiFields.add("out_biz_no");
    openapiFields.add("passback_params");
    openapiFields.add("payee_info");
    openapiFields.add("payer_info");
    openapiFields.add("product_code");
    openapiFields.add("refund_time_expire");
    openapiFields.add("remark");
    openapiFields.add("time_expire");
    openapiFields.add("trans_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundTransPayModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundTransPayModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundTransPayModel is not found in the empty JSON string", AlipayFundTransPayModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `auth_info`
      if (jsonObj.getAsJsonObject("auth_info") != null) {
        AuthInfo.validateJsonObject(jsonObj.getAsJsonObject("auth_info"));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("business_params") != null && !jsonObj.get("business_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_params").toString()));
      }
      if (jsonObj.get("order_title") != null && !jsonObj.get("order_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_title").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("passback_params") != null && !jsonObj.get("passback_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passback_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passback_params").toString()));
      }
      // validate the optional field `payee_info`
      if (jsonObj.getAsJsonObject("payee_info") != null) {
        Participant.validateJsonObject(jsonObj.getAsJsonObject("payee_info"));
      }
      // validate the optional field `payer_info`
      if (jsonObj.getAsJsonObject("payer_info") != null) {
        Participant.validateJsonObject(jsonObj.getAsJsonObject("payer_info"));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("refund_time_expire") != null && !jsonObj.get("refund_time_expire").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_time_expire` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_time_expire").toString()));
      }
      if (jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
      if (jsonObj.get("time_expire") != null && !jsonObj.get("time_expire").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_expire` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_expire").toString()));
      }
      if (jsonObj.get("trans_amount") != null && !jsonObj.get("trans_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundTransPayModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundTransPayModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundTransPayModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundTransPayModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundTransPayModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundTransPayModel value) throws IOException {
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
           public AlipayFundTransPayModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayFundTransPayModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayFundTransPayModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundTransPayModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundTransPayModel
  */
  public static AlipayFundTransPayModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundTransPayModel.class);
  }

 /**
  * Convert an instance of AlipayFundTransPayModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

