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
 * AlipayMobilePublicShortlinkCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMobilePublicShortlinkCreateModel {
  public static final String SERIALIZED_NAME_BIZ_CONTENT = "biz_content";
  @SerializedName(SERIALIZED_NAME_BIZ_CONTENT)
  private String bizContent;

  public AlipayMobilePublicShortlinkCreateModel() { 
  }

  public AlipayMobilePublicShortlinkCreateModel bizContent(String bizContent) {
    
    this.bizContent = bizContent;
    return this;
  }

   /**
   * json串，&lt;a href&#x3D;\&quot;https://doc.open.alipay.com/doc2/detail.htm?spm&#x3D;a219a.7386797.0.0.pGdb8h&amp;treeId&#x3D;53&amp;articleId&#x3D;103491&amp;docType&#x3D;1\&quot;&gt;详情请见&lt;/a&gt;
   * @return bizContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{      \"sceneId\": \"store_pay_1\",      \"remark\": \"门店1支付推广\"  }", value = "json串，<a href=\"https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7386797.0.0.pGdb8h&treeId=53&articleId=103491&docType=1\">详情请见</a>")

  public String getBizContent() {
    return bizContent;
  }


  public void setBizContent(String bizContent) {
    this.bizContent = bizContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMobilePublicShortlinkCreateModel alipayMobilePublicShortlinkCreateModel = (AlipayMobilePublicShortlinkCreateModel) o;
    return Objects.equals(this.bizContent, alipayMobilePublicShortlinkCreateModel.bizContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMobilePublicShortlinkCreateModel {\n");
    sb.append("    bizContent: ").append(toIndentedString(bizContent)).append("\n");
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
    openapiFields.add("biz_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMobilePublicShortlinkCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMobilePublicShortlinkCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMobilePublicShortlinkCreateModel is not found in the empty JSON string", AlipayMobilePublicShortlinkCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMobilePublicShortlinkCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMobilePublicShortlinkCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_content") != null && !jsonObj.get("biz_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMobilePublicShortlinkCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMobilePublicShortlinkCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMobilePublicShortlinkCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMobilePublicShortlinkCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMobilePublicShortlinkCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayMobilePublicShortlinkCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMobilePublicShortlinkCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMobilePublicShortlinkCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMobilePublicShortlinkCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMobilePublicShortlinkCreateModel
  */
  public static AlipayMobilePublicShortlinkCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMobilePublicShortlinkCreateModel.class);
  }

 /**
  * Convert an instance of AlipayMobilePublicShortlinkCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

