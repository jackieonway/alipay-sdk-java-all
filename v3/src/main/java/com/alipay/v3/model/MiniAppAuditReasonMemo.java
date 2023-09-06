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
 * MiniAppAuditReasonMemo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiniAppAuditReasonMemo {
  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_MEMO_IMAGE_LIST = "memo_image_list";
  @SerializedName(SERIALIZED_NAME_MEMO_IMAGE_LIST)
  private List<String> memoImageList = null;

  public MiniAppAuditReasonMemo() { 
  }

  public MiniAppAuditReasonMemo memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 驳回原因
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "驳回原因")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public MiniAppAuditReasonMemo memoImageList(List<String> memoImageList) {
    
    this.memoImageList = memoImageList;
    return this;
  }

  public MiniAppAuditReasonMemo addMemoImageListItem(String memoImageListItem) {
    if (this.memoImageList == null) {
      this.memoImageList = new ArrayList<>();
    }
    this.memoImageList.add(memoImageListItem);
    return this;
  }

   /**
   * 规则图片链接
   * @return memoImageList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "规则图片链接")

  public List<String> getMemoImageList() {
    return memoImageList;
  }


  public void setMemoImageList(List<String> memoImageList) {
    this.memoImageList = memoImageList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiniAppAuditReasonMemo miniAppAuditReasonMemo = (MiniAppAuditReasonMemo) o;
    return Objects.equals(this.memo, miniAppAuditReasonMemo.memo) &&
        Objects.equals(this.memoImageList, miniAppAuditReasonMemo.memoImageList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memo, memoImageList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiniAppAuditReasonMemo {\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    memoImageList: ").append(toIndentedString(memoImageList)).append("\n");
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
    openapiFields.add("memo");
    openapiFields.add("memo_image_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MiniAppAuditReasonMemo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MiniAppAuditReasonMemo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiniAppAuditReasonMemo is not found in the empty JSON string", MiniAppAuditReasonMemo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MiniAppAuditReasonMemo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MiniAppAuditReasonMemo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("memo_image_list") != null && !jsonObj.get("memo_image_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo_image_list` to be an array in the JSON string but got `%s`", jsonObj.get("memo_image_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiniAppAuditReasonMemo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiniAppAuditReasonMemo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiniAppAuditReasonMemo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiniAppAuditReasonMemo.class));

       return (TypeAdapter<T>) new TypeAdapter<MiniAppAuditReasonMemo>() {
           @Override
           public void write(JsonWriter out, MiniAppAuditReasonMemo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MiniAppAuditReasonMemo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MiniAppAuditReasonMemo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MiniAppAuditReasonMemo
  * @throws IOException if the JSON string is invalid with respect to MiniAppAuditReasonMemo
  */
  public static MiniAppAuditReasonMemo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiniAppAuditReasonMemo.class);
  }

 /**
  * Convert an instance of MiniAppAuditReasonMemo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

