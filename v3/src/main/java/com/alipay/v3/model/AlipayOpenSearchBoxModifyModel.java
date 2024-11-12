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
import com.alipay.v3.model.SearchBoxAppInfo;
import com.alipay.v3.model.SearchBoxServiceInfo;
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
 * AlipayOpenSearchBoxModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchBoxModifyModel {
  public static final String SERIALIZED_NAME_BOX_DESC = "box_desc";
  @SerializedName(SERIALIZED_NAME_BOX_DESC)
  private String boxDesc;

  public static final String SERIALIZED_NAME_BOX_ID = "box_id";
  @SerializedName(SERIALIZED_NAME_BOX_ID)
  private String boxId;

  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_BUSINESS_BENEFIT_SWITCH = "business_benefit_switch";
  @SerializedName(SERIALIZED_NAME_BUSINESS_BENEFIT_SWITCH)
  private Boolean businessBenefitSwitch;

  public static final String SERIALIZED_NAME_BUSINESS_DISTRICT_IDS = "business_district_ids";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DISTRICT_IDS)
  private List<String> businessDistrictIds = null;

  public static final String SERIALIZED_NAME_CUSTOM_KEYWORDS = "custom_keywords";
  @SerializedName(SERIALIZED_NAME_CUSTOM_KEYWORDS)
  private String customKeywords;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_IMAGE_NAME = "image_name";
  @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
  private String imageName;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_MODULE_ID = "module_id";
  @SerializedName(SERIALIZED_NAME_MODULE_ID)
  private String moduleId;

  public static final String SERIALIZED_NAME_MODULE_TYPE = "module_type";
  @SerializedName(SERIALIZED_NAME_MODULE_TYPE)
  private String moduleType;

  public static final String SERIALIZED_NAME_RELATED_ACCOUNTS = "related_accounts";
  @SerializedName(SERIALIZED_NAME_RELATED_ACCOUNTS)
  private List<SearchBoxAppInfo> relatedAccounts = null;

  public static final String SERIALIZED_NAME_SERVICE_INFOS = "service_infos";
  @SerializedName(SERIALIZED_NAME_SERVICE_INFOS)
  private List<SearchBoxServiceInfo> serviceInfos = null;

  public static final String SERIALIZED_NAME_TARGET_APPID = "target_appid";
  @SerializedName(SERIALIZED_NAME_TARGET_APPID)
  private String targetAppid;

  public AlipayOpenSearchBoxModifyModel() { 
  }

  public AlipayOpenSearchBoxModifyModel boxDesc(String boxDesc) {
    
    this.boxDesc = boxDesc;
    return this;
  }

   /**
   * 品牌介绍，5-15个中文字符。当修改品牌介绍模块(module_type&#x3D;BOX_EXCLUSIVE_BASE)时传入。 小程序直达时不支持设置
   * @return boxDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "品牌介绍", value = "品牌介绍，5-15个中文字符。当修改品牌介绍模块(module_type=BOX_EXCLUSIVE_BASE)时传入。 小程序直达时不支持设置")

  public String getBoxDesc() {
    return boxDesc;
  }


  public void setBoxDesc(String boxDesc) {
    this.boxDesc = boxDesc;
  }


  public AlipayOpenSearchBoxModifyModel boxId(String boxId) {
    
    this.boxId = boxId;
    return this;
  }

   /**
   * 搜索直达配置id
   * @return boxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220308000000128693", value = "搜索直达配置id")

  public String getBoxId() {
    return boxId;
  }


  public void setBoxId(String boxId) {
    this.boxId = boxId;
  }


  public AlipayOpenSearchBoxModifyModel brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 品牌id，参考&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/rules/029uy4\&quot;&gt; 品牌认证说明 &lt;/a&gt;
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000467882", value = "品牌id，参考<a href=\"https://opendocs.alipay.com/rules/029uy4\"> 品牌认证说明 </a>")

  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public AlipayOpenSearchBoxModifyModel businessBenefitSwitch(Boolean businessBenefitSwitch) {
    
    this.businessBenefitSwitch = businessBenefitSwitch;
    return this;
  }

   /**
   * 可通过配置来开启商圈权益模块，关闭后搜索直达不展示商圈权益模块
   * @return businessBenefitSwitch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "可通过配置来开启商圈权益模块，关闭后搜索直达不展示商圈权益模块")

  public Boolean getBusinessBenefitSwitch() {
    return businessBenefitSwitch;
  }


  public void setBusinessBenefitSwitch(Boolean businessBenefitSwitch) {
    this.businessBenefitSwitch = businessBenefitSwitch;
  }


  public AlipayOpenSearchBoxModifyModel businessDistrictIds(List<String> businessDistrictIds) {
    
    this.businessDistrictIds = businessDistrictIds;
    return this;
  }

  public AlipayOpenSearchBoxModifyModel addBusinessDistrictIdsItem(String businessDistrictIdsItem) {
    if (this.businessDistrictIds == null) {
      this.businessDistrictIds = new ArrayList<>();
    }
    this.businessDistrictIds.add(businessDistrictIdsItem);
    return this;
  }

   /**
   * 小程序已关联商圈时，可添加商圈id（目前仅对品牌直达开放，小程序直达暂未开放）
   * @return businessDistrictIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"商圈id\"]", value = "小程序已关联商圈时，可添加商圈id（目前仅对品牌直达开放，小程序直达暂未开放）")

  public List<String> getBusinessDistrictIds() {
    return businessDistrictIds;
  }


  public void setBusinessDistrictIds(List<String> businessDistrictIds) {
    this.businessDistrictIds = businessDistrictIds;
  }


  public AlipayOpenSearchBoxModifyModel customKeywords(String customKeywords) {
    
    this.customKeywords = customKeywords;
    return this;
  }

   /**
   * 1024
   * @return customKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "自定义触发词", value = "1024")

  public String getCustomKeywords() {
    return customKeywords;
  }


  public void setCustomKeywords(String customKeywords) {
    this.customKeywords = customKeywords;
  }


  public AlipayOpenSearchBoxModifyModel imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 氛围图片id，调用 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03hvl1?ref&#x3D;api\&quot;&gt;支付宝文件上传接口&lt;/a&gt; 上传图片获取图片id(bizCode：search_box_atmosphere)。 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/b/03al6f\&quot;&gt;图片规范&lt;/a&gt;  小程序直达不支持设置此项。
   * @return imageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*oZQmT4xTBPUAAAAAAAAAAAAAAQAAAQ", value = "氛围图片id，调用 <a href=\"https://opendocs.alipay.com/mini/03hvl1?ref=api\">支付宝文件上传接口</a> 上传图片获取图片id(bizCode：search_box_atmosphere)。 <a href=\"https://opendocs.alipay.com/b/03al6f\">图片规范</a>  小程序直达不支持设置此项。")

  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public AlipayOpenSearchBoxModifyModel imageName(String imageName) {
    
    this.imageName = imageName;
    return this;
  }

   /**
   * 氛围图片名，当修改氛围图模块(module_type&#x3D;BOX_ATMOSPHERE_IMAGE)时传入。 小程序直达不支持设置
   * @return imageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "搜索直达氛围图1", value = "氛围图片名，当修改氛围图模块(module_type=BOX_ATMOSPHERE_IMAGE)时传入。 小程序直达不支持设置")

  public String getImageName() {
    return imageName;
  }


  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public AlipayOpenSearchBoxModifyModel merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\&quot;运营支付宝小程序\&quot;授权。
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxxxxx", value = "商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\"运营支付宝小程序\"授权。")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public AlipayOpenSearchBoxModifyModel moduleId(String moduleId) {
    
    this.moduleId = moduleId;
    return this;
  }

   /**
   * 搜索直达模块配置id，新增模块时可不传，更新模块时必传。从alipay.open.search.box.query详情接口查询可获取已存在模块的配置id
   * @return moduleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220308000000168465", value = "搜索直达模块配置id，新增模块时可不传，更新模块时必传。从alipay.open.search.box.query详情接口查询可获取已存在模块的配置id")

  public String getModuleId() {
    return moduleId;
  }


  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }


  public AlipayOpenSearchBoxModifyModel moduleType(String moduleType) {
    
    this.moduleType = moduleType;
    return this;
  }

   /**
   * 搜索直达模块类型，参考&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03fjba#%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E\&quot;&gt; 搜索直达模块说明 &lt;/a&gt;。
   * @return moduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BOX_EXCLUSIVE_KEYWORD", value = "搜索直达模块类型，参考<a href=\"https://opendocs.alipay.com/mini/03fjba#%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E\"> 搜索直达模块说明 </a>。")

  public String getModuleType() {
    return moduleType;
  }


  public void setModuleType(String moduleType) {
    this.moduleType = moduleType;
  }


  public AlipayOpenSearchBoxModifyModel relatedAccounts(List<SearchBoxAppInfo> relatedAccounts) {
    
    this.relatedAccounts = relatedAccounts;
    return this;
  }

  public AlipayOpenSearchBoxModifyModel addRelatedAccountsItem(SearchBoxAppInfo relatedAccountsItem) {
    if (this.relatedAccounts == null) {
      this.relatedAccounts = new ArrayList<>();
    }
    this.relatedAccounts.add(relatedAccountsItem);
    return this;
  }

   /**
   * \&quot;关联账号信息，可配置1-2个。传入账号需归属于商家主体。品牌直达修改官方账号(module_type&#x3D;BOX_EXCLUSIVE_ACCOUNTS)时传入，小程序直达修改常用服务模块时也需传值。 当为品牌直达时，数组中的第1个账号会被设置为\&quot;账号1\&quot;，也就是将作为搜索直达专区头部的跳转地址。\&quot;
   * @return relatedAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "\"关联账号信息，可配置1-2个。传入账号需归属于商家主体。品牌直达修改官方账号(module_type=BOX_EXCLUSIVE_ACCOUNTS)时传入，小程序直达修改常用服务模块时也需传值。 当为品牌直达时，数组中的第1个账号会被设置为\"账号1\"，也就是将作为搜索直达专区头部的跳转地址。\"")

  public List<SearchBoxAppInfo> getRelatedAccounts() {
    return relatedAccounts;
  }


  public void setRelatedAccounts(List<SearchBoxAppInfo> relatedAccounts) {
    this.relatedAccounts = relatedAccounts;
  }


  public AlipayOpenSearchBoxModifyModel serviceInfos(List<SearchBoxServiceInfo> serviceInfos) {
    
    this.serviceInfos = serviceInfos;
    return this;
  }

  public AlipayOpenSearchBoxModifyModel addServiceInfosItem(SearchBoxServiceInfo serviceInfosItem) {
    if (this.serviceInfos == null) {
      this.serviceInfos = new ArrayList<>();
    }
    this.serviceInfos.add(serviceInfosItem);
    return this;
  }

   /**
   * 服务信息，服务必须审核通过才能申请搜索直达，可配置1-4个。当修改常用服务模块(module_type&#x3D;BOX_EXCLUSIVE_FUNCTIONS)时传入
   * @return serviceInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务信息，服务必须审核通过才能申请搜索直达，可配置1-4个。当修改常用服务模块(module_type=BOX_EXCLUSIVE_FUNCTIONS)时传入")

  public List<SearchBoxServiceInfo> getServiceInfos() {
    return serviceInfos;
  }


  public void setServiceInfos(List<SearchBoxServiceInfo> serviceInfos) {
    this.serviceInfos = serviceInfos;
  }


  public AlipayOpenSearchBoxModifyModel targetAppid(String targetAppid) {
    
    this.targetAppid = targetAppid;
    return this;
  }

   /**
   * 小程序id，小程序直达时必传，需要和申请的商户主体保持一致，且符合&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/b/03al6e\&quot;&gt; 准入类目 &lt;/a&gt;
   * @return targetAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018092561507369", value = "小程序id，小程序直达时必传，需要和申请的商户主体保持一致，且符合<a href=\"https://opendocs.alipay.com/b/03al6e\"> 准入类目 </a>")

  public String getTargetAppid() {
    return targetAppid;
  }


  public void setTargetAppid(String targetAppid) {
    this.targetAppid = targetAppid;
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
   * @return the AlipayOpenSearchBoxModifyModel instance itself
   */
  public AlipayOpenSearchBoxModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenSearchBoxModifyModel alipayOpenSearchBoxModifyModel = (AlipayOpenSearchBoxModifyModel) o;
    return Objects.equals(this.boxDesc, alipayOpenSearchBoxModifyModel.boxDesc) &&
        Objects.equals(this.boxId, alipayOpenSearchBoxModifyModel.boxId) &&
        Objects.equals(this.brandId, alipayOpenSearchBoxModifyModel.brandId) &&
        Objects.equals(this.businessBenefitSwitch, alipayOpenSearchBoxModifyModel.businessBenefitSwitch) &&
        Objects.equals(this.businessDistrictIds, alipayOpenSearchBoxModifyModel.businessDistrictIds) &&
        Objects.equals(this.customKeywords, alipayOpenSearchBoxModifyModel.customKeywords) &&
        Objects.equals(this.imageId, alipayOpenSearchBoxModifyModel.imageId) &&
        Objects.equals(this.imageName, alipayOpenSearchBoxModifyModel.imageName) &&
        Objects.equals(this.merchantId, alipayOpenSearchBoxModifyModel.merchantId) &&
        Objects.equals(this.moduleId, alipayOpenSearchBoxModifyModel.moduleId) &&
        Objects.equals(this.moduleType, alipayOpenSearchBoxModifyModel.moduleType) &&
        Objects.equals(this.relatedAccounts, alipayOpenSearchBoxModifyModel.relatedAccounts) &&
        Objects.equals(this.serviceInfos, alipayOpenSearchBoxModifyModel.serviceInfos) &&
        Objects.equals(this.targetAppid, alipayOpenSearchBoxModifyModel.targetAppid)&&
        Objects.equals(this.additionalProperties, alipayOpenSearchBoxModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxDesc, boxId, brandId, businessBenefitSwitch, businessDistrictIds, customKeywords, imageId, imageName, merchantId, moduleId, moduleType, relatedAccounts, serviceInfos, targetAppid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchBoxModifyModel {\n");
    sb.append("    boxDesc: ").append(toIndentedString(boxDesc)).append("\n");
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    businessBenefitSwitch: ").append(toIndentedString(businessBenefitSwitch)).append("\n");
    sb.append("    businessDistrictIds: ").append(toIndentedString(businessDistrictIds)).append("\n");
    sb.append("    customKeywords: ").append(toIndentedString(customKeywords)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    relatedAccounts: ").append(toIndentedString(relatedAccounts)).append("\n");
    sb.append("    serviceInfos: ").append(toIndentedString(serviceInfos)).append("\n");
    sb.append("    targetAppid: ").append(toIndentedString(targetAppid)).append("\n");
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
    openapiFields.add("box_desc");
    openapiFields.add("box_id");
    openapiFields.add("brand_id");
    openapiFields.add("business_benefit_switch");
    openapiFields.add("business_district_ids");
    openapiFields.add("custom_keywords");
    openapiFields.add("image_id");
    openapiFields.add("image_name");
    openapiFields.add("merchant_id");
    openapiFields.add("module_id");
    openapiFields.add("module_type");
    openapiFields.add("related_accounts");
    openapiFields.add("service_infos");
    openapiFields.add("target_appid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchBoxModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchBoxModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchBoxModifyModel is not found in the empty JSON string", AlipayOpenSearchBoxModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("box_desc") != null && !jsonObj.get("box_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_desc").toString()));
      }
      if (jsonObj.get("box_id") != null && !jsonObj.get("box_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_id").toString()));
      }
      if (jsonObj.get("brand_id") != null && !jsonObj.get("brand_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("business_district_ids") != null && !jsonObj.get("business_district_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_district_ids` to be an array in the JSON string but got `%s`", jsonObj.get("business_district_ids").toString()));
      }
      if (jsonObj.get("custom_keywords") != null && !jsonObj.get("custom_keywords").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_keywords` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_keywords").toString()));
      }
      if (jsonObj.get("image_id") != null && !jsonObj.get("image_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_id").toString()));
      }
      if (jsonObj.get("image_name") != null && !jsonObj.get("image_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_name").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("module_id") != null && !jsonObj.get("module_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_id").toString()));
      }
      if (jsonObj.get("module_type") != null && !jsonObj.get("module_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_type").toString()));
      }
      JsonArray jsonArrayrelatedAccounts = jsonObj.getAsJsonArray("related_accounts");
      if (jsonArrayrelatedAccounts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("related_accounts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `related_accounts` to be an array in the JSON string but got `%s`", jsonObj.get("related_accounts").toString()));
        }

        // validate the optional field `related_accounts` (array)
        for (int i = 0; i < jsonArrayrelatedAccounts.size(); i++) {
          SearchBoxAppInfo.validateJsonObject(jsonArrayrelatedAccounts.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayserviceInfos = jsonObj.getAsJsonArray("service_infos");
      if (jsonArrayserviceInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("service_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `service_infos` to be an array in the JSON string but got `%s`", jsonObj.get("service_infos").toString()));
        }

        // validate the optional field `service_infos` (array)
        for (int i = 0; i < jsonArrayserviceInfos.size(); i++) {
          SearchBoxServiceInfo.validateJsonObject(jsonArrayserviceInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("target_appid") != null && !jsonObj.get("target_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchBoxModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchBoxModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchBoxModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchBoxModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchBoxModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchBoxModifyModel value) throws IOException {
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
           public AlipayOpenSearchBoxModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenSearchBoxModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenSearchBoxModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchBoxModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchBoxModifyModel
  */
  public static AlipayOpenSearchBoxModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchBoxModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchBoxModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

