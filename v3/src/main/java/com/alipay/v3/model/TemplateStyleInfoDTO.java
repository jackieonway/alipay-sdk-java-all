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
 * TemplateStyleInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateStyleInfoDTO {
  public static final String SERIALIZED_NAME_BACKGROUND_ID = "background_id";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_ID)
  private String backgroundId;

  public static final String SERIALIZED_NAME_BANNER_IMG_ID = "banner_img_id";
  @SerializedName(SERIALIZED_NAME_BANNER_IMG_ID)
  private String bannerImgId;

  public static final String SERIALIZED_NAME_BANNER_URL = "banner_url";
  @SerializedName(SERIALIZED_NAME_BANNER_URL)
  private String bannerUrl;

  public static final String SERIALIZED_NAME_BG_COLOR = "bg_color";
  @SerializedName(SERIALIZED_NAME_BG_COLOR)
  private String bgColor;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_CARD_SHOW_NAME = "card_show_name";
  @SerializedName(SERIALIZED_NAME_CARD_SHOW_NAME)
  private String cardShowName;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_COLUMN_INFO_LAYOUT = "column_info_layout";
  @SerializedName(SERIALIZED_NAME_COLUMN_INFO_LAYOUT)
  private String columnInfoLayout;

  public static final String SERIALIZED_NAME_FEATURE_DESCRIPTIONS = "feature_descriptions";
  @SerializedName(SERIALIZED_NAME_FEATURE_DESCRIPTIONS)
  private List<String> featureDescriptions = null;

  public static final String SERIALIZED_NAME_FRONT_IMAGE_ENABLE = "front_image_enable";
  @SerializedName(SERIALIZED_NAME_FRONT_IMAGE_ENABLE)
  private Boolean frontImageEnable;

  public static final String SERIALIZED_NAME_FRONT_TEXT_LIST_ENABLE = "front_text_list_enable";
  @SerializedName(SERIALIZED_NAME_FRONT_TEXT_LIST_ENABLE)
  private Boolean frontTextListEnable;

  public static final String SERIALIZED_NAME_LOGO_ID = "logo_id";
  @SerializedName(SERIALIZED_NAME_LOGO_ID)
  private String logoId;

  public static final String SERIALIZED_NAME_SLOGAN = "slogan";
  @SerializedName(SERIALIZED_NAME_SLOGAN)
  private String slogan;

  public static final String SERIALIZED_NAME_SLOGAN_IMG_ID = "slogan_img_id";
  @SerializedName(SERIALIZED_NAME_SLOGAN_IMG_ID)
  private String sloganImgId;

  public TemplateStyleInfoDTO() { 
  }

  public TemplateStyleInfoDTO backgroundId(String backgroundId) {
    
    this.backgroundId = backgroundId;
    return this;
  }

   /**
   * 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片    图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；  尺寸不小于1020*643px；  图片不得有圆角，不得拉伸变形
   * @return backgroundId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片    图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；  尺寸不小于1020*643px；  图片不得有圆角，不得拉伸变形")

  public String getBackgroundId() {
    return backgroundId;
  }


  public void setBackgroundId(String backgroundId) {
    this.backgroundId = backgroundId;
  }


  public TemplateStyleInfoDTO bannerImgId(String bannerImgId) {
    
    this.bannerImgId = bannerImgId;
    return this;
  }

   /**
   * banner图片id。 通过接口（alipay.offline.material.image.upload）上传图片。
   * @return bannerImgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "banner图片id。 通过接口（alipay.offline.material.image.upload）上传图片。")

  public String getBannerImgId() {
    return bannerImgId;
  }


  public void setBannerImgId(String bannerImgId) {
    this.bannerImgId = bannerImgId;
  }


  public TemplateStyleInfoDTO bannerUrl(String bannerUrl) {
    
    this.bannerUrl = bannerUrl;
    return this;
  }

   /**
   * banner跳转地址。
   * @return bannerUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "banner跳转地址。")

  public String getBannerUrl() {
    return bannerUrl;
  }


  public void setBannerUrl(String bannerUrl) {
    this.bannerUrl = bannerUrl;
  }


  public TemplateStyleInfoDTO bgColor(String bgColor) {
    
    this.bgColor = bgColor;
    return this;
  }

   /**
   * 字体颜色（非背景色），只影响卡详情中部信息区域字体颜色
   * @return bgColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "字体颜色（非背景色），只影响卡详情中部信息区域字体颜色")

  public String getBgColor() {
    return bgColor;
  }


  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }


  public TemplateStyleInfoDTO brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 品牌商名称
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "品牌商名称")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public TemplateStyleInfoDTO cardShowName(String cardShowName) {
    
    this.cardShowName = cardShowName;
    return this;
  }

   /**
   * 钱包端显示名称
   * @return cardShowName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "钱包端显示名称")

  public String getCardShowName() {
    return cardShowName;
  }


  public void setCardShowName(String cardShowName) {
    this.cardShowName = cardShowName;
  }


  public TemplateStyleInfoDTO color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * 注意：此字段已废弃。
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "注意：此字段已废弃。")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public TemplateStyleInfoDTO columnInfoLayout(String columnInfoLayout) {
    
    this.columnInfoLayout = columnInfoLayout;
    return this;
  }

   /**
   * 如果为空则默认为list。
   * @return columnInfoLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "如果为空则默认为list。")

  public String getColumnInfoLayout() {
    return columnInfoLayout;
  }


  public void setColumnInfoLayout(String columnInfoLayout) {
    this.columnInfoLayout = columnInfoLayout;
  }


  public TemplateStyleInfoDTO featureDescriptions(List<String> featureDescriptions) {
    
    this.featureDescriptions = featureDescriptions;
    return this;
  }

  public TemplateStyleInfoDTO addFeatureDescriptionsItem(String featureDescriptionsItem) {
    if (this.featureDescriptions == null) {
      this.featureDescriptions = new ArrayList<>();
    }
    this.featureDescriptions.add(featureDescriptionsItem);
    return this;
  }

   /**
   * 特色信息，用于领卡预览
   * @return featureDescriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "特色信息，用于领卡预览")

  public List<String> getFeatureDescriptions() {
    return featureDescriptions;
  }


  public void setFeatureDescriptions(List<String> featureDescriptions) {
    this.featureDescriptions = featureDescriptions;
  }


  public TemplateStyleInfoDTO frontImageEnable(Boolean frontImageEnable) {
    
    this.frontImageEnable = frontImageEnable;
    return this;
  }

   /**
   * 设置是否在卡面展示（个人头像）图片信息，默认不展示；  当前仅用于身份验证信息类型的个人头像图片；  图片id随创建卡/更新卡时传入；  详见会员卡产品文档。
   * @return frontImageEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设置是否在卡面展示（个人头像）图片信息，默认不展示；  当前仅用于身份验证信息类型的个人头像图片；  图片id随创建卡/更新卡时传入；  详见会员卡产品文档。")

  public Boolean getFrontImageEnable() {
    return frontImageEnable;
  }


  public void setFrontImageEnable(Boolean frontImageEnable) {
    this.frontImageEnable = frontImageEnable;
  }


  public TemplateStyleInfoDTO frontTextListEnable(Boolean frontTextListEnable) {
    
    this.frontTextListEnable = frontTextListEnable;
    return this;
  }

   /**
   * 设置是否在卡面展示文案信息，默认不展示；  文案信息分行展示，最多展示4行文案，每行文案分为label和value两部分；  文案实际内容随创建卡/更新卡时传入；  详见会员卡产品说明文档。
   * @return frontTextListEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设置是否在卡面展示文案信息，默认不展示；  文案信息分行展示，最多展示4行文案，每行文案分为label和value两部分；  文案实际内容随创建卡/更新卡时传入；  详见会员卡产品说明文档。")

  public Boolean getFrontTextListEnable() {
    return frontTextListEnable;
  }


  public void setFrontTextListEnable(Boolean frontTextListEnable) {
    this.frontTextListEnable = frontTextListEnable;
  }


  public TemplateStyleInfoDTO logoId(String logoId) {
    
    this.logoId = logoId;
    return this;
  }

   /**
   * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片    图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；  尺寸不小于500*500px的正方形；  请优先使用商家LOGO；
   * @return logoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片    图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；  尺寸不小于500*500px的正方形；  请优先使用商家LOGO；")

  public String getLogoId() {
    return logoId;
  }


  public void setLogoId(String logoId) {
    this.logoId = logoId;
  }


  public TemplateStyleInfoDTO slogan(String slogan) {
    
    this.slogan = slogan;
    return this;
  }

   /**
   * 标语
   * @return slogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标语")

  public String getSlogan() {
    return slogan;
  }


  public void setSlogan(String slogan) {
    this.slogan = slogan;
  }


  public TemplateStyleInfoDTO sloganImgId(String sloganImgId) {
    
    this.sloganImgId = sloganImgId;
    return this;
  }

   /**
   * 标语图片id， 通过接口（alipay.offline.material.image.upload）上传图片
   * @return sloganImgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标语图片id， 通过接口（alipay.offline.material.image.upload）上传图片")

  public String getSloganImgId() {
    return sloganImgId;
  }


  public void setSloganImgId(String sloganImgId) {
    this.sloganImgId = sloganImgId;
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
   * @return the TemplateStyleInfoDTO instance itself
   */
  public TemplateStyleInfoDTO putAdditionalProperty(String key, Object value) {
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
    TemplateStyleInfoDTO templateStyleInfoDTO = (TemplateStyleInfoDTO) o;
    return Objects.equals(this.backgroundId, templateStyleInfoDTO.backgroundId) &&
        Objects.equals(this.bannerImgId, templateStyleInfoDTO.bannerImgId) &&
        Objects.equals(this.bannerUrl, templateStyleInfoDTO.bannerUrl) &&
        Objects.equals(this.bgColor, templateStyleInfoDTO.bgColor) &&
        Objects.equals(this.brandName, templateStyleInfoDTO.brandName) &&
        Objects.equals(this.cardShowName, templateStyleInfoDTO.cardShowName) &&
        Objects.equals(this.color, templateStyleInfoDTO.color) &&
        Objects.equals(this.columnInfoLayout, templateStyleInfoDTO.columnInfoLayout) &&
        Objects.equals(this.featureDescriptions, templateStyleInfoDTO.featureDescriptions) &&
        Objects.equals(this.frontImageEnable, templateStyleInfoDTO.frontImageEnable) &&
        Objects.equals(this.frontTextListEnable, templateStyleInfoDTO.frontTextListEnable) &&
        Objects.equals(this.logoId, templateStyleInfoDTO.logoId) &&
        Objects.equals(this.slogan, templateStyleInfoDTO.slogan) &&
        Objects.equals(this.sloganImgId, templateStyleInfoDTO.sloganImgId)&&
        Objects.equals(this.additionalProperties, templateStyleInfoDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundId, bannerImgId, bannerUrl, bgColor, brandName, cardShowName, color, columnInfoLayout, featureDescriptions, frontImageEnable, frontTextListEnable, logoId, slogan, sloganImgId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateStyleInfoDTO {\n");
    sb.append("    backgroundId: ").append(toIndentedString(backgroundId)).append("\n");
    sb.append("    bannerImgId: ").append(toIndentedString(bannerImgId)).append("\n");
    sb.append("    bannerUrl: ").append(toIndentedString(bannerUrl)).append("\n");
    sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    cardShowName: ").append(toIndentedString(cardShowName)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    columnInfoLayout: ").append(toIndentedString(columnInfoLayout)).append("\n");
    sb.append("    featureDescriptions: ").append(toIndentedString(featureDescriptions)).append("\n");
    sb.append("    frontImageEnable: ").append(toIndentedString(frontImageEnable)).append("\n");
    sb.append("    frontTextListEnable: ").append(toIndentedString(frontTextListEnable)).append("\n");
    sb.append("    logoId: ").append(toIndentedString(logoId)).append("\n");
    sb.append("    slogan: ").append(toIndentedString(slogan)).append("\n");
    sb.append("    sloganImgId: ").append(toIndentedString(sloganImgId)).append("\n");
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
    openapiFields.add("background_id");
    openapiFields.add("banner_img_id");
    openapiFields.add("banner_url");
    openapiFields.add("bg_color");
    openapiFields.add("brand_name");
    openapiFields.add("card_show_name");
    openapiFields.add("color");
    openapiFields.add("column_info_layout");
    openapiFields.add("feature_descriptions");
    openapiFields.add("front_image_enable");
    openapiFields.add("front_text_list_enable");
    openapiFields.add("logo_id");
    openapiFields.add("slogan");
    openapiFields.add("slogan_img_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateStyleInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateStyleInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateStyleInfoDTO is not found in the empty JSON string", TemplateStyleInfoDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("background_id") != null && !jsonObj.get("background_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `background_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("background_id").toString()));
      }
      if (jsonObj.get("banner_img_id") != null && !jsonObj.get("banner_img_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banner_img_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banner_img_id").toString()));
      }
      if (jsonObj.get("banner_url") != null && !jsonObj.get("banner_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banner_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banner_url").toString()));
      }
      if (jsonObj.get("bg_color") != null && !jsonObj.get("bg_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bg_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bg_color").toString()));
      }
      if (jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      if (jsonObj.get("card_show_name") != null && !jsonObj.get("card_show_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_show_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_show_name").toString()));
      }
      if (jsonObj.get("color") != null && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if (jsonObj.get("column_info_layout") != null && !jsonObj.get("column_info_layout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `column_info_layout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("column_info_layout").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("feature_descriptions") != null && !jsonObj.get("feature_descriptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `feature_descriptions` to be an array in the JSON string but got `%s`", jsonObj.get("feature_descriptions").toString()));
      }
      if (jsonObj.get("logo_id") != null && !jsonObj.get("logo_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_id").toString()));
      }
      if (jsonObj.get("slogan") != null && !jsonObj.get("slogan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slogan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slogan").toString()));
      }
      if (jsonObj.get("slogan_img_id") != null && !jsonObj.get("slogan_img_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slogan_img_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slogan_img_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateStyleInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateStyleInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateStyleInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateStyleInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateStyleInfoDTO>() {
           @Override
           public void write(JsonWriter out, TemplateStyleInfoDTO value) throws IOException {
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
           public TemplateStyleInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateStyleInfoDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateStyleInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateStyleInfoDTO
  * @throws IOException if the JSON string is invalid with respect to TemplateStyleInfoDTO
  */
  public static TemplateStyleInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateStyleInfoDTO.class);
  }

 /**
  * Convert an instance of TemplateStyleInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

