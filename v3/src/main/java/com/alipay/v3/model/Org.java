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
 * Org
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Org {
  public static final String SERIALIZED_NAME_ORG_ID_NUMBER = "org_id_number";
  @SerializedName(SERIALIZED_NAME_ORG_ID_NUMBER)
  private String orgIdNumber;

  public static final String SERIALIZED_NAME_ORG_ID_TYPE = "org_id_type";
  @SerializedName(SERIALIZED_NAME_ORG_ID_TYPE)
  private String orgIdType;

  public static final String SERIALIZED_NAME_ORG_LEGAL_ID_NUMBER = "org_legal_id_number";
  @SerializedName(SERIALIZED_NAME_ORG_LEGAL_ID_NUMBER)
  private String orgLegalIdNumber;

  public static final String SERIALIZED_NAME_ORG_LEGAL_ID_TYPE = "org_legal_id_type";
  @SerializedName(SERIALIZED_NAME_ORG_LEGAL_ID_TYPE)
  private String orgLegalIdType;

  public static final String SERIALIZED_NAME_ORG_LEGAL_NAME = "org_legal_name";
  @SerializedName(SERIALIZED_NAME_ORG_LEGAL_NAME)
  private String orgLegalName;

  public static final String SERIALIZED_NAME_ORG_NAME = "org_name";
  @SerializedName(SERIALIZED_NAME_ORG_NAME)
  private String orgName;

  public static final String SERIALIZED_NAME_THIRD_PARTY_USER_ID = "third_party_user_id";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_USER_ID)
  private String thirdPartyUserId;

  public Org() { 
  }

  public Org orgIdNumber(String orgIdNumber) {
    
    this.orgIdNumber = orgIdNumber;
    return this;
  }

   /**
   * 企业证件号
   * @return orgIdNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "913301087458306077", value = "企业证件号")

  public String getOrgIdNumber() {
    return orgIdNumber;
  }


  public void setOrgIdNumber(String orgIdNumber) {
    this.orgIdNumber = orgIdNumber;
  }


  public Org orgIdType(String orgIdType) {
    
    this.orgIdType = orgIdType;
    return this;
  }

   /**
   * 企业证件类型，（证件号不为空时必填，详见企业证件类型）
   * @return orgIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CRED_ORG_USCC", value = "企业证件类型，（证件号不为空时必填，详见企业证件类型）")

  public String getOrgIdType() {
    return orgIdType;
  }


  public void setOrgIdType(String orgIdType) {
    this.orgIdType = orgIdType;
  }


  public Org orgLegalIdNumber(String orgLegalIdNumber) {
    
    this.orgLegalIdNumber = orgLegalIdNumber;
    return this;
  }

   /**
   * 法定代表人证件号
   * @return orgLegalIdNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330304199801011111", value = "法定代表人证件号")

  public String getOrgLegalIdNumber() {
    return orgLegalIdNumber;
  }


  public void setOrgLegalIdNumber(String orgLegalIdNumber) {
    this.orgLegalIdNumber = orgLegalIdNumber;
  }


  public Org orgLegalIdType(String orgLegalIdType) {
    
    this.orgLegalIdType = orgLegalIdType;
    return this;
  }

   /**
   * 法定代表人证件类型
   * @return orgLegalIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CRED_PSN_CH_IDCARD", value = "法定代表人证件类型")

  public String getOrgLegalIdType() {
    return orgLegalIdType;
  }


  public void setOrgLegalIdType(String orgLegalIdType) {
    this.orgLegalIdType = orgLegalIdType;
  }


  public Org orgLegalName(String orgLegalName) {
    
    this.orgLegalName = orgLegalName;
    return this;
  }

   /**
   * 法定代表人名称
   * @return orgLegalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "折颜", value = "法定代表人名称")

  public String getOrgLegalName() {
    return orgLegalName;
  }


  public void setOrgLegalName(String orgLegalName) {
    this.orgLegalName = orgLegalName;
  }


  public Org orgName(String orgName) {
    
    this.orgName = orgName;
    return this;
  }

   /**
   * 企业名称
   * @return orgName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州天谷信息科技有限公司", value = "企业名称")

  public String getOrgName() {
    return orgName;
  }


  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }


  public Org thirdPartyUserId(String thirdPartyUserId) {
    
    this.thirdPartyUserId = thirdPartyUserId;
    return this;
  }

   /**
   * 企业唯一标识：可传入平台机构id、企业证件号、企业邮箱等（个人用户与企业的唯一标识不可重复）
   * @return thirdPartyUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "913301087458306077", value = "企业唯一标识：可传入平台机构id、企业证件号、企业邮箱等（个人用户与企业的唯一标识不可重复）")

  public String getThirdPartyUserId() {
    return thirdPartyUserId;
  }


  public void setThirdPartyUserId(String thirdPartyUserId) {
    this.thirdPartyUserId = thirdPartyUserId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Org org = (Org) o;
    return Objects.equals(this.orgIdNumber, org.orgIdNumber) &&
        Objects.equals(this.orgIdType, org.orgIdType) &&
        Objects.equals(this.orgLegalIdNumber, org.orgLegalIdNumber) &&
        Objects.equals(this.orgLegalIdType, org.orgLegalIdType) &&
        Objects.equals(this.orgLegalName, org.orgLegalName) &&
        Objects.equals(this.orgName, org.orgName) &&
        Objects.equals(this.thirdPartyUserId, org.thirdPartyUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgIdNumber, orgIdType, orgLegalIdNumber, orgLegalIdType, orgLegalName, orgName, thirdPartyUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Org {\n");
    sb.append("    orgIdNumber: ").append(toIndentedString(orgIdNumber)).append("\n");
    sb.append("    orgIdType: ").append(toIndentedString(orgIdType)).append("\n");
    sb.append("    orgLegalIdNumber: ").append(toIndentedString(orgLegalIdNumber)).append("\n");
    sb.append("    orgLegalIdType: ").append(toIndentedString(orgLegalIdType)).append("\n");
    sb.append("    orgLegalName: ").append(toIndentedString(orgLegalName)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    thirdPartyUserId: ").append(toIndentedString(thirdPartyUserId)).append("\n");
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
    openapiFields.add("org_id_number");
    openapiFields.add("org_id_type");
    openapiFields.add("org_legal_id_number");
    openapiFields.add("org_legal_id_type");
    openapiFields.add("org_legal_name");
    openapiFields.add("org_name");
    openapiFields.add("third_party_user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Org
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Org.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Org is not found in the empty JSON string", Org.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Org.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Org` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("org_id_number") != null && !jsonObj.get("org_id_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_id_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_id_number").toString()));
      }
      if (jsonObj.get("org_id_type") != null && !jsonObj.get("org_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_id_type").toString()));
      }
      if (jsonObj.get("org_legal_id_number") != null && !jsonObj.get("org_legal_id_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_legal_id_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_legal_id_number").toString()));
      }
      if (jsonObj.get("org_legal_id_type") != null && !jsonObj.get("org_legal_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_legal_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_legal_id_type").toString()));
      }
      if (jsonObj.get("org_legal_name") != null && !jsonObj.get("org_legal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_legal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_legal_name").toString()));
      }
      if (jsonObj.get("org_name") != null && !jsonObj.get("org_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_name").toString()));
      }
      if (jsonObj.get("third_party_user_id") != null && !jsonObj.get("third_party_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_party_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_party_user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Org.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Org' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Org> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Org.class));

       return (TypeAdapter<T>) new TypeAdapter<Org>() {
           @Override
           public void write(JsonWriter out, Org value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Org read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Org given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Org
  * @throws IOException if the JSON string is invalid with respect to Org
  */
  public static Org fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Org.class);
  }

 /**
  * Convert an instance of Org to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

