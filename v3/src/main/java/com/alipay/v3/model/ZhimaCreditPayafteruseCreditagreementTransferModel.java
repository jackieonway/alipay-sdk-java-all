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
 * ZhimaCreditPayafteruseCreditagreementTransferModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPayafteruseCreditagreementTransferModel {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_DEDUCT_AGREEMENT_NO = "deduct_agreement_no";
  @SerializedName(SERIALIZED_NAME_DEDUCT_AGREEMENT_NO)
  private String deductAgreementNo;

  public static final String SERIALIZED_NAME_EXTEND_PARAMS = "extend_params";
  @SerializedName(SERIALIZED_NAME_EXTEND_PARAMS)
  private String extendParams;

  public static final String SERIALIZED_NAME_OUT_AGREEMENT_NO = "out_agreement_no";
  @SerializedName(SERIALIZED_NAME_OUT_AGREEMENT_NO)
  private String outAgreementNo;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_ZM_SERVICE_ID = "zm_service_id";
  @SerializedName(SERIALIZED_NAME_ZM_SERVICE_ID)
  private String zmServiceId;

  public ZhimaCreditPayafteruseCreditagreementTransferModel() { 
  }

  public ZhimaCreditPayafteruseCreditagreementTransferModel categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 芝麻外部类目
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "credit_pay_test", value = "芝麻外部类目")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public ZhimaCreditPayafteruseCreditagreementTransferModel deductAgreementNo(String deductAgreementNo) {
    
    this.deductAgreementNo = deductAgreementNo;
    return this;
  }

   /**
   * 用户的代扣协议号
   * @return deductAgreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215401139331610689", value = "用户的代扣协议号")

  public String getDeductAgreementNo() {
    return deductAgreementNo;
  }


  public void setDeductAgreementNo(String deductAgreementNo) {
    this.deductAgreementNo = deductAgreementNo;
  }


  public ZhimaCreditPayafteruseCreditagreementTransferModel extendParams(String extendParams) {
    
    this.extendParams = extendParams;
    return this;
  }

   /**
   * 业务扩展参数，Json格式
   * @return extendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "业务扩展参数，Json格式")

  public String getExtendParams() {
    return extendParams;
  }


  public void setExtendParams(String extendParams) {
    this.extendParams = extendParams;
  }


  public ZhimaCreditPayafteruseCreditagreementTransferModel outAgreementNo(String outAgreementNo) {
    
    this.outAgreementNo = outAgreementNo;
    return this;
  }

   /**
   * 商户外部协议号，不同的支付宝用户需要传递不同的外部单号
   * @return outAgreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014070700166653", value = "商户外部协议号，不同的支付宝用户需要传递不同的外部单号")

  public String getOutAgreementNo() {
    return outAgreementNo;
  }


  public void setOutAgreementNo(String outAgreementNo) {
    this.outAgreementNo = outAgreementNo;
  }


  public ZhimaCreditPayafteruseCreditagreementTransferModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 商户签约的芝麻产品的产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREDIT_RISK_ASSESSMENT", value = "商户签约的芝麻产品的产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public ZhimaCreditPayafteruseCreditagreementTransferModel zmServiceId(String zmServiceId) {
    
    this.zmServiceId = zmServiceId;
    return this;
  }

   /**
   * 芝麻信用服务ID
   * @return zmServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020050722001440031000061082", value = "芝麻信用服务ID")

  public String getZmServiceId() {
    return zmServiceId;
  }


  public void setZmServiceId(String zmServiceId) {
    this.zmServiceId = zmServiceId;
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
   * @return the ZhimaCreditPayafteruseCreditagreementTransferModel instance itself
   */
  public ZhimaCreditPayafteruseCreditagreementTransferModel putAdditionalProperty(String key, Object value) {
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
    ZhimaCreditPayafteruseCreditagreementTransferModel zhimaCreditPayafteruseCreditagreementTransferModel = (ZhimaCreditPayafteruseCreditagreementTransferModel) o;
    return Objects.equals(this.categoryId, zhimaCreditPayafteruseCreditagreementTransferModel.categoryId) &&
        Objects.equals(this.deductAgreementNo, zhimaCreditPayafteruseCreditagreementTransferModel.deductAgreementNo) &&
        Objects.equals(this.extendParams, zhimaCreditPayafteruseCreditagreementTransferModel.extendParams) &&
        Objects.equals(this.outAgreementNo, zhimaCreditPayafteruseCreditagreementTransferModel.outAgreementNo) &&
        Objects.equals(this.productCode, zhimaCreditPayafteruseCreditagreementTransferModel.productCode) &&
        Objects.equals(this.zmServiceId, zhimaCreditPayafteruseCreditagreementTransferModel.zmServiceId)&&
        Objects.equals(this.additionalProperties, zhimaCreditPayafteruseCreditagreementTransferModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, deductAgreementNo, extendParams, outAgreementNo, productCode, zmServiceId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPayafteruseCreditagreementTransferModel {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    deductAgreementNo: ").append(toIndentedString(deductAgreementNo)).append("\n");
    sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
    sb.append("    outAgreementNo: ").append(toIndentedString(outAgreementNo)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    zmServiceId: ").append(toIndentedString(zmServiceId)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("deduct_agreement_no");
    openapiFields.add("extend_params");
    openapiFields.add("out_agreement_no");
    openapiFields.add("product_code");
    openapiFields.add("zm_service_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPayafteruseCreditagreementTransferModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPayafteruseCreditagreementTransferModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPayafteruseCreditagreementTransferModel is not found in the empty JSON string", ZhimaCreditPayafteruseCreditagreementTransferModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("deduct_agreement_no") != null && !jsonObj.get("deduct_agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deduct_agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deduct_agreement_no").toString()));
      }
      if (jsonObj.get("extend_params") != null && !jsonObj.get("extend_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_params").toString()));
      }
      if (jsonObj.get("out_agreement_no") != null && !jsonObj.get("out_agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_agreement_no").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("zm_service_id") != null && !jsonObj.get("zm_service_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zm_service_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zm_service_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPayafteruseCreditagreementTransferModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPayafteruseCreditagreementTransferModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPayafteruseCreditagreementTransferModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPayafteruseCreditagreementTransferModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPayafteruseCreditagreementTransferModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPayafteruseCreditagreementTransferModel value) throws IOException {
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
           public ZhimaCreditPayafteruseCreditagreementTransferModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZhimaCreditPayafteruseCreditagreementTransferModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZhimaCreditPayafteruseCreditagreementTransferModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPayafteruseCreditagreementTransferModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPayafteruseCreditagreementTransferModel
  */
  public static ZhimaCreditPayafteruseCreditagreementTransferModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPayafteruseCreditagreementTransferModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPayafteruseCreditagreementTransferModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

