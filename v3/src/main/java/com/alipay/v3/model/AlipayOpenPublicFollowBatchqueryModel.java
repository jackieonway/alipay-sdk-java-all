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
 * AlipayOpenPublicFollowBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicFollowBatchqueryModel {
  public static final String SERIALIZED_NAME_NEXT_USER_ID = "next_user_id";
  @SerializedName(SERIALIZED_NAME_NEXT_USER_ID)
  private String nextUserId;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public AlipayOpenPublicFollowBatchqueryModel() { 
  }

  public AlipayOpenPublicFollowBatchqueryModel nextUserId(String nextUserId) {
    
    this.nextUserId = nextUserId;
    return this;
  }

   /**
   * 当关注者数量超过10000时使用，本次拉取数据中第一个用户的userId，从上次接口调用返回值中获取。第一次调用置空
   * @return nextUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102146158132", value = "当关注者数量超过10000时使用，本次拉取数据中第一个用户的userId，从上次接口调用返回值中获取。第一次调用置空")

  public String getNextUserId() {
    return nextUserId;
  }


  public void setNextUserId(String nextUserId) {
    this.nextUserId = nextUserId;
  }


  public AlipayOpenPublicFollowBatchqueryModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户的唯一标识
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户的唯一标识")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicFollowBatchqueryModel alipayOpenPublicFollowBatchqueryModel = (AlipayOpenPublicFollowBatchqueryModel) o;
    return Objects.equals(this.nextUserId, alipayOpenPublicFollowBatchqueryModel.nextUserId) &&
        Objects.equals(this.openId, alipayOpenPublicFollowBatchqueryModel.openId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextUserId, openId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicFollowBatchqueryModel {\n");
    sb.append("    nextUserId: ").append(toIndentedString(nextUserId)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
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
    openapiFields.add("next_user_id");
    openapiFields.add("open_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicFollowBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicFollowBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicFollowBatchqueryModel is not found in the empty JSON string", AlipayOpenPublicFollowBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicFollowBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicFollowBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("next_user_id") != null && !jsonObj.get("next_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_user_id").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicFollowBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicFollowBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicFollowBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicFollowBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicFollowBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicFollowBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicFollowBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicFollowBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicFollowBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicFollowBatchqueryModel
  */
  public static AlipayOpenPublicFollowBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicFollowBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicFollowBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

