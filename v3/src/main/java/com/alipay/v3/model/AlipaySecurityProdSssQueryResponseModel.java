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
 * AlipaySecurityProdSssQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipaySecurityProdSssQueryResponseModel {
  public static final String SERIALIZED_NAME_CCC = "ccc";
  @SerializedName(SERIALIZED_NAME_CCC)
  private String ccc;

  public static final String SERIALIZED_NAME_CCC_OPEN_ID = "ccc_open_id";
  @SerializedName(SERIALIZED_NAME_CCC_OPEN_ID)
  private String cccOpenId;

  public AlipaySecurityProdSssQueryResponseModel() { 
  }

  public AlipaySecurityProdSssQueryResponseModel ccc(String ccc) {
    
    this.ccc = ccc;
    return this;
  }

   /**
   * 1
   * @return ccc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23", value = "1")

  public String getCcc() {
    return ccc;
  }


  public void setCcc(String ccc) {
    this.ccc = ccc;
  }


  public AlipaySecurityProdSssQueryResponseModel cccOpenId(String cccOpenId) {
    
    this.cccOpenId = cccOpenId;
    return this;
  }

   /**
   * 1
   * @return cccOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "1")

  public String getCccOpenId() {
    return cccOpenId;
  }


  public void setCccOpenId(String cccOpenId) {
    this.cccOpenId = cccOpenId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipaySecurityProdSssQueryResponseModel alipaySecurityProdSssQueryResponseModel = (AlipaySecurityProdSssQueryResponseModel) o;
    return Objects.equals(this.ccc, alipaySecurityProdSssQueryResponseModel.ccc) &&
        Objects.equals(this.cccOpenId, alipaySecurityProdSssQueryResponseModel.cccOpenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccc, cccOpenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipaySecurityProdSssQueryResponseModel {\n");
    sb.append("    ccc: ").append(toIndentedString(ccc)).append("\n");
    sb.append("    cccOpenId: ").append(toIndentedString(cccOpenId)).append("\n");
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
    openapiFields.add("ccc");
    openapiFields.add("ccc_open_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipaySecurityProdSssQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipaySecurityProdSssQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipaySecurityProdSssQueryResponseModel is not found in the empty JSON string", AlipaySecurityProdSssQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipaySecurityProdSssQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipaySecurityProdSssQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ccc") != null && !jsonObj.get("ccc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccc").toString()));
      }
      if (jsonObj.get("ccc_open_id") != null && !jsonObj.get("ccc_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccc_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccc_open_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipaySecurityProdSssQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipaySecurityProdSssQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipaySecurityProdSssQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipaySecurityProdSssQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipaySecurityProdSssQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipaySecurityProdSssQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipaySecurityProdSssQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipaySecurityProdSssQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipaySecurityProdSssQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipaySecurityProdSssQueryResponseModel
  */
  public static AlipaySecurityProdSssQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipaySecurityProdSssQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipaySecurityProdSssQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

