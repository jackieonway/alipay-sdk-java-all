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
 * PeriodRuleParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PeriodRuleParams {
  public static final String SERIALIZED_NAME_EXECUTE_TIME = "execute_time";
  @SerializedName(SERIALIZED_NAME_EXECUTE_TIME)
  private String executeTime;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private Integer period;

  public static final String SERIALIZED_NAME_PERIOD_TYPE = "period_type";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private String periodType;

  public static final String SERIALIZED_NAME_SINGLE_AMOUNT = "single_amount";
  @SerializedName(SERIALIZED_NAME_SINGLE_AMOUNT)
  private String singleAmount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_TOTAL_PAYMENTS = "total_payments";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAYMENTS)
  private Integer totalPayments;

  public PeriodRuleParams() { 
  }

  public PeriodRuleParams executeTime(String executeTime) {
    
    this.executeTime = executeTime;
    return this;
  }

   /**
   * 首次执行时间execute_time是周期扣款产品必填，即商户发起首次扣款的时间。精确到日，格式为yyyy-MM-dd 结合其他必填的扣款周期参数，会确定商户以后的扣款计划。发起扣款的时间需符合这里的扣款计划。
   * @return executeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "首次执行时间execute_time是周期扣款产品必填，即商户发起首次扣款的时间。精确到日，格式为yyyy-MM-dd 结合其他必填的扣款周期参数，会确定商户以后的扣款计划。发起扣款的时间需符合这里的扣款计划。")

  public String getExecuteTime() {
    return executeTime;
  }


  public void setExecuteTime(String executeTime) {
    this.executeTime = executeTime;
  }


  public PeriodRuleParams period(Integer period) {
    
    this.period = period;
    return this;
  }

   /**
   * 周期数period是周期扣款产品必填。与另一参数period_type组合使用确定扣款周期，例如period_type为DAY，period&#x3D;90，则扣款周期为90天。
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期数period是周期扣款产品必填。与另一参数period_type组合使用确定扣款周期，例如period_type为DAY，period=90，则扣款周期为90天。")

  public Integer getPeriod() {
    return period;
  }


  public void setPeriod(Integer period) {
    this.period = period;
  }


  public PeriodRuleParams periodType(String periodType) {
    
    this.periodType = periodType;
    return this;
  }

   /**
   * 周期类型period_type是周期扣款产品必填，枚举值为DAY和MONTH。 DAY即扣款周期按天计，MONTH代表扣款周期按自然月。 与另一参数period组合使用确定扣款周期，例如period_type为DAY，period&#x3D;30，则扣款周期为30天；period_type为MONTH，period&#x3D;3，则扣款周期为3个自然月。 自然月是指，不论这个月有多少天，周期都计算到月份中的同一日期。例如1月3日到2月3日为一个自然月，1月3日到4月3日为三个自然月。注意周期类型使用MONTH的时候，计划扣款时间execute_time不允许传28日之后的日期（可以传28日），以此避免有些月份可能不存在对应日期的情况。
   * @return periodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期类型period_type是周期扣款产品必填，枚举值为DAY和MONTH。 DAY即扣款周期按天计，MONTH代表扣款周期按自然月。 与另一参数period组合使用确定扣款周期，例如period_type为DAY，period=30，则扣款周期为30天；period_type为MONTH，period=3，则扣款周期为3个自然月。 自然月是指，不论这个月有多少天，周期都计算到月份中的同一日期。例如1月3日到2月3日为一个自然月，1月3日到4月3日为三个自然月。注意周期类型使用MONTH的时候，计划扣款时间execute_time不允许传28日之后的日期（可以传28日），以此避免有些月份可能不存在对应日期的情况。")

  public String getPeriodType() {
    return periodType;
  }


  public void setPeriodType(String periodType) {
    this.periodType = periodType;
  }


  public PeriodRuleParams singleAmount(String singleAmount) {
    
    this.singleAmount = singleAmount;
    return this;
  }

   /**
   * 单次扣款最大金额single_amount是周期扣款产品必填，即每次发起扣款时限制的最大金额，单位为元。商户每次发起扣款都不允许大于此金额。
   * @return singleAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单次扣款最大金额single_amount是周期扣款产品必填，即每次发起扣款时限制的最大金额，单位为元。商户每次发起扣款都不允许大于此金额。")

  public String getSingleAmount() {
    return singleAmount;
  }


  public void setSingleAmount(String singleAmount) {
    this.singleAmount = singleAmount;
  }


  public PeriodRuleParams totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 总金额限制，单位为元。如果传入此参数，商户多次扣款的累计金额不允许超过此金额。
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "总金额限制，单位为元。如果传入此参数，商户多次扣款的累计金额不允许超过此金额。")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public PeriodRuleParams totalPayments(Integer totalPayments) {
    
    this.totalPayments = totalPayments;
    return this;
  }

   /**
   * 总扣款次数。如果传入此参数，则商户成功扣款的次数不能超过此次数限制（扣款失败不计入）。
   * @return totalPayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "总扣款次数。如果传入此参数，则商户成功扣款的次数不能超过此次数限制（扣款失败不计入）。")

  public Integer getTotalPayments() {
    return totalPayments;
  }


  public void setTotalPayments(Integer totalPayments) {
    this.totalPayments = totalPayments;
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
   * @return the PeriodRuleParams instance itself
   */
  public PeriodRuleParams putAdditionalProperty(String key, Object value) {
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
    PeriodRuleParams periodRuleParams = (PeriodRuleParams) o;
    return Objects.equals(this.executeTime, periodRuleParams.executeTime) &&
        Objects.equals(this.period, periodRuleParams.period) &&
        Objects.equals(this.periodType, periodRuleParams.periodType) &&
        Objects.equals(this.singleAmount, periodRuleParams.singleAmount) &&
        Objects.equals(this.totalAmount, periodRuleParams.totalAmount) &&
        Objects.equals(this.totalPayments, periodRuleParams.totalPayments)&&
        Objects.equals(this.additionalProperties, periodRuleParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executeTime, period, periodType, singleAmount, totalAmount, totalPayments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodRuleParams {\n");
    sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    singleAmount: ").append(toIndentedString(singleAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalPayments: ").append(toIndentedString(totalPayments)).append("\n");
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
    openapiFields.add("execute_time");
    openapiFields.add("period");
    openapiFields.add("period_type");
    openapiFields.add("single_amount");
    openapiFields.add("total_amount");
    openapiFields.add("total_payments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PeriodRuleParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PeriodRuleParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeriodRuleParams is not found in the empty JSON string", PeriodRuleParams.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("execute_time") != null && !jsonObj.get("execute_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `execute_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("execute_time").toString()));
      }
      if (jsonObj.get("period_type") != null && !jsonObj.get("period_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period_type").toString()));
      }
      if (jsonObj.get("single_amount") != null && !jsonObj.get("single_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `single_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("single_amount").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeriodRuleParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeriodRuleParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeriodRuleParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeriodRuleParams.class));

       return (TypeAdapter<T>) new TypeAdapter<PeriodRuleParams>() {
           @Override
           public void write(JsonWriter out, PeriodRuleParams value) throws IOException {
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
           public PeriodRuleParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PeriodRuleParams instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PeriodRuleParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PeriodRuleParams
  * @throws IOException if the JSON string is invalid with respect to PeriodRuleParams
  */
  public static PeriodRuleParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeriodRuleParams.class);
  }

 /**
  * Convert an instance of PeriodRuleParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

