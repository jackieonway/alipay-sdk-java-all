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
import com.alipay.v3.model.PublicAuditStatus;
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
 * AlipayOpenPublicInfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicInfoQueryResponseModel {
  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_AUDIT_DESC = "audit_desc";
  @SerializedName(SERIALIZED_NAME_AUDIT_DESC)
  private String auditDesc;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private String auditStatus;

  public static final String SERIALIZED_NAME_AUDIT_STATUS_LIST = "audit_status_list";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS_LIST)
  private List<PublicAuditStatus> auditStatusList = null;

  public static final String SERIALIZED_NAME_BACKGROUND_URL = "background_url";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_URL)
  private String backgroundUrl;

  public static final String SERIALIZED_NAME_INTRODUCTION = "introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction;

  public static final String SERIALIZED_NAME_IS_ONLINE = "is_online";
  @SerializedName(SERIALIZED_NAME_IS_ONLINE)
  private String isOnline;

  public static final String SERIALIZED_NAME_IS_RELEASE = "is_release";
  @SerializedName(SERIALIZED_NAME_IS_RELEASE)
  private String isRelease;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_MCC_CODE_DESC = "mcc_code_desc";
  @SerializedName(SERIALIZED_NAME_MCC_CODE_DESC)
  private String mccCodeDesc;

  public static final String SERIALIZED_NAME_PUBLIC_GREETING = "public_greeting";
  @SerializedName(SERIALIZED_NAME_PUBLIC_GREETING)
  private String publicGreeting;

  public AlipayOpenPublicInfoQueryResponseModel() { 
  }

  public AlipayOpenPublicInfoQueryResponseModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 生活号名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "生活号名称", value = "生活号名称")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenPublicInfoQueryResponseModel auditDesc(String auditDesc) {
    
    this.auditDesc = auditDesc;
    return this;
  }

   /**
   * 最新审核状态描述，如果审核驳回则有相关的驳回理由
   * @return auditDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "logo图片不符合规范", value = "最新审核状态描述，如果审核驳回则有相关的驳回理由")

  public String getAuditDesc() {
    return auditDesc;
  }


  public void setAuditDesc(String auditDesc) {
    this.auditDesc = auditDesc;
  }


  public AlipayOpenPublicInfoQueryResponseModel auditStatus(String auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 最新审核状态，对于系统商而言，只有四个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过，AUDIT_NORMAL：无审核状态（当前没有处于审核过程的工单）
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDITING", value = "最新审核状态，对于系统商而言，只有四个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过，AUDIT_NORMAL：无审核状态（当前没有处于审核过程的工单）")

  public String getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
  }


  public AlipayOpenPublicInfoQueryResponseModel auditStatusList(List<PublicAuditStatus> auditStatusList) {
    
    this.auditStatusList = auditStatusList;
    return this;
  }

  public AlipayOpenPublicInfoQueryResponseModel addAuditStatusListItem(PublicAuditStatus auditStatusListItem) {
    if (this.auditStatusList == null) {
      this.auditStatusList = new ArrayList<>();
    }
    this.auditStatusList.add(auditStatusListItem);
    return this;
  }

   /**
   * 审核状态表，目前支持名称、头像、名称与头像、简介审核状态
   * @return auditStatusList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "审核状态表，目前支持名称、头像、名称与头像、简介审核状态")

  public List<PublicAuditStatus> getAuditStatusList() {
    return auditStatusList;
  }


  public void setAuditStatusList(List<PublicAuditStatus> auditStatusList) {
    this.auditStatusList = auditStatusList;
  }


  public AlipayOpenPublicInfoQueryResponseModel backgroundUrl(String backgroundUrl) {
    
    this.backgroundUrl = backgroundUrl;
    return this;
  }

   /**
   * 背景图片地址
   * @return backgroundUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://dl.django.t.taobao.com/rest/1.0/image?fileIds=V9rfg69SSimLZg5wDA3yEgAAACMA", value = "背景图片地址")

  public String getBackgroundUrl() {
    return backgroundUrl;
  }


  public void setBackgroundUrl(String backgroundUrl) {
    this.backgroundUrl = backgroundUrl;
  }


  public AlipayOpenPublicInfoQueryResponseModel introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 生活号简介
   * @return introduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "简介", value = "生活号简介")

  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public AlipayOpenPublicInfoQueryResponseModel isOnline(String isOnline) {
    
    this.isOnline = isOnline;
    return this;
  }

   /**
   * 生活号是否上线，T表示上线，F表示未上线
   * @return isOnline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "生活号是否上线，T表示上线，F表示未上线")

  public String getIsOnline() {
    return isOnline;
  }


  public void setIsOnline(String isOnline) {
    this.isOnline = isOnline;
  }


  public AlipayOpenPublicInfoQueryResponseModel isRelease(String isRelease) {
    
    this.isRelease = isRelease;
    return this;
  }

   /**
   * 生活号是否上架，T表示上架，上架即可在支付宝客户端被搜索到，F表示未上架
   * @return isRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "F", value = "生活号是否上架，T表示上架，上架即可在支付宝客户端被搜索到，F表示未上架")

  public String getIsRelease() {
    return isRelease;
  }


  public void setIsRelease(String isRelease) {
    this.isRelease = isRelease;
  }


  public AlipayOpenPublicInfoQueryResponseModel logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * 生活号头像地址
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://pic.alipayobjects.com/e/201311/1ZQ", value = "生活号头像地址")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public AlipayOpenPublicInfoQueryResponseModel mccCodeDesc(String mccCodeDesc) {
    
    this.mccCodeDesc = mccCodeDesc;
    return this;
  }

   /**
   * 商家经营类目，详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01n22g\&quot;&gt;商家经营类目&lt;/a&gt;
   * @return mccCodeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "房地产开发商", value = "商家经营类目，详情参见 <a href=\"https://opendocs.alipay.com/open/01n22g\">商家经营类目</a>")

  public String getMccCodeDesc() {
    return mccCodeDesc;
  }


  public void setMccCodeDesc(String mccCodeDesc) {
    this.mccCodeDesc = mccCodeDesc;
  }


  public AlipayOpenPublicInfoQueryResponseModel publicGreeting(String publicGreeting) {
    
    this.publicGreeting = publicGreeting;
    return this;
  }

   /**
   * 欢迎语
   * @return publicGreeting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "欢迎光临", value = "欢迎语")

  public String getPublicGreeting() {
    return publicGreeting;
  }


  public void setPublicGreeting(String publicGreeting) {
    this.publicGreeting = publicGreeting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicInfoQueryResponseModel alipayOpenPublicInfoQueryResponseModel = (AlipayOpenPublicInfoQueryResponseModel) o;
    return Objects.equals(this.appName, alipayOpenPublicInfoQueryResponseModel.appName) &&
        Objects.equals(this.auditDesc, alipayOpenPublicInfoQueryResponseModel.auditDesc) &&
        Objects.equals(this.auditStatus, alipayOpenPublicInfoQueryResponseModel.auditStatus) &&
        Objects.equals(this.auditStatusList, alipayOpenPublicInfoQueryResponseModel.auditStatusList) &&
        Objects.equals(this.backgroundUrl, alipayOpenPublicInfoQueryResponseModel.backgroundUrl) &&
        Objects.equals(this.introduction, alipayOpenPublicInfoQueryResponseModel.introduction) &&
        Objects.equals(this.isOnline, alipayOpenPublicInfoQueryResponseModel.isOnline) &&
        Objects.equals(this.isRelease, alipayOpenPublicInfoQueryResponseModel.isRelease) &&
        Objects.equals(this.logoUrl, alipayOpenPublicInfoQueryResponseModel.logoUrl) &&
        Objects.equals(this.mccCodeDesc, alipayOpenPublicInfoQueryResponseModel.mccCodeDesc) &&
        Objects.equals(this.publicGreeting, alipayOpenPublicInfoQueryResponseModel.publicGreeting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, auditDesc, auditStatus, auditStatusList, backgroundUrl, introduction, isOnline, isRelease, logoUrl, mccCodeDesc, publicGreeting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicInfoQueryResponseModel {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    auditDesc: ").append(toIndentedString(auditDesc)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    auditStatusList: ").append(toIndentedString(auditStatusList)).append("\n");
    sb.append("    backgroundUrl: ").append(toIndentedString(backgroundUrl)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    isRelease: ").append(toIndentedString(isRelease)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    mccCodeDesc: ").append(toIndentedString(mccCodeDesc)).append("\n");
    sb.append("    publicGreeting: ").append(toIndentedString(publicGreeting)).append("\n");
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
    openapiFields.add("app_name");
    openapiFields.add("audit_desc");
    openapiFields.add("audit_status");
    openapiFields.add("audit_status_list");
    openapiFields.add("background_url");
    openapiFields.add("introduction");
    openapiFields.add("is_online");
    openapiFields.add("is_release");
    openapiFields.add("logo_url");
    openapiFields.add("mcc_code_desc");
    openapiFields.add("public_greeting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicInfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicInfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicInfoQueryResponseModel is not found in the empty JSON string", AlipayOpenPublicInfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicInfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicInfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("audit_desc") != null && !jsonObj.get("audit_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_desc").toString()));
      }
      if (jsonObj.get("audit_status") != null && !jsonObj.get("audit_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_status").toString()));
      }
      JsonArray jsonArrayauditStatusList = jsonObj.getAsJsonArray("audit_status_list");
      if (jsonArrayauditStatusList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("audit_status_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `audit_status_list` to be an array in the JSON string but got `%s`", jsonObj.get("audit_status_list").toString()));
        }

        // validate the optional field `audit_status_list` (array)
        for (int i = 0; i < jsonArrayauditStatusList.size(); i++) {
          PublicAuditStatus.validateJsonObject(jsonArrayauditStatusList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("background_url") != null && !jsonObj.get("background_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `background_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("background_url").toString()));
      }
      if (jsonObj.get("introduction") != null && !jsonObj.get("introduction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `introduction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("introduction").toString()));
      }
      if (jsonObj.get("is_online") != null && !jsonObj.get("is_online").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_online` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_online").toString()));
      }
      if (jsonObj.get("is_release") != null && !jsonObj.get("is_release").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_release` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_release").toString()));
      }
      if (jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if (jsonObj.get("mcc_code_desc") != null && !jsonObj.get("mcc_code_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_code_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_code_desc").toString()));
      }
      if (jsonObj.get("public_greeting") != null && !jsonObj.get("public_greeting").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_greeting` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_greeting").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicInfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicInfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicInfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicInfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicInfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicInfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicInfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicInfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicInfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicInfoQueryResponseModel
  */
  public static AlipayOpenPublicInfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicInfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicInfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

