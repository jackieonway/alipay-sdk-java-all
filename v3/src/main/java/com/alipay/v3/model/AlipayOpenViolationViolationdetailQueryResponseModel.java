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
import com.alipay.v3.model.AuditEvidenceInfo;
import com.alipay.v3.model.ReplyRecord;
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
 * AlipayOpenViolationViolationdetailQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenViolationViolationdetailQueryResponseModel {
  public static final String SERIALIZED_NAME_APPEAL_DEAD_LINE = "appeal_dead_line";
  @SerializedName(SERIALIZED_NAME_APPEAL_DEAD_LINE)
  private String appealDeadLine;

  public static final String SERIALIZED_NAME_APPEAL_REPLY_RECORDS = "appeal_reply_records";
  @SerializedName(SERIALIZED_NAME_APPEAL_REPLY_RECORDS)
  private List<ReplyRecord> appealReplyRecords = null;

  public static final String SERIALIZED_NAME_CAN_APPEAL = "can_appeal";
  @SerializedName(SERIALIZED_NAME_CAN_APPEAL)
  private Boolean canAppeal;

  public static final String SERIALIZED_NAME_CAN_RECTIFY = "can_rectify";
  @SerializedName(SERIALIZED_NAME_CAN_RECTIFY)
  private Boolean canRectify;

  public static final String SERIALIZED_NAME_PUNISH_ACTION = "punish_action";
  @SerializedName(SERIALIZED_NAME_PUNISH_ACTION)
  private List<String> punishAction = null;

  public static final String SERIALIZED_NAME_RECTIFY_DEAD_LINE = "rectify_dead_line";
  @SerializedName(SERIALIZED_NAME_RECTIFY_DEAD_LINE)
  private String rectifyDeadLine;

  public static final String SERIALIZED_NAME_RECTIFY_REPLY_RECORDS = "rectify_reply_records";
  @SerializedName(SERIALIZED_NAME_RECTIFY_REPLY_RECORDS)
  private List<ReplyRecord> rectifyReplyRecords = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SURPLUS_APPEAL_CNT = "surplus_appeal_cnt";
  @SerializedName(SERIALIZED_NAME_SURPLUS_APPEAL_CNT)
  private String surplusAppealCnt;

  public static final String SERIALIZED_NAME_SURPLUS_RECTIFY_CNT = "surplus_rectify_cnt";
  @SerializedName(SERIALIZED_NAME_SURPLUS_RECTIFY_CNT)
  private String surplusRectifyCnt;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target_name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public static final String SERIALIZED_NAME_VIOLATION_EVIDENCE = "violation_evidence";
  @SerializedName(SERIALIZED_NAME_VIOLATION_EVIDENCE)
  private List<AuditEvidenceInfo> violationEvidence = null;

  public static final String SERIALIZED_NAME_VIOLATION_REASON = "violation_reason";
  @SerializedName(SERIALIZED_NAME_VIOLATION_REASON)
  private String violationReason;

  public static final String SERIALIZED_NAME_VIOLATION_RECORD_ID = "violation_record_id";
  @SerializedName(SERIALIZED_NAME_VIOLATION_RECORD_ID)
  private String violationRecordId;

  public static final String SERIALIZED_NAME_VIOLATION_TIME = "violation_time";
  @SerializedName(SERIALIZED_NAME_VIOLATION_TIME)
  private String violationTime;

  public static final String SERIALIZED_NAME_VIOLATION_TYPE = "violation_type";
  @SerializedName(SERIALIZED_NAME_VIOLATION_TYPE)
  private String violationType;

  public AlipayOpenViolationViolationdetailQueryResponseModel() { 
  }

  public AlipayOpenViolationViolationdetailQueryResponseModel appealDeadLine(String appealDeadLine) {
    
    this.appealDeadLine = appealDeadLine;
    return this;
  }

   /**
   * 申诉截止日期。 即商户可进行申诉的截止日期，若超过该时间未申诉或申诉不通过，平台不提供申诉机会，维持原处罚结果；若该时间内完成申诉且申诉通过，平台将撤销对商户的处罚
   * @return appealDeadLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 00:00:01", value = "申诉截止日期。 即商户可进行申诉的截止日期，若超过该时间未申诉或申诉不通过，平台不提供申诉机会，维持原处罚结果；若该时间内完成申诉且申诉通过，平台将撤销对商户的处罚")

  public String getAppealDeadLine() {
    return appealDeadLine;
  }


  public void setAppealDeadLine(String appealDeadLine) {
    this.appealDeadLine = appealDeadLine;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel appealReplyRecords(List<ReplyRecord> appealReplyRecords) {
    
    this.appealReplyRecords = appealReplyRecords;
    return this;
  }

  public AlipayOpenViolationViolationdetailQueryResponseModel addAppealReplyRecordsItem(ReplyRecord appealReplyRecordsItem) {
    if (this.appealReplyRecords == null) {
      this.appealReplyRecords = new ArrayList<>();
    }
    this.appealReplyRecords.add(appealReplyRecordsItem);
    return this;
  }

   /**
   * 商家申诉记录
   * @return appealReplyRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家申诉记录")

  public List<ReplyRecord> getAppealReplyRecords() {
    return appealReplyRecords;
  }


  public void setAppealReplyRecords(List<ReplyRecord> appealReplyRecords) {
    this.appealReplyRecords = appealReplyRecords;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel canAppeal(Boolean canAppeal) {
    
    this.canAppeal = canAppeal;
    return this;
  }

   /**
   * 商家是否可以申诉
   * @return canAppeal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "商家是否可以申诉")

  public Boolean getCanAppeal() {
    return canAppeal;
  }


  public void setCanAppeal(Boolean canAppeal) {
    this.canAppeal = canAppeal;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel canRectify(Boolean canRectify) {
    
    this.canRectify = canRectify;
    return this;
  }

   /**
   * 商家是否可以整改
   * @return canRectify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "商家是否可以整改")

  public Boolean getCanRectify() {
    return canRectify;
  }


  public void setCanRectify(Boolean canRectify) {
    this.canRectify = canRectify;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel punishAction(List<String> punishAction) {
    
    this.punishAction = punishAction;
    return this;
  }

  public AlipayOpenViolationViolationdetailQueryResponseModel addPunishActionItem(String punishActionItem) {
    if (this.punishAction == null) {
      this.punishAction = new ArrayList<>();
    }
    this.punishAction.add(punishActionItem);
    return this;
  }

   /**
   * 处罚动作及有效期
   * @return punishAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[ \"警告_2020-02-14 14:23:12-2020-03-14 14:23:12\",\"小程序应用下架_2020-02-14 14:23:12-2020-03-14 14:23:12\"]", value = "处罚动作及有效期")

  public List<String> getPunishAction() {
    return punishAction;
  }


  public void setPunishAction(List<String> punishAction) {
    this.punishAction = punishAction;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel rectifyDeadLine(String rectifyDeadLine) {
    
    this.rectifyDeadLine = rectifyDeadLine;
    return this;
  }

   /**
   * 截止整改时间。即商户可进行整改的截止日期，若超过该时间未整改或整改不通过，平台将对商户进行处罚，若该时间内完成整改且整改通过，平台对商户不处罚
   * @return rectifyDeadLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 00:00:01", value = "截止整改时间。即商户可进行整改的截止日期，若超过该时间未整改或整改不通过，平台将对商户进行处罚，若该时间内完成整改且整改通过，平台对商户不处罚")

  public String getRectifyDeadLine() {
    return rectifyDeadLine;
  }


  public void setRectifyDeadLine(String rectifyDeadLine) {
    this.rectifyDeadLine = rectifyDeadLine;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel rectifyReplyRecords(List<ReplyRecord> rectifyReplyRecords) {
    
    this.rectifyReplyRecords = rectifyReplyRecords;
    return this;
  }

  public AlipayOpenViolationViolationdetailQueryResponseModel addRectifyReplyRecordsItem(ReplyRecord rectifyReplyRecordsItem) {
    if (this.rectifyReplyRecords == null) {
      this.rectifyReplyRecords = new ArrayList<>();
    }
    this.rectifyReplyRecords.add(rectifyReplyRecordsItem);
    return this;
  }

   /**
   * 商家整改记录
   * @return rectifyReplyRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家整改记录")

  public List<ReplyRecord> getRectifyReplyRecords() {
    return rectifyReplyRecords;
  }


  public void setRectifyReplyRecords(List<ReplyRecord> rectifyReplyRecords) {
    this.rectifyReplyRecords = rectifyReplyRecords;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 违规工单状态枚举
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUNISH_DONE", value = "违规工单状态枚举")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel surplusAppealCnt(String surplusAppealCnt) {
    
    this.surplusAppealCnt = surplusAppealCnt;
    return this;
  }

   /**
   * 剩余申诉次数。 即在申诉截止日期内，平台允许商家申诉的次数，当商户提交申诉但申诉未通过时，剩余申诉次数减1，当整改次数为0，不管是否在整改截止日期内，平台将对商户进行处罚
   * @return surplusAppealCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "剩余申诉次数。 即在申诉截止日期内，平台允许商家申诉的次数，当商户提交申诉但申诉未通过时，剩余申诉次数减1，当整改次数为0，不管是否在整改截止日期内，平台将对商户进行处罚")

  public String getSurplusAppealCnt() {
    return surplusAppealCnt;
  }


  public void setSurplusAppealCnt(String surplusAppealCnt) {
    this.surplusAppealCnt = surplusAppealCnt;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel surplusRectifyCnt(String surplusRectifyCnt) {
    
    this.surplusRectifyCnt = surplusRectifyCnt;
    return this;
  }

   /**
   * 剩余整改次数。即在整改截止日期内，平台允许商家整改的次数，当商户提交整改但整改未通过时，剩余整改次数减1，当整改次数为0，不管是否在整改截止日期内，平台将对商户进行处罚
   * @return surplusRectifyCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "剩余整改次数。即在整改截止日期内，平台允许商家整改的次数，当商户提交整改但整改未通过时，剩余整改次数减1，当整改次数为0，不管是否在整改截止日期内，平台将对商户进行处罚")

  public String getSurplusRectifyCnt() {
    return surplusRectifyCnt;
  }


  public void setSurplusRectifyCnt(String surplusRectifyCnt) {
    this.surplusRectifyCnt = surplusRectifyCnt;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 违规对象ID
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022000000000011", value = "违规对象ID")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * 违规对象名称
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx测试小程序", value = "违规对象名称")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 违规对象类型 小程序ID:APPID 生活号ID:PUBLICID
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPID", value = "违规对象类型 小程序ID:APPID 生活号ID:PUBLICID")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel violationEvidence(List<AuditEvidenceInfo> violationEvidence) {
    
    this.violationEvidence = violationEvidence;
    return this;
  }

  public AlipayOpenViolationViolationdetailQueryResponseModel addViolationEvidenceItem(AuditEvidenceInfo violationEvidenceItem) {
    if (this.violationEvidence == null) {
      this.violationEvidence = new ArrayList<>();
    }
    this.violationEvidence.add(violationEvidenceItem);
    return this;
  }

   /**
   * 平台判定商家违规凭证
   * @return violationEvidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "平台判定商家违规凭证")

  public List<AuditEvidenceInfo> getViolationEvidence() {
    return violationEvidence;
  }


  public void setViolationEvidence(List<AuditEvidenceInfo> violationEvidence) {
    this.violationEvidence = violationEvidence;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel violationReason(String violationReason) {
    
    this.violationReason = violationReason;
    return this;
  }

   /**
   * 违规原因
   * @return violationReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "营销推广内容中出现的原价或参考价并无实际销售记录，诱导用户参与或下单交易/服务的行为。", value = "违规原因")

  public String getViolationReason() {
    return violationReason;
  }


  public void setViolationReason(String violationReason) {
    this.violationReason = violationReason;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel violationRecordId(String violationRecordId) {
    
    this.violationRecordId = violationRecordId;
    return this;
  }

   /**
   * 支付宝侧生成的违规记录唯一标识
   * @return violationRecordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220524001020000000000001", value = "支付宝侧生成的违规记录唯一标识")

  public String getViolationRecordId() {
    return violationRecordId;
  }


  public void setViolationRecordId(String violationRecordId) {
    this.violationRecordId = violationRecordId;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel violationTime(String violationTime) {
    
    this.violationTime = violationTime;
    return this;
  }

   /**
   * 违规时间，格式为 yyyy-MM-dd HH:mm:ss
   * @return violationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 00:00:01", value = "违规时间，格式为 yyyy-MM-dd HH:mm:ss")

  public String getViolationTime() {
    return violationTime;
  }


  public void setViolationTime(String violationTime) {
    this.violationTime = violationTime;
  }


  public AlipayOpenViolationViolationdetailQueryResponseModel violationType(String violationType) {
    
    this.violationType = violationType;
    return this;
  }

   /**
   * 即平台依据平台规范/规则，判定商户的违规类型
   * @return violationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "数据和系统安全/敏感参数泄露风险", value = "即平台依据平台规范/规则，判定商户的违规类型")

  public String getViolationType() {
    return violationType;
  }


  public void setViolationType(String violationType) {
    this.violationType = violationType;
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
   * @return the AlipayOpenViolationViolationdetailQueryResponseModel instance itself
   */
  public AlipayOpenViolationViolationdetailQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenViolationViolationdetailQueryResponseModel alipayOpenViolationViolationdetailQueryResponseModel = (AlipayOpenViolationViolationdetailQueryResponseModel) o;
    return Objects.equals(this.appealDeadLine, alipayOpenViolationViolationdetailQueryResponseModel.appealDeadLine) &&
        Objects.equals(this.appealReplyRecords, alipayOpenViolationViolationdetailQueryResponseModel.appealReplyRecords) &&
        Objects.equals(this.canAppeal, alipayOpenViolationViolationdetailQueryResponseModel.canAppeal) &&
        Objects.equals(this.canRectify, alipayOpenViolationViolationdetailQueryResponseModel.canRectify) &&
        Objects.equals(this.punishAction, alipayOpenViolationViolationdetailQueryResponseModel.punishAction) &&
        Objects.equals(this.rectifyDeadLine, alipayOpenViolationViolationdetailQueryResponseModel.rectifyDeadLine) &&
        Objects.equals(this.rectifyReplyRecords, alipayOpenViolationViolationdetailQueryResponseModel.rectifyReplyRecords) &&
        Objects.equals(this.status, alipayOpenViolationViolationdetailQueryResponseModel.status) &&
        Objects.equals(this.surplusAppealCnt, alipayOpenViolationViolationdetailQueryResponseModel.surplusAppealCnt) &&
        Objects.equals(this.surplusRectifyCnt, alipayOpenViolationViolationdetailQueryResponseModel.surplusRectifyCnt) &&
        Objects.equals(this.targetId, alipayOpenViolationViolationdetailQueryResponseModel.targetId) &&
        Objects.equals(this.targetName, alipayOpenViolationViolationdetailQueryResponseModel.targetName) &&
        Objects.equals(this.targetType, alipayOpenViolationViolationdetailQueryResponseModel.targetType) &&
        Objects.equals(this.violationEvidence, alipayOpenViolationViolationdetailQueryResponseModel.violationEvidence) &&
        Objects.equals(this.violationReason, alipayOpenViolationViolationdetailQueryResponseModel.violationReason) &&
        Objects.equals(this.violationRecordId, alipayOpenViolationViolationdetailQueryResponseModel.violationRecordId) &&
        Objects.equals(this.violationTime, alipayOpenViolationViolationdetailQueryResponseModel.violationTime) &&
        Objects.equals(this.violationType, alipayOpenViolationViolationdetailQueryResponseModel.violationType)&&
        Objects.equals(this.additionalProperties, alipayOpenViolationViolationdetailQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appealDeadLine, appealReplyRecords, canAppeal, canRectify, punishAction, rectifyDeadLine, rectifyReplyRecords, status, surplusAppealCnt, surplusRectifyCnt, targetId, targetName, targetType, violationEvidence, violationReason, violationRecordId, violationTime, violationType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenViolationViolationdetailQueryResponseModel {\n");
    sb.append("    appealDeadLine: ").append(toIndentedString(appealDeadLine)).append("\n");
    sb.append("    appealReplyRecords: ").append(toIndentedString(appealReplyRecords)).append("\n");
    sb.append("    canAppeal: ").append(toIndentedString(canAppeal)).append("\n");
    sb.append("    canRectify: ").append(toIndentedString(canRectify)).append("\n");
    sb.append("    punishAction: ").append(toIndentedString(punishAction)).append("\n");
    sb.append("    rectifyDeadLine: ").append(toIndentedString(rectifyDeadLine)).append("\n");
    sb.append("    rectifyReplyRecords: ").append(toIndentedString(rectifyReplyRecords)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    surplusAppealCnt: ").append(toIndentedString(surplusAppealCnt)).append("\n");
    sb.append("    surplusRectifyCnt: ").append(toIndentedString(surplusRectifyCnt)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    violationEvidence: ").append(toIndentedString(violationEvidence)).append("\n");
    sb.append("    violationReason: ").append(toIndentedString(violationReason)).append("\n");
    sb.append("    violationRecordId: ").append(toIndentedString(violationRecordId)).append("\n");
    sb.append("    violationTime: ").append(toIndentedString(violationTime)).append("\n");
    sb.append("    violationType: ").append(toIndentedString(violationType)).append("\n");
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
    openapiFields.add("appeal_dead_line");
    openapiFields.add("appeal_reply_records");
    openapiFields.add("can_appeal");
    openapiFields.add("can_rectify");
    openapiFields.add("punish_action");
    openapiFields.add("rectify_dead_line");
    openapiFields.add("rectify_reply_records");
    openapiFields.add("status");
    openapiFields.add("surplus_appeal_cnt");
    openapiFields.add("surplus_rectify_cnt");
    openapiFields.add("target_id");
    openapiFields.add("target_name");
    openapiFields.add("target_type");
    openapiFields.add("violation_evidence");
    openapiFields.add("violation_reason");
    openapiFields.add("violation_record_id");
    openapiFields.add("violation_time");
    openapiFields.add("violation_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenViolationViolationdetailQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenViolationViolationdetailQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenViolationViolationdetailQueryResponseModel is not found in the empty JSON string", AlipayOpenViolationViolationdetailQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("appeal_dead_line") != null && !jsonObj.get("appeal_dead_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appeal_dead_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appeal_dead_line").toString()));
      }
      JsonArray jsonArrayappealReplyRecords = jsonObj.getAsJsonArray("appeal_reply_records");
      if (jsonArrayappealReplyRecords != null) {
        // ensure the json data is an array
        if (!jsonObj.get("appeal_reply_records").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `appeal_reply_records` to be an array in the JSON string but got `%s`", jsonObj.get("appeal_reply_records").toString()));
        }

        // validate the optional field `appeal_reply_records` (array)
        for (int i = 0; i < jsonArrayappealReplyRecords.size(); i++) {
          ReplyRecord.validateJsonObject(jsonArrayappealReplyRecords.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("punish_action") != null && !jsonObj.get("punish_action").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `punish_action` to be an array in the JSON string but got `%s`", jsonObj.get("punish_action").toString()));
      }
      if (jsonObj.get("rectify_dead_line") != null && !jsonObj.get("rectify_dead_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rectify_dead_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rectify_dead_line").toString()));
      }
      JsonArray jsonArrayrectifyReplyRecords = jsonObj.getAsJsonArray("rectify_reply_records");
      if (jsonArrayrectifyReplyRecords != null) {
        // ensure the json data is an array
        if (!jsonObj.get("rectify_reply_records").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `rectify_reply_records` to be an array in the JSON string but got `%s`", jsonObj.get("rectify_reply_records").toString()));
        }

        // validate the optional field `rectify_reply_records` (array)
        for (int i = 0; i < jsonArrayrectifyReplyRecords.size(); i++) {
          ReplyRecord.validateJsonObject(jsonArrayrectifyReplyRecords.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("surplus_appeal_cnt") != null && !jsonObj.get("surplus_appeal_cnt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surplus_appeal_cnt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surplus_appeal_cnt").toString()));
      }
      if (jsonObj.get("surplus_rectify_cnt") != null && !jsonObj.get("surplus_rectify_cnt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surplus_rectify_cnt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surplus_rectify_cnt").toString()));
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_name") != null && !jsonObj.get("target_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_name").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
      JsonArray jsonArrayviolationEvidence = jsonObj.getAsJsonArray("violation_evidence");
      if (jsonArrayviolationEvidence != null) {
        // ensure the json data is an array
        if (!jsonObj.get("violation_evidence").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `violation_evidence` to be an array in the JSON string but got `%s`", jsonObj.get("violation_evidence").toString()));
        }

        // validate the optional field `violation_evidence` (array)
        for (int i = 0; i < jsonArrayviolationEvidence.size(); i++) {
          AuditEvidenceInfo.validateJsonObject(jsonArrayviolationEvidence.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("violation_reason") != null && !jsonObj.get("violation_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violation_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violation_reason").toString()));
      }
      if (jsonObj.get("violation_record_id") != null && !jsonObj.get("violation_record_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violation_record_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violation_record_id").toString()));
      }
      if (jsonObj.get("violation_time") != null && !jsonObj.get("violation_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violation_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violation_time").toString()));
      }
      if (jsonObj.get("violation_type") != null && !jsonObj.get("violation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violation_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenViolationViolationdetailQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenViolationViolationdetailQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenViolationViolationdetailQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenViolationViolationdetailQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenViolationViolationdetailQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenViolationViolationdetailQueryResponseModel value) throws IOException {
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
           public AlipayOpenViolationViolationdetailQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenViolationViolationdetailQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenViolationViolationdetailQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenViolationViolationdetailQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenViolationViolationdetailQueryResponseModel
  */
  public static AlipayOpenViolationViolationdetailQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenViolationViolationdetailQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenViolationViolationdetailQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

