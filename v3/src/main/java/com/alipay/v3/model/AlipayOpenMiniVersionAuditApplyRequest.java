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
import com.alipay.v3.model.AlipayOpenMiniVersionAuditApplyModel;
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
 * AlipayOpenMiniVersionAuditApplyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniVersionAuditApplyRequest {
  public static final String SERIALIZED_NAME_APP_LOGO = "app_logo";
  @SerializedName(SERIALIZED_NAME_APP_LOGO)
  private File appLogo;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AlipayOpenMiniVersionAuditApplyModel data;

  public static final String SERIALIZED_NAME_FIFTH_LICENSE_PIC = "fifth_license_pic";
  @SerializedName(SERIALIZED_NAME_FIFTH_LICENSE_PIC)
  private File fifthLicensePic;

  public static final String SERIALIZED_NAME_FIFTH_SCREEN_SHOT = "fifth_screen_shot";
  @SerializedName(SERIALIZED_NAME_FIFTH_SCREEN_SHOT)
  private File fifthScreenShot;

  public static final String SERIALIZED_NAME_FIRST_LICENSE_PIC = "first_license_pic";
  @SerializedName(SERIALIZED_NAME_FIRST_LICENSE_PIC)
  private File firstLicensePic;

  public static final String SERIALIZED_NAME_FIRST_SCREEN_SHOT = "first_screen_shot";
  @SerializedName(SERIALIZED_NAME_FIRST_SCREEN_SHOT)
  private File firstScreenShot;

  public static final String SERIALIZED_NAME_FIRST_SPECIAL_LICENSE_PIC = "first_special_license_pic";
  @SerializedName(SERIALIZED_NAME_FIRST_SPECIAL_LICENSE_PIC)
  private File firstSpecialLicensePic;

  public static final String SERIALIZED_NAME_FOURTH_LICENSE_PIC = "fourth_license_pic";
  @SerializedName(SERIALIZED_NAME_FOURTH_LICENSE_PIC)
  private File fourthLicensePic;

  public static final String SERIALIZED_NAME_FOURTH_SCREEN_SHOT = "fourth_screen_shot";
  @SerializedName(SERIALIZED_NAME_FOURTH_SCREEN_SHOT)
  private File fourthScreenShot;

  public static final String SERIALIZED_NAME_OUT_DOOR_PIC = "out_door_pic";
  @SerializedName(SERIALIZED_NAME_OUT_DOOR_PIC)
  private File outDoorPic;

  public static final String SERIALIZED_NAME_SECOND_LICENSE_PIC = "second_license_pic";
  @SerializedName(SERIALIZED_NAME_SECOND_LICENSE_PIC)
  private File secondLicensePic;

  public static final String SERIALIZED_NAME_SECOND_SCREEN_SHOT = "second_screen_shot";
  @SerializedName(SERIALIZED_NAME_SECOND_SCREEN_SHOT)
  private File secondScreenShot;

  public static final String SERIALIZED_NAME_SECOND_SPECIAL_LICENSE_PIC = "second_special_license_pic";
  @SerializedName(SERIALIZED_NAME_SECOND_SPECIAL_LICENSE_PIC)
  private File secondSpecialLicensePic;

  public static final String SERIALIZED_NAME_TEST_FILE_NAME = "test_file_name";
  @SerializedName(SERIALIZED_NAME_TEST_FILE_NAME)
  private File testFileName;

  public static final String SERIALIZED_NAME_THIRD_LICENSE_PIC = "third_license_pic";
  @SerializedName(SERIALIZED_NAME_THIRD_LICENSE_PIC)
  private File thirdLicensePic;

  public static final String SERIALIZED_NAME_THIRD_SCREEN_SHOT = "third_screen_shot";
  @SerializedName(SERIALIZED_NAME_THIRD_SCREEN_SHOT)
  private File thirdScreenShot;

  public static final String SERIALIZED_NAME_THIRD_SPECIAL_LICENSE_PIC = "third_special_license_pic";
  @SerializedName(SERIALIZED_NAME_THIRD_SPECIAL_LICENSE_PIC)
  private File thirdSpecialLicensePic;

  public AlipayOpenMiniVersionAuditApplyRequest() { 
  }

  public AlipayOpenMiniVersionAuditApplyRequest appLogo(File appLogo) {
    
    this.appLogo = appLogo;
    return this;
  }

   /**
   * Get appLogo
   * @return appLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getAppLogo() {
    return appLogo;
  }


  public void setAppLogo(File appLogo) {
    this.appLogo = appLogo;
  }


  public AlipayOpenMiniVersionAuditApplyRequest data(AlipayOpenMiniVersionAuditApplyModel data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlipayOpenMiniVersionAuditApplyModel getData() {
    return data;
  }


  public void setData(AlipayOpenMiniVersionAuditApplyModel data) {
    this.data = data;
  }


  public AlipayOpenMiniVersionAuditApplyRequest fifthLicensePic(File fifthLicensePic) {
    
    this.fifthLicensePic = fifthLicensePic;
    return this;
  }

   /**
   * Get fifthLicensePic
   * @return fifthLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getFifthLicensePic() {
    return fifthLicensePic;
  }


  public void setFifthLicensePic(File fifthLicensePic) {
    this.fifthLicensePic = fifthLicensePic;
  }


  public AlipayOpenMiniVersionAuditApplyRequest fifthScreenShot(File fifthScreenShot) {
    
    this.fifthScreenShot = fifthScreenShot;
    return this;
  }

   /**
   * Get fifthScreenShot
   * @return fifthScreenShot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getFifthScreenShot() {
    return fifthScreenShot;
  }


  public void setFifthScreenShot(File fifthScreenShot) {
    this.fifthScreenShot = fifthScreenShot;
  }


  public AlipayOpenMiniVersionAuditApplyRequest firstLicensePic(File firstLicensePic) {
    
    this.firstLicensePic = firstLicensePic;
    return this;
  }

   /**
   * Get firstLicensePic
   * @return firstLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getFirstLicensePic() {
    return firstLicensePic;
  }


  public void setFirstLicensePic(File firstLicensePic) {
    this.firstLicensePic = firstLicensePic;
  }


  public AlipayOpenMiniVersionAuditApplyRequest firstScreenShot(File firstScreenShot) {
    
    this.firstScreenShot = firstScreenShot;
    return this;
  }

   /**
   * Get firstScreenShot
   * @return firstScreenShot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getFirstScreenShot() {
    return firstScreenShot;
  }


  public void setFirstScreenShot(File firstScreenShot) {
    this.firstScreenShot = firstScreenShot;
  }


  public AlipayOpenMiniVersionAuditApplyRequest firstSpecialLicensePic(File firstSpecialLicensePic) {
    
    this.firstSpecialLicensePic = firstSpecialLicensePic;
    return this;
  }

   /**
   * Get firstSpecialLicensePic
   * @return firstSpecialLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getFirstSpecialLicensePic() {
    return firstSpecialLicensePic;
  }


  public void setFirstSpecialLicensePic(File firstSpecialLicensePic) {
    this.firstSpecialLicensePic = firstSpecialLicensePic;
  }


  public AlipayOpenMiniVersionAuditApplyRequest fourthLicensePic(File fourthLicensePic) {
    
    this.fourthLicensePic = fourthLicensePic;
    return this;
  }

   /**
   * Get fourthLicensePic
   * @return fourthLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getFourthLicensePic() {
    return fourthLicensePic;
  }


  public void setFourthLicensePic(File fourthLicensePic) {
    this.fourthLicensePic = fourthLicensePic;
  }


  public AlipayOpenMiniVersionAuditApplyRequest fourthScreenShot(File fourthScreenShot) {
    
    this.fourthScreenShot = fourthScreenShot;
    return this;
  }

   /**
   * Get fourthScreenShot
   * @return fourthScreenShot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getFourthScreenShot() {
    return fourthScreenShot;
  }


  public void setFourthScreenShot(File fourthScreenShot) {
    this.fourthScreenShot = fourthScreenShot;
  }


  public AlipayOpenMiniVersionAuditApplyRequest outDoorPic(File outDoorPic) {
    
    this.outDoorPic = outDoorPic;
    return this;
  }

   /**
   * Get outDoorPic
   * @return outDoorPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getOutDoorPic() {
    return outDoorPic;
  }


  public void setOutDoorPic(File outDoorPic) {
    this.outDoorPic = outDoorPic;
  }


  public AlipayOpenMiniVersionAuditApplyRequest secondLicensePic(File secondLicensePic) {
    
    this.secondLicensePic = secondLicensePic;
    return this;
  }

   /**
   * Get secondLicensePic
   * @return secondLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getSecondLicensePic() {
    return secondLicensePic;
  }


  public void setSecondLicensePic(File secondLicensePic) {
    this.secondLicensePic = secondLicensePic;
  }


  public AlipayOpenMiniVersionAuditApplyRequest secondScreenShot(File secondScreenShot) {
    
    this.secondScreenShot = secondScreenShot;
    return this;
  }

   /**
   * Get secondScreenShot
   * @return secondScreenShot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getSecondScreenShot() {
    return secondScreenShot;
  }


  public void setSecondScreenShot(File secondScreenShot) {
    this.secondScreenShot = secondScreenShot;
  }


  public AlipayOpenMiniVersionAuditApplyRequest secondSpecialLicensePic(File secondSpecialLicensePic) {
    
    this.secondSpecialLicensePic = secondSpecialLicensePic;
    return this;
  }

   /**
   * Get secondSpecialLicensePic
   * @return secondSpecialLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getSecondSpecialLicensePic() {
    return secondSpecialLicensePic;
  }


  public void setSecondSpecialLicensePic(File secondSpecialLicensePic) {
    this.secondSpecialLicensePic = secondSpecialLicensePic;
  }


  public AlipayOpenMiniVersionAuditApplyRequest testFileName(File testFileName) {
    
    this.testFileName = testFileName;
    return this;
  }

   /**
   * Get testFileName
   * @return testFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getTestFileName() {
    return testFileName;
  }


  public void setTestFileName(File testFileName) {
    this.testFileName = testFileName;
  }


  public AlipayOpenMiniVersionAuditApplyRequest thirdLicensePic(File thirdLicensePic) {
    
    this.thirdLicensePic = thirdLicensePic;
    return this;
  }

   /**
   * Get thirdLicensePic
   * @return thirdLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getThirdLicensePic() {
    return thirdLicensePic;
  }


  public void setThirdLicensePic(File thirdLicensePic) {
    this.thirdLicensePic = thirdLicensePic;
  }


  public AlipayOpenMiniVersionAuditApplyRequest thirdScreenShot(File thirdScreenShot) {
    
    this.thirdScreenShot = thirdScreenShot;
    return this;
  }

   /**
   * Get thirdScreenShot
   * @return thirdScreenShot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getThirdScreenShot() {
    return thirdScreenShot;
  }


  public void setThirdScreenShot(File thirdScreenShot) {
    this.thirdScreenShot = thirdScreenShot;
  }


  public AlipayOpenMiniVersionAuditApplyRequest thirdSpecialLicensePic(File thirdSpecialLicensePic) {
    
    this.thirdSpecialLicensePic = thirdSpecialLicensePic;
    return this;
  }

   /**
   * Get thirdSpecialLicensePic
   * @return thirdSpecialLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getThirdSpecialLicensePic() {
    return thirdSpecialLicensePic;
  }


  public void setThirdSpecialLicensePic(File thirdSpecialLicensePic) {
    this.thirdSpecialLicensePic = thirdSpecialLicensePic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniVersionAuditApplyRequest alipayOpenMiniVersionAuditApplyRequest = (AlipayOpenMiniVersionAuditApplyRequest) o;
    return Objects.equals(this.appLogo, alipayOpenMiniVersionAuditApplyRequest.appLogo) &&
        Objects.equals(this.data, alipayOpenMiniVersionAuditApplyRequest.data) &&
        Objects.equals(this.fifthLicensePic, alipayOpenMiniVersionAuditApplyRequest.fifthLicensePic) &&
        Objects.equals(this.fifthScreenShot, alipayOpenMiniVersionAuditApplyRequest.fifthScreenShot) &&
        Objects.equals(this.firstLicensePic, alipayOpenMiniVersionAuditApplyRequest.firstLicensePic) &&
        Objects.equals(this.firstScreenShot, alipayOpenMiniVersionAuditApplyRequest.firstScreenShot) &&
        Objects.equals(this.firstSpecialLicensePic, alipayOpenMiniVersionAuditApplyRequest.firstSpecialLicensePic) &&
        Objects.equals(this.fourthLicensePic, alipayOpenMiniVersionAuditApplyRequest.fourthLicensePic) &&
        Objects.equals(this.fourthScreenShot, alipayOpenMiniVersionAuditApplyRequest.fourthScreenShot) &&
        Objects.equals(this.outDoorPic, alipayOpenMiniVersionAuditApplyRequest.outDoorPic) &&
        Objects.equals(this.secondLicensePic, alipayOpenMiniVersionAuditApplyRequest.secondLicensePic) &&
        Objects.equals(this.secondScreenShot, alipayOpenMiniVersionAuditApplyRequest.secondScreenShot) &&
        Objects.equals(this.secondSpecialLicensePic, alipayOpenMiniVersionAuditApplyRequest.secondSpecialLicensePic) &&
        Objects.equals(this.testFileName, alipayOpenMiniVersionAuditApplyRequest.testFileName) &&
        Objects.equals(this.thirdLicensePic, alipayOpenMiniVersionAuditApplyRequest.thirdLicensePic) &&
        Objects.equals(this.thirdScreenShot, alipayOpenMiniVersionAuditApplyRequest.thirdScreenShot) &&
        Objects.equals(this.thirdSpecialLicensePic, alipayOpenMiniVersionAuditApplyRequest.thirdSpecialLicensePic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLogo, data, fifthLicensePic, fifthScreenShot, firstLicensePic, firstScreenShot, firstSpecialLicensePic, fourthLicensePic, fourthScreenShot, outDoorPic, secondLicensePic, secondScreenShot, secondSpecialLicensePic, testFileName, thirdLicensePic, thirdScreenShot, thirdSpecialLicensePic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniVersionAuditApplyRequest {\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    fifthLicensePic: ").append(toIndentedString(fifthLicensePic)).append("\n");
    sb.append("    fifthScreenShot: ").append(toIndentedString(fifthScreenShot)).append("\n");
    sb.append("    firstLicensePic: ").append(toIndentedString(firstLicensePic)).append("\n");
    sb.append("    firstScreenShot: ").append(toIndentedString(firstScreenShot)).append("\n");
    sb.append("    firstSpecialLicensePic: ").append(toIndentedString(firstSpecialLicensePic)).append("\n");
    sb.append("    fourthLicensePic: ").append(toIndentedString(fourthLicensePic)).append("\n");
    sb.append("    fourthScreenShot: ").append(toIndentedString(fourthScreenShot)).append("\n");
    sb.append("    outDoorPic: ").append(toIndentedString(outDoorPic)).append("\n");
    sb.append("    secondLicensePic: ").append(toIndentedString(secondLicensePic)).append("\n");
    sb.append("    secondScreenShot: ").append(toIndentedString(secondScreenShot)).append("\n");
    sb.append("    secondSpecialLicensePic: ").append(toIndentedString(secondSpecialLicensePic)).append("\n");
    sb.append("    testFileName: ").append(toIndentedString(testFileName)).append("\n");
    sb.append("    thirdLicensePic: ").append(toIndentedString(thirdLicensePic)).append("\n");
    sb.append("    thirdScreenShot: ").append(toIndentedString(thirdScreenShot)).append("\n");
    sb.append("    thirdSpecialLicensePic: ").append(toIndentedString(thirdSpecialLicensePic)).append("\n");
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
    openapiFields.add("app_logo");
    openapiFields.add("data");
    openapiFields.add("fifth_license_pic");
    openapiFields.add("fifth_screen_shot");
    openapiFields.add("first_license_pic");
    openapiFields.add("first_screen_shot");
    openapiFields.add("first_special_license_pic");
    openapiFields.add("fourth_license_pic");
    openapiFields.add("fourth_screen_shot");
    openapiFields.add("out_door_pic");
    openapiFields.add("second_license_pic");
    openapiFields.add("second_screen_shot");
    openapiFields.add("second_special_license_pic");
    openapiFields.add("test_file_name");
    openapiFields.add("third_license_pic");
    openapiFields.add("third_screen_shot");
    openapiFields.add("third_special_license_pic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniVersionAuditApplyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniVersionAuditApplyRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniVersionAuditApplyRequest is not found in the empty JSON string", AlipayOpenMiniVersionAuditApplyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniVersionAuditApplyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniVersionAuditApplyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        AlipayOpenMiniVersionAuditApplyModel.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniVersionAuditApplyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniVersionAuditApplyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniVersionAuditApplyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniVersionAuditApplyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniVersionAuditApplyRequest>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniVersionAuditApplyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniVersionAuditApplyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniVersionAuditApplyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniVersionAuditApplyRequest
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniVersionAuditApplyRequest
  */
  public static AlipayOpenMiniVersionAuditApplyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniVersionAuditApplyRequest.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniVersionAuditApplyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

