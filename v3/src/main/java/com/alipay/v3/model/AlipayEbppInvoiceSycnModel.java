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
import com.alipay.v3.model.InvoiceModelContent;
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
 * AlipayEbppInvoiceSycnModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceSycnModel {
  public static final String SERIALIZED_NAME_INVOICE_INFO = "invoice_info";
  @SerializedName(SERIALIZED_NAME_INVOICE_INFO)
  private List<InvoiceModelContent> invoiceInfo = null;

  public static final String SERIALIZED_NAME_M_SHORT_NAME = "m_short_name";
  @SerializedName(SERIALIZED_NAME_M_SHORT_NAME)
  private String mShortName;

  public static final String SERIALIZED_NAME_SUB_M_SHORT_NAME = "sub_m_short_name";
  @SerializedName(SERIALIZED_NAME_SUB_M_SHORT_NAME)
  private String subMShortName;

  public AlipayEbppInvoiceSycnModel() { 
  }

  public AlipayEbppInvoiceSycnModel invoiceInfo(List<InvoiceModelContent> invoiceInfo) {
    
    this.invoiceInfo = invoiceInfo;
    return this;
  }

  public AlipayEbppInvoiceSycnModel addInvoiceInfoItem(InvoiceModelContent invoiceInfoItem) {
    if (this.invoiceInfo == null) {
      this.invoiceInfo = new ArrayList<>();
    }
    this.invoiceInfo.add(invoiceInfoItem);
    return this;
  }

   /**
   * 同步发票信息模型
   * @return invoiceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "同步发票信息模型")

  public List<InvoiceModelContent> getInvoiceInfo() {
    return invoiceInfo;
  }


  public void setInvoiceInfo(List<InvoiceModelContent> invoiceInfo) {
    this.invoiceInfo = invoiceInfo;
  }


  public AlipayEbppInvoiceSycnModel mShortName(String mShortName) {
    
    this.mShortName = mShortName;
    return this;
  }

   /**
   * 商户的品牌名称简称,该字段需要接入前向发票管家申请，  m_short_name+sub_m_short_name具有唯一约束  如：肯德基：KFC
   * @return mShortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KFC", value = "商户的品牌名称简称,该字段需要接入前向发票管家申请，  m_short_name+sub_m_short_name具有唯一约束  如：肯德基：KFC")

  public String getmShortName() {
    return mShortName;
  }


  public void setmShortName(String mShortName) {
    this.mShortName = mShortName;
  }


  public AlipayEbppInvoiceSycnModel subMShortName(String subMShortName) {
    
    this.subMShortName = subMShortName;
    return this;
  }

   /**
   * 支付宝为商户分配的商户门店简称，该字段需要接入前在发票管家申请  如：肯德基-杭州西湖区文一西路店：KFC-HZ-XH001
   * @return subMShortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KFC_HZ_XH001", value = "支付宝为商户分配的商户门店简称，该字段需要接入前在发票管家申请  如：肯德基-杭州西湖区文一西路店：KFC-HZ-XH001")

  public String getSubMShortName() {
    return subMShortName;
  }


  public void setSubMShortName(String subMShortName) {
    this.subMShortName = subMShortName;
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
   * @return the AlipayEbppInvoiceSycnModel instance itself
   */
  public AlipayEbppInvoiceSycnModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceSycnModel alipayEbppInvoiceSycnModel = (AlipayEbppInvoiceSycnModel) o;
    return Objects.equals(this.invoiceInfo, alipayEbppInvoiceSycnModel.invoiceInfo) &&
        Objects.equals(this.mShortName, alipayEbppInvoiceSycnModel.mShortName) &&
        Objects.equals(this.subMShortName, alipayEbppInvoiceSycnModel.subMShortName)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceSycnModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceInfo, mShortName, subMShortName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceSycnModel {\n");
    sb.append("    invoiceInfo: ").append(toIndentedString(invoiceInfo)).append("\n");
    sb.append("    mShortName: ").append(toIndentedString(mShortName)).append("\n");
    sb.append("    subMShortName: ").append(toIndentedString(subMShortName)).append("\n");
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
    openapiFields.add("invoice_info");
    openapiFields.add("m_short_name");
    openapiFields.add("sub_m_short_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceSycnModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceSycnModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceSycnModel is not found in the empty JSON string", AlipayEbppInvoiceSycnModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayinvoiceInfo = jsonObj.getAsJsonArray("invoice_info");
      if (jsonArrayinvoiceInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("invoice_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `invoice_info` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_info").toString()));
        }

        // validate the optional field `invoice_info` (array)
        for (int i = 0; i < jsonArrayinvoiceInfo.size(); i++) {
          InvoiceModelContent.validateJsonObject(jsonArrayinvoiceInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("m_short_name") != null && !jsonObj.get("m_short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_short_name").toString()));
      }
      if (jsonObj.get("sub_m_short_name") != null && !jsonObj.get("sub_m_short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_m_short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_m_short_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceSycnModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceSycnModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceSycnModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceSycnModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceSycnModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceSycnModel value) throws IOException {
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
           public AlipayEbppInvoiceSycnModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceSycnModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceSycnModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceSycnModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceSycnModel
  */
  public static AlipayEbppInvoiceSycnModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceSycnModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceSycnModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

