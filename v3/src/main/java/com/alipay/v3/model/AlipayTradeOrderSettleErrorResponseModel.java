/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-09-06
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
 * AlipayTradeOrderSettleErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeOrderSettleErrorResponseModel {
  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    SYSTEM_ERROR("ACQ.SYSTEM_ERROR"),
    
    INVALID_PARAMETER("ACQ.INVALID_PARAMETER"),
    
    TRADE_NOT_EXIST("ACQ.TRADE_NOT_EXIST"),
    
    TRADE_STATUS_ERROR("ACQ.TRADE_STATUS_ERROR"),
    
    PARTNER_ERROR("ACQ.PARTNER_ERROR"),
    
    DISCORDANT_REPEAT_REQUEST("ACQ.DISCORDANT_REPEAT_REQUEST"),
    
    TRADE_SETTLE_ERROR("ACQ.TRADE_SETTLE_ERROR"),
    
    USER_LOGONID_DUP("ACQ.USER_LOGONID_DUP"),
    
    ROYALTY_RECEIVER_INVALID("ACQ.ROYALTY_RECEIVER_INVALID"),
    
    ALLOC_AMOUNT_VALIDATE_ERROR("ACQ.ALLOC_AMOUNT_VALIDATE_ERROR"),
    
    FREQUENCY_LIMITED("ACQ.FREQUENCY_LIMITED"),
    
    CUSTOMER_VALIDATE_ERROR("ACQ.CUSTOMER_VALIDATE_ERROR"),
    
    USER_ACCOUNT_HAD_FREEZEN("ACQ.USER_ACCOUNT_HAD_FREEZEN"),
    
    ILLEGAL_SETTLE_STATE("ACQ.ILLEGAL_SETTLE_STATE"),
    
    TXN_RESULT_ACCOUNT_BALANCE_NOT_ENOUGH("ACQ.TXN_RESULT_ACCOUNT_BALANCE_NOT_ENOUGH"),
    
    REASON_TRADE_STATUS_INVALID("ACQ.REASON_TRADE_STATUS_INVALID"),
    
    NOT_SUPPORT_ROYALTY("ACQ.NOT_SUPPORT_ROYALTY"),
    
    ROYALTY_ACCOUNT_NOT_EXIST("ACQ.ROYALTY_ACCOUNT_NOT_EXIST"),
    
    ROYALTY_ACCOUNT_INVALID("ACQ.ROYALTY_ACCOUNT_INVALID"),
    
    SETTLE_ENTITY_ID_INVALID("ACQ.SETTLE_ENTITY_ID_INVALID"),
    
    ROYALTY_ACCOUNTS_EQUAL("ACQ.ROYALTY_ACCOUNTS_EQUAL"),
    
    DUP_OUT_REQUEST_NO("ACQ.DUP_OUT_REQUEST_NO"),
    
    MERCHANT_RISK_LIMIT("ACQ.MERCHANT_RISK_LIMIT"),
    
    ROYALTY_PAYER_ACCOUNT_NOT_EXIST("ACQ.ROYALTY_PAYER_ACCOUNT_NOT_EXIST"),
    
    ROYALTY_RECEIVER_ACCOUNT_NOT_EXIST("ACQ.ROYALTY_RECEIVER_ACCOUNT_NOT_EXIST"),
    
    ROYALTY_PAYER_ACCOUNT_NOT_CERTIFY("ACQ.ROYALTY_PAYER_ACCOUNT_NOT_CERTIFY"),
    
    ROYALTY_RECEIVER_ACCOUNT_NOT_CERTIFY("ACQ.ROYALTY_RECEIVER_ACCOUNT_NOT_CERTIFY"),
    
    ROYALTY_PAYER_ACCOUNT_NO_BALANCE("ACQ.ROYALTY_PAYER_ACCOUNT_NO_BALANCE"),
    
    ROYALTY_RECEIVER_ACCOUNT_NO_BALANCE("ACQ.ROYALTY_RECEIVER_ACCOUNT_NO_BALANCE"),
    
    ROYALTY_ACCOUNT_NAME_NOT_MATCH("ACQ.ROYALTY_ACCOUNT_NAME_NOT_MATCH"),
    
    SETTLE_TO_CARD_NOT_SUPPORT("ACQ.SETTLE_TO_CARD_NOT_SUPPORT"),
    
    REPLENISH_ACCOUNT_INVALID("ACQ.REPLENISH_ACCOUNT_INVALID"),
    
    INVALID_REPLENISH_AMOUNT("ACQ.INVALID_REPLENISH_AMOUNT"),
    
    ASYNC_ALLOC_NOT_SUPPORT_IN_PERIOD("ACQ.ASYNC_ALLOC_NOT_SUPPORT_IN_PERIOD"),
    
    SECONDARY_MERCHANT_ID_INVALID("ACQ.SECONDARY_MERCHANT_ID_INVALID"),
    
    MUST_ALLOC_FROM_ROOT_ACCOUNT("ACQ.MUST_ALLOC_FROM_ROOT_ACCOUNT"),
    
    UN_SUPPORT_BIZ_TYPE("ACQ.UN_SUPPORT_BIZ_TYPE"),
    
    ACCESS_FORBIDDEN("ACQ.ACCESS_FORBIDDEN"),
    
    ILLEGAL_REQUEST("ACQ.ILLEGAL_REQUEST"),
    
    SETTLE_SCENE_NOT_SUPPORT("ACQ.SETTLE_SCENE_NOT_SUPPORT"),
    
    ALLOC_REFUSE_BEFORE_SETTLE("ACQ.ALLOC_REFUSE_BEFORE_SETTLE"),
    
    ALLOC_REFUSE_AFTER_REFUND("ACQ.ALLOC_REFUSE_AFTER_REFUND");

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

  public AlipayTradeOrderSettleErrorResponseModel() { 
  }

  public AlipayTradeOrderSettleErrorResponseModel code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * 错误码
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误码")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public AlipayTradeOrderSettleErrorResponseModel links(String links) {
    
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


  public AlipayTradeOrderSettleErrorResponseModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 错误描述
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误描述")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeOrderSettleErrorResponseModel alipayTradeOrderSettleErrorResponseModel = (AlipayTradeOrderSettleErrorResponseModel) o;
    return Objects.equals(this.code, alipayTradeOrderSettleErrorResponseModel.code) &&
        Objects.equals(this.links, alipayTradeOrderSettleErrorResponseModel.links) &&
        Objects.equals(this.message, alipayTradeOrderSettleErrorResponseModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeOrderSettleErrorResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeOrderSettleErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeOrderSettleErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeOrderSettleErrorResponseModel is not found in the empty JSON string", AlipayTradeOrderSettleErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeOrderSettleErrorResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeOrderSettleErrorResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayTradeOrderSettleErrorResponseModel.openapiRequiredFields) {
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
       if (!AlipayTradeOrderSettleErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeOrderSettleErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeOrderSettleErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeOrderSettleErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeOrderSettleErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeOrderSettleErrorResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeOrderSettleErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeOrderSettleErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeOrderSettleErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeOrderSettleErrorResponseModel
  */
  public static AlipayTradeOrderSettleErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeOrderSettleErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeOrderSettleErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

