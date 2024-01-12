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
import com.alipay.v3.model.MerchantActivityVoucherInfo;
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
 * KoubeiMarketingCampaignItemMerchantactivityCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KoubeiMarketingCampaignItemMerchantactivityCreateModel {
  public static final String SERIALIZED_NAME_COUNT_LIMIT = "count_limit";
  @SerializedName(SERIALIZED_NAME_COUNT_LIMIT)
  private Integer countLimit;

  public static final String SERIALIZED_NAME_COUNT_LIMIT_PER_DAY = "count_limit_per_day";
  @SerializedName(SERIALIZED_NAME_COUNT_LIMIT_PER_DAY)
  private Integer countLimitPerDay;

  public static final String SERIALIZED_NAME_COUNT_LIMIT_PER_USER = "count_limit_per_user";
  @SerializedName(SERIALIZED_NAME_COUNT_LIMIT_PER_USER)
  private Integer countLimitPerUser;

  public static final String SERIALIZED_NAME_COUNT_LIMIT_PER_USER_PER_DAY = "count_limit_per_user_per_day";
  @SerializedName(SERIALIZED_NAME_COUNT_LIMIT_PER_USER_PER_DAY)
  private Integer countLimitPerUserPerDay;

  public static final String SERIALIZED_NAME_CROWD = "crowd";
  @SerializedName(SERIALIZED_NAME_CROWD)
  private String crowd;

  public static final String SERIALIZED_NAME_DEDUCT_AMOUNT = "deduct_amount";
  @SerializedName(SERIALIZED_NAME_DEDUCT_AMOUNT)
  private String deductAmount;

  public static final String SERIALIZED_NAME_EXTERNAL_CALLBACK_URL = "external_callback_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CALLBACK_URL)
  private String externalCallbackUrl;

  public static final String SERIALIZED_NAME_EXTERNAL_UNIQUE_ID = "external_unique_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_UNIQUE_ID)
  private String externalUniqueId;

  public static final String SERIALIZED_NAME_GMT_END = "gmt_end";
  @SerializedName(SERIALIZED_NAME_GMT_END)
  private String gmtEnd;

  public static final String SERIALIZED_NAME_GMT_START = "gmt_start";
  @SerializedName(SERIALIZED_NAME_GMT_START)
  private String gmtStart;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<String> itemIds = null;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_MIN_COST = "min_cost";
  @SerializedName(SERIALIZED_NAME_MIN_COST)
  private String minCost;

  public static final String SERIALIZED_NAME_OBTAIN_MANUALLY = "obtain_manually";
  @SerializedName(SERIALIZED_NAME_OBTAIN_MANUALLY)
  private Boolean obtainManually;

  public static final String SERIALIZED_NAME_VOUCHER_INFO = "voucher_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_INFO)
  private MerchantActivityVoucherInfo voucherInfo;

  public KoubeiMarketingCampaignItemMerchantactivityCreateModel() { 
  }

  public KoubeiMarketingCampaignItemMerchantactivityCreateModel countLimit(Integer countLimit) {
    
    this.countLimit = countLimit;
    return this;
  }

   /**
   * 活动优惠次数限制，必须设置。 说明：活动优惠总次数限制不能小于1，且不能大于99999999。
   * @return countLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99", value = "活动优惠次数限制，必须设置。 说明：活动优惠总次数限制不能小于1，且不能大于99999999。")

  public Integer getCountLimit() {
    return countLimit;
  }


  public void setCountLimit(Integer countLimit) {
    this.countLimit = countLimit;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel countLimitPerDay(Integer countLimitPerDay) {
    
    this.countLimitPerDay = countLimitPerDay;
    return this;
  }

   /**
   * 活动优惠单日次数限制。 说明：活动优惠单日次数限制不能为负数，不能大于99999999；0表示不限制。 
   * @return countLimitPerDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99", value = "活动优惠单日次数限制。 说明：活动优惠单日次数限制不能为负数，不能大于99999999；0表示不限制。 ")

  public Integer getCountLimitPerDay() {
    return countLimitPerDay;
  }


  public void setCountLimitPerDay(Integer countLimitPerDay) {
    this.countLimitPerDay = countLimitPerDay;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel countLimitPerUser(Integer countLimitPerUser) {
    
    this.countLimitPerUser = countLimitPerUser;
    return this;
  }

   /**
   * 活动单用户限次。 说明：活动单用户总限次不能为负数，不能大于999。0表示不限制。
   * @return countLimitPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99", value = "活动单用户限次。 说明：活动单用户总限次不能为负数，不能大于999。0表示不限制。")

  public Integer getCountLimitPerUser() {
    return countLimitPerUser;
  }


  public void setCountLimitPerUser(Integer countLimitPerUser) {
    this.countLimitPerUser = countLimitPerUser;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel countLimitPerUserPerDay(Integer countLimitPerUserPerDay) {
    
    this.countLimitPerUserPerDay = countLimitPerUserPerDay;
    return this;
  }

   /**
   * 活动单用户单日限次。 说明：活动单用户单日限次不能为负数，不能大于999。0表示不限制。
   * @return countLimitPerUserPerDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99", value = "活动单用户单日限次。 说明：活动单用户单日限次不能为负数，不能大于999。0表示不限制。")

  public Integer getCountLimitPerUserPerDay() {
    return countLimitPerUserPerDay;
  }


  public void setCountLimitPerUserPerDay(Integer countLimitPerUserPerDay) {
    this.countLimitPerUserPerDay = countLimitPerUserPerDay;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel crowd(String crowd) {
    
    this.crowd = crowd;
    return this;
  }

   /**
   * 群规则，枚举支持： * DEFAULT： 全部用户； * ONLINE_NEWCOMER：在线购买新人； * MEMBER：会员。
   * @return crowd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "群规则，枚举支持： * DEFAULT： 全部用户； * ONLINE_NEWCOMER：在线购买新人； * MEMBER：会员。")

  public String getCrowd() {
    return crowd;
  }


  public void setCrowd(String crowd) {
    this.crowd = crowd;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel deductAmount(String deductAmount) {
    
    this.deductAmount = deductAmount;
    return this;
  }

   /**
   * 代金券面额，单位为元。 说明：代金券面额格式必须为#.##，代金券面额需小于49999。
   * @return deductAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.00", value = "代金券面额，单位为元。 说明：代金券面额格式必须为#.##，代金券面额需小于49999。")

  public String getDeductAmount() {
    return deductAmount;
  }


  public void setDeductAmount(String deductAmount) {
    this.deductAmount = deductAmount;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel externalCallbackUrl(String externalCallbackUrl) {
    
    this.externalCallbackUrl = externalCallbackUrl;
    return this;
  }

   /**
   * 外部回调地址，最大字符数不能超过500。
   * @return externalCallbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxxx", value = "外部回调地址，最大字符数不能超过500。")

  public String getExternalCallbackUrl() {
    return externalCallbackUrl;
  }


  public void setExternalCallbackUrl(String externalCallbackUrl) {
    this.externalCallbackUrl = externalCallbackUrl;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel externalUniqueId(String externalUniqueId) {
    
    this.externalUniqueId = externalUniqueId;
    return this;
  }

   /**
   * 外部id，需保证同一账户下唯一。 说明：最小长度不能低于13，最大长度不能超过64。
   * @return externalUniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4b203fe6c11548bcabd8da5bb087a83b", value = "外部id，需保证同一账户下唯一。 说明：最小长度不能低于13，最大长度不能超过64。")

  public String getExternalUniqueId() {
    return externalUniqueId;
  }


  public void setExternalUniqueId(String externalUniqueId) {
    this.externalUniqueId = externalUniqueId;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel gmtEnd(String gmtEnd) {
    
    this.gmtEnd = gmtEnd;
    return this;
  }

   /**
   * 活动结束时间。活动结束时间需大于活动开始时间。格式为\&quot;yyyy-MM-dd HH:mm:ss\&quot;。
   * @return gmtEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-12-26 21:07:23", value = "活动结束时间。活动结束时间需大于活动开始时间。格式为\"yyyy-MM-dd HH:mm:ss\"。")

  public String getGmtEnd() {
    return gmtEnd;
  }


  public void setGmtEnd(String gmtEnd) {
    this.gmtEnd = gmtEnd;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel gmtStart(String gmtStart) {
    
    this.gmtStart = gmtStart;
    return this;
  }

   /**
   * 活动开始时间。格式为\&quot;yyyy-MM-dd HH:mm:ss\&quot;。
   * @return gmtStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-12-26 21:07:23", value = "活动开始时间。格式为\"yyyy-MM-dd HH:mm:ss\"。")

  public String getGmtStart() {
    return gmtStart;
  }


  public void setGmtStart(String gmtStart) {
    this.gmtStart = gmtStart;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel itemIds(List<String> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public KoubeiMarketingCampaignItemMerchantactivityCreateModel addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * 商品列表。 说明：参加活动的商品列表不能为空，最大个数不能超过100。
   * @return itemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088xxxxx\",\"2088xxxx\"]", value = "商品列表。 说明：参加活动的商品列表不能为空，最大个数不能超过100。")

  public List<String> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注。 说明：备注最大字符数不能超过500。
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "备注", value = "备注。 说明：备注最大字符数不能超过500。")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel minCost(String minCost) {
    
    this.minCost = minCost;
    return this;
  }

   /**
   * 使用门槛，即满 min_cost 元可用，使用门槛必须大于券面额，单位为元。 说明：使用门槛格式必须为#.##。
   * @return minCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.00", value = "使用门槛，即满 min_cost 元可用，使用门槛必须大于券面额，单位为元。 说明：使用门槛格式必须为#.##。")

  public String getMinCost() {
    return minCost;
  }


  public void setMinCost(String minCost) {
    this.minCost = minCost;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel obtainManually(Boolean obtainManually) {
    
    this.obtainManually = obtainManually;
    return this;
  }

   /**
   * 是否手动领取，本期只支持true
   * @return obtainManually
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否手动领取，本期只支持true")

  public Boolean getObtainManually() {
    return obtainManually;
  }


  public void setObtainManually(Boolean obtainManually) {
    this.obtainManually = obtainManually;
  }


  public KoubeiMarketingCampaignItemMerchantactivityCreateModel voucherInfo(MerchantActivityVoucherInfo voucherInfo) {
    
    this.voucherInfo = voucherInfo;
    return this;
  }

   /**
   * Get voucherInfo
   * @return voucherInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantActivityVoucherInfo getVoucherInfo() {
    return voucherInfo;
  }


  public void setVoucherInfo(MerchantActivityVoucherInfo voucherInfo) {
    this.voucherInfo = voucherInfo;
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
   * @return the KoubeiMarketingCampaignItemMerchantactivityCreateModel instance itself
   */
  public KoubeiMarketingCampaignItemMerchantactivityCreateModel putAdditionalProperty(String key, Object value) {
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
    KoubeiMarketingCampaignItemMerchantactivityCreateModel koubeiMarketingCampaignItemMerchantactivityCreateModel = (KoubeiMarketingCampaignItemMerchantactivityCreateModel) o;
    return Objects.equals(this.countLimit, koubeiMarketingCampaignItemMerchantactivityCreateModel.countLimit) &&
        Objects.equals(this.countLimitPerDay, koubeiMarketingCampaignItemMerchantactivityCreateModel.countLimitPerDay) &&
        Objects.equals(this.countLimitPerUser, koubeiMarketingCampaignItemMerchantactivityCreateModel.countLimitPerUser) &&
        Objects.equals(this.countLimitPerUserPerDay, koubeiMarketingCampaignItemMerchantactivityCreateModel.countLimitPerUserPerDay) &&
        Objects.equals(this.crowd, koubeiMarketingCampaignItemMerchantactivityCreateModel.crowd) &&
        Objects.equals(this.deductAmount, koubeiMarketingCampaignItemMerchantactivityCreateModel.deductAmount) &&
        Objects.equals(this.externalCallbackUrl, koubeiMarketingCampaignItemMerchantactivityCreateModel.externalCallbackUrl) &&
        Objects.equals(this.externalUniqueId, koubeiMarketingCampaignItemMerchantactivityCreateModel.externalUniqueId) &&
        Objects.equals(this.gmtEnd, koubeiMarketingCampaignItemMerchantactivityCreateModel.gmtEnd) &&
        Objects.equals(this.gmtStart, koubeiMarketingCampaignItemMerchantactivityCreateModel.gmtStart) &&
        Objects.equals(this.itemIds, koubeiMarketingCampaignItemMerchantactivityCreateModel.itemIds) &&
        Objects.equals(this.memo, koubeiMarketingCampaignItemMerchantactivityCreateModel.memo) &&
        Objects.equals(this.minCost, koubeiMarketingCampaignItemMerchantactivityCreateModel.minCost) &&
        Objects.equals(this.obtainManually, koubeiMarketingCampaignItemMerchantactivityCreateModel.obtainManually) &&
        Objects.equals(this.voucherInfo, koubeiMarketingCampaignItemMerchantactivityCreateModel.voucherInfo)&&
        Objects.equals(this.additionalProperties, koubeiMarketingCampaignItemMerchantactivityCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countLimit, countLimitPerDay, countLimitPerUser, countLimitPerUserPerDay, crowd, deductAmount, externalCallbackUrl, externalUniqueId, gmtEnd, gmtStart, itemIds, memo, minCost, obtainManually, voucherInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KoubeiMarketingCampaignItemMerchantactivityCreateModel {\n");
    sb.append("    countLimit: ").append(toIndentedString(countLimit)).append("\n");
    sb.append("    countLimitPerDay: ").append(toIndentedString(countLimitPerDay)).append("\n");
    sb.append("    countLimitPerUser: ").append(toIndentedString(countLimitPerUser)).append("\n");
    sb.append("    countLimitPerUserPerDay: ").append(toIndentedString(countLimitPerUserPerDay)).append("\n");
    sb.append("    crowd: ").append(toIndentedString(crowd)).append("\n");
    sb.append("    deductAmount: ").append(toIndentedString(deductAmount)).append("\n");
    sb.append("    externalCallbackUrl: ").append(toIndentedString(externalCallbackUrl)).append("\n");
    sb.append("    externalUniqueId: ").append(toIndentedString(externalUniqueId)).append("\n");
    sb.append("    gmtEnd: ").append(toIndentedString(gmtEnd)).append("\n");
    sb.append("    gmtStart: ").append(toIndentedString(gmtStart)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    minCost: ").append(toIndentedString(minCost)).append("\n");
    sb.append("    obtainManually: ").append(toIndentedString(obtainManually)).append("\n");
    sb.append("    voucherInfo: ").append(toIndentedString(voucherInfo)).append("\n");
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
    openapiFields.add("count_limit");
    openapiFields.add("count_limit_per_day");
    openapiFields.add("count_limit_per_user");
    openapiFields.add("count_limit_per_user_per_day");
    openapiFields.add("crowd");
    openapiFields.add("deduct_amount");
    openapiFields.add("external_callback_url");
    openapiFields.add("external_unique_id");
    openapiFields.add("gmt_end");
    openapiFields.add("gmt_start");
    openapiFields.add("item_ids");
    openapiFields.add("memo");
    openapiFields.add("min_cost");
    openapiFields.add("obtain_manually");
    openapiFields.add("voucher_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KoubeiMarketingCampaignItemMerchantactivityCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KoubeiMarketingCampaignItemMerchantactivityCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KoubeiMarketingCampaignItemMerchantactivityCreateModel is not found in the empty JSON string", KoubeiMarketingCampaignItemMerchantactivityCreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("crowd") != null && !jsonObj.get("crowd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crowd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crowd").toString()));
      }
      if (jsonObj.get("deduct_amount") != null && !jsonObj.get("deduct_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deduct_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deduct_amount").toString()));
      }
      if (jsonObj.get("external_callback_url") != null && !jsonObj.get("external_callback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_callback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_callback_url").toString()));
      }
      if (jsonObj.get("external_unique_id") != null && !jsonObj.get("external_unique_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_unique_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_unique_id").toString()));
      }
      if (jsonObj.get("gmt_end") != null && !jsonObj.get("gmt_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_end").toString()));
      }
      if (jsonObj.get("gmt_start") != null && !jsonObj.get("gmt_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_start").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("item_ids") != null && !jsonObj.get("item_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_ids` to be an array in the JSON string but got `%s`", jsonObj.get("item_ids").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("min_cost") != null && !jsonObj.get("min_cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_cost").toString()));
      }
      // validate the optional field `voucher_info`
      if (jsonObj.getAsJsonObject("voucher_info") != null) {
        MerchantActivityVoucherInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KoubeiMarketingCampaignItemMerchantactivityCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KoubeiMarketingCampaignItemMerchantactivityCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KoubeiMarketingCampaignItemMerchantactivityCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KoubeiMarketingCampaignItemMerchantactivityCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<KoubeiMarketingCampaignItemMerchantactivityCreateModel>() {
           @Override
           public void write(JsonWriter out, KoubeiMarketingCampaignItemMerchantactivityCreateModel value) throws IOException {
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
           public KoubeiMarketingCampaignItemMerchantactivityCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             KoubeiMarketingCampaignItemMerchantactivityCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of KoubeiMarketingCampaignItemMerchantactivityCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KoubeiMarketingCampaignItemMerchantactivityCreateModel
  * @throws IOException if the JSON string is invalid with respect to KoubeiMarketingCampaignItemMerchantactivityCreateModel
  */
  public static KoubeiMarketingCampaignItemMerchantactivityCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KoubeiMarketingCampaignItemMerchantactivityCreateModel.class);
  }

 /**
  * Convert an instance of KoubeiMarketingCampaignItemMerchantactivityCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

