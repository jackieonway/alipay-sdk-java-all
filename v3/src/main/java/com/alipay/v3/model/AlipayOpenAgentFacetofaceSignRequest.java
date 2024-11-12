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
import com.alipay.v3.model.AlipayOpenAgentFacetofaceSignModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * AlipayOpenAgentFacetofaceSignRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentFacetofaceSignRequest {
  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_AUTH_PIC = "business_license_auth_pic";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_AUTH_PIC)
  private File businessLicenseAuthPic;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_PIC = "business_license_pic";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_PIC)
  private File businessLicensePic;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AlipayOpenAgentFacetofaceSignModel data;

  public static final String SERIALIZED_NAME_SHOP_SCENE_PIC = "shop_scene_pic";
  @SerializedName(SERIALIZED_NAME_SHOP_SCENE_PIC)
  private File shopScenePic;

  public static final String SERIALIZED_NAME_SHOP_SIGN_BOARD_PIC = "shop_sign_board_pic";
  @SerializedName(SERIALIZED_NAME_SHOP_SIGN_BOARD_PIC)
  private File shopSignBoardPic;

  public static final String SERIALIZED_NAME_SPECIAL_LICENSE_PIC = "special_license_pic";
  @SerializedName(SERIALIZED_NAME_SPECIAL_LICENSE_PIC)
  private File specialLicensePic;

  public AlipayOpenAgentFacetofaceSignRequest() { 
  }

  public AlipayOpenAgentFacetofaceSignRequest businessLicenseAuthPic(File businessLicenseAuthPic) {
    
    this.businessLicenseAuthPic = businessLicenseAuthPic;
    return this;
  }

   /**
   * Get businessLicenseAuthPic
   * @return businessLicenseAuthPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getBusinessLicenseAuthPic() {
    return businessLicenseAuthPic;
  }


  public void setBusinessLicenseAuthPic(File businessLicenseAuthPic) {
    this.businessLicenseAuthPic = businessLicenseAuthPic;
  }


  public AlipayOpenAgentFacetofaceSignRequest businessLicensePic(File businessLicensePic) {
    
    this.businessLicensePic = businessLicensePic;
    return this;
  }

   /**
   * Get businessLicensePic
   * @return businessLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getBusinessLicensePic() {
    return businessLicensePic;
  }


  public void setBusinessLicensePic(File businessLicensePic) {
    this.businessLicensePic = businessLicensePic;
  }


  public AlipayOpenAgentFacetofaceSignRequest data(AlipayOpenAgentFacetofaceSignModel data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlipayOpenAgentFacetofaceSignModel getData() {
    return data;
  }


  public void setData(AlipayOpenAgentFacetofaceSignModel data) {
    this.data = data;
  }


  public AlipayOpenAgentFacetofaceSignRequest shopScenePic(File shopScenePic) {
    
    this.shopScenePic = shopScenePic;
    return this;
  }

   /**
   * Get shopScenePic
   * @return shopScenePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getShopScenePic() {
    return shopScenePic;
  }


  public void setShopScenePic(File shopScenePic) {
    this.shopScenePic = shopScenePic;
  }


  public AlipayOpenAgentFacetofaceSignRequest shopSignBoardPic(File shopSignBoardPic) {
    
    this.shopSignBoardPic = shopSignBoardPic;
    return this;
  }

   /**
   * Get shopSignBoardPic
   * @return shopSignBoardPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getShopSignBoardPic() {
    return shopSignBoardPic;
  }


  public void setShopSignBoardPic(File shopSignBoardPic) {
    this.shopSignBoardPic = shopSignBoardPic;
  }


  public AlipayOpenAgentFacetofaceSignRequest specialLicensePic(File specialLicensePic) {
    
    this.specialLicensePic = specialLicensePic;
    return this;
  }

   /**
   * Get specialLicensePic
   * @return specialLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getSpecialLicensePic() {
    return specialLicensePic;
  }


  public void setSpecialLicensePic(File specialLicensePic) {
    this.specialLicensePic = specialLicensePic;
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
   * @return the AlipayOpenAgentFacetofaceSignRequest instance itself
   */
  public AlipayOpenAgentFacetofaceSignRequest putAdditionalProperty(String key, Object value) {
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
    AlipayOpenAgentFacetofaceSignRequest alipayOpenAgentFacetofaceSignRequest = (AlipayOpenAgentFacetofaceSignRequest) o;
    return Objects.equals(this.businessLicenseAuthPic, alipayOpenAgentFacetofaceSignRequest.businessLicenseAuthPic) &&
        Objects.equals(this.businessLicensePic, alipayOpenAgentFacetofaceSignRequest.businessLicensePic) &&
        Objects.equals(this.data, alipayOpenAgentFacetofaceSignRequest.data) &&
        Objects.equals(this.shopScenePic, alipayOpenAgentFacetofaceSignRequest.shopScenePic) &&
        Objects.equals(this.shopSignBoardPic, alipayOpenAgentFacetofaceSignRequest.shopSignBoardPic) &&
        Objects.equals(this.specialLicensePic, alipayOpenAgentFacetofaceSignRequest.specialLicensePic)&&
        Objects.equals(this.additionalProperties, alipayOpenAgentFacetofaceSignRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessLicenseAuthPic, businessLicensePic, data, shopScenePic, shopSignBoardPic, specialLicensePic, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentFacetofaceSignRequest {\n");
    sb.append("    businessLicenseAuthPic: ").append(toIndentedString(businessLicenseAuthPic)).append("\n");
    sb.append("    businessLicensePic: ").append(toIndentedString(businessLicensePic)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    shopScenePic: ").append(toIndentedString(shopScenePic)).append("\n");
    sb.append("    shopSignBoardPic: ").append(toIndentedString(shopSignBoardPic)).append("\n");
    sb.append("    specialLicensePic: ").append(toIndentedString(specialLicensePic)).append("\n");
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
    openapiFields.add("business_license_auth_pic");
    openapiFields.add("business_license_pic");
    openapiFields.add("data");
    openapiFields.add("shop_scene_pic");
    openapiFields.add("shop_sign_board_pic");
    openapiFields.add("special_license_pic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentFacetofaceSignRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentFacetofaceSignRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentFacetofaceSignRequest is not found in the empty JSON string", AlipayOpenAgentFacetofaceSignRequest.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        AlipayOpenAgentFacetofaceSignModel.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentFacetofaceSignRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentFacetofaceSignRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentFacetofaceSignRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentFacetofaceSignRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentFacetofaceSignRequest>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentFacetofaceSignRequest value) throws IOException {
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
           public AlipayOpenAgentFacetofaceSignRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAgentFacetofaceSignRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenAgentFacetofaceSignRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentFacetofaceSignRequest
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentFacetofaceSignRequest
  */
  public static AlipayOpenAgentFacetofaceSignRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentFacetofaceSignRequest.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentFacetofaceSignRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

