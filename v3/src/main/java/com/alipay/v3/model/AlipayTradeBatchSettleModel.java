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
import com.alipay.v3.model.SettleClause;
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
 * AlipayTradeBatchSettleModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeBatchSettleModel {
  public static final String SERIALIZED_NAME_BIZ_PRODUCT = "biz_product";
  @SerializedName(SERIALIZED_NAME_BIZ_PRODUCT)
  private String bizProduct;

  public static final String SERIALIZED_NAME_EXTEND_PARAMS = "extend_params";
  @SerializedName(SERIALIZED_NAME_EXTEND_PARAMS)
  private String extendParams;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_SETTLE_CLAUSES = "settle_clauses";
  @SerializedName(SERIALIZED_NAME_SETTLE_CLAUSES)
  private List<SettleClause> settleClauses = null;

  public static final String SERIALIZED_NAME_SETTLE_TYPE = "settle_type";
  @SerializedName(SERIALIZED_NAME_SETTLE_TYPE)
  private String settleType;

  public AlipayTradeBatchSettleModel() { 
  }

  public AlipayTradeBatchSettleModel bizProduct(String bizProduct) {
    
    this.bizProduct = bizProduct;
    return this;
  }

   /**
   * 收单产品码，商家和支付宝签约的产品码
   * @return bizProduct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FACE_TO_FACE_PAYMENT", value = "收单产品码，商家和支付宝签约的产品码")

  public String getBizProduct() {
    return bizProduct;
  }


  public void setBizProduct(String bizProduct) {
    this.bizProduct = bizProduct;
  }


  public AlipayTradeBatchSettleModel extendParams(String extendParams) {
    
    this.extendParams = extendParams;
    return this;
  }

   /**
   * 扩展参数
   * @return extendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "扩展参数")

  public String getExtendParams() {
    return extendParams;
  }


  public void setExtendParams(String extendParams) {
    this.extendParams = extendParams;
  }


  public AlipayTradeBatchSettleModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 结算请求外部流水号，32个字符以内、可包含字母、数字、下划线；需保证在商户端不重复，如果重复则返回该流水号对应的结算单据的状态。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180101", value = "结算请求外部流水号，32个字符以内、可包含字母、数字、下划线；需保证在商户端不重复，如果重复则返回该流水号对应的结算单据的状态。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeBatchSettleModel settleClauses(List<SettleClause> settleClauses) {
    
    this.settleClauses = settleClauses;
    return this;
  }

  public AlipayTradeBatchSettleModel addSettleClausesItem(SettleClause settleClausesItem) {
    if (this.settleClauses == null) {
      this.settleClauses = new ArrayList<>();
    }
    this.settleClauses.add(settleClausesItem);
    return this;
  }

   /**
   * 结算明细条款
   * @return settleClauses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结算明细条款")

  public List<SettleClause> getSettleClauses() {
    return settleClauses;
  }


  public void setSettleClauses(List<SettleClause> settleClauses) {
    this.settleClauses = settleClauses;
  }


  public AlipayTradeBatchSettleModel settleType(String settleType) {
    
    this.settleType = settleType;
    return this;
  }

   /**
   * 结算方式，目前仅支持提前放款结算quickSettlement，提前放款结算需要商户开通快收服务，不填则为普通结算方式
   * @return settleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "quickSettlement", value = "结算方式，目前仅支持提前放款结算quickSettlement，提前放款结算需要商户开通快收服务，不填则为普通结算方式")

  public String getSettleType() {
    return settleType;
  }


  public void setSettleType(String settleType) {
    this.settleType = settleType;
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
   * @return the AlipayTradeBatchSettleModel instance itself
   */
  public AlipayTradeBatchSettleModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeBatchSettleModel alipayTradeBatchSettleModel = (AlipayTradeBatchSettleModel) o;
    return Objects.equals(this.bizProduct, alipayTradeBatchSettleModel.bizProduct) &&
        Objects.equals(this.extendParams, alipayTradeBatchSettleModel.extendParams) &&
        Objects.equals(this.outRequestNo, alipayTradeBatchSettleModel.outRequestNo) &&
        Objects.equals(this.settleClauses, alipayTradeBatchSettleModel.settleClauses) &&
        Objects.equals(this.settleType, alipayTradeBatchSettleModel.settleType)&&
        Objects.equals(this.additionalProperties, alipayTradeBatchSettleModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizProduct, extendParams, outRequestNo, settleClauses, settleType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeBatchSettleModel {\n");
    sb.append("    bizProduct: ").append(toIndentedString(bizProduct)).append("\n");
    sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    settleClauses: ").append(toIndentedString(settleClauses)).append("\n");
    sb.append("    settleType: ").append(toIndentedString(settleType)).append("\n");
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
    openapiFields.add("biz_product");
    openapiFields.add("extend_params");
    openapiFields.add("out_request_no");
    openapiFields.add("settle_clauses");
    openapiFields.add("settle_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeBatchSettleModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeBatchSettleModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeBatchSettleModel is not found in the empty JSON string", AlipayTradeBatchSettleModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_product") != null && !jsonObj.get("biz_product").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_product` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_product").toString()));
      }
      if (jsonObj.get("extend_params") != null && !jsonObj.get("extend_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_params").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      JsonArray jsonArraysettleClauses = jsonObj.getAsJsonArray("settle_clauses");
      if (jsonArraysettleClauses != null) {
        // ensure the json data is an array
        if (!jsonObj.get("settle_clauses").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `settle_clauses` to be an array in the JSON string but got `%s`", jsonObj.get("settle_clauses").toString()));
        }

        // validate the optional field `settle_clauses` (array)
        for (int i = 0; i < jsonArraysettleClauses.size(); i++) {
          SettleClause.validateJsonObject(jsonArraysettleClauses.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("settle_type") != null && !jsonObj.get("settle_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeBatchSettleModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeBatchSettleModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeBatchSettleModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeBatchSettleModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeBatchSettleModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeBatchSettleModel value) throws IOException {
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
           public AlipayTradeBatchSettleModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeBatchSettleModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeBatchSettleModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeBatchSettleModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeBatchSettleModel
  */
  public static AlipayTradeBatchSettleModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeBatchSettleModel.class);
  }

 /**
  * Convert an instance of AlipayTradeBatchSettleModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

