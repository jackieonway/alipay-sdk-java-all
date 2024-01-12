/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-12
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
 * DatadigitalFincloudGeneralsaasFaceSourceCertifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasFaceSourceCertifyModel {
  public static final String SERIALIZED_NAME_CERT_NAME = "cert_name";
  @SerializedName(SERIALIZED_NAME_CERT_NAME)
  private String certName;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CERT_TYPE = "cert_type";
  @SerializedName(SERIALIZED_NAME_CERT_TYPE)
  private String certType;

  public static final String SERIALIZED_NAME_LIVENESS_STRATEGY = "liveness_strategy";
  @SerializedName(SERIALIZED_NAME_LIVENESS_STRATEGY)
  private String livenessStrategy;

  public static final String SERIALIZED_NAME_NATION = "nation";
  @SerializedName(SERIALIZED_NAME_NATION)
  private String nation;

  public static final String SERIALIZED_NAME_OUTER_BIZ_NO = "outer_biz_no";
  @SerializedName(SERIALIZED_NAME_OUTER_BIZ_NO)
  private String outerBizNo;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_RESERVED = "reserved";
  @SerializedName(SERIALIZED_NAME_RESERVED)
  private Boolean reserved;

  public static final String SERIALIZED_NAME_SECURITY_STRATEGY = "security_strategy";
  @SerializedName(SERIALIZED_NAME_SECURITY_STRATEGY)
  private String securityStrategy;

  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel() { 
  }

  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel certName(String certName) {
    
    this.certName = certName;
    return this;
  }

   /**
   * 用户姓名，与身份证上的姓名相匹配
   * @return certName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张大伟", value = "用户姓名，与身份证上的姓名相匹配")

  public String getCertName() {
    return certName;
  }


  public void setCertName(String certName) {
    this.certName = certName;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 证件号码，如大陆身份证号码
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "131128199032333322", value = "证件号码，如大陆身份证号码")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel certType(String certType) {
    
    this.certType = certType;
    return this;
  }

   /**
   * 证件信息类型，大陆身份证：IDENTITY_CARD
   * @return certType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDENTITY_CARD", value = "证件信息类型，大陆身份证：IDENTITY_CARD")

  public String getCertType() {
    return certType;
  }


  public void setCertType(String certType) {
    this.certType = certType;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel livenessStrategy(String livenessStrategy) {
    
    this.livenessStrategy = livenessStrategy;
    return this;
  }

   /**
   * 活体检测类型，当前枚举支持： OFF：关闭活体检测； CHECK：正常活体检测。 不传默认CHECK。
   * @return livenessStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHECK", value = "活体检测类型，当前枚举支持： OFF：关闭活体检测； CHECK：正常活体检测。 不传默认CHECK。")

  public String getLivenessStrategy() {
    return livenessStrategy;
  }


  public void setLivenessStrategy(String livenessStrategy) {
    this.livenessStrategy = livenessStrategy;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel nation(String nation) {
    
    this.nation = nation;
    return this;
  }

   /**
   * 国家地区代码，当证件类型为外国人永久居留证时必填。
   * @return nation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CAN", value = "国家地区代码，当证件类型为外国人永久居留证时必填。")

  public String getNation() {
    return nation;
  }


  public void setNation(String nation) {
    this.nation = nation;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel outerBizNo(String outerBizNo) {
    
    this.outerBizNo = outerBizNo;
    return this;
  }

   /**
   * 客户业务单据号
   * @return outerBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxxx", value = "客户业务单据号")

  public String getOuterBizNo() {
    return outerBizNo;
  }


  public void setOuterBizNo(String outerBizNo) {
    this.outerBizNo = outerBizNo;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 手机号，特殊场景下，在验证过程中需用户输入手机来接受系统发送的安全验证短信。默认不传即可。
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13088646325", value = "手机号，特殊场景下，在验证过程中需用户输入手机来接受系统发送的安全验证短信。默认不传即可。")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel reserved(Boolean reserved) {
    
    this.reserved = reserved;
    return this;
  }

   /**
   * true：需要留底；false：无需留底。默认留底
   * @return reserved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "true：需要留底；false：无需留底。默认留底")

  public Boolean getReserved() {
    return reserved;
  }


  public void setReserved(Boolean reserved) {
    this.reserved = reserved;
  }


  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel securityStrategy(String securityStrategy) {
    
    this.securityStrategy = securityStrategy;
    return this;
  }

   /**
   * ON：开启安全拦截。OFF：关闭安全拦截。默认取值为ON。
   * @return securityStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ON", value = "ON：开启安全拦截。OFF：关闭安全拦截。默认取值为ON。")

  public String getSecurityStrategy() {
    return securityStrategy;
  }


  public void setSecurityStrategy(String securityStrategy) {
    this.securityStrategy = securityStrategy;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DatadigitalFincloudGeneralsaasFaceSourceCertifyModel instance itself
   */
  public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadigitalFincloudGeneralsaasFaceSourceCertifyModel datadigitalFincloudGeneralsaasFaceSourceCertifyModel = (DatadigitalFincloudGeneralsaasFaceSourceCertifyModel) o;
    return Objects.equals(this.certName, datadigitalFincloudGeneralsaasFaceSourceCertifyModel.certName) &&
        Objects.equals(this.certNo, datadigitalFincloudGeneralsaasFaceSourceCertifyModel.certNo) &&
        Objects.equals(this.certType, datadigitalFincloudGeneralsaasFaceSourceCertifyModel.certType) &&
        Objects.equals(this.livenessStrategy, datadigitalFincloudGeneralsaasFaceSourceCertifyModel.livenessStrategy) &&
        Objects.equals(this.nation, datadigitalFincloudGeneralsaasFaceSourceCertifyModel.nation) &&
        Objects.equals(this.outerBizNo, datadigitalFincloudGeneralsaasFaceSourceCertifyModel.outerBizNo) &&
        Objects.equals(this.phone, datadigitalFincloudGeneralsaasFaceSourceCertifyModel.phone) &&
        Objects.equals(this.reserved, datadigitalFincloudGeneralsaasFaceSourceCertifyModel.reserved) &&
        Objects.equals(this.securityStrategy, datadigitalFincloudGeneralsaasFaceSourceCertifyModel.securityStrategy)&&
        Objects.equals(this.additionalProperties, datadigitalFincloudGeneralsaasFaceSourceCertifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certName, certNo, certType, livenessStrategy, nation, outerBizNo, phone, reserved, securityStrategy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasFaceSourceCertifyModel {\n");
    sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    livenessStrategy: ").append(toIndentedString(livenessStrategy)).append("\n");
    sb.append("    nation: ").append(toIndentedString(nation)).append("\n");
    sb.append("    outerBizNo: ").append(toIndentedString(outerBizNo)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
    sb.append("    securityStrategy: ").append(toIndentedString(securityStrategy)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("cert_name");
    openapiFields.add("cert_no");
    openapiFields.add("cert_type");
    openapiFields.add("liveness_strategy");
    openapiFields.add("nation");
    openapiFields.add("outer_biz_no");
    openapiFields.add("phone");
    openapiFields.add("reserved");
    openapiFields.add("security_strategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasFaceSourceCertifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasFaceSourceCertifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasFaceSourceCertifyModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasFaceSourceCertifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("cert_name") != null && !jsonObj.get("cert_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_name").toString()));
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("cert_type") != null && !jsonObj.get("cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_type").toString()));
      }
      if (jsonObj.get("liveness_strategy") != null && !jsonObj.get("liveness_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liveness_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liveness_strategy").toString()));
      }
      if (jsonObj.get("nation") != null && !jsonObj.get("nation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nation").toString()));
      }
      if (jsonObj.get("outer_biz_no") != null && !jsonObj.get("outer_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_biz_no").toString()));
      }
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (jsonObj.get("security_strategy") != null && !jsonObj.get("security_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `security_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("security_strategy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadigitalFincloudGeneralsaasFaceSourceCertifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasFaceSourceCertifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasFaceSourceCertifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasFaceSourceCertifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasFaceSourceCertifyModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasFaceSourceCertifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DatadigitalFincloudGeneralsaasFaceSourceCertifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DatadigitalFincloudGeneralsaasFaceSourceCertifyModel instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatadigitalFincloudGeneralsaasFaceSourceCertifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasFaceSourceCertifyModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasFaceSourceCertifyModel
  */
  public static DatadigitalFincloudGeneralsaasFaceSourceCertifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasFaceSourceCertifyModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasFaceSourceCertifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

