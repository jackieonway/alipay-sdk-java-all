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
 * AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel {
  public static final String SERIALIZED_NAME_ISSUE_BATCH_ID = "issue_batch_id";
  @SerializedName(SERIALIZED_NAME_ISSUE_BATCH_ID)
  private String issueBatchId;

  public static final String SERIALIZED_NAME_QUOTA_ID = "quota_id";
  @SerializedName(SERIALIZED_NAME_QUOTA_ID)
  private String quotaId;

  public AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel() { 
  }

  public AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel issueBatchId(String issueBatchId) {
    
    this.issueBatchId = issueBatchId;
    return this;
  }

   /**
   * 发放批次id
   * @return issueBatchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023030600152622370000007434", value = "发放批次id")

  public String getIssueBatchId() {
    return issueBatchId;
  }


  public void setIssueBatchId(String issueBatchId) {
    this.issueBatchId = issueBatchId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel quotaId(String quotaId) {
    
    this.quotaId = quotaId;
    return this;
  }

   /**
   * 创建的额度ID
   * @return quotaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023030600152622370000007434", value = "创建的额度ID")

  public String getQuotaId() {
    return quotaId;
  }


  public void setQuotaId(String quotaId) {
    this.quotaId = quotaId;
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
   * @return the AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel instance itself
   */
  public AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel alipayEbppInvoiceExpensecontrolQuotaCreateResponseModel = (AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel) o;
    return Objects.equals(this.issueBatchId, alipayEbppInvoiceExpensecontrolQuotaCreateResponseModel.issueBatchId) &&
        Objects.equals(this.quotaId, alipayEbppInvoiceExpensecontrolQuotaCreateResponseModel.quotaId)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceExpensecontrolQuotaCreateResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueBatchId, quotaId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel {\n");
    sb.append("    issueBatchId: ").append(toIndentedString(issueBatchId)).append("\n");
    sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
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
    openapiFields.add("issue_batch_id");
    openapiFields.add("quota_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel is not found in the empty JSON string", AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("issue_batch_id") != null && !jsonObj.get("issue_batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_batch_id").toString()));
      }
      if (jsonObj.get("quota_id") != null && !jsonObj.get("quota_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel value) throws IOException {
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
           public AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel
  */
  public static AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

