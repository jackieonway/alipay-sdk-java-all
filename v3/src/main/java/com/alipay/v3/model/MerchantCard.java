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
import com.alipay.v3.model.CardFrontTextDTO;
import com.alipay.v3.model.MdCodeInfoDTO;
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
 * MerchantCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantCard {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  public static final String SERIALIZED_NAME_BIZ_CARD_NO = "biz_card_no";
  @SerializedName(SERIALIZED_NAME_BIZ_CARD_NO)
  private String bizCardNo;

  public static final String SERIALIZED_NAME_CUSTOM_ASSETS = "custom_assets";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ASSETS)
  private String customAssets;

  public static final String SERIALIZED_NAME_EXTERNAL_CARD_NO = "external_card_no";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CARD_NO)
  private String externalCardNo;

  public static final String SERIALIZED_NAME_FRONT_IMAGE_ID = "front_image_id";
  @SerializedName(SERIALIZED_NAME_FRONT_IMAGE_ID)
  private String frontImageId;

  public static final String SERIALIZED_NAME_FRONT_TEXT_LIST = "front_text_list";
  @SerializedName(SERIALIZED_NAME_FRONT_TEXT_LIST)
  private List<CardFrontTextDTO> frontTextList = null;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_MDCODE_INFO = "mdcode_info";
  @SerializedName(SERIALIZED_NAME_MDCODE_INFO)
  private MdCodeInfoDTO mdcodeInfo;

  public static final String SERIALIZED_NAME_OPEN_DATE = "open_date";
  @SerializedName(SERIALIZED_NAME_OPEN_DATE)
  private String openDate;

  public static final String SERIALIZED_NAME_POINT = "point";
  @SerializedName(SERIALIZED_NAME_POINT)
  private String point;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_VALID_DATE = "valid_date";
  @SerializedName(SERIALIZED_NAME_VALID_DATE)
  private String validDate;

  public MerchantCard() { 
  }

  public MerchantCard balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 资金卡余额，单位：元，精确到小数点后两位。
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "资金卡余额，单位：元，精确到小数点后两位。")

  public String getBalance() {
    return balance;
  }


  public void setBalance(String balance) {
    this.balance = balance;
  }


  public MerchantCard bizCardNo(String bizCardNo) {
    
    this.bizCardNo = bizCardNo;
    return this;
  }

   /**
   * 支付宝业务卡号  说明：  1、开卡成功后返回该参数，需要保存留用；  2、开卡/更新/删卡/查询卡接口请求中不需要传该参数；
   * @return bizCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝业务卡号  说明：  1、开卡成功后返回该参数，需要保存留用；  2、开卡/更新/删卡/查询卡接口请求中不需要传该参数；")

  public String getBizCardNo() {
    return bizCardNo;
  }


  public void setBizCardNo(String bizCardNo) {
    this.bizCardNo = bizCardNo;
  }


  public MerchantCard customAssets(String customAssets) {
    
    this.customAssets = customAssets;
    return this;
  }

   /**
   * 会员卡自定义资产值，只供特定业务使用，通常接入无需关注
   * @return customAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会员卡自定义资产值，只供特定业务使用，通常接入无需关注")

  public String getCustomAssets() {
    return customAssets;
  }


  public void setCustomAssets(String customAssets) {
    this.customAssets = customAssets;
  }


  public MerchantCard externalCardNo(String externalCardNo) {
    
    this.externalCardNo = externalCardNo;
    return this;
  }

   /**
   * 商户外部会员卡卡号  说明：  1、会员卡开卡接口，如果卡类型为外部会员卡，请求中则必须提供该参数；  2、更新、查询、删除等接口，请求中则不需要提供该参数值；
   * @return externalCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户外部会员卡卡号  说明：  1、会员卡开卡接口，如果卡类型为外部会员卡，请求中则必须提供该参数；  2、更新、查询、删除等接口，请求中则不需要提供该参数值；")

  public String getExternalCardNo() {
    return externalCardNo;
  }


  public void setExternalCardNo(String externalCardNo) {
    this.externalCardNo = externalCardNo;
  }


  public MerchantCard frontImageId(String frontImageId) {
    
    this.frontImageId = frontImageId;
    return this;
  }

   /**
   * 卡面展示图片的图片ID，通过接口（alipay.offline.material.image.upload）上传图片    这里预期展示的是个人照片；  图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；  图片尺寸为230*295px，可等比放大；
   * @return frontImageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡面展示图片的图片ID，通过接口（alipay.offline.material.image.upload）上传图片    这里预期展示的是个人照片；  图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；  图片尺寸为230*295px，可等比放大；")

  public String getFrontImageId() {
    return frontImageId;
  }


  public void setFrontImageId(String frontImageId) {
    this.frontImageId = frontImageId;
  }


  public MerchantCard frontTextList(List<CardFrontTextDTO> frontTextList) {
    
    this.frontTextList = frontTextList;
    return this;
  }

  public MerchantCard addFrontTextListItem(CardFrontTextDTO frontTextListItem) {
    if (this.frontTextList == null) {
      this.frontTextList = new ArrayList<>();
    }
    this.frontTextList.add(frontTextListItem);
    return this;
  }

   /**
   * 卡面文案列表，1项对应1行文案，最多只能传入4行文案；  单行文案展现分为左右两部分，左边对应label字段，右边对应value；  形如： 学院    新闻学院
   * @return frontTextList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡面文案列表，1项对应1行文案，最多只能传入4行文案；  单行文案展现分为左右两部分，左边对应label字段，右边对应value；  形如： 学院    新闻学院")

  public List<CardFrontTextDTO> getFrontTextList() {
    return frontTextList;
  }


  public void setFrontTextList(List<CardFrontTextDTO> frontTextList) {
    this.frontTextList = frontTextList;
  }


  public MerchantCard level(String level) {
    
    this.level = level;
    return this;
  }

   /**
   * 会员卡等级（由商户自定义，并可以在卡模板创建时，定义等级信息）
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会员卡等级（由商户自定义，并可以在卡模板创建时，定义等级信息）")

  public String getLevel() {
    return level;
  }


  public void setLevel(String level) {
    this.level = level;
  }


  public MerchantCard mdcodeInfo(MdCodeInfoDTO mdcodeInfo) {
    
    this.mdcodeInfo = mdcodeInfo;
    return this;
  }

   /**
   * Get mdcodeInfo
   * @return mdcodeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MdCodeInfoDTO getMdcodeInfo() {
    return mdcodeInfo;
  }


  public void setMdcodeInfo(MdCodeInfoDTO mdcodeInfo) {
    this.mdcodeInfo = mdcodeInfo;
  }


  public MerchantCard openDate(String openDate) {
    
    this.openDate = openDate;
    return this;
  }

   /**
   * 会员卡开卡时间，格式为yyyy-MM-dd HH:mm:ss。会员卡更新时，该时间不支持修改，请传入调用开卡接口时传入的card_ext_info.open_date时间。
   * @return openDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会员卡开卡时间，格式为yyyy-MM-dd HH:mm:ss。会员卡更新时，该时间不支持修改，请传入调用开卡接口时传入的card_ext_info.open_date时间。")

  public String getOpenDate() {
    return openDate;
  }


  public void setOpenDate(String openDate) {
    this.openDate = openDate;
  }


  public MerchantCard point(String point) {
    
    this.point = point;
    return this;
  }

   /**
   * 会员卡积分，积分必须为数字型（可为浮点型，带2位小数点）
   * @return point
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会员卡积分，积分必须为数字型（可为浮点型，带2位小数点）")

  public String getPoint() {
    return point;
  }


  public void setPoint(String point) {
    this.point = point;
  }


  public MerchantCard templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 会员卡更换不同的卡模板（该参数仅用在会员卡更新接口中）
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会员卡更换不同的卡模板（该参数仅用在会员卡更新接口中）")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public MerchantCard validDate(String validDate) {
    
    this.validDate = validDate;
    return this;
  }

   /**
   * 会员卡有效期，格式为yyyy-MM-dd HH:mm:ss。会员卡更新时，该时间不支持修改，请传入调用开卡接口时传入的card_ext_info.valid_date时间。
   * @return validDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会员卡有效期，格式为yyyy-MM-dd HH:mm:ss。会员卡更新时，该时间不支持修改，请传入调用开卡接口时传入的card_ext_info.valid_date时间。")

  public String getValidDate() {
    return validDate;
  }


  public void setValidDate(String validDate) {
    this.validDate = validDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantCard merchantCard = (MerchantCard) o;
    return Objects.equals(this.balance, merchantCard.balance) &&
        Objects.equals(this.bizCardNo, merchantCard.bizCardNo) &&
        Objects.equals(this.customAssets, merchantCard.customAssets) &&
        Objects.equals(this.externalCardNo, merchantCard.externalCardNo) &&
        Objects.equals(this.frontImageId, merchantCard.frontImageId) &&
        Objects.equals(this.frontTextList, merchantCard.frontTextList) &&
        Objects.equals(this.level, merchantCard.level) &&
        Objects.equals(this.mdcodeInfo, merchantCard.mdcodeInfo) &&
        Objects.equals(this.openDate, merchantCard.openDate) &&
        Objects.equals(this.point, merchantCard.point) &&
        Objects.equals(this.templateId, merchantCard.templateId) &&
        Objects.equals(this.validDate, merchantCard.validDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, bizCardNo, customAssets, externalCardNo, frontImageId, frontTextList, level, mdcodeInfo, openDate, point, templateId, validDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantCard {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    bizCardNo: ").append(toIndentedString(bizCardNo)).append("\n");
    sb.append("    customAssets: ").append(toIndentedString(customAssets)).append("\n");
    sb.append("    externalCardNo: ").append(toIndentedString(externalCardNo)).append("\n");
    sb.append("    frontImageId: ").append(toIndentedString(frontImageId)).append("\n");
    sb.append("    frontTextList: ").append(toIndentedString(frontTextList)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    mdcodeInfo: ").append(toIndentedString(mdcodeInfo)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    validDate: ").append(toIndentedString(validDate)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("biz_card_no");
    openapiFields.add("custom_assets");
    openapiFields.add("external_card_no");
    openapiFields.add("front_image_id");
    openapiFields.add("front_text_list");
    openapiFields.add("level");
    openapiFields.add("mdcode_info");
    openapiFields.add("open_date");
    openapiFields.add("point");
    openapiFields.add("template_id");
    openapiFields.add("valid_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantCard.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantCard is not found in the empty JSON string", MerchantCard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantCard` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("balance") != null && !jsonObj.get("balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance").toString()));
      }
      if (jsonObj.get("biz_card_no") != null && !jsonObj.get("biz_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_card_no").toString()));
      }
      if (jsonObj.get("custom_assets") != null && !jsonObj.get("custom_assets").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_assets` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_assets").toString()));
      }
      if (jsonObj.get("external_card_no") != null && !jsonObj.get("external_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_card_no").toString()));
      }
      if (jsonObj.get("front_image_id") != null && !jsonObj.get("front_image_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `front_image_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("front_image_id").toString()));
      }
      JsonArray jsonArrayfrontTextList = jsonObj.getAsJsonArray("front_text_list");
      if (jsonArrayfrontTextList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("front_text_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `front_text_list` to be an array in the JSON string but got `%s`", jsonObj.get("front_text_list").toString()));
        }

        // validate the optional field `front_text_list` (array)
        for (int i = 0; i < jsonArrayfrontTextList.size(); i++) {
          CardFrontTextDTO.validateJsonObject(jsonArrayfrontTextList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("level") != null && !jsonObj.get("level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level").toString()));
      }
      // validate the optional field `mdcode_info`
      if (jsonObj.getAsJsonObject("mdcode_info") != null) {
        MdCodeInfoDTO.validateJsonObject(jsonObj.getAsJsonObject("mdcode_info"));
      }
      if (jsonObj.get("open_date") != null && !jsonObj.get("open_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_date").toString()));
      }
      if (jsonObj.get("point") != null && !jsonObj.get("point").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `point` to be a primitive type in the JSON string but got `%s`", jsonObj.get("point").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (jsonObj.get("valid_date") != null && !jsonObj.get("valid_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantCard.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantCard>() {
           @Override
           public void write(JsonWriter out, MerchantCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantCard
  * @throws IOException if the JSON string is invalid with respect to MerchantCard
  */
  public static MerchantCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantCard.class);
  }

 /**
  * Convert an instance of MerchantCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

