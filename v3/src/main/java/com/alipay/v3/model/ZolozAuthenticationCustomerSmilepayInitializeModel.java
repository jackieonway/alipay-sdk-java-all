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
 * ZolozAuthenticationCustomerSmilepayInitializeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZolozAuthenticationCustomerSmilepayInitializeModel {
  public static final String SERIALIZED_NAME_SERVICE_ID = "service_id";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_SERVICE_PARAMS = "service_params";
  @SerializedName(SERIALIZED_NAME_SERVICE_PARAMS)
  private String serviceParams;

  public static final String SERIALIZED_NAME_ZIMMETAINFO = "zimmetainfo";
  @SerializedName(SERIALIZED_NAME_ZIMMETAINFO)
  private String zimmetainfo;

  public ZolozAuthenticationCustomerSmilepayInitializeModel() { 
  }

  public ZolozAuthenticationCustomerSmilepayInitializeModel serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * 刷脸服务Id
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pay-刷脸支付 auth-刷脸核身", value = "刷脸服务Id")

  public String getServiceId() {
    return serviceId;
  }


  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public ZolozAuthenticationCustomerSmilepayInitializeModel serviceParams(String serviceParams) {
    
    this.serviceParams = serviceParams;
    return this;
  }

   /**
   * 商户可传入刷脸服务所需的扩展参数，json格式
   * @return serviceParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key1\": \"value1\"}", value = "商户可传入刷脸服务所需的扩展参数，json格式")

  public String getServiceParams() {
    return serviceParams;
  }


  public void setServiceParams(String serviceParams) {
    this.serviceParams = serviceParams;
  }


  public ZolozAuthenticationCustomerSmilepayInitializeModel zimmetainfo(String zimmetainfo) {
    
    this.zimmetainfo = zimmetainfo;
    return this;
  }

   /**
   * { \&quot;apdidToken\&quot;: \&quot;设备指纹\&quot;, \&quot;appName\&quot;: \&quot;应用名称\&quot;, \&quot;appVersion\&quot;: \&quot;应用版本\&quot;, \&quot;bioMetaInfo\&quot;: \&quot;生物信息如2.3.0:3,-4\&quot; }
   * @return zimmetainfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{ \"apdidToken\": \"设备指纹\", \"appName\": \"应用名称\", \"appVersion\": \"应用版本\", \"bioMetaInfo\": \"生物信息如2.3.0:3,-4\" }", value = "{ \"apdidToken\": \"设备指纹\", \"appName\": \"应用名称\", \"appVersion\": \"应用版本\", \"bioMetaInfo\": \"生物信息如2.3.0:3,-4\" }")

  public String getZimmetainfo() {
    return zimmetainfo;
  }


  public void setZimmetainfo(String zimmetainfo) {
    this.zimmetainfo = zimmetainfo;
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
   * @return the ZolozAuthenticationCustomerSmilepayInitializeModel instance itself
   */
  public ZolozAuthenticationCustomerSmilepayInitializeModel putAdditionalProperty(String key, Object value) {
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
    ZolozAuthenticationCustomerSmilepayInitializeModel zolozAuthenticationCustomerSmilepayInitializeModel = (ZolozAuthenticationCustomerSmilepayInitializeModel) o;
    return Objects.equals(this.serviceId, zolozAuthenticationCustomerSmilepayInitializeModel.serviceId) &&
        Objects.equals(this.serviceParams, zolozAuthenticationCustomerSmilepayInitializeModel.serviceParams) &&
        Objects.equals(this.zimmetainfo, zolozAuthenticationCustomerSmilepayInitializeModel.zimmetainfo)&&
        Objects.equals(this.additionalProperties, zolozAuthenticationCustomerSmilepayInitializeModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, serviceParams, zimmetainfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZolozAuthenticationCustomerSmilepayInitializeModel {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceParams: ").append(toIndentedString(serviceParams)).append("\n");
    sb.append("    zimmetainfo: ").append(toIndentedString(zimmetainfo)).append("\n");
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
    openapiFields.add("service_id");
    openapiFields.add("service_params");
    openapiFields.add("zimmetainfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZolozAuthenticationCustomerSmilepayInitializeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZolozAuthenticationCustomerSmilepayInitializeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZolozAuthenticationCustomerSmilepayInitializeModel is not found in the empty JSON string", ZolozAuthenticationCustomerSmilepayInitializeModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("service_id") != null && !jsonObj.get("service_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_id").toString()));
      }
      if (jsonObj.get("service_params") != null && !jsonObj.get("service_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_params").toString()));
      }
      if (jsonObj.get("zimmetainfo") != null && !jsonObj.get("zimmetainfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zimmetainfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zimmetainfo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZolozAuthenticationCustomerSmilepayInitializeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZolozAuthenticationCustomerSmilepayInitializeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZolozAuthenticationCustomerSmilepayInitializeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZolozAuthenticationCustomerSmilepayInitializeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZolozAuthenticationCustomerSmilepayInitializeModel>() {
           @Override
           public void write(JsonWriter out, ZolozAuthenticationCustomerSmilepayInitializeModel value) throws IOException {
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
           public ZolozAuthenticationCustomerSmilepayInitializeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZolozAuthenticationCustomerSmilepayInitializeModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZolozAuthenticationCustomerSmilepayInitializeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZolozAuthenticationCustomerSmilepayInitializeModel
  * @throws IOException if the JSON string is invalid with respect to ZolozAuthenticationCustomerSmilepayInitializeModel
  */
  public static ZolozAuthenticationCustomerSmilepayInitializeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZolozAuthenticationCustomerSmilepayInitializeModel.class);
  }

 /**
  * Convert an instance of ZolozAuthenticationCustomerSmilepayInitializeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

