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
 * AntMerchantExpandShopReceiptaccountSaveModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandShopReceiptaccountSaveModel {
  public static final String SERIALIZED_NAME_PROMISE = "promise";
  @SerializedName(SERIALIZED_NAME_PROMISE)
  private String promise;

  public static final String SERIALIZED_NAME_RECEIPT_ACCOUNT_ID = "receipt_account_id";
  @SerializedName(SERIALIZED_NAME_RECEIPT_ACCOUNT_ID)
  private String receiptAccountId;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public AntMerchantExpandShopReceiptaccountSaveModel() { 
  }

  public AntMerchantExpandShopReceiptaccountSaveModel promise(String promise) {
    
    this.promise = promise;
    return this;
  }

   /**
   * 是否承诺收单账号信息准确。具体承诺信息可查看 &lt;a href&#x3D;\&quot;https://gw.alipayobjects.com/os/bmw-prod/922bafa8-a712-4f79-aa32-6f08d7359a5c.docx\&quot;&gt;门店信息承诺函&lt;/a&gt;。 Y 是 N 否
   * @return promise
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "是否承诺收单账号信息准确。具体承诺信息可查看 <a href=\"https://gw.alipayobjects.com/os/bmw-prod/922bafa8-a712-4f79-aa32-6f08d7359a5c.docx\">门店信息承诺函</a>。 Y 是 N 否")

  public String getPromise() {
    return promise;
  }


  public void setPromise(String promise) {
    this.promise = promise;
  }


  public AntMerchantExpandShopReceiptaccountSaveModel receiptAccountId(String receiptAccountId) {
    
    this.receiptAccountId = receiptAccountId;
    return this;
  }

   /**
   * 收单账号
   * @return receiptAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088502344354813", value = "收单账号")

  public String getReceiptAccountId() {
    return receiptAccountId;
  }


  public void setReceiptAccountId(String receiptAccountId) {
    this.receiptAccountId = receiptAccountId;
  }


  public AntMerchantExpandShopReceiptaccountSaveModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 店铺ID
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022062300502007000073505619", value = "店铺ID")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
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
   * @return the AntMerchantExpandShopReceiptaccountSaveModel instance itself
   */
  public AntMerchantExpandShopReceiptaccountSaveModel putAdditionalProperty(String key, Object value) {
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
    AntMerchantExpandShopReceiptaccountSaveModel antMerchantExpandShopReceiptaccountSaveModel = (AntMerchantExpandShopReceiptaccountSaveModel) o;
    return Objects.equals(this.promise, antMerchantExpandShopReceiptaccountSaveModel.promise) &&
        Objects.equals(this.receiptAccountId, antMerchantExpandShopReceiptaccountSaveModel.receiptAccountId) &&
        Objects.equals(this.shopId, antMerchantExpandShopReceiptaccountSaveModel.shopId)&&
        Objects.equals(this.additionalProperties, antMerchantExpandShopReceiptaccountSaveModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promise, receiptAccountId, shopId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandShopReceiptaccountSaveModel {\n");
    sb.append("    promise: ").append(toIndentedString(promise)).append("\n");
    sb.append("    receiptAccountId: ").append(toIndentedString(receiptAccountId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
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
    openapiFields.add("promise");
    openapiFields.add("receipt_account_id");
    openapiFields.add("shop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandShopReceiptaccountSaveModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandShopReceiptaccountSaveModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandShopReceiptaccountSaveModel is not found in the empty JSON string", AntMerchantExpandShopReceiptaccountSaveModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("promise") != null && !jsonObj.get("promise").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promise` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promise").toString()));
      }
      if (jsonObj.get("receipt_account_id") != null && !jsonObj.get("receipt_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receipt_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receipt_account_id").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandShopReceiptaccountSaveModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandShopReceiptaccountSaveModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandShopReceiptaccountSaveModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandShopReceiptaccountSaveModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandShopReceiptaccountSaveModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandShopReceiptaccountSaveModel value) throws IOException {
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
           public AntMerchantExpandShopReceiptaccountSaveModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AntMerchantExpandShopReceiptaccountSaveModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AntMerchantExpandShopReceiptaccountSaveModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandShopReceiptaccountSaveModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandShopReceiptaccountSaveModel
  */
  public static AntMerchantExpandShopReceiptaccountSaveModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandShopReceiptaccountSaveModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandShopReceiptaccountSaveModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

