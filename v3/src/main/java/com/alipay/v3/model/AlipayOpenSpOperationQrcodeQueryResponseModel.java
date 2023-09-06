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
import com.alipay.v3.model.RecommendAccountDTO;
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
 * AlipayOpenSpOperationQrcodeQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpOperationQrcodeQueryResponseModel {
  public static final String SERIALIZED_NAME_BATCH_NO = "batch_no";
  @SerializedName(SERIALIZED_NAME_BATCH_NO)
  private String batchNo;

  public static final String SERIALIZED_NAME_BIND_ACCOUNT = "bind_account";
  @SerializedName(SERIALIZED_NAME_BIND_ACCOUNT)
  private RecommendAccountDTO bindAccount;

  public static final String SERIALIZED_NAME_QR_CODE_URL = "qr_code_url";
  @SerializedName(SERIALIZED_NAME_QR_CODE_URL)
  private String qrCodeUrl;

  public static final String SERIALIZED_NAME_RECOMMEND_ACCOUNT_LIST = "recommend_account_list";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_ACCOUNT_LIST)
  private List<RecommendAccountDTO> recommendAccountList = null;

  public static final String SERIALIZED_NAME_RECOMMEND_ACCOUNTS = "recommend_accounts";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_ACCOUNTS)
  private RecommendAccountDTO recommendAccounts;

  public AlipayOpenSpOperationQrcodeQueryResponseModel() { 
  }

  public AlipayOpenSpOperationQrcodeQueryResponseModel batchNo(String batchNo) {
    
    this.batchNo = batchNo;
    return this;
  }

   /**
   * 支付宝操作批次号
   * @return batchNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020222342342", value = "支付宝操作批次号")

  public String getBatchNo() {
    return batchNo;
  }


  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public AlipayOpenSpOperationQrcodeQueryResponseModel bindAccount(RecommendAccountDTO bindAccount) {
    
    this.bindAccount = bindAccount;
    return this;
  }

   /**
   * Get bindAccount
   * @return bindAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecommendAccountDTO getBindAccount() {
    return bindAccount;
  }


  public void setBindAccount(RecommendAccountDTO bindAccount) {
    this.bindAccount = bindAccount;
  }


  public AlipayOpenSpOperationQrcodeQueryResponseModel qrCodeUrl(String qrCodeUrl) {
    
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

   /**
   * 二维码图片地址，urlEncode处理过。 注意： 1.有效期为24h; 2.用户扫码确认授权操作（同意/拒绝）后，支付宝将通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/01lc2d\&quot;&gt;alipay.open.sp.operation.result.notify&lt;/a&gt;接口发送异步通知给服务商。
   * @return qrCodeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://qrcode.alipay.com/adadadad.jpg", value = "二维码图片地址，urlEncode处理过。 注意： 1.有效期为24h; 2.用户扫码确认授权操作（同意/拒绝）后，支付宝将通过<a href=\"https://opendocs.alipay.com/apis/01lc2d\">alipay.open.sp.operation.result.notify</a>接口发送异步通知给服务商。")

  public String getQrCodeUrl() {
    return qrCodeUrl;
  }


  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }


  public AlipayOpenSpOperationQrcodeQueryResponseModel recommendAccountList(List<RecommendAccountDTO> recommendAccountList) {
    
    this.recommendAccountList = recommendAccountList;
    return this;
  }

  public AlipayOpenSpOperationQrcodeQueryResponseModel addRecommendAccountListItem(RecommendAccountDTO recommendAccountListItem) {
    if (this.recommendAccountList == null) {
      this.recommendAccountList = new ArrayList<>();
    }
    this.recommendAccountList.add(recommendAccountListItem);
    return this;
  }

   /**
   * 只针对服务商代间连商家发起代运营绑定、授权时，如果传递的alipay_account不符合绑定或授权要求，这个字段会返回推荐的商家支付宝账号列表，包括：支付宝账号和名称，为保护商家信息，账号和名称都按照规范脱敏。
   * @return recommendAccountList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "只针对服务商代间连商家发起代运营绑定、授权时，如果传递的alipay_account不符合绑定或授权要求，这个字段会返回推荐的商家支付宝账号列表，包括：支付宝账号和名称，为保护商家信息，账号和名称都按照规范脱敏。")

  public List<RecommendAccountDTO> getRecommendAccountList() {
    return recommendAccountList;
  }


  public void setRecommendAccountList(List<RecommendAccountDTO> recommendAccountList) {
    this.recommendAccountList = recommendAccountList;
  }


  public AlipayOpenSpOperationQrcodeQueryResponseModel recommendAccounts(RecommendAccountDTO recommendAccounts) {
    
    this.recommendAccounts = recommendAccounts;
    return this;
  }

   /**
   * Get recommendAccounts
   * @return recommendAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecommendAccountDTO getRecommendAccounts() {
    return recommendAccounts;
  }


  public void setRecommendAccounts(RecommendAccountDTO recommendAccounts) {
    this.recommendAccounts = recommendAccounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSpOperationQrcodeQueryResponseModel alipayOpenSpOperationQrcodeQueryResponseModel = (AlipayOpenSpOperationQrcodeQueryResponseModel) o;
    return Objects.equals(this.batchNo, alipayOpenSpOperationQrcodeQueryResponseModel.batchNo) &&
        Objects.equals(this.bindAccount, alipayOpenSpOperationQrcodeQueryResponseModel.bindAccount) &&
        Objects.equals(this.qrCodeUrl, alipayOpenSpOperationQrcodeQueryResponseModel.qrCodeUrl) &&
        Objects.equals(this.recommendAccountList, alipayOpenSpOperationQrcodeQueryResponseModel.recommendAccountList) &&
        Objects.equals(this.recommendAccounts, alipayOpenSpOperationQrcodeQueryResponseModel.recommendAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchNo, bindAccount, qrCodeUrl, recommendAccountList, recommendAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpOperationQrcodeQueryResponseModel {\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    bindAccount: ").append(toIndentedString(bindAccount)).append("\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    recommendAccountList: ").append(toIndentedString(recommendAccountList)).append("\n");
    sb.append("    recommendAccounts: ").append(toIndentedString(recommendAccounts)).append("\n");
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
    openapiFields.add("batch_no");
    openapiFields.add("bind_account");
    openapiFields.add("qr_code_url");
    openapiFields.add("recommend_account_list");
    openapiFields.add("recommend_accounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpOperationQrcodeQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpOperationQrcodeQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpOperationQrcodeQueryResponseModel is not found in the empty JSON string", AlipayOpenSpOperationQrcodeQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSpOperationQrcodeQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSpOperationQrcodeQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("batch_no") != null && !jsonObj.get("batch_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_no").toString()));
      }
      // validate the optional field `bind_account`
      if (jsonObj.getAsJsonObject("bind_account") != null) {
        RecommendAccountDTO.validateJsonObject(jsonObj.getAsJsonObject("bind_account"));
      }
      if (jsonObj.get("qr_code_url") != null && !jsonObj.get("qr_code_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qr_code_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qr_code_url").toString()));
      }
      JsonArray jsonArrayrecommendAccountList = jsonObj.getAsJsonArray("recommend_account_list");
      if (jsonArrayrecommendAccountList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("recommend_account_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `recommend_account_list` to be an array in the JSON string but got `%s`", jsonObj.get("recommend_account_list").toString()));
        }

        // validate the optional field `recommend_account_list` (array)
        for (int i = 0; i < jsonArrayrecommendAccountList.size(); i++) {
          RecommendAccountDTO.validateJsonObject(jsonArrayrecommendAccountList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `recommend_accounts`
      if (jsonObj.getAsJsonObject("recommend_accounts") != null) {
        RecommendAccountDTO.validateJsonObject(jsonObj.getAsJsonObject("recommend_accounts"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpOperationQrcodeQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpOperationQrcodeQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpOperationQrcodeQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpOperationQrcodeQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpOperationQrcodeQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpOperationQrcodeQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSpOperationQrcodeQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSpOperationQrcodeQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpOperationQrcodeQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpOperationQrcodeQueryResponseModel
  */
  public static AlipayOpenSpOperationQrcodeQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpOperationQrcodeQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpOperationQrcodeQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

