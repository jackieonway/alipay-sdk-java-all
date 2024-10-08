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
 * AlipayOfflineMarketShopSummaryBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOfflineMarketShopSummaryBatchqueryModel {
  public static final String SERIALIZED_NAME_BIZ_CHANNEL = "biz_channel";
  @SerializedName(SERIALIZED_NAME_BIZ_CHANNEL)
  private String bizChannel;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_DISTRICT_CODE = "district_code";
  @SerializedName(SERIALIZED_NAME_DISTRICT_CODE)
  private String districtCode;

  public static final String SERIALIZED_NAME_OP_ROLE = "op_role";
  @SerializedName(SERIALIZED_NAME_OP_ROLE)
  private String opRole;

  public static final String SERIALIZED_NAME_PAGE_NO = "page_no";
  @SerializedName(SERIALIZED_NAME_PAGE_NO)
  private Integer pageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public static final String SERIALIZED_NAME_QUERY_TYPE = "query_type";
  @SerializedName(SERIALIZED_NAME_QUERY_TYPE)
  private String queryType;

  public static final String SERIALIZED_NAME_RELATED_PARTNER_ID = "related_partner_id";
  @SerializedName(SERIALIZED_NAME_RELATED_PARTNER_ID)
  private String relatedPartnerId;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public static final String SERIALIZED_NAME_SHOP_STATUS = "shop_status";
  @SerializedName(SERIALIZED_NAME_SHOP_STATUS)
  private String shopStatus;

  public AlipayOfflineMarketShopSummaryBatchqueryModel() { 
  }

  public AlipayOfflineMarketShopSummaryBatchqueryModel bizChannel(String bizChannel) {
    
    this.bizChannel = bizChannel;
    return this;
  }

   /**
   * 表示接口查询门店的业务渠道限制：ALL、 POS、不传。不传代表只查询普通门店，传入POS代表只查询简易门店，传入ALL代表查询普通门店和简易门店。
   * @return bizChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POS、ALL", value = "表示接口查询门店的业务渠道限制：ALL、 POS、不传。不传代表只查询普通门店，传入POS代表只查询简易门店，传入ALL代表查询普通门店和简易门店。")

  public String getBizChannel() {
    return bizChannel;
  }


  public void setBizChannel(String bizChannel) {
    this.bizChannel = bizChannel;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 品牌名
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "麦当劳", value = "品牌名")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 城市编码，国标码，如：120100表示天津市
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120100", value = "城市编码，国标码，如：120100表示天津市")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel districtCode(String districtCode) {
    
    this.districtCode = districtCode;
    return this;
  }

   /**
   * 区域编码，如：120104表示南开区
   * @return districtCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120104", value = "区域编码，如：120104表示南开区")

  public String getDistrictCode() {
    return districtCode;
  }


  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel opRole(String opRole) {
    
    this.opRole = opRole;
    return this;
  }

   /**
   * 表示接口业务的调用方身份：ISV、 服务商身份标识。传入ISV代表系统集成商身份。传入PROVIDER代表服务商。
   * @return opRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ISV、PROVIDER", value = "表示接口业务的调用方身份：ISV、 服务商身份标识。传入ISV代表系统集成商身份。传入PROVIDER代表服务商。")

  public String getOpRole() {
    return opRole;
  }


  public void setOpRole(String opRole) {
    this.opRole = opRole;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * 页码，留空标示第一页，默认 20个结果为一页
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "页码，留空标示第一页，默认 20个结果为一页")

  public Integer getPageNo() {
    return pageNo;
  }


  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页记录数，默认20，最大 100
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "每页记录数，默认20，最大 100")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 省份编码，国标码，如：120000表示天津
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120000", value = "省份编码，国标码，如：120000表示天津")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel queryType(String queryType) {
    
    this.queryType = queryType;
    return this;
  }

   /**
   * 门店数据查询类型，根据类型可以返回指定的门店数据，目前支持的类型如下：  BRAND_RELATION ： 品牌商关联店铺  MALL_SELF ：MALL自己的门店  MALL_RELATION：MALL关联下的门店  MERCHANT_SELF:商户自己的门店  KB_PROMOTER：口碑客推广者
   * @return queryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BRAND_RELATION", value = "门店数据查询类型，根据类型可以返回指定的门店数据，目前支持的类型如下：  BRAND_RELATION ： 品牌商关联店铺  MALL_SELF ：MALL自己的门店  MALL_RELATION：MALL关联下的门店  MERCHANT_SELF:商户自己的门店  KB_PROMOTER：口碑客推广者")

  public String getQueryType() {
    return queryType;
  }


  public void setQueryType(String queryType) {
    this.queryType = queryType;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel relatedPartnerId(String relatedPartnerId) {
    
    this.relatedPartnerId = relatedPartnerId;
    return this;
  }

   /**
   * query_type查询类型下所关联的商户PID
   * @return relatedPartnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088001969784501", value = "query_type查询类型下所关联的商户PID")

  public String getRelatedPartnerId() {
    return relatedPartnerId;
  }


  public void setRelatedPartnerId(String relatedPartnerId) {
    this.relatedPartnerId = relatedPartnerId;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 门店ID
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015062100077000000000120773", value = "门店ID")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public AlipayOfflineMarketShopSummaryBatchqueryModel shopStatus(String shopStatus) {
    
    this.shopStatus = shopStatus;
    return this;
  }

   /**
   * 门店状态，传入多个状态，多个状态使用英文逗号隔开，例如：PAUSED,OPEN  店铺状态：OPEN（营业）、PAUSED（暂停）、INIT（初始）、FREEZE（冻结）、CLOSED（关店）
   * @return shopStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAUSED", value = "门店状态，传入多个状态，多个状态使用英文逗号隔开，例如：PAUSED,OPEN  店铺状态：OPEN（营业）、PAUSED（暂停）、INIT（初始）、FREEZE（冻结）、CLOSED（关店）")

  public String getShopStatus() {
    return shopStatus;
  }


  public void setShopStatus(String shopStatus) {
    this.shopStatus = shopStatus;
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
   * @return the AlipayOfflineMarketShopSummaryBatchqueryModel instance itself
   */
  public AlipayOfflineMarketShopSummaryBatchqueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayOfflineMarketShopSummaryBatchqueryModel alipayOfflineMarketShopSummaryBatchqueryModel = (AlipayOfflineMarketShopSummaryBatchqueryModel) o;
    return Objects.equals(this.bizChannel, alipayOfflineMarketShopSummaryBatchqueryModel.bizChannel) &&
        Objects.equals(this.brandName, alipayOfflineMarketShopSummaryBatchqueryModel.brandName) &&
        Objects.equals(this.cityCode, alipayOfflineMarketShopSummaryBatchqueryModel.cityCode) &&
        Objects.equals(this.districtCode, alipayOfflineMarketShopSummaryBatchqueryModel.districtCode) &&
        Objects.equals(this.opRole, alipayOfflineMarketShopSummaryBatchqueryModel.opRole) &&
        Objects.equals(this.pageNo, alipayOfflineMarketShopSummaryBatchqueryModel.pageNo) &&
        Objects.equals(this.pageSize, alipayOfflineMarketShopSummaryBatchqueryModel.pageSize) &&
        Objects.equals(this.provinceCode, alipayOfflineMarketShopSummaryBatchqueryModel.provinceCode) &&
        Objects.equals(this.queryType, alipayOfflineMarketShopSummaryBatchqueryModel.queryType) &&
        Objects.equals(this.relatedPartnerId, alipayOfflineMarketShopSummaryBatchqueryModel.relatedPartnerId) &&
        Objects.equals(this.shopId, alipayOfflineMarketShopSummaryBatchqueryModel.shopId) &&
        Objects.equals(this.shopStatus, alipayOfflineMarketShopSummaryBatchqueryModel.shopStatus)&&
        Objects.equals(this.additionalProperties, alipayOfflineMarketShopSummaryBatchqueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizChannel, brandName, cityCode, districtCode, opRole, pageNo, pageSize, provinceCode, queryType, relatedPartnerId, shopId, shopStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOfflineMarketShopSummaryBatchqueryModel {\n");
    sb.append("    bizChannel: ").append(toIndentedString(bizChannel)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    opRole: ").append(toIndentedString(opRole)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    relatedPartnerId: ").append(toIndentedString(relatedPartnerId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    shopStatus: ").append(toIndentedString(shopStatus)).append("\n");
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
    openapiFields.add("biz_channel");
    openapiFields.add("brand_name");
    openapiFields.add("city_code");
    openapiFields.add("district_code");
    openapiFields.add("op_role");
    openapiFields.add("page_no");
    openapiFields.add("page_size");
    openapiFields.add("province_code");
    openapiFields.add("query_type");
    openapiFields.add("related_partner_id");
    openapiFields.add("shop_id");
    openapiFields.add("shop_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOfflineMarketShopSummaryBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOfflineMarketShopSummaryBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOfflineMarketShopSummaryBatchqueryModel is not found in the empty JSON string", AlipayOfflineMarketShopSummaryBatchqueryModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_channel") != null && !jsonObj.get("biz_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_channel").toString()));
      }
      if (jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("district_code") != null && !jsonObj.get("district_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_code").toString()));
      }
      if (jsonObj.get("op_role") != null && !jsonObj.get("op_role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `op_role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("op_role").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
      if (jsonObj.get("query_type") != null && !jsonObj.get("query_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query_type").toString()));
      }
      if (jsonObj.get("related_partner_id") != null && !jsonObj.get("related_partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("related_partner_id").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
      if (jsonObj.get("shop_status") != null && !jsonObj.get("shop_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOfflineMarketShopSummaryBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOfflineMarketShopSummaryBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOfflineMarketShopSummaryBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOfflineMarketShopSummaryBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOfflineMarketShopSummaryBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOfflineMarketShopSummaryBatchqueryModel value) throws IOException {
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
           public AlipayOfflineMarketShopSummaryBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOfflineMarketShopSummaryBatchqueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOfflineMarketShopSummaryBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOfflineMarketShopSummaryBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOfflineMarketShopSummaryBatchqueryModel
  */
  public static AlipayOfflineMarketShopSummaryBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOfflineMarketShopSummaryBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayOfflineMarketShopSummaryBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

