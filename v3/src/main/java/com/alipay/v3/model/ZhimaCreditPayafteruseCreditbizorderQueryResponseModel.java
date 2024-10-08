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
 * ZhimaCreditPayafteruseCreditbizorderQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPayafteruseCreditbizorderQueryResponseModel {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_CREDIT_AGREEMENT_ID = "credit_agreement_id";
  @SerializedName(SERIALIZED_NAME_CREDIT_AGREEMENT_ID)
  private String creditAgreementId;

  public static final String SERIALIZED_NAME_CREDIT_BIZ_ORDER_ID = "credit_biz_order_id";
  @SerializedName(SERIALIZED_NAME_CREDIT_BIZ_ORDER_ID)
  private String creditBizOrderId;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public static final String SERIALIZED_NAME_ZM_SERVICE_ID = "zm_service_id";
  @SerializedName(SERIALIZED_NAME_ZM_SERVICE_ID)
  private String zmServiceId;

  public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel() { 
  }

  public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 订单创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-09-15 11:23:04", value = "订单创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel creditAgreementId(String creditAgreementId) {
    
    this.creditAgreementId = creditAgreementId;
    return this;
  }

   /**
   * 芝麻开通协议号
   * @return creditAgreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMOP2014070700166653", value = "芝麻开通协议号")

  public String getCreditAgreementId() {
    return creditAgreementId;
  }


  public void setCreditAgreementId(String creditAgreementId) {
    this.creditAgreementId = creditAgreementId;
  }


  public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel creditBizOrderId(String creditBizOrderId) {
    
    this.creditBizOrderId = creditBizOrderId;
    return this;
  }

   /**
   * 信用服务订单号
   * @return creditBizOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMCB20201021200102012", value = "信用服务订单号")

  public String getCreditBizOrderId() {
    return creditBizOrderId;
  }


  public void setCreditBizOrderId(String creditBizOrderId) {
    this.creditBizOrderId = creditBizOrderId;
  }


  public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel orderStatus(String orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * 信用服务订单状态，区分不同产品： （1）针对产品「先用后付」，涉及状态如下：INIT: 下单状态；TRADE_CLOSED: 订单取消或者交易全额退款； TRADE_FINISHED：扣款成功状态。  （2）针对产品「芝麻风险评估与召回」，状态定义如下： [INIT: 下单状态]；[WAIT_FULFILL：待守约]；[OVERDUE：已逾期]；[TRADE_FINISHED:已守约]； [TRADE_CLOSED：已取消]。
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INIT", value = "信用服务订单状态，区分不同产品： （1）针对产品「先用后付」，涉及状态如下：INIT: 下单状态；TRADE_CLOSED: 订单取消或者交易全额退款； TRADE_FINISHED：扣款成功状态。  （2）针对产品「芝麻风险评估与召回」，状态定义如下： [INIT: 下单状态]；[WAIT_FULFILL：待守约]；[OVERDUE：已逾期]；[TRADE_FINISHED:已守约]； [TRADE_CLOSED：已取消]。")

  public String getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "w1040100001000010020", value = "产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 信用服务订单金额
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "88.88", value = "信用服务订单金额")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号。 先用后付产品下必传；芝麻风险评估与召回产品下不传。
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021030422001428451400037476", value = "支付宝交易号。 先用后付产品下必传；芝麻风险评估与召回产品下不传。")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }


  public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel zmServiceId(String zmServiceId) {
    
    this.zmServiceId = zmServiceId;
    return this;
  }

   /**
   * 芝麻信用服务ID
   * @return zmServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020050722001440031000061082", value = "芝麻信用服务ID")

  public String getZmServiceId() {
    return zmServiceId;
  }


  public void setZmServiceId(String zmServiceId) {
    this.zmServiceId = zmServiceId;
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
   * @return the ZhimaCreditPayafteruseCreditbizorderQueryResponseModel instance itself
   */
  public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    ZhimaCreditPayafteruseCreditbizorderQueryResponseModel zhimaCreditPayafteruseCreditbizorderQueryResponseModel = (ZhimaCreditPayafteruseCreditbizorderQueryResponseModel) o;
    return Objects.equals(this.createTime, zhimaCreditPayafteruseCreditbizorderQueryResponseModel.createTime) &&
        Objects.equals(this.creditAgreementId, zhimaCreditPayafteruseCreditbizorderQueryResponseModel.creditAgreementId) &&
        Objects.equals(this.creditBizOrderId, zhimaCreditPayafteruseCreditbizorderQueryResponseModel.creditBizOrderId) &&
        Objects.equals(this.orderStatus, zhimaCreditPayafteruseCreditbizorderQueryResponseModel.orderStatus) &&
        Objects.equals(this.productCode, zhimaCreditPayafteruseCreditbizorderQueryResponseModel.productCode) &&
        Objects.equals(this.totalAmount, zhimaCreditPayafteruseCreditbizorderQueryResponseModel.totalAmount) &&
        Objects.equals(this.tradeNo, zhimaCreditPayafteruseCreditbizorderQueryResponseModel.tradeNo) &&
        Objects.equals(this.zmServiceId, zhimaCreditPayafteruseCreditbizorderQueryResponseModel.zmServiceId)&&
        Objects.equals(this.additionalProperties, zhimaCreditPayafteruseCreditbizorderQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, creditAgreementId, creditBizOrderId, orderStatus, productCode, totalAmount, tradeNo, zmServiceId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPayafteruseCreditbizorderQueryResponseModel {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creditAgreementId: ").append(toIndentedString(creditAgreementId)).append("\n");
    sb.append("    creditBizOrderId: ").append(toIndentedString(creditBizOrderId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
    sb.append("    zmServiceId: ").append(toIndentedString(zmServiceId)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("credit_agreement_id");
    openapiFields.add("credit_biz_order_id");
    openapiFields.add("order_status");
    openapiFields.add("product_code");
    openapiFields.add("total_amount");
    openapiFields.add("trade_no");
    openapiFields.add("zm_service_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPayafteruseCreditbizorderQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPayafteruseCreditbizorderQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPayafteruseCreditbizorderQueryResponseModel is not found in the empty JSON string", ZhimaCreditPayafteruseCreditbizorderQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("credit_agreement_id") != null && !jsonObj.get("credit_agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_agreement_id").toString()));
      }
      if (jsonObj.get("credit_biz_order_id") != null && !jsonObj.get("credit_biz_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_biz_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_biz_order_id").toString()));
      }
      if (jsonObj.get("order_status") != null && !jsonObj.get("order_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
      if (jsonObj.get("zm_service_id") != null && !jsonObj.get("zm_service_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zm_service_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zm_service_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPayafteruseCreditbizorderQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPayafteruseCreditbizorderQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPayafteruseCreditbizorderQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPayafteruseCreditbizorderQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPayafteruseCreditbizorderQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPayafteruseCreditbizorderQueryResponseModel value) throws IOException {
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
           public ZhimaCreditPayafteruseCreditbizorderQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZhimaCreditPayafteruseCreditbizorderQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZhimaCreditPayafteruseCreditbizorderQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPayafteruseCreditbizorderQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPayafteruseCreditbizorderQueryResponseModel
  */
  public static ZhimaCreditPayafteruseCreditbizorderQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPayafteruseCreditbizorderQueryResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPayafteruseCreditbizorderQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

