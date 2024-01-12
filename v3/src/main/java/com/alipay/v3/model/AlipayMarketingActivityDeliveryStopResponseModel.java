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
import com.alipay.v3.model.ErrorDeliveryConfig;
import com.alipay.v3.model.SuccessDeliveryConfig;
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
 * AlipayMarketingActivityDeliveryStopResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityDeliveryStopResponseModel {
  public static final String SERIALIZED_NAME_DELIVERY_ID = "delivery_id";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ID)
  private String deliveryId;

  public static final String SERIALIZED_NAME_ERROR_DELIVERY_CONFIG_LIST = "error_delivery_config_list";
  @SerializedName(SERIALIZED_NAME_ERROR_DELIVERY_CONFIG_LIST)
  private List<ErrorDeliveryConfig> errorDeliveryConfigList = null;

  public static final String SERIALIZED_NAME_SUCCESS_DELIVERY_CONFIG_LIST = "success_delivery_config_list";
  @SerializedName(SERIALIZED_NAME_SUCCESS_DELIVERY_CONFIG_LIST)
  private List<SuccessDeliveryConfig> successDeliveryConfigList = null;

  public AlipayMarketingActivityDeliveryStopResponseModel() { 
  }

  public AlipayMarketingActivityDeliveryStopResponseModel deliveryId(String deliveryId) {
    
    this.deliveryId = deliveryId;
    return this;
  }

   /**
   * 推广计划id。
   * @return deliveryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20121231231242353", value = "推广计划id。")

  public String getDeliveryId() {
    return deliveryId;
  }


  public void setDeliveryId(String deliveryId) {
    this.deliveryId = deliveryId;
  }


  public AlipayMarketingActivityDeliveryStopResponseModel errorDeliveryConfigList(List<ErrorDeliveryConfig> errorDeliveryConfigList) {
    
    this.errorDeliveryConfigList = errorDeliveryConfigList;
    return this;
  }

  public AlipayMarketingActivityDeliveryStopResponseModel addErrorDeliveryConfigListItem(ErrorDeliveryConfig errorDeliveryConfigListItem) {
    if (this.errorDeliveryConfigList == null) {
      this.errorDeliveryConfigList = new ArrayList<>();
    }
    this.errorDeliveryConfigList.add(errorDeliveryConfigListItem);
    return this;
  }

   /**
   * 停止失败的投放配置列表
   * @return errorDeliveryConfigList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "停止失败的投放配置列表")

  public List<ErrorDeliveryConfig> getErrorDeliveryConfigList() {
    return errorDeliveryConfigList;
  }


  public void setErrorDeliveryConfigList(List<ErrorDeliveryConfig> errorDeliveryConfigList) {
    this.errorDeliveryConfigList = errorDeliveryConfigList;
  }


  public AlipayMarketingActivityDeliveryStopResponseModel successDeliveryConfigList(List<SuccessDeliveryConfig> successDeliveryConfigList) {
    
    this.successDeliveryConfigList = successDeliveryConfigList;
    return this;
  }

  public AlipayMarketingActivityDeliveryStopResponseModel addSuccessDeliveryConfigListItem(SuccessDeliveryConfig successDeliveryConfigListItem) {
    if (this.successDeliveryConfigList == null) {
      this.successDeliveryConfigList = new ArrayList<>();
    }
    this.successDeliveryConfigList.add(successDeliveryConfigListItem);
    return this;
  }

   /**
   * 停止成功的投放配置列表
   * @return successDeliveryConfigList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "停止成功的投放配置列表")

  public List<SuccessDeliveryConfig> getSuccessDeliveryConfigList() {
    return successDeliveryConfigList;
  }


  public void setSuccessDeliveryConfigList(List<SuccessDeliveryConfig> successDeliveryConfigList) {
    this.successDeliveryConfigList = successDeliveryConfigList;
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
   * @return the AlipayMarketingActivityDeliveryStopResponseModel instance itself
   */
  public AlipayMarketingActivityDeliveryStopResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingActivityDeliveryStopResponseModel alipayMarketingActivityDeliveryStopResponseModel = (AlipayMarketingActivityDeliveryStopResponseModel) o;
    return Objects.equals(this.deliveryId, alipayMarketingActivityDeliveryStopResponseModel.deliveryId) &&
        Objects.equals(this.errorDeliveryConfigList, alipayMarketingActivityDeliveryStopResponseModel.errorDeliveryConfigList) &&
        Objects.equals(this.successDeliveryConfigList, alipayMarketingActivityDeliveryStopResponseModel.successDeliveryConfigList)&&
        Objects.equals(this.additionalProperties, alipayMarketingActivityDeliveryStopResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryId, errorDeliveryConfigList, successDeliveryConfigList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityDeliveryStopResponseModel {\n");
    sb.append("    deliveryId: ").append(toIndentedString(deliveryId)).append("\n");
    sb.append("    errorDeliveryConfigList: ").append(toIndentedString(errorDeliveryConfigList)).append("\n");
    sb.append("    successDeliveryConfigList: ").append(toIndentedString(successDeliveryConfigList)).append("\n");
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
    openapiFields.add("delivery_id");
    openapiFields.add("error_delivery_config_list");
    openapiFields.add("success_delivery_config_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityDeliveryStopResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityDeliveryStopResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityDeliveryStopResponseModel is not found in the empty JSON string", AlipayMarketingActivityDeliveryStopResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("delivery_id") != null && !jsonObj.get("delivery_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_id").toString()));
      }
      JsonArray jsonArrayerrorDeliveryConfigList = jsonObj.getAsJsonArray("error_delivery_config_list");
      if (jsonArrayerrorDeliveryConfigList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("error_delivery_config_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `error_delivery_config_list` to be an array in the JSON string but got `%s`", jsonObj.get("error_delivery_config_list").toString()));
        }

        // validate the optional field `error_delivery_config_list` (array)
        for (int i = 0; i < jsonArrayerrorDeliveryConfigList.size(); i++) {
          ErrorDeliveryConfig.validateJsonObject(jsonArrayerrorDeliveryConfigList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraysuccessDeliveryConfigList = jsonObj.getAsJsonArray("success_delivery_config_list");
      if (jsonArraysuccessDeliveryConfigList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("success_delivery_config_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `success_delivery_config_list` to be an array in the JSON string but got `%s`", jsonObj.get("success_delivery_config_list").toString()));
        }

        // validate the optional field `success_delivery_config_list` (array)
        for (int i = 0; i < jsonArraysuccessDeliveryConfigList.size(); i++) {
          SuccessDeliveryConfig.validateJsonObject(jsonArraysuccessDeliveryConfigList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityDeliveryStopResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityDeliveryStopResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityDeliveryStopResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityDeliveryStopResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityDeliveryStopResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityDeliveryStopResponseModel value) throws IOException {
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
           public AlipayMarketingActivityDeliveryStopResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingActivityDeliveryStopResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingActivityDeliveryStopResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityDeliveryStopResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityDeliveryStopResponseModel
  */
  public static AlipayMarketingActivityDeliveryStopResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityDeliveryStopResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityDeliveryStopResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

