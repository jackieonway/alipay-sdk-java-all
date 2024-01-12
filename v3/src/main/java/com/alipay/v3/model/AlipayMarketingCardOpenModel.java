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
import com.alipay.v3.model.CardUserInfo;
import com.alipay.v3.model.MerchantCard;
import com.alipay.v3.model.MerchantMenber;
import com.alipay.v3.model.PaidOuterCardExtraInfoDTO;
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
 * AlipayMarketingCardOpenModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardOpenModel {
  public static final String SERIALIZED_NAME_CARD_EXT_INFO = "card_ext_info";
  @SerializedName(SERIALIZED_NAME_CARD_EXT_INFO)
  private MerchantCard cardExtInfo;

  public static final String SERIALIZED_NAME_CARD_TEMPLATE_ID = "card_template_id";
  @SerializedName(SERIALIZED_NAME_CARD_TEMPLATE_ID)
  private String cardTemplateId;

  public static final String SERIALIZED_NAME_CARD_USER_INFO = "card_user_info";
  @SerializedName(SERIALIZED_NAME_CARD_USER_INFO)
  private CardUserInfo cardUserInfo;

  public static final String SERIALIZED_NAME_MEMBER_EXT_INFO = "member_ext_info";
  @SerializedName(SERIALIZED_NAME_MEMBER_EXT_INFO)
  private MerchantMenber memberExtInfo;

  public static final String SERIALIZED_NAME_OPEN_CARD_CHANNEL = "open_card_channel";
  @SerializedName(SERIALIZED_NAME_OPEN_CARD_CHANNEL)
  private String openCardChannel;

  public static final String SERIALIZED_NAME_OPEN_CARD_CHANNEL_ID = "open_card_channel_id";
  @SerializedName(SERIALIZED_NAME_OPEN_CARD_CHANNEL_ID)
  private String openCardChannelId;

  public static final String SERIALIZED_NAME_OUT_SERIAL_NO = "out_serial_no";
  @SerializedName(SERIALIZED_NAME_OUT_SERIAL_NO)
  private String outSerialNo;

  public static final String SERIALIZED_NAME_PAID_OUTER_CARD_INFO = "paid_outer_card_info";
  @SerializedName(SERIALIZED_NAME_PAID_OUTER_CARD_INFO)
  private PaidOuterCardExtraInfoDTO paidOuterCardInfo;

  public AlipayMarketingCardOpenModel() { 
  }

  public AlipayMarketingCardOpenModel cardExtInfo(MerchantCard cardExtInfo) {
    
    this.cardExtInfo = cardExtInfo;
    return this;
  }

   /**
   * Get cardExtInfo
   * @return cardExtInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantCard getCardExtInfo() {
    return cardExtInfo;
  }


  public void setCardExtInfo(MerchantCard cardExtInfo) {
    this.cardExtInfo = cardExtInfo;
  }


  public AlipayMarketingCardOpenModel cardTemplateId(String cardTemplateId) {
    
    this.cardTemplateId = cardTemplateId;
    return this;
  }

   /**
   * 支付宝分配的卡模板Id（卡模板创建接口返回的模板ID）
   * @return cardTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201606270000001", value = "支付宝分配的卡模板Id（卡模板创建接口返回的模板ID）")

  public String getCardTemplateId() {
    return cardTemplateId;
  }


  public void setCardTemplateId(String cardTemplateId) {
    this.cardTemplateId = cardTemplateId;
  }


  public AlipayMarketingCardOpenModel cardUserInfo(CardUserInfo cardUserInfo) {
    
    this.cardUserInfo = cardUserInfo;
    return this;
  }

   /**
   * Get cardUserInfo
   * @return cardUserInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardUserInfo getCardUserInfo() {
    return cardUserInfo;
  }


  public void setCardUserInfo(CardUserInfo cardUserInfo) {
    this.cardUserInfo = cardUserInfo;
  }


  public AlipayMarketingCardOpenModel memberExtInfo(MerchantMenber memberExtInfo) {
    
    this.memberExtInfo = memberExtInfo;
    return this;
  }

   /**
   * Get memberExtInfo
   * @return memberExtInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantMenber getMemberExtInfo() {
    return memberExtInfo;
  }


  public void setMemberExtInfo(MerchantMenber memberExtInfo) {
    this.memberExtInfo = memberExtInfo;
  }


  public AlipayMarketingCardOpenModel openCardChannel(String openCardChannel) {
    
    this.openCardChannel = openCardChannel;
    return this;
  }

   /**
   * 领卡渠道，用于记录外部商户端领卡来源的渠道信息，渠道值可自行定义（仅限数字、字母、下划线）   可直接标识领卡渠道，也可配合open_card_channel_id标识领卡渠道类型：  例如：  线下门店领取:20161534000000000008863（直接标识领卡渠道，门店shopId）  线下扫二维码领取:QR（标识领卡类型）;  线下活动领取:20170522000000000003609（直接标识领卡渠道，商户活动ID）
   * @return openCardChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20161534000000000008863", value = "领卡渠道，用于记录外部商户端领卡来源的渠道信息，渠道值可自行定义（仅限数字、字母、下划线）   可直接标识领卡渠道，也可配合open_card_channel_id标识领卡渠道类型：  例如：  线下门店领取:20161534000000000008863（直接标识领卡渠道，门店shopId）  线下扫二维码领取:QR（标识领卡类型）;  线下活动领取:20170522000000000003609（直接标识领卡渠道，商户活动ID）")

  public String getOpenCardChannel() {
    return openCardChannel;
  }


  public void setOpenCardChannel(String openCardChannel) {
    this.openCardChannel = openCardChannel;
  }


  public AlipayMarketingCardOpenModel openCardChannelId(String openCardChannelId) {
    
    this.openCardChannelId = openCardChannelId;
    return this;
  }

   /**
   * 领卡来源的渠道id，注意区别于open_card_channel领卡渠道；  一般使用场景：  open_card_channel用于区分渠道类型，例如取值为\&quot;SHOP\&quot;（门店），\&quot;ACTIVITY\&quot;（活动）；  则open_card_channel_id可用于区分同渠道的不同实体，对应取各门店ID或各活动的标识ID等；
   * @return openCardChannelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123123123123", value = "领卡来源的渠道id，注意区别于open_card_channel领卡渠道；  一般使用场景：  open_card_channel用于区分渠道类型，例如取值为\"SHOP\"（门店），\"ACTIVITY\"（活动）；  则open_card_channel_id可用于区分同渠道的不同实体，对应取各门店ID或各活动的标识ID等；")

  public String getOpenCardChannelId() {
    return openCardChannelId;
  }


  public void setOpenCardChannelId(String openCardChannelId) {
    this.openCardChannelId = openCardChannelId;
  }


  public AlipayMarketingCardOpenModel outSerialNo(String outSerialNo) {
    
    this.outSerialNo = outSerialNo;
    return this;
  }

   /**
   * 外部商户流水号。由商户自定义，需保证商户系统中唯一。
   * @return outSerialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016062700001", value = "外部商户流水号。由商户自定义，需保证商户系统中唯一。")

  public String getOutSerialNo() {
    return outSerialNo;
  }


  public void setOutSerialNo(String outSerialNo) {
    this.outSerialNo = outSerialNo;
  }


  public AlipayMarketingCardOpenModel paidOuterCardInfo(PaidOuterCardExtraInfoDTO paidOuterCardInfo) {
    
    this.paidOuterCardInfo = paidOuterCardInfo;
    return this;
  }

   /**
   * Get paidOuterCardInfo
   * @return paidOuterCardInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaidOuterCardExtraInfoDTO getPaidOuterCardInfo() {
    return paidOuterCardInfo;
  }


  public void setPaidOuterCardInfo(PaidOuterCardExtraInfoDTO paidOuterCardInfo) {
    this.paidOuterCardInfo = paidOuterCardInfo;
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
   * @return the AlipayMarketingCardOpenModel instance itself
   */
  public AlipayMarketingCardOpenModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingCardOpenModel alipayMarketingCardOpenModel = (AlipayMarketingCardOpenModel) o;
    return Objects.equals(this.cardExtInfo, alipayMarketingCardOpenModel.cardExtInfo) &&
        Objects.equals(this.cardTemplateId, alipayMarketingCardOpenModel.cardTemplateId) &&
        Objects.equals(this.cardUserInfo, alipayMarketingCardOpenModel.cardUserInfo) &&
        Objects.equals(this.memberExtInfo, alipayMarketingCardOpenModel.memberExtInfo) &&
        Objects.equals(this.openCardChannel, alipayMarketingCardOpenModel.openCardChannel) &&
        Objects.equals(this.openCardChannelId, alipayMarketingCardOpenModel.openCardChannelId) &&
        Objects.equals(this.outSerialNo, alipayMarketingCardOpenModel.outSerialNo) &&
        Objects.equals(this.paidOuterCardInfo, alipayMarketingCardOpenModel.paidOuterCardInfo)&&
        Objects.equals(this.additionalProperties, alipayMarketingCardOpenModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardExtInfo, cardTemplateId, cardUserInfo, memberExtInfo, openCardChannel, openCardChannelId, outSerialNo, paidOuterCardInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardOpenModel {\n");
    sb.append("    cardExtInfo: ").append(toIndentedString(cardExtInfo)).append("\n");
    sb.append("    cardTemplateId: ").append(toIndentedString(cardTemplateId)).append("\n");
    sb.append("    cardUserInfo: ").append(toIndentedString(cardUserInfo)).append("\n");
    sb.append("    memberExtInfo: ").append(toIndentedString(memberExtInfo)).append("\n");
    sb.append("    openCardChannel: ").append(toIndentedString(openCardChannel)).append("\n");
    sb.append("    openCardChannelId: ").append(toIndentedString(openCardChannelId)).append("\n");
    sb.append("    outSerialNo: ").append(toIndentedString(outSerialNo)).append("\n");
    sb.append("    paidOuterCardInfo: ").append(toIndentedString(paidOuterCardInfo)).append("\n");
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
    openapiFields.add("card_ext_info");
    openapiFields.add("card_template_id");
    openapiFields.add("card_user_info");
    openapiFields.add("member_ext_info");
    openapiFields.add("open_card_channel");
    openapiFields.add("open_card_channel_id");
    openapiFields.add("out_serial_no");
    openapiFields.add("paid_outer_card_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardOpenModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardOpenModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardOpenModel is not found in the empty JSON string", AlipayMarketingCardOpenModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `card_ext_info`
      if (jsonObj.getAsJsonObject("card_ext_info") != null) {
        MerchantCard.validateJsonObject(jsonObj.getAsJsonObject("card_ext_info"));
      }
      if (jsonObj.get("card_template_id") != null && !jsonObj.get("card_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_template_id").toString()));
      }
      // validate the optional field `card_user_info`
      if (jsonObj.getAsJsonObject("card_user_info") != null) {
        CardUserInfo.validateJsonObject(jsonObj.getAsJsonObject("card_user_info"));
      }
      // validate the optional field `member_ext_info`
      if (jsonObj.getAsJsonObject("member_ext_info") != null) {
        MerchantMenber.validateJsonObject(jsonObj.getAsJsonObject("member_ext_info"));
      }
      if (jsonObj.get("open_card_channel") != null && !jsonObj.get("open_card_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_card_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_card_channel").toString()));
      }
      if (jsonObj.get("open_card_channel_id") != null && !jsonObj.get("open_card_channel_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_card_channel_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_card_channel_id").toString()));
      }
      if (jsonObj.get("out_serial_no") != null && !jsonObj.get("out_serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_serial_no").toString()));
      }
      // validate the optional field `paid_outer_card_info`
      if (jsonObj.getAsJsonObject("paid_outer_card_info") != null) {
        PaidOuterCardExtraInfoDTO.validateJsonObject(jsonObj.getAsJsonObject("paid_outer_card_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardOpenModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardOpenModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardOpenModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardOpenModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardOpenModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardOpenModel value) throws IOException {
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
           public AlipayMarketingCardOpenModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingCardOpenModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingCardOpenModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardOpenModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardOpenModel
  */
  public static AlipayMarketingCardOpenModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardOpenModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardOpenModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

