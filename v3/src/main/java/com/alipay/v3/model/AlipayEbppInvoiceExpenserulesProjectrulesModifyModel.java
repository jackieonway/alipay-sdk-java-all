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
import com.alipay.v3.model.ExpenseCtrRuleGroupInfo;
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
 * AlipayEbppInvoiceExpenserulesProjectrulesModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpenserulesProjectrulesModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_GROUP_LIST = "expense_ctrl_rule_info_group_list";
  @SerializedName(SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_GROUP_LIST)
  private List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public AlipayEbppInvoiceExpenserulesProjectrulesModifyModel() { 
  }

  public AlipayEbppInvoiceExpenserulesProjectrulesModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceExpenserulesProjectrulesModifyModel action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * 修改操作 枚举值：MODIFY_RULE（修改费控条件），仅支持MODIFY_RULE
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MODIFY_RULE", value = "修改操作 枚举值：MODIFY_RULE（修改费控条件），仅支持MODIFY_RULE")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public AlipayEbppInvoiceExpenserulesProjectrulesModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001112341234", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceExpenserulesProjectrulesModifyModel expenseCtrlRuleInfoGroupList(List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList) {
    
    this.expenseCtrlRuleInfoGroupList = expenseCtrlRuleInfoGroupList;
    return this;
  }

  public AlipayEbppInvoiceExpenserulesProjectrulesModifyModel addExpenseCtrlRuleInfoGroupListItem(ExpenseCtrRuleGroupInfo expenseCtrlRuleInfoGroupListItem) {
    if (this.expenseCtrlRuleInfoGroupList == null) {
      this.expenseCtrlRuleInfoGroupList = new ArrayList<>();
    }
    this.expenseCtrlRuleInfoGroupList.add(expenseCtrlRuleInfoGroupListItem);
    return this;
  }

   /**
   * 费控规则列表
   * @return expenseCtrlRuleInfoGroupList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费控规则列表")

  public List<ExpenseCtrRuleGroupInfo> getExpenseCtrlRuleInfoGroupList() {
    return expenseCtrlRuleInfoGroupList;
  }


  public void setExpenseCtrlRuleInfoGroupList(List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList) {
    this.expenseCtrlRuleInfoGroupList = expenseCtrlRuleInfoGroupList;
  }


  public AlipayEbppInvoiceExpenserulesProjectrulesModifyModel projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021041300152700950000001050", value = "项目ID")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
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
   * @return the AlipayEbppInvoiceExpenserulesProjectrulesModifyModel instance itself
   */
  public AlipayEbppInvoiceExpenserulesProjectrulesModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceExpenserulesProjectrulesModifyModel alipayEbppInvoiceExpenserulesProjectrulesModifyModel = (AlipayEbppInvoiceExpenserulesProjectrulesModifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceExpenserulesProjectrulesModifyModel.accountId) &&
        Objects.equals(this.action, alipayEbppInvoiceExpenserulesProjectrulesModifyModel.action) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceExpenserulesProjectrulesModifyModel.agreementNo) &&
        Objects.equals(this.expenseCtrlRuleInfoGroupList, alipayEbppInvoiceExpenserulesProjectrulesModifyModel.expenseCtrlRuleInfoGroupList) &&
        Objects.equals(this.projectId, alipayEbppInvoiceExpenserulesProjectrulesModifyModel.projectId)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceExpenserulesProjectrulesModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, action, agreementNo, expenseCtrlRuleInfoGroupList, projectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpenserulesProjectrulesModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    expenseCtrlRuleInfoGroupList: ").append(toIndentedString(expenseCtrlRuleInfoGroupList)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("action");
    openapiFields.add("agreement_no");
    openapiFields.add("expense_ctrl_rule_info_group_list");
    openapiFields.add("project_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpenserulesProjectrulesModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpenserulesProjectrulesModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpenserulesProjectrulesModifyModel is not found in the empty JSON string", AlipayEbppInvoiceExpenserulesProjectrulesModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      JsonArray jsonArrayexpenseCtrlRuleInfoGroupList = jsonObj.getAsJsonArray("expense_ctrl_rule_info_group_list");
      if (jsonArrayexpenseCtrlRuleInfoGroupList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("expense_ctrl_rule_info_group_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `expense_ctrl_rule_info_group_list` to be an array in the JSON string but got `%s`", jsonObj.get("expense_ctrl_rule_info_group_list").toString()));
        }

        // validate the optional field `expense_ctrl_rule_info_group_list` (array)
        for (int i = 0; i < jsonArrayexpenseCtrlRuleInfoGroupList.size(); i++) {
          ExpenseCtrRuleGroupInfo.validateJsonObject(jsonArrayexpenseCtrlRuleInfoGroupList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpenserulesProjectrulesModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpenserulesProjectrulesModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpenserulesProjectrulesModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpenserulesProjectrulesModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpenserulesProjectrulesModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpenserulesProjectrulesModifyModel value) throws IOException {
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
           public AlipayEbppInvoiceExpenserulesProjectrulesModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceExpenserulesProjectrulesModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceExpenserulesProjectrulesModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpenserulesProjectrulesModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpenserulesProjectrulesModifyModel
  */
  public static AlipayEbppInvoiceExpenserulesProjectrulesModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpenserulesProjectrulesModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpenserulesProjectrulesModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

