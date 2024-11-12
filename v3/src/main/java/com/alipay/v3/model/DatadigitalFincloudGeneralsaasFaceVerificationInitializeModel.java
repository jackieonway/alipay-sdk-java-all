/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-11-12
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
 * DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel {
  public static final String SERIALIZED_NAME_BIZ_CODE = "biz_code";
  @SerializedName(SERIALIZED_NAME_BIZ_CODE)
  private String bizCode;

  public static final String SERIALIZED_NAME_CERT_NAME = "cert_name";
  @SerializedName(SERIALIZED_NAME_CERT_NAME)
  private String certName;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CERT_TYPE = "cert_type";
  @SerializedName(SERIALIZED_NAME_CERT_TYPE)
  private String certType;

  public static final String SERIALIZED_NAME_FACE_RESERVE_STRATEGY = "face_reserve_strategy";
  @SerializedName(SERIALIZED_NAME_FACE_RESERVE_STRATEGY)
  private String faceReserveStrategy;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_NATION = "nation";
  @SerializedName(SERIALIZED_NAME_NATION)
  private String nation;

  public static final String SERIALIZED_NAME_OUTER_ORDER_NO = "outer_order_no";
  @SerializedName(SERIALIZED_NAME_OUTER_ORDER_NO)
  private String outerOrderNo;

  public static final String SERIALIZED_NAME_PHONE_NO = "phone_no";
  @SerializedName(SERIALIZED_NAME_PHONE_NO)
  private String phoneNo;

  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel() { 
  }

  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel bizCode(String bizCode) {
    
    this.bizCode = bizCode;
    return this;
  }

   /**
   * 人脸核身具体类型目前仅支持：DATA_DIGITAL_BIZ_CODE_FACE_VERIFICATION
   * @return bizCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DATA_DIGITAL_BIZ_CODE_FACE_VERIFICATION", value = "人脸核身具体类型目前仅支持：DATA_DIGITAL_BIZ_CODE_FACE_VERIFICATION")

  public String getBizCode() {
    return bizCode;
  }


  public void setBizCode(String bizCode) {
    this.bizCode = bizCode;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel certName(String certName) {
    
    this.certName = certName;
    return this;
  }

   /**
   * 真实姓名
   * @return certName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "真实姓名")

  public String getCertName() {
    return certName;
  }


  public void setCertName(String certName) {
    this.certName = certName;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 证件号
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "131128199004234511", value = "证件号")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel certType(String certType) {
    
    this.certType = certType;
    return this;
  }

   /**
   * 证件类型，当前枚举支持： IDENTITY_CARD：身份证 RESIDENCE_HK_MC：港澳居民居住证 RESIDENCE_TAIWAN：台湾居民居住证
   * @return certType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDENTITY_CARD", value = "证件类型，当前枚举支持： IDENTITY_CARD：身份证 RESIDENCE_HK_MC：港澳居民居住证 RESIDENCE_TAIWAN：台湾居民居住证")

  public String getCertType() {
    return certType;
  }


  public void setCertType(String certType) {
    this.certType = certType;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel faceReserveStrategy(String faceReserveStrategy) {
    
    this.faceReserveStrategy = faceReserveStrategy;
    return this;
  }

   /**
   * 人脸保存策略，非必填。具体取值为：reserve(保存活体人脸)/never(不保存活体人脸)，不传默认为reserve
   * @return faceReserveStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "reserve", value = "人脸保存策略，非必填。具体取值为：reserve(保存活体人脸)/never(不保存活体人脸)，不传默认为reserve")

  public String getFaceReserveStrategy() {
    return faceReserveStrategy;
  }


  public void setFaceReserveStrategy(String faceReserveStrategy) {
    this.faceReserveStrategy = faceReserveStrategy;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * 认证类型，固定值为：CERT_INFO
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CERT_INFO", value = "认证类型，固定值为：CERT_INFO")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel nation(String nation) {
    
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


  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel outerOrderNo(String outerOrderNo) {
    
    this.outerOrderNo = outerOrderNo;
    return this;
  }

   /**
   * 商户请求的唯一标识，商户要保证其唯一性，值为64位长度的字母数字组合。建议：前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
   * @return outerOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dsdfaeradsfasdf23234234sdf", value = "商户请求的唯一标识，商户要保证其唯一性，值为64位长度的字母数字组合。建议：前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列")

  public String getOuterOrderNo() {
    return outerOrderNo;
  }


  public void setOuterOrderNo(String outerOrderNo) {
    this.outerOrderNo = outerOrderNo;
  }


  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel phoneNo(String phoneNo) {
    
    this.phoneNo = phoneNo;
    return this;
  }

   /**
   * 手机号码
   * @return phoneNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13088646233", value = "手机号码")

  public String getPhoneNo() {
    return phoneNo;
  }


  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
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
   * @return the DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel instance itself
   */
  public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel putAdditionalProperty(String key, Object value) {
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
    DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel datadigitalFincloudGeneralsaasFaceVerificationInitializeModel = (DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel) o;
    return Objects.equals(this.bizCode, datadigitalFincloudGeneralsaasFaceVerificationInitializeModel.bizCode) &&
        Objects.equals(this.certName, datadigitalFincloudGeneralsaasFaceVerificationInitializeModel.certName) &&
        Objects.equals(this.certNo, datadigitalFincloudGeneralsaasFaceVerificationInitializeModel.certNo) &&
        Objects.equals(this.certType, datadigitalFincloudGeneralsaasFaceVerificationInitializeModel.certType) &&
        Objects.equals(this.faceReserveStrategy, datadigitalFincloudGeneralsaasFaceVerificationInitializeModel.faceReserveStrategy) &&
        Objects.equals(this.identityType, datadigitalFincloudGeneralsaasFaceVerificationInitializeModel.identityType) &&
        Objects.equals(this.nation, datadigitalFincloudGeneralsaasFaceVerificationInitializeModel.nation) &&
        Objects.equals(this.outerOrderNo, datadigitalFincloudGeneralsaasFaceVerificationInitializeModel.outerOrderNo) &&
        Objects.equals(this.phoneNo, datadigitalFincloudGeneralsaasFaceVerificationInitializeModel.phoneNo)&&
        Objects.equals(this.additionalProperties, datadigitalFincloudGeneralsaasFaceVerificationInitializeModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizCode, certName, certNo, certType, faceReserveStrategy, identityType, nation, outerOrderNo, phoneNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel {\n");
    sb.append("    bizCode: ").append(toIndentedString(bizCode)).append("\n");
    sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    faceReserveStrategy: ").append(toIndentedString(faceReserveStrategy)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    nation: ").append(toIndentedString(nation)).append("\n");
    sb.append("    outerOrderNo: ").append(toIndentedString(outerOrderNo)).append("\n");
    sb.append("    phoneNo: ").append(toIndentedString(phoneNo)).append("\n");
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
    openapiFields.add("biz_code");
    openapiFields.add("cert_name");
    openapiFields.add("cert_no");
    openapiFields.add("cert_type");
    openapiFields.add("face_reserve_strategy");
    openapiFields.add("identity_type");
    openapiFields.add("nation");
    openapiFields.add("outer_order_no");
    openapiFields.add("phone_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_code") != null && !jsonObj.get("biz_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_code").toString()));
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
      if (jsonObj.get("face_reserve_strategy") != null && !jsonObj.get("face_reserve_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `face_reserve_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("face_reserve_strategy").toString()));
      }
      if (jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      if (jsonObj.get("nation") != null && !jsonObj.get("nation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nation").toString()));
      }
      if (jsonObj.get("outer_order_no") != null && !jsonObj.get("outer_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_order_no").toString()));
      }
      if (jsonObj.get("phone_no") != null && !jsonObj.get("phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel value) throws IOException {
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
           public DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel
  */
  public static DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

