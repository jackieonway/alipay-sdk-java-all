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
import com.alipay.v3.model.PaymentFixVoucher;
import com.alipay.v3.model.PaymentVoucherValidPeriod;
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
 * PaymentVoucherUseRuleDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentVoucherUseRuleDetail {
  public static final String SERIALIZED_NAME_FIX_VOUCHER = "fix_voucher";
  @SerializedName(SERIALIZED_NAME_FIX_VOUCHER)
  private PaymentFixVoucher fixVoucher;

  public static final String SERIALIZED_NAME_USE_MODE = "use_mode";
  @SerializedName(SERIALIZED_NAME_USE_MODE)
  private String useMode;

  public static final String SERIALIZED_NAME_USE_URL = "use_url";
  @SerializedName(SERIALIZED_NAME_USE_URL)
  private String useUrl;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER = "voucher_quantity_limit_per_user";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER)
  private Integer voucherQuantityLimitPerUser;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER_PERIOD_TYPE = "voucher_quantity_limit_per_user_period_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER_PERIOD_TYPE)
  private String voucherQuantityLimitPerUserPeriodType;

  public static final String SERIALIZED_NAME_VOUCHER_VALID_PERIOD = "voucher_valid_period";
  @SerializedName(SERIALIZED_NAME_VOUCHER_VALID_PERIOD)
  private PaymentVoucherValidPeriod voucherValidPeriod;

  public PaymentVoucherUseRuleDetail() { 
  }

  public PaymentVoucherUseRuleDetail fixVoucher(PaymentFixVoucher fixVoucher) {
    
    this.fixVoucher = fixVoucher;
    return this;
  }

   /**
   * Get fixVoucher
   * @return fixVoucher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentFixVoucher getFixVoucher() {
    return fixVoucher;
  }


  public void setFixVoucher(PaymentFixVoucher fixVoucher) {
    this.fixVoucher = fixVoucher;
  }


  public PaymentVoucherUseRuleDetail useMode(String useMode) {
    
    this.useMode = useMode;
    return this;
  }

   /**
   * 核销跳转方式,默认CAN_USE(详情页展示可使用按钮)
   * @return useMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SELF_LINK", value = "核销跳转方式,默认CAN_USE(详情页展示可使用按钮)")

  public String getUseMode() {
    return useMode;
  }


  public void setUseMode(String useMode) {
    this.useMode = useMode;
  }


  public PaymentVoucherUseRuleDetail useUrl(String useUrl) {
    
    this.useUrl = useUrl;
    return this;
  }

   /**
   * 核销跳转链接 限制: 1、只有use_mode为SELF_LINK时该值有效且必传。 2、核销跳转链接必须是支付宝小程序链接。
   * @return useUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId=201911136XXXXX&noneExit=true", value = "核销跳转链接 限制: 1、只有use_mode为SELF_LINK时该值有效且必传。 2、核销跳转链接必须是支付宝小程序链接。")

  public String getUseUrl() {
    return useUrl;
  }


  public void setUseUrl(String useUrl) {
    this.useUrl = useUrl;
  }


  public PaymentVoucherUseRuleDetail voucherQuantityLimitPerUser(Integer voucherQuantityLimitPerUser) {
    
    this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
    return this;
  }

   /**
   * 每个支付宝账号的核销次数限制。 默认不限制
   * @return voucherQuantityLimitPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "每个支付宝账号的核销次数限制。 默认不限制")

  public Integer getVoucherQuantityLimitPerUser() {
    return voucherQuantityLimitPerUser;
  }


  public void setVoucherQuantityLimitPerUser(Integer voucherQuantityLimitPerUser) {
    this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
  }


  public PaymentVoucherUseRuleDetail voucherQuantityLimitPerUserPeriodType(String voucherQuantityLimitPerUserPeriodType) {
    
    this.voucherQuantityLimitPerUserPeriodType = voucherQuantityLimitPerUserPeriodType;
    return this;
  }

   /**
   * 核销次数限制周期配置。默认值LIFE_CYCLE表示限制每个支付宝账号在整个活动期间核销次数。
   * @return voucherQuantityLimitPerUserPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAY", value = "核销次数限制周期配置。默认值LIFE_CYCLE表示限制每个支付宝账号在整个活动期间核销次数。")

  public String getVoucherQuantityLimitPerUserPeriodType() {
    return voucherQuantityLimitPerUserPeriodType;
  }


  public void setVoucherQuantityLimitPerUserPeriodType(String voucherQuantityLimitPerUserPeriodType) {
    this.voucherQuantityLimitPerUserPeriodType = voucherQuantityLimitPerUserPeriodType;
  }


  public PaymentVoucherUseRuleDetail voucherValidPeriod(PaymentVoucherValidPeriod voucherValidPeriod) {
    
    this.voucherValidPeriod = voucherValidPeriod;
    return this;
  }

   /**
   * Get voucherValidPeriod
   * @return voucherValidPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherValidPeriod getVoucherValidPeriod() {
    return voucherValidPeriod;
  }


  public void setVoucherValidPeriod(PaymentVoucherValidPeriod voucherValidPeriod) {
    this.voucherValidPeriod = voucherValidPeriod;
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
   * @return the PaymentVoucherUseRuleDetail instance itself
   */
  public PaymentVoucherUseRuleDetail putAdditionalProperty(String key, Object value) {
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
    PaymentVoucherUseRuleDetail paymentVoucherUseRuleDetail = (PaymentVoucherUseRuleDetail) o;
    return Objects.equals(this.fixVoucher, paymentVoucherUseRuleDetail.fixVoucher) &&
        Objects.equals(this.useMode, paymentVoucherUseRuleDetail.useMode) &&
        Objects.equals(this.useUrl, paymentVoucherUseRuleDetail.useUrl) &&
        Objects.equals(this.voucherQuantityLimitPerUser, paymentVoucherUseRuleDetail.voucherQuantityLimitPerUser) &&
        Objects.equals(this.voucherQuantityLimitPerUserPeriodType, paymentVoucherUseRuleDetail.voucherQuantityLimitPerUserPeriodType) &&
        Objects.equals(this.voucherValidPeriod, paymentVoucherUseRuleDetail.voucherValidPeriod)&&
        Objects.equals(this.additionalProperties, paymentVoucherUseRuleDetail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixVoucher, useMode, useUrl, voucherQuantityLimitPerUser, voucherQuantityLimitPerUserPeriodType, voucherValidPeriod, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVoucherUseRuleDetail {\n");
    sb.append("    fixVoucher: ").append(toIndentedString(fixVoucher)).append("\n");
    sb.append("    useMode: ").append(toIndentedString(useMode)).append("\n");
    sb.append("    useUrl: ").append(toIndentedString(useUrl)).append("\n");
    sb.append("    voucherQuantityLimitPerUser: ").append(toIndentedString(voucherQuantityLimitPerUser)).append("\n");
    sb.append("    voucherQuantityLimitPerUserPeriodType: ").append(toIndentedString(voucherQuantityLimitPerUserPeriodType)).append("\n");
    sb.append("    voucherValidPeriod: ").append(toIndentedString(voucherValidPeriod)).append("\n");
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
    openapiFields.add("fix_voucher");
    openapiFields.add("use_mode");
    openapiFields.add("use_url");
    openapiFields.add("voucher_quantity_limit_per_user");
    openapiFields.add("voucher_quantity_limit_per_user_period_type");
    openapiFields.add("voucher_valid_period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentVoucherUseRuleDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentVoucherUseRuleDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentVoucherUseRuleDetail is not found in the empty JSON string", PaymentVoucherUseRuleDetail.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `fix_voucher`
      if (jsonObj.getAsJsonObject("fix_voucher") != null) {
        PaymentFixVoucher.validateJsonObject(jsonObj.getAsJsonObject("fix_voucher"));
      }
      if (jsonObj.get("use_mode") != null && !jsonObj.get("use_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `use_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("use_mode").toString()));
      }
      if (jsonObj.get("use_url") != null && !jsonObj.get("use_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `use_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("use_url").toString()));
      }
      if (jsonObj.get("voucher_quantity_limit_per_user_period_type") != null && !jsonObj.get("voucher_quantity_limit_per_user_period_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_quantity_limit_per_user_period_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_quantity_limit_per_user_period_type").toString()));
      }
      // validate the optional field `voucher_valid_period`
      if (jsonObj.getAsJsonObject("voucher_valid_period") != null) {
        PaymentVoucherValidPeriod.validateJsonObject(jsonObj.getAsJsonObject("voucher_valid_period"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentVoucherUseRuleDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentVoucherUseRuleDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentVoucherUseRuleDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentVoucherUseRuleDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentVoucherUseRuleDetail>() {
           @Override
           public void write(JsonWriter out, PaymentVoucherUseRuleDetail value) throws IOException {
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
           public PaymentVoucherUseRuleDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentVoucherUseRuleDetail instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentVoucherUseRuleDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentVoucherUseRuleDetail
  * @throws IOException if the JSON string is invalid with respect to PaymentVoucherUseRuleDetail
  */
  public static PaymentVoucherUseRuleDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentVoucherUseRuleDetail.class);
  }

 /**
  * Convert an instance of PaymentVoucherUseRuleDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

