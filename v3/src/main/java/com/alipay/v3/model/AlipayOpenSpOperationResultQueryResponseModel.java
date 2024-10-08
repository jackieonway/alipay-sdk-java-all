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
 * AlipayOpenSpOperationResultQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpOperationResultQueryResponseModel {
  public static final String SERIALIZED_NAME_BIND_USER_ID = "bind_user_id";
  @SerializedName(SERIALIZED_NAME_BIND_USER_ID)
  private String bindUserId;

  public static final String SERIALIZED_NAME_HANDLE_STATUS = "handle_status";
  @SerializedName(SERIALIZED_NAME_HANDLE_STATUS)
  private String handleStatus;

  public static final String SERIALIZED_NAME_MERCHANT_NO = "merchant_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NO)
  private String merchantNo;

  public AlipayOpenSpOperationResultQueryResponseModel() { 
  }

  public AlipayOpenSpOperationResultQueryResponseModel bindUserId(String bindUserId) {
    
    this.bindUserId = bindUserId;
    return this;
  }

   /**
   * 商户支付宝pid。仅间连场景，且存在绑定关系时返回值。
   * @return bindUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088XXXX", value = "商户支付宝pid。仅间连场景，且存在绑定关系时返回值。")

  public String getBindUserId() {
    return bindUserId;
  }


  public void setBindUserId(String bindUserId) {
    this.bindUserId = bindUserId;
  }


  public AlipayOpenSpOperationResultQueryResponseModel handleStatus(String handleStatus) {
    
    this.handleStatus = handleStatus;
    return this;
  }

   /**
   * 代运营操作结果。 SUCCESS：代表成功。 PROCESS：待商家确认中。 NO_PERMISSION：表示当前商家支付宝账号无权限操作。需要提醒商家切换成发起授权时指定的支付宝账号。 NONE：表示不存在代运营绑定或授权关系。 NONE_ACCOUNT：间连商家推荐支付宝账号列表为空。
   * @return handleStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "代运营操作结果。 SUCCESS：代表成功。 PROCESS：待商家确认中。 NO_PERMISSION：表示当前商家支付宝账号无权限操作。需要提醒商家切换成发起授权时指定的支付宝账号。 NONE：表示不存在代运营绑定或授权关系。 NONE_ACCOUNT：间连商家推荐支付宝账号列表为空。")

  public String getHandleStatus() {
    return handleStatus;
  }


  public void setHandleStatus(String handleStatus) {
    this.handleStatus = handleStatus;
  }


  public AlipayOpenSpOperationResultQueryResponseModel merchantNo(String merchantNo) {
    
    this.merchantNo = merchantNo;
    return this;
  }

   /**
   * 支付宝商户号。间连场景为商户smid，直连场景为商户支付宝pid
   * @return merchantNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088XXX", value = "支付宝商户号。间连场景为商户smid，直连场景为商户支付宝pid")

  public String getMerchantNo() {
    return merchantNo;
  }


  public void setMerchantNo(String merchantNo) {
    this.merchantNo = merchantNo;
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
   * @return the AlipayOpenSpOperationResultQueryResponseModel instance itself
   */
  public AlipayOpenSpOperationResultQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenSpOperationResultQueryResponseModel alipayOpenSpOperationResultQueryResponseModel = (AlipayOpenSpOperationResultQueryResponseModel) o;
    return Objects.equals(this.bindUserId, alipayOpenSpOperationResultQueryResponseModel.bindUserId) &&
        Objects.equals(this.handleStatus, alipayOpenSpOperationResultQueryResponseModel.handleStatus) &&
        Objects.equals(this.merchantNo, alipayOpenSpOperationResultQueryResponseModel.merchantNo)&&
        Objects.equals(this.additionalProperties, alipayOpenSpOperationResultQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindUserId, handleStatus, merchantNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpOperationResultQueryResponseModel {\n");
    sb.append("    bindUserId: ").append(toIndentedString(bindUserId)).append("\n");
    sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
    sb.append("    merchantNo: ").append(toIndentedString(merchantNo)).append("\n");
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
    openapiFields.add("bind_user_id");
    openapiFields.add("handle_status");
    openapiFields.add("merchant_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpOperationResultQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpOperationResultQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpOperationResultQueryResponseModel is not found in the empty JSON string", AlipayOpenSpOperationResultQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("bind_user_id") != null && !jsonObj.get("bind_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind_user_id").toString()));
      }
      if (jsonObj.get("handle_status") != null && !jsonObj.get("handle_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handle_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handle_status").toString()));
      }
      if (jsonObj.get("merchant_no") != null && !jsonObj.get("merchant_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpOperationResultQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpOperationResultQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpOperationResultQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpOperationResultQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpOperationResultQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpOperationResultQueryResponseModel value) throws IOException {
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
           public AlipayOpenSpOperationResultQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenSpOperationResultQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenSpOperationResultQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpOperationResultQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpOperationResultQueryResponseModel
  */
  public static AlipayOpenSpOperationResultQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpOperationResultQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpOperationResultQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

