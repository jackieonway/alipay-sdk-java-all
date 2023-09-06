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
import com.alipay.v3.model.JointAccountQuotaRespDTO;
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
 * AlipayFundJointaccountQuotaQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountQuotaQueryResponseModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_QUOTA = "account_quota";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_QUOTA)
  private List<JointAccountQuotaRespDTO> accountQuota = null;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_MEMBER_ID = "member_id";
  @SerializedName(SERIALIZED_NAME_MEMBER_ID)
  private String memberId;

  public static final String SERIALIZED_NAME_MEMBER_OPEN_ID = "member_open_id";
  @SerializedName(SERIALIZED_NAME_MEMBER_OPEN_ID)
  private String memberOpenId;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public AlipayFundJointaccountQuotaQueryResponseModel() { 
  }

  public AlipayFundJointaccountQuotaQueryResponseModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088900976746215", value = "共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayFundJointaccountQuotaQueryResponseModel accountQuota(List<JointAccountQuotaRespDTO> accountQuota) {
    
    this.accountQuota = accountQuota;
    return this;
  }

  public AlipayFundJointaccountQuotaQueryResponseModel addAccountQuotaItem(JointAccountQuotaRespDTO accountQuotaItem) {
    if (this.accountQuota == null) {
      this.accountQuota = new ArrayList<>();
    }
    this.accountQuota.add(accountQuotaItem);
    return this;
  }

   /**
   * 共同账户额度模型
   * @return accountQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "共同账户额度模型")

  public List<JointAccountQuotaRespDTO> getAccountQuota() {
    return accountQuota;
  }


  public void setAccountQuota(List<JointAccountQuotaRespDTO> accountQuota) {
    this.accountQuota = accountQuota;
  }


  public AlipayFundJointaccountQuotaQueryResponseModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 场景码
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "场景码")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundJointaccountQuotaQueryResponseModel memberId(String memberId) {
    
    this.memberId = memberId;
    return this;
  }

   /**
   * 成员ID（如果查询员工才返回）
   * @return memberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088900976746215", value = "成员ID（如果查询员工才返回）")

  public String getMemberId() {
    return memberId;
  }


  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  public AlipayFundJointaccountQuotaQueryResponseModel memberOpenId(String memberOpenId) {
    
    this.memberOpenId = memberOpenId;
    return this;
  }

   /**
   * 员工openId
   * @return memberOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "员工openId")

  public String getMemberOpenId() {
    return memberOpenId;
  }


  public void setMemberOpenId(String memberOpenId) {
    this.memberOpenId = memberOpenId;
  }


  public AlipayFundJointaccountQuotaQueryResponseModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY", value = "产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundJointaccountQuotaQueryResponseModel alipayFundJointaccountQuotaQueryResponseModel = (AlipayFundJointaccountQuotaQueryResponseModel) o;
    return Objects.equals(this.accountId, alipayFundJointaccountQuotaQueryResponseModel.accountId) &&
        Objects.equals(this.accountQuota, alipayFundJointaccountQuotaQueryResponseModel.accountQuota) &&
        Objects.equals(this.bizScene, alipayFundJointaccountQuotaQueryResponseModel.bizScene) &&
        Objects.equals(this.memberId, alipayFundJointaccountQuotaQueryResponseModel.memberId) &&
        Objects.equals(this.memberOpenId, alipayFundJointaccountQuotaQueryResponseModel.memberOpenId) &&
        Objects.equals(this.productCode, alipayFundJointaccountQuotaQueryResponseModel.productCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountQuota, bizScene, memberId, memberOpenId, productCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountQuotaQueryResponseModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountQuota: ").append(toIndentedString(accountQuota)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    memberOpenId: ").append(toIndentedString(memberOpenId)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_quota");
    openapiFields.add("biz_scene");
    openapiFields.add("member_id");
    openapiFields.add("member_open_id");
    openapiFields.add("product_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountQuotaQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountQuotaQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountQuotaQueryResponseModel is not found in the empty JSON string", AlipayFundJointaccountQuotaQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundJointaccountQuotaQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundJointaccountQuotaQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      JsonArray jsonArrayaccountQuota = jsonObj.getAsJsonArray("account_quota");
      if (jsonArrayaccountQuota != null) {
        // ensure the json data is an array
        if (!jsonObj.get("account_quota").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `account_quota` to be an array in the JSON string but got `%s`", jsonObj.get("account_quota").toString()));
        }

        // validate the optional field `account_quota` (array)
        for (int i = 0; i < jsonArrayaccountQuota.size(); i++) {
          JointAccountQuotaRespDTO.validateJsonObject(jsonArrayaccountQuota.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("member_id") != null && !jsonObj.get("member_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_id").toString()));
      }
      if (jsonObj.get("member_open_id") != null && !jsonObj.get("member_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_open_id").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountQuotaQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountQuotaQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountQuotaQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountQuotaQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountQuotaQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountQuotaQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundJointaccountQuotaQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundJointaccountQuotaQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountQuotaQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountQuotaQueryResponseModel
  */
  public static AlipayFundJointaccountQuotaQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountQuotaQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountQuotaQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

