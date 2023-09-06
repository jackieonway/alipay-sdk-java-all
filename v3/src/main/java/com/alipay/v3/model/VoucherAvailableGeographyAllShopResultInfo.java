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
import com.alipay.v3.model.VoucherFailShopInfo;
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
 * VoucherAvailableGeographyAllShopResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherAvailableGeographyAllShopResultInfo {
  public static final String SERIALIZED_NAME_FAIL_EXCLUDE_SHOP_INFOS = "fail_exclude_shop_infos";
  @SerializedName(SERIALIZED_NAME_FAIL_EXCLUDE_SHOP_INFOS)
  private List<VoucherFailShopInfo> failExcludeShopInfos = null;

  public static final String SERIALIZED_NAME_SUCCESS_EXCLUDE_SHOP_IDS = "success_exclude_shop_ids";
  @SerializedName(SERIALIZED_NAME_SUCCESS_EXCLUDE_SHOP_IDS)
  private List<String> successExcludeShopIds = null;

  public VoucherAvailableGeographyAllShopResultInfo() { 
  }

  public VoucherAvailableGeographyAllShopResultInfo failExcludeShopInfos(List<VoucherFailShopInfo> failExcludeShopInfos) {
    
    this.failExcludeShopInfos = failExcludeShopInfos;
    return this;
  }

  public VoucherAvailableGeographyAllShopResultInfo addFailExcludeShopInfosItem(VoucherFailShopInfo failExcludeShopInfosItem) {
    if (this.failExcludeShopInfos == null) {
      this.failExcludeShopInfos = new ArrayList<>();
    }
    this.failExcludeShopInfos.add(failExcludeShopInfosItem);
    return this;
  }

   /**
   * 请求失败的不可用门店详情。
   * @return failExcludeShopInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求失败的不可用门店详情。")

  public List<VoucherFailShopInfo> getFailExcludeShopInfos() {
    return failExcludeShopInfos;
  }


  public void setFailExcludeShopInfos(List<VoucherFailShopInfo> failExcludeShopInfos) {
    this.failExcludeShopInfos = failExcludeShopInfos;
  }


  public VoucherAvailableGeographyAllShopResultInfo successExcludeShopIds(List<String> successExcludeShopIds) {
    
    this.successExcludeShopIds = successExcludeShopIds;
    return this;
  }

  public VoucherAvailableGeographyAllShopResultInfo addSuccessExcludeShopIdsItem(String successExcludeShopIdsItem) {
    if (this.successExcludeShopIds == null) {
      this.successExcludeShopIds = new ArrayList<>();
    }
    this.successExcludeShopIds.add(successExcludeShopIdsItem);
    return this;
  }

   /**
   * 请求成功的不可用门店列表。
   * @return successExcludeShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求成功的不可用门店列表。")

  public List<String> getSuccessExcludeShopIds() {
    return successExcludeShopIds;
  }


  public void setSuccessExcludeShopIds(List<String> successExcludeShopIds) {
    this.successExcludeShopIds = successExcludeShopIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherAvailableGeographyAllShopResultInfo voucherAvailableGeographyAllShopResultInfo = (VoucherAvailableGeographyAllShopResultInfo) o;
    return Objects.equals(this.failExcludeShopInfos, voucherAvailableGeographyAllShopResultInfo.failExcludeShopInfos) &&
        Objects.equals(this.successExcludeShopIds, voucherAvailableGeographyAllShopResultInfo.successExcludeShopIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failExcludeShopInfos, successExcludeShopIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherAvailableGeographyAllShopResultInfo {\n");
    sb.append("    failExcludeShopInfos: ").append(toIndentedString(failExcludeShopInfos)).append("\n");
    sb.append("    successExcludeShopIds: ").append(toIndentedString(successExcludeShopIds)).append("\n");
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
    openapiFields.add("fail_exclude_shop_infos");
    openapiFields.add("success_exclude_shop_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherAvailableGeographyAllShopResultInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherAvailableGeographyAllShopResultInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherAvailableGeographyAllShopResultInfo is not found in the empty JSON string", VoucherAvailableGeographyAllShopResultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherAvailableGeographyAllShopResultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherAvailableGeographyAllShopResultInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfailExcludeShopInfos = jsonObj.getAsJsonArray("fail_exclude_shop_infos");
      if (jsonArrayfailExcludeShopInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fail_exclude_shop_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fail_exclude_shop_infos` to be an array in the JSON string but got `%s`", jsonObj.get("fail_exclude_shop_infos").toString()));
        }

        // validate the optional field `fail_exclude_shop_infos` (array)
        for (int i = 0; i < jsonArrayfailExcludeShopInfos.size(); i++) {
          VoucherFailShopInfo.validateJsonObject(jsonArrayfailExcludeShopInfos.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("success_exclude_shop_ids") != null && !jsonObj.get("success_exclude_shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `success_exclude_shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("success_exclude_shop_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherAvailableGeographyAllShopResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherAvailableGeographyAllShopResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherAvailableGeographyAllShopResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherAvailableGeographyAllShopResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherAvailableGeographyAllShopResultInfo>() {
           @Override
           public void write(JsonWriter out, VoucherAvailableGeographyAllShopResultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherAvailableGeographyAllShopResultInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherAvailableGeographyAllShopResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherAvailableGeographyAllShopResultInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherAvailableGeographyAllShopResultInfo
  */
  public static VoucherAvailableGeographyAllShopResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherAvailableGeographyAllShopResultInfo.class);
  }

 /**
  * Convert an instance of VoucherAvailableGeographyAllShopResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

