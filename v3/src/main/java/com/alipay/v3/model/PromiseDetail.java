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
 * PromiseDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PromiseDetail {
  public static final String SERIALIZED_NAME_AUTH_STATUS = "auth_status";
  @SerializedName(SERIALIZED_NAME_AUTH_STATUS)
  private Boolean authStatus;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_FINAL_TIME = "final_time";
  @SerializedName(SERIALIZED_NAME_FINAL_TIME)
  private String finalTime;

  public static final String SERIALIZED_NAME_FINISH_PERIODS = "finish_periods";
  @SerializedName(SERIALIZED_NAME_FINISH_PERIODS)
  private Integer finishPeriods;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_MERCHANT_LOGO = "merchant_logo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_LOGO)
  private String merchantLogo;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PERIOD_TYPE = "period_type";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private String periodType;

  public static final String SERIALIZED_NAME_PROMISE_NAME = "promise_name";
  @SerializedName(SERIALIZED_NAME_PROMISE_NAME)
  private String promiseName;

  public static final String SERIALIZED_NAME_RECORD_ID = "record_id";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private String recordId;

  public static final String SERIALIZED_NAME_RECORD_STATUS = "record_status";
  @SerializedName(SERIALIZED_NAME_RECORD_STATUS)
  private String recordStatus;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_SUB_RECORD_STATUS = "sub_record_status";
  @SerializedName(SERIALIZED_NAME_SUB_RECORD_STATUS)
  private String subRecordStatus;

  public static final String SERIALIZED_NAME_SUB_TITLE = "sub_title";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE)
  private String subTitle;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TOTAL_PERIODS = "total_periods";
  @SerializedName(SERIALIZED_NAME_TOTAL_PERIODS)
  private Integer totalPeriods;

  public PromiseDetail() { 
  }

  public PromiseDetail authStatus(Boolean authStatus) {
    
    this.authStatus = authStatus;
    return this;
  }

   /**
   * 授权状态
   * @return authStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "授权状态")

  public Boolean getAuthStatus() {
    return authStatus;
  }


  public void setAuthStatus(Boolean authStatus) {
    this.authStatus = authStatus;
  }


  public PromiseDetail createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 任务创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yyyy-mm-dd hh:mm:ss", value = "任务创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public PromiseDetail endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 任务结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yyyy-mm-dd hh:mm:ss", value = "任务结束时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public PromiseDetail finalTime(String finalTime) {
    
    this.finalTime = finalTime;
    return this;
  }

   /**
   * 任务到达终态的时间
   * @return finalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yyyy-mm-dd hh:mm:ss", value = "任务到达终态的时间")

  public String getFinalTime() {
    return finalTime;
  }


  public void setFinalTime(String finalTime) {
    this.finalTime = finalTime;
  }


  public PromiseDetail finishPeriods(Integer finishPeriods) {
    
    this.finishPeriods = finishPeriods;
    return this;
  }

   /**
   * 任务完成期数
   * @return finishPeriods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "任务完成期数")

  public Integer getFinishPeriods() {
    return finishPeriods;
  }


  public void setFinishPeriods(Integer finishPeriods) {
    this.finishPeriods = finishPeriods;
  }


  public PromiseDetail merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 芝麻侧的商户id
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lefit", value = "芝麻侧的商户id")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public PromiseDetail merchantLogo(String merchantLogo) {
    
    this.merchantLogo = merchantLogo;
    return this;
  }

   /**
   * 商户logo
   * @return merchantLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://icon.png", value = "商户logo")

  public String getMerchantLogo() {
    return merchantLogo;
  }


  public void setMerchantLogo(String merchantLogo) {
    this.merchantLogo = merchantLogo;
  }


  public PromiseDetail merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 商户名称
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "乐刻", value = "商户名称")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public PromiseDetail outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 生活记录加入时的外部业务号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "84927419", value = "生活记录加入时的外部业务号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public PromiseDetail periodType(String periodType) {
    
    this.periodType = periodType;
    return this;
  }

   /**
   * 周期类型
   * @return periodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "multi", value = "周期类型")

  public String getPeriodType() {
    return periodType;
  }


  public void setPeriodType(String periodType) {
    this.periodType = periodType;
  }


  public PromiseDetail promiseName(String promiseName) {
    
    this.promiseName = promiseName;
    return this;
  }

   /**
   * 生活记录模板名称
   * @return promiseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "每周攒钱，完成心愿", value = "生活记录模板名称")

  public String getPromiseName() {
    return promiseName;
  }


  public void setPromiseName(String promiseName) {
    this.promiseName = promiseName;
  }


  public PromiseDetail recordId(String recordId) {
    
    this.recordId = recordId;
    return this;
  }

   /**
   * 生活记录主记录id
   * @return recordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022101865652385257", value = "生活记录主记录id")

  public String getRecordId() {
    return recordId;
  }


  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  public PromiseDetail recordStatus(String recordStatus) {
    
    this.recordStatus = recordStatus;
    return this;
  }

   /**
   * 主任务状态
   * @return recordStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PROCESSING、UN_FINISH、CANCELED、FINISH，分别对应进行中、未完成、已取消、已完成", value = "主任务状态")

  public String getRecordStatus() {
    return recordStatus;
  }


  public void setRecordStatus(String recordStatus) {
    this.recordStatus = recordStatus;
  }


  public PromiseDetail startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 任务开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yyyy-mm-dd hh:mm:ss", value = "任务开始时间")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public PromiseDetail subRecordStatus(String subRecordStatus) {
    
    this.subRecordStatus = subRecordStatus;
    return this;
  }

   /**
   * 子记录状态
   * @return subRecordStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PROCESSING、UN_FINISH、CANCELED、FINISH，分别对应进行中、未完成、已取消、已完成", value = "子记录状态")

  public String getSubRecordStatus() {
    return subRecordStatus;
  }


  public void setSubRecordStatus(String subRecordStatus) {
    this.subRecordStatus = subRecordStatus;
  }


  public PromiseDetail subTitle(String subTitle) {
    
    this.subTitle = subTitle;
    return this;
  }

   /**
   * 副标题
   * @return subTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "加入后7天内完成1次攒钱", value = "副标题")

  public String getSubTitle() {
    return subTitle;
  }


  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public PromiseDetail templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 生活记录模板id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "save_money_every_week", value = "生活记录模板id")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public PromiseDetail totalPeriods(Integer totalPeriods) {
    
    this.totalPeriods = totalPeriods;
    return this;
  }

   /**
   * 任务总期数
   * @return totalPeriods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "任务总期数")

  public Integer getTotalPeriods() {
    return totalPeriods;
  }


  public void setTotalPeriods(Integer totalPeriods) {
    this.totalPeriods = totalPeriods;
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
   * @return the PromiseDetail instance itself
   */
  public PromiseDetail putAdditionalProperty(String key, Object value) {
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
    PromiseDetail promiseDetail = (PromiseDetail) o;
    return Objects.equals(this.authStatus, promiseDetail.authStatus) &&
        Objects.equals(this.createTime, promiseDetail.createTime) &&
        Objects.equals(this.endTime, promiseDetail.endTime) &&
        Objects.equals(this.finalTime, promiseDetail.finalTime) &&
        Objects.equals(this.finishPeriods, promiseDetail.finishPeriods) &&
        Objects.equals(this.merchantId, promiseDetail.merchantId) &&
        Objects.equals(this.merchantLogo, promiseDetail.merchantLogo) &&
        Objects.equals(this.merchantName, promiseDetail.merchantName) &&
        Objects.equals(this.outBizNo, promiseDetail.outBizNo) &&
        Objects.equals(this.periodType, promiseDetail.periodType) &&
        Objects.equals(this.promiseName, promiseDetail.promiseName) &&
        Objects.equals(this.recordId, promiseDetail.recordId) &&
        Objects.equals(this.recordStatus, promiseDetail.recordStatus) &&
        Objects.equals(this.startTime, promiseDetail.startTime) &&
        Objects.equals(this.subRecordStatus, promiseDetail.subRecordStatus) &&
        Objects.equals(this.subTitle, promiseDetail.subTitle) &&
        Objects.equals(this.templateId, promiseDetail.templateId) &&
        Objects.equals(this.totalPeriods, promiseDetail.totalPeriods)&&
        Objects.equals(this.additionalProperties, promiseDetail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authStatus, createTime, endTime, finalTime, finishPeriods, merchantId, merchantLogo, merchantName, outBizNo, periodType, promiseName, recordId, recordStatus, startTime, subRecordStatus, subTitle, templateId, totalPeriods, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromiseDetail {\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    finalTime: ").append(toIndentedString(finalTime)).append("\n");
    sb.append("    finishPeriods: ").append(toIndentedString(finishPeriods)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantLogo: ").append(toIndentedString(merchantLogo)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    promiseName: ").append(toIndentedString(promiseName)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    recordStatus: ").append(toIndentedString(recordStatus)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    subRecordStatus: ").append(toIndentedString(subRecordStatus)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    totalPeriods: ").append(toIndentedString(totalPeriods)).append("\n");
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
    openapiFields.add("auth_status");
    openapiFields.add("create_time");
    openapiFields.add("end_time");
    openapiFields.add("final_time");
    openapiFields.add("finish_periods");
    openapiFields.add("merchant_id");
    openapiFields.add("merchant_logo");
    openapiFields.add("merchant_name");
    openapiFields.add("out_biz_no");
    openapiFields.add("period_type");
    openapiFields.add("promise_name");
    openapiFields.add("record_id");
    openapiFields.add("record_status");
    openapiFields.add("start_time");
    openapiFields.add("sub_record_status");
    openapiFields.add("sub_title");
    openapiFields.add("template_id");
    openapiFields.add("total_periods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PromiseDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PromiseDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromiseDetail is not found in the empty JSON string", PromiseDetail.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("final_time") != null && !jsonObj.get("final_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `final_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("final_time").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("merchant_logo") != null && !jsonObj.get("merchant_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_logo").toString()));
      }
      if (jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("period_type") != null && !jsonObj.get("period_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period_type").toString()));
      }
      if (jsonObj.get("promise_name") != null && !jsonObj.get("promise_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promise_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promise_name").toString()));
      }
      if (jsonObj.get("record_id") != null && !jsonObj.get("record_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `record_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("record_id").toString()));
      }
      if (jsonObj.get("record_status") != null && !jsonObj.get("record_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `record_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("record_status").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("sub_record_status") != null && !jsonObj.get("sub_record_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_record_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_record_status").toString()));
      }
      if (jsonObj.get("sub_title") != null && !jsonObj.get("sub_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_title").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromiseDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromiseDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromiseDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromiseDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<PromiseDetail>() {
           @Override
           public void write(JsonWriter out, PromiseDetail value) throws IOException {
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
           public PromiseDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PromiseDetail instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PromiseDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromiseDetail
  * @throws IOException if the JSON string is invalid with respect to PromiseDetail
  */
  public static PromiseDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromiseDetail.class);
  }

 /**
  * Convert an instance of PromiseDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

