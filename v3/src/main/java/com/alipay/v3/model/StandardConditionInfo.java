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
 * StandardConditionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StandardConditionInfo {
  public static final String SERIALIZED_NAME_RULE_FACTOR = "rule_factor";
  @SerializedName(SERIALIZED_NAME_RULE_FACTOR)
  private String ruleFactor;

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_RULE_NAME = "rule_name";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_RULE_OPERATOR = "rule_operator";
  @SerializedName(SERIALIZED_NAME_RULE_OPERATOR)
  private String ruleOperator;

  public static final String SERIALIZED_NAME_RULE_VALUE = "rule_value";
  @SerializedName(SERIALIZED_NAME_RULE_VALUE)
  private String ruleValue;

  public StandardConditionInfo() { 
  }

  public StandardConditionInfo ruleFactor(String ruleFactor) {
    
    this.ruleFactor = ruleFactor;
    return this;
  }

   /**
   * 条件类型
   * @return ruleFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "条件类型")

  public String getRuleFactor() {
    return ruleFactor;
  }


  public void setRuleFactor(String ruleFactor) {
    this.ruleFactor = ruleFactor;
  }


  public StandardConditionInfo ruleId(String ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * 费控条件ID
   * @return ruleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费控条件ID")

  public String getRuleId() {
    return ruleId;
  }


  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public StandardConditionInfo ruleName(String ruleName) {
    
    this.ruleName = ruleName;
    return this;
  }

   /**
   * 费控条件名称
   * @return ruleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费控条件名称")

  public String getRuleName() {
    return ruleName;
  }


  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public StandardConditionInfo ruleOperator(String ruleOperator) {
    
    this.ruleOperator = ruleOperator;
    return this;
  }

   /**
   * 费控条件操作符 枚举值： LT(\&quot;&lt;\&quot;,\&quot;小于\&quot;) LE(\&quot;&lt;&#x3D;\&quot;,\&quot;小于等于\&quot;) EQ(\&quot;&#x3D;\&quot;,\&quot;等于\&quot;) NE(\&quot;!&#x3D;\&quot;,\&quot;不等于\&quot;) GE(\&quot;&gt;&#x3D;\&quot;,\&quot;大于等于\&quot;) GT(\&quot;&gt;\&quot;,\&quot;大于\&quot;)
   * @return ruleOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费控条件操作符 枚举值： LT(\"<\",\"小于\") LE(\"<=\",\"小于等于\") EQ(\"=\",\"等于\") NE(\"!=\",\"不等于\") GE(\">=\",\"大于等于\") GT(\">\",\"大于\")")

  public String getRuleOperator() {
    return ruleOperator;
  }


  public void setRuleOperator(String ruleOperator) {
    this.ruleOperator = ruleOperator;
  }


  public StandardConditionInfo ruleValue(String ruleValue) {
    
    this.ruleValue = ruleValue;
    return this;
  }

   /**
   * 费控条件值
   * @return ruleValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费控条件值")

  public String getRuleValue() {
    return ruleValue;
  }


  public void setRuleValue(String ruleValue) {
    this.ruleValue = ruleValue;
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
   * @return the StandardConditionInfo instance itself
   */
  public StandardConditionInfo putAdditionalProperty(String key, Object value) {
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
    StandardConditionInfo standardConditionInfo = (StandardConditionInfo) o;
    return Objects.equals(this.ruleFactor, standardConditionInfo.ruleFactor) &&
        Objects.equals(this.ruleId, standardConditionInfo.ruleId) &&
        Objects.equals(this.ruleName, standardConditionInfo.ruleName) &&
        Objects.equals(this.ruleOperator, standardConditionInfo.ruleOperator) &&
        Objects.equals(this.ruleValue, standardConditionInfo.ruleValue)&&
        Objects.equals(this.additionalProperties, standardConditionInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleFactor, ruleId, ruleName, ruleOperator, ruleValue, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardConditionInfo {\n");
    sb.append("    ruleFactor: ").append(toIndentedString(ruleFactor)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleOperator: ").append(toIndentedString(ruleOperator)).append("\n");
    sb.append("    ruleValue: ").append(toIndentedString(ruleValue)).append("\n");
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
    openapiFields.add("rule_factor");
    openapiFields.add("rule_id");
    openapiFields.add("rule_name");
    openapiFields.add("rule_operator");
    openapiFields.add("rule_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StandardConditionInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StandardConditionInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StandardConditionInfo is not found in the empty JSON string", StandardConditionInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("rule_factor") != null && !jsonObj.get("rule_factor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_factor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_factor").toString()));
      }
      if (jsonObj.get("rule_id") != null && !jsonObj.get("rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_id").toString()));
      }
      if (jsonObj.get("rule_name") != null && !jsonObj.get("rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_name").toString()));
      }
      if (jsonObj.get("rule_operator") != null && !jsonObj.get("rule_operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_operator").toString()));
      }
      if (jsonObj.get("rule_value") != null && !jsonObj.get("rule_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StandardConditionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StandardConditionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StandardConditionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StandardConditionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StandardConditionInfo>() {
           @Override
           public void write(JsonWriter out, StandardConditionInfo value) throws IOException {
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
           public StandardConditionInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StandardConditionInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StandardConditionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StandardConditionInfo
  * @throws IOException if the JSON string is invalid with respect to StandardConditionInfo
  */
  public static StandardConditionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StandardConditionInfo.class);
  }

 /**
  * Convert an instance of StandardConditionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

