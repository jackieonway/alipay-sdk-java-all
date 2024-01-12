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
import com.alipay.v3.model.LogisticsAccountStatusDTO;
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
 * AlipayOpenInstantdeliveryAccountQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenInstantdeliveryAccountQueryResponseModel {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE = "business_license";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE)
  private String businessLicense;

  public static final String SERIALIZED_NAME_BUSINESS_SCOPE = "business_scope";
  @SerializedName(SERIALIZED_NAME_BUSINESS_SCOPE)
  private String businessScope;

  public static final String SERIALIZED_NAME_CREDIT_CODE = "credit_code";
  @SerializedName(SERIALIZED_NAME_CREDIT_CODE)
  private String creditCode;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ENTERPRISE_ADDRESS = "enterprise_address";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ADDRESS)
  private String enterpriseAddress;

  public static final String SERIALIZED_NAME_ENTERPRISE_CITY = "enterprise_city";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_CITY)
  private String enterpriseCity;

  public static final String SERIALIZED_NAME_ENTERPRISE_DISTRICT = "enterprise_district";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_DISTRICT)
  private String enterpriseDistrict;

  public static final String SERIALIZED_NAME_ENTERPRISE_NAME = "enterprise_name";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_NAME)
  private String enterpriseName;

  public static final String SERIALIZED_NAME_ENTERPRISE_PROVINCE = "enterprise_province";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_PROVINCE)
  private String enterpriseProvince;

  public static final String SERIALIZED_NAME_ENTERPRISE_TYPE = "enterprise_type";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_TYPE)
  private String enterpriseType;

  public static final String SERIALIZED_NAME_LOGISTICS_ACCOUNT_STATUS = "logistics_account_status";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_ACCOUNT_STATUS)
  private List<LogisticsAccountStatusDTO> logisticsAccountStatus = null;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public AlipayOpenInstantdeliveryAccountQueryResponseModel() { 
  }

  public AlipayOpenInstantdeliveryAccountQueryResponseModel balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 账户余额
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.3", value = "账户余额")

  public String getBalance() {
    return balance;
  }


  public void setBalance(String balance) {
    this.balance = balance;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel businessLicense(String businessLicense) {
    
    this.businessLicense = businessLicense;
    return this;
  }

   /**
   * 企业营业执照图片正反面
   * @return businessLicense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://xxx", value = "企业营业执照图片正反面")

  public String getBusinessLicense() {
    return businessLicense;
  }


  public void setBusinessLicense(String businessLicense) {
    this.businessLicense = businessLicense;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel businessScope(String businessScope) {
    
    this.businessScope = businessScope;
    return this;
  }

   /**
   * 经营范围
   * @return businessScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XXX", value = "经营范围")

  public String getBusinessScope() {
    return businessScope;
  }


  public void setBusinessScope(String businessScope) {
    this.businessScope = businessScope;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel creditCode(String creditCode) {
    
    this.creditCode = creditCode;
    return this;
  }

   /**
   * 统一社会信用代码
   * @return creditCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XXX", value = "统一社会信用代码")

  public String getCreditCode() {
    return creditCode;
  }


  public void setCreditCode(String creditCode) {
    this.creditCode = creditCode;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 联系人邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx@alipay.com", value = "联系人邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel enterpriseAddress(String enterpriseAddress) {
    
    this.enterpriseAddress = enterpriseAddress;
    return this;
  }

   /**
   * 企业地址
   * @return enterpriseAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XXX街道108号", value = "企业地址")

  public String getEnterpriseAddress() {
    return enterpriseAddress;
  }


  public void setEnterpriseAddress(String enterpriseAddress) {
    this.enterpriseAddress = enterpriseAddress;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel enterpriseCity(String enterpriseCity) {
    
    this.enterpriseCity = enterpriseCity;
    return this;
  }

   /**
   * 企业所在地，市编码
   * @return enterpriseCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XX", value = "企业所在地，市编码")

  public String getEnterpriseCity() {
    return enterpriseCity;
  }


  public void setEnterpriseCity(String enterpriseCity) {
    this.enterpriseCity = enterpriseCity;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel enterpriseDistrict(String enterpriseDistrict) {
    
    this.enterpriseDistrict = enterpriseDistrict;
    return this;
  }

   /**
   * 企业所在地，区编码
   * @return enterpriseDistrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XX", value = "企业所在地，区编码")

  public String getEnterpriseDistrict() {
    return enterpriseDistrict;
  }


  public void setEnterpriseDistrict(String enterpriseDistrict) {
    this.enterpriseDistrict = enterpriseDistrict;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel enterpriseName(String enterpriseName) {
    
    this.enterpriseName = enterpriseName;
    return this;
  }

   /**
   * 企业全称
   * @return enterpriseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "淘宝", value = "企业全称")

  public String getEnterpriseName() {
    return enterpriseName;
  }


  public void setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel enterpriseProvince(String enterpriseProvince) {
    
    this.enterpriseProvince = enterpriseProvince;
    return this;
  }

   /**
   * 企业所在地，省编码
   * @return enterpriseProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XX", value = "企业所在地，省编码")

  public String getEnterpriseProvince() {
    return enterpriseProvince;
  }


  public void setEnterpriseProvince(String enterpriseProvince) {
    this.enterpriseProvince = enterpriseProvince;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel enterpriseType(String enterpriseType) {
    
    this.enterpriseType = enterpriseType;
    return this;
  }

   /**
   * 企业类型
   * @return enterpriseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "企业类型")

  public String getEnterpriseType() {
    return enterpriseType;
  }


  public void setEnterpriseType(String enterpriseType) {
    this.enterpriseType = enterpriseType;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel logisticsAccountStatus(List<LogisticsAccountStatusDTO> logisticsAccountStatus) {
    
    this.logisticsAccountStatus = logisticsAccountStatus;
    return this;
  }

  public AlipayOpenInstantdeliveryAccountQueryResponseModel addLogisticsAccountStatusItem(LogisticsAccountStatusDTO logisticsAccountStatusItem) {
    if (this.logisticsAccountStatus == null) {
      this.logisticsAccountStatus = new ArrayList<>();
    }
    this.logisticsAccountStatus.add(logisticsAccountStatusItem);
    return this;
  }

   /**
   * 在配送公司的账户状态信息
   * @return logisticsAccountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "在配送公司的账户状态信息")

  public List<LogisticsAccountStatusDTO> getLogisticsAccountStatus() {
    return logisticsAccountStatus;
  }


  public void setLogisticsAccountStatus(List<LogisticsAccountStatusDTO> logisticsAccountStatus) {
    this.logisticsAccountStatus = logisticsAccountStatus;
  }


  public AlipayOpenInstantdeliveryAccountQueryResponseModel phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 联系人手机号
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "138xxxxxxxx", value = "联系人手机号")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
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
   * @return the AlipayOpenInstantdeliveryAccountQueryResponseModel instance itself
   */
  public AlipayOpenInstantdeliveryAccountQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenInstantdeliveryAccountQueryResponseModel alipayOpenInstantdeliveryAccountQueryResponseModel = (AlipayOpenInstantdeliveryAccountQueryResponseModel) o;
    return Objects.equals(this.balance, alipayOpenInstantdeliveryAccountQueryResponseModel.balance) &&
        Objects.equals(this.businessLicense, alipayOpenInstantdeliveryAccountQueryResponseModel.businessLicense) &&
        Objects.equals(this.businessScope, alipayOpenInstantdeliveryAccountQueryResponseModel.businessScope) &&
        Objects.equals(this.creditCode, alipayOpenInstantdeliveryAccountQueryResponseModel.creditCode) &&
        Objects.equals(this.email, alipayOpenInstantdeliveryAccountQueryResponseModel.email) &&
        Objects.equals(this.enterpriseAddress, alipayOpenInstantdeliveryAccountQueryResponseModel.enterpriseAddress) &&
        Objects.equals(this.enterpriseCity, alipayOpenInstantdeliveryAccountQueryResponseModel.enterpriseCity) &&
        Objects.equals(this.enterpriseDistrict, alipayOpenInstantdeliveryAccountQueryResponseModel.enterpriseDistrict) &&
        Objects.equals(this.enterpriseName, alipayOpenInstantdeliveryAccountQueryResponseModel.enterpriseName) &&
        Objects.equals(this.enterpriseProvince, alipayOpenInstantdeliveryAccountQueryResponseModel.enterpriseProvince) &&
        Objects.equals(this.enterpriseType, alipayOpenInstantdeliveryAccountQueryResponseModel.enterpriseType) &&
        Objects.equals(this.logisticsAccountStatus, alipayOpenInstantdeliveryAccountQueryResponseModel.logisticsAccountStatus) &&
        Objects.equals(this.phone, alipayOpenInstantdeliveryAccountQueryResponseModel.phone)&&
        Objects.equals(this.additionalProperties, alipayOpenInstantdeliveryAccountQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, businessLicense, businessScope, creditCode, email, enterpriseAddress, enterpriseCity, enterpriseDistrict, enterpriseName, enterpriseProvince, enterpriseType, logisticsAccountStatus, phone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenInstantdeliveryAccountQueryResponseModel {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    businessLicense: ").append(toIndentedString(businessLicense)).append("\n");
    sb.append("    businessScope: ").append(toIndentedString(businessScope)).append("\n");
    sb.append("    creditCode: ").append(toIndentedString(creditCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    enterpriseAddress: ").append(toIndentedString(enterpriseAddress)).append("\n");
    sb.append("    enterpriseCity: ").append(toIndentedString(enterpriseCity)).append("\n");
    sb.append("    enterpriseDistrict: ").append(toIndentedString(enterpriseDistrict)).append("\n");
    sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
    sb.append("    enterpriseProvince: ").append(toIndentedString(enterpriseProvince)).append("\n");
    sb.append("    enterpriseType: ").append(toIndentedString(enterpriseType)).append("\n");
    sb.append("    logisticsAccountStatus: ").append(toIndentedString(logisticsAccountStatus)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("business_license");
    openapiFields.add("business_scope");
    openapiFields.add("credit_code");
    openapiFields.add("email");
    openapiFields.add("enterprise_address");
    openapiFields.add("enterprise_city");
    openapiFields.add("enterprise_district");
    openapiFields.add("enterprise_name");
    openapiFields.add("enterprise_province");
    openapiFields.add("enterprise_type");
    openapiFields.add("logistics_account_status");
    openapiFields.add("phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenInstantdeliveryAccountQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenInstantdeliveryAccountQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenInstantdeliveryAccountQueryResponseModel is not found in the empty JSON string", AlipayOpenInstantdeliveryAccountQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("balance") != null && !jsonObj.get("balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance").toString()));
      }
      if (jsonObj.get("business_license") != null && !jsonObj.get("business_license").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_license` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_license").toString()));
      }
      if (jsonObj.get("business_scope") != null && !jsonObj.get("business_scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_scope").toString()));
      }
      if (jsonObj.get("credit_code") != null && !jsonObj.get("credit_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_code").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("enterprise_address") != null && !jsonObj.get("enterprise_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_address").toString()));
      }
      if (jsonObj.get("enterprise_city") != null && !jsonObj.get("enterprise_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_city").toString()));
      }
      if (jsonObj.get("enterprise_district") != null && !jsonObj.get("enterprise_district").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_district` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_district").toString()));
      }
      if (jsonObj.get("enterprise_name") != null && !jsonObj.get("enterprise_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_name").toString()));
      }
      if (jsonObj.get("enterprise_province") != null && !jsonObj.get("enterprise_province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_province").toString()));
      }
      if (jsonObj.get("enterprise_type") != null && !jsonObj.get("enterprise_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_type").toString()));
      }
      JsonArray jsonArraylogisticsAccountStatus = jsonObj.getAsJsonArray("logistics_account_status");
      if (jsonArraylogisticsAccountStatus != null) {
        // ensure the json data is an array
        if (!jsonObj.get("logistics_account_status").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `logistics_account_status` to be an array in the JSON string but got `%s`", jsonObj.get("logistics_account_status").toString()));
        }

        // validate the optional field `logistics_account_status` (array)
        for (int i = 0; i < jsonArraylogisticsAccountStatus.size(); i++) {
          LogisticsAccountStatusDTO.validateJsonObject(jsonArraylogisticsAccountStatus.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenInstantdeliveryAccountQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenInstantdeliveryAccountQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenInstantdeliveryAccountQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenInstantdeliveryAccountQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenInstantdeliveryAccountQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenInstantdeliveryAccountQueryResponseModel value) throws IOException {
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
           public AlipayOpenInstantdeliveryAccountQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenInstantdeliveryAccountQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenInstantdeliveryAccountQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenInstantdeliveryAccountQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenInstantdeliveryAccountQueryResponseModel
  */
  public static AlipayOpenInstantdeliveryAccountQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenInstantdeliveryAccountQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenInstantdeliveryAccountQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

