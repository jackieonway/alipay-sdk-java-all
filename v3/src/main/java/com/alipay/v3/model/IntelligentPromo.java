/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-09-06
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.InteligentMerchantPromo;
import com.alipay.v3.model.IntelligentPromoDetail;
import com.alipay.v3.model.IntelligentPromoEffect;
import com.alipay.v3.model.PromoOperatorInfo;
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
 * IntelligentPromo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IntelligentPromo {
  public static final String SERIALIZED_NAME_ALLOW_AUTO_DELAY = "allow_auto_delay";
  @SerializedName(SERIALIZED_NAME_ALLOW_AUTO_DELAY)
  private Boolean allowAutoDelay;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private String auditStatus;

  public static final String SERIALIZED_NAME_CREATE_REQUEST_NO = "create_request_no";
  @SerializedName(SERIALIZED_NAME_CREATE_REQUEST_NO)
  private String createRequestNo;

  public static final String SERIALIZED_NAME_CREATOR_INFO = "creator_info";
  @SerializedName(SERIALIZED_NAME_CREATOR_INFO)
  private PromoOperatorInfo creatorInfo;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_FORECAST_EFFECT = "forecast_effect";
  @SerializedName(SERIALIZED_NAME_FORECAST_EFFECT)
  private IntelligentPromoEffect forecastEffect;

  public static final String SERIALIZED_NAME_GMT_CLOSED = "gmt_closed";
  @SerializedName(SERIALIZED_NAME_GMT_CLOSED)
  private String gmtClosed;

  public static final String SERIALIZED_NAME_GMT_ENABLED = "gmt_enabled";
  @SerializedName(SERIALIZED_NAME_GMT_ENABLED)
  private String gmtEnabled;

  public static final String SERIALIZED_NAME_GMT_END = "gmt_end";
  @SerializedName(SERIALIZED_NAME_GMT_END)
  private String gmtEnd;

  public static final String SERIALIZED_NAME_GMT_START = "gmt_start";
  @SerializedName(SERIALIZED_NAME_GMT_START)
  private String gmtStart;

  public static final String SERIALIZED_NAME_MERCHANT_PROMOS = "merchant_promos";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROMOS)
  private List<InteligentMerchantPromo> merchantPromos = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER_INFO = "owner_info";
  @SerializedName(SERIALIZED_NAME_OWNER_INFO)
  private PromoOperatorInfo ownerInfo;

  public static final String SERIALIZED_NAME_PARENT_PROMO_ID = "parent_promo_id";
  @SerializedName(SERIALIZED_NAME_PARENT_PROMO_ID)
  private String parentPromoId;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PROMO_ID = "promo_id";
  @SerializedName(SERIALIZED_NAME_PROMO_ID)
  private String promoId;

  public static final String SERIALIZED_NAME_PROMOS = "promos";
  @SerializedName(SERIALIZED_NAME_PROMOS)
  private List<IntelligentPromoDetail> promos = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUB_PROMO_IDS = "sub_promo_ids";
  @SerializedName(SERIALIZED_NAME_SUB_PROMO_IDS)
  private List<String> subPromoIds = null;

  public static final String SERIALIZED_NAME_SUB_STATUS = "sub_status";
  @SerializedName(SERIALIZED_NAME_SUB_STATUS)
  private String subStatus;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public IntelligentPromo() { 
  }

  public IntelligentPromo allowAutoDelay(Boolean allowAutoDelay) {
    
    this.allowAutoDelay = allowAutoDelay;
    return this;
  }

   /**
   * 是否允许自动续期
   * @return allowAutoDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否允许自动续期")

  public Boolean getAllowAutoDelay() {
    return allowAutoDelay;
  }


  public void setAllowAutoDelay(Boolean allowAutoDelay) {
    this.allowAutoDelay = allowAutoDelay;
  }


  public IntelligentPromo auditStatus(String auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 审批状态。APPROVING：审批中；REJECTED：已驳回；PASS：已通过；（注意：修改接口无需传递审批状态）
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPROVING", value = "审批状态。APPROVING：审批中；REJECTED：已驳回；PASS：已通过；（注意：修改接口无需传递审批状态）")

  public String getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
  }


  public IntelligentPromo createRequestNo(String createRequestNo) {
    
    this.createRequestNo = createRequestNo;
    return this;
  }

   /**
   * 请求幂等控制请求参数，该参数尽量比较复杂，建议使用uuid，否则触发幂等返回。
   * @return createRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7582ee4522934431bd45ae68616744b6", value = "请求幂等控制请求参数，该参数尽量比较复杂，建议使用uuid，否则触发幂等返回。")

  public String getCreateRequestNo() {
    return createRequestNo;
  }


  public void setCreateRequestNo(String createRequestNo) {
    this.createRequestNo = createRequestNo;
  }


  public IntelligentPromo creatorInfo(PromoOperatorInfo creatorInfo) {
    
    this.creatorInfo = creatorInfo;
    return this;
  }

   /**
   * Get creatorInfo
   * @return creatorInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PromoOperatorInfo getCreatorInfo() {
    return creatorInfo;
  }


  public void setCreatorInfo(PromoOperatorInfo creatorInfo) {
    this.creatorInfo = creatorInfo;
  }


  public IntelligentPromo desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 智能活动描述
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个全场智能营销活动，仅在上海地区使用", value = "智能活动描述")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public IntelligentPromo extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 活动扩展信息，通过《koubei.marketing.campaign.intelligent.promo.consult智能方案咨询接口》推荐出的方案扩展信息字段，调用《koubei.marketing.campaign.intelligent.promo.create创建智能方案》接口必须要原路带回，不能删减字段。
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\\\"PARTNER_CATEGORY\\\":\\\"2015050700000002\\\",\\\"PROMO_REC_LOG\\\":\\\"20170919000000000195431911009130\\\"}", value = "活动扩展信息，通过《koubei.marketing.campaign.intelligent.promo.consult智能方案咨询接口》推荐出的方案扩展信息字段，调用《koubei.marketing.campaign.intelligent.promo.create创建智能方案》接口必须要原路带回，不能删减字段。")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public IntelligentPromo forecastEffect(IntelligentPromoEffect forecastEffect) {
    
    this.forecastEffect = forecastEffect;
    return this;
  }

   /**
   * Get forecastEffect
   * @return forecastEffect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IntelligentPromoEffect getForecastEffect() {
    return forecastEffect;
  }


  public void setForecastEffect(IntelligentPromoEffect forecastEffect) {
    this.forecastEffect = forecastEffect;
  }


  public IntelligentPromo gmtClosed(String gmtClosed) {
    
    this.gmtClosed = gmtClosed;
    return this;
  }

   /**
   * 智能营销活动下架的时间
   * @return gmtClosed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-05-01 00:00:00", value = "智能营销活动下架的时间")

  public String getGmtClosed() {
    return gmtClosed;
  }


  public void setGmtClosed(String gmtClosed) {
    this.gmtClosed = gmtClosed;
  }


  public IntelligentPromo gmtEnabled(String gmtEnabled) {
    
    this.gmtEnabled = gmtEnabled;
    return this;
  }

   /**
   * 智能营销活动的生效时间
   * @return gmtEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-05-01 00:00:00", value = "智能营销活动的生效时间")

  public String getGmtEnabled() {
    return gmtEnabled;
  }


  public void setGmtEnabled(String gmtEnabled) {
    this.gmtEnabled = gmtEnabled;
  }


  public IntelligentPromo gmtEnd(String gmtEnd) {
    
    this.gmtEnd = gmtEnd;
    return this;
  }

   /**
   * 智能营销活动的结束时间
   * @return gmtEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-05-01 00:00:00", value = "智能营销活动的结束时间")

  public String getGmtEnd() {
    return gmtEnd;
  }


  public void setGmtEnd(String gmtEnd) {
    this.gmtEnd = gmtEnd;
  }


  public IntelligentPromo gmtStart(String gmtStart) {
    
    this.gmtStart = gmtStart;
    return this;
  }

   /**
   * 智能营销活动开始时间
   * @return gmtStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-05-01 00:00:00", value = "智能营销活动开始时间")

  public String getGmtStart() {
    return gmtStart;
  }


  public void setGmtStart(String gmtStart) {
    this.gmtStart = gmtStart;
  }


  public IntelligentPromo merchantPromos(List<InteligentMerchantPromo> merchantPromos) {
    
    this.merchantPromos = merchantPromos;
    return this;
  }

  public IntelligentPromo addMerchantPromosItem(InteligentMerchantPromo merchantPromosItem) {
    if (this.merchantPromos == null) {
      this.merchantPromos = new ArrayList<>();
    }
    this.merchantPromos.add(merchantPromosItem);
    return this;
  }

   /**
   * 智能营销商户子活动列表
   * @return merchantPromos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "智能营销商户子活动列表")

  public List<InteligentMerchantPromo> getMerchantPromos() {
    return merchantPromos;
  }


  public void setMerchantPromos(List<InteligentMerchantPromo> merchantPromos) {
    this.merchantPromos = merchantPromos;
  }


  public IntelligentPromo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 智能营销活动对应的名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "全场智能营销活动", value = "智能营销活动对应的名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IntelligentPromo ownerInfo(PromoOperatorInfo ownerInfo) {
    
    this.ownerInfo = ownerInfo;
    return this;
  }

   /**
   * Get ownerInfo
   * @return ownerInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PromoOperatorInfo getOwnerInfo() {
    return ownerInfo;
  }


  public void setOwnerInfo(PromoOperatorInfo ownerInfo) {
    this.ownerInfo = ownerInfo;
  }


  public IntelligentPromo parentPromoId(String parentPromoId) {
    
    this.parentPromoId = parentPromoId;
    return this;
  }

   /**
   * 智能营销方案父id，如果需要续签智能营销活动，则会对于原有智能营销方案的id
   * @return parentPromoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20171001000000000286566911004880", value = "智能营销方案父id，如果需要续签智能营销活动，则会对于原有智能营销方案的id")

  public String getParentPromoId() {
    return parentPromoId;
  }


  public void setParentPromoId(String parentPromoId) {
    this.parentPromoId = parentPromoId;
  }


  public IntelligentPromo planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * 智能营销活动对应的方案编号
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170901000000000007027911001170", value = "智能营销活动对应的方案编号")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public IntelligentPromo promoId(String promoId) {
    
    this.promoId = promoId;
    return this;
  }

   /**
   * 智能营销方案id。《koubei.marketing.campaign.intelligent.promo.create》创建接口中这个参数不必传递，仅在查询接口中返回
   * @return promoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170905000000000092980911009880", value = "智能营销方案id。《koubei.marketing.campaign.intelligent.promo.create》创建接口中这个参数不必传递，仅在查询接口中返回")

  public String getPromoId() {
    return promoId;
  }


  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }


  public IntelligentPromo promos(List<IntelligentPromoDetail> promos) {
    
    this.promos = promos;
    return this;
  }

  public IntelligentPromo addPromosItem(IntelligentPromoDetail promosItem) {
    if (this.promos == null) {
      this.promos = new ArrayList<>();
    }
    this.promos.add(promosItem);
    return this;
  }

   /**
   * 营销活动详情列表，注意：（该参数20180125开始已不在维护，替代参数详见merchant_promos，如需接入替代参数，接之前先找开发负责人申请appid白名单）
   * @return promos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营销活动详情列表，注意：（该参数20180125开始已不在维护，替代参数详见merchant_promos，如需接入替代参数，接之前先找开发负责人申请appid白名单）")

  public List<IntelligentPromoDetail> getPromos() {
    return promos;
  }


  public void setPromos(List<IntelligentPromoDetail> promos) {
    this.promos = promos;
  }


  public IntelligentPromo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 智能营销活动状态。CREATED：已创建；ENABLED：已生效；CLOSED：已关闭；FINISHED：已完结；DISABLED:已失效（有两种情况会是失效状态，一种是服务商创建方案，商户驳回，一种是服务商创建方案，商户未确认，活动到期。）（注意：修改方案的动作不需要传递方案状态）
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREATED", value = "智能营销活动状态。CREATED：已创建；ENABLED：已生效；CLOSED：已关闭；FINISHED：已完结；DISABLED:已失效（有两种情况会是失效状态，一种是服务商创建方案，商户驳回，一种是服务商创建方案，商户未确认，活动到期。）（注意：修改方案的动作不需要传递方案状态）")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public IntelligentPromo subPromoIds(List<String> subPromoIds) {
    
    this.subPromoIds = subPromoIds;
    return this;
  }

  public IntelligentPromo addSubPromoIdsItem(String subPromoIdsItem) {
    if (this.subPromoIds == null) {
      this.subPromoIds = new ArrayList<>();
    }
    this.subPromoIds.add(subPromoIdsItem);
    return this;
  }

   /**
   * 该智能营销方案如果续签多次，则会返回该方案对应的所有智能营销子方案的promo_id
   * @return subPromoIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[2016110700077000000003446037, 2016111000077000000003446529]", value = "该智能营销方案如果续签多次，则会返回该方案对应的所有智能营销子方案的promo_id")

  public List<String> getSubPromoIds() {
    return subPromoIds;
  }


  public void setSubPromoIds(List<String> subPromoIds) {
    this.subPromoIds = subPromoIds;
  }


  public IntelligentPromo subStatus(String subStatus) {
    
    this.subStatus = subStatus;
    return this;
  }

   /**
   * 活动展示状态。已创建：CREATED；  REJECTED：创建被驳回；ENABLING：生效中；ONLINE_WAIT_CONFIRM：上架待确认；PUBLISHED：已发布（活动未到开始时间）；ENABLED：已发布已开始；OFFLINE_WAIT_CONFIRM：下架待确认；CLOSING：下架中；CLOSED：已下架（人为干预下架）；FINISHED：已结束（活动到期自然结束）；MODIFYING：修改中；MODIFY_WAIT_CONFIRM：修改待确认；DISABLED：已失效  （注意：修改接口子状态参数不能传递）
   * @return subStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENABLING", value = "活动展示状态。已创建：CREATED；  REJECTED：创建被驳回；ENABLING：生效中；ONLINE_WAIT_CONFIRM：上架待确认；PUBLISHED：已发布（活动未到开始时间）；ENABLED：已发布已开始；OFFLINE_WAIT_CONFIRM：下架待确认；CLOSING：下架中；CLOSED：已下架（人为干预下架）；FINISHED：已结束（活动到期自然结束）；MODIFYING：修改中；MODIFY_WAIT_CONFIRM：修改待确认；DISABLED：已失效  （注意：修改接口子状态参数不能传递）")

  public String getSubStatus() {
    return subStatus;
  }


  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }


  public IntelligentPromo templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 智能营销活动对应的方案中的模板编号
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170901000000000006914911002170", value = "智能营销活动对应的方案中的模板编号")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public IntelligentPromo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 智能活动类型，值如下：RECOMMENDATION：系统推荐；REGISTRATION：报名。在创建时，这个字段需要ISV自己进行决策，在推荐接口会返回优惠力度，比如代金券面额等信息，ISV判断如果优惠力度比这个大或者相同，就用RECOMMENDATION，其他情况用REGISTRATION，如推荐力度大于实际创建传过来的优惠力度，则创建的时候系统会自动将RECOMMENDATION改为REGISTRATION
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RECOMMENDATION", value = "智能活动类型，值如下：RECOMMENDATION：系统推荐；REGISTRATION：报名。在创建时，这个字段需要ISV自己进行决策，在推荐接口会返回优惠力度，比如代金券面额等信息，ISV判断如果优惠力度比这个大或者相同，就用RECOMMENDATION，其他情况用REGISTRATION，如推荐力度大于实际创建传过来的优惠力度，则创建的时候系统会自动将RECOMMENDATION改为REGISTRATION")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntelligentPromo intelligentPromo = (IntelligentPromo) o;
    return Objects.equals(this.allowAutoDelay, intelligentPromo.allowAutoDelay) &&
        Objects.equals(this.auditStatus, intelligentPromo.auditStatus) &&
        Objects.equals(this.createRequestNo, intelligentPromo.createRequestNo) &&
        Objects.equals(this.creatorInfo, intelligentPromo.creatorInfo) &&
        Objects.equals(this.desc, intelligentPromo.desc) &&
        Objects.equals(this.extInfo, intelligentPromo.extInfo) &&
        Objects.equals(this.forecastEffect, intelligentPromo.forecastEffect) &&
        Objects.equals(this.gmtClosed, intelligentPromo.gmtClosed) &&
        Objects.equals(this.gmtEnabled, intelligentPromo.gmtEnabled) &&
        Objects.equals(this.gmtEnd, intelligentPromo.gmtEnd) &&
        Objects.equals(this.gmtStart, intelligentPromo.gmtStart) &&
        Objects.equals(this.merchantPromos, intelligentPromo.merchantPromos) &&
        Objects.equals(this.name, intelligentPromo.name) &&
        Objects.equals(this.ownerInfo, intelligentPromo.ownerInfo) &&
        Objects.equals(this.parentPromoId, intelligentPromo.parentPromoId) &&
        Objects.equals(this.planId, intelligentPromo.planId) &&
        Objects.equals(this.promoId, intelligentPromo.promoId) &&
        Objects.equals(this.promos, intelligentPromo.promos) &&
        Objects.equals(this.status, intelligentPromo.status) &&
        Objects.equals(this.subPromoIds, intelligentPromo.subPromoIds) &&
        Objects.equals(this.subStatus, intelligentPromo.subStatus) &&
        Objects.equals(this.templateId, intelligentPromo.templateId) &&
        Objects.equals(this.type, intelligentPromo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAutoDelay, auditStatus, createRequestNo, creatorInfo, desc, extInfo, forecastEffect, gmtClosed, gmtEnabled, gmtEnd, gmtStart, merchantPromos, name, ownerInfo, parentPromoId, planId, promoId, promos, status, subPromoIds, subStatus, templateId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntelligentPromo {\n");
    sb.append("    allowAutoDelay: ").append(toIndentedString(allowAutoDelay)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    createRequestNo: ").append(toIndentedString(createRequestNo)).append("\n");
    sb.append("    creatorInfo: ").append(toIndentedString(creatorInfo)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    forecastEffect: ").append(toIndentedString(forecastEffect)).append("\n");
    sb.append("    gmtClosed: ").append(toIndentedString(gmtClosed)).append("\n");
    sb.append("    gmtEnabled: ").append(toIndentedString(gmtEnabled)).append("\n");
    sb.append("    gmtEnd: ").append(toIndentedString(gmtEnd)).append("\n");
    sb.append("    gmtStart: ").append(toIndentedString(gmtStart)).append("\n");
    sb.append("    merchantPromos: ").append(toIndentedString(merchantPromos)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerInfo: ").append(toIndentedString(ownerInfo)).append("\n");
    sb.append("    parentPromoId: ").append(toIndentedString(parentPromoId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
    sb.append("    promos: ").append(toIndentedString(promos)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subPromoIds: ").append(toIndentedString(subPromoIds)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("allow_auto_delay");
    openapiFields.add("audit_status");
    openapiFields.add("create_request_no");
    openapiFields.add("creator_info");
    openapiFields.add("desc");
    openapiFields.add("ext_info");
    openapiFields.add("forecast_effect");
    openapiFields.add("gmt_closed");
    openapiFields.add("gmt_enabled");
    openapiFields.add("gmt_end");
    openapiFields.add("gmt_start");
    openapiFields.add("merchant_promos");
    openapiFields.add("name");
    openapiFields.add("owner_info");
    openapiFields.add("parent_promo_id");
    openapiFields.add("plan_id");
    openapiFields.add("promo_id");
    openapiFields.add("promos");
    openapiFields.add("status");
    openapiFields.add("sub_promo_ids");
    openapiFields.add("sub_status");
    openapiFields.add("template_id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntelligentPromo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IntelligentPromo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntelligentPromo is not found in the empty JSON string", IntelligentPromo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IntelligentPromo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntelligentPromo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("audit_status") != null && !jsonObj.get("audit_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_status").toString()));
      }
      if (jsonObj.get("create_request_no") != null && !jsonObj.get("create_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_request_no").toString()));
      }
      // validate the optional field `creator_info`
      if (jsonObj.getAsJsonObject("creator_info") != null) {
        PromoOperatorInfo.validateJsonObject(jsonObj.getAsJsonObject("creator_info"));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      // validate the optional field `forecast_effect`
      if (jsonObj.getAsJsonObject("forecast_effect") != null) {
        IntelligentPromoEffect.validateJsonObject(jsonObj.getAsJsonObject("forecast_effect"));
      }
      if (jsonObj.get("gmt_closed") != null && !jsonObj.get("gmt_closed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_closed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_closed").toString()));
      }
      if (jsonObj.get("gmt_enabled") != null && !jsonObj.get("gmt_enabled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_enabled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_enabled").toString()));
      }
      if (jsonObj.get("gmt_end") != null && !jsonObj.get("gmt_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_end").toString()));
      }
      if (jsonObj.get("gmt_start") != null && !jsonObj.get("gmt_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_start").toString()));
      }
      JsonArray jsonArraymerchantPromos = jsonObj.getAsJsonArray("merchant_promos");
      if (jsonArraymerchantPromos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("merchant_promos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `merchant_promos` to be an array in the JSON string but got `%s`", jsonObj.get("merchant_promos").toString()));
        }

        // validate the optional field `merchant_promos` (array)
        for (int i = 0; i < jsonArraymerchantPromos.size(); i++) {
          InteligentMerchantPromo.validateJsonObject(jsonArraymerchantPromos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `owner_info`
      if (jsonObj.getAsJsonObject("owner_info") != null) {
        PromoOperatorInfo.validateJsonObject(jsonObj.getAsJsonObject("owner_info"));
      }
      if (jsonObj.get("parent_promo_id") != null && !jsonObj.get("parent_promo_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_promo_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_promo_id").toString()));
      }
      if (jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if (jsonObj.get("promo_id") != null && !jsonObj.get("promo_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promo_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promo_id").toString()));
      }
      JsonArray jsonArraypromos = jsonObj.getAsJsonArray("promos");
      if (jsonArraypromos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("promos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `promos` to be an array in the JSON string but got `%s`", jsonObj.get("promos").toString()));
        }

        // validate the optional field `promos` (array)
        for (int i = 0; i < jsonArraypromos.size(); i++) {
          IntelligentPromoDetail.validateJsonObject(jsonArraypromos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("sub_promo_ids") != null && !jsonObj.get("sub_promo_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_promo_ids` to be an array in the JSON string but got `%s`", jsonObj.get("sub_promo_ids").toString()));
      }
      if (jsonObj.get("sub_status") != null && !jsonObj.get("sub_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_status").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntelligentPromo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntelligentPromo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntelligentPromo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntelligentPromo.class));

       return (TypeAdapter<T>) new TypeAdapter<IntelligentPromo>() {
           @Override
           public void write(JsonWriter out, IntelligentPromo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntelligentPromo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntelligentPromo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntelligentPromo
  * @throws IOException if the JSON string is invalid with respect to IntelligentPromo
  */
  public static IntelligentPromo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntelligentPromo.class);
  }

 /**
  * Convert an instance of IntelligentPromo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

