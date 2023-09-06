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
import com.alipay.v3.model.ExpenseCtrRuleInfo;
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
 * StandardRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StandardRuleInfo {
  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_LIST = "expense_ctrl_rule_info_list";
  @SerializedName(SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_LIST)
  private List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList = null;

  public static final String SERIALIZED_NAME_PAYMENT_POLICY = "payment_policy";
  @SerializedName(SERIALIZED_NAME_PAYMENT_POLICY)
  private String paymentPolicy;

  public static final String SERIALIZED_NAME_STANDARD_DESC = "standard_desc";
  @SerializedName(SERIALIZED_NAME_STANDARD_DESC)
  private String standardDesc;

  public static final String SERIALIZED_NAME_STANDARD_ID = "standard_id";
  @SerializedName(SERIALIZED_NAME_STANDARD_ID)
  private String standardId;

  public static final String SERIALIZED_NAME_STANDARD_NAME = "standard_name";
  @SerializedName(SERIALIZED_NAME_STANDARD_NAME)
  private String standardName;

  public StandardRuleInfo() { 
  }

  public StandardRuleInfo effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 有效期截止
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-27 00:00:00", value = "有效期截止")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public StandardRuleInfo effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 有效期起始
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-26 00:00:00", value = "有效期起始")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public StandardRuleInfo expenseCtrlRuleInfoList(List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList) {
    
    this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
    return this;
  }

  public StandardRuleInfo addExpenseCtrlRuleInfoListItem(ExpenseCtrRuleInfo expenseCtrlRuleInfoListItem) {
    if (this.expenseCtrlRuleInfoList == null) {
      this.expenseCtrlRuleInfoList = new ArrayList<>();
    }
    this.expenseCtrlRuleInfoList.add(expenseCtrlRuleInfoListItem);
    return this;
  }

   /**
   * 费控条件列表
   * @return expenseCtrlRuleInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费控条件列表")

  public List<ExpenseCtrRuleInfo> getExpenseCtrlRuleInfoList() {
    return expenseCtrlRuleInfoList;
  }


  public void setExpenseCtrlRuleInfoList(List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList) {
    this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
  }


  public StandardRuleInfo paymentPolicy(String paymentPolicy) {
    
    this.paymentPolicy = paymentPolicy;
    return this;
  }

   /**
   * 当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略， 枚举值：PERSONAL（全部个人账户支付）
   * @return paymentPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERSONAL", value = "当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略， 枚举值：PERSONAL（全部个人账户支付）")

  public String getPaymentPolicy() {
    return paymentPolicy;
  }


  public void setPaymentPolicy(String paymentPolicy) {
    this.paymentPolicy = paymentPolicy;
  }


  public StandardRuleInfo standardDesc(String standardDesc) {
    
    this.standardDesc = standardDesc;
    return this;
  }

   /**
   * 费控规则说明
   * @return standardDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "费控规则说明测试", value = "费控规则说明")

  public String getStandardDesc() {
    return standardDesc;
  }


  public void setStandardDesc(String standardDesc) {
    this.standardDesc = standardDesc;
  }


  public StandardRuleInfo standardId(String standardId) {
    
    this.standardId = standardId;
    return this;
  }

   /**
   * 费控规则ID
   * @return standardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021062800152601350000001466", value = "费控规则ID")

  public String getStandardId() {
    return standardId;
  }


  public void setStandardId(String standardId) {
    this.standardId = standardId;
  }


  public StandardRuleInfo standardName(String standardName) {
    
    this.standardName = standardName;
    return this;
  }

   /**
   * 费控规则名称
   * @return standardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "费控规则名称", value = "费控规则名称")

  public String getStandardName() {
    return standardName;
  }


  public void setStandardName(String standardName) {
    this.standardName = standardName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardRuleInfo standardRuleInfo = (StandardRuleInfo) o;
    return Objects.equals(this.effectiveEndDate, standardRuleInfo.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, standardRuleInfo.effectiveStartDate) &&
        Objects.equals(this.expenseCtrlRuleInfoList, standardRuleInfo.expenseCtrlRuleInfoList) &&
        Objects.equals(this.paymentPolicy, standardRuleInfo.paymentPolicy) &&
        Objects.equals(this.standardDesc, standardRuleInfo.standardDesc) &&
        Objects.equals(this.standardId, standardRuleInfo.standardId) &&
        Objects.equals(this.standardName, standardRuleInfo.standardName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveEndDate, effectiveStartDate, expenseCtrlRuleInfoList, paymentPolicy, standardDesc, standardId, standardName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardRuleInfo {\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    expenseCtrlRuleInfoList: ").append(toIndentedString(expenseCtrlRuleInfoList)).append("\n");
    sb.append("    paymentPolicy: ").append(toIndentedString(paymentPolicy)).append("\n");
    sb.append("    standardDesc: ").append(toIndentedString(standardDesc)).append("\n");
    sb.append("    standardId: ").append(toIndentedString(standardId)).append("\n");
    sb.append("    standardName: ").append(toIndentedString(standardName)).append("\n");
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
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("expense_ctrl_rule_info_list");
    openapiFields.add("payment_policy");
    openapiFields.add("standard_desc");
    openapiFields.add("standard_id");
    openapiFields.add("standard_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StandardRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StandardRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StandardRuleInfo is not found in the empty JSON string", StandardRuleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StandardRuleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StandardRuleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      JsonArray jsonArrayexpenseCtrlRuleInfoList = jsonObj.getAsJsonArray("expense_ctrl_rule_info_list");
      if (jsonArrayexpenseCtrlRuleInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("expense_ctrl_rule_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `expense_ctrl_rule_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("expense_ctrl_rule_info_list").toString()));
        }

        // validate the optional field `expense_ctrl_rule_info_list` (array)
        for (int i = 0; i < jsonArrayexpenseCtrlRuleInfoList.size(); i++) {
          ExpenseCtrRuleInfo.validateJsonObject(jsonArrayexpenseCtrlRuleInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("payment_policy") != null && !jsonObj.get("payment_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_policy").toString()));
      }
      if (jsonObj.get("standard_desc") != null && !jsonObj.get("standard_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_desc").toString()));
      }
      if (jsonObj.get("standard_id") != null && !jsonObj.get("standard_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_id").toString()));
      }
      if (jsonObj.get("standard_name") != null && !jsonObj.get("standard_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StandardRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StandardRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StandardRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StandardRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StandardRuleInfo>() {
           @Override
           public void write(JsonWriter out, StandardRuleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StandardRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StandardRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StandardRuleInfo
  * @throws IOException if the JSON string is invalid with respect to StandardRuleInfo
  */
  public static StandardRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StandardRuleInfo.class);
  }

 /**
  * Convert an instance of StandardRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

