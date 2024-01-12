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
 * AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel {
  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    INVALID_MINI_APP_NAME_LENGTH("INVALID_MINI_APP_NAME_LENGTH"),
    
    SPECIAL_LICENSE_PICS_ARE_BLANK("SPECIAL_LICENSE_PICS_ARE_BLANK"),
    
    INVALID_MINI_APP_NAME("INVALID_MINI_APP_NAME"),
    
    INVALID_MINI_APP_EN_NAME("INVALID_MINI_APP_EN_NAME"),
    
    INVALID_MINI_APP_EN_NAME_LENGTH("INVALID_MINI_APP_EN_NAME_LENGTH"),
    
    INVALID_MINI_APP_SLOGAN("INVALID_MINI_APP_SLOGAN"),
    
    SERVICE_TEL_AND_MAIL_BOTH_BLANK("SERVICE_TEL_AND_MAIL_BOTH_BLANK"),
    
    INVALID_MINI_APP_SERVICE_TEL("INVALID_MINI_APP_SERVICE_TEL"),
    
    CATEGORY_NUM_IS_INVALID("CATEGORY_NUM_IS_INVALID"),
    
    CATEGORY_IS_BLANK("CATEGORY_IS_BLANK"),
    
    APP_DESC_IS_BLANK("APP_DESC_IS_BLANK"),
    
    INVALID_MINI_APP_DESC_LENGTH("INVALID_MINI_APP_DESC_LENGTH"),
    
    INVALID_MINI_APP_DESC("INVALID_MINI_APP_DESC"),
    
    APP_VERSION_IS_BLANK("APP_VERSION_IS_BLANK"),
    
    VERSION_DESC_IS_BLANK("VERSION_DESC_IS_BLANK"),
    
    INVALID_VERSION_DESC_LENGTH("INVALID_VERSION_DESC_LENGTH"),
    
    INVALID_MINI_APP_VERSION_DESC("INVALID_MINI_APP_VERSION_DESC"),
    
    SCREEN_SHOTS_ARE_BLANK("SCREEN_SHOTS_ARE_BLANK"),
    
    SCREEN_SHOT_NUM_IS_INVALID("SCREEN_SHOT_NUM_IS_INVALID"),
    
    INVALID_MINI_APP_MEMO_LENGTH("INVALID_MINI_APP_MEMO_LENGTH"),
    
    APPLICATION_TYPE_NOT_MINIAPP("APPLICATION_TYPE_NOT_MINIAPP"),
    
    INVALID_MINI_APP_SAFE_DOMAIN("INVALID_MINI_APP_SAFE_DOMAIN"),
    
    CAN_NOT_SUBMIT_WITH_ALI_CLOUD("CAN_NOT_SUBMIT_WITH_ALI_CLOUD"),
    
    MINI_APP_NAME_DUPLICATE("MINI_APP_NAME_DUPLICATE"),
    
    MINI_APP_EN_NAME_DUPLICATE("MINI_APP_EN_NAME_DUPLICATE"),
    
    INVALID_CATEGORY("INVALID_CATEGORY"),
    
    INVALID_REGION("INVALID_REGION"),
    
    MINI_APP_NAME_SENSITIVE("MINI_APP_NAME_SENSITIVE"),
    
    MINI_APP_EN_NAME_SENSITIVE("MINI_APP_EN_NAME_SENSITIVE"),
    
    MINI_APP_SLOGAN_SENSITIVE("MINI_APP_SLOGAN_SENSITIVE"),
    
    MINI_APP_MEMO_SENSITIVE("MINI_APP_MEMO_SENSITIVE"),
    
    MINI_APP_DESC_SENSITIVE("MINI_APP_DESC_SENSITIVE"),
    
    MINI_APP_SERVICE_MAIL_SENSITIVE("MINI_APP_SERVICE_MAIL_SENSITIVE"),
    
    MINI_APP_VERSION_DESC_SENSITIVE("MINI_APP_VERSION_DESC_SENSITIVE"),
    
    MINI_APP_PACKAGE_INFO_NOT_EXIST("MINI_APP_PACKAGE_INFO_NOT_EXIST"),
    
    CAN_NOT_MODIFY_NAME_ONCE_ONLINE("CAN_NOT_MODIFY_NAME_ONCE_ONLINE"),
    
    CAN_NOT_MODIFY_EN_ONCE_ONLINE("CAN_NOT_MODIFY_EN_ONCE_ONLINE"),
    
    MODIFY_SLOGAN_EXCEED_COUNT("MODIFY_SLOGAN_EXCEED_COUNT"),
    
    MODIFY_CATEGORY_ID_EXCEED_COUNT("MODIFY_CATEGORY_ID_EXCEED_COUNT"),
    
    MODIFY_DESC_EXCEED_COUNT("MODIFY_DESC_EXCEED_COUNT"),
    
    CAN_NOT_SUBMIT_WITH_AUDIT("CAN_NOT_SUBMIT_WITH_AUDIT"),
    
    CAN_NOT_SUBMIT_WITHOUT_INIT("CAN_NOT_SUBMIT_WITHOUT_INIT"),
    
    CAN_NOT_SUBMIT_WITHOUT_SCAN_PASS("CAN_NOT_SUBMIT_WITHOUT_SCAN_PASS"),
    
    CAN_NOT_SUBMIT_WITH_AUDIT_GRAY("CAN_NOT_SUBMIT_WITH_AUDIT_GRAY"),
    
    EXIST_LARGER_ONLINED_VERSION("EXIST_LARGER_ONLINED_VERSION"),
    
    LICENSE_NO_IS_BLANK("LICENSE_NO_IS_BLANK"),
    
    LICENSE_VALID_DATE_IS_BLANK("LICENSE_VALID_DATE_IS_BLANK"),
    
    LICENSE_VALID_DATE_IS_INVALID("LICENSE_VALID_DATE_IS_INVALID"),
    
    OUT_DOOR_PIC_IS_BLANK("OUT_DOOR_PIC_IS_BLANK"),
    
    LICENSE_PICS_ARE_BLANK("LICENSE_PICS_ARE_BLANK"),
    
    LICENSE_PIC_NUM_IS_INVALID("LICENSE_PIC_NUM_IS_INVALID"),
    
    LICENSE_CHECK_FAIL("LICENSE_CHECK_FAIL"),
    
    LOGO_HEIGHT_NOT_EQUAL_WIDTH("LOGO_HEIGHT_NOT_EQUAL_WIDTH"),
    
    INVALID_SCREEN_SHOT_EXT("INVALID_SCREEN_SHOT_EXT"),
    
    SCREEN_SHOT_EXCEED_MAX_SIZE("SCREEN_SHOT_EXCEED_MAX_SIZE"),
    
    INVALID_LICENSE_PIC_EXT("INVALID_LICENSE_PIC_EXT"),
    
    LICENSE_PIC_EXCEED_MAX_SIZE("LICENSE_PIC_EXCEED_MAX_SIZE"),
    
    INVALID_OUT_DOOR_PIC_EXT("INVALID_OUT_DOOR_PIC_EXT"),
    
    OUT_DOOR_PIC_EXCEED_MAX_SIZE("OUT_DOOR_PIC_EXCEED_MAX_SIZE"),
    
    LOGO_EXCEED_MAX_SIZE("LOGO_EXCEED_MAX_SIZE"),
    
    INVALID_LOGO_EXT("INVALID_LOGO_EXT"),
    
    INVALID_PARAMS("INVALID_PARAMS"),
    
    INVALID_LOGO("INVALID_LOGO"),
    
    INVALID_IMAGE("INVALID_IMAGE"),
    
    RISK_DECISION_CHECK_FAIL("RISK_DECISION_CHECK_FAIL"),
    
    TINY_APP_AUDIT_NOT_PERMIT("TINY_APP_AUDIT_NOT_PERMIT"),
    
    RISK_DECISION_HIT_BRAND("RISK_DECISION_HIT_BRAND"),
    
    BRAND_TORT_NOT_END("BRAND_TORT_NOT_END"),
    
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    MINI_APP_INFO_AUDIT_CONTAINS("MINI_APP_INFO_AUDIT_CONTAINS"),
    
    DEFAULT_LOGO("DEFAULT_LOGO");

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

  public AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel() { 
  }

  public AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel code(CodeEnum code) {
    
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


  public AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel links(String links) {
    
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


  public AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel message(String message) {
    
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
   * @return the AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel instance itself
   */
  public AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel alipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel = (AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel) o;
    return Objects.equals(this.code, alipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel.code) &&
        Objects.equals(this.links, alipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel.links) &&
        Objects.equals(this.message, alipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel.message)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel {\n");
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
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel is not found in the empty JSON string", AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel.openapiRequiredFields) {
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
       if (!AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel value) throws IOException {
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
           public AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel
  */
  public static AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionBuildauditSubmitErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

