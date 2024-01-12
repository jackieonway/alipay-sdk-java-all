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
 * KoubeiMarketingCampaignIntelligentTemplateConsultModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KoubeiMarketingCampaignIntelligentTemplateConsultModel {
  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_OPERATOR_CONTEXT = "operator_context";
  @SerializedName(SERIALIZED_NAME_OPERATOR_CONTEXT)
  private PromoOperatorInfo operatorContext;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_PROMO_ID = "promo_id";
  @SerializedName(SERIALIZED_NAME_PROMO_ID)
  private String promoId;

  public static final String SERIALIZED_NAME_SHOP_IDS = "shop_ids";
  @SerializedName(SERIALIZED_NAME_SHOP_IDS)
  private List<String> shopIds = null;

  public KoubeiMarketingCampaignIntelligentTemplateConsultModel() { 
  }

  public KoubeiMarketingCampaignIntelligentTemplateConsultModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 根据不同场景,过滤不同的门店数据,可参考值:CREATE_NORMAL:正常创建;RENEWAL_OLD:原方案续期;RENEWAL_NEW:新方案续期
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREATE_NORMAL", value = "根据不同场景,过滤不同的门店数据,可参考值:CREATE_NORMAL:正常创建;RENEWAL_OLD:原方案续期;RENEWAL_NEW:新方案续期")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public KoubeiMarketingCampaignIntelligentTemplateConsultModel operatorContext(PromoOperatorInfo operatorContext) {
    
    this.operatorContext = operatorContext;
    return this;
  }

   /**
   * Get operatorContext
   * @return operatorContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PromoOperatorInfo getOperatorContext() {
    return operatorContext;
  }


  public void setOperatorContext(PromoOperatorInfo operatorContext) {
    this.operatorContext = operatorContext;
  }


  public KoubeiMarketingCampaignIntelligentTemplateConsultModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 代表了一次请求，作为业务幂等性控制
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "432455ttrytryrt543", value = "代表了一次请求，作为业务幂等性控制")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public KoubeiMarketingCampaignIntelligentTemplateConsultModel partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 商户和支付宝交互时，用于代表支付宝分配给商户ID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "208805674367676", value = "商户和支付宝交互时，用于代表支付宝分配给商户ID")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public KoubeiMarketingCampaignIntelligentTemplateConsultModel promoId(String promoId) {
    
    this.promoId = promoId;
    return this;
  }

   /**
   * 结合biz_scene一起使用,值为RENEWAL_OLD:原方案续期、RENEWAL_NEW:新方案续期,要求必传
   * @return promoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180111000000000613692911004200", value = "结合biz_scene一起使用,值为RENEWAL_OLD:原方案续期、RENEWAL_NEW:新方案续期,要求必传")

  public String getPromoId() {
    return promoId;
  }


  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }


  public KoubeiMarketingCampaignIntelligentTemplateConsultModel shopIds(List<String> shopIds) {
    
    this.shopIds = shopIds;
    return this;
  }

  public KoubeiMarketingCampaignIntelligentTemplateConsultModel addShopIdsItem(String shopIdsItem) {
    if (this.shopIds == null) {
      this.shopIds = new ArrayList<>();
    }
    this.shopIds.add(shopIdsItem);
    return this;
  }

   /**
   * 默认(不传shop_ids门店)使用待体验门店匹配适用模板，指定门店列表(shop_ids)后根据入参匹配适用模板
   * @return shopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017090100077000000045190283", value = "默认(不传shop_ids门店)使用待体验门店匹配适用模板，指定门店列表(shop_ids)后根据入参匹配适用模板")

  public List<String> getShopIds() {
    return shopIds;
  }


  public void setShopIds(List<String> shopIds) {
    this.shopIds = shopIds;
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
   * @return the KoubeiMarketingCampaignIntelligentTemplateConsultModel instance itself
   */
  public KoubeiMarketingCampaignIntelligentTemplateConsultModel putAdditionalProperty(String key, Object value) {
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
    KoubeiMarketingCampaignIntelligentTemplateConsultModel koubeiMarketingCampaignIntelligentTemplateConsultModel = (KoubeiMarketingCampaignIntelligentTemplateConsultModel) o;
    return Objects.equals(this.bizScene, koubeiMarketingCampaignIntelligentTemplateConsultModel.bizScene) &&
        Objects.equals(this.operatorContext, koubeiMarketingCampaignIntelligentTemplateConsultModel.operatorContext) &&
        Objects.equals(this.outRequestNo, koubeiMarketingCampaignIntelligentTemplateConsultModel.outRequestNo) &&
        Objects.equals(this.partnerId, koubeiMarketingCampaignIntelligentTemplateConsultModel.partnerId) &&
        Objects.equals(this.promoId, koubeiMarketingCampaignIntelligentTemplateConsultModel.promoId) &&
        Objects.equals(this.shopIds, koubeiMarketingCampaignIntelligentTemplateConsultModel.shopIds)&&
        Objects.equals(this.additionalProperties, koubeiMarketingCampaignIntelligentTemplateConsultModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizScene, operatorContext, outRequestNo, partnerId, promoId, shopIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KoubeiMarketingCampaignIntelligentTemplateConsultModel {\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    operatorContext: ").append(toIndentedString(operatorContext)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
    sb.append("    shopIds: ").append(toIndentedString(shopIds)).append("\n");
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
    openapiFields.add("biz_scene");
    openapiFields.add("operator_context");
    openapiFields.add("out_request_no");
    openapiFields.add("partner_id");
    openapiFields.add("promo_id");
    openapiFields.add("shop_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KoubeiMarketingCampaignIntelligentTemplateConsultModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KoubeiMarketingCampaignIntelligentTemplateConsultModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KoubeiMarketingCampaignIntelligentTemplateConsultModel is not found in the empty JSON string", KoubeiMarketingCampaignIntelligentTemplateConsultModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      // validate the optional field `operator_context`
      if (jsonObj.getAsJsonObject("operator_context") != null) {
        PromoOperatorInfo.validateJsonObject(jsonObj.getAsJsonObject("operator_context"));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("promo_id") != null && !jsonObj.get("promo_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promo_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promo_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("shop_ids") != null && !jsonObj.get("shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("shop_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KoubeiMarketingCampaignIntelligentTemplateConsultModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KoubeiMarketingCampaignIntelligentTemplateConsultModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KoubeiMarketingCampaignIntelligentTemplateConsultModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KoubeiMarketingCampaignIntelligentTemplateConsultModel.class));

       return (TypeAdapter<T>) new TypeAdapter<KoubeiMarketingCampaignIntelligentTemplateConsultModel>() {
           @Override
           public void write(JsonWriter out, KoubeiMarketingCampaignIntelligentTemplateConsultModel value) throws IOException {
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
           public KoubeiMarketingCampaignIntelligentTemplateConsultModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             KoubeiMarketingCampaignIntelligentTemplateConsultModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of KoubeiMarketingCampaignIntelligentTemplateConsultModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KoubeiMarketingCampaignIntelligentTemplateConsultModel
  * @throws IOException if the JSON string is invalid with respect to KoubeiMarketingCampaignIntelligentTemplateConsultModel
  */
  public static KoubeiMarketingCampaignIntelligentTemplateConsultModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KoubeiMarketingCampaignIntelligentTemplateConsultModel.class);
  }

 /**
  * Convert an instance of KoubeiMarketingCampaignIntelligentTemplateConsultModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

