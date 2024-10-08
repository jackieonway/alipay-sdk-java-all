/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-08
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.AlipayOpenAgentMobilepaySignModel;
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
 * AlipayOpenAgentMobilepaySignRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentMobilepaySignRequest {
  public static final String SERIALIZED_NAME_APP_AUTH_PIC = "app_auth_pic";
  @SerializedName(SERIALIZED_NAME_APP_AUTH_PIC)
  private File appAuthPic;

  public static final String SERIALIZED_NAME_APP_DEMO = "app_demo";
  @SerializedName(SERIALIZED_NAME_APP_DEMO)
  private File appDemo;

  public static final String SERIALIZED_NAME_APP_HOME_SCREENSHOT = "app_home_screenshot";
  @SerializedName(SERIALIZED_NAME_APP_HOME_SCREENSHOT)
  private File appHomeScreenshot;

  public static final String SERIALIZED_NAME_APP_ITEM_SCREENSHOT = "app_item_screenshot";
  @SerializedName(SERIALIZED_NAME_APP_ITEM_SCREENSHOT)
  private File appItemScreenshot;

  public static final String SERIALIZED_NAME_APP_PAY_SCREENSHOT = "app_pay_screenshot";
  @SerializedName(SERIALIZED_NAME_APP_PAY_SCREENSHOT)
  private File appPayScreenshot;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_AUTH_PIC = "business_license_auth_pic";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_AUTH_PIC)
  private File businessLicenseAuthPic;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_PIC = "business_license_pic";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_PIC)
  private File businessLicensePic;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AlipayOpenAgentMobilepaySignModel data;

  public static final String SERIALIZED_NAME_HOME_SCREENSHOT = "home_screenshot";
  @SerializedName(SERIALIZED_NAME_HOME_SCREENSHOT)
  private File homeScreenshot;

  public static final String SERIALIZED_NAME_IN_APP_SCREENSHOT = "in_app_screenshot";
  @SerializedName(SERIALIZED_NAME_IN_APP_SCREENSHOT)
  private File inAppScreenshot;

  public static final String SERIALIZED_NAME_PAY_SCREENSHOT = "pay_screenshot";
  @SerializedName(SERIALIZED_NAME_PAY_SCREENSHOT)
  private File payScreenshot;

  public static final String SERIALIZED_NAME_SPECIAL_LICENSE_PIC = "special_license_pic";
  @SerializedName(SERIALIZED_NAME_SPECIAL_LICENSE_PIC)
  private File specialLicensePic;

  public AlipayOpenAgentMobilepaySignRequest() { 
  }

  public AlipayOpenAgentMobilepaySignRequest appAuthPic(File appAuthPic) {
    
    this.appAuthPic = appAuthPic;
    return this;
  }

   /**
   * Get appAuthPic
   * @return appAuthPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getAppAuthPic() {
    return appAuthPic;
  }


  public void setAppAuthPic(File appAuthPic) {
    this.appAuthPic = appAuthPic;
  }


  public AlipayOpenAgentMobilepaySignRequest appDemo(File appDemo) {
    
    this.appDemo = appDemo;
    return this;
  }

   /**
   * Get appDemo
   * @return appDemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getAppDemo() {
    return appDemo;
  }


  public void setAppDemo(File appDemo) {
    this.appDemo = appDemo;
  }


  public AlipayOpenAgentMobilepaySignRequest appHomeScreenshot(File appHomeScreenshot) {
    
    this.appHomeScreenshot = appHomeScreenshot;
    return this;
  }

   /**
   * Get appHomeScreenshot
   * @return appHomeScreenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getAppHomeScreenshot() {
    return appHomeScreenshot;
  }


  public void setAppHomeScreenshot(File appHomeScreenshot) {
    this.appHomeScreenshot = appHomeScreenshot;
  }


  public AlipayOpenAgentMobilepaySignRequest appItemScreenshot(File appItemScreenshot) {
    
    this.appItemScreenshot = appItemScreenshot;
    return this;
  }

   /**
   * Get appItemScreenshot
   * @return appItemScreenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getAppItemScreenshot() {
    return appItemScreenshot;
  }


  public void setAppItemScreenshot(File appItemScreenshot) {
    this.appItemScreenshot = appItemScreenshot;
  }


  public AlipayOpenAgentMobilepaySignRequest appPayScreenshot(File appPayScreenshot) {
    
    this.appPayScreenshot = appPayScreenshot;
    return this;
  }

   /**
   * Get appPayScreenshot
   * @return appPayScreenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getAppPayScreenshot() {
    return appPayScreenshot;
  }


  public void setAppPayScreenshot(File appPayScreenshot) {
    this.appPayScreenshot = appPayScreenshot;
  }


  public AlipayOpenAgentMobilepaySignRequest businessLicenseAuthPic(File businessLicenseAuthPic) {
    
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


  public AlipayOpenAgentMobilepaySignRequest businessLicensePic(File businessLicensePic) {
    
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


  public AlipayOpenAgentMobilepaySignRequest data(AlipayOpenAgentMobilepaySignModel data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlipayOpenAgentMobilepaySignModel getData() {
    return data;
  }


  public void setData(AlipayOpenAgentMobilepaySignModel data) {
    this.data = data;
  }


  public AlipayOpenAgentMobilepaySignRequest homeScreenshot(File homeScreenshot) {
    
    this.homeScreenshot = homeScreenshot;
    return this;
  }

   /**
   * Get homeScreenshot
   * @return homeScreenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getHomeScreenshot() {
    return homeScreenshot;
  }


  public void setHomeScreenshot(File homeScreenshot) {
    this.homeScreenshot = homeScreenshot;
  }


  public AlipayOpenAgentMobilepaySignRequest inAppScreenshot(File inAppScreenshot) {
    
    this.inAppScreenshot = inAppScreenshot;
    return this;
  }

   /**
   * Get inAppScreenshot
   * @return inAppScreenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getInAppScreenshot() {
    return inAppScreenshot;
  }


  public void setInAppScreenshot(File inAppScreenshot) {
    this.inAppScreenshot = inAppScreenshot;
  }


  public AlipayOpenAgentMobilepaySignRequest payScreenshot(File payScreenshot) {
    
    this.payScreenshot = payScreenshot;
    return this;
  }

   /**
   * Get payScreenshot
   * @return payScreenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getPayScreenshot() {
    return payScreenshot;
  }


  public void setPayScreenshot(File payScreenshot) {
    this.payScreenshot = payScreenshot;
  }


  public AlipayOpenAgentMobilepaySignRequest specialLicensePic(File specialLicensePic) {
    
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
   * @return the AlipayOpenAgentMobilepaySignRequest instance itself
   */
  public AlipayOpenAgentMobilepaySignRequest putAdditionalProperty(String key, Object value) {
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
    AlipayOpenAgentMobilepaySignRequest alipayOpenAgentMobilepaySignRequest = (AlipayOpenAgentMobilepaySignRequest) o;
    return Objects.equals(this.appAuthPic, alipayOpenAgentMobilepaySignRequest.appAuthPic) &&
        Objects.equals(this.appDemo, alipayOpenAgentMobilepaySignRequest.appDemo) &&
        Objects.equals(this.appHomeScreenshot, alipayOpenAgentMobilepaySignRequest.appHomeScreenshot) &&
        Objects.equals(this.appItemScreenshot, alipayOpenAgentMobilepaySignRequest.appItemScreenshot) &&
        Objects.equals(this.appPayScreenshot, alipayOpenAgentMobilepaySignRequest.appPayScreenshot) &&
        Objects.equals(this.businessLicenseAuthPic, alipayOpenAgentMobilepaySignRequest.businessLicenseAuthPic) &&
        Objects.equals(this.businessLicensePic, alipayOpenAgentMobilepaySignRequest.businessLicensePic) &&
        Objects.equals(this.data, alipayOpenAgentMobilepaySignRequest.data) &&
        Objects.equals(this.homeScreenshot, alipayOpenAgentMobilepaySignRequest.homeScreenshot) &&
        Objects.equals(this.inAppScreenshot, alipayOpenAgentMobilepaySignRequest.inAppScreenshot) &&
        Objects.equals(this.payScreenshot, alipayOpenAgentMobilepaySignRequest.payScreenshot) &&
        Objects.equals(this.specialLicensePic, alipayOpenAgentMobilepaySignRequest.specialLicensePic)&&
        Objects.equals(this.additionalProperties, alipayOpenAgentMobilepaySignRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, homeScreenshot, inAppScreenshot, payScreenshot, specialLicensePic, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentMobilepaySignRequest {\n");
    sb.append("    appAuthPic: ").append(toIndentedString(appAuthPic)).append("\n");
    sb.append("    appDemo: ").append(toIndentedString(appDemo)).append("\n");
    sb.append("    appHomeScreenshot: ").append(toIndentedString(appHomeScreenshot)).append("\n");
    sb.append("    appItemScreenshot: ").append(toIndentedString(appItemScreenshot)).append("\n");
    sb.append("    appPayScreenshot: ").append(toIndentedString(appPayScreenshot)).append("\n");
    sb.append("    businessLicenseAuthPic: ").append(toIndentedString(businessLicenseAuthPic)).append("\n");
    sb.append("    businessLicensePic: ").append(toIndentedString(businessLicensePic)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    homeScreenshot: ").append(toIndentedString(homeScreenshot)).append("\n");
    sb.append("    inAppScreenshot: ").append(toIndentedString(inAppScreenshot)).append("\n");
    sb.append("    payScreenshot: ").append(toIndentedString(payScreenshot)).append("\n");
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
    openapiFields.add("app_auth_pic");
    openapiFields.add("app_demo");
    openapiFields.add("app_home_screenshot");
    openapiFields.add("app_item_screenshot");
    openapiFields.add("app_pay_screenshot");
    openapiFields.add("business_license_auth_pic");
    openapiFields.add("business_license_pic");
    openapiFields.add("data");
    openapiFields.add("home_screenshot");
    openapiFields.add("in_app_screenshot");
    openapiFields.add("pay_screenshot");
    openapiFields.add("special_license_pic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentMobilepaySignRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentMobilepaySignRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentMobilepaySignRequest is not found in the empty JSON string", AlipayOpenAgentMobilepaySignRequest.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        AlipayOpenAgentMobilepaySignModel.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentMobilepaySignRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentMobilepaySignRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentMobilepaySignRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentMobilepaySignRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentMobilepaySignRequest>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentMobilepaySignRequest value) throws IOException {
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
           public AlipayOpenAgentMobilepaySignRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAgentMobilepaySignRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenAgentMobilepaySignRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentMobilepaySignRequest
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentMobilepaySignRequest
  */
  public static AlipayOpenAgentMobilepaySignRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentMobilepaySignRequest.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentMobilepaySignRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

