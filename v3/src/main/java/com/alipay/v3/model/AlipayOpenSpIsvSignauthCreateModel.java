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
import com.alipay.v3.model.IsvAuthSceneInfo;
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
 * AlipayOpenSpIsvSignauthCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpIsvSignauthCreateModel {
  public static final String SERIALIZED_NAME_ISV_AUTH_SCENE_INFOS = "isv_auth_scene_infos";
  @SerializedName(SERIALIZED_NAME_ISV_AUTH_SCENE_INFOS)
  private List<IsvAuthSceneInfo> isvAuthSceneInfos = null;

  public static final String SERIALIZED_NAME_MERCHANT_LOGON_ID = "merchant_logon_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_LOGON_ID)
  private String merchantLogonId;

  public static final String SERIALIZED_NAME_NEED_APP_AUTH = "need_app_auth";
  @SerializedName(SERIALIZED_NAME_NEED_APP_AUTH)
  private String needAppAuth;

  public static final String SERIALIZED_NAME_SIGN_ORDER_NO = "sign_order_no";
  @SerializedName(SERIALIZED_NAME_SIGN_ORDER_NO)
  private String signOrderNo;

  public AlipayOpenSpIsvSignauthCreateModel() { 
  }

  public AlipayOpenSpIsvSignauthCreateModel isvAuthSceneInfos(List<IsvAuthSceneInfo> isvAuthSceneInfos) {
    
    this.isvAuthSceneInfos = isvAuthSceneInfos;
    return this;
  }

  public AlipayOpenSpIsvSignauthCreateModel addIsvAuthSceneInfosItem(IsvAuthSceneInfo isvAuthSceneInfosItem) {
    if (this.isvAuthSceneInfos == null) {
      this.isvAuthSceneInfos = new ArrayList<>();
    }
    this.isvAuthSceneInfos.add(isvAuthSceneInfosItem);
    return this;
  }

   /**
   * 代运营授权场景信息
   * @return isvAuthSceneInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "代运营授权场景信息")

  public List<IsvAuthSceneInfo> getIsvAuthSceneInfos() {
    return isvAuthSceneInfos;
  }


  public void setIsvAuthSceneInfos(List<IsvAuthSceneInfo> isvAuthSceneInfos) {
    this.isvAuthSceneInfos = isvAuthSceneInfos;
  }


  public AlipayOpenSpIsvSignauthCreateModel merchantLogonId(String merchantLogonId) {
    
    this.merchantLogonId = merchantLogonId;
    return this;
  }

   /**
   * 商户登录账号 支持手机号和邮箱账号；不支持pid
   * @return merchantLogonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13181141917", value = "商户登录账号 支持手机号和邮箱账号；不支持pid")

  public String getMerchantLogonId() {
    return merchantLogonId;
  }


  public void setMerchantLogonId(String merchantLogonId) {
    this.merchantLogonId = merchantLogonId;
  }


  public AlipayOpenSpIsvSignauthCreateModel needAppAuth(String needAppAuth) {
    
    this.needAppAuth = needAppAuth;
    return this;
  }

   /**
   * 1表示需要，0表示不需要 不传参数默认是需要（1） 是否创建三方应用授权子任务，也就是是否需要给三方应用授权
   * @return needAppAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1表示需要，0表示不需要 不传参数默认是需要（1） 是否创建三方应用授权子任务，也就是是否需要给三方应用授权")

  public String getNeedAppAuth() {
    return needAppAuth;
  }


  public void setNeedAppAuth(String needAppAuth) {
    this.needAppAuth = needAppAuth;
  }


  public AlipayOpenSpIsvSignauthCreateModel signOrderNo(String signOrderNo) {
    
    this.signOrderNo = signOrderNo;
    return this;
  }

   /**
   * 签约单号 可通过alipay.open.agent.confirm接口获取签约单号
   * @return signOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211015034000100000052128459671", value = "签约单号 可通过alipay.open.agent.confirm接口获取签约单号")

  public String getSignOrderNo() {
    return signOrderNo;
  }


  public void setSignOrderNo(String signOrderNo) {
    this.signOrderNo = signOrderNo;
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
   * @return the AlipayOpenSpIsvSignauthCreateModel instance itself
   */
  public AlipayOpenSpIsvSignauthCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenSpIsvSignauthCreateModel alipayOpenSpIsvSignauthCreateModel = (AlipayOpenSpIsvSignauthCreateModel) o;
    return Objects.equals(this.isvAuthSceneInfos, alipayOpenSpIsvSignauthCreateModel.isvAuthSceneInfos) &&
        Objects.equals(this.merchantLogonId, alipayOpenSpIsvSignauthCreateModel.merchantLogonId) &&
        Objects.equals(this.needAppAuth, alipayOpenSpIsvSignauthCreateModel.needAppAuth) &&
        Objects.equals(this.signOrderNo, alipayOpenSpIsvSignauthCreateModel.signOrderNo)&&
        Objects.equals(this.additionalProperties, alipayOpenSpIsvSignauthCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isvAuthSceneInfos, merchantLogonId, needAppAuth, signOrderNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpIsvSignauthCreateModel {\n");
    sb.append("    isvAuthSceneInfos: ").append(toIndentedString(isvAuthSceneInfos)).append("\n");
    sb.append("    merchantLogonId: ").append(toIndentedString(merchantLogonId)).append("\n");
    sb.append("    needAppAuth: ").append(toIndentedString(needAppAuth)).append("\n");
    sb.append("    signOrderNo: ").append(toIndentedString(signOrderNo)).append("\n");
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
    openapiFields.add("isv_auth_scene_infos");
    openapiFields.add("merchant_logon_id");
    openapiFields.add("need_app_auth");
    openapiFields.add("sign_order_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpIsvSignauthCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpIsvSignauthCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpIsvSignauthCreateModel is not found in the empty JSON string", AlipayOpenSpIsvSignauthCreateModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayisvAuthSceneInfos = jsonObj.getAsJsonArray("isv_auth_scene_infos");
      if (jsonArrayisvAuthSceneInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("isv_auth_scene_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `isv_auth_scene_infos` to be an array in the JSON string but got `%s`", jsonObj.get("isv_auth_scene_infos").toString()));
        }

        // validate the optional field `isv_auth_scene_infos` (array)
        for (int i = 0; i < jsonArrayisvAuthSceneInfos.size(); i++) {
          IsvAuthSceneInfo.validateJsonObject(jsonArrayisvAuthSceneInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("merchant_logon_id") != null && !jsonObj.get("merchant_logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_logon_id").toString()));
      }
      if (jsonObj.get("need_app_auth") != null && !jsonObj.get("need_app_auth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `need_app_auth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("need_app_auth").toString()));
      }
      if (jsonObj.get("sign_order_no") != null && !jsonObj.get("sign_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_order_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpIsvSignauthCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpIsvSignauthCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpIsvSignauthCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpIsvSignauthCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpIsvSignauthCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpIsvSignauthCreateModel value) throws IOException {
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
           public AlipayOpenSpIsvSignauthCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenSpIsvSignauthCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenSpIsvSignauthCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpIsvSignauthCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpIsvSignauthCreateModel
  */
  public static AlipayOpenSpIsvSignauthCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpIsvSignauthCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpIsvSignauthCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

