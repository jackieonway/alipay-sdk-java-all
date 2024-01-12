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
import com.alipay.v3.model.LogisticsCompanyResult;
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
 * AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel {
  public static final String SERIALIZED_NAME_LOGISTICS_COMPANIES = "logistics_companies";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_COMPANIES)
  private List<LogisticsCompanyResult> logisticsCompanies = null;

  public AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel() { 
  }

  public AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel logisticsCompanies(List<LogisticsCompanyResult> logisticsCompanies) {
    
    this.logisticsCompanies = logisticsCompanies;
    return this;
  }

  public AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel addLogisticsCompaniesItem(LogisticsCompanyResult logisticsCompaniesItem) {
    if (this.logisticsCompanies == null) {
      this.logisticsCompanies = new ArrayList<>();
    }
    this.logisticsCompanies.add(logisticsCompaniesItem);
    return this;
  }

   /**
   * 即时配送公司列表
   * @return logisticsCompanies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "即时配送公司列表")

  public List<LogisticsCompanyResult> getLogisticsCompanies() {
    return logisticsCompanies;
  }


  public void setLogisticsCompanies(List<LogisticsCompanyResult> logisticsCompanies) {
    this.logisticsCompanies = logisticsCompanies;
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
   * @return the AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel instance itself
   */
  public AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel alipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel = (AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel) o;
    return Objects.equals(this.logisticsCompanies, alipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel.logisticsCompanies)&&
        Objects.equals(this.additionalProperties, alipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logisticsCompanies, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel {\n");
    sb.append("    logisticsCompanies: ").append(toIndentedString(logisticsCompanies)).append("\n");
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
    openapiFields.add("logistics_companies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel is not found in the empty JSON string", AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArraylogisticsCompanies = jsonObj.getAsJsonArray("logistics_companies");
      if (jsonArraylogisticsCompanies != null) {
        // ensure the json data is an array
        if (!jsonObj.get("logistics_companies").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `logistics_companies` to be an array in the JSON string but got `%s`", jsonObj.get("logistics_companies").toString()));
        }

        // validate the optional field `logistics_companies` (array)
        for (int i = 0; i < jsonArraylogisticsCompanies.size(); i++) {
          LogisticsCompanyResult.validateJsonObject(jsonArraylogisticsCompanies.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel value) throws IOException {
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
           public AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel
  */
  public static AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

