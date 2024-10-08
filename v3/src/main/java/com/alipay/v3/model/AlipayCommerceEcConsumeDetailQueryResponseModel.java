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
import com.alipay.v3.model.EcConsumeInfo;
import com.alipay.v3.model.EcOrderInfo;
import com.alipay.v3.model.EcVoucherInfo;
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
 * AlipayCommerceEcConsumeDetailQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcConsumeDetailQueryResponseModel {
  public static final String SERIALIZED_NAME_CONSUME_INFO = "consume_info";
  @SerializedName(SERIALIZED_NAME_CONSUME_INFO)
  private EcConsumeInfo consumeInfo;

  public static final String SERIALIZED_NAME_RELATED_ORDER_INFO = "related_order_info";
  @SerializedName(SERIALIZED_NAME_RELATED_ORDER_INFO)
  private EcOrderInfo relatedOrderInfo;

  public static final String SERIALIZED_NAME_RELATED_REFUND_LIST = "related_refund_list";
  @SerializedName(SERIALIZED_NAME_RELATED_REFUND_LIST)
  private List<EcConsumeInfo> relatedRefundList = null;

  public static final String SERIALIZED_NAME_RELATED_VOUCHER_LIST = "related_voucher_list";
  @SerializedName(SERIALIZED_NAME_RELATED_VOUCHER_LIST)
  private List<EcVoucherInfo> relatedVoucherList = null;

  public AlipayCommerceEcConsumeDetailQueryResponseModel() { 
  }

  public AlipayCommerceEcConsumeDetailQueryResponseModel consumeInfo(EcConsumeInfo consumeInfo) {
    
    this.consumeInfo = consumeInfo;
    return this;
  }

   /**
   * Get consumeInfo
   * @return consumeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EcConsumeInfo getConsumeInfo() {
    return consumeInfo;
  }


  public void setConsumeInfo(EcConsumeInfo consumeInfo) {
    this.consumeInfo = consumeInfo;
  }


  public AlipayCommerceEcConsumeDetailQueryResponseModel relatedOrderInfo(EcOrderInfo relatedOrderInfo) {
    
    this.relatedOrderInfo = relatedOrderInfo;
    return this;
  }

   /**
   * Get relatedOrderInfo
   * @return relatedOrderInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EcOrderInfo getRelatedOrderInfo() {
    return relatedOrderInfo;
  }


  public void setRelatedOrderInfo(EcOrderInfo relatedOrderInfo) {
    this.relatedOrderInfo = relatedOrderInfo;
  }


  public AlipayCommerceEcConsumeDetailQueryResponseModel relatedRefundList(List<EcConsumeInfo> relatedRefundList) {
    
    this.relatedRefundList = relatedRefundList;
    return this;
  }

  public AlipayCommerceEcConsumeDetailQueryResponseModel addRelatedRefundListItem(EcConsumeInfo relatedRefundListItem) {
    if (this.relatedRefundList == null) {
      this.relatedRefundList = new ArrayList<>();
    }
    this.relatedRefundList.add(relatedRefundListItem);
    return this;
  }

   /**
   * 关联账单列表
   * @return relatedRefundList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关联账单列表")

  public List<EcConsumeInfo> getRelatedRefundList() {
    return relatedRefundList;
  }


  public void setRelatedRefundList(List<EcConsumeInfo> relatedRefundList) {
    this.relatedRefundList = relatedRefundList;
  }


  public AlipayCommerceEcConsumeDetailQueryResponseModel relatedVoucherList(List<EcVoucherInfo> relatedVoucherList) {
    
    this.relatedVoucherList = relatedVoucherList;
    return this;
  }

  public AlipayCommerceEcConsumeDetailQueryResponseModel addRelatedVoucherListItem(EcVoucherInfo relatedVoucherListItem) {
    if (this.relatedVoucherList == null) {
      this.relatedVoucherList = new ArrayList<>();
    }
    this.relatedVoucherList.add(relatedVoucherListItem);
    return this;
  }

   /**
   * 关联凭证详情列表
   * @return relatedVoucherList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关联凭证详情列表")

  public List<EcVoucherInfo> getRelatedVoucherList() {
    return relatedVoucherList;
  }


  public void setRelatedVoucherList(List<EcVoucherInfo> relatedVoucherList) {
    this.relatedVoucherList = relatedVoucherList;
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
   * @return the AlipayCommerceEcConsumeDetailQueryResponseModel instance itself
   */
  public AlipayCommerceEcConsumeDetailQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceEcConsumeDetailQueryResponseModel alipayCommerceEcConsumeDetailQueryResponseModel = (AlipayCommerceEcConsumeDetailQueryResponseModel) o;
    return Objects.equals(this.consumeInfo, alipayCommerceEcConsumeDetailQueryResponseModel.consumeInfo) &&
        Objects.equals(this.relatedOrderInfo, alipayCommerceEcConsumeDetailQueryResponseModel.relatedOrderInfo) &&
        Objects.equals(this.relatedRefundList, alipayCommerceEcConsumeDetailQueryResponseModel.relatedRefundList) &&
        Objects.equals(this.relatedVoucherList, alipayCommerceEcConsumeDetailQueryResponseModel.relatedVoucherList)&&
        Objects.equals(this.additionalProperties, alipayCommerceEcConsumeDetailQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumeInfo, relatedOrderInfo, relatedRefundList, relatedVoucherList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcConsumeDetailQueryResponseModel {\n");
    sb.append("    consumeInfo: ").append(toIndentedString(consumeInfo)).append("\n");
    sb.append("    relatedOrderInfo: ").append(toIndentedString(relatedOrderInfo)).append("\n");
    sb.append("    relatedRefundList: ").append(toIndentedString(relatedRefundList)).append("\n");
    sb.append("    relatedVoucherList: ").append(toIndentedString(relatedVoucherList)).append("\n");
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
    openapiFields.add("consume_info");
    openapiFields.add("related_order_info");
    openapiFields.add("related_refund_list");
    openapiFields.add("related_voucher_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcConsumeDetailQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcConsumeDetailQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcConsumeDetailQueryResponseModel is not found in the empty JSON string", AlipayCommerceEcConsumeDetailQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `consume_info`
      if (jsonObj.getAsJsonObject("consume_info") != null) {
        EcConsumeInfo.validateJsonObject(jsonObj.getAsJsonObject("consume_info"));
      }
      // validate the optional field `related_order_info`
      if (jsonObj.getAsJsonObject("related_order_info") != null) {
        EcOrderInfo.validateJsonObject(jsonObj.getAsJsonObject("related_order_info"));
      }
      JsonArray jsonArrayrelatedRefundList = jsonObj.getAsJsonArray("related_refund_list");
      if (jsonArrayrelatedRefundList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("related_refund_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `related_refund_list` to be an array in the JSON string but got `%s`", jsonObj.get("related_refund_list").toString()));
        }

        // validate the optional field `related_refund_list` (array)
        for (int i = 0; i < jsonArrayrelatedRefundList.size(); i++) {
          EcConsumeInfo.validateJsonObject(jsonArrayrelatedRefundList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayrelatedVoucherList = jsonObj.getAsJsonArray("related_voucher_list");
      if (jsonArrayrelatedVoucherList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("related_voucher_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `related_voucher_list` to be an array in the JSON string but got `%s`", jsonObj.get("related_voucher_list").toString()));
        }

        // validate the optional field `related_voucher_list` (array)
        for (int i = 0; i < jsonArrayrelatedVoucherList.size(); i++) {
          EcVoucherInfo.validateJsonObject(jsonArrayrelatedVoucherList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcConsumeDetailQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcConsumeDetailQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcConsumeDetailQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcConsumeDetailQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcConsumeDetailQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcConsumeDetailQueryResponseModel value) throws IOException {
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
           public AlipayCommerceEcConsumeDetailQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceEcConsumeDetailQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceEcConsumeDetailQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcConsumeDetailQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcConsumeDetailQueryResponseModel
  */
  public static AlipayCommerceEcConsumeDetailQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcConsumeDetailQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcConsumeDetailQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

