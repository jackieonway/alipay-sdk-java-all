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
import com.alipay.v3.model.UserVoucherInfo;
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
 * AlipayMarketingActivityUserBatchqueryvoucherResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityUserBatchqueryvoucherResponseModel {
  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public static final String SERIALIZED_NAME_USER_VOUCHER_INFOS = "user_voucher_infos";
  @SerializedName(SERIALIZED_NAME_USER_VOUCHER_INFOS)
  private List<UserVoucherInfo> userVoucherInfos = null;

  public AlipayMarketingActivityUserBatchqueryvoucherResponseModel() { 
  }

  public AlipayMarketingActivityUserBatchqueryvoucherResponseModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 分页查询页码
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "分页查询页码")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayMarketingActivityUserBatchqueryvoucherResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页查询单页数据条数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "分页查询单页数据条数")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayMarketingActivityUserBatchqueryvoucherResponseModel totalSize(Integer totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 总数量
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "总数量")

  public Integer getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }


  public AlipayMarketingActivityUserBatchqueryvoucherResponseModel userVoucherInfos(List<UserVoucherInfo> userVoucherInfos) {
    
    this.userVoucherInfos = userVoucherInfos;
    return this;
  }

  public AlipayMarketingActivityUserBatchqueryvoucherResponseModel addUserVoucherInfosItem(UserVoucherInfo userVoucherInfosItem) {
    if (this.userVoucherInfos == null) {
      this.userVoucherInfos = new ArrayList<>();
    }
    this.userVoucherInfos.add(userVoucherInfosItem);
    return this;
  }

   /**
   * 用户券实例
   * @return userVoucherInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户券实例")

  public List<UserVoucherInfo> getUserVoucherInfos() {
    return userVoucherInfos;
  }


  public void setUserVoucherInfos(List<UserVoucherInfo> userVoucherInfos) {
    this.userVoucherInfos = userVoucherInfos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityUserBatchqueryvoucherResponseModel alipayMarketingActivityUserBatchqueryvoucherResponseModel = (AlipayMarketingActivityUserBatchqueryvoucherResponseModel) o;
    return Objects.equals(this.pageNum, alipayMarketingActivityUserBatchqueryvoucherResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayMarketingActivityUserBatchqueryvoucherResponseModel.pageSize) &&
        Objects.equals(this.totalSize, alipayMarketingActivityUserBatchqueryvoucherResponseModel.totalSize) &&
        Objects.equals(this.userVoucherInfos, alipayMarketingActivityUserBatchqueryvoucherResponseModel.userVoucherInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNum, pageSize, totalSize, userVoucherInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityUserBatchqueryvoucherResponseModel {\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    userVoucherInfos: ").append(toIndentedString(userVoucherInfos)).append("\n");
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
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("total_size");
    openapiFields.add("user_voucher_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityUserBatchqueryvoucherResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityUserBatchqueryvoucherResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityUserBatchqueryvoucherResponseModel is not found in the empty JSON string", AlipayMarketingActivityUserBatchqueryvoucherResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityUserBatchqueryvoucherResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityUserBatchqueryvoucherResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayuserVoucherInfos = jsonObj.getAsJsonArray("user_voucher_infos");
      if (jsonArrayuserVoucherInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("user_voucher_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `user_voucher_infos` to be an array in the JSON string but got `%s`", jsonObj.get("user_voucher_infos").toString()));
        }

        // validate the optional field `user_voucher_infos` (array)
        for (int i = 0; i < jsonArrayuserVoucherInfos.size(); i++) {
          UserVoucherInfo.validateJsonObject(jsonArrayuserVoucherInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityUserBatchqueryvoucherResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityUserBatchqueryvoucherResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityUserBatchqueryvoucherResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityUserBatchqueryvoucherResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityUserBatchqueryvoucherResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityUserBatchqueryvoucherResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityUserBatchqueryvoucherResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityUserBatchqueryvoucherResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityUserBatchqueryvoucherResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityUserBatchqueryvoucherResponseModel
  */
  public static AlipayMarketingActivityUserBatchqueryvoucherResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityUserBatchqueryvoucherResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityUserBatchqueryvoucherResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

