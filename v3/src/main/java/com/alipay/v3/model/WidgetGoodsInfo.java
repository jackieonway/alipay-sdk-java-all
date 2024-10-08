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
 * WidgetGoodsInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WidgetGoodsInfo {
  public static final String SERIALIZED_NAME_BUYING_URL = "buying_url";
  @SerializedName(SERIALIZED_NAME_BUYING_URL)
  private String buyingUrl;

  public static final String SERIALIZED_NAME_GOODS_BRAND = "goods_brand";
  @SerializedName(SERIALIZED_NAME_GOODS_BRAND)
  private String goodsBrand;

  public static final String SERIALIZED_NAME_GOODS_COMMENT = "goods_comment";
  @SerializedName(SERIALIZED_NAME_GOODS_COMMENT)
  private String goodsComment;

  public static final String SERIALIZED_NAME_GOODS_DESCRIPTION_LABEL = "goods_description_label";
  @SerializedName(SERIALIZED_NAME_GOODS_DESCRIPTION_LABEL)
  private String goodsDescriptionLabel;

  public static final String SERIALIZED_NAME_GOODS_ID = "goods_id";
  @SerializedName(SERIALIZED_NAME_GOODS_ID)
  private String goodsId;

  public static final String SERIALIZED_NAME_GOODS_LABEL = "goods_label";
  @SerializedName(SERIALIZED_NAME_GOODS_LABEL)
  private String goodsLabel;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public static final String SERIALIZED_NAME_GOODS_TYPE = "goods_type";
  @SerializedName(SERIALIZED_NAME_GOODS_TYPE)
  private String goodsType;

  public static final String SERIALIZED_NAME_MAIN_PIC_URL = "main_pic_url";
  @SerializedName(SERIALIZED_NAME_MAIN_PIC_URL)
  private String mainPicUrl;

  public static final String SERIALIZED_NAME_NEED_PUBLIC_PROMO = "need_public_promo";
  @SerializedName(SERIALIZED_NAME_NEED_PUBLIC_PROMO)
  private Boolean needPublicPromo;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "order_number";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Integer orderNumber;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private String originalPrice;

  public static final String SERIALIZED_NAME_PUBLISH_CITIES = "publish_cities";
  @SerializedName(SERIALIZED_NAME_PUBLISH_CITIES)
  private String publishCities;

  public static final String SERIALIZED_NAME_REMAINING_QUANTITY = "remaining_quantity";
  @SerializedName(SERIALIZED_NAME_REMAINING_QUANTITY)
  private Integer remainingQuantity;

  public static final String SERIALIZED_NAME_SELL_PRICE = "sell_price";
  @SerializedName(SERIALIZED_NAME_SELL_PRICE)
  private String sellPrice;

  public static final String SERIALIZED_NAME_SELL_TAG_LIST = "sell_tag_list";
  @SerializedName(SERIALIZED_NAME_SELL_TAG_LIST)
  private List<String> sellTagList = null;

  public static final String SERIALIZED_NAME_SOLD_QUANTITY = "sold_quantity";
  @SerializedName(SERIALIZED_NAME_SOLD_QUANTITY)
  private Integer soldQuantity;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TOTAL_QUANTITY = "total_quantity";
  @SerializedName(SERIALIZED_NAME_TOTAL_QUANTITY)
  private Integer totalQuantity;

  public WidgetGoodsInfo() { 
  }

  public WidgetGoodsInfo buyingUrl(String buyingUrl) {
    
    this.buyingUrl = buyingUrl;
    return this;
  }

   /**
   * 该商品的小程序购买链接，如果需要进行公域推广，请字段请必填
   * @return buyingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该商品的小程序购买链接，如果需要进行公域推广，请字段请必填")

  public String getBuyingUrl() {
    return buyingUrl;
  }


  public void setBuyingUrl(String buyingUrl) {
    this.buyingUrl = buyingUrl;
  }


  public WidgetGoodsInfo goodsBrand(String goodsBrand) {
    
    this.goodsBrand = goodsBrand;
    return this;
  }

   /**
   * 商品品牌，如果需要进行公域推广，该字段请必填
   * @return goodsBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品品牌，如果需要进行公域推广，该字段请必填")

  public String getGoodsBrand() {
    return goodsBrand;
  }


  public void setGoodsBrand(String goodsBrand) {
    this.goodsBrand = goodsBrand;
  }


  public WidgetGoodsInfo goodsComment(String goodsComment) {
    
    this.goodsComment = goodsComment;
    return this;
  }

   /**
   * 商品辅助说明文案
   * @return goodsComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品辅助说明文案")

  public String getGoodsComment() {
    return goodsComment;
  }


  public void setGoodsComment(String goodsComment) {
    this.goodsComment = goodsComment;
  }


  public WidgetGoodsInfo goodsDescriptionLabel(String goodsDescriptionLabel) {
    
    this.goodsDescriptionLabel = goodsDescriptionLabel;
    return this;
  }

   /**
   * 商品说明标签（如-随心退）
   * @return goodsDescriptionLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品说明标签（如-随心退）")

  public String getGoodsDescriptionLabel() {
    return goodsDescriptionLabel;
  }


  public void setGoodsDescriptionLabel(String goodsDescriptionLabel) {
    this.goodsDescriptionLabel = goodsDescriptionLabel;
  }


  public WidgetGoodsInfo goodsId(String goodsId) {
    
    this.goodsId = goodsId;
    return this;
  }

   /**
   * 商品的唯一标识，同一个小部件下，该标识唯一，请开发者自行保证
   * @return goodsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品的唯一标识，同一个小部件下，该标识唯一，请开发者自行保证")

  public String getGoodsId() {
    return goodsId;
  }


  public void setGoodsId(String goodsId) {
    this.goodsId = goodsId;
  }


  public WidgetGoodsInfo goodsLabel(String goodsLabel) {
    
    this.goodsLabel = goodsLabel;
    return this;
  }

   /**
   * 营销标签（如-限量特价），每个商品仅支持一个营销标签
   * @return goodsLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营销标签（如-限量特价），每个商品仅支持一个营销标签")

  public String getGoodsLabel() {
    return goodsLabel;
  }


  public void setGoodsLabel(String goodsLabel) {
    this.goodsLabel = goodsLabel;
  }


  public WidgetGoodsInfo goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品名称")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public WidgetGoodsInfo goodsType(String goodsType) {
    
    this.goodsType = goodsType;
    return this;
  }

   /**
   * 商品所属品类
   * @return goodsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品所属品类")

  public String getGoodsType() {
    return goodsType;
  }


  public void setGoodsType(String goodsType) {
    this.goodsType = goodsType;
  }


  public WidgetGoodsInfo mainPicUrl(String mainPicUrl) {
    
    this.mainPicUrl = mainPicUrl;
    return this;
  }

   /**
   * 商品主图片地址，如果需要进行公域推广，该字段请必填。
   * @return mainPicUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品主图片地址，如果需要进行公域推广，该字段请必填。")

  public String getMainPicUrl() {
    return mainPicUrl;
  }


  public void setMainPicUrl(String mainPicUrl) {
    this.mainPicUrl = mainPicUrl;
  }


  public WidgetGoodsInfo needPublicPromo(Boolean needPublicPromo) {
    
    this.needPublicPromo = needPublicPromo;
    return this;
  }

   /**
   * 是否需要进行公域推广，默认情况下为false
   * @return needPublicPromo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否需要进行公域推广，默认情况下为false")

  public Boolean getNeedPublicPromo() {
    return needPublicPromo;
  }


  public void setNeedPublicPromo(Boolean needPublicPromo) {
    this.needPublicPromo = needPublicPromo;
  }


  public WidgetGoodsInfo orderNumber(Integer orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * 商品排序，自然整数, 数字越小越靠前
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品排序，自然整数, 数字越小越靠前")

  public Integer getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }


  public WidgetGoodsInfo originalPrice(String originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * 单位\&quot;元\&quot;的商品原价，传入数字，不需要传入\&quot;元\&quot;。如果需要进行公域推广，该字段请必填。
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单位\"元\"的商品原价，传入数字，不需要传入\"元\"。如果需要进行公域推广，该字段请必填。")

  public String getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
  }


  public WidgetGoodsInfo publishCities(String publishCities) {
    
    this.publishCities = publishCities;
    return this;
  }

   /**
   * 投放城市的列表，详见https://www.mca.gov.cn/article/sj/xzqh/2020/2020/202007170301.html，有多个用英文,分隔。如果没有限制则不传入
   * @return publishCities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放城市的列表，详见https://www.mca.gov.cn/article/sj/xzqh/2020/2020/202007170301.html，有多个用英文,分隔。如果没有限制则不传入")

  public String getPublishCities() {
    return publishCities;
  }


  public void setPublishCities(String publishCities) {
    this.publishCities = publishCities;
  }


  public WidgetGoodsInfo remainingQuantity(Integer remainingQuantity) {
    
    this.remainingQuantity = remainingQuantity;
    return this;
  }

   /**
   * 剩余库存，如果需要进行公域推广，该字段请必填，并且当剩余库存为0时，请及时同步。
   * @return remainingQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "剩余库存，如果需要进行公域推广，该字段请必填，并且当剩余库存为0时，请及时同步。")

  public Integer getRemainingQuantity() {
    return remainingQuantity;
  }


  public void setRemainingQuantity(Integer remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
  }


  public WidgetGoodsInfo sellPrice(String sellPrice) {
    
    this.sellPrice = sellPrice;
    return this;
  }

   /**
   * 单位\&quot;元\&quot;的售价，传入数字，不需要传入\&quot;元\&quot;。如果需要进行公域推广，该字段请必填。
   * @return sellPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单位\"元\"的售价，传入数字，不需要传入\"元\"。如果需要进行公域推广，该字段请必填。")

  public String getSellPrice() {
    return sellPrice;
  }


  public void setSellPrice(String sellPrice) {
    this.sellPrice = sellPrice;
  }


  public WidgetGoodsInfo sellTagList(List<String> sellTagList) {
    
    this.sellTagList = sellTagList;
    return this;
  }

  public WidgetGoodsInfo addSellTagListItem(String sellTagListItem) {
    if (this.sellTagList == null) {
      this.sellTagList = new ArrayList<>();
    }
    this.sellTagList.add(sellTagListItem);
    return this;
  }

   /**
   * 商品的卖点标签，如果需要进行公域推广，请至少填写两个卖点标签。
   * @return sellTagList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品的卖点标签，如果需要进行公域推广，请至少填写两个卖点标签。")

  public List<String> getSellTagList() {
    return sellTagList;
  }


  public void setSellTagList(List<String> sellTagList) {
    this.sellTagList = sellTagList;
  }


  public WidgetGoodsInfo soldQuantity(Integer soldQuantity) {
    
    this.soldQuantity = soldQuantity;
    return this;
  }

   /**
   * 已售数量
   * @return soldQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "已售数量")

  public Integer getSoldQuantity() {
    return soldQuantity;
  }


  public void setSoldQuantity(Integer soldQuantity) {
    this.soldQuantity = soldQuantity;
  }


  public WidgetGoodsInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 商品状态，商品的上下架，默认情况为上架，上架为ONLINE,下架为OFFLINE
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品状态，商品的上下架，默认情况为上架，上架为ONLINE,下架为OFFLINE")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public WidgetGoodsInfo totalQuantity(Integer totalQuantity) {
    
    this.totalQuantity = totalQuantity;
    return this;
  }

   /**
   * 总库存量
   * @return totalQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "总库存量")

  public Integer getTotalQuantity() {
    return totalQuantity;
  }


  public void setTotalQuantity(Integer totalQuantity) {
    this.totalQuantity = totalQuantity;
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
   * @return the WidgetGoodsInfo instance itself
   */
  public WidgetGoodsInfo putAdditionalProperty(String key, Object value) {
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
    WidgetGoodsInfo widgetGoodsInfo = (WidgetGoodsInfo) o;
    return Objects.equals(this.buyingUrl, widgetGoodsInfo.buyingUrl) &&
        Objects.equals(this.goodsBrand, widgetGoodsInfo.goodsBrand) &&
        Objects.equals(this.goodsComment, widgetGoodsInfo.goodsComment) &&
        Objects.equals(this.goodsDescriptionLabel, widgetGoodsInfo.goodsDescriptionLabel) &&
        Objects.equals(this.goodsId, widgetGoodsInfo.goodsId) &&
        Objects.equals(this.goodsLabel, widgetGoodsInfo.goodsLabel) &&
        Objects.equals(this.goodsName, widgetGoodsInfo.goodsName) &&
        Objects.equals(this.goodsType, widgetGoodsInfo.goodsType) &&
        Objects.equals(this.mainPicUrl, widgetGoodsInfo.mainPicUrl) &&
        Objects.equals(this.needPublicPromo, widgetGoodsInfo.needPublicPromo) &&
        Objects.equals(this.orderNumber, widgetGoodsInfo.orderNumber) &&
        Objects.equals(this.originalPrice, widgetGoodsInfo.originalPrice) &&
        Objects.equals(this.publishCities, widgetGoodsInfo.publishCities) &&
        Objects.equals(this.remainingQuantity, widgetGoodsInfo.remainingQuantity) &&
        Objects.equals(this.sellPrice, widgetGoodsInfo.sellPrice) &&
        Objects.equals(this.sellTagList, widgetGoodsInfo.sellTagList) &&
        Objects.equals(this.soldQuantity, widgetGoodsInfo.soldQuantity) &&
        Objects.equals(this.status, widgetGoodsInfo.status) &&
        Objects.equals(this.totalQuantity, widgetGoodsInfo.totalQuantity)&&
        Objects.equals(this.additionalProperties, widgetGoodsInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyingUrl, goodsBrand, goodsComment, goodsDescriptionLabel, goodsId, goodsLabel, goodsName, goodsType, mainPicUrl, needPublicPromo, orderNumber, originalPrice, publishCities, remainingQuantity, sellPrice, sellTagList, soldQuantity, status, totalQuantity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetGoodsInfo {\n");
    sb.append("    buyingUrl: ").append(toIndentedString(buyingUrl)).append("\n");
    sb.append("    goodsBrand: ").append(toIndentedString(goodsBrand)).append("\n");
    sb.append("    goodsComment: ").append(toIndentedString(goodsComment)).append("\n");
    sb.append("    goodsDescriptionLabel: ").append(toIndentedString(goodsDescriptionLabel)).append("\n");
    sb.append("    goodsId: ").append(toIndentedString(goodsId)).append("\n");
    sb.append("    goodsLabel: ").append(toIndentedString(goodsLabel)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    goodsType: ").append(toIndentedString(goodsType)).append("\n");
    sb.append("    mainPicUrl: ").append(toIndentedString(mainPicUrl)).append("\n");
    sb.append("    needPublicPromo: ").append(toIndentedString(needPublicPromo)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    publishCities: ").append(toIndentedString(publishCities)).append("\n");
    sb.append("    remainingQuantity: ").append(toIndentedString(remainingQuantity)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    sellTagList: ").append(toIndentedString(sellTagList)).append("\n");
    sb.append("    soldQuantity: ").append(toIndentedString(soldQuantity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
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
    openapiFields.add("buying_url");
    openapiFields.add("goods_brand");
    openapiFields.add("goods_comment");
    openapiFields.add("goods_description_label");
    openapiFields.add("goods_id");
    openapiFields.add("goods_label");
    openapiFields.add("goods_name");
    openapiFields.add("goods_type");
    openapiFields.add("main_pic_url");
    openapiFields.add("need_public_promo");
    openapiFields.add("order_number");
    openapiFields.add("original_price");
    openapiFields.add("publish_cities");
    openapiFields.add("remaining_quantity");
    openapiFields.add("sell_price");
    openapiFields.add("sell_tag_list");
    openapiFields.add("sold_quantity");
    openapiFields.add("status");
    openapiFields.add("total_quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WidgetGoodsInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WidgetGoodsInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WidgetGoodsInfo is not found in the empty JSON string", WidgetGoodsInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("buying_url") != null && !jsonObj.get("buying_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buying_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buying_url").toString()));
      }
      if (jsonObj.get("goods_brand") != null && !jsonObj.get("goods_brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_brand").toString()));
      }
      if (jsonObj.get("goods_comment") != null && !jsonObj.get("goods_comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_comment").toString()));
      }
      if (jsonObj.get("goods_description_label") != null && !jsonObj.get("goods_description_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_description_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_description_label").toString()));
      }
      if (jsonObj.get("goods_id") != null && !jsonObj.get("goods_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_id").toString()));
      }
      if (jsonObj.get("goods_label") != null && !jsonObj.get("goods_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_label").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
      if (jsonObj.get("goods_type") != null && !jsonObj.get("goods_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_type").toString()));
      }
      if (jsonObj.get("main_pic_url") != null && !jsonObj.get("main_pic_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `main_pic_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("main_pic_url").toString()));
      }
      if (jsonObj.get("original_price") != null && !jsonObj.get("original_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_price").toString()));
      }
      if (jsonObj.get("publish_cities") != null && !jsonObj.get("publish_cities").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_cities` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_cities").toString()));
      }
      if (jsonObj.get("sell_price") != null && !jsonObj.get("sell_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sell_price").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("sell_tag_list") != null && !jsonObj.get("sell_tag_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_tag_list` to be an array in the JSON string but got `%s`", jsonObj.get("sell_tag_list").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WidgetGoodsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WidgetGoodsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WidgetGoodsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WidgetGoodsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<WidgetGoodsInfo>() {
           @Override
           public void write(JsonWriter out, WidgetGoodsInfo value) throws IOException {
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
           public WidgetGoodsInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WidgetGoodsInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WidgetGoodsInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WidgetGoodsInfo
  * @throws IOException if the JSON string is invalid with respect to WidgetGoodsInfo
  */
  public static WidgetGoodsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WidgetGoodsInfo.class);
  }

 /**
  * Convert an instance of WidgetGoodsInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

