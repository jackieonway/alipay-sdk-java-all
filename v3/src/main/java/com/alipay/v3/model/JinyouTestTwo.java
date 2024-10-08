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
import com.alipay.v3.model.JinyouTestOne;
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
 * JinyouTestTwo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JinyouTestTwo {
  public static final String SERIALIZED_NAME_T1_OPENID = "t_1_openid";
  @SerializedName(SERIALIZED_NAME_T1_OPENID)
  private String t1Openid;

  public static final String SERIALIZED_NAME_T1_Y = "t_1_y";
  @SerializedName(SERIALIZED_NAME_T1_Y)
  private String t1Y;

  public static final String SERIALIZED_NAME_T2_F = "t_2_f";
  @SerializedName(SERIALIZED_NAME_T2_F)
  private JinyouTestOne t2F;

  public static final String SERIALIZED_NAME_T3_N = "t_3_n";
  @SerializedName(SERIALIZED_NAME_T3_N)
  private String t3N;

  public JinyouTestTwo() { 
  }

  public JinyouTestTwo t1Openid(String t1Openid) {
    
    this.t1Openid = t1Openid;
    return this;
  }

   /**
   * 1
   * @return t1Openid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1")

  public String getT1Openid() {
    return t1Openid;
  }


  public void setT1Openid(String t1Openid) {
    this.t1Openid = t1Openid;
  }


  public JinyouTestTwo t1Y(String t1Y) {
    
    this.t1Y = t1Y;
    return this;
  }

   /**
   * 1
   * @return t1Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1")

  public String getT1Y() {
    return t1Y;
  }


  public void setT1Y(String t1Y) {
    this.t1Y = t1Y;
  }


  public JinyouTestTwo t2F(JinyouTestOne t2F) {
    
    this.t2F = t2F;
    return this;
  }

   /**
   * Get t2F
   * @return t2F
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JinyouTestOne getT2F() {
    return t2F;
  }


  public void setT2F(JinyouTestOne t2F) {
    this.t2F = t2F;
  }


  public JinyouTestTwo t3N(String t3N) {
    
    this.t3N = t3N;
    return this;
  }

   /**
   * 1
   * @return t3N
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1")

  public String getT3N() {
    return t3N;
  }


  public void setT3N(String t3N) {
    this.t3N = t3N;
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
   * @return the JinyouTestTwo instance itself
   */
  public JinyouTestTwo putAdditionalProperty(String key, Object value) {
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
    JinyouTestTwo jinyouTestTwo = (JinyouTestTwo) o;
    return Objects.equals(this.t1Openid, jinyouTestTwo.t1Openid) &&
        Objects.equals(this.t1Y, jinyouTestTwo.t1Y) &&
        Objects.equals(this.t2F, jinyouTestTwo.t2F) &&
        Objects.equals(this.t3N, jinyouTestTwo.t3N)&&
        Objects.equals(this.additionalProperties, jinyouTestTwo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(t1Openid, t1Y, t2F, t3N, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JinyouTestTwo {\n");
    sb.append("    t1Openid: ").append(toIndentedString(t1Openid)).append("\n");
    sb.append("    t1Y: ").append(toIndentedString(t1Y)).append("\n");
    sb.append("    t2F: ").append(toIndentedString(t2F)).append("\n");
    sb.append("    t3N: ").append(toIndentedString(t3N)).append("\n");
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
    openapiFields.add("t_1_openid");
    openapiFields.add("t_1_y");
    openapiFields.add("t_2_f");
    openapiFields.add("t_3_n");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JinyouTestTwo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JinyouTestTwo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JinyouTestTwo is not found in the empty JSON string", JinyouTestTwo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("t_1_openid") != null && !jsonObj.get("t_1_openid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `t_1_openid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("t_1_openid").toString()));
      }
      if (jsonObj.get("t_1_y") != null && !jsonObj.get("t_1_y").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `t_1_y` to be a primitive type in the JSON string but got `%s`", jsonObj.get("t_1_y").toString()));
      }
      // validate the optional field `t_2_f`
      if (jsonObj.getAsJsonObject("t_2_f") != null) {
        JinyouTestOne.validateJsonObject(jsonObj.getAsJsonObject("t_2_f"));
      }
      if (jsonObj.get("t_3_n") != null && !jsonObj.get("t_3_n").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `t_3_n` to be a primitive type in the JSON string but got `%s`", jsonObj.get("t_3_n").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JinyouTestTwo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JinyouTestTwo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JinyouTestTwo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JinyouTestTwo.class));

       return (TypeAdapter<T>) new TypeAdapter<JinyouTestTwo>() {
           @Override
           public void write(JsonWriter out, JinyouTestTwo value) throws IOException {
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
           public JinyouTestTwo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JinyouTestTwo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JinyouTestTwo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JinyouTestTwo
  * @throws IOException if the JSON string is invalid with respect to JinyouTestTwo
  */
  public static JinyouTestTwo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JinyouTestTwo.class);
  }

 /**
  * Convert an instance of JinyouTestTwo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

