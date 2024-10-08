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
 * AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel {
  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    INVALID_PARAMETER("INVALID_PARAMETER"),
    
    BIZ_ERROR("BIZ_ERROR"),
    
    MERCHANT_ID_IS_EMPTY("MERCHANT_ID_IS_EMPTY"),
    
    MERCHANT_ID_FORMAT_ERROR("MERCHANT_ID_FORMAT_ERROR"),
    
    PARKING_POI_ID_IS_EMPTY("PARKING_POI_ID_IS_EMPTY"),
    
    PARKING_POI_NOT_FIND("PARKING_POI_NOT_FIND"),
    
    PARKING_POI_TYPE_NOT_MATCH("PARKING_POI_TYPE_NOT_MATCH"),
    
    PARKING_LEADS_HAS_REGISTERED("PARKING_LEADS_HAS_REGISTERED"),
    
    PARKING_POI_HAS_REGISTERED("PARKING_POI_HAS_REGISTERED"),
    
    PARKING_ID_FORMAT_ERROR("PARKING_ID_FORMAT_ERROR"),
    
    PARKING_MOBILE_IS_EMPTY("PARKING_MOBILE_IS_EMPTY"),
    
    PARKING_IS_SUPPORT_INVOICE_ILLEGAL("PARKING_IS_SUPPORT_INVOICE_ILLEGAL"),
    
    PARKING_BIZ_TAGS_ILLEGAL("PARKING_BIZ_TAGS_ILLEGAL"),
    
    PARKING_SUM_SPACE_ILLEGAL("PARKING_SUM_SPACE_ILLEGAL"),
    
    PARKING_ISV_MOBILE_FORMAT_ERROR("PARKING_ISV_MOBILE_FORMAT_ERROR"),
    
    PARKING_ORIGINAL_ISV_MOBILE_FORMAT_ERROR("PARKING_ORIGINAL_ISV_MOBILE_FORMAT_ERROR"),
    
    PARKING_FEE_DESC_IMG_ILLEGAL("PARKING_FEE_DESC_IMG_ILLEGAL"),
    
    PARKING_FEE_DESC_IMG_UPLOAD_ERROR("PARKING_FEE_DESC_IMG_UPLOAD_ERROR"),
    
    PARKING_LOT_HAS_REGISTERED("PARKING_LOT_HAS_REGISTERED"),
    
    PARKING_LOT_NOT_EXIST("PARKING_LOT_NOT_EXIST"),
    
    PARKING_ISV_NOT_ALLOWED("PARKING_ISV_NOT_ALLOWED"),
    
    INVALID_UPDATE_IN_BASE_STATUS("INVALID_UPDATE_IN_BASE_STATUS"),
    
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    INVALID_PARAMETER_BUSINESS_ID("INVALID_PARAMETER_BUSINESS_ID"),
    
    INVALID_PARAMETER_BUSINESS_TYPE("INVALID_PARAMETER_BUSINESS_TYPE"),
    
    ONLINET_ACCOUNT_BAD_NOT_APPS("ONLINET_ACCOUNT_BAD_NOT_APPS"),
    
    AGREEMENT_ACCOUNT_BAD_NOT_APPS("AGREEMENT_ACCOUNT_BAD_NOT_APPS"),
    
    AGREEMENT_ACCOUNT_BAD_NOT_SIGN("AGREEMENT_ACCOUNT_BAD_NOT_SIGN"),
    
    AGREEMENT_ACCOUNT_BAD_INVALID_PAYEE_ID("AGREEMENT_ACCOUNT_BAD_INVALID_PAYEE_ID"),
    
    PARKINGLOT_TYPE_ERROR("PARKINGLOT_TYPE_ERROR"),
    
    PARKINGLOT_BIZ_TYPE_ERROR("PARKINGLOT_BIZ_TYPE_ERROR"),
    
    PARKINGLOT_ONLINET_ACCOUNT_NOT_APPS("PARKINGLOT_ONLINET_ACCOUNT_NOT_APPS"),
    
    PARKINGLOT_AGREEMENT_ACCOUNT_NOT_APPS("PARKINGLOT_AGREEMENT_ACCOUNT_NOT_APPS"),
    
    PARKINGLOT_AGREEMENT_ACCOUNT_BAD_SIGN("PARKINGLOT_AGREEMENT_ACCOUNT_BAD_SIGN"),
    
    PARKINGLOT_POI_TYPE_NOT_MATCH("PARKINGLOT_POI_TYPE_NOT_MATCH"),
    
    PARKINGLOT_ISV_APP_ID_ILLEGAL("PARKINGLOT_ISV_APP_ID_ILLEGAL"),
    
    PARKINGLOT_POI_NOT_FIND("PARKINGLOT_POI_NOT_FIND"),
    
    PARKINGLOT_POI_PARSE_ERROR("PARKINGLOT_POI_PARSE_ERROR"),
    
    PARKINGLOT_ISV_NOT_MATCH("PARKINGLOT_ISV_NOT_MATCH"),
    
    PARKINGLOT_INVALID_UPDATE_IN_BASE_STATUS("PARKINGLOT_INVALID_UPDATE_IN_BASE_STATUS"),
    
    PARKINGLOT_MODIFY_ERROR("PARKINGLOT_MODIFY_ERROR"),
    
    PARKINGLOT_SEND_UPDATE_EVENT_FAIL("PARKINGLOT_SEND_UPDATE_EVENT_FAIL"),
    
    PARKINGLOT_NOT_FIND("PARKINGLOT_NOT_FIND"),
    
    NO_PERMISSION_ERROR("NO_PERMISSION_ERROR");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private String links;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel() { 
  }

  public AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * 错误码
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "错误码")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel links(String links) {
    
    this.links = links;
    return this;
  }

   /**
   * 解决方案链接
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "解决方案链接")

  public String getLinks() {
    return links;
  }


  public void setLinks(String links) {
    this.links = links;
  }


  public AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 错误描述
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "错误描述")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
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
   * @return the AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel instance itself
   */
  public AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel alipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel = (AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel) o;
    return Objects.equals(this.code, alipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel.code) &&
        Objects.equals(this.links, alipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel.links) &&
        Objects.equals(this.message, alipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel.message)&&
        Objects.equals(this.additionalProperties, alipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("links");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    // openapiRequiredFields.add("code");
    // openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel is not found in the empty JSON string", AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be a primitive type in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel value) throws IOException {
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
           public AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel
  */
  public static AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingParkinglotinfoUpdateErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

