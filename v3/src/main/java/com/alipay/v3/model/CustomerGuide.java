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
import com.alipay.v3.model.VoucherSendGuide;
import com.alipay.v3.model.VoucherUseGuide;
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
 * CustomerGuide
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerGuide {
  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_MINI_APP_PATH = "mini_app_path";
  @SerializedName(SERIALIZED_NAME_MINI_APP_PATH)
  private String miniAppPath;

  public static final String SERIALIZED_NAME_REAL_SHOP_IDS = "real_shop_ids";
  @SerializedName(SERIALIZED_NAME_REAL_SHOP_IDS)
  private List<String> realShopIds = null;

  public static final String SERIALIZED_NAME_SERVICE_CODES = "service_codes";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODES)
  private List<String> serviceCodes = null;

  public static final String SERIALIZED_NAME_SHOP_IDS = "shop_ids";
  @SerializedName(SERIALIZED_NAME_SHOP_IDS)
  private List<String> shopIds = null;

  public static final String SERIALIZED_NAME_STORE_IDS = "store_ids";
  @SerializedName(SERIALIZED_NAME_STORE_IDS)
  private List<String> storeIds = null;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_GUIDE = "voucher_send_guide";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_GUIDE)
  private VoucherSendGuide voucherSendGuide;

  public static final String SERIALIZED_NAME_VOUCHER_USE_GUIDE = "voucher_use_guide";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_GUIDE)
  private VoucherUseGuide voucherUseGuide;

  public CustomerGuide() { 
  }

  public CustomerGuide miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 券可用的小程序appId，卡包详情页可跳转到该appId
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可用的小程序appId，卡包详情页可跳转到该appId")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public CustomerGuide miniAppPath(String miniAppPath) {
    
    this.miniAppPath = miniAppPath;
    return this;
  }

   /**
   * 指定跳转到mini_app_id时的具体页面路径。  限制：  1、只有mini_app_id有值时该值传入才会有效 2、该小程序路径是相对路径。详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/support/01rb18\&quot;&gt;小程序scheme链接介绍&lt;/a&gt;
   * @return miniAppPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定跳转到mini_app_id时的具体页面路径。  限制：  1、只有mini_app_id有值时该值传入才会有效 2、该小程序路径是相对路径。详情参见 <a href=\"https://opendocs.alipay.com/support/01rb18\">小程序scheme链接介绍</a>")

  public String getMiniAppPath() {
    return miniAppPath;
  }


  public void setMiniAppPath(String miniAppPath) {
    this.miniAppPath = miniAppPath;
  }


  public CustomerGuide realShopIds(List<String> realShopIds) {
    
    this.realShopIds = realShopIds;
    return this;
  }

  public CustomerGuide addRealShopIdsItem(String realShopIdsItem) {
    if (this.realShopIds == null) {
      this.realShopIds = new ArrayList<>();
    }
    this.realShopIds.add(realShopIdsItem);
    return this;
  }

   /**
   * 代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id。接口参数是列表类型。
   * @return realShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id。接口参数是列表类型。")

  public List<String> getRealShopIds() {
    return realShopIds;
  }


  public void setRealShopIds(List<String> realShopIds) {
    this.realShopIds = realShopIds;
  }


  public CustomerGuide serviceCodes(List<String> serviceCodes) {
    
    this.serviceCodes = serviceCodes;
    return this;
  }

  public CustomerGuide addServiceCodesItem(String serviceCodesItem) {
    if (this.serviceCodes == null) {
      this.serviceCodes = new ArrayList<>();
    }
    this.serviceCodes.add(serviceCodesItem);
    return this;
  }

   /**
   * 小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。
   * @return serviceCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。")

  public List<String> getServiceCodes() {
    return serviceCodes;
  }


  public void setServiceCodes(List<String> serviceCodes) {
    this.serviceCodes = serviceCodes;
  }


  public CustomerGuide shopIds(List<String> shopIds) {
    
    this.shopIds = shopIds;
    return this;
  }

  public CustomerGuide addShopIdsItem(String shopIdsItem) {
    if (this.shopIds == null) {
      this.shopIds = new ArrayList<>();
    }
    this.shopIds.add(shopIdsItem);
    return this;
  }

   /**
   * 券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id  接口参数是列表类型。
   * @return shopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id  接口参数是列表类型。")

  public List<String> getShopIds() {
    return shopIds;
  }


  public void setShopIds(List<String> shopIds) {
    this.shopIds = shopIds;
  }


  public CustomerGuide storeIds(List<String> storeIds) {
    
    this.storeIds = storeIds;
    return this;
  }

  public CustomerGuide addStoreIdsItem(String storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * 该字段后续废弃。券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id。接口参数是列表类型。
   * @return storeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段后续废弃。券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id。接口参数是列表类型。")

  public List<String> getStoreIds() {
    return storeIds;
  }


  public void setStoreIds(List<String> storeIds) {
    this.storeIds = storeIds;
  }


  public CustomerGuide voucherSendGuide(VoucherSendGuide voucherSendGuide) {
    
    this.voucherSendGuide = voucherSendGuide;
    return this;
  }

   /**
   * Get voucherSendGuide
   * @return voucherSendGuide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSendGuide getVoucherSendGuide() {
    return voucherSendGuide;
  }


  public void setVoucherSendGuide(VoucherSendGuide voucherSendGuide) {
    this.voucherSendGuide = voucherSendGuide;
  }


  public CustomerGuide voucherUseGuide(VoucherUseGuide voucherUseGuide) {
    
    this.voucherUseGuide = voucherUseGuide;
    return this;
  }

   /**
   * Get voucherUseGuide
   * @return voucherUseGuide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseGuide getVoucherUseGuide() {
    return voucherUseGuide;
  }


  public void setVoucherUseGuide(VoucherUseGuide voucherUseGuide) {
    this.voucherUseGuide = voucherUseGuide;
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
   * @return the CustomerGuide instance itself
   */
  public CustomerGuide putAdditionalProperty(String key, Object value) {
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
    CustomerGuide customerGuide = (CustomerGuide) o;
    return Objects.equals(this.miniAppId, customerGuide.miniAppId) &&
        Objects.equals(this.miniAppPath, customerGuide.miniAppPath) &&
        Objects.equals(this.realShopIds, customerGuide.realShopIds) &&
        Objects.equals(this.serviceCodes, customerGuide.serviceCodes) &&
        Objects.equals(this.shopIds, customerGuide.shopIds) &&
        Objects.equals(this.storeIds, customerGuide.storeIds) &&
        Objects.equals(this.voucherSendGuide, customerGuide.voucherSendGuide) &&
        Objects.equals(this.voucherUseGuide, customerGuide.voucherUseGuide)&&
        Objects.equals(this.additionalProperties, customerGuide.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniAppId, miniAppPath, realShopIds, serviceCodes, shopIds, storeIds, voucherSendGuide, voucherUseGuide, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerGuide {\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    miniAppPath: ").append(toIndentedString(miniAppPath)).append("\n");
    sb.append("    realShopIds: ").append(toIndentedString(realShopIds)).append("\n");
    sb.append("    serviceCodes: ").append(toIndentedString(serviceCodes)).append("\n");
    sb.append("    shopIds: ").append(toIndentedString(shopIds)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    voucherSendGuide: ").append(toIndentedString(voucherSendGuide)).append("\n");
    sb.append("    voucherUseGuide: ").append(toIndentedString(voucherUseGuide)).append("\n");
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
    openapiFields.add("mini_app_id");
    openapiFields.add("mini_app_path");
    openapiFields.add("real_shop_ids");
    openapiFields.add("service_codes");
    openapiFields.add("shop_ids");
    openapiFields.add("store_ids");
    openapiFields.add("voucher_send_guide");
    openapiFields.add("voucher_use_guide");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerGuide
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomerGuide.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerGuide is not found in the empty JSON string", CustomerGuide.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("mini_app_path") != null && !jsonObj.get("mini_app_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_path").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("real_shop_ids") != null && !jsonObj.get("real_shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("real_shop_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("service_codes") != null && !jsonObj.get("service_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_codes` to be an array in the JSON string but got `%s`", jsonObj.get("service_codes").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("shop_ids") != null && !jsonObj.get("shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("shop_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("store_ids") != null && !jsonObj.get("store_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_ids` to be an array in the JSON string but got `%s`", jsonObj.get("store_ids").toString()));
      }
      // validate the optional field `voucher_send_guide`
      if (jsonObj.getAsJsonObject("voucher_send_guide") != null) {
        VoucherSendGuide.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_guide"));
      }
      // validate the optional field `voucher_use_guide`
      if (jsonObj.getAsJsonObject("voucher_use_guide") != null) {
        VoucherUseGuide.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_guide"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerGuide.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerGuide' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerGuide> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerGuide.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerGuide>() {
           @Override
           public void write(JsonWriter out, CustomerGuide value) throws IOException {
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
           public CustomerGuide read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomerGuide instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomerGuide given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerGuide
  * @throws IOException if the JSON string is invalid with respect to CustomerGuide
  */
  public static CustomerGuide fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerGuide.class);
  }

 /**
  * Convert an instance of CustomerGuide to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

