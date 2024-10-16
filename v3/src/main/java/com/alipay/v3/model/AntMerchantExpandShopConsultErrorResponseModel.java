/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-16
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
 * AntMerchantExpandShopConsultErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandShopConsultErrorResponseModel {
  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    NOT_ALLOWED_SETTLE("NOT_ALLOWED_SETTLE"),
    
    SHOP_CATEGORY_IS_ILLEGAL("SHOP_CATEGORY_IS_ILLEGAL"),
    
    ISV_NOT_EXIST("ISV_NOT_EXIST"),
    
    SHOP_ACCOUNT_NO_IS_ILLEGAL("SHOP_ACCOUNT_NO_IS_ILLEGAL"),
    
    SHOP_SHOPNO_IS_EMPTY("SHOP_SHOPNO_IS_EMPTY"),
    
    INDUSTRY_QUALIFICATION_IS_EMPTY("INDUSTRY_QUALIFICATION_IS_EMPTY"),
    
    SETTLED_OUTDOORIMAGE_EMPTY("SETTLED_OUTDOORIMAGE_EMPTY"),
    
    SHOP_SHOPNAME_IS_EMPTY("SHOP_SHOPNAME_IS_EMPTY"),
    
    SETTLED_BIZ_ADDRESS_ILLEGAL("SETTLED_BIZ_ADDRESS_ILLEGAL"),
    
    SHOP_CATEGORY_IS_EMPTY("SHOP_CATEGORY_IS_EMPTY"),
    
    CONTACT_WAY_VALUE_NULL("CONTACT_WAY_VALUE_NULL"),
    
    ADDRESS_PROVINCE_CODE_ILLEGAL("ADDRESS_PROVINCE_CODE_ILLEGAL"),
    
    ADDRESS_CITY_CODE_ILLEGAL("ADDRESS_CITY_CODE_ILLEGAL"),
    
    ADDRESS_DISTRICT_CODE_ILLEGAL("ADDRESS_DISTRICT_CODE_ILLEGAL"),
    
    SHOP_ALREADY_EXIST("SHOP_ALREADY_EXIST"),
    
    GONGAN_CHECK_FAIL("GONGAN_CHECK_FAIL"),
    
    GONGSHANG_CHECK_FAIL("GONGSHANG_CHECK_FAIL"),
    
    MERCHANT_INPUT_ARGUMENT_ILLEGAL("MERCHANT_INPUT_ARGUMENT_ILLEGAL"),
    
    BRAND_ILLEGAL("BRAND_ILLEGAL"),
    
    CONTACT_PERSON_NAME_NULL("CONTACT_PERSON_NAME_NULL"),
    
    USER_ILLEGAL("USER_ILLEGAL"),
    
    PROFILE_KEY_ILLEGAL("PROFILE_KEY_ILLEGAL"),
    
    SETTLED_BANKCARD_NO_IS_EMPTY("SETTLED_BANKCARD_NO_IS_EMPTY"),
    
    SETTLED_ACCOUNTHOLDERNAME_EMPTY("SETTLED_ACCOUNTHOLDERNAME_EMPTY"),
    
    SETTLED_ACCOUNTBRANCHNAME_EMPTY("SETTLED_ACCOUNTBRANCHNAME_EMPTY"),
    
    SETTLED_ACCOUNTINSTNAME_EMPTY("SETTLED_ACCOUNTINSTNAME_EMPTY"),
    
    SETTLED_USAGETYPE_IS_EMPTY("SETTLED_USAGETYPE_IS_EMPTY"),
    
    BANK_BRANCH_NAME_ILLEGAL("BANK_BRANCH_NAME_ILLEGAL"),
    
    SETTLED_USAGETYPE_ILLEGAL("SETTLED_USAGETYPE_ILLEGAL"),
    
    SETTLED_CARD_ACCOUNTINSTID_EMPTY("SETTLED_CARD_ACCOUNTINSTID_EMPTY"),
    
    SETTLED_CARD_ACCOUNTTYPE_EMPTY("SETTLED_CARD_ACCOUNTTYPE_EMPTY"),
    
    BANK_ACCOUNTINSTID_ILLEGAL("BANK_ACCOUNTINSTID_ILLEGAL"),
    
    SETTLED_CARD_ACCOUNTTYPE_ILLEGAL("SETTLED_CARD_ACCOUNTTYPE_ILLEGAL"),
    
    BANK_ACCOUNTINSTNAME_ILLEGAL("BANK_ACCOUNTINSTNAME_ILLEGAL"),
    
    SHOP_CODE_ALREADY_EXIST("SHOP_CODE_ALREADY_EXIST"),
    
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    SETTLED_ALIPAYACCOUNT_NOT_EXIST("SETTLED_ALIPAYACCOUNT_NOT_EXIST");

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

  public AntMerchantExpandShopConsultErrorResponseModel() { 
  }

  public AntMerchantExpandShopConsultErrorResponseModel code(CodeEnum code) {
    
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


  public AntMerchantExpandShopConsultErrorResponseModel links(String links) {
    
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


  public AntMerchantExpandShopConsultErrorResponseModel message(String message) {
    
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
   * @return the AntMerchantExpandShopConsultErrorResponseModel instance itself
   */
  public AntMerchantExpandShopConsultErrorResponseModel putAdditionalProperty(String key, Object value) {
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
    AntMerchantExpandShopConsultErrorResponseModel antMerchantExpandShopConsultErrorResponseModel = (AntMerchantExpandShopConsultErrorResponseModel) o;
    return Objects.equals(this.code, antMerchantExpandShopConsultErrorResponseModel.code) &&
        Objects.equals(this.links, antMerchantExpandShopConsultErrorResponseModel.links) &&
        Objects.equals(this.message, antMerchantExpandShopConsultErrorResponseModel.message)&&
        Objects.equals(this.additionalProperties, antMerchantExpandShopConsultErrorResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandShopConsultErrorResponseModel {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandShopConsultErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandShopConsultErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandShopConsultErrorResponseModel is not found in the empty JSON string", AntMerchantExpandShopConsultErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AntMerchantExpandShopConsultErrorResponseModel.openapiRequiredFields) {
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
       if (!AntMerchantExpandShopConsultErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandShopConsultErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandShopConsultErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandShopConsultErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandShopConsultErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandShopConsultErrorResponseModel value) throws IOException {
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
           public AntMerchantExpandShopConsultErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AntMerchantExpandShopConsultErrorResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AntMerchantExpandShopConsultErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandShopConsultErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandShopConsultErrorResponseModel
  */
  public static AntMerchantExpandShopConsultErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandShopConsultErrorResponseModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandShopConsultErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

